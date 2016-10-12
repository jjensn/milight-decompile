package com.irainxun.wifilight;

import android.app.Activity;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SmartSettingActivity extends Activity
{
  private final String TAG = getClass().getSimpleName();
  private Button btnSetting;
  private CheckBox cbShowPwd;
  private CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener()
  {
    public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
    {
      if (paramAnonymousCompoundButton == SmartSettingActivity.this.cbShowPwd)
      {
        if (!paramAnonymousBoolean)
          break label49;
        SmartSettingActivity.this.etWiFiPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
      }
      while (true)
      {
        SmartSettingActivity.this.etWiFiPwd.setSelection(SmartSettingActivity.this.etWiFiPwd.length());
        return;
        label49: SmartSettingActivity.this.etWiFiPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
      }
    }
  };
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == SmartSettingActivity.this.ivBack)
        SmartSettingActivity.this.finish();
    }
  };
  private EditText etWiFiName;
  private EditText etWiFiPwd;
  private ImageView ivBack;
  private TextView tvTitle;

  public SmartSettingActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_smart_setting);
    WifiInfo localWifiInfo = ((WifiManager)getSystemService("wifi")).getConnectionInfo();
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.etWiFiName = ((EditText)findViewById(R.id.et_wifi_name));
    this.etWiFiPwd = ((EditText)findViewById(R.id.et_wifi_pwd));
    this.cbShowPwd = ((CheckBox)findViewById(R.id.cb_show_pwd));
    this.btnSetting = ((Button)findViewById(R.id.btn_setting));
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.smart_setting);
    if (localWifiInfo != null)
    {
      String str1 = localWifiInfo.getSSID();
      if (!TextUtils.isEmpty(str1))
      {
        String str2 = str1.replace("\"", "");
        this.etWiFiName.setText(str2);
        this.etWiFiPwd.requestFocus();
      }
    }
    this.ivBack.setOnClickListener(this.clickListener);
    this.cbShowPwd.setOnCheckedChangeListener(this.checkedChangeListener);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SmartSettingActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */