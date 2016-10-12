package cn.jpush.android.service;

import android.os.PowerManager.WakeLock;

public final class t
{
  private static t a = null;
  private PowerManager.WakeLock b = null;

  private t()
  {
  }

  public static t a()
  {
    if (a == null)
      a = new t();
    return a;
  }

  public final void a(PowerManager.WakeLock paramWakeLock)
  {
    this.b = paramWakeLock;
  }

  public final PowerManager.WakeLock b()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */