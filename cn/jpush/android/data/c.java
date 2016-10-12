package cn.jpush.android.data;

import android.content.Context;
import android.text.TextUtils;
import cn.jpush.android.e;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import cn.jpush.android.util.p;
import cn.jpush.android.util.r;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public abstract class c
  implements Serializable
{
  private static final String[] E;
  public String A;
  public ArrayList<String> B = null;
  public String C;
  public String D;
  private boolean a = false;
  public int b;
  public String c;
  public String d;
  public boolean e;
  public int f;
  public int g = 0;
  public boolean h;
  public String i;
  public String j;
  public String k;
  public String l;
  public String m;
  public String n;
  public int o;
  public boolean p;
  public List<String> q = null;
  public int r;
  public String s;
  public String t;
  public List<c> u;
  public boolean v = false;
  public boolean w = false;
  public boolean x = false;
  public boolean y = false;
  public int z = -1;

  static
  {
    Object localObject1 = new String[12];
    int i1 = 0;
    String str1 = " \037+9K/F3?E%4+=H\b\021>7A\023\031,?Q3\037:#\004l\\*\"H\021\016:6M9F";
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
        i8 = 36;
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
        str1 = "\026\0166$Aa\017+?V \033:pA3\0160\"\ba\\<\"A \b:pM,\0336M-\0316E(\020q";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "\022\t<3A$\030$Ka\02001@a\02521C$\\rp";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = ")\b+ \036nS";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "\004\022+9P8";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = " \037+9K/F3?E%527v$\017}\0044\0163j";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "/#:(P3\035,";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "/#9<E&";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "'\t3<{2\037-5A/";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "/#<?J5\0311$";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "/#+9P-\031";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        E = localObject2;
        return;
        i8 = 65;
        continue;
        i8 = 124;
        continue;
        i8 = 95;
        continue;
        i8 = 80;
      }
    }
  }

  public c()
  {
  }

  static String a(String paramString1, String paramString2, String paramString3, Context paramContext)
  {
    new StringBuilder(E[5]).append(paramString1);
    ac.a();
    if ((f.a(paramString1)) && (paramContext != null) && (!TextUtils.isEmpty(paramString2)) && (!TextUtils.isEmpty(paramString3)))
    {
      byte[] arrayOfByte = cn.jpush.android.util.s.a(paramString1, 5, 5000L, 4);
      if (arrayOfByte != null)
        try
        {
          String str = p.a(paramContext, paramString2) + paramString3;
          r.a(str, arrayOfByte);
          new StringBuilder(E[2]).append(str);
          ac.a();
          return str;
        }
        catch (IOException localIOException)
        {
          ac.i();
          return "";
        }
      cn.jpush.android.helpers.i.a(paramString2, 1020, b.b(paramContext, paramString1), paramContext);
    }
    return "";
  }

  static boolean a(ArrayList<String> paramArrayList, Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = true;
    new StringBuilder(E[0]).append(paramString1);
    ac.a();
    boolean bool2;
    String str1;
    if ((f.a(paramString1)) && (paramContext != null) && (paramArrayList.size() > 0) && (!TextUtils.isEmpty(paramString2)))
    {
      Iterator localIterator = paramArrayList.iterator();
      bool2 = bool1;
      if (localIterator.hasNext())
      {
        str1 = (String)localIterator.next();
        if ((str1 == null) || (str1.startsWith(E[3])))
          break label300;
      }
    }
    label273: label300: for (String str2 = paramString1 + str1; ; str2 = str1)
    {
      byte[] arrayOfByte;
      while (true)
      {
        arrayOfByte = cn.jpush.android.util.s.a(str2, 5, 5000L, 4);
        if (arrayOfByte == null)
          break label273;
        try
        {
          if (str1.startsWith(E[3]))
            str1 = r.c(str1);
          if (!paramBoolean)
          {
            localObject = p.a(paramContext, paramString2) + str1;
            r.a((String)localObject, arrayOfByte);
            new StringBuilder(E[2]).append((String)localObject);
            ac.a();
          }
        }
        catch (IOException localIOException)
        {
          ac.a(E[4], E[1], localIOException);
          bool2 = false;
        }
      }
      while (true)
      {
        break;
        String str3 = p.b(paramContext, paramString2) + str1;
        Object localObject = str3;
      }
      cn.jpush.android.helpers.i.a(paramString2, 1020, b.b(paramContext, str2), paramContext);
      bool2 = false;
      break;
      bool1 = bool2;
      return bool1;
    }
  }

  public abstract void a(Context paramContext);

  public final boolean a()
  {
    return (this.o == 3) || (this.o == 1);
  }

  protected abstract boolean a(Context paramContext, JSONObject paramJSONObject);

  public final boolean b()
  {
    return this.o == 2;
  }

  public final boolean b(Context paramContext, JSONObject paramJSONObject)
  {
    ac.a();
    boolean bool;
    if (paramJSONObject.optInt(E[9], 0) > 0)
    {
      bool = true;
      this.p = bool;
      this.r = paramJSONObject.optInt(E[7], 0);
      this.s = paramJSONObject.optString(E[11], "");
      this.t = paramJSONObject.optString(E[10], "");
      this.l = paramJSONObject.optString(E[6], "");
      if (!an.a(this.s))
        break label135;
      if (this.h)
        break label125;
      ac.b();
      cn.jpush.android.helpers.i.a(this.c, 996, paramContext);
    }
    label125: JSONObject localJSONObject;
    label135: 
    do
    {
      return false;
      bool = false;
      break;
      ac.b();
      this.s = e.d;
      localJSONObject = f.a(paramContext, this.c, paramJSONObject, E[8]);
      if (localJSONObject != null)
        break label173;
    }
    while ((!this.h) || (!this.e));
    return true;
    label173: if ((this.h) && (this.e))
      this.a = true;
    return a(paramContext, localJSONObject);
  }

  public final boolean c()
  {
    return this.o == 3;
  }

  public final String d()
  {
    if (a())
      return ((i)this).K;
    if (b())
      return ((s)this).E;
    if (this.a)
      return this.D;
    return "";
  }

  public final boolean e()
  {
    return this.a;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */