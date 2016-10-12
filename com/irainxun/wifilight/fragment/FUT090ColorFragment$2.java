package com.irainxun.wifilight.fragment;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.diydevice;
import com.irainxun.wifilight.view.FUT090SelectModeDialog;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class FUT090ColorFragment$2
  implements View.OnClickListener
{
  FUT090ColorFragment$2(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    byte[] arrayOfByte = new byte[12];
    if (paramView == FUT090ColorFragment.access$21(this.this$0))
    {
      FUT090SelectModeDialog localFUT090SelectModeDialog1 = new FUT090SelectModeDialog(this.this$0.getActivity());
      localFUT090SelectModeDialog1.FUT090SelectMode(1, 0);
      localFUT090SelectModeDialog1.show();
    }
    do
    {
      return;
      if (paramView == FUT090ColorFragment.access$22(this.this$0))
      {
        if (FUT090ColorFragment.access$22(this.this$0).getTag() == null)
        {
          FUT090ColorFragment.access$22(this.this$0).setTag("flag");
          FUT090ColorFragment.access$22(this.this$0).setImageResource(R.drawable.tiao_se);
          FUT090ColorFragment.access$23(this.this$0).setVisibility(0);
          FUT090ColorFragment.access$24(this.this$0).setVisibility(8);
          return;
        }
        FUT090ColorFragment.access$22(this.this$0).setTag(null);
        FUT090ColorFragment.access$22(this.this$0).setImageResource(R.drawable.fangxiang);
        FUT090ColorFragment.access$23(this.this$0).setVisibility(8);
        FUT090ColorFragment.access$24(this.this$0).setVisibility(0);
        return;
      }
      if (paramView == FUT090ColorFragment.access$25(this.this$0))
      {
        diydevice localdiydevice3 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
        MyApp.rain_setch = Integer.parseInt(localdiydevice3.zonech);
        MyApp.rain_setremo = Integer.parseInt(localdiydevice3.deviceid);
        if (!MyApp.ch_zone)
        {
          MyApp.ch_zone = true;
          localdiydevice3.deviceselect = "1";
          FUT090ColorFragment.access$26(this.this$0).setText("ID:");
          FUT090ColorFragment.access$27(this.this$0).setText(localdiydevice3.deviceid);
        }
        while (true)
        {
          MyApp.deviceService.diydevice_edit(localdiydevice3);
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 0;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
          MyApp.ch_zone = false;
          localdiydevice3.deviceselect = "0";
          FUT090ColorFragment.access$26(this.this$0).setText("Zone:CH");
          FUT090ColorFragment.access$27(this.this$0).setText(localdiydevice3.zonech);
        }
      }
      if (paramView == FUT090ColorFragment.access$28(this.this$0))
      {
        MyApp.ch_zone = false;
        diydevice localdiydevice2 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
        localdiydevice2.deviceselect = "0";
        MyApp.rain_setch = Integer.parseInt(localdiydevice2.zonech);
        MyApp.rain_setremo = Integer.parseInt(localdiydevice2.deviceid);
        FUT090ColorFragment.access$26(this.this$0).setText("Zone:CH");
        MyApp.rain_setch = 0;
        localdiydevice2.zonech = "00";
        String str2 = new DecimalFormat("00").format(MyApp.rain_setch);
        FUT090ColorFragment.access$27(this.this$0).setText(str2);
        FUT090ColorFragment.access$27(this.this$0).setVisibility(0);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 0;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        MyApp.deviceService.diydevice_edit(localdiydevice2);
        return;
      }
      if (paramView == FUT090ColorFragment.access$29(this.this$0))
      {
        FUT090SelectModeDialog localFUT090SelectModeDialog2 = new FUT090SelectModeDialog(this.this$0.getActivity());
        localFUT090SelectModeDialog2.FUT090SelectMode(2, 0);
        localFUT090SelectModeDialog2.show();
        Log.d("debug", "FUT090SelectModeDialog");
        return;
      }
      if (paramView == FUT090ColorFragment.access$30(this.this$0))
      {
        diydevice localdiydevice1 = MyApp.deviceService.diydevice_getMyDevice(String.valueOf(MyApp.DeviceControl.getMacAddress()) + "00");
        MyApp.rain_setch = Integer.parseInt(localdiydevice1.zonech);
        MyApp.rain_setremo = Integer.parseInt(localdiydevice1.deviceid);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 1;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT090ColorFragment.EditGroupDialog localEditGroupDialog = new FUT090ColorFragment.EditGroupDialog(this.this$0, this.this$0.getActivity());
        String str1 = new DecimalFormat("00").format(MyApp.rain_setch);
        localEditGroupDialog.EditGroupDialogInit(new DecimalFormat("0000").format(MyApp.rain_setremo), str1);
        localEditGroupDialog.show();
        return;
      }
    }
    while (paramView != FUT090ColorFragment.access$27(this.this$0));
    FUT090ColorFragment.access$31(this.this$0, MyApp.ch_zone);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */