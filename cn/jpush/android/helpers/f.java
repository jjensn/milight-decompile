package cn.jpush.android.helpers;

import android.content.Context;
import android.text.TextUtils;
import cn.jpush.android.data.a;
import cn.jpush.android.data.c;
import cn.jpush.android.data.d;
import cn.jpush.android.data.m;
import cn.jpush.android.data.r;
import cn.jpush.android.data.s;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static Queue<d> a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[27];
    int i = 0;
    String str1 = "\022cm\037^";
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
        i3 = 59;
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
        str1 = "(E9>h!C]";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\003rm\001Z\025";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "(EF>h!C]";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\007nF\032_";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\bUv\035W\037";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\013y~,R\002";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\025bv\004d\022si\026";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\bem\032]\017ix\032T\bUm\nK\003";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\005ew\007^\b~F\007B\026o";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\t||\001I\017n|,V\025mF\032_";
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
        str1 = "(_U?\033\005ew\007^\036~";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\bU{\006R\nn|\001d\017n";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\007nF\007";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "3dr\035T\021d9>h!*i\001T\022ez\034WF||\001H\017ew]\033!co\026\033\023z9^\033";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\013Uz\034U\022ow\007";
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
        str1 = "1C_:";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "8Qq\007O\026vq\007O\026yDX\001I%7Y";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "/do\022W\017n9\006I\n*4S";
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
        str1 = "\007im\032T\b0u\034Z\002Gj\024q\025ew5I\tgL\001WF'9";
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
        str1 = "";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        z = localObject2;
        a = new LinkedList();
        return;
        i3 = 102;
        continue;
        i3 = 10;
        continue;
        i3 = 25;
        continue;
        i3 = 115;
      }
    }
  }

  public static a a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    new StringBuilder(z[11]).append(paramString1);
    ac.b();
    if (paramContext == null)
      throw new IllegalArgumentException(z[14]);
    if (TextUtils.isEmpty(paramString1))
    {
      ac.e();
      i.a(z[1], 996, paramContext);
      return null;
    }
    JSONObject localJSONObject = a(paramContext, z[3], paramString1);
    if (localJSONObject == null)
    {
      ac.b();
      return null;
    }
    String str = localJSONObject.optString(z[6], "");
    if (an.a(str));
    while (true)
    {
      if (an.a(paramString4))
        paramString4 = localJSONObject.optString(z[4], "");
      new StringBuilder(z[7]).append(paramString4);
      ac.b();
      boolean bool;
      if (localJSONObject.optInt(z[5], 0) == 1)
      {
        bool = true;
        if (!bool)
          break label369;
      }
      label369: for (int i = localJSONObject.optInt(z[15], 0); ; i = 0)
      {
        a locala = new a();
        locala.c = paramString4;
        locala.a = localJSONObject;
        locala.b = localJSONObject.optInt(z[8], 3);
        locala.e = bool;
        locala.f = i;
        locala.g = localJSONObject.optInt(z[9], 0);
        locala.i = localJSONObject.optString(z[13], "");
        locala.j = localJSONObject.optString(z[10], "");
        locala.k = localJSONObject.optString(z[0], "");
        locala.l = localJSONObject.optString(z[2], "");
        locala.m = paramString2;
        locala.n = paramString3;
        locala.d = localJSONObject.optString(z[12], "");
        return locala;
        bool = false;
        break;
      }
      paramString4 = str;
    }
  }

  private static JSONObject a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString2);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      ac.i();
      i.a(paramString1, 996, paramContext);
    }
    return null;
  }

  public static JSONObject a(Context paramContext, String paramString1, JSONObject paramJSONObject, String paramString2)
  {
    if (paramJSONObject == null)
    {
      ac.d();
      i.a(paramString1, 996, paramContext);
    }
    while (true)
    {
      return null;
      if (TextUtils.isEmpty(paramString2))
      {
        ac.d();
        return null;
      }
      try
      {
        if (!paramJSONObject.isNull(paramString2))
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(paramString2);
          return localJSONObject;
        }
      }
      catch (JSONException localJSONException)
      {
        ac.i();
        i.a(paramString1, 996, paramContext);
      }
    }
    return null;
  }

  public static void a(Context paramContext, a parama)
  {
    ac.a();
    if (paramContext == null)
      throw new IllegalArgumentException(z[14]);
    int i = parama.b;
    JSONObject localJSONObject1 = parama.a;
    String str = parama.c;
    JSONObject localJSONObject2;
    if ((i == 3) || (i == 4))
    {
      localJSONObject2 = a(paramContext, str, localJSONObject1, z[18]);
      if (localJSONObject2 == null)
        ac.d();
    }
    else
    {
      new StringBuilder(z[17]).append(i);
      ac.b();
      i.a(str, 996, paramContext);
      return;
    }
    int j = localJSONObject2.optInt(z[16], -1);
    if (j == 0)
    {
      m localm = new m();
      localm.c = str;
      localm.b = i;
      localm.o = j;
      localm.h = parama.h;
      localm.e = parama.e;
      localm.f = parama.f;
      localm.m = parama.m;
      localm.d = parama.d;
      localm.g = parama.g;
      boolean bool = localm.b(paramContext, localJSONObject2);
      ac.a();
      if (bool)
      {
        localm.a(paramContext);
        ac.a();
      }
    }
    else
    {
      new StringBuilder(z[19]).append(j);
      ac.d();
      i.a(str, 996, paramContext);
      return;
    }
    ac.d();
  }

  public static void a(Context paramContext, String paramString)
  {
    new StringBuilder(z[25]).append(paramString);
    ac.a();
    if (paramContext == null)
      throw new IllegalArgumentException(z[14]);
    if (TextUtils.isEmpty(paramString))
      ac.e();
    while (true)
    {
      return;
      JSONObject localJSONObject1 = a(paramContext, z[1], paramString);
      if (localJSONObject1 != null)
      {
        String str1 = localJSONObject1.optString(z[6], "");
        if (an.a(str1))
          str1 = localJSONObject1.optString(z[4], "");
        int i = localJSONObject1.optInt(z[8], -1);
        if (i == 2)
        {
          String str2 = localJSONObject1.optString(z[18], "").trim();
          if (a(str2))
          {
            new StringBuilder(z[24]).append(str2);
            ac.a();
            if (paramContext == null)
              throw new IllegalArgumentException(z[14]);
            new g(str2, paramContext, str1).start();
            return;
          }
          new StringBuilder(z[23]).append(str2);
          ac.b();
          i.a(str1, 996, paramContext);
          return;
        }
        if (i == 1);
        for (JSONObject localJSONObject2 = a(paramContext, str1, localJSONObject1, z[18]); localJSONObject2 != null; localJSONObject2 = null)
        {
          int j = localJSONObject2.optInt(z[16], -1);
          Object localObject;
          switch (j)
          {
          default:
            new StringBuilder(z[26]).append(j);
            ac.d();
            i.a(str1, 996, paramContext);
            return;
          case 0:
            localObject = new m();
          case 1:
          case 2:
          case 3:
          }
          while (true)
          {
            boolean bool = ((c)localObject).b(paramContext, localJSONObject2);
            ac.a();
            ((c)localObject).c = str1;
            ((c)localObject).b = i;
            ((c)localObject).o = j;
            if (!bool)
              break;
            ((c)localObject).a(paramContext);
            ac.a();
            return;
            localObject = new cn.jpush.android.data.i();
            continue;
            localObject = new s();
            continue;
            localObject = new r();
          }
          ac.d();
          return;
        }
      }
    }
  }

  public static boolean a(String paramString)
  {
    boolean bool;
    if (TextUtils.isEmpty(paramString))
      bool = false;
    String str;
    do
    {
      return bool;
      str = paramString.trim();
      bool = str.matches(z[21]);
    }
    while (bool);
    new StringBuilder(z[22]).append(str);
    ac.d();
    return bool;
  }

  public static boolean a(boolean paramBoolean, int paramInt, Context paramContext)
  {
    boolean bool = z[20].equalsIgnoreCase(b.d(paramContext));
    return ((paramBoolean) && (paramInt == 0)) || ((paramBoolean) && (paramInt == 1) && (bool));
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */