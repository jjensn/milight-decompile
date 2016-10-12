package com.irainxun.wifilight.apsetting.net;

import android.os.Handler;
import android.os.Message;

class RetryUdpBroadcast$2 extends Handler
{
  RetryUdpBroadcast$2(RetryUdpBroadcast paramRetryUdpBroadcast)
  {
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    RetryUdpBroadcast.access$1(this.this$0).send(paramMessage.obj.toString());
    synchronized (RetryUdpBroadcast.access$0(this.this$0))
    {
      try
      {
        RetryUdpBroadcast.access$0(this.this$0).wait();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          localInterruptedException.printStackTrace();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.RetryUdpBroadcast.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */