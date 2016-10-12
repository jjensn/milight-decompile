package cn.jpush.android.service;

import android.os.Handler;
import android.os.Message;
import cn.jpush.android.api.m;

final class f extends Handler
{
  f(DownloadService paramDownloadService)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    m.b(this.a, paramMessage.what);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */