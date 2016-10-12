package cn.jpush.android.data;

import android.content.Context;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import org.json.JSONObject;

public class i extends c
{
  private static final String[] R;
  public String E;
  public boolean F;
  public boolean G;
  public int H;
  public boolean I;
  public int J;
  public String K;
  public l L = new l(this);
  public String M;
  public boolean N;
  public boolean O = true;
  public String P;
  public boolean Q;
  public String a;

  static
  {
    Object localObject1 = new String[28];
    int i = 0;
    String str1 = "\007gOg(=^Cr'";
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
        i3 = 79;
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
        str1 = "9QPc<";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "9~IY*;aL";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "9QTc=";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "9~IY\"<;";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "9QVo;4k";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\007gAi!\boVn";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "9QQe *k";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "9~IY<0aUY)1`Ku'=j}h ,g";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "9QKe 6QWt#";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "9Q@t +yGt";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "9{Vi\0206";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "9{Vi\0205";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "9~IY:*b";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "9QKk.?k}s=4";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "9~IY.-zMY&6}Vg#4";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "9QGt*+";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "9QKh)7";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "9{Vi\020*m";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\007yGd\0379iGV.,f";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "9~IY!";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "9QGs=4";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "9QQo5=";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "9{Vi\020*";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "9~IY<0aU";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "9QV?=";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "9~IY:";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "\r`G~?=mVc+b.Wh$6aUho(e\002u'7y\002k <k\002+o";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        R = localObject2;
        return;
        i3 = 88;
        continue;
        i3 = 14;
        continue;
        i3 = 34;
        continue;
        i3 = 6;
      }
    }
  }

  public i()
  {
    this.o = 1;
  }

  public void a(Context paramContext)
  {
    ac.a();
    boolean bool = b.f(paramContext, this.a);
    int i = 995;
    if ((!this.F) && (bool))
    {
      ac.b();
      cn.jpush.android.helpers.i.a(this.c, 997, paramContext);
      return;
    }
    if ((this.F) && (bool))
    {
      ac.b();
      i = 998;
    }
    if (this.J == 1)
    {
      new j(this, this, paramContext, i).start();
      return;
    }
    if (this.J == 0)
    {
      new k(this, paramContext, i, this).start();
      return;
    }
    new StringBuilder(R[27]).append(this.J);
    ac.d();
  }

  public boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    ac.a();
    this.a = paramJSONObject.optString(R[20], "");
    boolean bool1;
    boolean bool2;
    label57: boolean bool3;
    label95: boolean bool4;
    if (paramJSONObject.optInt(R[26], 0) > 0)
    {
      bool1 = true;
      this.F = bool1;
      if (paramJSONObject.optInt(R[12], 0) <= 0)
        break label249;
      bool2 = true;
      this.G = bool2;
      this.H = paramJSONObject.optInt(R[11], 0);
      if (paramJSONObject.optInt(R[23], 0) <= 0)
        break label255;
      bool3 = true;
      this.I = bool3;
      this.J = paramJSONObject.optInt(R[24], 1);
      this.K = paramJSONObject.optString(R[13], "").trim();
      this.M = paramJSONObject.optString(R[4], "");
      this.E = paramJSONObject.optString(R[18], "");
      if (paramJSONObject.optInt(R[8], 0) <= 0)
        break label261;
      bool4 = true;
      label183: this.N = bool4;
      if (paramJSONObject.optInt(R[15], 1) != 1)
        break label267;
    }
    JSONObject localJSONObject;
    label261: label267: for (boolean bool5 = true; ; bool5 = false)
    {
      this.O = bool5;
      if (this.o != 1)
        break label637;
      localJSONObject = f.a(paramContext, this.c, paramJSONObject, R[2]);
      if (localJSONObject != null)
        break label273;
      return false;
      bool1 = false;
      break;
      label249: bool2 = false;
      break label57;
      label255: bool3 = false;
      break label95;
      bool4 = false;
      break label183;
    }
    label273: l locall = this.L;
    ac.a();
    locall.a = localJSONObject.optString(R[5], "");
    locall.b = localJSONObject.optString(R[9], "").trim();
    locall.c = localJSONObject.optString(R[3], "");
    locall.d = localJSONObject.optString(R[25], "");
    boolean bool6;
    boolean bool7;
    if (localJSONObject.optInt(R[7], 0) == 0)
    {
      bool6 = true;
      locall.e = bool6;
      locall.f = localJSONObject.optString(R[22], "");
      locall.g = localJSONObject.optString(R[17], "");
      locall.h = localJSONObject.optString(R[14], "").trim();
      locall.j = localJSONObject.optString(R[21], "").trim();
      i locali = locall.o;
      if (localJSONObject.optInt(R[10], 0) != 1)
        break label645;
      bool7 = true;
      label484: locali.y = bool7;
      if (localJSONObject.optInt(R[1], 0) != 0)
        break label651;
    }
    label645: label651: for (boolean bool8 = true; ; bool8 = false)
    {
      locall.i = bool8;
      if (locall.i)
        locall.k = cn.jpush.android.util.l.a(localJSONObject.optJSONArray(R[16]));
      if (an.a(locall.m))
        locall.m = localJSONObject.optString(R[0], "").trim();
      if (an.a(locall.l))
        locall.l = localJSONObject.optString(R[6], "").trim();
      if (an.a(locall.l))
        locall.l = localJSONObject.optString(R[19], "").trim();
      label637: return true;
      bool6 = false;
      break;
      bool7 = false;
      break label484;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */