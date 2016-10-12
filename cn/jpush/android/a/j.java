package cn.jpush.android.a;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
{
  private static final String[] z;
  private WifiManager a;
  private Context b = null;

  static
  {
    Object localObject1 = new String[9];
    int i = 0;
    String str1 = "U\025i\026=A\023z\021i\030";
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
        i3 = 29;
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
        str1 = "W\022j\007mG\037{\032y\003";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "U\025i\026";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "V\035h";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "Q\b}\020sE\031|\013";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "A\t}\rxL\bX\026{KF";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "U\025i\026'";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "C\022k\rrK\030!\017xP\021f\fnK\023aQ\\a?J,N}?@>Oq9P3Ra=[6Rl";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "A\023a\021xA\b";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 34;
        continue;
        i3 = 124;
        continue;
        i3 = 15;
        continue;
        i3 = 127;
      }
    }
  }

  public j(Context paramContext)
  {
    this.a = ((WifiManager)paramContext.getSystemService(z[2]));
    this.b = paramContext;
  }

  private List<k> a(JSONArray paramJSONArray)
  {
    ac.a();
    if (!a())
      return null;
    WifiInfo localWifiInfo = this.a.getConnectionInfo();
    k localk2;
    if (localWifiInfo != null)
    {
      k localk1 = new k(this, localWifiInfo.getBSSID(), localWifiInfo.getRssi(), localWifiInfo.getSSID());
      new StringBuilder(z[5]).append(localk1.toString());
      localk2 = localk1;
      ac.a();
    }
    while (true)
    {
      ArrayList localArrayList = new ArrayList();
      if (localk2 != null)
      {
        JSONObject localJSONObject2 = localk2.a();
        localJSONObject2.put(z[3], z[8]);
        paramJSONArray.put(localJSONObject2);
      }
      List localList;
      if (Build.VERSION.SDK_INT < 23)
        localList = this.a.getScanResults();
      while (true)
      {
        int i;
        Object localObject1;
        int j;
        Object localObject2;
        if ((localList != null) && (localList.size() > 0))
        {
          i = -200;
          Iterator localIterator = localList.iterator();
          localObject1 = null;
          while (true)
            if (localIterator.hasNext())
            {
              k localk3 = new k(this, (ScanResult)localIterator.next());
              new StringBuilder(z[6]).append(localk3.toString());
              ac.a();
              if (localk2.equals(localk3))
              {
                ac.a();
                continue;
                if ((this.b == null) || (!b.c(this.b, z[7])))
                  break label376;
                localList = this.a.getScanResults();
                break;
              }
              localArrayList.add(localk3);
              if ((localk3.c.equals(localk2.c)) || (localk3.b <= i))
                break label365;
              j = localk3.b;
              localObject2 = localk3;
            }
        }
        while (true)
        {
          localObject1 = localObject2;
          i = j;
          break;
          if (localObject1 != null)
          {
            JSONObject localJSONObject1 = localObject1.a();
            localJSONObject1.put(z[3], z[4]);
            paramJSONArray.put(localJSONObject1);
          }
          return localArrayList;
          label365: localObject2 = localObject1;
          j = i;
        }
        label376: localList = null;
      }
      localk2 = null;
    }
  }

  public final boolean a()
  {
    try
    {
      boolean bool = this.a.isWifiEnabled();
      return bool;
    }
    catch (Exception localException)
    {
      ac.i();
    }
    return false;
  }

  public final WifiManager b()
  {
    return this.a;
  }

  public final JSONArray c()
  {
    JSONArray localJSONArray = new JSONArray();
    try
    {
      localList = a(localJSONArray);
      i = 0;
      if (localList == null)
      {
        new StringBuilder(z[0]).append(i);
        ac.a();
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
          localJSONArray.put(((k)localIterator.next()).a());
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        List localList;
        localThrowable.printStackTrace();
        new StringBuilder(z[1]).append(localThrowable.getMessage());
        ac.e();
        return localJSONArray;
        int j = localList.size();
        int i = j;
      }
    }
    catch (Exception localException)
    {
      ac.i();
    }
    return localJSONArray;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */