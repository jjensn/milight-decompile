package com.irainxun.wifilight;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class SetTimeActivity$GroupUtil$GroupItemLongClickListener$3
  implements View.OnClickListener
{
  SetTimeActivity$GroupUtil$GroupItemLongClickListener$3(SetTimeActivity.GroupUtil.GroupItemLongClickListener paramGroupItemLongClickListener, EditText paramEditText, Dialog paramDialog, TextView paramTextView)
  {
  }

  public void onClick(View paramView)
  {
    String str1 = this.val$etName.getText().toString();
    if (!TextUtils.isEmpty(str1))
    {
      this.val$dialog.dismiss();
      this.val$tvGroup.setText(str1);
      DecimalFormat localDecimalFormat = new DecimalFormat("00");
      String str2 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
      zoneName localzoneName = MyApp.deviceService.zoneName_getMyDevice(str2);
      switch (this.this$2.pos)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        MyApp.deviceService.zoneName_edit(localzoneName);
        return;
        localzoneName.zoneNameone = str1;
        continue;
        localzoneName.zoneNametwo = str1;
        continue;
        localzoneName.zoneNamethree = str1;
        continue;
        localzoneName.zoneNamefour = str1;
      }
    }
    Toast.makeText(SetTimeActivity.GroupUtil.access$4(SetTimeActivity.GroupUtil.GroupItemLongClickListener.access$0(this.this$2)), R.string.tips_light_group_name_empty, 1).show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SetTimeActivity.GroupUtil.GroupItemLongClickListener.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */