package cn.jpush.android.b.a;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import cn.jpush.android.util.ac;
import com.google.gson.jpush.k;
import com.google.gson.jpush.y;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  private static final String[] z;
  private HashMap<String, Method> a;
  private String b;
  private String c;
  private k d;

  static
  {
    Object localObject1 = new String[35];
    int i = 0;
    String str1 = "+D";
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
        i3 = 45;
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
        str1 = "\031r*{B\020?";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = ">d\035rA\030]?eL";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "+X";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "+U";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "+G";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "+Y";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\0175=|I\0215d3\b\020;~1_\021d+YV-~6^\t";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "(5";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "Te;`X\030cd";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "Tt?AT}-|CN7";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\032b2";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\032b3qH\006";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\031r*{B\020";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\025e9`";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\027v2\r\020v*r\r\021z.gT";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\032x*3K\033b0w\r\031r*{B\020?";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "]7)zY\0347(rA\035s~cL\006v3vY\021e-";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "\031r*{B\0207;kH\027b*v\r\021e,|_N";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "\026x1H\025y";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "\007c,zC\023";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "\036v(r^\027e7cYN?8fC\027c7|C\\uwhN\033y-|A\02192|J\\5";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "\035y7g\r\036d~v_\006x,)";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "T~0zY\035v2zW\025c7|CTr0w\017]jw;Z\035y:|Z],";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "\0259{`\020";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "IvepB\032d1HZ{1t\005V";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "\022b0pY\035x0;\004\017a?a\r\022*\037a_\025npc_\033c1gT\004rp`A\035t;=N\025{2;L\006p+~H\032c-?\035],7u\005\02292vC\023c6/\034]l*{_\033`|";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = "";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 116;
        continue;
        i3 = 23;
        continue;
        i3 = 94;
        continue;
        i3 = 19;
      }
    }
  }

  public d(String paramString, Class paramClass)
  {
    try
    {
      if (TextUtils.isEmpty(paramString))
        throw new Exception(z[34]);
    }
    catch (Exception localException)
    {
      Log.e(z[2], z[26] + localException.getMessage());
      return;
    }
    this.b = paramString;
    this.a = new HashMap();
    Method[] arrayOfMethod = paramClass.getDeclaredMethods();
    StringBuilder localStringBuilder = new StringBuilder(z[25]);
    localStringBuilder.append(this.b);
    localStringBuilder.append(z[28]);
    int j = arrayOfMethod.length;
    while (true)
    {
      if (i < j)
      {
        Method localMethod = arrayOfMethod[i];
        if (localMethod.getModifiers() == 9)
        {
          String str1 = a(localMethod);
          if (str1 != null)
          {
            this.a.put(str1, localMethod);
            String str2 = z[30];
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = localMethod.getName();
            localStringBuilder.append(String.format(str2, arrayOfObject));
          }
        }
      }
      else
      {
        localStringBuilder.append(z[32]);
        localStringBuilder.append(this.b);
        localStringBuilder.append(z[24]);
        localStringBuilder.append(this.b);
        localStringBuilder.append(z[29]);
        localStringBuilder.append(this.b);
        localStringBuilder.append(z[31]);
        localStringBuilder.append(this.b);
        localStringBuilder.append(z[27]);
        this.c = localStringBuilder.toString();
        new StringBuilder(z[33]).append(localStringBuilder.toString());
        ac.b();
        return;
      }
      i++;
    }
  }

  private String a(String paramString, int paramInt, Object paramObject)
  {
    String str1;
    if (paramObject == null)
      str1 = z[12];
    while (true)
    {
      String str2 = z[8];
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = str1;
      String str3 = String.format(str2, arrayOfObject);
      Log.d(z[2], this.b + z[11] + paramString + z[10] + str3);
      return str3;
      if ((paramObject instanceof String))
      {
        String str4 = ((String)paramObject).replace("\"", z[9]);
        str1 = "\"" + str4 + "\"";
      }
      else if ((!(paramObject instanceof Integer)) && (!(paramObject instanceof Long)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Double)) && (!(paramObject instanceof JSONObject)))
      {
        if (this.d == null)
          this.d = new k();
        k localk = this.d;
        if (paramObject == null)
        {
          y localy = y.a;
          StringWriter localStringWriter2 = new StringWriter();
          localk.a(localy, localStringWriter2);
          str1 = localStringWriter2.toString();
        }
        else
        {
          Class localClass = paramObject.getClass();
          StringWriter localStringWriter1 = new StringWriter();
          localk.a(paramObject, localClass, localStringWriter1);
          str1 = localStringWriter1.toString();
        }
      }
      else
      {
        str1 = String.valueOf(paramObject);
      }
    }
  }

  private static String a(Method paramMethod)
  {
    String str1 = paramMethod.getName();
    Class[] arrayOfClass = paramMethod.getParameterTypes();
    int i = arrayOfClass.length;
    if ((i <= 0) || (arrayOfClass[0] != WebView.class))
    {
      Log.w(z[2], z[1] + str1 + z[7]);
      str2 = null;
      return str2;
    }
    String str2 = str1;
    int j = 1;
    label74: Class localClass;
    if (j < i)
    {
      localClass = arrayOfClass[j];
      if (localClass != String.class)
        break label124;
      str2 = str2 + z[0];
    }
    while (true)
    {
      j++;
      break label74;
      break;
      label124: if ((localClass == Integer.TYPE) || (localClass == Long.TYPE) || (localClass == Float.TYPE) || (localClass == Double.TYPE))
        str2 = str2 + z[6];
      else if (localClass == Boolean.TYPE)
        str2 = str2 + z[4];
      else if (localClass == JSONObject.class)
        str2 = str2 + z[3];
      else
        str2 = str2 + z[5];
    }
  }

  public final String a()
  {
    return this.c;
  }

  public final String a(WebView paramWebView, String paramString)
  {
    Object localObject1;
    if (!TextUtils.isEmpty(paramString))
      try
      {
        JSONObject localJSONObject1 = new JSONObject(paramString);
        localObject1 = localJSONObject1.getString(z[14]);
        JSONArray localJSONArray1 = localJSONObject1.getJSONArray(z[17]);
        localJSONArray2 = localJSONObject1.getJSONArray(z[15]);
        int i = localJSONArray1.length();
        arrayOfObject = new Object[i + 1];
        j = 0;
        arrayOfObject[0] = paramWebView;
        k = 0;
        if (k < i)
        {
          str1 = localJSONArray1.optString(k);
          if (z[23].equals(str1))
          {
            str6 = (String)localObject1 + z[0];
            i4 = k + 1;
            if (localJSONArray2.isNull(k));
            for (str7 = null; ; str7 = localJSONArray2.getString(k))
            {
              arrayOfObject[i4] = str7;
              i5 = j;
              localObject2 = str6;
              n = i5;
              break;
            }
          }
          if (z[13].equals(str1))
          {
            str5 = (String)localObject1 + z[6];
            n = 1 + (k + j * 10);
            localObject2 = str5;
          }
          else if (z[22].equals(str1))
          {
            str4 = (String)localObject1 + z[4];
            arrayOfObject[(k + 1)] = Boolean.valueOf(localJSONArray2.getBoolean(k));
            i3 = j;
            localObject2 = str4;
            n = i3;
          }
          else
          {
            if (z[21].equals(str1))
            {
              str3 = (String)localObject1 + z[3];
              i1 = k + 1;
              if (localJSONArray2.isNull(k));
              for (localJSONObject2 = null; ; localJSONObject2 = localJSONArray2.getJSONObject(k))
              {
                arrayOfObject[i1] = localJSONObject2;
                i2 = j;
                localObject2 = str3;
                n = i2;
                break;
              }
            }
            str2 = (String)localObject1 + z[5];
            m = j;
            localObject2 = str2;
            n = m;
          }
        }
        else
        {
          localMethod = (Method)this.a.get(localObject1);
          if (localMethod == null)
            return a(paramString, 500, z[18] + (String)localObject1 + z[19]);
          if (j > 0)
          {
            arrayOfClass = localMethod.getParameterTypes();
            if (j > 0)
            {
              i6 = j - 10 * (j / 10);
              localClass = arrayOfClass[i6];
              if (localClass == Integer.TYPE)
                arrayOfObject[i6] = Integer.valueOf(localJSONArray2.getInt(i6 - 1));
              while (true)
              {
                j /= 10;
                break;
                if (localClass != Long.TYPE)
                  break label656;
                arrayOfObject[i6] = Long.valueOf(Long.parseLong(localJSONArray2.getString(i6 - 1)));
              }
            }
          }
        }
      }
      catch (Exception localException)
      {
        JSONArray localJSONArray2;
        Object[] arrayOfObject;
        while (localException.getCause() != null)
        {
          return a(paramString, 500, z[20] + localException.getCause().getMessage());
          i7 = i6 - 1;
          arrayOfObject[i6] = Double.valueOf(localJSONArray2.getDouble(i7));
          continue;
          str8 = a(paramString, 200, localMethod.invoke(null, arrayOfObject));
          return str8;
        }
        return a(paramString, 500, z[20] + localException.getMessage());
      }
    while (true)
    {
      int k;
      String str1;
      String str6;
      int i4;
      String str7;
      int i5;
      Object localObject2;
      int n;
      String str5;
      String str4;
      int i3;
      String str3;
      int i1;
      JSONObject localJSONObject2;
      int i2;
      String str2;
      int m;
      Method localMethod;
      Class[] arrayOfClass;
      int i6;
      Class localClass;
      label656: int i7;
      String str8;
      return a(paramString, 500, z[16]);
      k++;
      localObject1 = localObject2;
      int j = n;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.b.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */