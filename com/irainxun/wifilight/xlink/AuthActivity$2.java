package com.irainxun.wifilight.xlink;

import android.widget.TextView;
import com.irainxun.wifilight.xlink.http.HttpManage.Error;
import com.irainxun.wifilight.xlink.http.HttpManage.ResultCallback;
import com.irainxun.wifilight.xlink.util.SharedPreferencesUtil;
import java.util.Map;
import org.apache.http.Header;

class AuthActivity$2 extends HttpManage.ResultCallback<Map<String, String>>
{
  AuthActivity$2(AuthActivity paramAuthActivity)
  {
  }

  public void onError(Header[] paramArrayOfHeader, HttpManage.Error paramError)
  {
    this.this$0.setAccess("登入失败,请确认账号已激活:" + paramError.getMsg());
    AuthActivity.access$0(this.this$0).setText("registerUser fail msg: " + paramError.getMsg());
  }

  public void onSuccess(int paramInt, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("authorize");
    String str2 = (String)paramMap.get("access_token");
    int i = Integer.parseInt((String)paramMap.get("user_id"));
    SharedPreferencesUtil.keepShared("appId", i);
    SharedPreferencesUtil.keepShared("authKey", str1);
    MyApp.getApp().setAccessToken(str2);
    MyApp.getApp().setAppid(i);
    MyApp.getApp().setAuth(str1);
    AuthActivity.access$1(this.this$0);
    this.this$0.finish();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.AuthActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */