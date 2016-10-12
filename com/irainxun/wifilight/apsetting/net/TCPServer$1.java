package com.irainxun.wifilight.apsetting.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer$1
  implements Runnable
{
  TCPServer$1(TCPServer paramTCPServer)
  {
  }

  public void run()
  {
    while (true)
    {
      if (TCPServer.access$0(this.this$0))
        return;
      try
      {
        TCPServer.access$2(this.this$0, TCPServer.access$1(this.this$0).accept());
        TCPServer.access$4(this.this$0, new BufferedInputStream(TCPServer.access$3(this.this$0).getInputStream()));
        TCPServer.access$5(this.this$0, new BufferedOutputStream(TCPServer.access$3(this.this$0).getOutputStream()));
        while (true)
        {
          int i = TCPServer.access$6(this.this$0).read(TCPServer.access$7(this.this$0));
          if (i > 0)
            this.this$0.onReceive(TCPServer.access$7(this.this$0), i);
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
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.TCPServer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */