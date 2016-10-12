package com.irainxun.wifilight;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.database.zoneName;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class LinkUnlinkActivity extends Activity
{
  private Button btnLink;
  private Button btnUnlink;
  private LinearLayout groupLayout;
  private GroupUtil groupUtil;
  private ImageView ivBack;
  private View.OnClickListener onClickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      byte[] arrayOfByte = new byte[12];
      if (paramAnonymousView == LinkUnlinkActivity.this.ivBack)
        LinkUnlinkActivity.this.finish();
      do
      {
        return;
        if (paramAnonymousView == LinkUnlinkActivity.this.btnLink)
        {
          MyApp.PlalyKeySound();
          arrayOfByte[0] = 61;
          arrayOfByte[1] = MyApp.PasswordByte[0];
          arrayOfByte[2] = MyApp.PasswordByte[1];
          arrayOfByte[3] = MyApp.rain_remoteID;
          arrayOfByte[4] = 0;
          arrayOfByte[5] = 0;
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = 0;
          arrayOfByte[9] = MyApp.rain_remo;
          arrayOfByte[10] = 0;
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          return;
        }
      }
      while (paramAnonymousView != LinkUnlinkActivity.this.btnUnlink);
      MyApp.PlalyKeySound();
      arrayOfByte[0] = 62;
      arrayOfByte[1] = MyApp.PasswordByte[0];
      arrayOfByte[2] = MyApp.PasswordByte[1];
      arrayOfByte[3] = MyApp.rain_remoteID;
      arrayOfByte[4] = 0;
      arrayOfByte[5] = 0;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = MyApp.rain_remo;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 0;
      MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    }
  };
  private TextView tvTitle;

  public LinkUnlinkActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_link_unlink);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.groupLayout = ((LinearLayout)findViewById(R.id.list));
    this.btnLink = ((Button)findViewById(R.id.btn_link));
    this.btnUnlink = ((Button)findViewById(R.id.btn_unlink));
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.link_unlink);
    this.ivBack.setOnClickListener(this.onClickListener);
    this.btnLink.setOnClickListener(this.onClickListener);
    this.btnUnlink.setOnClickListener(this.onClickListener);
    MyApp.SettingPasswordContext(this);
    if ((MyApp.rain_remoteID == 5) || (MyApp.rain_remoteID == 4) || (MyApp.rain_remoteID == 2) || (MyApp.rain_remoteID == 9) || (MyApp.rain_remoteID == 6))
      return;
    Log.d("debug", "MyApp.rain_remoteID = " + MyApp.rain_remoteID);
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
      this.groupUtil = new GroupUtil(this, this.groupLayout, localArrayList);
      this.groupUtil.initGroup(0);
      return;
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
 * Qualified Name:     com.irainxun.wifilight.LinkUnlinkActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */