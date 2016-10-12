package com.irainxun.wifilight.view;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.irainxun.wifilight.util.LogUtil;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090SelectModeDialog$1
  implements AdapterView.OnItemClickListener
{
  FUT090SelectModeDialog$1(FUT090SelectModeDialog paramFUT090SelectModeDialog, FUT090SelectModeDialog.MAdapter paramMAdapter)
  {
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    MyApp.PlalyKeySound();
    String str = this.val$adapter.getItem(paramInt);
    LogUtil.showMsg(String.valueOf(FUT090SelectModeDialog.access$1(this.this$0)) + " onItemClick pos:" + paramInt + ",m:" + str);
    Log.d("debug", "modeSelect = " + FUT090SelectModeDialog.access$2(this.this$0));
    Log.d("debug", " onItemClick pos:" + paramInt + ",m:" + str);
    byte[] arrayOfByte = new byte[12];
    arrayOfByte[0] = 49;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    if (FUT090SelectModeDialog.access$2(this.this$0) == 2)
      arrayOfByte[4] = 7;
    while (true)
    {
      arrayOfByte[5] = (byte)Integer.parseInt(str);
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = (byte)MyApp.rain_setch;
      if (!MyApp.ch_zone)
        arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
      arrayOfByte[9] = (byte)MyApp.rain_setremo;
      arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      this.this$0.dismiss();
      return;
      if (FUT090SelectModeDialog.access$2(this.this$0) == 1)
        arrayOfByte[4] = 23;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.FUT090SelectModeDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */