package com.irainxun.wifilight.apsetting.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;

class ATCommand$2
  implements UdpUnicast.UdpUnicastListener
{
  ATCommand$2(ATCommand paramATCommand)
  {
  }

  public void onReceived(byte[] paramArrayOfByte, int paramInt)
  {
    Log.d("ATCommand", "onReceived[send]:" + new String(paramArrayOfByte, 0, paramInt));
    Message localMessage = ATCommand.access$10(this.this$0).obtainMessage(9);
    Bundle localBundle = new Bundle();
    localBundle.putString("RESPONSE", new String(paramArrayOfByte, 0, paramInt));
    localMessage.setData(localBundle);
    ATCommand.access$10(this.this$0).sendMessage(localMessage);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */