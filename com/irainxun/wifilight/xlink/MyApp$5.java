package com.irainxun.wifilight.xlink;

import com.irainxun.wifilight.xlink.http.HttpManage.Error;
import com.irainxun.wifilight.xlink.http.HttpManage.ResultCallback;
import org.apache.http.Header;

class MyApp$5 extends HttpManage.ResultCallback<String>
{
  MyApp$5(MyApp paramMyApp, String paramString1, String paramString2)
  {
  }

  public void onError(Header[] paramArrayOfHeader, HttpManage.Error paramError)
  {
    this.this$0.getAppid(this.val$uid, this.val$pwd);
  }

  public void onSuccess(int paramInt, String paramString)
  {
    this.this$0.getAppid(this.val$uid, this.val$pwd);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.MyApp.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */