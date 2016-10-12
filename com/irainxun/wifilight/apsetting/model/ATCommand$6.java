package com.irainxun.wifilight.apsetting.model;

import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

class ATCommand$6
  implements UdpUnicast.UdpUnicastListener
{
  ATCommand$6(ATCommand paramATCommand)
  {
  }

  public void onReceived(byte[] paramArrayOfByte, int paramInt)
  {
    synchronized (ATCommand.access$17(this.this$0))
    {
      ATCommand.access$17(this.this$0).append(new String(paramArrayOfByte, 0, paramInt).trim());
      ATCommand.access$17(this.this$0).notify();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */