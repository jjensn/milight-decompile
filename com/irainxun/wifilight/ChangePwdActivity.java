package com.irainxun.wifilight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.MyApp.OnDeviceMessage;
import com.irainxun.wifilight.xlink.bean.Device;
import io.xlink.wifi.sdk.XDevice;

public class ChangePwdActivity extends Activity
  implements MyApp.OnDeviceMessage
{
  private static Device light;
  private LinearLayout OldPassword_Disp;
  private final String TAG = getClass().getSimpleName();
  private Button btnOk;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == ChangePwdActivity.this.ivBack)
        ChangePwdActivity.this.finish();
      while (paramAnonymousView != ChangePwdActivity.this.btnOk)
        return;
      if ((ChangePwdActivity.this.etOldPwd.length() == 0) || (ChangePwdActivity.this.etNewPwd.length() == 0))
      {
        new Toast(ChangePwdActivity.this);
        Toast localToast = Toast.makeText(ChangePwdActivity.this, "ERROR! Name is NULL", 1);
        localToast.setGravity(17, 0, 0);
        localToast.show();
      }
      if ((ChangePwdActivity.this.etOldPwd.length() == 4) && (ChangePwdActivity.this.etNewPwd.length() == 4))
      {
        ChangePwdActivity.this.login = true;
        byte[] arrayOfByte = { 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        Log.d("debug", "light.mac = " + ChangePwdActivity.light.getMacAddress());
        if (MyApp.sendData(arrayOfByte, ChangePwdActivity.light));
        Log.d("debug", "etOldPwd = " + ChangePwdActivity.this.etOldPwd.getText().toString());
        Log.d("debug", "database password = " + MyApp.deviceService.getDevicePassword(ChangePwdActivity.light.getMacAddress()));
      }
      Log.d("debug", "btnOk");
    }
  };
  private EditText etNewPwd;
  private EditText etOldPwd;
  private ImageView ivBack;
  private boolean login;
  private MyApp mApplication;
  private TextView tvTitle;

  public ChangePwdActivity()
  {
  }

  public void Aiyunxun_onRecvPipeData(Device paramDevice, byte[] paramArrayOfByte)
  {
    Log.d("debug", "modify Aiyunxun_onRecvPipeData = " + Conversion.BytetohexString(paramArrayOfByte, paramArrayOfByte.length));
    if (paramArrayOfByte.length == 12)
      switch (paramArrayOfByte[0])
      {
      default:
      case 52:
      }
    String str;
    do
    {
      return;
      byte[] arrayOfByte1 = new byte[2];
      arrayOfByte1[0] = paramArrayOfByte[1];
      arrayOfByte1[1] = paramArrayOfByte[2];
      str = Conversion.bytesToHexString(arrayOfByte1);
      Log.d("debug", "modify disp getPassowrd = " + str);
      Log.d("debug", "modify disp cpassword = " + MyApp.deviceService.getDevicePassword(paramDevice.getMacAddress()));
      Log.d("debug", "modifydisp password = " + MyApp.deviceService.getDeviceCPassword(paramDevice.getMacAddress()));
    }
    while ((!paramDevice.getMacAddress().equals(light.getMacAddress())) || (!this.login));
    if (this.etOldPwd.getText().toString().equals(str))
    {
      MyApp.deviceService.editcPassword(light.getMacAddress(), this.etNewPwd.getText().toString());
      MyApp.deviceService.editcCPassword(light.getMacAddress(), this.etNewPwd.getText().toString());
      new Toast(this);
      Toast localToast2 = Toast.makeText(this, "Set Password OK!", 1);
      localToast2.setGravity(17, 0, 0);
      localToast2.show();
      byte[] arrayOfByte2 = new byte[2];
      Conversion.hexStringtoByte(this.etNewPwd.getText().toString(), arrayOfByte2);
      byte[] arrayOfByte3 = new byte[12];
      arrayOfByte3[0] = 53;
      arrayOfByte3[1] = arrayOfByte2[0];
      arrayOfByte3[2] = arrayOfByte2[1];
      arrayOfByte3[3] = 0;
      arrayOfByte3[4] = 0;
      arrayOfByte3[5] = 0;
      arrayOfByte3[6] = 0;
      arrayOfByte3[7] = 0;
      arrayOfByte3[8] = 0;
      arrayOfByte3[9] = 0;
      arrayOfByte3[10] = 0;
      arrayOfByte3[11] = 0;
      Log.d("debug", "modify light.mac = " + light.getMacAddress());
      if (MyApp.sendData(arrayOfByte3, light))
        finish();
      this.login = false;
      Log.d("debug", "modify get disp  cpassword = " + MyApp.deviceService.getDevicePassword(paramDevice.getMacAddress()));
      Log.d("debug", "modify get disp  password = " + MyApp.deviceService.getDeviceCPassword(paramDevice.getMacAddress()));
      return;
    }
    new Toast(this);
    Toast localToast1 = Toast.makeText(this, "old Password error!", 1);
    localToast1.setGravity(17, 0, 0);
    localToast1.show();
  }

  public void Aiyuxun_DeviceNetStatus(XDevice paramXDevice, int paramInt)
  {
  }

  public void Aiyuxun_onDeviceStateChanged(Device paramDevice, int paramInt)
  {
  }

  public void Aiyuxun_onRecvPipeSyncData(Device paramDevice, byte[] paramArrayOfByte)
  {
    Log.d("debug", "modify Aiyuxun_onRecvPipeSyncData = " + Conversion.BytetohexString(paramArrayOfByte, paramArrayOfByte.length));
    if (paramArrayOfByte.length == 12)
      switch (paramArrayOfByte[0])
      {
      default:
      case 52:
      }
    String str;
    do
    {
      return;
      byte[] arrayOfByte1 = new byte[2];
      arrayOfByte1[0] = paramArrayOfByte[1];
      arrayOfByte1[1] = paramArrayOfByte[2];
      str = Conversion.bytesToHexString(arrayOfByte1);
      Log.d("debug", "modify disp getPassowrd = " + str);
      Log.d("debug", "modify disp cpassword = " + MyApp.deviceService.getDevicePassword(paramDevice.getMacAddress()));
      Log.d("debug", "modifydisp password = " + MyApp.deviceService.getDeviceCPassword(paramDevice.getMacAddress()));
    }
    while ((!paramDevice.getMacAddress().equals(light.getMacAddress())) || (!this.login));
    if (this.etOldPwd.getText().toString().equals(str))
    {
      MyApp.deviceService.editcPassword(light.getMacAddress(), this.etNewPwd.getText().toString());
      MyApp.deviceService.editcCPassword(light.getMacAddress(), this.etNewPwd.getText().toString());
      new Toast(this);
      Toast localToast2 = Toast.makeText(this, "Set Password OK!", 1);
      localToast2.setGravity(17, 0, 0);
      localToast2.show();
      byte[] arrayOfByte2 = new byte[2];
      Conversion.hexStringtoByte(this.etNewPwd.getText().toString(), arrayOfByte2);
      byte[] arrayOfByte3 = new byte[12];
      arrayOfByte3[0] = 53;
      arrayOfByte3[1] = arrayOfByte2[0];
      arrayOfByte3[2] = arrayOfByte2[1];
      arrayOfByte3[3] = 0;
      arrayOfByte3[4] = 0;
      arrayOfByte3[5] = 0;
      arrayOfByte3[6] = 0;
      arrayOfByte3[7] = 0;
      arrayOfByte3[8] = 0;
      arrayOfByte3[9] = 0;
      arrayOfByte3[10] = 0;
      arrayOfByte3[11] = 0;
      Log.d("debug", "modify light.mac = " + light.getMacAddress());
      if (MyApp.sendData(arrayOfByte3, light))
        finish();
      this.login = false;
      Log.d("debug", "modify get disp  cpassword = " + MyApp.deviceService.getDevicePassword(paramDevice.getMacAddress()));
      Log.d("debug", "modify get disp  password = " + MyApp.deviceService.getDeviceCPassword(paramDevice.getMacAddress()));
      return;
    }
    new Toast(this);
    Toast localToast1 = Toast.makeText(this, "old Password error!", 1);
    localToast1.setGravity(17, 0, 0);
    localToast1.show();
  }

  public void Aiyuxun_onSendData(XDevice paramXDevice, int paramInt)
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_change_pwd);
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.etOldPwd = ((EditText)findViewById(R.id.et_old_pwd));
    this.etNewPwd = ((EditText)findViewById(R.id.et_new_pwd));
    this.btnOk = ((Button)findViewById(R.id.btn_ok));
    this.OldPassword_Disp = ((LinearLayout)findViewById(R.id.layout_old_pwd));
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.change_pwd);
    this.btnOk.setOnClickListener(this.clickListener);
    this.ivBack.setOnClickListener(this.clickListener);
    light = (Device)getIntent().getSerializableExtra("light");
    if ("0000".equals(MyApp.deviceService.getDevicePassword(light.getMacAddress())))
    {
      this.OldPassword_Disp.setVisibility(4);
      this.etOldPwd.setText("0000");
      return;
    }
    this.OldPassword_Disp.setVisibility(0);
  }

  protected void onPause()
  {
    super.onPause();
    Log.d("debug", "onPause");
    this.mApplication.cleanDeviceMessage(this);
  }

  protected void onResume()
  {
    super.onResume();
    Log.d("debug", "onResume");
    this.mApplication = ((MyApp)getApplication());
    this.mApplication.setDeviceMessage(this);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ChangePwdActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */