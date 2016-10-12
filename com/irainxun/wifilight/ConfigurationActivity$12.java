package com.irainxun.wifilight;

import android.net.wifi.ScanResult;
import android.os.AsyncTask;
import android.util.Log;
import com.irainxun.wifilight.apsetting.model.ATCommand;
import com.irainxun.wifilight.apsetting.utils.Utils;

class ConfigurationActivity$12 extends AsyncTask<Void, Void, Integer>
{
  private static final int RESULT_CMD_MODE_FAILED = -1;
  private static final int RESULT_RESPONSE_ERROR = -2;
  private static final int RESULT_RESPONSE_TIME_OUT = -3;
  private static final int RESULT_SUCCESS;

  ConfigurationActivity$12(ConfigurationActivity paramConfigurationActivity, ScanResult paramScanResult, String paramString)
  {
  }

  protected Integer doInBackground(Void[] paramArrayOfVoid)
  {
    int i = -2;
    StringBuffer localStringBuffer1 = new StringBuffer();
    if (!ConfigurationActivity.access$29(this.this$0, "AT+\r", localStringBuffer1))
      synchronized (ConfigurationActivity.access$23(this.this$0))
      {
        Log.d("debuga", "Try to enter into cmd mode again");
        ConfigurationActivity.access$23(this.this$0).setLength(0);
        ConfigurationActivity.access$11(this.this$0).enterCMDMode();
        try
        {
          ConfigurationActivity.access$23(this.this$0).wait(15000L);
          if (ConfigurationActivity.access$23(this.this$0).toString().trim().equals(""))
          {
            Log.d("debugaa", "Enter into cmd mode failed");
            return Integer.valueOf(-1);
          }
        }
        catch (InterruptedException localInterruptedException2)
        {
          while (true)
            localInterruptedException2.printStackTrace();
        }
      }
    localStringBuffer1.setLength(0);
    if (!ConfigurationActivity.access$29(this.this$0, "AT+WMODE=STA\r\n", localStringBuffer1))
    {
      Log.d("debugaa", "Failed: send AT+WMODE=STA");
      if (localStringBuffer1.toString().equals("+ERR"));
      while (true)
      {
        return Integer.valueOf(i);
        i = -3;
      }
    }
    localStringBuffer1.setLength(0);
    if (!ConfigurationActivity.access$29(this.this$0, Utils.generateWsssid(this.val$scanResult.SSID), localStringBuffer1))
    {
      Log.d("debugaa", "Failed: send AT+WSSSID=%s");
      if (localStringBuffer1.toString().equals("+ERR"));
      while (true)
      {
        return Integer.valueOf(i);
        i = -3;
      }
    }
    localStringBuffer1.setLength(0);
    if (!ConfigurationActivity.access$29(this.this$0, Utils.generateWskeyCmd(this.val$scanResult, this.val$password), localStringBuffer1))
    {
      Log.d("debugaa", "Failed: send AT+WSKEY=%s");
      if (localStringBuffer1.toString().equals("+ERR"));
      while (true)
      {
        return Integer.valueOf(i);
        i = -3;
      }
    }
    ConfigurationActivity.access$29(this.this$0, "AT+Z\r", null);
    try
    {
      Thread.sleep(300L);
      return Integer.valueOf(0);
    }
    catch (InterruptedException localInterruptedException1)
    {
      while (true)
        localInterruptedException1.printStackTrace();
    }
  }

  protected void onPostExecute(Integer paramInteger)
  {
    if (paramInteger != null);
    switch (paramInteger.intValue())
    {
    default:
      return;
    case -1:
      Log.d("debug", "ap mode simpleDialog(R.string.enter_cmd_mode_failed)");
      ConfigurationActivity.access$13(this.this$0, false);
      ConfigurationActivity.access$14(this.this$0, 0);
      return;
    case -2:
      Log.d("debug", "ap mode simpleDialog(R.string.response_failed)");
      ConfigurationActivity.access$13(this.this$0, false);
      ConfigurationActivity.access$14(this.this$0, 0);
      return;
    case -3:
      ConfigurationActivity.access$13(this.this$0, false);
      ConfigurationActivity.access$14(this.this$0, 0);
      Log.d("debug", "ap mode simpleDialog(R.string.response_time_out)");
      return;
    case 0:
    }
    ConfigurationActivity.access$13(this.this$0, true);
    ConfigurationActivity.access$14(this.this$0, 0);
    Log.d("debug", "ap mode setting right!!!!!!");
  }

  protected void onPreExecute()
  {
    this.this$0.showDialog(1);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.12
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */