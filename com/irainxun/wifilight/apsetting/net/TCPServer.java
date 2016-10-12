package com.irainxun.wifilight.apsetting.net;

import android.util.Log;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPServer
  implements INetworkTransmission
{
  private byte[] buffer;
  private BufferedInputStream inputStream;
  private String ip;
  private TCPServerListener listener;
  private BufferedOutputStream outputStream;
  private int port;
  private ServerSocket server;
  private Socket socket;
  private boolean stop;

  public TCPServer(String paramString, int paramInt)
  {
    this.ip = paramString;
    this.port = paramInt;
    this.buffer = new byte[1024];
    Utils.forceStrictMode();
  }

  // ERROR //
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 44	com/irainxun/wifilight/apsetting/net/TCPServer:stop	Z
    //   5: aload_0
    //   6: getfield 52	com/irainxun/wifilight/apsetting/net/TCPServer:socket	Ljava/net/Socket;
    //   9: ifnull +10 -> 19
    //   12: aload_0
    //   13: getfield 52	com/irainxun/wifilight/apsetting/net/TCPServer:socket	Ljava/net/Socket;
    //   16: invokevirtual 73	java/net/Socket:close	()V
    //   19: aload_0
    //   20: getfield 48	com/irainxun/wifilight/apsetting/net/TCPServer:server	Ljava/net/ServerSocket;
    //   23: ifnull +10 -> 33
    //   26: aload_0
    //   27: getfield 48	com/irainxun/wifilight/apsetting/net/TCPServer:server	Ljava/net/ServerSocket;
    //   30: invokevirtual 76	java/net/ServerSocket:close	()V
    //   33: return
    //   34: astore_2
    //   35: aload_2
    //   36: invokevirtual 79	java/io/IOException:printStackTrace	()V
    //   39: goto -20 -> 19
    //   42: astore_1
    //   43: aload_1
    //   44: invokevirtual 79	java/io/IOException:printStackTrace	()V
    //   47: return
    //
    // Exception table:
    //   from	to	target	type
    //   12	19	34	java/io/IOException
    //   26	33	42	java/io/IOException
  }

  public TCPServerListener getListener()
  {
    return this.listener;
  }

  public void onReceive(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.listener != null)
      this.listener.onReceive(paramArrayOfByte, paramInt);
  }

  public boolean open()
  {
    bool = true;
    try
    {
      this.server = new ServerSocket(this.port, 1, InetAddress.getByName(this.ip));
      this.server.setSoTimeout(5000);
      new Thread(new Runnable()
      {
        public void run()
        {
          while (true)
          {
            if (TCPServer.this.stop)
              return;
            try
            {
              TCPServer.this.socket = TCPServer.this.server.accept();
              TCPServer.this.inputStream = new BufferedInputStream(TCPServer.this.socket.getInputStream());
              TCPServer.this.outputStream = new BufferedOutputStream(TCPServer.this.socket.getOutputStream());
              while (true)
              {
                int i = TCPServer.this.inputStream.read(TCPServer.this.buffer);
                if (i > 0)
                  TCPServer.this.onReceive(TCPServer.this.buffer, i);
                try
                {
                  Thread.sleep(100L);
                }
                catch (InterruptedException localInterruptedException)
                {
                  localInterruptedException.printStackTrace();
                }
              }
            }
            catch (IOException localIOException)
            {
              localIOException.printStackTrace();
            }
          }
        }
      }).start();
      return bool;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      while (true)
      {
        localUnknownHostException.printStackTrace();
        bool = false;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        localIOException.printStackTrace();
        bool = false;
      }
    }
    finally
    {
    }
  }

  public boolean send(String paramString)
  {
    try
    {
      Log.d("outputStream:", this.outputStream.toString());
      BufferedOutputStream localBufferedOutputStream = this.outputStream;
      bool = false;
      if (localBufferedOutputStream != null)
        try
        {
          Log.d("TCP Server Send:", paramString);
          this.outputStream.write(paramString.getBytes(), 0, paramString.getBytes().length);
          this.outputStream.flush();
          Log.d("TCP Server Send2:", paramString);
          bool = true;
          return bool;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            localIOException.printStackTrace();
            bool = false;
          }
        }
    }
    finally
    {
    }
  }

  public void setListener(TCPServerListener paramTCPServerListener)
  {
    this.listener = paramTCPServerListener;
  }

  public void setParameters(String paramString, int paramInt)
  {
    this.ip = paramString;
    this.port = paramInt;
  }

  public static abstract interface TCPServerListener
  {
    public abstract void onReceive(byte[] paramArrayOfByte, int paramInt);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.TCPServer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */