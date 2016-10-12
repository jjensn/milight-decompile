package cn.jpush.android.service;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cn.jpush.android.util.ac;
import cn.jpush.b.a.a.h;
import java.lang.ref.WeakReference;
import java.util.Map;

final class o extends Handler
{
  private static final String[] z;
  private WeakReference<n> a;

  static
  {
    String[] arrayOfString1 = new String[5];
    String str1 = "6\001-Ty\006\f<ImCBh[h\r\033hXfC\034-BmC\001=@eC\035-]|\006\034<\002";
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
          i3 = 9;
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
        str1 = "";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "+\016&He\006O%_nCBhXa\021\n)H@\007U";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        str1 = "1\n9Yl\020\033!Bn7\007:Ih\007";
        j = 3;
        arrayOfString2 = arrayOfString1;
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        j = 4;
        arrayOfString2 = arrayOfString1;
        str1 = "6\001 Mg\007\003-H)\016\034/\f$C";
        i = 3;
        break;
      case 3:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 99;
        break label96;
        i3 = 111;
        break label96;
        i3 = 72;
        break label96;
        i3 = 44;
        break label96;
        m = 0;
      }
    }
  }

  public o(Looper paramLooper, n paramn)
  {
    super(paramLooper);
    this.a = new WeakReference(paramn);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    new StringBuilder(z[2]).append(Thread.currentThread().getId());
    ac.a();
    n localn = (n)this.a.get();
    if (localn == null)
    {
      ac.b();
      return;
    }
    switch (paramMessage.what)
    {
    default:
      new StringBuilder(z[4]).append(paramMessage.what);
      ac.d();
      return;
    case 7404:
      Long localLong2 = (Long)paramMessage.obj;
      p localp2 = (p)n.a(localn).get(localLong2);
      if (localp2 == null)
      {
        ac.d();
        return;
      }
      n.a(localn, localp2);
      return;
    case 7403:
      Long localLong1 = (Long)paramMessage.obj;
      p localp1 = (p)n.a(localn).get(localLong1);
      if (localp1 == null)
      {
        ac.d();
        return;
      }
      n.b(localn, localp1);
      return;
    case 7401:
      if (paramMessage.obj == null)
      {
        ac.d(z[3], z[0]);
        return;
      }
      n.a(localn, (h)paramMessage.obj, paramMessage.arg1);
      return;
    case 7402:
      n.a(localn, paramMessage.getData().getLong(z[1]), paramMessage.obj);
      return;
    case 7405:
    }
    n.b(localn);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */