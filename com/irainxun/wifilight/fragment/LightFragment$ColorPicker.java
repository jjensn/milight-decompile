package com.irainxun.wifilight.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.wifi_light;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;

class LightFragment$ColorPicker
{
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      byte[] arrayOfByte = new byte[12];
      if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint1) && (LightFragment.ColorPicker.this.ivPoint1.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint1.getDrawable() instanceof GradientDrawable)))
      {
        MyApp.PlalyKeySound();
        arrayOfByte[0] = 63;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.this.this$0)[0];
        arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[0]);
        arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[0];
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        LightFragment.access$34(LightFragment.ColorPicker.this.this$0, 0xFF & LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[0]);
        LightFragment.access$35(LightFragment.ColorPicker.this.this$0).setProgress(LightFragment.access$1(LightFragment.ColorPicker.this.this$0));
        LightFragment.access$36(LightFragment.ColorPicker.this.this$0).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[0]));
      }
      do
      {
        return;
        if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint2) && (LightFragment.ColorPicker.this.ivPoint2.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint2.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.this.this$0)[1];
          arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[1]);
          arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[1];
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.access$34(LightFragment.ColorPicker.this.this$0, 0xFF & LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[1]);
          LightFragment.access$35(LightFragment.ColorPicker.this.this$0).setProgress(LightFragment.access$1(LightFragment.ColorPicker.this.this$0));
          LightFragment.access$36(LightFragment.ColorPicker.this.this$0).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[1]));
          return;
        }
        if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint3) && (LightFragment.ColorPicker.this.ivPoint3.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint3.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.this.this$0)[2];
          arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[2]);
          arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[2];
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.access$34(LightFragment.ColorPicker.this.this$0, 0xFF & LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[2]);
          LightFragment.access$35(LightFragment.ColorPicker.this.this$0).setProgress(LightFragment.access$1(LightFragment.ColorPicker.this.this$0));
          LightFragment.access$36(LightFragment.ColorPicker.this.this$0).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[2]));
          return;
        }
        if ((paramAnonymousView == LightFragment.ColorPicker.this.ivPoint4) && (LightFragment.ColorPicker.this.ivPoint4.getDrawable() != null) && ((LightFragment.ColorPicker.this.ivPoint4.getDrawable() instanceof GradientDrawable)))
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 63;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = 0;
          arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.this.this$0)[3];
          arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[3]);
          arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[3];
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = 1;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          LightFragment.access$34(LightFragment.ColorPicker.this.this$0, 0xFF & LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[3]);
          LightFragment.access$35(LightFragment.ColorPicker.this.this$0).setProgress(LightFragment.access$1(LightFragment.ColorPicker.this.this$0));
          LightFragment.access$36(LightFragment.ColorPicker.this.this$0).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[3]));
          return;
        }
      }
      while ((paramAnonymousView != LightFragment.ColorPicker.this.ivPoint5) || (LightFragment.ColorPicker.this.ivPoint5.getDrawable() == null) || (!(LightFragment.ColorPicker.this.ivPoint5.getDrawable() instanceof GradientDrawable)));
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 63;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = 0;
      arrayOfByte[4] = LightFragment.access$31(LightFragment.ColorPicker.this.this$0)[4];
      arrayOfByte[5] = (byte)(LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[4]);
      arrayOfByte[6] = (byte)LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[4];
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = 1;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
      LightFragment.access$34(LightFragment.ColorPicker.this.this$0, 0xFF & LightFragment.access$33(LightFragment.ColorPicker.this.this$0)[4]);
      LightFragment.access$35(LightFragment.ColorPicker.this.this$0).setProgress(LightFragment.access$1(LightFragment.ColorPicker.this.this$0));
      LightFragment.access$36(LightFragment.ColorPicker.this.this$0).setText("RGB:" + (0xFF & LightFragment.access$9(LightFragment.ColorPicker.this.this$0) - LightFragment.access$32(LightFragment.ColorPicker.this.this$0)[4]));
    }
  };
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
      if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint1)
        LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint1);
      while (true)
      {
        return true;
        if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint2)
          LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint2);
        else if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint3)
          LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint3);
        else if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint4)
          LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint4);
        else if (paramAnonymousView == LightFragment.ColorPicker.this.ivPoint5)
          LightFragment.ColorPicker.this.showDelPop(LightFragment.ColorPicker.this.ivPoint5);
      }
    }
  };

  public LightFragment$ColorPicker(LightFragment paramLightFragment, Context paramContext, View paramView)
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
    this.ivPoint1.setOnClickListener(this.clickListener);
    this.ivPoint2.setOnClickListener(this.clickListener);
    this.ivPoint3.setOnClickListener(this.clickListener);
    this.ivPoint4.setOnClickListener(this.clickListener);
    this.ivPoint5.setOnClickListener(this.clickListener);
  }

  public void SetColorCir(int paramInt1, int paramInt2)
  {
    ImageView[] arrayOfImageView = new ImageView[5];
    arrayOfImageView[0] = this.ivPoint1;
    arrayOfImageView[1] = this.ivPoint2;
    arrayOfImageView[2] = this.ivPoint3;
    arrayOfImageView[3] = this.ivPoint4;
    arrayOfImageView[4] = this.ivPoint5;
    ImageView localImageView = arrayOfImageView[paramInt2];
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setColor(paramInt1);
    localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
    localImageView.setImageDrawable(localGradientDrawable);
  }

  public void addColorPoint(int paramInt)
  {
    wifi_light localwifi_light = new wifi_light();
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(0L);
    ImageView[] arrayOfImageView;
    int i;
    label124: int k;
    ImageView localImageView;
    label142: GradientDrawable localGradientDrawable;
    if (MyApp.deviceService.wifiLight_isDeviceExists(str))
    {
      Log.d("debug", "tab1 database ture");
      localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
      arrayOfImageView = new ImageView[5];
      arrayOfImageView[0] = this.ivPoint1;
      arrayOfImageView[1] = this.ivPoint2;
      arrayOfImageView[2] = this.ivPoint3;
      arrayOfImageView[3] = this.ivPoint4;
      arrayOfImageView[4] = this.ivPoint5;
      i = 0;
      int j = arrayOfImageView.length;
      k = 0;
      localImageView = null;
      if (i < j)
        break label486;
      if (localImageView != null)
      {
        localGradientDrawable = new GradientDrawable();
        if (!LightFragment.access$37(this.this$0))
          break label529;
        localGradientDrawable.setColor(-1);
        label172: localGradientDrawable.setCornerRadius(this.context.getResources().getDimension(R.dimen.color_point_radius));
        localImageView.setImageDrawable(localGradientDrawable);
        if (!LightFragment.access$37(this.this$0))
          break label538;
        LightFragment.access$31(this.this$0)[k] = 1;
        label217: LightFragment.access$32(this.this$0)[k] = LightFragment.access$12(this.this$0);
        LightFragment.access$33(this.this$0)[k] = LightFragment.access$1(this.this$0);
        if (k != 0)
          break label552;
        localwifi_light.device1 = LightFragment.access$31(this.this$0)[k];
        localwifi_light.wifilight_ang1 = LightFragment.access$32(this.this$0)[k];
        localwifi_light.wifilight_b1 = LightFragment.access$33(this.this$0)[k];
      }
    }
    while (true)
    {
      MyApp.deviceService.wifiLight_edit(localwifi_light);
      return;
      localwifi_light.mac = str;
      localwifi_light.device1 = "0";
      localwifi_light.device2 = "0";
      localwifi_light.device3 = "0";
      localwifi_light.device4 = "0";
      localwifi_light.device5 = "0";
      localwifi_light.wifilight_ang1 = "0";
      localwifi_light.wifilight_ang2 = "0";
      localwifi_light.wifilight_ang3 = "0";
      localwifi_light.wifilight_ang4 = "0";
      localwifi_light.wifilight_ang5 = "0";
      localwifi_light.wifilight_b1 = "0";
      localwifi_light.wifilight_b2 = "0";
      localwifi_light.wifilight_b3 = "0";
      localwifi_light.wifilight_b4 = "0";
      localwifi_light.wifilight_b5 = "0";
      MyApp.deviceService.wifiLight_addDevice(localwifi_light);
      Log.d("debug", "tab1 database false");
      Log.d("debug", "tab1_device" + localwifi_light.toString());
      break;
      label486: Drawable localDrawable = arrayOfImageView[i].getDrawable();
      if ((localDrawable == null) || (!(localDrawable instanceof GradientDrawable)))
      {
        localImageView = arrayOfImageView[i];
        k = i;
        break label142;
      }
      i++;
      break label124;
      label529: localGradientDrawable.setColor(paramInt);
      break label172;
      label538: LightFragment.access$31(this.this$0)[k] = 0;
      break label217;
      label552: if (k == 1)
      {
        localwifi_light.device2 = LightFragment.access$31(this.this$0)[k];
        localwifi_light.wifilight_ang2 = LightFragment.access$32(this.this$0)[k];
        localwifi_light.wifilight_b2 = LightFragment.access$33(this.this$0)[k];
      }
      else if (k == 2)
      {
        localwifi_light.device3 = LightFragment.access$31(this.this$0)[k];
        localwifi_light.wifilight_ang3 = LightFragment.access$32(this.this$0)[k];
        localwifi_light.wifilight_b3 = LightFragment.access$33(this.this$0)[k];
      }
      else if (k == 3)
      {
        localwifi_light.device4 = LightFragment.access$31(this.this$0)[k];
        localwifi_light.wifilight_ang4 = LightFragment.access$32(this.this$0)[k];
        localwifi_light.wifilight_b4 = LightFragment.access$33(this.this$0)[k];
      }
      else if (k == 4)
      {
        localwifi_light.device5 = LightFragment.access$31(this.this$0)[k];
        localwifi_light.wifilight_ang5 = LightFragment.access$32(this.this$0)[k];
        localwifi_light.wifilight_b5 = LightFragment.access$33(this.this$0)[k];
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
        DecimalFormat localDecimalFormat = new DecimalFormat("00");
        String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(0L);
        wifi_light localwifi_light;
        if (MyApp.deviceService.wifiLight_isDeviceExists(str))
        {
          new wifi_light();
          localwifi_light = MyApp.deviceService.tab1_getMyDevice(str);
          if (paramImageView != LightFragment.ColorPicker.this.ivPoint1)
            break label125;
          localwifi_light.device1 = "0";
          localwifi_light.wifilight_ang1 = "0";
          localwifi_light.wifilight_b1 = "0";
        }
        while (true)
        {
          MyApp.deviceService.wifiLight_edit(localwifi_light);
          paramImageView.setImageResource(R.drawable.transparent);
          localPopupWindow.dismiss();
          return;
          label125: if (paramImageView == LightFragment.ColorPicker.this.ivPoint2)
          {
            localwifi_light.device2 = "0";
            localwifi_light.wifilight_ang2 = "0";
            localwifi_light.wifilight_b2 = "0";
          }
          else if (paramImageView == LightFragment.ColorPicker.this.ivPoint3)
          {
            localwifi_light.device3 = "0";
            localwifi_light.wifilight_ang3 = "0";
            localwifi_light.wifilight_b3 = "0";
          }
          else if (paramImageView == LightFragment.ColorPicker.this.ivPoint4)
          {
            localwifi_light.device4 = "0";
            localwifi_light.wifilight_ang4 = "0";
            localwifi_light.wifilight_b4 = "0";
          }
          else if (paramImageView == LightFragment.ColorPicker.this.ivPoint5)
          {
            localwifi_light.device5 = "0";
            localwifi_light.wifilight_ang5 = "0";
            localwifi_light.wifilight_b5 = "0";
          }
        }
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
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.ColorPicker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */