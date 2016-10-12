package cn.jpush.android.data;

import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
  implements Serializable
{
  private static final String[] z;
  public String a;
  public String b;
  public String c;
  public String d;
  public boolean e;
  public String f;
  public String g;
  public String h;
  public boolean i;
  public String j;
  public ArrayList<String> k = new ArrayList();
  public String l;
  public String m;
  public String n;

  static
  {
    Object localObject1 = new String[14];
    int i1 = 0;
    String str1 = "IH\036y[";
    int i2 = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i3 = localObject3.length;
    int i4 = 0;
    label36: Object localObject4;
    int i5;
    int i6;
    Object localObject5;
    label52: int i7;
    int i8;
    if (i3 <= 1)
    {
      localObject4 = localObject3;
      i5 = i4;
      i6 = i3;
      localObject5 = localObject3;
      i7 = localObject5[i4];
      switch (i5 % 5)
      {
      default:
        i8 = 28;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i4] = (char)(i8 ^ i7);
      i4 = i5 + 1;
      if (i6 == 0)
      {
        localObject5 = localObject4;
        i5 = i4;
        i4 = i6;
        break label52;
      }
      i3 = i6;
      localObject3 = localObject4;
      if (i3 > i4)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (i2)
      {
      default:
        localObject1[i1] = str2;
        i1 = 1;
        str1 = "IHi\017sZr";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "IHn\025lM";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = "IHl\tn";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "IHs\001}OrE\031nD";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = "IHs\002zG";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "IH\031nD";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "IHi\005fM";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "IHn\005hDr";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "IHh\to";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "IHs\017sFHo\036p";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "w~w\r{MG{\030t";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        i1 = 12;
        str1 = "w~y\003rxvn\004";
        i2 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i1] = str2;
        i1 = 13;
        str1 = "w`\016LIp<}\\";
        i2 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i1] = str2;
        z = localObject2;
        return;
        i8 = 40;
        continue;
        i8 = 23;
        continue;
        i8 = 26;
        continue;
        i8 = 108;
      }
    }
  }

  public l(i parami)
  {
  }

  private JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[8], this.a);
      localJSONObject.put(z[10], this.b);
      localJSONObject.put(z[3], this.c);
      localJSONObject.put(z[2], this.d);
      String str1 = z[1];
      int i1;
      String str2;
      int i2;
      if (this.e)
      {
        i1 = 0;
        localJSONObject.put(str1, i1);
        localJSONObject.put(z[7], this.f);
        localJSONObject.put(z[5], this.g);
        localJSONObject.put(z[4], this.h);
        localJSONObject.put(z[6], this.j);
        str2 = z[9];
        boolean bool = this.i;
        i2 = 0;
        if (!bool)
          break label206;
      }
      while (true)
      {
        localJSONObject.put(str2, i2);
        localJSONObject.put(z[0], cn.jpush.android.util.l.a(this.k));
        return localJSONObject;
        i1 = 1;
        break;
        i2 = 1;
      }
    }
    catch (JSONException localJSONException)
    {
    }
    label206: return localJSONObject;
  }

  public final String toString()
  {
    JSONObject localJSONObject = a();
    try
    {
      localJSONObject.put(z[12], this.l);
      localJSONObject.put(z[11], this.m);
      localJSONObject.put(z[13], this.n);
      label50: return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      break label50;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */