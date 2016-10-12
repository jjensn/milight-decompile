package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.l;
import java.util.ArrayList;
import org.json.JSONObject;

public final class m extends c
{
  private static final String[] M;
  public String E;
  public int F;
  public int G;
  public int H;
  public ArrayList<String> I = new ArrayList();
  public String J = "";
  public String K = "";
  public String L;
  public String a;

  static
  {
    Object localObject1 = new String[10];
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
        str1 = "<*\001#x.";
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
        str1 = "";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "<*\0079{";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "1\001\006;-vZ";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "<*\0279r*";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "-\032-%b4";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "<*\030>z)*\037$s<";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "<*\006\"c5\020";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        M = localObject2;
        return;
        i3 = 89;
        continue;
        i3 = 117;
        continue;
        i3 = 114;
        continue;
        i3 = 75;
      }
    }
  }

  public m()
  {
    this.o = 0;
  }

  public final void a(Context paramContext)
  {
    ac.a();
    new n(this, this, paramContext).start();
  }

  public final boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    ac.a();
    this.a = paramJSONObject.optString(M[4], "").trim();
    this.E = paramJSONObject.optString(M[9], "").trim();
    if (!f.a(this.a))
    {
      this.a = (M[5] + this.a);
      new StringBuilder(M[3]).append(this.a);
      ac.c();
    }
    this.G = paramJSONObject.optInt(M[2], 0);
    this.F = paramJSONObject.optInt(M[8], 0);
    this.H = paramJSONObject.optInt(M[1], 0);
    if ((3 == this.G) || (2 == this.G) || (1 == this.G))
      this.I = l.a(paramJSONObject.optJSONArray(M[6]));
    this.J = paramJSONObject.optString(M[0], "");
    this.K = paramJSONObject.optString(M[7], "");
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */