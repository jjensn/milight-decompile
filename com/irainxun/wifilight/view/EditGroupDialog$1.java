package com.irainxun.wifilight.view;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.irainxun.wifilight.xlink.MyApp;

class EditGroupDialog$1
  implements View.OnClickListener
{
  EditGroupDialog$1(EditGroupDialog paramEditGroupDialog)
  {
  }

  public void onClick(View paramView)
  {
    byte[] arrayOfByte = new byte[12];
    if (paramView == EditGroupDialog.access$0(this.this$0))
    {
      arrayOfByte[0] = 49;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 0;
      arrayOfByte[5] = 2;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      MyApp.rain_setch = Integer.parseInt(EditGroupDialog.access$1(this.this$0).getText().toString());
      arrayOfByte[8] = (byte)MyApp.rain_setch;
      if (!MyApp.ch_zone)
        arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
      MyApp.rain_setremo = Integer.parseInt(EditGroupDialog.access$2(this.this$0).getText().toString());
      arrayOfByte[9] = (byte)MyApp.rain_setremo;
      arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    }
    while (true)
    {
      this.this$0.dismiss();
      return;
      if (paramView == EditGroupDialog.access$3(this.this$0))
      {
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 0;
        arrayOfByte[5] = 2;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        MyApp.rain_setch = Integer.parseInt(EditGroupDialog.access$1(this.this$0).getText().toString());
        arrayOfByte[8] = (byte)MyApp.rain_setch;
        if (!MyApp.ch_zone)
          arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
        MyApp.rain_setremo = Integer.parseInt(EditGroupDialog.access$2(this.this$0).getText().toString());
        arrayOfByte[9] = (byte)MyApp.rain_setremo;
        arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.EditGroupDialog.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */