package cn.jpush.android.a;

import android.content.Context;
import cn.jpush.android.a;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ah;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends d
{
  private static final String[] B;
  private Context e;
  private String f;
  private boolean g;
  private boolean h;
  private boolean i;
  private String j = null;
  private String k = null;
  private String l = null;

  static
  {
    Object localObject1 = new String[18];
    int m = 0;
    String str1 = "\027\002+|";
    int n = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i1 = localObject3.length;
    int i2 = 0;
    label36: Object localObject4;
    int i3;
    int i4;
    Object localObject5;
    label52: int i5;
    int i6;
    if (i1 <= 1)
    {
      localObject4 = localObject3;
      i3 = i2;
      i4 = i1;
      localObject5 = localObject3;
      i5 = localObject5[i2];
      switch (i3 % 5)
      {
      default:
        i6 = 46;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i2] = (char)(i6 ^ i5);
      i2 = i3 + 1;
      if (i4 == 0)
      {
        localObject5 = localObject4;
        i3 = i2;
        i2 = i4;
        break label52;
      }
      i1 = i4;
      localObject3 = localObject4;
      if (i1 > i2)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (n)
      {
      default:
        localObject1[m] = str2;
        m = 1;
        str1 = "\r\005+uK";
        localObject1 = localObject2;
        n = 0;
        break;
      case 0:
        localObject1[m] = str2;
        m = 2;
        str1 = "\007\024.t";
        n = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[m] = str2;
        m = 3;
        str1 = "\b\036!yB;\025,k";
        n = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[m] = str2;
        m = 4;
        str1 = "\007\024.tq\020\0365}\\\027";
        n = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[m] = str2;
        m = 5;
        str1 = "(\036!yZ\r\036,\"\016";
        n = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[m] = str2;
        m = 6;
        str1 = "\n\0246oA\026\032\035lW\024\024";
        n = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[m] = str2;
        m = 7;
        str1 = "\020\b2}";
        n = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[m] = str2;
        m = 8;
        str1 = "\023\030$qq\020\0365}\\\027";
        n = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[m] = str2;
        m = 9;
        str1 = "\003\0011";
        n = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[m] = str2;
        m = 10;
        str1 = "";
        n = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[m] = str2;
        m = 11;
        str1 = "3\030$q\016\b\024,Z\fKb";
        n = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[m] = str2;
        m = 12;
        str1 = "\005\035.";
        n = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[m] = str2;
        m = 13;
        str1 = "\b\036!GI\024\002";
        n = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[m] = str2;
        m = 14;
        str1 = "\b\036!GG\n\027-";
        n = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[m] = str2;
        m = 15;
        str1 = "\b\036!GY\r\027+";
        n = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[m] = str2;
        m = 16;
        str1 = "\b\036!GM\001\035.";
        n = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[m] = str2;
        m = 17;
        str1 = "\023\030$q";
        n = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[m] = str2;
        B = localObject2;
        return;
        i6 = 100;
        continue;
        i6 = 113;
        continue;
        i6 = 66;
        continue;
        i6 = 24;
      }
    }
  }

  public i(Context paramContext, boolean paramBoolean1, String paramString, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramContext, paramString, paramBoolean2, paramBoolean3);
    this.e = paramContext;
    this.f = paramString;
    this.g = paramBoolean2;
    this.h = paramBoolean3;
    this.i = paramBoolean1;
  }

  private boolean a(JSONArray paramJSONArray1, JSONArray paramJSONArray2, String paramString)
  {
    if (an.a(paramString))
    {
      if (!an.a(this.l))
        return false;
    }
    else if (!paramString.equals(this.l))
      return false;
    if (an.a(this.k))
    {
      if ((paramJSONArray2 != null) && (paramJSONArray2.length() != 0))
        return false;
    }
    else
    {
      if (paramJSONArray2 == null)
        return false;
      if (paramJSONArray2.length() == 0)
        return false;
      if (!this.k.equals(paramJSONArray2.toString()))
        return false;
      ac.c();
    }
    if (an.a(this.j))
    {
      if ((paramJSONArray1 != null) && (paramJSONArray1.length() != 0))
        return false;
    }
    else
    {
      if (paramJSONArray1 == null)
        return false;
      if (paramJSONArray1.length() == 0)
        return false;
      try
      {
        String str = ((JSONObject)paramJSONArray1.get(0)).optString(B[0]);
        if (!an.a(str))
        {
          boolean bool = str.equals(this.j);
          if (!bool)
            return false;
        }
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    return true;
  }

  public final void d()
  {
    try
    {
      boolean bool1 = this.i;
      if (!bool1)
        return;
      if (this.f.equals(B[4]))
        if (a.y())
        {
          localJSONArray7 = b();
          localJSONObject5 = b.a(B[16], localJSONArray7);
          if ((localJSONObject5 != null) && (localJSONObject5.length() > 0))
          {
            ah.a(this.e, localJSONObject5);
            new StringBuilder(B[5]).append(localJSONObject5);
            ac.c();
          }
        }
      while (true)
      {
        return;
        if (!this.f.equals(B[8]))
          break;
        if (a.y())
        {
          localJSONArray6 = c();
          localJSONObject4 = b.a(B[15], localJSONArray6);
          if ((localJSONObject4 != null) && (localJSONObject4.length() > 0))
          {
            ah.a(this.e, localJSONObject4);
            new StringBuilder(B[11]).append(localJSONObject4.toString().getBytes().length);
            ac.c();
            new StringBuilder(B[5]).append(localJSONObject4);
            ac.c();
          }
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ac.i();
        return;
        if (!this.f.equals(B[9]))
          break;
        if (a.y())
        {
          str2 = a();
          if (str2 != null)
          {
            bool3 = "".equals(str2);
            if (!bool3)
              try
              {
                localJSONObject2 = new JSONObject(str2);
                localJSONArray5 = new JSONArray();
                localJSONArray5.put(localJSONObject2);
                localJSONObject3 = b.a(B[13], localJSONArray5);
                if ((localJSONObject3 != null) && (localJSONObject3.length() > 0))
                {
                  ah.a(this.e, localJSONObject3);
                  new StringBuilder(B[5]).append(localJSONObject3);
                  ac.c();
                }
              }
              catch (JSONException localJSONException2)
              {
                localJSONException2.getMessage();
                ac.e();
              }
          }
        }
      }
    }
    finally
    {
      g();
    }
    JSONArray localJSONArray1;
    JSONArray localJSONArray2;
    JSONArray localJSONArray3;
    String str1;
    while (true)
    {
      JSONArray localJSONArray7;
      JSONObject localJSONObject5;
      JSONArray localJSONArray6;
      JSONObject localJSONObject4;
      String str2;
      boolean bool3;
      JSONObject localJSONObject2;
      JSONArray localJSONArray5;
      JSONObject localJSONObject3;
      if ((this.f.equals(B[12])) && (a.y()))
      {
        localJSONArray1 = c();
        localJSONArray2 = b();
        localJSONArray3 = new JSONArray();
        str1 = a();
        new StringBuilder(B[10]).append(str1);
        ac.b();
        if (a(localJSONArray1, localJSONArray2, str1))
        {
          ac.c();
        }
        else if (str1 != null)
        {
          boolean bool2 = "".equals(str1);
          if (!bool2)
            try
            {
              localJSONArray3.put(new JSONObject(str1));
              localJSONArray4 = localJSONArray3;
              localJSONObject1 = new JSONObject();
              try
              {
                localJSONObject1.put(B[7], B[14]);
                localJSONObject1.put(B[1], a.m());
                localJSONObject1.put(B[6], b.c(this.e));
                localJSONObject1.put(B[3], b.d());
                if ((localJSONArray1 != null) && (localJSONArray1.length() > 0))
                {
                  localJSONObject1.put(B[17], localJSONArray1);
                  this.j = ((JSONObject)localJSONArray1.get(0)).optString(B[0]);
                }
                if ((localJSONArray2 != null) && (localJSONArray2.length() > 0))
                {
                  localJSONObject1.put(B[2], localJSONArray2);
                  this.k = localJSONArray2.toString();
                }
                if ((localJSONArray4 != null) && (localJSONArray4.length() > 0))
                {
                  localJSONObject1.put(B[9], localJSONArray4);
                  this.l = str1;
                }
                ah.a(this.e, localJSONObject1);
              }
              catch (JSONException localJSONException1)
              {
              }
            }
            catch (Exception localException2)
            {
              while (true)
                localJSONArray4 = null;
            }
        }
      }
    }
    while (true)
    {
      JSONObject localJSONObject1;
      JSONArray localJSONArray4 = localJSONArray3;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */