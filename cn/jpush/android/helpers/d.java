package cn.jpush.android.helpers;

import android.content.Context;
import cn.jpush.android.c;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ak;

public final class d extends c
{
  private static final String[] z;
  private Context a;

  static
  {
    Object localObject1 = new String[13];
    int i = 0;
    String str1 = "Eq\tD|b}\034Ysdp,X~{]B|m{\017\rxr>\034D~g2]Cuw\033Dyjj\024BtBz]\027:";
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
        i3 = 26;
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
        str1 = "l{\t\rsej\030Jy>\037T:jw\031A6+u\030T ";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "'>\013Lv~{G";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "Eq\tD|b}\034Ysdp,X~{]Nuej\034Dtx>\037T:jw\031A6+p\022Ysmw\036Lnbq\023d~+$]";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "l{\t\rxdq\021H{e>\037T:jw\031A6+u\030T ";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "hq\020@s>\024Cnny\030_:ig]LsorQ\rqngG";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "l{\t\rvdp\032\rxr>\034D~g2]Fr$";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "hq\020@s>\037Bug{\034C:ig]LsorQ\rqngG";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "l{\t\rIl\024C}&z\034Y{+|\004\r{bz\021\001:`{\004\027";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "hq\020@s>.Yhbp\032\rxr>\034D~g2]Fr$";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "hq\020@s>\021Btl>\037T:jw\031A6+u\030T ";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "Eq\tD|b}\034Ysdp,X~{]J>\016D`n>\037T:jw\031A6+m\024W+$]";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "Eq\tD|b}\034Ysdp,X~{]]ugr]Oc+\024Iv'>\023Bnbx\024N{w\022CSo>G\r";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 11;
        continue;
        i3 = 30;
        continue;
        i3 = 125;
        continue;
        i3 = 45;
      }
    }
  }

  public d(Context paramContext)
  {
    this.a = paramContext;
  }

  public final int a()
  {
    int i = e.a();
    new StringBuilder(z[12]).append(i);
    ac.a();
    return i;
  }

  public final int a(String paramString, int paramInt)
  {
    int i = ak.b(this.a, paramString, paramInt);
    new StringBuilder(z[1]).append(paramString).append(z[2]).append(i);
    ac.a();
    return i;
  }

  public final long a(String paramString, long paramLong)
  {
    long l = ak.b(this.a, paramString, paramLong);
    new StringBuilder(z[6]).append(paramString).append(z[2]).append(l);
    ac.a();
    return l;
  }

  public final String a(String paramString1, String paramString2)
  {
    String str = ak.b(this.a, paramString1, paramString2);
    new StringBuilder(z[8]).append(paramString1).append(z[2]).append(str);
    ac.a();
    return str;
  }

  public final void a(int paramInt, long paramLong, boolean paramBoolean, float paramFloat, double paramDouble, String paramString)
  {
  }

  public final boolean a(int paramInt)
  {
    new StringBuilder(z[0]).append(paramInt);
    ac.a();
    return e.a(paramInt);
  }

  public final boolean a(String paramString, boolean paramBoolean)
  {
    boolean bool = ak.b(this.a, paramString, paramBoolean);
    new StringBuilder(z[4]).append(paramString).append(z[2]).append(bool);
    ac.a();
    return bool;
  }

  public final int b()
  {
    int i = e.b();
    new StringBuilder(z[11]).append(i);
    ac.a();
    return i;
  }

  public final void b(String paramString, int paramInt)
  {
    new StringBuilder(z[5]).append(paramString).append(z[2]).append(paramInt);
    ac.a();
    ak.a(this.a, paramString, paramInt);
  }

  public final void b(String paramString, long paramLong)
  {
    new StringBuilder(z[10]).append(paramString).append(z[2]).append(paramLong);
    ac.a();
    ak.a(this.a, paramString, paramLong);
  }

  public final void b(String paramString1, String paramString2)
  {
    new StringBuilder(z[9]).append(paramString1).append(z[2]).append(paramString2);
    ac.a();
    ak.a(this.a, paramString1, paramString2);
  }

  public final void b(String paramString, boolean paramBoolean)
  {
    new StringBuilder(z[7]).append(paramString).append(z[2]).append(paramBoolean);
    ac.a();
    ak.a(this.a, paramString, paramBoolean);
  }

  public final boolean b(int paramInt)
  {
    new StringBuilder(z[3]).append(paramInt);
    ac.a();
    return e.b(paramInt);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */