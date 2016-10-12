package cn.jpush.android;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import cn.jpush.android.util.ac;

final class f
  implements ServiceConnection
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "\0057h6B\nt1B\n\007y-[\r7y\033D\0277s1C\0017h:IHt_0@\024;r:C\020\032}2H^";
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
          i3 = 45;
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
        str1 = "\0057h6B\nt1B\n\007y-[\r7y\034B\n:y<Y\00100n\0139l0C\001:h\021L\t1&";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 100;
        break label96;
        i3 = 84;
        break label96;
        i3 = 28;
        break label96;
        i3 = 95;
        break label96;
        m = 0;
      }
    }
  }

  f()
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    new StringBuilder(z[1]).append(paramComponentName.toString());
    ac.b();
    ac.c();
    e.o = c.a(paramIBinder);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    new StringBuilder(z[0]).append(paramComponentName.toString());
    ac.b();
    e.o = null;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */