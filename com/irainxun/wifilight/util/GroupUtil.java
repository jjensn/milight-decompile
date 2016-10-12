package com.irainxun.wifilight.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.controller.BaseControllerActivity;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GroupUtil
{
  private Activity activity;
  private LinearLayout container;
  private ArrayList<String> groups;
  private LayoutInflater inflater;
  private int selectPos;

  public GroupUtil(Activity paramActivity, LinearLayout paramLinearLayout, ArrayList<String> paramArrayList)
  {
    this.activity = paramActivity;
    this.container = paramLinearLayout;
    this.groups = paramArrayList;
    this.inflater = LayoutInflater.from(paramActivity);
  }

  private void setItemStyle(TextView paramTextView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramTextView.setBackgroundResource(R.drawable.group_item_selected);
      paramTextView.setTextColor(-1);
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_group_selected, 0, 0);
      return;
    }
    paramTextView.setBackgroundResource(R.drawable.page_bg);
    paramTextView.setTextColor(this.activity.getResources().getColor(R.color.light_name));
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_group_nor, 0, 0);
  }

  public void initGroup(int paramInt)
  {
    this.selectPos = paramInt;
    MyApp.rain_remo = (byte)(paramInt + 1);
    if (this.groups == null);
    int j;
    for (int i = 0; ; i = this.groups.size())
    {
      j = 0;
      if (j < i)
        break;
      return;
    }
    TextView localTextView = (TextView)this.inflater.inflate(R.layout.list_group_item, null);
    localTextView.setText((CharSequence)this.groups.get(j));
    if (j == paramInt);
    for (boolean bool = true; ; bool = false)
    {
      setItemStyle(localTextView, bool);
      localTextView.setOnClickListener(new GroupItemClickListener(j));
      localTextView.setOnLongClickListener(new GroupItemLongClickListener(j));
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0F);
      this.container.addView(localTextView, localLayoutParams);
      if (j < i - 1)
        this.inflater.inflate(R.layout.vertical_line, this.container);
      j++;
      break;
    }
  }

  public void selectAll(boolean paramBoolean)
  {
    int i = this.container.getChildCount();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      View localView = this.container.getChildAt(j);
      if ((localView instanceof TextView))
        setItemStyle((TextView)localView, paramBoolean);
    }
  }

  public void selectNum(byte paramByte)
  {
    int i = this.container.getChildCount();
    byte b = 0;
    if (b >= i)
      return;
    View localView = this.container.getChildAt(b);
    TextView localTextView;
    if ((localView instanceof TextView))
    {
      localTextView = (TextView)localView;
      if (b != paramByte)
        break label59;
      setItemStyle(localTextView, true);
    }
    while (true)
    {
      b++;
      break;
      label59: setItemStyle(localTextView, false);
    }
  }

  class GroupItemClickListener
    implements View.OnClickListener
  {
    int pos;

    GroupItemClickListener(int arg2)
    {
      int i;
      this.pos = i;
    }

    public void onClick(View paramView)
    {
      GroupUtil.this.selectPos = this.pos;
      MyApp.PlalyKeySound();
      Log.d("debug", "selectPos = " + GroupUtil.this.selectPos);
      MyApp.rain_remo = (byte)(1 + GroupUtil.this.selectPos);
      Log.d("debug", "MyApp.rain_remo = " + MyApp.rain_remo);
      if ((GroupUtil.this.activity instanceof BaseControllerActivity))
        ((BaseControllerActivity)GroupUtil.this.activity).setGroupPos(this.pos);
      int i = GroupUtil.this.container.getChildCount();
      int j = 0;
      if (j >= i)
        return;
      View localView = GroupUtil.this.container.getChildAt(j);
      TextView localTextView;
      GroupUtil localGroupUtil;
      if ((localView instanceof TextView))
      {
        localTextView = (TextView)localView;
        localGroupUtil = GroupUtil.this;
        if (localTextView != paramView)
          break label191;
      }
      label191: for (boolean bool = true; ; bool = false)
      {
        localGroupUtil.setItemStyle(localTextView, bool);
        j++;
        break;
      }
    }
  }

  class GroupItemLongClickListener
    implements View.OnLongClickListener
  {
    int pos;

    GroupItemLongClickListener(int arg2)
    {
      int i;
      this.pos = i;
    }

    public boolean onLongClick(View paramView)
    {
      final TextView localTextView = (TextView)paramView;
      final Dialog localDialog = new Dialog(GroupUtil.this.activity, R.style.EditLightDialog);
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
          Toast.makeText(GroupUtil.this.activity, R.string.tips_light_group_name_empty, 1).show();
        }
      });
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.GroupUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */