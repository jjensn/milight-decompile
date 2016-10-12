package com.irainxun.wifilight.apsetting.model;

import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

class TransparentTransmission$4
  implements UdpUnicast.UdpUnicastListener
{
  TransparentTransmission$4(TransparentTransmission paramTransparentTransmission)
  {
  }

  public void onReceived(byte[] paramArrayOfByte, int paramInt)
  {
    TransparentTransmission.access$1(this.this$0, paramArrayOfByte, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.TransparentTransmission.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */