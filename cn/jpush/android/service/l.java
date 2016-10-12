package cn.jpush.android.service;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;
import cn.jpush.android.a;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import java.util.List;

final class l
  implements Runnable
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[5];
    String str1 = ".$Ho\026\"Fk3okGo`6\007J{}!#g~'k\026.";
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
          i3 = 19;
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
        str1 = "6\"Fk3,$\\4";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "\022>Xf@'9]gp'";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        str1 = "\001*E)gb8_oa6kDz{'9\013~f1#\013}v0=Bmv1kO{|b?D.`'(^|z62\n";
        j = 3;
        arrayOfString2 = arrayOfString1;
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        j = 4;
        arrayOfString2 = arrayOfString1;
        str1 = "nkGo`6kGof,(Ckwb?Bcvx";
        i = 3;
        break;
      case 3:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 66;
        break label96;
        i3 = 75;
        break label96;
        i3 = 43;
        break label96;
        i3 = 14;
        break label96;
        m = 0;
      }
    }
  }

  l(PushService paramPushService, long paramLong)
  {
  }

  public final void run()
  {
    int i = 0;
    try
    {
      long l1 = System.currentTimeMillis() / 1000L;
      long l2 = a.w();
      new StringBuilder(z[1]).append(l1).append(z[4]).append(l2);
      ac.b();
      if ((-1L == l2) || (Math.abs(l1 - l2) > this.a))
      {
        localList = b.t(this.b.getApplicationContext());
        a.b(l1);
        if (localList != null)
          j = localList.size();
      }
      else
      {
        while (i < j)
        {
          localIntent = new Intent();
          localIntent.setComponent((ComponentName)localList.get(i));
          if (Build.VERSION.SDK_INT >= 12)
            localIntent.setFlags(32);
          this.b.startService(localIntent);
          i++;
          continue;
          new StringBuilder(z[0]).append(l1 - l2);
          ac.a();
        }
        return;
      }
    }
    catch (SecurityException localSecurityException)
    {
      ac.d(z[2], z[3]);
      localSecurityException.printStackTrace();
      return;
    }
    while (true)
    {
      List localList;
      Intent localIntent;
      int j = 0;
      i = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */