package cn.jpush.android.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import cn.jpush.android.a;
import cn.jpush.android.api.d;
import cn.jpush.android.e;
import cn.jpush.android.helpers.ConnectingHelper;
import cn.jpush.android.helpers.j;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import cn.jpush.b.a.a.c;
import cn.jpush.b.a.a.f;
import cn.jpush.b.a.a.h;
import cn.jpush.b.a.a.m;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class n extends HandlerThread
{
  private static final String[] z;
  private Map<Long, p> a = new ConcurrentHashMap();
  private Deque<p> b = new LinkedBlockingDeque();
  private Deque<p> c = new LinkedBlockingDeque();
  private Context d;
  private Handler e;
  private Handler f;
  private boolean g = false;
  private int h = 0;

  static
  {
    Object localObject1 = new String[32];
    int i = 0;
    String str1 = "Y\006\024}qvEM4{v\0013qpl1\ty{w\020\024438\027\tp$";
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
        i3 = 30;
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
        str1 = "4E\022qmh\n\016g{\"";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "Y\006\024}qvEM4nj\f\016`M}\013\024Ek}\020\005438\026\tn{\"";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "Y\006\024}qvEM4qv)\017sy}\001)z";
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
        str1 = "4E\024|l}\004\004]z\"";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "4E\024}s}\n\025`$";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "Y\006\024}qvEM4m}\013\004F{i\020\005gjQ\013\024qlv\004\f438\006\017zp}\006\024}qv_";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "q\b?ws|";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "l\004\007urq\004\023Km}\024\tp";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "l\004\007urq\004\023K{j\027\017f}w\001\005";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "{\013N~nm\026\b:wuK\001zzj\n\tp0y\006\024}qvK)YAJ 3DQV6%";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "{\013N~nm\026\b:v\001\022{w|K\tzj}\013\024:JY\"?URQ$3KJQ(%[KL";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "j\f\004";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "";
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
        i = 20;
        str1 = "";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "8H@";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "Y\006\024}qvEM4nj\f\016`L}\024\025qml\f\016s]y\006\bq>5E\023}d}_";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "4E\naw|_";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "4E\023}z\"";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "Y\006\024}qvEM4m}\013\004Wqu\b\001zzO\f\024|Rw\002\007qzQ\013";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "Y\006\024}qvEM4qv6\005zjL\f\rqqm\021@9>";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 24;
        continue;
        i3 = 101;
        continue;
        i3 = 96;
        continue;
        i3 = 20;
      }
    }
  }

  public n(Context paramContext, Handler paramHandler)
  {
    super(z[5]);
    this.d = paramContext;
    this.f = paramHandler;
    start();
    this.e = new o(getLooper(), this);
  }

  private p a(Long paramLong)
  {
    try
    {
      ac.b();
      localObject2 = null;
      localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        localObject3 = (p)localIterator.next();
        l = ((p)localObject3).a.f().a().longValue();
        if (paramLong.longValue() != l)
          break label93;
        this.c.remove(localObject3);
        localObject2 = localObject3;
      }
      return localObject2;
    }
    finally
    {
    }
    while (true)
    {
      Object localObject2;
      Iterator localIterator;
      long l;
      label93: Object localObject3 = localObject2;
    }
  }

  private void a(p paramp)
  {
    new StringBuilder(z[10]).append(paramp.toString());
    ac.b();
    int i = paramp.a.e();
    Long localLong = paramp.a.f().a();
    d(paramp);
    switch (i)
    {
    default:
      ac.b();
    case 2:
      return;
    case 100:
      int j = ((c)paramp.a).a().b();
      long l = localLong.longValue();
      new StringBuilder(z[13]).append(j);
      ac.b();
      switch (j)
      {
      default:
      case 1:
      }
      while (true)
      {
        Bundle localBundle = new Bundle();
        localBundle.putBoolean(z[17], true);
        localBundle.putLong(z[16], l);
        localBundle.putInt(z[9], j);
        b.a(this.d, z[14], localBundle);
        return;
        j.c(e.e);
      }
    case 10:
    }
    h localh = paramp.a;
    ac.b();
    Intent localIntent = new Intent();
    localIntent.addCategory(e.c);
    localIntent.setAction(z[15]);
    localIntent.putExtra(z[12], d.b);
    localIntent.putExtra(z[11], localh.f().a().longValue());
    this.d.sendBroadcast(localIntent);
  }

  private void b(p paramp)
  {
    ac.b(z[5], z[29]);
    ac.a(z[5], paramp.toString());
    h localh = paramp.a;
    Long localLong = localh.f().a();
    int i = localh.e();
    long l = a.x();
    ac.b(z[5], z[25] + i + z[27] + this.h + z[26] + l);
    int j;
    switch (i)
    {
    default:
      j = 0;
      ac.d();
    case 2:
    case 10:
    case 100:
    }
    while (true)
      if (j == 0)
      {
        c(paramp);
        ac.b();
        Message localMessage = Message.obtain(this.e, 7404, localLong);
        this.e.sendMessageDelayed(localMessage, 9800L);
        return;
        short s = ConnectingHelper.getIMLoginFlag();
        new StringBuilder(z[28]).append(s);
        ac.b();
        PushProtocol.HbJPush(k.a.get(), localLong.longValue(), this.h, l, s);
        j = 0;
        continue;
        PushProtocol.TagAlias(k.a.get(), localLong.longValue(), this.h, l, e.f, ((m)localh).a());
        j = 0;
        continue;
        localh.d(this.h);
        localh.b(l);
        PushProtocol.IMProtocol(k.a.get(), localh.g(), 0);
        if (j.a(((c)localh).a().b()))
          j = 1;
      }
      else
      {
        ac.a();
        return;
        j = 0;
      }
  }

  private void c()
  {
    int i = 0;
    if (this.b != null);
    for (int j = this.b.size(); ; j = 0)
    {
      new StringBuilder(z[23]).append(j);
      ac.a();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        p localp = (p)localIterator.next();
        i++;
        new StringBuilder().append(i).append("/").append(j).append(z[22]).append(localp.toString());
        ac.a();
      }
      return;
    }
  }

  private void c(p paramp)
  {
    try
    {
      ac.b();
      long l1 = paramp.a.f().a().longValue();
      Iterator localIterator = this.c.iterator();
      int i;
      while (localIterator.hasNext())
      {
        long l2 = ((p)localIterator.next()).a.f().a().longValue();
        if (l2 == l1)
        {
          i = 1;
          if (i == 0)
            break label88;
        }
      }
      while (true)
      {
        return;
        i = 0;
        break;
        this.c.offerLast(paramp);
        if (this.c != null)
        {
          int j = this.c.size();
          new StringBuilder(z[3]).append(j);
          ac.a();
        }
      }
    }
    finally
    {
    }
  }

  private void d()
  {
    int i = 0;
    if (this.a != null);
    for (int j = this.a.size(); ; j = 0)
    {
      new StringBuilder(z[24]).append(j);
      ac.a();
      Iterator localIterator = this.a.values().iterator();
      while (localIterator.hasNext())
      {
        p localp = (p)localIterator.next();
        i++;
        new StringBuilder().append(i).append("/").append(j).append(z[22]).append(localp.toString());
        ac.a();
      }
      return;
    }
  }

  private void d(p paramp)
  {
    ac.a();
    Long localLong = paramp.a.f().a();
    if ((p)this.a.remove(localLong) == null)
      ac.d();
    this.b.remove(paramp);
    this.e.removeMessages(7403, localLong);
  }

  public final void a()
  {
    ac.b(z[5], z[4]);
    this.g = true;
    this.h = a.l();
    this.e.sendEmptyMessage(7405);
  }

  public final void a(long paramLong, Object paramObject)
  {
    ConnectingHelper.sendConnectionToHandler(Message.obtain(this.e, 7402, paramObject), paramLong);
  }

  public final void a(h paramh, int paramInt)
  {
    Message.obtain(this.e, 7401, paramInt, 0, paramh).sendToTarget();
  }

  public final void b()
  {
    ac.a(z[5], z[19]);
    k.b.set(false);
    this.h = 0;
    this.g = false;
    new StringBuilder(z[18]).append(this.c.size());
    ac.b();
    this.e.removeMessages(7404);
    while (true)
    {
      p localp = (p)this.c.pollLast();
      if (localp == null)
        break;
      this.b.offerFirst(localp);
    }
    c();
    d();
  }

  public final void run()
  {
    new StringBuilder(z[20]).append(Thread.currentThread().getId());
    ac.b();
    super.run();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */