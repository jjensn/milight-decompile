package com.irainxun.wifilight.apsetting.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;
import java.io.Serializable;

public class BaseActivity extends Activity
{
  String TAG = "SmartLink | ";
  private Handler mNotifierHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      int i = 1;
      switch (paramAnonymousMessage.what)
      {
      default:
        return;
      case 0:
        Toast.makeText(BaseActivity.this.getApplicationContext(), paramAnonymousMessage.obj.toString(), 0).show();
        return;
      case 1:
        Context localContext = BaseActivity.this.getApplicationContext();
        int j = paramAnonymousMessage.arg1;
        if (paramAnonymousMessage.arg2 == i);
        while (true)
        {
          Toast.makeText(localContext, j, i).show();
          return;
          i = 0;
        }
      case 2:
        new AlertDialog.Builder(BaseActivity.this).setTitle("R.string.default_dialog_title").setMessage(paramAnonymousMessage.arg1).setPositiveButton("R.string.ok", null).create().show();
        return;
      case 3:
        new AlertDialog.Builder(BaseActivity.this).setTitle("R.string.default_dialog_title").setMessage(paramAnonymousMessage.obj.toString()).setPositiveButton("R.string.ok", null).create().show();
        return;
      case 4:
      }
      Bundle localBundle = paramAnonymousMessage.getData();
      Serializable localSerializable = localBundle.getSerializable("listener");
      BaseActivity.SimpleDialogListener localSimpleDialogListener = null;
      if (localSerializable != null)
        localSimpleDialogListener = (BaseActivity.SimpleDialogListener)localBundle.getSerializable("listener");
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(BaseActivity.this).setTitle(localBundle.getString("title")).setMessage(localBundle.getString("message")).setPositiveButton("R.string.ok", localSimpleDialogListener);
      if (localBundle.getBoolean("withCancelButton"))
        localBuilder.setNegativeButton("R.string.no", null);
      localBuilder.create().show();
    }
  };

  public BaseActivity()
  {
  }

  void logD(String paramString)
  {
    String str = this.TAG;
    if (paramString == null)
      paramString = "null";
    Log.d(str, paramString);
  }

  void logE(String paramString)
  {
    String str = this.TAG;
    if (paramString == null)
      paramString = "null";
    Log.e(str, paramString);
  }

  void logW(String paramString)
  {
    String str = this.TAG;
    if (paramString == null)
      paramString = "null";
    Log.w(str, paramString);
  }

  void simpleDialog(int paramInt)
  {
    Message localMessage = this.mNotifierHandler.obtainMessage(2);
    localMessage.arg1 = paramInt;
    this.mNotifierHandler.sendMessage(localMessage);
  }

  void simpleDialog(String paramString)
  {
    if (paramString == null)
      paramString = "null";
    Message localMessage = this.mNotifierHandler.obtainMessage(3);
    localMessage.obj = paramString;
    this.mNotifierHandler.sendMessage(localMessage);
  }

  void simpleDialog(String paramString1, String paramString2, boolean paramBoolean, SimpleDialogListener paramSimpleDialogListener)
  {
    Message localMessage = this.mNotifierHandler.obtainMessage(4);
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("listener", paramSimpleDialogListener);
    localBundle.putString("title", paramString1);
    localBundle.putString("message", paramString2);
    localBundle.putBoolean("withCancelButton", paramBoolean);
    localMessage.setData(localBundle);
    this.mNotifierHandler.sendMessage(localMessage);
  }

  void toast(int paramInt)
  {
    toast(paramInt, false);
  }

  void toast(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    Message localMessage = this.mNotifierHandler.obtainMessage(i);
    localMessage.arg1 = paramInt;
    if (paramBoolean);
    while (true)
    {
      localMessage.arg2 = i;
      this.mNotifierHandler.sendMessage(localMessage);
      return;
      i = 0;
    }
  }

  void toast(String paramString)
  {
    if (paramString == null)
      paramString = "null";
    Message localMessage = this.mNotifierHandler.obtainMessage(0);
    localMessage.obj = paramString;
    this.mNotifierHandler.sendMessage(localMessage);
  }

  class SimpleDialogListener
    implements DialogInterface.OnClickListener, Serializable
  {
    private static final long serialVersionUID = 1L;

    SimpleDialogListener()
    {
    }

    public void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.BaseActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */