package com.irainxun.wifilight.apsetting.net;

import android.util.Log;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

public class UdpUnicast
  implements INetworkTransmission
{
  private static final int BUFFER_SIZE = 2048;
  private static final String TAG = "SmartLink | UdpUnicast";
  private byte[] buffer = new byte[2048];
  private InetAddress inetAddress;
  private String ip;
  private UdpUnicastListener listener;
  private DatagramPacket packetToSend;
  private int port = 48899;
  private ReceiveData receiveData;
  private DatagramSocket socket;

  public UdpUnicast()
  {
    Utils.forceStrictMode();
  }

  public UdpUnicast(String paramString, int paramInt)
  {
    this();
    this.ip = paramString;
    this.port = paramInt;
  }

  public void close()
  {
    try
    {
      stopReceive();
      if (this.socket != null)
        this.socket.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String getIp()
  {
    return this.ip;
  }

  public UdpUnicastListener getListener()
  {
    return this.listener;
  }

  public int getPort()
  {
    return this.port;
  }

  public void onReceive(byte[] paramArrayOfByte, int paramInt)
  {
    Log.d("SmartLink | UdpUnicast", new String(paramArrayOfByte, 0, paramInt));
    if (this.listener != null)
      this.listener.onReceived(paramArrayOfByte, paramInt);
  }

  // ERROR //
  public boolean open()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield 45	com/irainxun/wifilight/apsetting/net/UdpUnicast:ip	Ljava/lang/String;
    //   7: invokestatic 97	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   10: putfield 99	com/irainxun/wifilight/apsetting/net/UdpUnicast:inetAddress	Ljava/net/InetAddress;
    //   13: aload_0
    //   14: new 57	java/net/DatagramSocket
    //   17: dup
    //   18: aload_0
    //   19: getfield 34	com/irainxun/wifilight/apsetting/net/UdpUnicast:port	I
    //   22: invokespecial 102	java/net/DatagramSocket:<init>	(I)V
    //   25: putfield 51	com/irainxun/wifilight/apsetting/net/UdpUnicast:socket	Ljava/net/DatagramSocket;
    //   28: aload_0
    //   29: new 104	com/irainxun/wifilight/apsetting/net/UdpUnicast$ReceiveData
    //   32: dup
    //   33: aload_0
    //   34: aconst_null
    //   35: invokespecial 107	com/irainxun/wifilight/apsetting/net/UdpUnicast$ReceiveData:<init>	(Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$ReceiveData;)V
    //   38: putfield 109	com/irainxun/wifilight/apsetting/net/UdpUnicast:receiveData	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$ReceiveData;
    //   41: aload_0
    //   42: getfield 109	com/irainxun/wifilight/apsetting/net/UdpUnicast:receiveData	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$ReceiveData;
    //   45: invokevirtual 112	com/irainxun/wifilight/apsetting/net/UdpUnicast$ReceiveData:start	()V
    //   48: iconst_1
    //   49: istore_3
    //   50: aload_0
    //   51: monitorexit
    //   52: iload_3
    //   53: ireturn
    //   54: astore_2
    //   55: aload_2
    //   56: invokevirtual 115	java/net/UnknownHostException:printStackTrace	()V
    //   59: iconst_0
    //   60: istore_3
    //   61: goto -11 -> 50
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: athrow
    //   69: astore 4
    //   71: aload 4
    //   73: invokevirtual 116	java/net/SocketException:printStackTrace	()V
    //   76: iconst_0
    //   77: istore_3
    //   78: goto -28 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   2	13	54	java/net/UnknownHostException
    //   2	13	64	finally
    //   13	28	64	finally
    //   28	48	64	finally
    //   55	59	64	finally
    //   71	76	64	finally
    //   13	28	69	java/net/SocketException
  }

  public boolean send(String paramString)
  {
    try
    {
      Log.d("SmartLink | UdpUnicast", "send:" + paramString);
      DatagramSocket localDatagramSocket = this.socket;
      boolean bool = false;
      if (localDatagramSocket == null);
      while (true)
      {
        return bool;
        if (paramString == null)
        {
          bool = true;
        }
        else
        {
          this.packetToSend = new DatagramPacket(paramString.getBytes(), paramString.getBytes().length, this.inetAddress, this.port);
          try
          {
            this.socket.send(this.packetToSend);
            bool = true;
          }
          catch (IOException localIOException)
          {
            localIOException.printStackTrace();
            bool = false;
          }
        }
      }
    }
    finally
    {
    }
  }

  public void setIp(String paramString)
  {
    this.ip = paramString;
  }

  public void setListener(UdpUnicastListener paramUdpUnicastListener)
  {
    this.listener = paramUdpUnicastListener;
  }

  public void setParameters(String paramString, int paramInt)
  {
    this.ip = paramString;
    this.port = paramInt;
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
      while (true)
      {
        if (this.stop)
          return;
        try
        {
          DatagramPacket localDatagramPacket = new DatagramPacket(UdpUnicast.this.buffer, 2048);
          UdpUnicast.this.socket.receive(localDatagramPacket);
          UdpUnicast.this.onReceive(UdpUnicast.this.buffer, localDatagramPacket.getLength());
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

  public static abstract interface UdpUnicastListener
  {
    public abstract void onReceived(byte[] paramArrayOfByte, int paramInt);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.UdpUnicast
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */