package cn.jpush.android.data;

import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class JPushLocalNotification
  implements Serializable
{
  private static final String[] z;
  private int a = 1;
  private String b = "";
  private String c = z[0];
  private String d = z[0];
  private long e = 0L;
  private String f;
  private String g;
  private String h;
  private long i;
  private long j = 1L;
  private int k = 1;
  private String l = "";
  private String m = "";

  static
  {
    Object localObject1 = new String[15];
    int n = 0;
    String str1 = "XU";
    int i1 = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int i2 = localObject3.length;
    int i3 = 0;
    label36: Object localObject4;
    int i4;
    int i5;
    Object localObject5;
    label52: int i6;
    int i7;
    if (i2 <= 1)
    {
      localObject4 = localObject3;
      i4 = i3;
      i5 = i2;
      localObject5 = localObject3;
      i6 = localObject5[i3];
      switch (i4 % 5)
      {
      default:
        i7 = 76;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i3] = (char)(i7 ^ i6);
      i3 = i4 + 1;
      if (i5 == 0)
      {
        localObject5 = localObject4;
        i4 = i3;
        i3 = i5;
        break label52;
      }
      i2 = i5;
      localObject3 = localObject4;
      if (i2 > i3)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (i1)
      {
      default:
        localObject1[n] = str2;
        n = 1;
        str1 = "";
        localObject1 = localObject2;
        i1 = 0;
        break;
      case 0:
        localObject1[n] = str2;
        n = 2;
        str1 = "\006:\030% \021";
        i1 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[n] = str2;
        n = 3;
        str1 = "\006\n\003\"*\001\006\026\"#\006:\0032<\r";
        i1 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[n] = str2;
        n = 4;
        str1 = "\033\r\030<\023\034\034\007.";
        i1 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[n] = str2;
        n = 5;
        str1 = "\t\001(?";
        i1 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[n] = str2;
        n = 6;
        str1 = "\006:\02238\032\004\004";
        i1 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[n] = str2;
        n = 7;
        str1 = "\007\023\0229>\001\001\022\024!\033\002(\"(";
        i1 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[n] = str2;
        n = 8;
        str1 = "";
        i1 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[n] = str2;
        n = 9;
        str1 = "";
        i1 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[n] = str2;
        n = 10;
        str1 = "\006:\025>%\004\001\0229\023\001\001";
        i1 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[n] = str2;
        n = 11;
        str1 = "";
        i1 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[n] = str2;
        n = 12;
        str1 = "\005\026\020\024%\f";
        i1 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[n] = str2;
        n = 13;
        str1 = "";
        i1 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[n] = str2;
        n = 14;
        str1 = "\"5\0028$$\n\024* &\n\003\"*\001\006\026?%\007\013";
        i1 = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[n] = str2;
        z = localObject2;
        return;
        i7 = 104;
        continue;
        i7 = 101;
        continue;
        i7 = 119;
        continue;
        i7 = 75;
      }
    }
  }

  public JPushLocalNotification()
  {
  }

  private static void a(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    if (!an.a(paramString2))
      paramJSONObject.put(paramString1, paramString2);
  }

  public boolean equals(Object paramObject)
  {
    return this.j == ((JPushLocalNotification)paramObject).j;
  }

  public long getBroadcastTime()
  {
    return this.e;
  }

  public long getBuilderId()
  {
    return this.i;
  }

  public String getContent()
  {
    return this.f;
  }

  public String getExtras()
  {
    return this.h;
  }

  public long getNotificationId()
  {
    return this.j;
  }

  public String getTitle()
  {
    return this.g;
  }

  public int hashCode()
  {
    return this.j.hashCode();
  }

  public void setBroadcastTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if ((paramInt1 < 0) || (paramInt2 <= 0) || (paramInt2 > 12) || (paramInt3 <= 0) || (paramInt3 > 31) || (paramInt4 < 0) || (paramInt4 > 23) || (paramInt5 < 0) || (paramInt5 > 59) || (paramInt6 < 0) || (paramInt6 > 59))
    {
      ac.e(z[14], z[13]);
      return;
    }
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(paramInt1, paramInt2 - 1, paramInt3, paramInt4, paramInt5, paramInt6);
    Date localDate = localCalendar.getTime();
    long l1 = System.currentTimeMillis();
    if (localDate.getTime() < l1)
    {
      this.e = l1;
      return;
    }
    this.e = localDate.getTime();
  }

  public void setBroadcastTime(long paramLong)
  {
    this.e = paramLong;
  }

  public void setBroadcastTime(Date paramDate)
  {
    this.e = paramDate.getTime();
  }

  public void setBuilderId(long paramLong)
  {
    this.i = paramLong;
  }

  public void setContent(String paramString)
  {
    this.f = paramString;
  }

  public void setExtras(String paramString)
  {
    this.h = paramString;
  }

  public void setNotificationId(long paramLong)
  {
    this.j = paramLong;
  }

  public void setTitle(String paramString)
  {
    this.g = paramString;
  }

  public String toJSON()
  {
    localJSONObject1 = new JSONObject();
    try
    {
      JSONObject localJSONObject2 = new JSONObject();
      if (!an.a(this.h))
      {
        JSONObject localJSONObject3 = new JSONObject(this.h);
        localJSONObject2.put(z[6], localJSONObject3);
      }
      a(z[11], this.f, localJSONObject2);
      a(z[8], this.g, localJSONObject2);
      a(z[11], this.f, localJSONObject2);
      localJSONObject2.put(z[5], 0);
      localJSONObject1.put(z[9], localJSONObject2);
      a(z[12], this.j, localJSONObject1);
      a(z[1], this.m, localJSONObject1);
      a(z[7], this.l, localJSONObject1);
      localJSONObject1.put(z[2], this.k);
      localJSONObject1.put(z[10], this.i);
      localJSONObject1.put(z[4], 3);
      localJSONObject1.put(z[3], 1);
      return localJSONObject1.toString();
    }
    catch (JSONException localJSONException)
    {
      while (true)
        localJSONException.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.JPushLocalNotification
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */