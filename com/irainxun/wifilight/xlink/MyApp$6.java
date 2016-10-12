package com.irainxun.wifilight.xlink;

import android.util.Log;
import com.irainxun.wifilight.xlink.http.HttpManage.Error;
import com.irainxun.wifilight.xlink.http.HttpManage.ResultCallback;
import com.irainxun.wifilight.xlink.util.SharedPreferencesUtil;
import io.xlink.wifi.sdk.XlinkAgent;
import java.util.Map;
import org.apache.http.Header;

class MyApp$6 extends HttpManage.ResultCallback<Map<String, String>>
{
  MyApp$6(MyApp paramMyApp)
  {
  }

  public void onError(Header[] paramArrayOfHeader, HttpManage.Error paramError)
  {
    Log.d("debug", "getAppid error!!!!!!!!!");
  }

  public void onSuccess(int paramInt, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("authorize");
    String str2 = (String)paramMap.get("access_token");
    int i = Integer.parseInt((String)paramMap.get("user_id"));
    SharedPreferencesUtil.keepShared("appId", i);
    SharedPreferencesUtil.keepShared("authKey", str1);
    MyApp.getApp().setAccessToken(str2);
    if (!XlinkAgent.getInstance().isConnectedLocal())
      XlinkAgent.getInstance().start();
    XlinkAgent.getInstance().isConnectedOuterNet();
    MyApp.getApp().setAppid(i);
    MyApp.getApp().setAuth(str1);
    Log.d("debug", "getAppid right!!!!!!!!");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */