package cn.jpush.android.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import cn.jpush.android.e;
import cn.jpush.android.service.PushProtocol;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.util.aj;
import cn.jpush.android.util.an;
import cn.jpush.android.util.ao;
import cn.jpush.b.a.a.k;
import cn.jpush.b.a.a.n;
import com.google.gson.jpush.ab;
import com.google.gson.jpush.w;
import com.google.gson.jpush.z;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  private static Queue<cn.jpush.android.data.d> a;
  private static ab b;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[68];
    int i = 0;
    String str1 = "\005\025\027\033b\030\023\003";
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
        i3 = 7;
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
        str1 = "";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "ZP\005\001j\006\037\b\013i\002>\007\003bL";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\020\021\017\002b\022P\022\001'\005\004\007\034sV\007\017\032oV\031\b\032b\030\004\\";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\003\036\003\026w\023\023\022\013cW";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\006\033\001 f\033\025";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "&\005\025\006J\023\003\025\017`\023 \024\001d\023\003\025\001u";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\005\025\024\030n\025\025(\017j\023";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\025\037\b\032b\030\004";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\003\036\003\026w\023\023\022\013cWP\016\017tV\007\024\001i\021P\021\007s\036P,=H85\036\rb\006\004\017\001i";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "\002\t\026\013";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\005\004\007\034s\"\t\026\013=";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\"\031\013\013'\002\037F\036u\031\023\003\035tV\002\003\rb\037\006\003\n'\033\003\001@";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\027\023\022\007h\030J\024\013d\023\031\020\013c&\005\025\006J\023\003\025\017`\023P\013\035`?\024FS'";
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
        str1 = "";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\033\003\0011n\022";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "\025\037\002\013";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "ZP\013\035`?\024FS'";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = ";\025\025\035f\021\025F(n\023\034\002\035'[P\007\036w?\024\\";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "%\005\005\rb\023\024F\032hV\002\003\036h\004\004F\034b\025\025\017\030b\022PKN";
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
        str1 = "2\005\026\002n\025\021\022\013cV\035\025\t)V7\017\030bV\005\026Nw\004\037\005\013t\005\031\b\t'[P";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "\002\021\001\017k\037\021\0251t\023\001\017\n";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "ZP\025\013i\022\025\024'cL";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "A\026\003\b1\027G\002Y1\025G^\\eG\026V\013c\027DRXeD\023P\r3F\021";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "\005\025\b\nb\0049\002";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "\006\021\024\035b8\037\024\003f\032PKN'\033\003\001'cL";
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
        str1 = "\002\021\001\017k\037\021\025Nj\005\027%\001i\002\025\b\032=";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "ZP\013\035`5\037\b\032b\030\004\\";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "\025\036H\004w\003\003\016@f\030\024\024\001n\022^(!S?6/-F\"9) X\")6+";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = "\033\025\025\035f\021\025";
        j = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i] = str2;
        i = 38;
        str1 = "\033\003\001:~\006\025FS'";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = "\002\021\001\017k\037\021\0251b\004\002\t\034d\031\024\003";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = "\020\002\003\037r\023\036\005\027";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "\022\031\025\017e\032\025";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = "";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "\025\004\024\002'[P\005\003cL";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "0\021\017\002b\022P\022\001'\004\025\026\001u\002P\024\013d\023\031\020\013cV]F";
        j = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[i] = str2;
        i = 46;
        str1 = "";
        j = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[i] = str2;
        i = 47;
        str1 = "";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "\025\035\002";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        i = 50;
        str1 = "";
        j = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[i] = str2;
        i = 51;
        str1 = "";
        j = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[i] = str2;
        i = 52;
        str1 = "";
        j = 51;
        localObject1 = localObject2;
        break;
      case 51:
        localObject1[i] = str2;
        i = 53;
        str1 = "";
        j = 52;
        localObject1 = localObject2;
        break;
      case 52:
        localObject1[i] = str2;
        i = 54;
        str1 = "";
        j = 53;
        localObject1 = localObject2;
        break;
      case 53:
        localObject1[i] = str2;
        i = 55;
        str1 = "\036\004\022\036=Y_";
        j = 54;
        localObject1 = localObject2;
        break;
      case 54:
        localObject1[i] = str2;
        i = 56;
        str1 = "";
        j = 55;
        localObject1 = localObject2;
        break;
      case 55:
        localObject1[i] = str2;
        i = 57;
        str1 = "";
        j = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[i] = str2;
        i = 58;
        str1 = "";
        j = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[i] = str2;
        i = 59;
        str1 = "\025\021\024\034n\023\002\025";
        j = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[i] = str2;
        i = 60;
        str1 = "!9 '";
        j = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[i] = str2;
        i = 61;
        str1 = "V\005\024\002=";
        j = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[i] = str2;
        i = 62;
        str1 = "\025\021\024\034n\023\002\\";
        j = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[i] = str2;
        i = 63;
        str1 = "|P\007\036w%\025\005\034b\002J";
        j = 62;
        localObject1 = localObject2;
        break;
      case 62:
        localObject1[i] = str2;
        i = 64;
        str1 = "|P\007\036w?4\\";
        j = 63;
        localObject1 = localObject2;
        break;
      case 63:
        localObject1[i] = str2;
        i = 65;
        str1 = "\003\002\n";
        j = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[i] = str2;
        i = 66;
        str1 = "";
        j = 65;
        localObject1 = localObject2;
        break;
      case 65:
        localObject1[i] = str2;
        i = 67;
        str1 = "\025\021\024\034n\023\002";
        j = 66;
        localObject1 = localObject2;
        break;
      case 66:
        localObject1[i] = str2;
        z = localObject2;
        a = new ConcurrentLinkedQueue();
        b = new ab();
        return;
        i3 = 118;
        continue;
        i3 = 112;
        continue;
        i3 = 102;
        continue;
        i3 = 110;
      }
    }
  }

  private static JSONObject a(String paramString)
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      try
      {
        localJSONObject2 = new JSONObject(cn.jpush.android.a.e(paramString, ""));
        new StringBuilder(z[51]).append(localJSONObject2);
        cn.jpush.android.util.ac.a();
        return localJSONObject2;
      }
      catch (Exception localException2)
      {
        while (true)
        {
          localJSONException.printStackTrace();
          JSONObject localJSONObject2 = null;
        }
      }
    }
    catch (Exception localException1)
    {
    }
    return null;
  }

  private static void a(Context paramContext, Handler paramHandler, long paramLong)
  {
    new StringBuilder(z[50]).append(paramLong);
    cn.jpush.android.util.ac.a();
    cn.jpush.android.a.c();
    cn.jpush.android.a.a(paramContext, paramLong);
    Message.obtain(paramHandler, 1002).sendToTarget();
  }

  public static void a(Context paramContext, Handler paramHandler, long paramLong, cn.jpush.b.a.a.i parami)
  {
    int i = 0;
    k localk = (k)parami;
    int j = localk.a();
    long l1 = localk.d();
    long l2 = localk.f().a().longValue();
    long l3;
    int k;
    String str1;
    LineNumberReader localLineNumberReader;
    String str2;
    if (PushProtocol.MsgResponse(paramLong, 0, cn.jpush.android.a.x(), (byte)j, l1, l2, cn.jpush.android.a.l()) != 0)
    {
      cn.jpush.android.util.ac.b();
      while (true)
      {
        l3 = localk.d();
        k = localk.a();
        str1 = localk.h();
        new StringBuilder(z[38]).append(k).append(z[21]).append(l3);
        cn.jpush.android.util.ac.b();
        new StringBuilder(z[14]).append(str1);
        cn.jpush.android.util.ac.a();
        localLineNumberReader = new LineNumberReader(new StringReader(str1));
        try
        {
          str2 = localLineNumberReader.readLine();
          if (str2 == null)
          {
            cn.jpush.android.util.ac.e();
            return;
            new StringBuilder(z[23]).append(l1);
            cn.jpush.android.util.ac.b();
          }
          else
          {
            str3 = localLineNumberReader.readLine();
            if (str3 == null)
            {
              cn.jpush.android.util.ac.e();
              return;
            }
          }
        }
        catch (IOException localIOException)
        {
          cn.jpush.android.util.ac.i();
          return;
        }
      }
    }
    String str3;
    int m = 2 + (str2.length() + str3.length());
    String str6;
    if (str1.length() > m + 1)
      str6 = str1.substring(m);
    for (String str4 = str6; ; str4 = "")
    {
      new StringBuilder(z[22]).append(str2).append(z[29]).append(str3).append(z[35]).append(str4);
      cn.jpush.android.util.ac.a();
      switch (k)
      {
      case 3:
      case 6:
      case 21:
      case 22:
      default:
        new StringBuilder(z[24]).append(k);
        cn.jpush.android.util.ac.b();
        return;
        cn.jpush.android.util.ac.b();
      case 0:
      case 2:
      case 4:
      case 44:
      case 5:
      case 9:
      case 20:
      }
    }
    try
    {
      new StringBuilder(z[32]).append(l3);
      cn.jpush.android.util.ac.b();
      if (ServiceInterface.e(paramContext))
      {
        cn.jpush.android.util.ac.c();
        return;
      }
    }
    catch (Exception localException2)
    {
      cn.jpush.android.util.ac.i();
      return;
    }
    ao localao = new ao(z[7], z[15]);
    cn.jpush.android.data.a locala;
    if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty(str3)))
      if (!TextUtils.isEmpty(str4))
      {
        new StringBuilder(z[16]).append(l3);
        cn.jpush.android.util.ac.b();
        locala = f.a(paramContext, str4, str2, str3, l3);
        if (locala == null);
        cn.jpush.android.data.d locald;
        while (true)
        {
          localao.a();
          return;
          locald = new cn.jpush.android.data.d(locala, locala);
          if (!a.contains(locald))
            break;
          new StringBuilder(z[25]).append(locald);
          cn.jpush.android.util.ac.e();
        }
        if (a.size() >= 200)
          a.poll();
        a.offer(locald);
        if (str3.equalsIgnoreCase(z[30]))
          f.a(paramContext, locala);
      }
    while (true)
    {
      String str5 = l3;
      new StringBuilder(z[26]).append(i);
      cn.jpush.android.util.ac.b();
      if ((i & 0x1) != 0)
      {
        cn.jpush.android.util.ac.b();
        Intent localIntent2 = new Intent(z[17]);
        localIntent2.putExtra(z[31], str3);
        localIntent2.putExtra(z[33], str2);
        localIntent2.putExtra(z[37], str4);
        localIntent2.putExtra(z[19], str5);
        localIntent2.putExtra(z[36], locala.g);
        localIntent2.addCategory(str2);
        paramContext.sendOrderedBroadcast(localIntent2, str2 + z[27]);
      }
      if ((i & 0x2) == 0)
        break;
      cn.jpush.android.util.ac.b();
      if ((an.a(locala.i)) && (an.a(locala.l)))
        break;
      cn.jpush.android.util.b.b(paramContext, locala);
      break;
      if (locala.e)
      {
        i = 1;
        if (locala.b != 4)
          continue;
        i = 3;
        continue;
        cn.jpush.android.util.ac.e();
        break;
        cn.jpush.android.util.ac.d();
        break;
        i.a(paramContext);
        return;
        aj.a(paramContext);
        return;
        a(paramContext, paramHandler, 0L);
        return;
        i.b(paramContext);
        return;
        Message.obtain(paramHandler, 1009, new n(Long.valueOf(b(str4)).longValue(), localk.f().b(), 0, null, 0)).sendToTarget();
        try
        {
          JSONObject localJSONObject = new JSONObject(str4);
          int n = localJSONObject.optInt(z[20], cn.jpush.android.api.d.i);
          long l4 = localJSONObject.optLong(z[0]);
          Intent localIntent1 = new Intent();
          localIntent1.addCategory(e.c);
          localIntent1.setAction(z[18]);
          localIntent1.putExtra(z[39], n);
          localIntent1.putExtra(z[28], l4);
          paramContext.sendBroadcast(localIntent1);
          return;
        }
        catch (Exception localException1)
        {
          new StringBuilder(z[34]).append(str4);
          cn.jpush.android.util.ac.d();
          return;
        }
      }
      i = 2;
    }
  }

  private static void a(Context paramContext, JSONObject paramJSONObject)
  {
    cn.jpush.android.util.ac.b();
    try
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject(z[9]);
      new StringBuilder(z[1]).append(localJSONObject);
      cn.jpush.android.util.ac.b();
      int i = localJSONObject.optInt(z[11]);
      new StringBuilder(z[13]).append(i);
      cn.jpush.android.util.ac.a();
      switch (i)
      {
      default:
        new StringBuilder(z[3]).append(i);
        cn.jpush.android.util.ac.b();
        return;
      case 1:
        String str1 = localJSONObject.optString(z[6]);
        String str2 = localJSONObject.optString(z[8]);
        localIntent = new Intent();
        localIntent.setClassName(str1, str2);
        localComponentName = paramContext.startService(localIntent);
        if (localComponentName == null)
        {
          cn.jpush.android.util.ac.d(z[7], z[4] + localIntent + z[2] + localComponentName);
          return;
        }
      case 2:
      case 10:
      }
    }
    catch (JSONException localJSONException)
    {
      Intent localIntent;
      ComponentName localComponentName;
      cn.jpush.android.util.ac.b(z[7], z[10], localJSONException);
      return;
      cn.jpush.android.util.ac.b(z[7], z[12] + localIntent + z[2] + localComponentName);
      return;
    }
    catch (Exception localException)
    {
      cn.jpush.android.util.ac.b(z[7], z[5], localException);
      return;
    }
    cn.jpush.android.util.ac.b();
    return;
    cn.jpush.android.util.ac.b();
  }

  private static long b(String paramString)
  {
    try
    {
      w localw1 = b.a(paramString);
      if (!(localw1 instanceof z))
      {
        cn.jpush.android.util.ac.e();
        return 0L;
      }
      w localw2 = localw1.h().b(z[0]);
      if ((localw2 != null) && ((localw2 instanceof com.google.gson.jpush.ac)))
        return localw2.e();
      cn.jpush.android.util.ac.e();
      return 0L;
    }
    catch (com.google.gson.jpush.af localaf)
    {
      cn.jpush.android.util.ac.e();
    }
    return 0L;
  }

  public static void b(Context paramContext, Handler paramHandler, long paramLong, cn.jpush.b.a.a.i parami)
  {
    cn.jpush.android.util.ac.a();
    cn.jpush.b.a.a.b localb = (cn.jpush.b.a.a.b)parami;
    long l = localb.a();
    int i = PushProtocol.CtrlResponse(paramLong, 0, cn.jpush.android.a.x(), l, cn.jpush.android.a.n(), cn.jpush.android.a.l());
    new StringBuilder(z[40]).append(i);
    cn.jpush.android.util.ac.a();
    if (i != 0)
      cn.jpush.android.util.ac.d(z[7], z[45] + l);
    String str;
    while (true)
    {
      if (i == 0)
      {
        str = localb.d();
        new StringBuilder(z[47]).append(str);
        cn.jpush.android.util.ac.b();
        if (!an.a(str))
          break;
        cn.jpush.android.util.ac.d();
      }
      return;
      new StringBuilder(z[23]).append(l);
      cn.jpush.android.util.ac.b();
    }
    JSONObject localJSONObject1;
    try
    {
      localJSONObject1 = a(str);
      int j = localJSONObject1.optInt(z[49]);
      new StringBuilder(z[44]).append(j);
      cn.jpush.android.util.ac.b();
      switch (j)
      {
      case 6:
      case 21:
      case 22:
      default:
        new StringBuilder(z[46]).append(j);
        cn.jpush.android.util.ac.d();
        return;
      case 5:
      case 4:
      case 9:
      case 44:
      case 50:
      case 51:
      }
    }
    catch (JSONException localJSONException)
    {
      cn.jpush.android.util.ac.a(z[7], z[10], localJSONException);
      return;
      localJSONObject2 = localJSONObject1.getJSONObject(z[9]);
      new StringBuilder(z[1]).append(localJSONObject2);
      cn.jpush.android.util.ac.b();
      if (localJSONObject2.optBoolean(z[42]))
      {
        cn.jpush.android.util.ac.b(z[7], z[43]);
        cn.jpush.android.a.c(paramContext, false);
        return;
      }
    }
    catch (Exception localException)
    {
      cn.jpush.android.util.ac.b(z[7], z[5], localException);
      return;
    }
    JSONObject localJSONObject2;
    cn.jpush.android.util.ac.b(z[7], z[48]);
    cn.jpush.android.a.c(paramContext, true);
    a(paramContext, paramHandler, localJSONObject2.optLong(z[41]));
    return;
    i.a(paramContext);
    return;
    i.b(paramContext);
    return;
    aj.a(paramContext);
    return;
    a(paramContext, localJSONObject1);
    return;
    b(paramContext, localJSONObject1);
  }

  private static void b(Context paramContext, JSONObject paramJSONObject)
  {
    cn.jpush.android.util.ac.b();
    try
    {
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject(z[9]);
      new StringBuilder(z[1]).append(localJSONObject1);
      cn.jpush.android.util.ac.b();
      boolean bool = localJSONObject1.optBoolean(z[58], false);
      String str1 = localJSONObject1.optString(z[56], "");
      String str2 = localJSONObject1.optString(z[57], "");
      String str3 = localJSONObject1.optString(z[53], "");
      JSONArray localJSONArray = localJSONObject1.optJSONArray(z[59]);
      if (localJSONArray != null)
      {
        i = 0;
        if (i < localJSONArray.length())
        {
          localJSONObject2 = localJSONArray.getJSONObject(i);
          if (localJSONObject2 == null)
            break label492;
          str4 = localJSONObject2.optString(z[67], "");
          str5 = localJSONObject2.optString(z[65], "");
          if ((an.a(str4)) || (an.a(str5)))
            break label492;
          j = cn.jpush.android.util.af.a(str4);
          if (!str5.startsWith(z[55]))
            str5 = z[55] + str5;
          if (!str5.endsWith("/"))
            str5 = str5 + "/";
          if (j != -1)
            cn.jpush.android.a.a(paramContext, j, str5);
          new StringBuilder(z[62]).append(str4).append(z[61]).append(str5).append(z[54]).append(j);
          cn.jpush.android.util.ac.a();
          break label492;
        }
      }
      if (!an.a(str1))
        cn.jpush.android.a.f(paramContext, str1);
      if (an.a(str2))
        cn.jpush.android.a.g(paramContext, str2);
      if (an.a(str3))
        cn.jpush.android.a.h(paramContext, str3);
      new StringBuilder(z[52]).append(str1).append(z[64]).append(str2).append(z[63]).append(str3).append(z[66]).append(bool);
      cn.jpush.android.util.ac.b();
      if (!bool)
        return;
      if ((cn.jpush.android.util.b.c(paramContext).toUpperCase().startsWith(z[60])) && (an.a(cn.jpush.android.a.n(paramContext))))
      {
        cn.jpush.android.a.d(paramContext, true);
        return;
      }
      cn.jpush.android.util.af.a(paramContext);
      return;
    }
    catch (Exception localException)
    {
      cn.jpush.android.util.ac.b(z[7], z[5], localException);
      return;
    }
    while (true)
    {
      int i;
      JSONObject localJSONObject2;
      String str4;
      String str5;
      int j;
      label492: i++;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */