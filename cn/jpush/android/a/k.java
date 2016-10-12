package cn.jpush.android.a;

import android.net.wifi.ScanResult;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import org.json.JSONObject;

public final class k
  implements Comparable<k>
{
  private static final String[] z;
  public final String a;
  public final int b;
  public final String c;

  static
  {
    Object localObject1 = new String[7];
    int i = 0;
    String str1 = "+h4^44^ D'=o4D=";
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
        i3 = 85;
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
        str1 = "5`0o4<e!U&+";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "9f6";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "+r:T";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\017h5Y\0346g<K7+r:Th";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "t!7r8e";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "t! C<<<t";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 88;
        continue;
        i3 = 1;
        continue;
        i3 = 83;
        continue;
        i3 = 48;
      }
    }
  }

  public k(j paramj, ScanResult paramScanResult)
  {
    this.a = paramScanResult.BSSID;
    this.b = paramScanResult.level;
    this.c = an.c(paramScanResult.SSID);
  }

  public k(j paramj, String paramString1, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = an.c(paramString2);
  }

  public final JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str1 = this.a;
      localJSONObject.put(z[1], str1);
      int i = this.b;
      localJSONObject.put(z[0], i);
      String str2 = this.c;
      localJSONObject.put(z[3], str2);
      localJSONObject.put(z[2], 0);
      return localJSONObject;
    }
    catch (Exception localException)
    {
      ac.i();
    }
    return localJSONObject;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    k localk;
    do
    {
      return true;
      if (!(paramObject instanceof k))
        break;
      localk = (k)paramObject;
    }
    while ((localk.b == this.b) && (localk.a.equals(this.a)));
    return false;
  }

  public final int hashCode()
  {
    return this.b ^ this.a.hashCode();
  }

  public final String toString()
  {
    return z[4] + this.a + '\'' + z[5] + this.b + z[6] + this.c + '\'' + '}';
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */