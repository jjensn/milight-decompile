package com.irainxun.wifilight.xlink;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.http.HttpManage;
import com.irainxun.wifilight.xlink.http.HttpManage.Error;
import com.irainxun.wifilight.xlink.http.HttpManage.ResultCallback;
import com.irainxun.wifilight.xlink.util.SharedPreferencesUtil;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.util.MyLog;
import java.util.Map;
import org.apache.http.Header;

public class AuthActivity extends BaseActivity
{
  private final String TAG = "AuthActivity";
  private int appid;
  private String authKey;
  private String id;
  private boolean isRun;
  private TextView tips_text;
  TelephonyManager tm;

  public AuthActivity()
  {
  }

  private void openDeviceListActivity()
  {
    if (this.isRun)
    {
      if (!XlinkAgent.getInstance().isConnectedLocal())
        XlinkAgent.getInstance().start();
      XlinkAgent.getInstance().isConnectedOuterNet();
      MyApp.getApp().setAppid(this.appid);
      MyApp.getApp().setAuth(this.authKey);
      this.isRun = false;
      finish();
    }
  }

  public void Log(String paramString)
  {
    MyLog.e("AuthActivity", paramString);
  }

  public void getAppid(String paramString1, String paramString2)
  {
    HttpManage.getInstance().login(paramString1, paramString2, new HttpManage.ResultCallback()
    {
      public void onError(Header[] paramAnonymousArrayOfHeader, HttpManage.Error paramAnonymousError)
      {
        AuthActivity.this.setAccess("登入失败,请确认账号已激活:" + paramAnonymousError.getMsg());
        AuthActivity.this.tips_text.setText("registerUser fail msg: " + paramAnonymousError.getMsg());
      }

      public void onSuccess(int paramAnonymousInt, Map<String, String> paramAnonymousMap)
      {
        String str1 = (String)paramAnonymousMap.get("authorize");
        String str2 = (String)paramAnonymousMap.get("access_token");
        int i = Integer.parseInt((String)paramAnonymousMap.get("user_id"));
        SharedPreferencesUtil.keepShared("appId", i);
        SharedPreferencesUtil.keepShared("authKey", str1);
        MyApp.getApp().setAccessToken(str2);
        MyApp.getApp().setAppid(i);
        MyApp.getApp().setAuth(str1);
        AuthActivity.this.openDeviceListActivity();
        AuthActivity.this.finish();
      }
    });
  }

  public void initWidget()
  {
  }

  public boolean isHaveAppid()
  {
    return (this.appid != 0) && (!this.authKey.equals(""));
  }

  public void onClickListener(View paramView)
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    MyApp.getApp().auth = true;
    this.isRun = true;
    setContentView(R.layout.auth_activity);
    initWidget();
    XlinkAgent.getInstance().addXlinkListener(MyApp.getApp());
    this.tm = ((TelephonyManager)getSystemService("phone"));
    this.tips_text = ((TextView)findViewById(R.id.tips));
    SharedPreferencesUtil.keepShared("EMAIL_ID", "1216063709@qq.com");
    SharedPreferencesUtil.keepShared("PASSWD_ID", "123456789");
    this.appid = SharedPreferencesUtil.queryIntValue("appId").intValue();
    this.authKey = SharedPreferencesUtil.queryValue("authKey", "");
    if (isHaveAppid())
    {
      openDeviceListActivity();
      return;
    }
    registerUser();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    Log("---------onDestroy ");
  }

  protected void onPause()
  {
    super.onPause();
    Log("---------onPause ");
  }

  protected void onRestart()
  {
    super.onRestart();
    Log("---------onRestart ");
  }

  protected void onResume()
  {
    super.onResume();
    Log("---------onResume ");
  }

  public void registerUser()
  {
    this.id = XlinkUtils.MD5(this.tm.getDeviceId());
    setTips("正在自动注册用户...");
    registerUserByMail(SharedPreferencesUtil.queryValue("EMAIL_ID"), this.id, SharedPreferencesUtil.queryValue("PASSWD_ID"));
  }

  public void registerUserByMail(final String paramString1, String paramString2, final String paramString3)
  {
    HttpManage.getInstance().registerUserByMail(paramString1, paramString2, paramString3, new HttpManage.ResultCallback()
    {
      public void onError(Header[] paramAnonymousArrayOfHeader, HttpManage.Error paramAnonymousError)
      {
        AuthActivity.this.getAppid(paramString1, paramString3);
        AuthActivity.this.setAccess("请输入正确的企业ID 邮箱和密码" + paramAnonymousError.getMsg());
        AuthActivity.this.tips_text.setText("registerUser fail msg: " + paramAnonymousError.getMsg());
      }

      public void onSuccess(int paramAnonymousInt, String paramAnonymousString)
      {
        AuthActivity.this.getAppid(paramString1, paramString3);
      }
    });
  }

  void setAccess(String paramString)
  {
    View localView = LayoutInflater.from(this).inflate(R.layout.set_accessid, null);
    ((TextView)localView.findViewById(R.id.set_accessid_title)).setText(paramString);
    final EditText localEditText1 = (EditText)localView.findViewById(R.id.edit_company_id);
    final EditText localEditText2 = (EditText)localView.findViewById(R.id.edit_email);
    final EditText localEditText3 = (EditText)localView.findViewById(R.id.edit_passwd);
    localEditText1.setText(HttpManage.COMPANY_ID);
    localEditText3.setText(SharedPreferencesUtil.queryValue("PASSWD_ID"));
    localEditText2.setText(SharedPreferencesUtil.queryValue("EMAIL_ID"));
    new AlertDialog.Builder(this).setView(localView).setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        String str1 = localEditText1.getText().toString().trim();
        String str2 = localEditText2.getText().toString().trim();
        String str3 = localEditText3.getText().toString().trim();
        HttpManage.COMPANY_ID = str1;
        SharedPreferencesUtil.keepShared("COMPANY_ID", str1);
        SharedPreferencesUtil.keepShared("EMAIL_ID", str2);
        SharedPreferencesUtil.keepShared("PASSWD_ID", str3);
        AuthActivity.this.registerUser();
      }
    }).setNeutralButton("退出", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AuthActivity.this.finish();
      }
    }).setCancelable(false).show();
  }

  public void setTips(String paramString)
  {
    this.tips_text.setText(paramString);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.AuthActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */