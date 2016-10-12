package com.irainxun.wifilight.xlink;

import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.listener.SendPipeListener;
import java.util.ArrayList;

class MyApp$2 extends SendPipeListener
{
  MyApp$2()
  {
  }

  public void onSendLocalPipeData(XDevice paramXDevice, int paramInt1, int paramInt2)
  {
    for (int i = 0; ; i++)
    {
      if (i >= MyApp.access$3().size())
      {
        switch (paramInt1)
        {
        case -100:
        case 0:
        case 5:
        case 10:
        }
        return;
      }
      ((MyApp.OnDeviceMessage)MyApp.access$3().get(i)).Aiyuxun_onSendData(paramXDevice, paramInt1);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */