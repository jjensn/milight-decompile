package com.irainxun.wifilight;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import java.io.File;

class DeviceEditActivity$1$1
  implements DialogInterface.OnClickListener
{
  DeviceEditActivity$1$1(DeviceEditActivity.1 param1)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == 0)
    {
      Intent localIntent1 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
      DeviceEditActivity.1.access$0(this.this$1).startActivityForResult(localIntent1, 2);
      return;
    }
    if (paramInt == 1)
    {
      String str = "wl_" + System.currentTimeMillis() + ".jpg";
      File localFile = new File(Environment.getExternalStorageDirectory(), str);
      DeviceEditActivity.access$8(DeviceEditActivity.1.access$0(this.this$1), localFile.getPath());
      Intent localIntent2 = new Intent("android.media.action.IMAGE_CAPTURE");
      localIntent2.putExtra("output", Uri.fromFile(localFile));
      DeviceEditActivity.1.access$0(this.this$1).startActivityForResult(localIntent2, 1);
      return;
    }
    paramDialogInterface.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceEditActivity.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */