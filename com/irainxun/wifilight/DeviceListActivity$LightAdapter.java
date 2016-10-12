package com.irainxun.wifilight;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import java.util.ArrayList;

class DeviceListActivity$LightAdapter extends BaseAdapter
{
  private LayoutInflater inflater;
  private int itemWidth = 0;
  private final int screenWidth;

  DeviceListActivity$LightAdapter(DeviceListActivity paramDeviceListActivity)
  {
    this.inflater = paramDeviceListActivity.getLayoutInflater();
    this.screenWidth = ActivityUtil.getScreenWidth(paramDeviceListActivity);
  }

  public int getCount()
  {
    return DeviceListActivity.devices.size();
  }

  public Device getItem(int paramInt)
  {
    return (Device)DeviceListActivity.devices.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ViewHolder localViewHolder;
    final Device localDevice;
    if (paramView == null)
    {
      paramView = this.inflater.inflate(R.layout.list_light_item, null);
      localViewHolder = new ViewHolder(paramView);
      paramView.setTag(localViewHolder);
      AbsListView.LayoutParams localLayoutParams = (AbsListView.LayoutParams)paramView.getLayoutParams();
      if (localLayoutParams == null)
        localLayoutParams = new AbsListView.LayoutParams(-2, -2);
      LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)localViewHolder.contentView.getLayoutParams();
      localLayoutParams2.width = this.screenWidth;
      localViewHolder.contentView.setLayoutParams(localLayoutParams2);
      if (this.itemWidth == 0)
      {
        ActivityUtil.measureView(localViewHolder.holderView);
        this.itemWidth = (this.screenWidth + localViewHolder.holderView.getMeasuredWidth());
      }
      localLayoutParams.width = this.itemWidth;
      paramView.setLayoutParams(localLayoutParams);
      localDevice = getItem(paramInt);
      Log.d("debug", "item.dispFlag = " + localDevice.dispFlag);
      if (localDevice.dispFlag != 0)
        break label335;
      localViewHolder.ivIcon.setImageBitmap(BitmapFactory.decodeFile(localDevice.iconPath));
      label195: localViewHolder.tvName.setText(localDevice.name);
      localDevice.mac = XlinkUtils.getHexBinString(XlinkUtils.stringToByteArray(localDevice.getMacAddress()), ":");
      localViewHolder.tvMac.setText(localDevice.mac);
      if (localDevice.status != 0)
        break label351;
      localViewHolder.ivStatus.setImageResource(R.drawable.offline);
    }
    while (true)
    {
      localViewHolder.btnEdit.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Intent localIntent = new Intent(DeviceListActivity.LightAdapter.this.this$0, DeviceEditActivity.class);
          localIntent.putExtra("light", localDevice);
          DeviceListActivity.LightAdapter.this.this$0.startActivityForResult(localIntent, 100);
        }
      });
      localViewHolder.btnDel.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Device localDevice = (Device)DeviceListActivity.devices.get(paramInt);
          String str1 = String.valueOf(localDevice.getMacAddress()) + "aa";
          if (MyApp.deviceService.wifiLight_isDeviceExists(str1))
            MyApp.deviceService.tab1_delDevice(str1);
          String str2 = String.valueOf(localDevice.getMacAddress()) + "00";
          if (MyApp.deviceService.wifiLight_isDeviceExists(str2))
            MyApp.deviceService.tab1_delDevice(str2);
          String str3 = String.valueOf(localDevice.getMacAddress()) + "01";
          MyApp.deviceService.zoneName_delDevice(str3);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str3))
            MyApp.deviceService.tab1_delDevice(str3);
          String str4 = String.valueOf(localDevice.getMacAddress()) + "02";
          MyApp.deviceService.zoneName_delDevice(str4);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str4))
            MyApp.deviceService.tab1_delDevice(str4);
          String str5 = String.valueOf(localDevice.getMacAddress()) + "03";
          MyApp.deviceService.zoneName_delDevice(str5);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str5))
            MyApp.deviceService.tab1_delDevice(str5);
          String str6 = String.valueOf(localDevice.getMacAddress()) + "04";
          MyApp.deviceService.zoneName_delDevice(str6);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str6))
            MyApp.deviceService.tab1_delDevice(str6);
          String str7 = String.valueOf(localDevice.getMacAddress()) + "05";
          MyApp.deviceService.zoneName_delDevice(str7);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str7))
            MyApp.deviceService.tab1_delDevice(str7);
          String str8 = String.valueOf(localDevice.getMacAddress()) + "06";
          MyApp.deviceService.zoneName_delDevice(str8);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str8))
            MyApp.deviceService.tab1_delDevice(str8);
          String str9 = String.valueOf(localDevice.getMacAddress()) + "07";
          MyApp.deviceService.zoneName_delDevice(str9);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str9))
            MyApp.deviceService.tab1_delDevice(str9);
          String str10 = String.valueOf(localDevice.getMacAddress()) + "08";
          MyApp.deviceService.zoneName_delDevice(str10);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str10))
            MyApp.deviceService.tab1_delDevice(str10);
          String str11 = String.valueOf(localDevice.getMacAddress()) + "09";
          MyApp.deviceService.zoneName_delDevice(str11);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str11))
            MyApp.deviceService.tab1_delDevice(str11);
          String str12 = String.valueOf(localDevice.getMacAddress()) + "10";
          MyApp.deviceService.zoneName_delDevice(str12);
          if (MyApp.deviceService.wifiLight_isDeviceExists(str12))
            MyApp.deviceService.tab1_delDevice(str12);
          MyApp.deviceService.delDevice(localDevice.getMacAddress());
          if (MyApp.deviceService.wifiLightTime_isDeviceExists(localDevice.getMacAddress()))
            MyApp.deviceService.wifiLightTime_delDevice(localDevice.getMacAddress());
          DeviceManage.getInstance().removeDevice(localDevice.getMacAddress());
          DeviceListActivity.devices.remove(localDevice);
          DeviceListActivity.LightAdapter.this.notifyDataSetChanged();
        }
      });
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localViewHolder.contentView.getLayoutParams();
      localLayoutParams1.leftMargin = 0;
      localViewHolder.contentView.setLayoutParams(localLayoutParams1);
      return paramView;
      localViewHolder = (ViewHolder)paramView.getTag();
      break;
      label335: localViewHolder.ivIcon.setImageResource(localDevice.iconRes);
      break label195;
      label351: if (localDevice.status == 1)
        localViewHolder.ivStatus.setImageResource(R.drawable.online);
      else if (localDevice.status == 2)
        localViewHolder.ivStatus.setImageResource(R.drawable.internet);
    }
  }

  public void updateLight(Device paramDevice)
  {
    int i = getCount();
    int j = -1;
    for (int k = 0; ; k++)
    {
      if (k >= i);
      while (true)
      {
        if (j != -1)
        {
          ((Device)DeviceListActivity.devices.get(j)).dispFlag = paramDevice.dispFlag;
          ((Device)DeviceListActivity.devices.get(j)).iconPath = paramDevice.iconPath;
          ((Device)DeviceListActivity.devices.get(j)).iconRes = paramDevice.iconRes;
          ((Device)DeviceListActivity.devices.get(j)).name = paramDevice.name;
          notifyDataSetChanged();
        }
        return;
        if (!getItem(k).getMacAddress().equals(paramDevice.getMacAddress()))
          break;
        j = k;
      }
    }
  }

  class ViewHolder
  {
    Button btnDel;
    Button btnEdit;
    View contentView;
    View holderView;
    ImageView ivIcon;
    ImageView ivStatus;
    TextView tvMac;
    TextView tvName;

    ViewHolder(View arg2)
    {
      Object localObject;
      this.contentView = localObject.findViewById(R.id.contentview);
      this.holderView = localObject.findViewById(R.id.holderview);
      this.ivIcon = ((ImageView)localObject.findViewById(R.id.iv_icon));
      this.tvName = ((TextView)localObject.findViewById(R.id.tv_name));
      this.tvMac = ((TextView)localObject.findViewById(R.id.tv_mac));
      this.ivStatus = ((ImageView)localObject.findViewById(R.id.iv_status));
      this.btnEdit = ((Button)localObject.findViewById(R.id.btn_edit));
      this.btnDel = ((Button)localObject.findViewById(R.id.btn_del));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.LightAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */