package cn.jpush.android.api;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ah;
import cn.jpush.android.util.al;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import cn.jpush.android.util.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class e
{
  public static boolean a;
  public static boolean b;
  private static e c;
  private static final String[] z;
  private ExecutorService d = Executors.newSingleThreadExecutor();
  private String e = null;
  private String f = null;
  private ArrayList<a> g = new ArrayList();
  private long h = 30L;
  private long i = 0L;
  private long j = 0L;
  private boolean k = false;
  private boolean l = true;
  private boolean m = true;
  private boolean n = false;
  private boolean o = true;
  private long p = 0L;
  private WeakReference<JSONObject> q = null;
  private JSONObject r = null;
  private Object s = new Object();

  static
  {
    Object localObject1 = new String[24];
    int i1 = 0;
    String str1 = "\021G>V\035\rL\022L\020";
    int i2 = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i3 = localObject3.length;
    int i4 = 0;
    label36: Object localObject4;
    int i5;
    int i6;
    Object localObject5;
    label52: int i7;
    int i8;
    if (i3 <= 1)
    {
      localObject4 = localObject3;
      i5 = i4;
      i6 = i3;
      localObject5 = localObject3;
      i7 = localObject5[i4];
      switch (i5 % 5)
      {
      default:
        i8 = 116;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i4] = (char)(i8 ^ i7);
      i4 = i5 + 1;
      if (i6 == 0)
      {
        localObject5 = localObject4;
        i5 = i4;
        i4 = i6;
        break label52;
      }
      i3 = i6;
      localObject3 = localObject4;
      if (i3 > i4)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (i2)
      {
      default:
        localObject1[i1] = str2;
        i1 = 1;
        str1 = "\013V$H\021";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = "";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "\026[=@";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = "\016C>Q+\022C8V\021";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "(r8V\0341c";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "\003A9L\002\007}!D\001\fA%";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "\001W?z\007\007Q>L\033\f}>Q\025\020V";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "\003A9L\002\013V$@\007";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        i1 = 12;
        str1 = "\027V+\bL";
        i2 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i1] = str2;
        i1 = 13;
        str1 = "";
        i2 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i1] = str2;
        i1 = 14;
        str1 = "\001W?z\007\007G>L\033\f}(K\020";
        i2 = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i1] = str2;
        i1 = 15;
        str1 = "";
        i2 = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i1] = str2;
        i1 = 16;
        str1 = "\rL\035D\001\021G";
        i2 = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i1] = str2;
        i1 = 17;
        str1 = "\006C9@";
        i2 = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i1] = str2;
        i1 = 18;
        str1 = "\026K @";
        i2 = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i1] = str2;
        i1 = 19;
        str1 = "";
        i2 = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i1] = str2;
        i1 = 20;
        str1 = "";
        i2 = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i1] = str2;
        i1 = 21;
        str1 = "";
        i2 = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i1] = str2;
        i1 = 22;
        str1 = "";
        i2 = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i1] = str2;
        i1 = 23;
        str1 = "\rL\037@\007\027O(";
        i2 = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i1] = str2;
        z = localObject2;
        c = null;
        a = false;
        b = false;
        return;
        i8 = 98;
        continue;
        i8 = 34;
        continue;
        i8 = 77;
        continue;
        i8 = 37;
      }
    }
  }

  private e()
  {
  }

  private JSONObject a(Context paramContext, long paramLong)
  {
    al.a().b(paramContext, z[10], this.i);
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = b.q(paramContext);
    if (!an.a(str1))
      localStringBuilder.append(str1);
    String str2 = b.j(paramContext);
    if (!an.a(str2))
      localStringBuilder.append(str2);
    localStringBuilder.append(paramLong);
    this.f = b.a(localStringBuilder.toString());
    al.a().b(paramContext, z[0], this.f);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (!cn.jpush.android.a.y())
      {
        ac.d();
        return null;
      }
      a(localJSONObject);
      localJSONObject.put(z[1], cn.jpush.android.a.m());
      localJSONObject.put(z[0], this.f);
      localJSONObject.put(z[4], z[9]);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  private static void a(JSONObject paramJSONObject)
  {
    String str1 = m.a();
    String str2 = str1.split("_")[0];
    String str3 = str1.split("_")[1];
    paramJSONObject.put(z[17], str2);
    paramJSONObject.put(z[18], str3);
  }

  private static boolean a(String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    int i1 = arrayOfStackTraceElement.length;
    boolean bool = false;
    if (i1 >= 2);
    for (int i2 = 0; ; i2++)
    {
      try
      {
        if (i2 < arrayOfStackTraceElement.length)
        {
          StackTraceElement localStackTraceElement = arrayOfStackTraceElement[i2];
          if (!localStackTraceElement.getMethodName().equals(paramString))
            continue;
          Class localClass;
          for (Object localObject = Class.forName(localStackTraceElement.getClassName()); ((Class)localObject).getSuperclass() != null; localObject = localClass)
          {
            if (((Class)localObject).getSuperclass() == Activity.class)
            {
              bool = true;
              break;
            }
            localClass = ((Class)localObject).getSuperclass();
          }
        }
      }
      catch (Exception localException)
      {
      }
      return bool;
    }
  }

  public static e b()
  {
    if (c == null);
    try
    {
      c = new e();
      return c;
    }
    finally
    {
    }
  }

  private boolean c(Context paramContext, String paramString)
  {
    if (!this.o)
    {
      ac.c();
      return false;
    }
    if (paramContext == null)
    {
      ac.c();
      return false;
    }
    if ((paramContext instanceof Application))
    {
      ac.e(z[8], z[7] + paramString);
      return false;
    }
    if (!a(paramString))
      throw new SecurityException(z[6]);
    return true;
  }

  private JSONObject d(Context paramContext)
  {
    if (this.r == null)
      this.r = ah.a(paramContext, z[3]);
    return this.r;
  }

  public final void a(long paramLong)
  {
    this.h = paramLong;
  }

  public final void a(Context paramContext)
  {
    if (!c(paramContext, z[23]))
      return;
    a = true;
    try
    {
      this.n = false;
      label24: if (this.n)
      {
        ac.e(z[8], z[22]);
        return;
      }
    }
    catch (Exception localException2)
    {
      while (true)
        localException2.printStackTrace();
      this.n = true;
      this.i = System.currentTimeMillis();
      this.e = paramContext.getClass().getName();
      try
      {
        this.d.execute(new h(this, paramContext));
        return;
      }
      catch (Exception localException1)
      {
      }
    }
    catch (ClassCastException localClassCastException)
    {
      break label24;
    }
  }

  public final void a(Context paramContext, String paramString)
  {
    if (this.n)
    {
      ac.e(z[8], z[21]);
      return;
    }
    this.n = true;
    this.e = paramString;
    this.i = System.currentTimeMillis();
    try
    {
      this.d.execute(new f(this, paramContext));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }

  public final boolean a()
  {
    return this.o;
  }

  public final void b(Context paramContext)
  {
    if (!c(paramContext, z[16]))
      return;
    b = true;
    try
    {
      this.n = true;
      label24: if (!this.n)
      {
        ac.e(z[8], z[15]);
        return;
      }
    }
    catch (Exception localException2)
    {
      while (true)
        localException2.printStackTrace();
      this.n = false;
      if ((this.e != null) && (this.e.equals(paramContext.getClass().getName())))
      {
        this.j = System.currentTimeMillis();
        long l1 = (this.j - this.i) / 1000L;
        a locala = new a(this.e, l1);
        this.g.add(locala);
        this.p = this.i;
        try
        {
          this.d.execute(new i(this, paramContext));
          return;
        }
        catch (Exception localException1)
        {
          return;
        }
      }
      ac.c();
      return;
    }
    catch (ClassCastException localClassCastException)
    {
      break label24;
    }
  }

  public final void b(Context paramContext, String paramString)
  {
    if (!this.n)
    {
      ac.e(z[8], z[20]);
      return;
    }
    this.n = false;
    if ((this.e != null) && (this.e.equals(paramString)))
    {
      this.j = System.currentTimeMillis();
      long l1 = (this.j - this.i) / 1000L;
      a locala = new a(this.e, l1);
      this.g.add(locala);
      try
      {
        this.d.execute(new g(this, paramContext));
        return;
      }
      catch (Exception localException)
      {
        return;
      }
    }
    ac.e(z[8], z[19]);
  }

  // ERROR //
  public final void c(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 120	cn/jpush/android/api/e:e	Ljava/lang/String;
    //   4: ifnull +73 -> 77
    //   7: aload_0
    //   8: getfield 143	cn/jpush/android/api/e:n	Z
    //   11: ifeq +66 -> 77
    //   14: aload_0
    //   15: invokestatic 400	java/lang/System:currentTimeMillis	()J
    //   18: putfield 135	cn/jpush/android/api/e:j	J
    //   21: aload_0
    //   22: getfield 135	cn/jpush/android/api/e:j	J
    //   25: aload_0
    //   26: getfield 133	cn/jpush/android/api/e:i	J
    //   29: lsub
    //   30: ldc2_w 232
    //   33: ldiv
    //   34: lstore_3
    //   35: new 328	cn/jpush/android/api/a
    //   38: dup
    //   39: aload_0
    //   40: getfield 120	cn/jpush/android/api/e:e	Ljava/lang/String;
    //   43: lload_3
    //   44: invokespecial 335	cn/jpush/android/api/a:<init>	(Ljava/lang/String;J)V
    //   47: astore 5
    //   49: aload_0
    //   50: getfield 127	cn/jpush/android/api/e:g	Ljava/util/ArrayList;
    //   53: aload 5
    //   55: invokevirtual 338	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   58: pop
    //   59: aload_0
    //   60: getfield 118	cn/jpush/android/api/e:d	Ljava/util/concurrent/ExecutorService;
    //   63: new 429	cn/jpush/android/api/j
    //   66: dup
    //   67: aload_0
    //   68: aload_1
    //   69: invokespecial 430	cn/jpush/android/api/j:<init>	(Lcn/jpush/android/api/e;Landroid/content/Context;)V
    //   72: invokeinterface 416 2 0
    //   77: return
    //   78: astore_2
    //   79: return
    //   80: astore 7
    //   82: return
    //
    // Exception table:
    //   from	to	target	type
    //   0	59	78	java/lang/Exception
    //   59	77	80	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */