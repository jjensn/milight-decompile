package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.api.m;
import cn.jpush.android.helpers.f;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.b;
import org.json.JSONObject;

public final class r extends i
{
  private static final String[] R;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 55;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        R = arrayOfString1;
        return;
        i3 = 24;
        break label96;
        i3 = 22;
        break label96;
        i3 = 107;
        break label96;
        i3 = 20;
        break label96;
        m = 0;
      }
    }
  }

  public r()
  {
    this.o = 3;
    this.L = null;
  }

  public final void a(Context paramContext)
  {
    ac.a();
    if (f.a(this.G, this.H, paramContext))
    {
      ServiceInterface.a(paramContext, this);
      return;
    }
    if (this.J == 1)
    {
      paramContext.startActivity(b.a(paramContext, this, true));
      return;
    }
    if (this.J == 0)
    {
      m.b(paramContext, this);
      return;
    }
    new StringBuilder(R[1]).append(this.J);
    ac.b();
  }

  public final boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    ac.a();
    boolean bool = super.a(paramContext, paramJSONObject);
    this.J = paramJSONObject.optInt(R[0], 0);
    return bool;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */