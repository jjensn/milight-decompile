package com.irainxun.wifilight.util;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class GroupUtil$GroupItemLongClickListener
  implements View.OnLongClickListener
{
  int pos;

  GroupUtil$GroupItemLongClickListener(GroupUtil paramGroupUtil, int paramInt)
  {
    this.pos = paramInt;
  }

  public boolean onLongClick(View paramView)
  {
    final TextView localTextView = (TextView)paramView;
    final Dialog localDialog = new Dialog(GroupUtil.access$2(this.this$0), R.style.EditLightDialog);
    localDialog.setContentView(R.layout.dialog_edit_group);
    localDialog.setCanceledOnTouchOutside(false);
    localDialog.setCancelable(false);
    localDialog.show();
    final EditText localEditText = (EditText)localDialog.findViewById(R.id.et_name);
    localEditText.setText(localTextView.getText());
    localEditText.setSelection(localEditText.length());
    localDialog.findViewById(R.id.iv_clear).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        localEditText.setText(null);
      }
    });
    localDialog.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        localDialog.dismiss();
      }
    });
    localDialog.findViewById(R.id.tv_ok).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        String str1 = localEditText.getText().toString();
        if (!TextUtils.isEmpty(str1))
        {
          localDialog.dismiss();
          localTextView.setText(str1);
          DecimalFormat localDecimalFormat = new DecimalFormat("00");
          String str2 = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
          zoneName localzoneName = MyApp.deviceService.zoneName_getMyDevice(str2);
          switch (GroupUtil.GroupItemLongClickListener.this.pos)
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
        Toast.makeText(GroupUtil.access$2(GroupUtil.GroupItemLongClickListener.this.this$0), R.string.tips_light_group_name_empty, 1).show();
      }
    });
    return true;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.GroupUtil.GroupItemLongClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */