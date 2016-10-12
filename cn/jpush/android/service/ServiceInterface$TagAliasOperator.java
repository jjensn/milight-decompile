package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cn.jpush.android.api.TagAliasCallback;
import cn.jpush.android.api.b;
import cn.jpush.android.api.d;
import cn.jpush.android.e;
import cn.jpush.android.util.ac;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ServiceInterface$TagAliasOperator extends BroadcastReceiver
{
  private static TagAliasOperator a;
  private static Object c;
  private static final String[] z;
  private ConcurrentHashMap<Long, b> b = new ConcurrentHashMap();
  private AtomicBoolean d = new AtomicBoolean(false);

  static
  {
    Object localObject1 = new String[14];
    int i = 0;
    String str1 = "";
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
        i3 = 23;
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
        str1 = "";
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
        str1 = "c5{\re,$k\013r|5z\007y";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "_$a\036~o$Z\006ci3u\tti";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "^$p\r~z$aHyc53\032rk(`\034r~$wD7o }\006xxap\t{`af\006ei&z\033ci3A\rti(e\re";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = ",5r\017V`(r\033Tm-\nvo*`H-";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "x t\t{e `Htm-\nvo*3\001d,/f\004{7aa\001s1";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "_$g){e `)yh\025r\017d,5z\005rc4gHee%)";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "_$g){e `)yh\025r\017d,'z\006~)3R7i3a\007eO.w\r-";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "x t\t{e `7di0z\f";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "x t\t{e `7r~3|\032tc%v";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = ",3z\f-";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "X t){e `'gi3r\034x~a|\006Ei\"v\001aiaz\006ci/gH~a}\035{`";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        z = localObject2;
        c = new Object();
        return;
        i3 = 12;
        continue;
        i3 = 65;
        continue;
        i3 = 19;
        continue;
        i3 = 104;
      }
    }
  }

  private ServiceInterface$TagAliasOperator()
  {
  }

  public static TagAliasOperator a()
  {
    synchronized (c)
    {
      if (a == null)
        a = new TagAliasOperator();
      return a;
    }
  }

  private b b(long paramLong)
  {
    return (b)this.b.get(Long.valueOf(paramLong));
  }

  // ERROR //
  private void b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 80	cn/jpush/android/service/ServiceInterface$TagAliasOperator:d	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual 105	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   9: ifeq +35 -> 44
    //   12: aload_0
    //   13: getfield 73	cn/jpush/android/service/ServiceInterface$TagAliasOperator:b	Ljava/util/concurrent/ConcurrentHashMap;
    //   16: ifnull +28 -> 44
    //   19: aload_0
    //   20: getfield 73	cn/jpush/android/service/ServiceInterface$TagAliasOperator:b	Ljava/util/concurrent/ConcurrentHashMap;
    //   23: invokevirtual 108	java/util/concurrent/ConcurrentHashMap:isEmpty	()Z
    //   26: istore_3
    //   27: iload_3
    //   28: ifeq +16 -> 44
    //   31: aload_1
    //   32: aload_0
    //   33: invokevirtual 114	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   36: aload_0
    //   37: getfield 80	cn/jpush/android/service/ServiceInterface$TagAliasOperator:d	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   40: iconst_0
    //   41: invokevirtual 117	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   44: invokestatic 121	cn/jpush/android/util/ac:a	()V
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: astore 5
    //   52: getstatic 61	cn/jpush/android/service/ServiceInterface$TagAliasOperator:z	[Ljava/lang/String;
    //   55: iconst_4
    //   56: aaload
    //   57: getstatic 61	cn/jpush/android/service/ServiceInterface$TagAliasOperator:z	[Ljava/lang/String;
    //   60: iconst_5
    //   61: aaload
    //   62: aload 5
    //   64: invokestatic 124	cn/jpush/android/util/ac:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   67: goto -31 -> 36
    //   70: astore_2
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_2
    //   74: athrow
    //   75: astore 4
    //   77: getstatic 61	cn/jpush/android/service/ServiceInterface$TagAliasOperator:z	[Ljava/lang/String;
    //   80: iconst_4
    //   81: aaload
    //   82: getstatic 61	cn/jpush/android/service/ServiceInterface$TagAliasOperator:z	[Ljava/lang/String;
    //   85: iconst_3
    //   86: aaload
    //   87: aload 4
    //   89: invokestatic 124	cn/jpush/android/util/ac:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   92: goto -56 -> 36
    //
    // Exception table:
    //   from	to	target	type
    //   31	36	50	java/lang/IllegalArgumentException
    //   2	27	70	finally
    //   31	36	70	finally
    //   36	44	70	finally
    //   44	47	70	finally
    //   52	67	70	finally
    //   77	92	70	finally
    //   31	36	75	java/lang/Exception
  }

  public final void a(long paramLong)
  {
    this.b.remove(Long.valueOf(paramLong));
  }

  public final void a(Context paramContext)
  {
    if (!this.d.get())
      try
      {
        IntentFilter localIntentFilter = new IntentFilter();
        localIntentFilter.addCategory(e.c);
        localIntentFilter.addAction(z[1]);
        localIntentFilter.addAction(z[2]);
        paramContext.registerReceiver(this, localIntentFilter);
        this.d.set(true);
        return;
      }
      catch (Exception localException)
      {
        new StringBuilder(z[0]).append(localException.getMessage());
        ac.e();
        return;
      }
    ac.b();
  }

  public final void a(Long paramLong, b paramb)
  {
    this.b.put(paramLong, paramb);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      ac.d(z[4], z[13]);
      return;
    }
    long l = paramIntent.getLongExtra(z[10], -1L);
    int i = paramIntent.getIntExtra(z[11], 0);
    if (l == -1L)
    {
      ac.d();
      return;
    }
    new StringBuilder(z[12]).append(l).append(z[6]).append(this.b.toString());
    ac.a();
    if (z[1].equals(paramIntent.getAction()))
    {
      new StringBuilder(z[8]).append(l);
      ac.a();
      b localb2 = b(l);
      if (localb2 != null)
      {
        TagAliasCallback localTagAliasCallback2 = localb2.c;
        a(l);
        if (localTagAliasCallback2 != null)
          localTagAliasCallback2.gotResult(d.b, localb2.a, localb2.b);
      }
    }
    while (true)
    {
      a().b(paramContext);
      return;
      new StringBuilder(z[7]).append(l);
      ac.d();
      continue;
      new StringBuilder(z[9]).append(i).append(z[12]).append(l);
      ac.a();
      b localb1 = b(l);
      if (localb1 != null)
      {
        TagAliasCallback localTagAliasCallback1 = localb1.c;
        a(l);
        if (localTagAliasCallback1 != null)
          localTagAliasCallback1.gotResult(i, localb1.a, localb1.b);
      }
      else
      {
        new StringBuilder(z[7]).append(l);
        ac.d();
      }
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.ServiceInterface.TagAliasOperator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */