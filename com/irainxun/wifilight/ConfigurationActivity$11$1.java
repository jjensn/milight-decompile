package com.irainxun.wifilight;

import com.irainxun.wifilight.apsetting.android.Repeater;
import com.irainxun.wifilight.apsetting.model.ATCommand;

class ConfigurationActivity$11$1 extends Repeater
{
  ConfigurationActivity$11$1(ConfigurationActivity.11 param11, long paramLong)
  {
    super(paramLong);
  }

  public void repeateAction()
  {
    ConfigurationActivity.access$11(ConfigurationActivity.11.access$0(this.this$1)).send("AT+VER\r\n");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.11.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */