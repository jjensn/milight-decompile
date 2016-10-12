package cn.jpush.android.helpers;

import android.content.Context;
import cn.jpush.android.a;
import cn.jpush.android.service.r;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ah;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import cn.jpush.android.util.d;
import cn.jpush.android.util.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  private static int a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[16];
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
        i3 = 84;
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
        str1 = "\020vL>";
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
        str1 = "X7[00\021-\030";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "Te]/;\006c\030<;\032c]1 N7";
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
        str1 = "\035cQ21";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "X7\\> \0257K6.\021-\030rt";
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
        str1 = "";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "X5";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\025tL6;\032-J:$\033eL\020$\021eY+=\033y\030rt\027xV+1\032c\002";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = ":Bt\023t\027xV+1\fc";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        z = localObject2;
        a = 20480;
        return;
        i3 = 116;
        continue;
        i3 = 23;
        continue;
        i3 = 56;
        continue;
        i3 = 95;
      }
    }
  }

  public static void a(Context paramContext)
  {
    if (!a.y())
      ac.d();
    JSONArray localJSONArray1;
    JSONObject localJSONObject2;
    do
    {
      do
      {
        return;
        if (paramContext == null)
        {
          ac.d();
          return;
        }
        localJSONArray1 = b.l(paramContext);
      }
      while ((localJSONArray1 == null) || (localJSONArray1.length() == 0));
      i = localJSONArray1.length();
      int j = localJSONArray1.toString().length();
      new StringBuilder(z[11]).append(i).append(z[9]).append(j);
      ac.c();
      if (j > a)
        break;
      localJSONObject2 = b.a(z[10], localJSONArray1);
    }
    while ((localJSONObject2 == null) || (localJSONObject2.length() <= 0));
    ah.a(paramContext, localJSONObject2);
    return;
    localJSONArray2 = new JSONArray();
    k = 0;
    while (k < i)
      try
      {
        localJSONArray2.put(localJSONArray1.getJSONObject(k));
        if ((localJSONArray2.toString().length() > a) || (i - 1 == k))
        {
          JSONObject localJSONObject1 = b.a(z[10], localJSONArray2);
          if ((localJSONObject1 != null) && (localJSONObject1.length() > 0))
            ah.a(paramContext, localJSONObject1);
          localJSONArray2 = new JSONArray();
        }
        k++;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          ac.e();
      }
  }

  public static void a(Context paramContext, String paramString)
  {
    ac.b();
    new d(paramContext, paramString).start();
  }

  public static void a(Context paramContext, JSONObject paramJSONObject)
  {
    if (!a.y());
    do
    {
      return;
      if (paramContext == null)
        throw new IllegalArgumentException(z[15]);
    }
    while ((paramJSONObject == null) || (paramJSONObject.length() <= 0));
    ah.a(paramContext, paramJSONObject);
    new StringBuilder(z[14]).append(paramJSONObject.toString());
    ac.b();
  }

  public static void a(Context paramContext, boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3)
  {
    ac.b();
    new cn.jpush.android.a.i(paramContext, true, paramString, paramBoolean2, paramBoolean3).f();
  }

  public static void a(String paramString, int paramInt, Context paramContext)
  {
    a(paramString, paramInt, null, paramContext);
  }

  public static void a(String paramString1, int paramInt, String paramString2, Context paramContext)
  {
    if (!a.y())
    {
      ac.a();
      return;
    }
    if (paramContext == null)
    {
      ac.b();
      return;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(z[0] + paramString1 + z[5] + paramInt + "-" + r.b(paramInt));
    if (!an.a(paramString2))
      localStringBuffer.append(z[6] + paramString2);
    ac.b();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[7], paramString1);
      localJSONObject.put(z[4], paramInt);
      if (!an.a(paramString2))
        localJSONObject.put(z[3], paramString2);
      localJSONObject.put(z[8], a.m());
      localJSONObject.put(z[2], z[1]);
      ah.a(paramContext, localJSONObject);
      return;
    }
    catch (JSONException localJSONException)
    {
    }
  }

  public static void b(Context paramContext)
  {
    ac.a();
    String[] arrayOfString = v.a(paramContext);
    if ((arrayOfString == null) || (arrayOfString.length == 0))
    {
      ac.e();
      return;
    }
    int i = arrayOfString.length;
    String str1 = "[";
    int j = 0;
    int k = 0;
    int m = 0;
    label36: String str2;
    if (j < i)
    {
      str2 = arrayOfString[j];
      if (k != 0)
        break label247;
    }
    label247: for (str1 = str1 + "\"" + str2 + "\""; ; str1 = str1 + z[13] + str2 + "\"")
    {
      int n = j + 1;
      int i1 = k + 1;
      if ((i1 >= 50) || (str1.length() > 1000) || (n == i))
      {
        String str3 = str1 + "]";
        String str4 = z[12];
        Object[] arrayOfObject = new Object[5];
        arrayOfObject[0] = Integer.valueOf(i);
        arrayOfObject[1] = Integer.valueOf(m);
        arrayOfObject[2] = a.E();
        arrayOfObject[3] = Long.valueOf(a.x());
        arrayOfObject[4] = str3;
        String str5 = String.format(str4, arrayOfObject);
        ac.b();
        ah.a(paramContext, b.a(z[10], str5));
        int i2 = m + 1;
        str1 = "[";
        m = i2;
        i1 = 0;
      }
      k = i1;
      j = n;
      break label36;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */