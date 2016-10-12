package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener;
import io.xlink.wifi.sdk.tcp.c;

class XlinkAgent$1 extends io.xlink.wifi.sdk.event.a
{
  XlinkAgent$1(XlinkAgent paramXlinkAgent, String paramString1, String paramString2, SetDeviceAccessKeyListener paramSetDeviceAccessKeyListener)
  {
  }

  public void onResponse(e parame)
  {
    switch (parame.b)
    {
    default:
    case 0:
    case -100:
    }
    do
    {
      do
      {
        do
          return;
        while (XlinkAgent.a(this.d, parame.a, this.a, this.b, this.c) >= 0);
        parame.b = -100;
        this.c.onResponse(parame);
        return;
        if (XlinkTcpService.c())
          break;
      }
      while (XlinkAgent.a(this.d, parame.a, this.a, this.b, this.c) >= 0);
      parame.b = -100;
      this.c.onResponse(parame);
      return;
      if (parame.a.isValidId())
        break label196;
      if (!this.d.isConnectedLocal())
        break;
    }
    while (XlinkAgent.a(this.d, parame.a, this.a, this.b, this.c) >= 0);
    parame.b = -100;
    this.c.onResponse(parame);
    return;
    parame.b = 3;
    this.c.onResponse(parame);
    return;
    label196: c.a().a(parame.a, this.a, this.b, this.c, io.xlink.wifi.sdk.global.a.l);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkAgent.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */