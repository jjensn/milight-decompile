package com.irainxun.wifilight.fragment;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.diydevice;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class FUT090ModeFragment$EditGroupDialog$1
  implements View.OnClickListener
{
  FUT090ModeFragment$EditGroupDialog$1(FUT090ModeFragment.EditGroupDialog paramEditGroupDialog)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if (paramView == FUT090ModeFragment.EditGroupDialog.access$0(this.this$1))
    {
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 0;
      arrayOfByte[5] = 2;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      MyApp.rain_setch = Integer.parseInt(FUT090ModeFragment.EditGroupDialog.access$1(this.this$1).getText().toString());
      arrayOfByte[8] = (byte)MyApp.rain_setch;
      if (!MyApp.ch_zone)
        arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
      arrayOfByte[9] = (byte)MyApp.rain_setremo;
      arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
      arrayOfByte[11] = 0;
    }
    do
    {
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      do
      {
        this.this$1.dismiss();
        return;
      }
      while (paramView != FUT090ModeFragment.EditGroupDialog.access$2(this.this$1));
    }
    while (FUT090ModeFragment.EditGroupDialog.access$1(this.this$1).length() != 2);
    arrayOfByte[0] = 49;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = 0;
    arrayOfByte[5] = 2;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    MyApp.rain_setch = Integer.parseInt(FUT090ModeFragment.EditGroupDialog.access$1(this.this$1).getText().toString());
    arrayOfByte[8] = (byte)MyApp.rain_setch;
    if (!MyApp.ch_zone)
      arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
    arrayOfByte[9] = (byte)MyApp.rain_setremo;
    arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    diydevice localdiydevice = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
    localdiydevice.zonech = new DecimalFormat("00").format(MyApp.rain_setch);
    localdiydevice.deviceid = new DecimalFormat("0000").format(MyApp.rain_setremo);
    if (!MyApp.ch_zone)
      FUT090ModeFragment.access$16(FUT090ModeFragment.EditGroupDialog.access$3(this.this$1)).setText(localdiydevice.zonech);
    while (true)
    {
      MyApp.deviceService.diydevice_edit(localdiydevice);
      break;
      FUT090ModeFragment.access$16(FUT090ModeFragment.EditGroupDialog.access$3(this.this$1)).setText(localdiydevice.deviceid);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ModeFragment.EditGroupDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */