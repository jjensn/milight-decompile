package com.irainxun.wifilight.apsetting.model;

import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

class ATCommand$3
  implements UdpUnicast.UdpUnicastListener
{
  ATCommand$3(ATCommand paramATCommand)
  {
  }

  public void onReceived(byte[] paramArrayOfByte, int paramInt)
  {
    ATCommand.access$11(this.this$0, new String(paramArrayOfByte, 0, paramInt));
    ATCommand.access$13(this.this$0, ATCommand.access$12(this.this$0).trim());
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */