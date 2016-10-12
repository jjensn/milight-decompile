package com.irainxun.wifilight.apsetting.net;

import java.net.DatagramPacket;
import java.util.List;

class RetryUdpBroadcast$1 extends UdpBroadcast
{
  RetryUdpBroadcast$1(RetryUdpBroadcast paramRetryUdpBroadcast)
  {
  }

  public void onReceived(List<DatagramPacket> paramList)
  {
    synchronized (RetryUdpBroadcast.access$0(this.this$0))
    {
      RetryUdpBroadcast.access$0(this.this$0).notify();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.net.RetryUdpBroadcast.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */