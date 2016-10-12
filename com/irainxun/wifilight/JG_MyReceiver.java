package com.irainxun.wifilight;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import cn.jpush.android.api.JPushInterface;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class JG_MyReceiver extends BroadcastReceiver
{
  private static final String TAG = "JPush";

  public JG_MyReceiver()
  {
  }

  private static String printBundle(Bundle paramBundle)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = paramBundle.keySet().iterator();
    while (true)
    {
      if (!localIterator1.hasNext())
        return localStringBuilder.toString();
      String str1 = (String)localIterator1.next();
      if (str1.equals(JPushInterface.EXTRA_NOTIFICATION_ID))
        localStringBuilder.append("\nkey:" + str1 + ", value:" + paramBundle.getInt(str1));
      else if (str1.equals(JPushInterface.EXTRA_CONNECTION_CHANGE))
        localStringBuilder.append("\nkey:" + str1 + ", value:" + paramBundle.getBoolean(str1));
      else if (str1.equals(JPushInterface.EXTRA_EXTRA))
      {
        if (paramBundle.getString(JPushInterface.EXTRA_EXTRA).isEmpty())
          Log.i("JPush", "This message has no Extra data");
        else
          try
          {
            JSONObject localJSONObject = new JSONObject(paramBundle.getString(JPushInterface.EXTRA_EXTRA));
            Iterator localIterator2 = localJSONObject.keys();
            while (localIterator2.hasNext())
            {
              String str2 = ((String)localIterator2.next()).toString();
              localStringBuilder.append("\nkey:" + str1 + ", value: [" + str2 + " - " + localJSONObject.optString(str2) + "]");
            }
          }
          catch (JSONException localJSONException)
          {
            Log.e("JPush", "Get message extra JSON error!");
          }
      }
      else
        localStringBuilder.append("\nkey:" + str1 + ", value:" + paramBundle.getString(str1));
    }
  }

  private void processCustomMessage(Context paramContext, Bundle paramBundle)
  {
    String str1 = paramBundle.getString(JPushInterface.EXTRA_MESSAGE);
    str2 = paramBundle.getString(JPushInterface.EXTRA_EXTRA);
    localIntent = new Intent("com.example.jpushdemo.MESSAGE_RECEIVED_ACTION");
    localIntent.putExtra("message", str1);
    if (!JG_ExampleUtil.isEmpty(str2))
      try
      {
        JSONObject localJSONObject = new JSONObject(str2);
        if ((localJSONObject != null) && (localJSONObject.length() > 0))
          localIntent.putExtra("extras", str2);
        paramContext.sendBroadcast(localIntent);
        return;
      }
      catch (JSONException localJSONException)
      {
        break label79;
      }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Bundle localBundle = paramIntent.getExtras();
    Log.d("JPush", "[MyReceiver] onReceive - " + paramIntent.getAction() + ", extras: " + printBundle(localBundle));
    if (JPushInterface.ACTION_REGISTRATION_ID.equals(paramIntent.getAction()))
    {
      String str = localBundle.getString(JPushInterface.EXTRA_REGISTRATION_ID);
      Log.d("JPush", "[MyReceiver] 接收Registration Id : " + str);
      return;
    }
    if (JPushInterface.ACTION_MESSAGE_RECEIVED.equals(paramIntent.getAction()))
    {
      Log.d("JPush", "[MyReceiver] 接收到推送下来的自定义消息: " + localBundle.getString(JPushInterface.EXTRA_MESSAGE));
      processCustomMessage(paramContext, localBundle);
      return;
    }
    if (JPushInterface.ACTION_NOTIFICATION_RECEIVED.equals(paramIntent.getAction()))
    {
      Log.d("JPush", "[MyReceiver] 接收到推送下来的通知");
      int i = localBundle.getInt(JPushInterface.EXTRA_NOTIFICATION_ID);
      Log.d("JPush", "[MyReceiver] 接收到推送下来的通知的ID: " + i);
      return;
    }
    if (JPushInterface.ACTION_NOTIFICATION_OPENED.equals(paramIntent.getAction()))
    {
      Log.d("JPush", "[MyReceiver] 用户点击打开了通知");
      Intent localIntent = new Intent(paramContext, JG_TestActivity.class);
      localIntent.putExtras(localBundle);
      localIntent.setFlags(335544320);
      paramContext.startActivity(localIntent);
      return;
    }
    if (JPushInterface.ACTION_RICHPUSH_CALLBACK.equals(paramIntent.getAction()))
    {
      Log.d("JPush", "[MyReceiver] 用户收到到RICH PUSH CALLBACK: " + localBundle.getString(JPushInterface.EXTRA_EXTRA));
      return;
    }
    if (JPushInterface.ACTION_CONNECTION_CHANGE.equals(paramIntent.getAction()))
    {
      boolean bool = paramIntent.getBooleanExtra(JPushInterface.EXTRA_CONNECTION_CHANGE, false);
      Log.w("JPush", "[MyReceiver]" + paramIntent.getAction() + " connected state change to " + bool);
      return;
    }
    Log.d("JPush", "[MyReceiver] Unhandled intent - " + paramIntent.getAction());
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_MyReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */