package io.xlink.wifi.sdk;

import io.xlink.wifi.sdk.event.c;
import io.xlink.wifi.sdk.global.a;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

class XlinkUdpService$3
  implements Runnable
{
  XlinkUdpService$3(XlinkUdpService paramXlinkUdpService)
  {
  }

  public void run()
  {
    try
    {
      this.a.a("bind udp ...");
      XlinkUdpService.a(this.a, new DatagramSocket(null));
      XlinkUdpService.a(this.a).setBroadcast(true);
      XlinkUdpService.a(this.a).bind(new InetSocketAddress(0));
      this.a.f();
      a.g = XlinkUdpService.a(this.a).getLocalPort();
      this.a.a("bind udp prot:" + a.g);
      return;
    }
    catch (SocketException localSocketException)
    {
      localSocketException.printStackTrace();
      this.a.a("bind udp  fail ");
      c.a(2, -1);
      return;
    }
    finally
    {
      XlinkUdpService.b = false;
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkUdpService.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */