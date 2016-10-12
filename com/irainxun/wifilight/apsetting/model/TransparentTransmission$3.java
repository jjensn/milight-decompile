package com.irainxun.wifilight.apsetting.model;

import com.irainxun.wifilight.apsetting.net.TCPServer.TCPServerListener;

class TransparentTransmission$3
  implements TCPServer.TCPServerListener
{
  TransparentTransmission$3(TransparentTransmission paramTransparentTransmission)
  {
  }

  public void onReceive(byte[] paramArrayOfByte, int paramInt)
  {
    TransparentTransmission.access$1(this.this$0, paramArrayOfByte, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.TransparentTransmission.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */