package com.irainxun.wifilight.fragment;

import android.app.Fragment;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FUT567KelvinFragment extends Fragment
{
  private static final int buttonKeyEvent = 4353;
  private static final int delayLongTime = 400;
  private static final int delayTime = 200;
  private final String TAG = getClass().getSimpleName();
  private Button btnAll;
  private ImageView btnBottom;
  private ImageView btnLeft;
  private Button btnNightLight;
  private Button btnOff;
  private Button btnOn;
  private ImageView btnRight;
  private ImageView btnTop;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == FUT567KelvinFragment.this.btnAll)
      {
        MyApp.PlalyKeySound();
        FUT567KelvinFragment.this.groupUtil.selectAll(true);
        MyApp.rain_remo = 0;
      }
    }
  };
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private View kc;
  private int longKeyMode;
  Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      byte[] arrayOfByte = new byte[12];
      switch (paramAnonymousMessage.what)
      {
      default:
      case 4353:
      }
      while (true)
      {
        super.handleMessage(paramAnonymousMessage);
        return;
        if ((0x1 & FUT567KelvinFragment.this.longKeyMode) == 1)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 7;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x2 & FUT567KelvinFragment.this.longKeyMode) == 2)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 8;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x4 & FUT567KelvinFragment.this.longKeyMode) == 4)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 6;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x8 & FUT567KelvinFragment.this.longKeyMode) == 8)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 3;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x10 & FUT567KelvinFragment.this.longKeyMode) == 16)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 4;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x20 & FUT567KelvinFragment.this.longKeyMode) == 32)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 1;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x40 & FUT567KelvinFragment.this.longKeyMode) == 64)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 2;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 200L);
        }
        else if ((0x80 & FUT567KelvinFragment.this.longKeyMode) == 128)
        {
          arrayOfByte[0] = 49;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = -127;
          arrayOfByte[5] = 5;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT567KelvinFragment localFUT567KelvinFragment = FUT567KelvinFragment.this;
          localFUT567KelvinFragment.longKeyMode = (0x80 | localFUT567KelvinFragment.longKeyMode);
          FUT567KelvinFragment.this.myHandler.removeMessages(4353);
          FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        }
      }
    }
  };
  private View.OnTouchListener ontouchlistener = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      byte[] arrayOfByte = new byte[12];
      (int)paramAnonymousMotionEvent.getX();
      (int)paramAnonymousMotionEvent.getY();
      switch (paramAnonymousMotionEvent.getAction())
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
      do
      {
        do
        {
          return true;
          MyApp.PlalyKeySound();
          if (paramAnonymousView == FUT567KelvinFragment.this.btnOn)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 7;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment16 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment16.longKeyMode = (0x1 | localFUT567KelvinFragment16.longKeyMode);
            FUT567KelvinFragment.this.myHandler.removeMessages(4353);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT567KelvinFragment.this.btnOff)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 8;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment15 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment15.longKeyMode = (0x2 | localFUT567KelvinFragment15.longKeyMode);
            FUT567KelvinFragment.this.myHandler.removeMessages(4353);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT567KelvinFragment.this.btnNightLight)
          {
            paramAnonymousView.setBackgroundResource(R.drawable.k_btn_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 6;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment14 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment14.longKeyMode = (0x4 | localFUT567KelvinFragment14.longKeyMode);
            FUT567KelvinFragment.this.myHandler.removeMessages(4353);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT567KelvinFragment.this.btnLeft)
          {
            FUT567KelvinFragment.this.btnLeft.setImageResource(R.drawable.c567_k_l_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 3;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment13 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment13.longKeyMode = (0x8 | localFUT567KelvinFragment13.longKeyMode);
            FUT567KelvinFragment.this.myHandler.removeMessages(4353);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT567KelvinFragment.this.btnRight)
          {
            FUT567KelvinFragment.this.btnRight.setImageResource(R.drawable.c567_k_r_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 4;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment12 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment12.longKeyMode = (0x10 | localFUT567KelvinFragment12.longKeyMode);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT567KelvinFragment.this.btnTop)
          {
            FUT567KelvinFragment.this.btnTop.setImageResource(R.drawable.c567_k_t_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 1;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment11 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment11.longKeyMode = (0x20 | localFUT567KelvinFragment11.longKeyMode);
            FUT567KelvinFragment.this.myHandler.removeMessages(4353);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
          if (paramAnonymousView == FUT567KelvinFragment.this.btnBottom)
          {
            FUT567KelvinFragment.this.btnBottom.setImageResource(R.drawable.c567_k_b_press);
            arrayOfByte[0] = 49;
            arrayOfByte[1] = MyApp.PasswordByte[0];
            arrayOfByte[2] = MyApp.PasswordByte[1];
            arrayOfByte[3] = MyApp.rain_remoteID;
            arrayOfByte[4] = 1;
            arrayOfByte[5] = 2;
            arrayOfByte[6] = 0;
            arrayOfByte[7] = 0;
            arrayOfByte[8] = 0;
            arrayOfByte[9] = MyApp.rain_remo;
            arrayOfByte[10] = 0;
            arrayOfByte[11] = 0;
            MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
            FUT567KelvinFragment localFUT567KelvinFragment10 = FUT567KelvinFragment.this;
            localFUT567KelvinFragment10.longKeyMode = (0x40 | localFUT567KelvinFragment10.longKeyMode);
            FUT567KelvinFragment.this.myHandler.removeMessages(4353);
            FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
            return true;
          }
        }
        while (paramAnonymousView != FUT567KelvinFragment.this.tv_test);
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        arrayOfByte[4] = 1;
        arrayOfByte[5] = 5;
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = MyApp.rain_remo;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        FUT567KelvinFragment localFUT567KelvinFragment9 = FUT567KelvinFragment.this;
        localFUT567KelvinFragment9.longKeyMode = (0x80 | localFUT567KelvinFragment9.longKeyMode);
        FUT567KelvinFragment.this.myHandler.removeMessages(4353);
        FUT567KelvinFragment.this.myHandler.sendEmptyMessageDelayed(4353, 400L);
        return true;
        if (paramAnonymousView == FUT567KelvinFragment.this.btnOn)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_on_nor);
          FUT567KelvinFragment localFUT567KelvinFragment8 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment8.longKeyMode = (0xFFFFFFFE & localFUT567KelvinFragment8.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT567KelvinFragment.this.btnOff)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_off_nor);
          FUT567KelvinFragment localFUT567KelvinFragment7 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment7.longKeyMode = (0xFFFFFFFD & localFUT567KelvinFragment7.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT567KelvinFragment.this.btnNightLight)
        {
          paramAnonymousView.setBackgroundResource(R.drawable.k_btn_nor);
          FUT567KelvinFragment localFUT567KelvinFragment6 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment6.longKeyMode = (0xFFFFFFFB & localFUT567KelvinFragment6.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT567KelvinFragment.this.btnLeft)
        {
          FUT567KelvinFragment.this.btnLeft.setImageResource(R.drawable.c567_k_l_nor);
          FUT567KelvinFragment localFUT567KelvinFragment5 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment5.longKeyMode = (0xFFFFFFF7 & localFUT567KelvinFragment5.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT567KelvinFragment.this.btnRight)
        {
          FUT567KelvinFragment.this.btnRight.setImageResource(R.drawable.c567_k_r_nor);
          FUT567KelvinFragment localFUT567KelvinFragment4 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment4.longKeyMode = (0xFFFFFFEF & localFUT567KelvinFragment4.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT567KelvinFragment.this.btnTop)
        {
          FUT567KelvinFragment.this.btnTop.setImageResource(R.drawable.c567_k_t_nor);
          FUT567KelvinFragment localFUT567KelvinFragment3 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment3.longKeyMode = (0xFFFFFFDF & localFUT567KelvinFragment3.longKeyMode);
          return true;
        }
        if (paramAnonymousView == FUT567KelvinFragment.this.btnBottom)
        {
          FUT567KelvinFragment localFUT567KelvinFragment2 = FUT567KelvinFragment.this;
          localFUT567KelvinFragment2.longKeyMode = (0xFFFFFFBF & localFUT567KelvinFragment2.longKeyMode);
          FUT567KelvinFragment.this.btnBottom.setImageResource(R.drawable.c567_k_b_nor);
          return true;
        }
      }
      while (paramAnonymousView != FUT567KelvinFragment.this.tv_test);
      FUT567KelvinFragment localFUT567KelvinFragment1 = FUT567KelvinFragment.this;
      localFUT567KelvinFragment1.longKeyMode = (0xFFFFFF7F & localFUT567KelvinFragment1.longKeyMode);
      return true;
    }
  };
  private TextView tv_test;

  public FUT567KelvinFragment()
  {
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(R.layout.fragment_fut567_kelvin, null);
    this.groupLayout = ((LinearLayout)localView.findViewById(R.id.group));
    this.kc = localView.findViewById(R.id.k_c);
    Drawable localDrawable = getResources().getDrawable(R.drawable.c567_k_bg);
    int i = getResources().getDimensionPixelSize(R.dimen.k_c_padding);
    int j = getResources().getDimensionPixelSize(R.dimen.dp1);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.kc.getLayoutParams();
    localLayoutParams.width = localDrawable.getIntrinsicWidth();
    localLayoutParams.height = localDrawable.getIntrinsicHeight();
    this.kc.setLayoutParams(localLayoutParams);
    this.kc.setPadding(i, i, i + j, i);
    this.kc.setBackground(localDrawable);
    this.btnLeft = ((ImageView)localView.findViewById(R.id.iv_l));
    this.btnTop = ((ImageView)localView.findViewById(R.id.iv_t));
    this.btnRight = ((ImageView)localView.findViewById(R.id.iv_r));
    this.btnBottom = ((ImageView)localView.findViewById(R.id.iv_b));
    this.btnAll = ((Button)localView.findViewById(R.id.btn_all));
    this.btnNightLight = ((Button)localView.findViewById(R.id.btn_night_light));
    this.btnOn = ((Button)localView.findViewById(R.id.btn_on));
    this.btnOff = ((Button)localView.findViewById(R.id.btn_off));
    this.tv_test = ((TextView)localView.findViewById(R.id.tv_test));
    this.btnLeft.setOnTouchListener(this.ontouchlistener);
    this.btnTop.setOnTouchListener(this.ontouchlistener);
    this.btnRight.setOnTouchListener(this.ontouchlistener);
    this.btnBottom.setOnTouchListener(this.ontouchlistener);
    this.btnAll.setOnClickListener(this.clickListener);
    this.btnNightLight.setOnTouchListener(this.ontouchlistener);
    this.btnOn.setOnTouchListener(this.ontouchlistener);
    this.btnOff.setOnTouchListener(this.ontouchlistener);
    DecimalFormat localDecimalFormat = new DecimalFormat("00");
    String str = String.valueOf(MyApp.DeviceControl.getMacAddress()) + localDecimalFormat.format(MyApp.rain_remoteID);
    Log.d("debug", "decimalFormat = " + localDecimalFormat.format(MyApp.rain_remoteID));
    Log.d("debug", "macid = " + str);
    ArrayList localArrayList = new ArrayList();
    if (MyApp.deviceService.zoneName_isDeviceExists(str))
    {
      zoneName localzoneName2 = MyApp.deviceService.zoneName_getMyDevice(str);
      localArrayList.add(localzoneName2.zoneNameone);
      localArrayList.add(localzoneName2.zoneNametwo);
      localArrayList.add(localzoneName2.zoneNamethree);
      localArrayList.add(localzoneName2.zoneNamefour);
    }
    while (true)
    {
      this.groupUtil = new GroupUtil(getActivity(), this.groupLayout, localArrayList);
      this.groupUtil.initGroup(0);
      return localView;
      zoneName localzoneName1 = new zoneName();
      localzoneName1.mac = str;
      localzoneName1.zoneNameone = "Zone1";
      localzoneName1.zoneNametwo = "Zone2";
      localzoneName1.zoneNamethree = "Zone3";
      localzoneName1.zoneNamefour = "Zone4";
      localArrayList.add(localzoneName1.zoneNameone);
      localArrayList.add(localzoneName1.zoneNametwo);
      localArrayList.add(localzoneName1.zoneNamethree);
      localArrayList.add(localzoneName1.zoneNamefour);
      MyApp.deviceService.zoneName_addDevice(localzoneName1.mac, localzoneName1.zoneNameone, localzoneName1.zoneNametwo, localzoneName1.zoneNamethree, localzoneName1.zoneNamefour);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT567KelvinFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */