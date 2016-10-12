package cn.jpush.android.ui;

import android.os.Handler;
import android.os.Message;
import cn.jpush.android.data.c;

final class f extends Handler
{
  f(PushActivity paramPushActivity)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    c localc = (c)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
      return;
    case 1:
      this.a.setRequestedOrientation(1);
      PushActivity.a(this.a, localc);
      return;
    case 2:
    }
    this.a.b();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */