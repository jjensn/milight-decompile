package com.irainxun.wifilight.apsetting.model;

import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

class ATCommand$8
  implements UdpUnicast.UdpUnicastListener
{
  ATCommand$8(ATCommand paramATCommand)
  {
  }

  public void onReceived(byte[] paramArrayOfByte, int paramInt)
  {
    ATCommand.access$18(this.this$0, new String(paramArrayOfByte, 0, paramInt).trim());
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */