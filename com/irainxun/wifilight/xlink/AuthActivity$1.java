package com.irainxun.wifilight.xlink;

import android.widget.TextView;
import com.irainxun.wifilight.xlink.http.HttpManage.Error;
import com.irainxun.wifilight.xlink.http.HttpManage.ResultCallback;
import org.apache.http.Header;

class AuthActivity$1 extends HttpManage.ResultCallback<String>
{
  AuthActivity$1(AuthActivity paramAuthActivity, String paramString1, String paramString2)
  {
  }

  public void onError(Header[] paramArrayOfHeader, HttpManage.Error paramError)
  {
    this.this$0.getAppid(this.val$uid, this.val$pwd);
    this.this$0.setAccess("请输入正确的企业ID 邮箱和密码" + paramError.getMsg());
    AuthActivity.access$0(this.this$0).setText("registerUser fail msg: " + paramError.getMsg());
  }

  public void onSuccess(int paramInt, String paramString)
  {
    this.this$0.getAppid(this.val$uid, this.val$pwd);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.AuthActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */