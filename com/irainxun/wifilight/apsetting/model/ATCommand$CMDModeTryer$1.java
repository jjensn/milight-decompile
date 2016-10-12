package com.irainxun.wifilight.apsetting.model;

import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

class ATCommand$CMDModeTryer$1
  implements UdpUnicast.UdpUnicastListener
{
  ATCommand$CMDModeTryer$1(ATCommand.CMDModeTryer paramCMDModeTryer)
  {
  }

  public void onReceived(byte[] paramArrayOfByte, int paramInt)
  {
    synchronized (ATCommand.access$0(ATCommand.CMDModeTryer.access$1(this.this$1)))
    {
      ATCommand.access$0(ATCommand.CMDModeTryer.access$1(this.this$1)).append(new String(paramArrayOfByte, 0, paramInt));
      ATCommand.access$0(ATCommand.CMDModeTryer.access$1(this.this$1)).notify();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.CMDModeTryer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */