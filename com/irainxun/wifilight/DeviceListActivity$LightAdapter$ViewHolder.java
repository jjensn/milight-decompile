package com.irainxun.wifilight;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

class DeviceListActivity$LightAdapter$ViewHolder
{
  Button btnDel;
  Button btnEdit;
  View contentView;
  View holderView;
  ImageView ivIcon;
  ImageView ivStatus;
  TextView tvMac;
  TextView tvName;

  DeviceListActivity$LightAdapter$ViewHolder(DeviceListActivity.LightAdapter paramLightAdapter, View paramView)
  {
    this.contentView = paramView.findViewById(R.id.contentview);
    this.holderView = paramView.findViewById(R.id.holderview);
    this.ivIcon = ((ImageView)paramView.findViewById(R.id.iv_icon));
    this.tvName = ((TextView)paramView.findViewById(R.id.tv_name));
    this.tvMac = ((TextView)paramView.findViewById(R.id.tv_mac));
    this.ivStatus = ((ImageView)paramView.findViewById(R.id.iv_status));
    this.btnEdit = ((Button)paramView.findViewById(R.id.btn_edit));
    this.btnDel = ((Button)paramView.findViewById(R.id.btn_del));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity.LightAdapter.ViewHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */