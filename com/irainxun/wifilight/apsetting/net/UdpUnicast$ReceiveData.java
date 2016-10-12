package com.irainxun.wifilight.apsetting.net;

import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketTimeoutException;

class UdpUnicast$ReceiveData
  implements Runnable
{
  private boolean stop;
  private Thread thread = new Thread(this);

  private UdpUnicast$ReceiveData(UdpUnicast paramUdpUnicast)
  {
  }

  boolean isStoped()
  {
    return this.stop;
  }

  public void run()
  {
    while (true)
    {
      if (this.stop)
        return;
      try
      {
        DatagramPacket localDatagramPacket = new DatagramPacket(UdpUnicast.access$0(this.this$0), 2048);
        UdpUnicast.access$1(this.this$0).receive(localDatagramPacket);
        this.this$0.onReceive(UdpUnicast.access$0(this.this$0), localDatagramPacket.getLength());
        Log.d("SmartLink | UdpUnicast", "receievd");
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        Log.w("SmartLink | UdpUnicast", "Receive packet timeout!");
      }
      catch (IOException localIOException)
      {
        Log.w("SmartLink | UdpUnicast", "Socket is closed!");
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
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.UdpUnicast.ReceiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */