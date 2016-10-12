package cn.jpush.android.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.jpush.android.util.ac;

final class c extends Handler
{
  private d b = null;

  public c(b paramb, Looper paramLooper, d paramd)
  {
    super(paramLooper);
    this.b = paramd;
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (this.a.a)
    {
      ac.a();
      return;
    }
    if (this.b != null)
      this.b.a(b.a(this.a), b.b(this.a));
    b.c(this.a).sendEmptyMessageDelayed(0, 2000L);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */