package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.encoder.e;
import io.xlink.wifi.sdk.event.a;
import io.xlink.wifi.sdk.event.c;

class XlinkTcpService$7 extends a
{
  XlinkTcpService$7(XlinkTcpService paramXlinkTcpService)
  {
  }

  public void onResponse(e parame)
  {
    if (parame.b == 0)
    {
      XlinkTcpService.a(this.a, "http prot head succeed  send login packet");
      XlinkTcpService.g(this.a);
      return;
    }
    XlinkTcpService.a(this.a, "http prot head timeout  connect tcp error");
    XlinkTcpService.b(this.a, false);
    c.a(5, -1);
    this.a.a(false, -1, true);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkTcpService.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */