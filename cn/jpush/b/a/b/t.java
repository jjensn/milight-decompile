package cn.jpush.b.a.b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import cn.jpush.a.a.af;
import cn.jpush.a.a.ao;
import cn.jpush.a.a.ap;
import cn.jpush.a.a.aq;
import cn.jpush.a.a.ar;
import cn.jpush.a.a.ba;
import cn.jpush.a.a.bb;
import cn.jpush.android.a;
import cn.jpush.android.helpers.j;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import cn.jpush.b.a.a.c;
import cn.jpush.b.a.a.d;
import cn.jpush.b.a.a.f;
import cn.jpush.b.a.a.i;
import java.util.Iterator;
import java.util.List;

public final class t
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[9];
    int i = 0;
    String str1 = "a\"\016{X 2im`*0jmZ";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 8;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "\004o9lmF;\025~2";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "i,(sgFoq:{M!8_~M!(XiK$|7(Z&8 ";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "A\"\003hm[?3t{M";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\004o.sl\022";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "K!rpx]<44aEa=tlZ 5~&I,(sgFa\025WWz\n\017JGf\034\031";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "i,(sgFoq:`I!8vma\"\016{X 2im\bb|sek\"8 ";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "i,(sgFoq:{M!8Y`I;\021io{62yJI,7:%\b=5~2";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "k'=nE[(|HmK*5lmLoq:e[(\025~2";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 40;
        continue;
        i3 = 79;
        continue;
        i3 = 92;
        continue;
        i3 = 26;
      }
    }
  }

  public static void a(Context paramContext, Handler paramHandler, i parami, byte[] paramArrayOfByte)
  {
    d locald = (d)parami;
    p localp = locald.a();
    if (localp == null)
    {
      ac.e();
      return;
    }
    int i = localp.a;
    long l = locald.f().a().longValue();
    ac.b(z[0], z[6] + i + z[4] + l);
    switch (i)
    {
    default:
    case 1:
    case 2:
    case 13:
    case 14:
    }
    while (true)
    {
      b.a(paramContext, z[5], z[3], paramArrayOfByte);
      return;
      af localaf = localp.f;
      if ((localaf != null) && (localaf.d() == 0))
      {
        ac.b();
        a.a(true);
        a.p();
      }
      else
      {
        ac.b();
        a.a(false);
        continue;
        if (localp.f.d() == 0)
        {
          ac.b();
          a.a(false);
          j.c(paramContext);
        }
        else
        {
          ac.e();
          continue;
          ba localba = (ba)localp.e;
          new StringBuilder(z[2]).append(l).append(z[1]).append(localba.d());
          ac.b();
          localp.e = ba.t().a(localba.d()).a(localba.f()).b(localba.h()).c(localba.j()).a();
          Message.obtain(paramHandler, 7501, new c(l, localp)).sendToTarget();
          continue;
          a(paramHandler, l, localp);
        }
      }
    }
  }

  private static void a(Handler paramHandler, long paramLong, p paramp)
  {
    new StringBuilder(z[7]).append(paramLong);
    ac.b();
    aq localaq = (aq)paramp.e;
    ar localar = aq.e();
    Iterator localIterator = localaq.b().iterator();
    while (localIterator.hasNext())
    {
      ao localao = (ao)localIterator.next();
      new StringBuilder(z[8]).append(localao.h());
      ac.a();
      localar.a(ao.r().c(localao.h()).a(localao.j()).a(localao.d()).b(localao.f()).a());
    }
    paramp.e = localar.a();
    Message.obtain(paramHandler, 7502, new c(paramLong, paramp)).sendToTarget();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */