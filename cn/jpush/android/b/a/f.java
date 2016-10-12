package cn.jpush.android.b.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import cn.jpush.android.api.m;
import cn.jpush.android.data.c;
import cn.jpush.android.data.s;
import cn.jpush.android.e;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.ui.PopWinActivity;
import cn.jpush.android.ui.PushActivity;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import java.lang.ref.WeakReference;

public final class f
{
  private static final String[] z;
  private final WeakReference<Activity> a;
  private final c b;

  static
  {
    Object localObject1 = new String[20];
    int i = 0;
    String str1 = "<\037F\035z\n\026H_x\b\021\036Yv\034\024HRx\017Z\t\035";
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
        i3 = 25;
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
        str1 = "\"\024R\\u\002\036\004P|\030\tEZ|?\003TX9\r\025V\035}\004\rJQv\n\036\004\0209";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "<\037F\035z\n\026H_x\b\021\036Nq\004\rpRx\030\016\004\0209";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "?\022A\035x\b\016MKp\037\003\004Sx\006\037\004TjK\024QQuK\025V\035|\006\nPD5K=MK|K\017T\0237";
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
        str1 = "?\022A\035x\b\016MKp\037\003\004Sx\006\037\004TjK\023JKx\007\023@\0219,\023RX9\036\n\n\023";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\b\024\nWi\036\tL\023x\005\036VRp\017Te~M\",mi@4*eoX&";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "<\037Fkp\016\rlXu\033\037V";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = ">\024L\\w\017\026A\035p\005\016ASmK@\004^wE\020THj\003TES}\031\025MY7\002\024PXw\037Te~M\"5jbX(.mkP?#{rI.4`x]";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "<\037F\035z\n\026H_x\b\021\036^u\002\031O\0354K\033GIp\004\024mY#";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "GZWUv\036\026@~x\005\031AQW\004\016M[p\b\033PTv\005@";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "GZWUv\036\026@~u\004\tA\007";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\002\031KSP\017ZWUv\036\026@\035{\016ZMSmKW\004";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "GZQOuQ";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "<\037F\035z\n\026H_x\b\021\036^k\016\033PXJ\003\025VIz\036\016\004\0209\005\033IX#";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\"\024R\\u\002\036\004\\z\037\023KSP\017ZBOv\006ZsX{KW\004";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\b\024\nWi\036\tL\023x\005\036VRp\017TMSm\016\024P\023X(.mrW4(m~Q;/wuF(;hq[*9o";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "<\037F\035z\n\026H_x\b\021\036Xa\016\031QI|&\tCp|\030\tEZ|KW\004";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = ">\024L\\w\017\026A\035p\005\016ASmK@\004";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\b\024\nWi\036\tL\023x\005\036VRp\017TaeM9;";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 107;
        continue;
        i3 = 122;
        continue;
        i3 = 36;
        continue;
        i3 = 61;
      }
    }
  }

  public f(Context paramContext, c paramc)
  {
    this.a = new WeakReference((Activity)paramContext);
    this.b = paramc;
  }

  private void g(String paramString)
  {
    try
    {
      int j = Integer.parseInt(paramString);
      i = j;
      cn.jpush.android.helpers.i.a(this.b.c, i, (Context)this.a.get());
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder(z[15]).append(paramString);
        int i = 1100;
        ac.e();
      }
    }
  }

  public final void a()
  {
    if (this.a.get() != null)
    {
      ac.b();
      ((Activity)this.a.get()).finish();
    }
  }

  public final void a(String paramString)
  {
    Context localContext = (Context)this.a.get();
    if (localContext == null)
      return;
    b.b(localContext, z[16], paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    new StringBuilder(z[4]).append(paramString1);
    ac.b();
    if (an.a(paramString1))
      ac.e(z[7], z[3]);
    Context localContext = (Context)this.a.get();
    if (localContext == null);
    while (true)
    {
      return;
      try
      {
        Class localClass = Class.forName(paramString1);
        if (localClass != null)
        {
          Intent localIntent = new Intent(localContext, localClass);
          localIntent.putExtra(z[6], paramString2);
          localIntent.setFlags(268435456);
          localContext.startActivity(localIntent);
          return;
        }
      }
      catch (Exception localException)
      {
        ac.e(z[7], z[5]);
      }
    }
  }

  public final void a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      int j = Integer.parseInt(paramString3);
      i = j;
      if (this.a.get() == null)
        return;
    }
    catch (Exception localException)
    {
      int i;
      while (true)
      {
        new StringBuilder(z[12]).append(paramString3);
        ac.b();
        i = 0;
      }
      new StringBuilder(z[14]).append(paramString1).append(z[13]).append(paramString2);
      ac.b();
      b.a((Context)this.a.get(), paramString1, paramString2, m.a(i));
    }
  }

  public final void b()
  {
    if ((this.a.get() != null) && ((this.a.get() instanceof PushActivity)))
      ((PushActivity)this.a.get()).a();
  }

  public final void b(String paramString)
  {
    Context localContext = (Context)this.a.get();
    if (localContext == null)
      return;
    try
    {
      b.h(localContext, paramString);
      ((Activity)localContext).finish();
      return;
    }
    catch (Exception localException)
    {
      ac.e(z[7], z[8]);
    }
  }

  public final void b(String paramString1, String paramString2)
  {
    Context localContext = (Context)this.a.get();
    if (localContext == null)
      return;
    try
    {
      Intent localIntent = new Intent(paramString1);
      localIntent.addCategory(localContext.getPackageName());
      localIntent.putExtra(z[19], paramString2);
      localIntent.setFlags(268435456);
      localContext.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      ac.e(z[7], z[18] + paramString1);
    }
  }

  // ERROR //
  public final void b(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 81	cn/jpush/android/b/a/f:a	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 103	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: ifnull +120 -> 127
    //   10: new 112	java/lang/StringBuilder
    //   13: dup
    //   14: getstatic 69	cn/jpush/android/b/a/f:z	[Ljava/lang/String;
    //   17: bipush 9
    //   19: aaload
    //   20: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: aload_1
    //   24: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: getstatic 69	cn/jpush/android/b/a/f:z	[Ljava/lang/String;
    //   30: bipush 11
    //   32: aaload
    //   33: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: aload_2
    //   37: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: getstatic 69	cn/jpush/android/b/a/f:z	[Ljava/lang/String;
    //   43: bipush 10
    //   45: aaload
    //   46: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: aload_3
    //   50: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: invokestatic 125	cn/jpush/android/util/ac:b	()V
    //   57: aload_0
    //   58: aload_1
    //   59: invokespecial 195	cn/jpush/android/b/a/f:g	(Ljava/lang/String;)V
    //   62: aload_2
    //   63: invokestatic 200	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   66: istore 9
    //   68: iload 9
    //   70: istore 6
    //   72: aload_3
    //   73: invokestatic 200	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   76: istore 11
    //   78: iload 6
    //   80: istore 7
    //   82: iload 11
    //   84: istore 8
    //   86: iload 8
    //   88: ifeq +21 -> 109
    //   91: aload_0
    //   92: getfield 81	cn/jpush/android/b/a/f:a	Ljava/lang/ref/WeakReference;
    //   95: invokevirtual 103	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   98: checkcast 105	android/content/Context
    //   101: aload_0
    //   102: getfield 83	cn/jpush/android/b/a/f:b	Lcn/jpush/android/data/c;
    //   105: iconst_0
    //   106: invokestatic 203	cn/jpush/android/api/m:a	(Landroid/content/Context;Lcn/jpush/android/data/c;I)V
    //   109: iload 7
    //   111: ifeq +16 -> 127
    //   114: aload_0
    //   115: getfield 81	cn/jpush/android/b/a/f:a	Ljava/lang/ref/WeakReference;
    //   118: invokevirtual 103	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   121: checkcast 76	android/app/Activity
    //   124: invokevirtual 128	android/app/Activity:finish	()V
    //   127: return
    //   128: astore 5
    //   130: iconst_0
    //   131: istore 6
    //   133: iload 6
    //   135: istore 7
    //   137: iconst_0
    //   138: istore 8
    //   140: goto -54 -> 86
    //   143: astore 10
    //   145: goto -12 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   62	68	128	java/lang/Exception
    //   72	78	143	java/lang/Exception
  }

  public final void c(String paramString)
  {
    if (this.a.get() == null)
      return;
    new StringBuilder(z[0]).append(paramString);
    ac.b();
    Context localContext = (Context)this.a.get();
    c localc = this.b;
    if (localc.a())
    {
      cn.jpush.android.data.i locali = (cn.jpush.android.data.i)localc;
      if (TextUtils.isEmpty(locali.K))
        locali.K = paramString;
      if (!TextUtils.isEmpty(locali.P))
      {
        b.e(localContext, locali.P);
        m.a(localContext, locali, 0);
        m.a(localContext, locali, 1);
      }
    }
    else if (localc.b())
    {
      s locals = (s)localc;
      if (TextUtils.isEmpty(locals.E))
        locals.E = paramString;
      if (!TextUtils.isEmpty(locals.I))
        localContext.startActivity(b.a(localContext, localc, false));
    }
    else
    {
      new StringBuilder(z[1]).append(localc.o);
      ac.d();
      return;
    }
    ServiceInterface.a(localContext, localc);
  }

  public final void c(String paramString1, String paramString2)
  {
    if (this.a.get() == null)
      return;
    g(paramString1);
    c(paramString2);
    m.a((Context)this.a.get(), this.b, 0);
    ((Activity)this.a.get()).finish();
  }

  public final void d(String paramString)
  {
    if (this.a.get() != null)
    {
      new StringBuilder(z[2]).append(paramString);
      ac.b();
      Toast.makeText((Context)this.a.get(), paramString, 0).show();
    }
  }

  public final void e(String paramString)
  {
    if (e.a)
    {
      new StringBuilder(z[17]).append(paramString);
      ac.b();
      if (this.a.get() != null);
    }
    else
    {
      return;
    }
    cn.jpush.android.helpers.f.a((Context)this.a.get(), paramString);
  }

  public final void f(String paramString)
  {
    if ((this.a.get() != null) && ((this.a.get() instanceof PopWinActivity)))
      ((PopWinActivity)this.a.get()).a(paramString);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.b.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */