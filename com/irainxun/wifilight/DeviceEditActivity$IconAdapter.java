package com.irainxun.wifilight;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class DeviceEditActivity$IconAdapter extends BaseAdapter
{
  private Integer[] iconRes;
  private LayoutInflater inflater;

  DeviceEditActivity$IconAdapter(DeviceEditActivity paramDeviceEditActivity)
  {
    Integer[] arrayOfInteger = new Integer[6];
    arrayOfInteger[0] = Integer.valueOf(R.drawable.ic_light);
    arrayOfInteger[1] = Integer.valueOf(R.drawable.ic_canting);
    arrayOfInteger[2] = Integer.valueOf(R.drawable.ic_huiyishi);
    arrayOfInteger[3] = Integer.valueOf(R.drawable.ic_jia);
    arrayOfInteger[4] = Integer.valueOf(R.drawable.ic_kafei);
    arrayOfInteger[5] = Integer.valueOf(R.drawable.ic_shangdian);
    this.iconRes = arrayOfInteger;
    this.inflater = paramDeviceEditActivity.getLayoutInflater();
  }

  public int getCount()
  {
    return this.iconRes.length;
  }

  public Integer getItem(int paramInt)
  {
    return this.iconRes[paramInt];
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ViewHolder localViewHolder;
    if (paramView == null)
    {
      paramView = this.inflater.inflate(R.layout.list_icon_item, null);
      localViewHolder = new ViewHolder(paramView);
      paramView.setTag(localViewHolder);
    }
    while (true)
    {
      int i = getItem(paramInt).intValue();
      localViewHolder.ivIcon.setImageResource(i);
      return paramView;
      localViewHolder = (ViewHolder)paramView.getTag();
    }
  }

  class ViewHolder
  {
    ImageView ivIcon;

    ViewHolder(View arg2)
    {
      Object localObject;
      this.ivIcon = ((ImageView)localObject.findViewById(R.id.iv_icon));
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceEditActivity.IconAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */