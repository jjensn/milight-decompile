package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.event.c;

class XlinkTcpService$6 extends a
{
  XlinkTcpService$6(XlinkTcpService paramXlinkTcpService)
  {
  }

  public void onResponse(e parame)
  {
    XlinkTcpService.d = false;
    switch (parame.b)
    {
    default:
      XlinkTcpService.a(this.a, "login fail code ::" + parame.b);
      c.a(5, parame.b);
      return;
    case 0:
      XlinkTcpService.a(this.a, "login - - connect tcp succeed");
      XlinkTcpService.a(this.a, true);
      c.a(4, 0);
      this.a.d();
      return;
    case -100:
    }
    XlinkTcpService.a(this.a, "login fail service not response packet timeout ! ");
    XlinkTcpService.e(this.a);
    c.a(5, -100);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkTcpService.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */