package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.api.m;
import cn.jpush.android.helpers.i;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import org.json.JSONObject;

public final class s extends c
{
  private static final String[] J;
  public String E;
  public String F;
  public String G;
  public String H;
  public String I;
  public int a;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = "_u7`\024";
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
        i3 = 33;
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
        str1 = "_u?qSE";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "_u3jGF";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "_u.}QL";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "_u/vM";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "|D1jN^DzrHMO5$UPZ?$\f\t";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        J = localObject2;
        return;
        i3 = 41;
        continue;
        i3 = 42;
        continue;
        i3 = 90;
        continue;
        i3 = 4;
      }
    }
  }

  public s()
  {
    this.o = 2;
  }

  public final void a(Context paramContext)
  {
    ac.a();
    i.a(this.c, 995, paramContext);
    if (this.a == 0)
    {
      if (b.b(paramContext))
        ServiceInterface.a(paramContext, this);
      return;
    }
    if (this.a == 1)
    {
      m.a(paramContext, this);
      return;
    }
    new StringBuilder(J[5]).append(this.a);
    ac.b();
  }

  public final boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    ac.a();
    this.a = paramJSONObject.optInt(J[3], 0);
    this.E = paramJSONObject.optString(J[4], "");
    this.F = paramJSONObject.optString(J[1], "");
    this.H = paramJSONObject.optString(J[0], "");
    this.G = paramJSONObject.optString(J[2], "");
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */