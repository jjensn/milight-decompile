package cn.jpush.android.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import cn.jpush.android.util.ac;

final class e extends BroadcastReceiver
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "r\002\024 z\b^c*gB\007d)zB'D\tZ3#Y\016G)/N\007R\"7H\013";
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
          i3 = 79;
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
        str1 = "r\002\024 z\b^c*gB\007d)zB#N\016]3\"H\034F $^";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "d\005\026d\020`\030\021y*";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 19;
        break label96;
        i3 = 108;
        break label96;
        i3 = 112;
        break label96;
        i3 = 13;
        break label96;
        m = 0;
      }
    }
  }

  private e(d paramd)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((!d.i(this.a)) || (!d.a(this.a, d.a(this.a))))
      if (paramIntent.getIntExtra(z[2], 4) == 3)
      {
        WifiManager localWifiManager = d.e(this.a).b();
        boolean bool = false;
        if (localWifiManager != null)
          bool = localWifiManager.startScan();
        if (!bool);
      }
    String str2;
    do
    {
      do
      {
        do
          try
          {
            d.a(this.a, d.e(this.a).c());
            d.a(this.a).unregisterReceiver(d.j(this.a));
            if (!d.i(this.a))
              this.a.d();
            return;
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
            return;
          }
        while (d.d(this.a) != 2);
        String str1 = paramIntent.getAction();
        if (z[1].equals(str1))
        {
          d.c(this.a).removeMessages(5);
          if (System.currentTimeMillis() - d.k(this.a) > 4000L)
          {
            d.c(this.a).sendEmptyMessageDelayed(5, 4000L);
            return;
          }
          d.c(this.a).sendEmptyMessage(5);
          return;
        }
      }
      while (!d.l(this.a));
      str2 = paramIntent.getAction();
    }
    while ((!z[0].equals(str2)) || (paramIntent.getIntExtra(z[2], 4) != 2));
    this.a.d = true;
    d.a(this.a, false);
    ac.b();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */