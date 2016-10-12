package com.irainxun.wifilight.apsetting.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.irainxun.wifilight.apsetting.net.INetworkTransmission;
import com.irainxun.wifilight.apsetting.net.TCPClient;
import com.irainxun.wifilight.apsetting.net.TCPClient.TCPClientListener;
import com.irainxun.wifilight.apsetting.net.TCPServer;
import com.irainxun.wifilight.apsetting.net.TCPServer.TCPServerListener;
import com.irainxun.wifilight.apsetting.net.UdpUnicast;
import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

public class TransparentTransmission
{
  private static final String KEY_BUFFER = "KEY_BUFFER";
  private static final String KEY_LENGTH = "KEY_LENGTH";
  private static final String KEY_TCPCLIENT_OPEN = "KEY_TCPCLIENT_OPEN";
  private static final int MSG_DATA = 1;
  private static final int MSG_TCPCLIENT = 2;
  private Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      default:
      case 1:
      case 2:
      }
      do
      {
        do
          return;
        while (TransparentTransmission.this.listener == null);
        TransparentTransmission.this.listener.onReceive(paramAnonymousMessage.getData().getByteArray("KEY_BUFFER"), paramAnonymousMessage.getData().getInt("KEY_LENGTH"));
        return;
      }
      while (TransparentTransmission.this.listener == null);
      TransparentTransmission.this.listener.onOpen(paramAnonymousMessage.getData().getBoolean("KEY_TCPCLIENT_OPEN"));
    }
  };
  private TransparentTransmissionListener listener;
  private NetworkProtocol protocol;
  private INetworkTransmission transmission;

  public TransparentTransmission()
  {
  }

  private void handleData(byte[] paramArrayOfByte, int paramInt)
  {
    Message localMessage = this.handler.obtainMessage(1);
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("KEY_BUFFER", paramArrayOfByte);
    localBundle.putInt("KEY_LENGTH", paramInt);
    localMessage.setData(localBundle);
    this.handler.sendMessage(localMessage);
  }

  public void close()
  {
    this.transmission.close();
  }

  public TransparentTransmissionListener getListener()
  {
    return this.listener;
  }

  public NetworkProtocol getProtocol()
  {
    return this.protocol;
  }

  public boolean init()
  {
    int i = this.protocol.getType();
    if (i == 0);
    do
    {
      return false;
      if (i == 1)
      {
        this.transmission = new TCPClient(this.protocol.getIp(), this.protocol.getPort());
        ((TCPClient)this.transmission).setListener(new TCPClient.TCPClientListener()
        {
          public void onConnect(boolean paramAnonymousBoolean)
          {
            Message localMessage = TransparentTransmission.this.handler.obtainMessage(2);
            Bundle localBundle = new Bundle();
            localBundle.putBoolean("KEY_TCPCLIENT_OPEN", paramAnonymousBoolean);
            localMessage.setData(localBundle);
            TransparentTransmission.this.handler.sendMessage(localMessage);
          }

          public void onReceive(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
          {
            TransparentTransmission.this.handleData(paramAnonymousArrayOfByte, paramAnonymousInt);
          }
        });
        return true;
      }
      if (i == 2)
      {
        this.transmission = new TCPServer(this.protocol.getIp(), this.protocol.getPort());
        ((TCPServer)this.transmission).setListener(new TCPServer.TCPServerListener()
        {
          public void onReceive(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
          {
            TransparentTransmission.this.handleData(paramAnonymousArrayOfByte, paramAnonymousInt);
          }
        });
        return true;
      }
    }
    while (i != 3);
    this.transmission = new UdpUnicast(this.protocol.getIp(), this.protocol.getPort());
    ((UdpUnicast)this.transmission).setListener(new UdpUnicast.UdpUnicastListener()
    {
      public void onReceived(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        TransparentTransmission.this.handleData(paramAnonymousArrayOfByte, paramAnonymousInt);
      }
    });
    return true;
  }

  public boolean open()
  {
    this.transmission.setParameters(this.protocol.getIp(), this.protocol.getPort());
    boolean bool = this.transmission.open();
    if ((((this.transmission instanceof TCPServer)) || ((this.transmission instanceof UdpUnicast))) && (this.listener != null))
      this.listener.onOpen(bool);
    return bool;
  }

  public boolean send(String paramString)
  {
    return this.transmission.send(paramString);
  }

  public void setListener(TransparentTransmissionListener paramTransparentTransmissionListener)
  {
    this.listener = paramTransparentTransmissionListener;
  }

  public void setProtocol(NetworkProtocol paramNetworkProtocol)
  {
    this.protocol = paramNetworkProtocol;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.TransparentTransmission
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */