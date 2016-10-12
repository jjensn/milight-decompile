package com.irainxun.wifilight.apsetting.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import java.io.Serializable;

class BaseActivity$1 extends Handler
{
  BaseActivity$1(BaseActivity paramBaseActivity)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    int i = 1;
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      Toast.makeText(this.this$0.getApplicationContext(), paramMessage.obj.toString(), 0).show();
      return;
    case 1:
      Context localContext = this.this$0.getApplicationContext();
      int j = paramMessage.arg1;
      if (paramMessage.arg2 == i);
      while (true)
      {
        Toast.makeText(localContext, j, i).show();
        return;
        i = 0;
      }
    case 2:
      new AlertDialog.Builder(this.this$0).setTitle("R.string.default_dialog_title").setMessage(paramMessage.arg1).setPositiveButton("R.string.ok", null).create().show();
      return;
    case 3:
      new AlertDialog.Builder(this.this$0).setTitle("R.string.default_dialog_title").setMessage(paramMessage.obj.toString()).setPositiveButton("R.string.ok", null).create().show();
      return;
    case 4:
    }
    Bundle localBundle = paramMessage.getData();
    Serializable localSerializable = localBundle.getSerializable("listener");
    BaseActivity.SimpleDialogListener localSimpleDialogListener = null;
    if (localSerializable != null)
      localSimpleDialogListener = (BaseActivity.SimpleDialogListener)localBundle.getSerializable("listener");
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.this$0).setTitle(localBundle.getString("title")).setMessage(localBundle.getString("message")).setPositiveButton("R.string.ok", localSimpleDialogListener);
    if (localBundle.getBoolean("withCancelButton"))
      localBuilder.setNegativeButton("R.string.no", null);
    localBuilder.create().show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.BaseActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */