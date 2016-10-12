package com.irainxun.wifilight.controller;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class BaseControllerActivity$CAdapter extends BaseAdapter
{
  private int cH;
  private int[] cRes = { R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.c11, R.drawable.c12, R.drawable.c13, R.drawable.c14 };
  private int cW;
  private int selectCH;
  private int selectCW;

  BaseControllerActivity$CAdapter(BaseControllerActivity paramBaseControllerActivity)
  {
    Resources localResources = paramBaseControllerActivity.getResources();
    this.cW = localResources.getDimensionPixelSize(R.dimen.c_w);
    this.cH = localResources.getDimensionPixelSize(R.dimen.c_h);
    this.selectCW = localResources.getDimensionPixelSize(R.dimen.c_select_w);
    this.selectCH = localResources.getDimensionPixelSize(R.dimen.c_select_h);
  }

  public int getCount()
  {
    return this.cRes.length;
  }

  public Integer getItem(int paramInt)
  {
    return Integer.valueOf(this.cRes[paramInt]);
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
      localViewHolder = new ViewHolder();
      ImageView localImageView = new ImageView(this.this$0);
      localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      localViewHolder.ivC = localImageView;
      paramView = localImageView;
      paramView.setTag(localViewHolder);
    }
    while (true)
    {
      localViewHolder.ivC.setImageResource(this.cRes[paramInt]);
      if (BaseControllerActivity.access$6(this.this$0) != paramInt)
        break;
      localViewHolder.ivC.setLayoutParams(new Gallery.LayoutParams(this.selectCW, this.selectCH));
      return paramView;
      localViewHolder = (ViewHolder)paramView.getTag();
    }
    localViewHolder.ivC.setLayoutParams(new Gallery.LayoutParams(this.cW, this.cH));
    return paramView;
  }

  public void setSelectItem(int paramInt)
  {
    if (BaseControllerActivity.access$6(this.this$0) != paramInt)
    {
      BaseControllerActivity.access$7(this.this$0, paramInt);
      notifyDataSetChanged();
    }
  }

  class ViewHolder
  {
    ImageView ivC;

    ViewHolder()
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.BaseControllerActivity.CAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */