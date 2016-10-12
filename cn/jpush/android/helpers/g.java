package cn.jpush.android.helpers;

import android.content.Context;
import android.text.TextUtils;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import cn.jpush.android.util.s;

final class g extends Thread
{
  g(String paramString1, Context paramContext, String paramString2)
  {
  }

  public final void run()
  {
    String str = null;
    int i = 0;
    do
    {
      j = 0;
      if (i >= 4)
        break;
      i++;
      str = s.a(this.a, 5, 8000L);
    }
    while (s.a(str));
    int j = 1;
    if ((j != 0) && (!TextUtils.isEmpty(str)))
    {
      f.a(this.b, str);
      return;
    }
    i.a(this.c, 1021, b.b(this.b, this.a), this.b);
    i.a(this.c, 996, this.b);
    ac.b();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */