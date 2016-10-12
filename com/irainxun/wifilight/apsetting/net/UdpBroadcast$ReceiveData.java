package com.irainxun.wifilight.apsetting.net;

import android.util.Log;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

class UdpBroadcast$ReceiveData
  implements Runnable
{
  private List<DatagramPacket> packets = new ArrayList();
  private boolean stop;
  private Thread thread = new Thread(this);

  private UdpBroadcast$ReceiveData(UdpBroadcast paramUdpBroadcast)
  {
  }

  boolean isStoped()
  {
    return this.stop;
  }

  public void run()
  {
    this.stop = false;
    if (this.stop);
    while (true)
      while (true)
      {
        if (!this.stop)
          this.this$0.onReceived(this.packets);
        this.stop = true;
        return;
        try
        {
          DatagramPacket localDatagramPacket = new DatagramPacket(new byte[100], 100);
          UdpBroadcast.access$0(this.this$0).receive(localDatagramPacket);
          this.packets.add(localDatagramPacket);
        }
        catch (SocketTimeoutException localSocketTimeoutException)
        {
          Log.w("UdpBroadcast", "Receive packet timeout!");
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
  }

  void start()
  {
    this.thread.start();
  }

  void stop()
  {
    this.stop = true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.UdpBroadcast.ReceiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */