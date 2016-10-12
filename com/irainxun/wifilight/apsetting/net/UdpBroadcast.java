package com.irainxun.wifilight.apsetting.net;

import android.util.Log;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public abstract class UdpBroadcast
{
  private static final int BUFFER_SIZE = 100;
  private static final String TAG = "UdpBroadcast";
  private InetAddress inetAddress;
  private DatagramPacket packetToSend;
  private int port = 48899;
  private ReceiveData receiveData;
  private DatagramSocket socket;

  public UdpBroadcast()
  {
    try
    {
      this.inetAddress = InetAddress.getByName("255.255.255.255");
      Utils.forceStrictMode();
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      while (true)
        localUnknownHostException.printStackTrace();
    }
  }

  public void close()
  {
    stopReceive();
    if (this.socket != null)
      this.socket.close();
  }

  public abstract void onReceived(List<DatagramPacket> paramList);

  public void open()
  {
    try
    {
      this.socket = new DatagramSocket(this.port);
      this.socket.setBroadcast(true);
      return;
    }
    catch (SocketException localSocketException)
    {
      localSocketException.printStackTrace();
    }
  }

  public void send(String paramString)
  {
    if ((this.socket == null) || (paramString == null))
      return;
    String str = paramString.trim();
    this.packetToSend = new DatagramPacket(str.getBytes(), str.getBytes().length, this.inetAddress, this.port);
    try
    {
      this.socket.setSoTimeout(200);
      stopReceive();
      new Thread()
      {
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
                    UdpBroadcast.this.socket.setSoTimeout(10500);
                    UdpBroadcast.this.socket.send(UdpBroadcast.this.packetToSend);
                    UdpBroadcast.this.receiveData = new UdpBroadcast.ReceiveData(UdpBroadcast.this, null);
                    UdpBroadcast.this.receiveData.start();
                    return;
                    try
                    {
                      UdpBroadcast.this.socket.receive(localDatagramPacket);
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
      .start();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  public void setPort(int paramInt)
  {
    this.port = paramInt;
  }

  public void stopReceive()
  {
    if ((this.receiveData != null) && (!this.receiveData.isStoped()))
      this.receiveData.stop();
  }

  private class ReceiveData
    implements Runnable
  {
    private List<DatagramPacket> packets = new ArrayList();
    private boolean stop;
    private Thread thread = new Thread(this);

    private ReceiveData()
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
            UdpBroadcast.this.onReceived(this.packets);
          this.stop = true;
          return;
          try
          {
            DatagramPacket localDatagramPacket = new DatagramPacket(new byte[100], 100);
            UdpBroadcast.this.socket.receive(localDatagramPacket);
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
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.UdpBroadcast
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */