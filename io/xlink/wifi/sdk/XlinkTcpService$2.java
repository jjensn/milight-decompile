package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.encoder.g;
import io.xlink.wifi.sdk.tcp.c;
import java.util.TimerTask;

class XlinkTcpService$2 extends TimerTask
{
  XlinkTcpService$2(XlinkTcpService paramXlinkTcpService)
  {
  }

  public void run()
  {
    if (!XlinkTcpService.c())
    {
      XlinkTcpService.a(this.a);
      XlinkTcpService.a(this.a, "tcp !isConnected stopKeepAlive ");
      return;
    }
    long l = (System.currentTimeMillis() - this.a.f) / 1000L;
    if (this.a.e > 3)
    {
      XlinkTcpService.a(this.a, "tcp 3次心跳超时" + l + " cloud service 3 times not response ping app logout ");
      XlinkTcpService.a(this.a);
      this.a.a(true, -2, true);
      return;
    }
    (System.currentTimeMillis() - this.a.f);
    XlinkTcpService localXlinkTcpService = this.a;
    localXlinkTcpService.e = (1 + localXlinkTcpService.e);
    io.xlink.wifi.sdk.tcp.b.a = 0;
    g localg = c.a().b();
    this.a.a(localg);
    XlinkTcpService.a(this.a, "tcp send keep alive packet ");
    this.a.f = System.currentTimeMillis();
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkTcpService.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */