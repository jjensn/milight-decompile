package com.irainxun.wifilight;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.io.File;

class DeviceEditActivity$1
  implements View.OnClickListener
{
  DeviceEditActivity$1(DeviceEditActivity paramDeviceEditActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == DeviceEditActivity.access$0(this.this$0))
      this.this$0.finish();
    String str1;
    do
    {
      do
      {
        return;
        if (paramView == DeviceEditActivity.access$1(this.this$0))
        {
          String str2 = DeviceEditActivity.access$2(this.this$0).getText().toString().trim();
          if (TextUtils.isEmpty(str2))
          {
            Toast.makeText(this.this$0, R.string.tips_device_name_empty, 1).show();
            return;
          }
          DeviceEditActivity.access$3(this.this$0).name = str2;
          DeviceEditActivity.access$3(this.this$0).dispFlag = DeviceEditActivity.access$4(this.this$0);
          if (DeviceEditActivity.access$4(this.this$0) == 0)
            if (!TextUtils.isEmpty(DeviceEditActivity.access$5(this.this$0)))
            {
              DeviceEditActivity.access$3(this.this$0).iconPath = DeviceEditActivity.access$5(this.this$0);
              MyApp.deviceService.editcPhoto(DeviceEditActivity.access$3(this.this$0).getMacAddress(), DeviceEditActivity.access$5(this.this$0));
            }
          while (true)
          {
            MyApp.deviceService.editcDispFlag(DeviceEditActivity.access$3(this.this$0).getMacAddress(), DeviceEditActivity.access$4(this.this$0));
            MyApp.deviceService.editName(DeviceEditActivity.access$3(this.this$0).getMacAddress(), DeviceEditActivity.access$3(this.this$0).name);
            Log.d("debug", "aaa dispFlag = " + DeviceEditActivity.access$4(this.this$0));
            Log.d("debug", "aaa selectedImg = " + DeviceEditActivity.access$5(this.this$0));
            Log.d("debug", "aaa iconRes = " + DeviceEditActivity.access$6(this.this$0));
            Intent localIntent2 = new Intent();
            localIntent2.putExtra("light", DeviceEditActivity.access$3(this.this$0));
            this.this$0.setResult(-1, localIntent2);
            this.this$0.finish();
            return;
            if (DeviceEditActivity.access$6(this.this$0) > 0)
            {
              DeviceEditActivity.access$3(this.this$0).iconRes = DeviceEditActivity.access$6(this.this$0);
              MyApp.deviceService.editcIcon(DeviceEditActivity.access$3(this.this$0).getMacAddress(), DeviceEditActivity.access$6(this.this$0));
            }
          }
        }
        if (paramView == DeviceEditActivity.access$7(this.this$0))
        {
          new AlertDialog.Builder(this.this$0).setIcon(17301659).setItems(R.array.menu_photo, new DialogInterface.OnClickListener()
          {
            public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              if (paramAnonymousInt == 0)
              {
                Intent localIntent1 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                DeviceEditActivity.1.this.this$0.startActivityForResult(localIntent1, 2);
                return;
              }
              if (paramAnonymousInt == 1)
              {
                String str = "wl_" + System.currentTimeMillis() + ".jpg";
                File localFile = new File(Environment.getExternalStorageDirectory(), str);
                DeviceEditActivity.access$8(DeviceEditActivity.1.this.this$0, localFile.getPath());
                Intent localIntent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                localIntent2.putExtra("output", Uri.fromFile(localFile));
                DeviceEditActivity.1.this.this$0.startActivityForResult(localIntent2, 1);
                return;
              }
              paramAnonymousDialogInterface.dismiss();
            }
          }).create().show();
          return;
        }
        if (paramView == DeviceEditActivity.access$9(this.this$0))
        {
          Intent localIntent1 = new Intent(this.this$0, ChangePwdActivity.class);
          localIntent1.putExtra("light", DeviceEditActivity.access$3(this.this$0));
          this.this$0.startActivity(localIntent1);
          return;
        }
      }
      while (paramView != DeviceEditActivity.access$10(this.this$0));
      str1 = MyApp.getMusic("music");
      if (str1 == null)
      {
        DeviceEditActivity.access$10(this.this$0).setChecked(false);
        MyApp.modifyMusic("0", "music");
        MyApp.MusicPlag = false;
        return;
      }
      if (Integer.parseInt(str1) == 0)
      {
        DeviceEditActivity.access$10(this.this$0).setChecked(true);
        MyApp.modifyMusic("1", "music");
        MyApp.MusicPlag = true;
        return;
      }
    }
    while (Integer.parseInt(str1) != 1);
    DeviceEditActivity.access$10(this.this$0).setChecked(false);
    MyApp.modifyMusic("0", "music");
    MyApp.MusicPlag = false;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceEditActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */