package cn.jpush.android.data;

import cn.jpush.android.util.an;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  private static final String[] z;
  public int a;
  public String b;
  public String c;
  public String d;
  public String e;

  static
  {
    Object localObject1 = new String[8];
    int i = 0;
    String str1 = ">X";
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
        i3 = 47;
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
        str1 = "B\026";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "A\\\r`\\\n\025";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\026W\032";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\016S\013pC";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\016S\013pC\021B\017";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\017E\032";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\026_\020p";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 98;
        continue;
        i3 = 54;
        continue;
        i3 = 125;
        continue;
        i3 = 21;
      }
    }
  }

  public e()
  {
  }

  public e(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramInt;
    this.e = paramString1;
    this.c = paramString3;
    this.b = paramString2;
    this.d = paramString4;
  }

  public final int a()
  {
    return toString().getBytes().length;
  }

  public final JSONObject b()
  {
    JSONObject localJSONObject = new JSONObject();
    if ((an.a(this.d)) || (an.a(this.e)) || (an.a(this.b)) || (an.a(this.c)));
    for (int i = 0; i == 0; i = 1)
      return null;
    try
    {
      localJSONObject.put(z[4], this.a);
      localJSONObject.put(z[5], this.e);
      localJSONObject.put(z[7], this.d);
      localJSONObject.put(z[3], this.b);
      localJSONObject.put(z[6], this.c);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }

  public final int hashCode()
  {
    return super.hashCode();
  }

  public final String toString()
  {
    if ((this.c != null) && (this.c.contains(z[0])))
      this.c.replaceAll(z[0], z[2]);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.a).append(z[1]);
    localStringBuffer.append(this.e).append(z[1]);
    localStringBuffer.append(this.d).append(z[1]);
    localStringBuffer.append(this.b).append(z[1]);
    localStringBuffer.append(this.c).append(z[1]);
    return localStringBuffer.toString();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */