package com.irainxun.wifilight.apsetting.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

class UdpBroadcast$1 extends Thread
{
  UdpBroadcast$1(UdpBroadcast paramUdpBroadcast)
  {
  }

  public void run()
  {
    localDatagramPacket = new DatagramPacket(new byte[100], 100);
    long l = System.currentTimeMillis();
    while (true)
      if (System.currentTimeMillis() - l >= 300L)
        try
        {
          while (true)
            while (true)
            {
              UdpBroadcast.access$0(this.this$0).setSoTimeout(10500);
              UdpBroadcast.access$0(this.this$0).send(UdpBroadcast.access$1(this.this$0));
              UdpBroadcast.access$2(this.this$0, new UdpBroadcast.ReceiveData(this.this$0, null));
              UdpBroadcast.access$3(this.this$0).start();
              return;
              try
              {
                UdpBroadcast.access$0(this.this$0).receive(localDatagramPacket);
              }
              catch (Exception localException)
              {
              }
            }
        }
        catch (IOException localIOException)
        {
          while (true)
            localIOException.printStackTrace();
        }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.UdpBroadcast.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */