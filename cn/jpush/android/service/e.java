package cn.jpush.android.service;

import android.app.NotificationManager;
import android.os.Handler;
import cn.jpush.android.data.c;
import cn.jpush.android.data.s;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.ac;
import java.util.concurrent.ConcurrentLinkedQueue;

final class e
  implements d
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = ".9\027*{q";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 68;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "#k.\0350n'`";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "#k>\0353a'5\023 j/`";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 15;
        break label96;
        i3 = 75;
        break label96;
        i3 = 90;
        break label96;
        i3 = 114;
        break label96;
        m = 0;
      }
    }
  }

  e(DownloadService paramDownloadService, boolean paramBoolean, int paramInt)
  {
  }

  public final void a(int paramInt)
  {
    DownloadService.c(this.c).cancel(this.b);
    if (b.a(paramInt))
    {
      DownloadService.a(this.c).v = true;
      cn.jpush.android.helpers.i.a(DownloadService.a(this.c).c, 1011, this.c);
      try
      {
        str = ((cn.jpush.android.data.i)DownloadService.a(this.c)).K;
        cn.jpush.android.helpers.i.a(DownloadService.a(this.c).c, 1022, cn.jpush.android.util.b.b(this.c, str), this.c);
        DownloadService.a(this.c).w = true;
        DownloadService.a(this.c, this.b, DownloadService.a(this.c), paramInt);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          String str = "";
      }
    }
  }

  public final void a(long paramLong1, long paramLong2)
  {
    int i = (int)(100.0F * ((float)paramLong1 / (float)paramLong2));
    new StringBuilder(z[0]).append(i).append(z[2]).append(paramLong1).append(z[1]).append(paramLong2);
    ac.b();
    if (!this.a)
      DownloadService.a(this.c, DownloadService.a(this.c), this.b, paramLong1, paramLong2);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    DownloadService.a(this.c).x = true;
    DownloadService.a.remove(DownloadService.a(this.c));
    int i = 1001;
    if (DownloadService.a(this.c).a())
    {
      cn.jpush.android.data.i locali = (cn.jpush.android.data.i)DownloadService.a(this.c);
      locali.P = paramString;
      locali.Q = false;
      if (f.a(locali.G, locali.H, this.c))
      {
        i = 1003;
        locali.Q = true;
      }
    }
    while (true)
    {
      for (int j = i; ; j = 1004)
      {
        if (paramBoolean)
          j = 1013;
        cn.jpush.android.helpers.i.a(DownloadService.a(this.c).c, j, this.c);
        if (!DownloadService.a(this.c).e())
          DownloadService.b(this.c).sendEmptyMessageDelayed(this.b, 500L);
        DownloadService.a(this.c).w = true;
        DownloadService.a(this.c, DownloadService.a(this.c));
        return;
        if (!DownloadService.a(this.c).b())
          break;
        ((s)DownloadService.a(this.c)).I = paramString;
      }
      if (DownloadService.a(this.c).e())
        DownloadService.a(this.c).C = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */