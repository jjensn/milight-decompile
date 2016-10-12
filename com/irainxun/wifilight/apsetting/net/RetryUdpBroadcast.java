package com.irainxun.wifilight.apsetting.net;

import android.os.Handler;
import android.os.Message;
import java.net.DatagramPacket;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class RetryUdpBroadcast
{
  private Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      RetryUdpBroadcast.this.udpBroadcast.send(paramAnonymousMessage.obj.toString());
      synchronized (RetryUdpBroadcast.this.object)
      {
        try
        {
          RetryUdpBroadcast.this.object.wait();
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          while (true)
            localInterruptedException.printStackTrace();
        }
      }
    }
  };
  private Object object;
  private TimerTask task = new TimerTask()
  {
    public void run()
    {
    }
  };
  private Timer timer;
  private UdpBroadcast udpBroadcast = new UdpBroadcast()
  {
    public void onReceived(List<DatagramPacket> paramAnonymousList)
    {
      synchronized (RetryUdpBroadcast.this.object)
      {
        RetryUdpBroadcast.this.object.notify();
        return;
      }
    }
  };

  public RetryUdpBroadcast()
  {
  }

  public void onReceived(List<DatagramPacket> paramList)
  {
  }

  public void send(String paramString)
  {
    Message localMessage = this.handler.obtainMessage();
    localMessage.obj = paramString;
    this.handler.sendMessage(localMessage);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.RetryUdpBroadcast
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */