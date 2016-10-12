package io.xlink.wifi.sdk.udp;

import android.util.Log;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.XlinkUdpService;
import io.xlink.wifi.sdk.decoder.c;
import io.xlink.wifi.sdk.util.MyLog;
import io.xlink.wifi.sdk.util.b;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class a
{
  String a = "PacketReader";
  DatagramPacket b;
  private Thread c;
  private XlinkUdpService d;
  private boolean e;
  private DatagramSocket f;

  public a(XlinkUdpService paramXlinkUdpService, DatagramSocket paramDatagramSocket)
  {
    this.d = paramXlinkUdpService;
    this.f = paramDatagramSocket;
    a();
  }

  private void a(Exception paramException)
  {
    this.e = true;
    if (XlinkAgent.getInstance().a)
      return;
    this.d.a(true, -1);
    MyLog.e("PacketReader", paramException.getMessage());
  }

  private void a(Thread paramThread)
  {
    try
    {
      Log.e("PacketReader", "done" + this.e);
      while ((!this.e) && (paramThread == this.c) && (this.f != null))
      {
        this.b = d();
        this.f.receive(this.b);
        byte[] arrayOfByte = b.a(this.b.getData(), 0, this.b.getLength());
        this.b.getSocketAddress();
        io.xlink.wifi.sdk.buffer.a locala = new io.xlink.wifi.sdk.buffer.a(arrayOfByte, 0);
        c.a().a(this.b.getAddress(), locala, this.b.getPort(), this.f.getRemoteSocketAddress());
      }
    }
    catch (IOException localIOException)
    {
      MyLog.e("PacketReader", "udp read error:" + localIOException.getMessage());
      if (!this.e)
        a(localIOException);
      return;
    }
    a("read thread stop ");
  }

  protected void a()
  {
    this.e = false;
    this.c = new Thread()
    {
      public void run()
      {
        a.a(a.this, this);
      }
    };
    this.c.setName("UDP Packet Reader");
    this.c.setDaemon(true);
  }

  public void a(String paramString)
  {
    MyLog.e(this.a, paramString);
  }

  public void b()
  {
    this.c.start();
    a("reader Thread to start。");
  }

  public void c()
  {
    this.e = true;
  }

  public DatagramPacket d()
  {
    return new DatagramPacket(new byte[1024], 1024);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.udp.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */