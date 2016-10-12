package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.event.c;
import io.xlink.wifi.sdk.listener.ConnectDeviceListener;
import io.xlink.wifi.sdk.util.MyLog;

class a$1 extends ConnectDeviceListener
{
  a$1(a parama)
  {
  }

  public void onConnectDevice(XDevice paramXDevice, int paramInt)
  {
    MyLog.e("Reconnect", "auth reconnectDevice:" + paramXDevice + " code:" + paramInt);
    if ((paramInt == 0) || (paramInt == 1))
    {
      c.a(-3, paramXDevice);
      return;
    }
    paramXDevice.c(0);
    c.a(-2, paramXDevice);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.a.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */