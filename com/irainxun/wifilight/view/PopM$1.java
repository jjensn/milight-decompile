package com.irainxun.wifilight.view;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class PopM$1
  implements AdapterView.OnItemClickListener
{
  PopM$1(PopM paramPopM, PopM.MAdapter paramMAdapter, TextView paramTextView, PopupWindow paramPopupWindow)
  {
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    String str = this.val$adapter.getItem(paramInt);
    Log.d("debug", "onItemClick = " + paramInt);
    this.val$tvM.setText(str);
    MyApp.PlalyKeySound();
    byte[] arrayOfByte = new byte[12];
    arrayOfByte[0] = 49;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = 4;
    arrayOfByte[5] = (byte)paramInt;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    this.val$popupWindow.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.PopM.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */