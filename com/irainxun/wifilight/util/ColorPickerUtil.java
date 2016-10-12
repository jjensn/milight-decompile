package com.irainxun.wifilight.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class ColorPickerUtil
{
  private Context context;
  private LayoutInflater inflater;
  private ImageView ivPoint1;
  private ImageView ivPoint2;
  private ImageView ivPoint3;
  private ImageView ivPoint4;
  private ImageView ivPoint5;
  private View.OnLongClickListener longClickListener = new View.OnLongClickListener()
  {
    public boolean onLongClick(View paramAnonymousView)
    {
      if (paramAnonymousView == ColorPickerUtil.this.ivPoint1)
        ColorPickerUtil.this.showDelPop(ColorPickerUtil.this.ivPoint1);
      while (true)
      {
        return true;
        if (paramAnonymousView == ColorPickerUtil.this.ivPoint2)
          ColorPickerUtil.this.showDelPop(ColorPickerUtil.this.ivPoint2);
        else if (paramAnonymousView == ColorPickerUtil.this.ivPoint3)
          ColorPickerUtil.this.showDelPop(ColorPickerUtil.this.ivPoint3);
        else if (paramAnonymousView == ColorPickerUtil.this.ivPoint4)
          ColorPickerUtil.this.showDelPop(ColorPickerUtil.this.ivPoint4);
        else if (paramAnonymousView == ColorPickerUtil.this.ivPoint5)
          ColorPickerUtil.this.showDelPop(ColorPickerUtil.this.ivPoint5);
      }
    }
  };

  public ColorPickerUtil(Context paramContext, View paramView)
  {
    this.context = paramContext;
    this.inflater = LayoutInflater.from(paramContext);
    this.ivPoint1 = ((ImageView)paramView.findViewById(R.id.iv_point1));
    this.ivPoint2 = ((ImageView)paramView.findViewById(R.id.iv_point2));
    this.ivPoint3 = ((ImageView)paramView.findViewById(R.id.iv_point3));
    this.ivPoint4 = ((ImageView)paramView.findViewById(R.id.iv_point4));
    this.ivPoint5 = ((ImageView)paramView.findViewById(R.id.iv_point5));
    this.ivPoint1.setOnLongClickListener(this.longClickListener);
    this.ivPoint2.setOnLongClickListener(this.longClickListener);
    this.ivPoint3.setOnLongClickListener(this.longClickListener);
    this.ivPoint4.setOnLongClickListener(this.longClickListener);
    this.ivPoint5.setOnLongClickListener(this.longClickListener);
  }

  public void addColorPoint(int paramInt)
  {
    ImageView[] arrayOfImageView = new ImageView[5];
    arrayOfImageView[0] = this.ivPoint1;
    arrayOfImageView[1] = this.ivPoint2;
    arrayOfImageView[2] = this.ivPoint3;
    arrayOfImageView[3] = this.ivPoint4;
    arrayOfImageView[4] = this.ivPoint5;
    for (int i = 0; ; i++)
    {
      int j = arrayOfImageView.length;
      ImageView localImageView = null;
      if (i >= j);
      while (true)
      {
        if (localImageView != null)
        {
          GradientDrawable localGradientDrawable = new GradientDrawable();
          localGradientDrawable.setColor(paramInt);
          localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
          localImageView.setImageDrawable(localGradientDrawable);
        }
        return;
        Drawable localDrawable = arrayOfImageView[i].getDrawable();
        if ((localDrawable != null) && ((localDrawable instanceof GradientDrawable)))
          break;
        localImageView = arrayOfImageView[i];
      }
    }
  }

  public void showDelPop(final ImageView paramImageView)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
      return;
    View localView = this.inflater.inflate(R.layout.pop_del, null);
    final PopupWindow localPopupWindow = new PopupWindow(localView, -2, -2, true);
    localView.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramImageView.setImageResource(R.drawable.transparent);
        localPopupWindow.dismiss();
      }
    });
    localPopupWindow.setBackgroundDrawable(this.context.getResources().getDrawable(R.drawable.transparent));
    int[] arrayOfInt = new int[2];
    paramImageView.getLocationOnScreen(arrayOfInt);
    ActivityUtil.measureView(localView);
    int i = localView.getMeasuredWidth();
    int j = localView.getMeasuredHeight();
    localPopupWindow.showAtLocation(paramImageView, 0, arrayOfInt[0] - i / 2 + paramImageView.getWidth() / 2, arrayOfInt[1] - j);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.ColorPickerUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */