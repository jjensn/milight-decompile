package cn.jpush.android.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.telephony.CellLocation;
import cn.jpush.android.util.ac;
import java.util.Date;
import org.json.JSONArray;

public abstract class d
{
  private static final String[] B;
  public static int b;
  public static boolean c;
  private static boolean f;
  private JSONArray A;
  public String a;
  protected boolean d;
  private boolean e = false;
  private int g;
  private b h;
  private g i;
  private Context j;
  private int[] k;
  private f l;
  private boolean m;
  private final BroadcastReceiver n = new e(this, (byte)0);
  private long o;
  private int p;
  private boolean q = false;
  private boolean r;
  private j s;
  private int t;
  private final Date u = new Date();
  private JSONArray v;
  private boolean w;
  private boolean x = false;
  private boolean y = false;
  private String z;

  static
  {
    String[] arrayOfString1 = new String[5];
    String str1 = "L*Z";
    int i1 = -1;
    String[] arrayOfString2 = arrayOfString1;
    int i2 = 0;
    Object localObject1 = str1.toCharArray();
    int i3 = localObject1.length;
    int i4;
    label35: int i8;
    if (i3 <= 1)
    {
      i4 = 0;
      Object localObject2 = localObject1;
      int i5 = i4;
      int i6 = i3;
      Object localObject3 = localObject1;
      while (true)
      {
        int i7 = localObject3[i4];
        switch (i5 % 5)
        {
        default:
          i8 = 14;
          label96: localObject3[i4] = (char)(i8 ^ i7);
          i4 = i5 + 1;
          if (i6 != 0)
            break label133;
          localObject3 = localObject2;
          i5 = i4;
          i4 = i6;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: i3 = i6;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (i3 > i4)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i1)
      {
      default:
        arrayOfString2[i2] = str2;
        str1 = "L(RaD\"\030}k_+_~}D)X#On\005s^]r\021KGr\025bLZh";
        i2 = 1;
        arrayOfString2 = arrayOfString1;
        i1 = 0;
        break;
      case 0:
        arrayOfString2[i2] = str2;
        str1 = "L(RaD\"\030}k_+_~}D)X#Me\007xJKr\021KGr\025bLZh";
        i2 = 2;
        arrayOfString2 = arrayOfString1;
        i1 = 1;
        break;
      case 1:
        arrayOfString2[i2] = str2;
        str1 = "L(RaD\"\030}k_+_~}D)X#On\005s^]r\005yL\\~\003iAAn\007bDAc";
        i2 = 3;
        arrayOfString2 = arrayOfString1;
        i1 = 2;
        break;
      case 2:
        arrayOfString2[i2] = str2;
        i2 = 4;
        arrayOfString2 = arrayOfString1;
        str1 = "";
        i1 = 3;
        break;
      case 3:
        arrayOfString2[i2] = str2;
        B = arrayOfString1;
        b = 15000;
        c = true;
        f = false;
        return;
        i8 = 45;
        break label96;
        i8 = 70;
        break label96;
        i8 = 54;
        break label96;
        i8 = 13;
        break label96;
        i4 = 0;
      }
    }
  }

  private d(Context paramContext)
  {
    this.j = paramContext.getApplicationContext();
    this.h = new b(paramContext);
    this.s = new j(paramContext);
    this.i = new g(paramContext);
  }

  private d(Context paramContext, String paramString)
  {
    this(paramContext);
    if ((paramString == null) || ("".equals(paramString)))
    {
      this.a = B[0];
      return;
    }
    this.a = paramString;
  }

  private d(Context paramContext, String paramString, boolean paramBoolean)
  {
    this(paramContext, paramString);
    this.x = paramBoolean;
  }

  public d(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramContext, paramString, paramBoolean1);
    this.e = paramBoolean2;
  }

  private static boolean a(Context paramContext)
  {
    return (cn.jpush.android.util.b.c(paramContext, B[3])) && (cn.jpush.android.util.b.c(paramContext, B[1])) && (cn.jpush.android.util.b.c(paramContext, B[2])) && (cn.jpush.android.util.b.c(paramContext, B[4]));
  }

  public final String a()
  {
    String str = this.i.d();
    if (str == null)
      str = "";
    return str;
  }

  public final void a(JSONArray paramJSONArray)
  {
    this.v = paramJSONArray;
  }

  public final JSONArray b()
  {
    if (!cn.jpush.android.util.b.c(this.j, B[3]))
      return null;
    if (this.h.e())
      return this.h.b();
    return this.v;
  }

  public final void b(JSONArray paramJSONArray)
  {
    this.A = paramJSONArray;
  }

  public final JSONArray c()
  {
    if (this.A != null)
      return this.A;
    return null;
  }

  public abstract void d();

  public final void e()
  {
    if (this.p != 1)
      return;
    CellLocation.requestLocationUpdate();
    this.p = 2;
    this.l.sendEmptyMessage(1);
    if (this.s.b().isWifiEnabled())
    {
      this.s.b().startScan();
      this.r = false;
      return;
    }
    if (!this.e)
    {
      this.l.sendEmptyMessageDelayed(5, 0L);
      return;
    }
    this.o = System.currentTimeMillis();
    if (!c)
    {
      this.l.sendEmptyMessageDelayed(5, 8000L);
      return;
    }
    this.r = true;
  }

  public final void f()
  {
    if (this.y);
    label194: 
    while (true)
    {
      return;
      this.y = true;
      this.e = false;
      this.x = false;
      if (cn.jpush.android.util.b.c(this.j, B[3]))
      {
        this.v = this.h.c();
        if (cn.jpush.android.util.b.c(this.j, B[1]))
          break label126;
        ac.d();
        this.A = null;
        label72: if (cn.jpush.android.util.b.c(this.j, B[4]))
          break label194;
        ac.d();
      }
      label90: for (this.z = ""; ; this.z = this.i.d())
      {
        label126: 
        do
        {
          if ((this.q) || (this.x))
            break label268;
          d();
          return;
          ac.d();
          this.v = null;
          break;
          if ((!a(this.j)) && (!cn.jpush.android.util.b.u(this.j)))
          {
            this.A = null;
            break label72;
          }
          this.w = this.s.a();
          if (!this.w)
          {
            this.A = null;
            break label72;
          }
          this.A = this.s.c();
          break label72;
          if (!this.i.a())
            break label90;
          this.i.b();
        }
        while (("" == this.i.d()) || (this.i.d() == null) || (System.currentTimeMillis() - this.i.e() >= 30000L));
        this.t = 0;
      }
    }
  }

  public final void g()
  {
    this.y = false;
    if ((cn.jpush.android.util.b.c(this.j, B[4])) && (this.i.a()))
      this.i.c();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */