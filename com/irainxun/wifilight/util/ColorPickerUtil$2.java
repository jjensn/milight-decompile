package com.irainxun.wifilight.util;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;

class ColorPickerUtil$2
  implements View.OnClickListener
{
  ColorPickerUtil$2(ColorPickerUtil paramColorPickerUtil, ImageView paramImageView, PopupWindow paramPopupWindow)
  {
  }

  public void onClick(View paramView)
  {
    this.val$view.setImageResource(R.drawable.transparent);
    this.val$popupWindow.dismiss();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.ColorPickerUtil.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */