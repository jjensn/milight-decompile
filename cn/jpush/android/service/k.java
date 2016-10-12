package cn.jpush.android.service;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import cn.jpush.android.helpers.ConnectingHelper;
import cn.jpush.android.helpers.h;
import cn.jpush.android.helpers.j;
import cn.jpush.android.util.ac;
import cn.jpush.b.a.a.d;
import cn.jpush.b.a.a.i;
import cn.jpush.b.a.b.p;
import cn.jpush.b.a.b.t;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class k
  implements Runnable
{
  public static AtomicLong a;
  public static AtomicBoolean b;
  private static final String[] z;
  private Context c;
  private Handler d;
  private boolean e;
  private volatile boolean f = false;

  static
  {
    Object localObject1 = new String[20];
    int i = 0;
    String str1 = "5i=\027w\004x1\034'\002t=\027n\006t:\\'>~)Re\002t?\031']1,\027sJ";
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
        i3 = 7;
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
        str1 = ">t*\005h\002z7\034`3}7\027i\004";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "1r*\033h\0361sRh\036]1\025n\036W?\033k\025u~_'\002t-\002D\037u;H";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "%5\034h\007~3d\0331,\027v\005t-\006']1=\037cJ";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\"t=\027n\006t:Re\te;\001']12\027iJ";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "2c;\023lPc;\021b\031g7\034`Ps'Rp\021*!s\037a~_'\023~0\034b\023e7\035iJ";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "1r*\033h\0361sRh\036]1\025`\025u\027\034']1=\035i\036t=\006n\037d";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "1r*\033h\0361sRu\025r;\033q\025u\035\035j\035p0\026']1=\037cJ";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "%6\023i\024};\026'\002t-\002h\036b;Rd\037|3\023i\0241sR";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "\\1=\035i\036t=\006n\037d";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\\1.\031`J";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = ">t*\005h\002z~\036n\003e;\034n\036vp\\)";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\035R1\034i\025r*\033h\03617\001'\002t-\027sPe1R7Pf6\027iP;\006p\037c5Rk\031b*\027i\0319\\'2c;\023lP1\005)";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "3c;\023s\025u~\021h\036;\021s\031~0R*P";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\"t*\007u\03611\024'3}1\001bP{0\033'\023~0\034b\023e7\035iP<~";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "1r*\033h\0361sRd\034~-\027D\0370\027d\004x1\034']1=\035i\036t=\006n\037d";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        z = localObject2;
        a = new AtomicLong(0L);
        b = new AtomicBoolean(false);
        return;
        i3 = 112;
        continue;
        i3 = 17;
        continue;
        i3 = 94;
        continue;
        i3 = 114;
      }
    }
  }

  public k(Context paramContext, Handler paramHandler, boolean paramBoolean)
  {
    this.c = paramContext;
    this.d = paramHandler;
    this.e = false;
  }

  private void c()
  {
    ac.b(z[1], z[18] + a.get());
    if (0L != a.get())
      try
      {
        b.set(true);
        a.set(PushProtocol.Close(a.get()));
        ac.b(z[1], z[17] + a.get());
        b.set(false);
        ConnectingHelper.sendConnectionToHandler(Message.obtain(this.d, 7301), a.get());
        return;
      }
      catch (Exception localException)
      {
        while (true)
          ac.h();
      }
    ac.b();
  }

  public final void a()
  {
    ac.b(z[1], z[19] + a.get());
    this.f = true;
    PushProtocol.Stop(a.get());
  }

  public final boolean b()
  {
    return this.f;
  }

  public final void run()
  {
    ac.c(z[1], z[4] + Thread.currentThread().getId());
    a.set(PushProtocol.InitConn());
    new StringBuilder(z[15]).append(a.get());
    ac.b();
    SisInfo localSisInfo = ConnectingHelper.sendSis(this.c);
    if (localSisInfo != null)
      localSisInfo.configure();
    if (this.f)
    {
      ac.d();
      c();
      return;
    }
    if (!ConnectingHelper.openConnection(this, this.c, a.get(), localSisInfo))
    {
      c();
      return;
    }
    if ((!cn.jpush.android.a.y()) && (!ConnectingHelper.register(this.c, a.get(), this.e)))
    {
      if (86400 == cn.jpush.android.a.q())
      {
        ac.a();
        this.d.sendEmptyMessageDelayed(1001, 100L);
      }
      while (true)
      {
        c();
        return;
        ac.a();
      }
    }
    int i = ConnectingHelper.login(this.c, a.get());
    if (i < 0)
    {
      c();
      return;
    }
    if (i > 0)
    {
      long l3 = a.get();
      new StringBuilder(z[2]).append(i);
      ac.a();
      ConnectingHelper.sendConnectionToHandler(Message.obtain(this.d, 7306), l3);
      c();
      return;
    }
    byte[] arrayOfByte1;
    if (0L != a.get())
    {
      long l1 = a.get();
      ac.a(z[1], z[8] + l1);
      ConnectingHelper.sendConnectionToHandler(Message.obtain(this.d, 7304), l1);
      arrayOfByte1 = new byte[8192];
    }
    while (!this.f)
    {
      ac.b(z[1], z[13]);
      int j = PushProtocol.RecvPush(a.get(), arrayOfByte1, 86400);
      ac.b(z[1], z[6] + j + z[11] + a.get() + z[12] + cn.jpush.android.e.c);
      if (0L == a.get())
      {
        ac.d(z[1], z[14]);
        return;
        ac.d();
        return;
      }
      if (j > 0)
      {
        Context localContext = this.c;
        byte[] arrayOfByte2 = new byte[j];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, j);
        i locali = cn.jpush.b.a.a.e.a(arrayOfByte2);
        if (locali == null)
        {
          ac.e();
        }
        else
        {
          ac.b(z[1], z[9] + locali.e());
          ac.a(z[1], locali.toString());
          label596: boolean bool;
          switch (locali.e())
          {
          default:
            bool = false;
          case 3:
          case 100:
          case 19:
          case 25:
          }
          while (true)
          {
            if (!bool)
              ConnectingHelper.sendConnectionToHandler(Message.obtain(this.d, 7302, locali), a.get());
            if (locali.g == 0)
              break label762;
            ac.d(z[1], z[5] + locali.g + z[16] + locali.h);
            break;
            bool = true;
            continue;
            p localp = ((d)locali).a();
            if (localp == null)
            {
              ac.e();
              break label596;
            }
            bool = j.a(localp.b());
            continue;
            cn.jpush.b.a.a.a locala = (cn.jpush.b.a.a.a)locali;
            if ((locala.a() != 10) && (locala.a() != 2))
              break label596;
            bool = true;
            continue;
            bool = true;
          }
          label762: switch (locali.e())
          {
          default:
            new StringBuilder(z[10]).append(locali.e());
            ac.d();
            break;
          case 3:
            h.a(localContext, this.d, a.get(), locali);
            break;
          case 25:
            h.b(localContext, this.d, a.get(), locali);
            break;
          case 19:
            long l2 = a.get();
            int k = ((cn.jpush.b.a.a.a)locali).a();
            if (k == 2)
            {
              ac.b();
              ConnectingHelper.sendConnectionToHandler(Message.obtain(this.d, 7303), l2);
              continue;
            }
            if (k == 10)
            {
              ac.b();
              continue;
            }
            new StringBuilder(z[3]).append(k);
            ac.d();
            break;
          case 100:
            t.a(this.c, this.d, locali, arrayOfByte2);
            break;
          case 10:
            ac.d();
            break;
          }
        }
      }
      else if (j == -994)
      {
        ac.b();
      }
      else
      {
        ac.b(z[1], z[0] + j);
      }
    }
    if (this.f)
      ac.b(z[1], z[7] + a.get());
    c();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */