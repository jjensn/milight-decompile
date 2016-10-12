package com.hiflying.smartlink.v3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.hiflying.smartlink.OnSmartLinkListener;
import com.hiflying.smartlink.R1;
import com.hiflying.smartlink.SmartLinkedModule;

public class SnifferSmartLinkerFragment extends Fragment
  implements OnSmartLinkListener
{
  private static final String TAG = "SnifferSmartLinkerFragment";
  private Context mAppContext;
  private boolean mIsConncting = false;
  protected EditText mPasswordEditText;
  protected SnifferSmartLinker mSnifferSmartLinker;
  protected EditText mSsidEditText;
  protected Button mStartButton;
  protected Handler mViewHandler = new Handler();
  protected ProgressDialog mWaitingDialog;
  private BroadcastReceiver mWifiChangedReceiver;

  public SnifferSmartLinkerFragment()
  {
  }

  private String getSSid()
  {
    WifiManager localWifiManager = (WifiManager)this.mAppContext.getSystemService("wifi");
    if (localWifiManager != null)
    {
      WifiInfo localWifiInfo = localWifiManager.getConnectionInfo();
      if (localWifiInfo != null)
      {
        String str = localWifiInfo.getSSID();
        if ((str.length() > 2) && (str.startsWith("\"")) && (str.endsWith("\"")))
          str = str.substring(1, -1 + str.length());
        return str;
      }
    }
    return "";
  }

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.mAppContext = paramActivity.getApplicationContext();
    R1.initContext(this.mAppContext);
    this.mSnifferSmartLinker = SnifferSmartLinker.getInstence();
    this.mSnifferSmartLinker.setOnSmartLinkListener(this);
    this.mWaitingDialog = new ProgressDialog(paramActivity);
    this.mWaitingDialog.setMessage(getString(R1.string("hiflying_smartlinker_waiting")));
    this.mWaitingDialog.setButton(-2, getString(17039360), new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    this.mWaitingDialog.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        SnifferSmartLinkerFragment.this.mSnifferSmartLinker.setOnSmartLinkListener(null);
        SnifferSmartLinkerFragment.this.mSnifferSmartLinker.stop();
        SnifferSmartLinkerFragment.this.mIsConncting = false;
      }
    });
  }

  public void onCompleted()
  {
    Log.w("SnifferSmartLinkerFragment", "onCompleted");
    this.mViewHandler.post(new Runnable()
    {
      public void run()
      {
        Toast.makeText(SnifferSmartLinkerFragment.this.mAppContext, SnifferSmartLinkerFragment.this.getString(R1.string("hiflying_smartlinker_completed")), 0).show();
        SnifferSmartLinkerFragment.this.mWaitingDialog.dismiss();
        SnifferSmartLinkerFragment.this.mIsConncting = false;
      }
    });
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(R1.layout("activity_hiflying_sniffer_smart_linker"), paramViewGroup, false);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    try
    {
      this.mAppContext.unregisterReceiver(this.mWifiChangedReceiver);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void onDetach()
  {
    super.onDetach();
    this.mSnifferSmartLinker.setOnSmartLinkListener(null);
  }

  public void onLinked(final SmartLinkedModule paramSmartLinkedModule)
  {
    Log.w("SnifferSmartLinkerFragment", "onLinked");
    this.mViewHandler.post(new Runnable()
    {
      public void run()
      {
        Context localContext = SnifferSmartLinkerFragment.this.mAppContext;
        SnifferSmartLinkerFragment localSnifferSmartLinkerFragment = SnifferSmartLinkerFragment.this;
        int i = R1.string("hiflying_smartlinker_new_module_found");
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramSmartLinkedModule.getMac();
        arrayOfObject[1] = paramSmartLinkedModule.getModuleIP();
        Toast.makeText(localContext, localSnifferSmartLinkerFragment.getString(i, arrayOfObject), 0).show();
      }
    });
  }

  public void onTimeOut()
  {
    Log.w("SnifferSmartLinkerFragment", "onTimeOut");
    this.mViewHandler.post(new Runnable()
    {
      public void run()
      {
        Toast.makeText(SnifferSmartLinkerFragment.this.mAppContext, SnifferSmartLinkerFragment.this.getString(R1.string("hiflying_smartlinker_timeout")), 0).show();
        SnifferSmartLinkerFragment.this.mWaitingDialog.dismiss();
        SnifferSmartLinkerFragment.this.mIsConncting = false;
      }
    });
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    this.mSsidEditText = ((EditText)paramView.findViewById(R1.id("editText_hiflying_smartlinker_ssid")));
    this.mPasswordEditText = ((EditText)paramView.findViewById(R1.id("editText_hiflying_smartlinker_password")));
    this.mStartButton = ((Button)paramView.findViewById(R1.id("button_hiflying_smartlinker_start")));
    this.mSsidEditText.setText(getSSid());
    this.mStartButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (!SnifferSmartLinkerFragment.this.mIsConncting);
        try
        {
          SnifferSmartLinkerFragment.this.mSnifferSmartLinker.setOnSmartLinkListener(SnifferSmartLinkerFragment.this);
          SnifferSmartLinker localSnifferSmartLinker = SnifferSmartLinkerFragment.this.mSnifferSmartLinker;
          Context localContext = SnifferSmartLinkerFragment.this.mAppContext;
          String str = SnifferSmartLinkerFragment.this.mPasswordEditText.getText().toString().trim();
          String[] arrayOfString = new String[1];
          arrayOfString[0] = SnifferSmartLinkerFragment.this.mSsidEditText.getText().toString().trim();
          localSnifferSmartLinker.start(localContext, str, arrayOfString);
          SnifferSmartLinkerFragment.this.mIsConncting = true;
          SnifferSmartLinkerFragment.this.mWaitingDialog.show();
          return;
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
    });
    this.mWifiChangedReceiver = new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        NetworkInfo localNetworkInfo = ((ConnectivityManager)SnifferSmartLinkerFragment.this.mAppContext.getSystemService("connectivity")).getNetworkInfo(1);
        if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
        {
          SnifferSmartLinkerFragment.this.mSsidEditText.setText(SnifferSmartLinkerFragment.this.getSSid());
          SnifferSmartLinkerFragment.this.mPasswordEditText.requestFocus();
          SnifferSmartLinkerFragment.this.mStartButton.setEnabled(true);
        }
        do
        {
          return;
          SnifferSmartLinkerFragment.this.mSsidEditText.setText(SnifferSmartLinkerFragment.this.getString(R1.string("hiflying_smartlinker_no_wifi_connectivity")));
          SnifferSmartLinkerFragment.this.mSsidEditText.requestFocus();
          SnifferSmartLinkerFragment.this.mStartButton.setEnabled(false);
        }
        while (!SnifferSmartLinkerFragment.this.mWaitingDialog.isShowing());
        SnifferSmartLinkerFragment.this.mWaitingDialog.dismiss();
      }
    };
    this.mAppContext.registerReceiver(this.mWifiChangedReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */