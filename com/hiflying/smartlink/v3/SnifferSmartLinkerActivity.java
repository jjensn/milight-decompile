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
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.hiflying.smartlink.OnSmartLinkListener;
import com.hiflying.smartlink.R1;
import com.hiflying.smartlink.SmartLinkedModule;

public class SnifferSmartLinkerActivity extends Activity
  implements OnSmartLinkListener
{
  private static final String TAG = "SnifferSmartLinkerActivity";
  private boolean mIsConncting = false;
  protected EditText mPasswordEditText;
  protected SnifferSmartLinker mSnifferSmartLinker;
  protected EditText mSsidEditText;
  protected Button mStartButton;
  protected Handler mViewHandler = new Handler();
  protected ProgressDialog mWaitingDialog;
  private BroadcastReceiver mWifiChangedReceiver;

  public SnifferSmartLinkerActivity()
  {
  }

  private String getSSid()
  {
    WifiManager localWifiManager = (WifiManager)getSystemService("wifi");
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

  public void onCompleted()
  {
    Log.w("SnifferSmartLinkerActivity", "onCompleted");
    this.mViewHandler.post(new Runnable()
    {
      public void run()
      {
        Toast.makeText(SnifferSmartLinkerActivity.this.getApplicationContext(), SnifferSmartLinkerActivity.this.getString(R1.string("hiflying_smartlinker_completed")), 0).show();
        SnifferSmartLinkerActivity.this.mWaitingDialog.dismiss();
        SnifferSmartLinkerActivity.this.mIsConncting = false;
      }
    });
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    R1.initContext(getApplicationContext());
    this.mSnifferSmartLinker = SnifferSmartLinker.getInstence();
    this.mWaitingDialog = new ProgressDialog(this);
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
        SnifferSmartLinkerActivity.this.mSnifferSmartLinker.setOnSmartLinkListener(null);
        SnifferSmartLinkerActivity.this.mSnifferSmartLinker.stop();
        SnifferSmartLinkerActivity.this.mIsConncting = false;
      }
    });
    setContentView(R1.layout("activity_hiflying_sniffer_smart_linker"));
    this.mSsidEditText = ((EditText)findViewById(R1.id("editText_hiflying_smartlinker_ssid")));
    this.mPasswordEditText = ((EditText)findViewById(R1.id("editText_hiflying_smartlinker_password")));
    this.mStartButton = ((Button)findViewById(R1.id("button_hiflying_smartlinker_start")));
    this.mSsidEditText.setText(getSSid());
    this.mStartButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (!SnifferSmartLinkerActivity.this.mIsConncting);
        try
        {
          SnifferSmartLinkerActivity.this.mSnifferSmartLinker.setOnSmartLinkListener(SnifferSmartLinkerActivity.this);
          SnifferSmartLinker localSnifferSmartLinker = SnifferSmartLinkerActivity.this.mSnifferSmartLinker;
          Context localContext = SnifferSmartLinkerActivity.this.getApplicationContext();
          String str = SnifferSmartLinkerActivity.this.mPasswordEditText.getText().toString().trim();
          String[] arrayOfString = new String[1];
          arrayOfString[0] = SnifferSmartLinkerActivity.this.mSsidEditText.getText().toString().trim();
          localSnifferSmartLinker.start(localContext, str, arrayOfString);
          SnifferSmartLinkerActivity.this.mIsConncting = true;
          SnifferSmartLinkerActivity.this.mWaitingDialog.show();
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
        NetworkInfo localNetworkInfo = ((ConnectivityManager)SnifferSmartLinkerActivity.this.getSystemService("connectivity")).getNetworkInfo(1);
        if ((localNetworkInfo != null) && (localNetworkInfo.isConnected()))
        {
          SnifferSmartLinkerActivity.this.mSsidEditText.setText(SnifferSmartLinkerActivity.this.getSSid());
          SnifferSmartLinkerActivity.this.mPasswordEditText.requestFocus();
          SnifferSmartLinkerActivity.this.mStartButton.setEnabled(true);
        }
        do
        {
          return;
          SnifferSmartLinkerActivity.this.mSsidEditText.setText(SnifferSmartLinkerActivity.this.getString(R1.string("hiflying_smartlinker_no_wifi_connectivity")));
          SnifferSmartLinkerActivity.this.mSsidEditText.requestFocus();
          SnifferSmartLinkerActivity.this.mStartButton.setEnabled(false);
        }
        while (!SnifferSmartLinkerActivity.this.mWaitingDialog.isShowing());
        SnifferSmartLinkerActivity.this.mWaitingDialog.dismiss();
      }
    };
    registerReceiver(this.mWifiChangedReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.mSnifferSmartLinker.setOnSmartLinkListener(null);
    try
    {
      unregisterReceiver(this.mWifiChangedReceiver);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void onLinked(final SmartLinkedModule paramSmartLinkedModule)
  {
    Log.w("SnifferSmartLinkerActivity", "onLinked");
    this.mViewHandler.post(new Runnable()
    {
      public void run()
      {
        Context localContext = SnifferSmartLinkerActivity.this.getApplicationContext();
        SnifferSmartLinkerActivity localSnifferSmartLinkerActivity = SnifferSmartLinkerActivity.this;
        int i = R1.string("hiflying_smartlinker_new_module_found");
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramSmartLinkedModule.getMac();
        arrayOfObject[1] = paramSmartLinkedModule.getModuleIP();
        Toast.makeText(localContext, localSnifferSmartLinkerActivity.getString(i, arrayOfObject), 0).show();
      }
    });
  }

  public void onTimeOut()
  {
    Log.w("SnifferSmartLinkerActivity", "onTimeOut");
    this.mViewHandler.post(new Runnable()
    {
      public void run()
      {
        Toast.makeText(SnifferSmartLinkerActivity.this.getApplicationContext(), SnifferSmartLinkerActivity.this.getString(R1.string("hiflying_smartlinker_timeout")), 0).show();
        SnifferSmartLinkerActivity.this.mWaitingDialog.dismiss();
        SnifferSmartLinkerActivity.this.mIsConncting = false;
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */