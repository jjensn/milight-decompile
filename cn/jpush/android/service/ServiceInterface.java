package cn.jpush.android.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import cn.jpush.android.api.BasicPushNotificationBuilder;
import cn.jpush.android.api.m;
import cn.jpush.android.data.c;
import cn.jpush.android.e;
import cn.jpush.android.helpers.b;
import cn.jpush.android.util.ac;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceInterface
{
  private static boolean a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[41];
    int i = 0;
    String str1 = "\"i]0H\031rI0";
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
        i3 = 60;
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
        str1 = "\"i]0H\034tR1";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "4sX6q8sO";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "4sX\nS$o";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "3rX;";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHl\036Sr\007\005Tj\013h\bB\n}\037Zy";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "2rR,Y2iU-R|nH#H4";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "?hQ Y#=U,\034 hY7Yk=";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\002xN4U2xu,H4oZ#_4";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\"xHbR>iU$U2|H+S?=Q#DqsI/\034k=";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "?rH+Z8~]6U>sc/])sI/";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "<hP6U\016iE2Y";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHlq\004Qh\013c\001Os\001y\002N";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "5x_0Y0nY\fS%tZ+_0iU-Rk";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\"xH\fS%tZ+_0iU-R\037hQ Y#=\021b_>sH'D%=U1\034?hP.\035";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "2u],[4BL#_:|['R0pY";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "?rH+Z8~]6U>sc I8yP'N\016tX";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\037hP.\0342rR6Y)i\020bL=x]1YqtR+HqWl7O9<";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "?rH+Z8~]6U>sc I8yP'N";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "0mL";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "\"xN4U2x\034#P#x]&EqnH-L";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHlo\005Rl\022i\002U";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "#i_";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHln\005^";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "#i_\035X4q];";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "!hO*c\"iS2L4y";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "0qU#O";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHl}\035T}\021c\005\\{\021";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "%|[b]=t]1\034#tXb\001q";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "%|[1";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "4'";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "\"xM\035U5";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "\"tP'R2xc2I\"uc6U<x";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "c3\rl\013";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHlu\037Th";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "\005uYbO4oJ+_4=U1\034\"iS2L4y\020bU%=K+P==[+J4=I2\0340qPbH9x\034#_%tS,OqhR6U==E-Iq~].PqoY1I<xl7O9=Q'H9rXbH>=N'O$pYbH9x\0341Y#kU!Y";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "2s\022(L$nTl]?yN-U53U,H4sHln\024Nh\rn\024Mi\021t";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = "\"xN4U2x\034+OqoI,R8s[b]=oY#X(";
        j = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i] = str2;
        i = 38;
        str1 = "2qY#N\020qP\fS%tZ+_0iU-Rq0\034!S?iY:HqtObR$qPc";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = "}=O6S!IE2Yk";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "!tXx";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        z = localObject2;
        a = false;
        return;
        i3 = 81;
        continue;
        i3 = 29;
        continue;
        i3 = 60;
        continue;
        i3 = 66;
      }
    }
  }

  public ServiceInterface()
  {
  }

  public static String a()
  {
    return z[33];
  }

  public static void a(Context paramContext)
  {
    if (e(paramContext))
      return;
    try
    {
      Intent localIntent = new Intent(paramContext, PushService.class);
      localIntent.setAction(z[34]);
      localIntent.putExtra(z[19], paramContext.getPackageName());
      paramContext.startService(localIntent);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      localSecurityException.printStackTrace();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public static void a(Context paramContext, int paramInt)
  {
    if (1 == h(paramContext))
    {
      ac.b(z[8], z[20]);
      return;
    }
    b(paramContext, false);
    cn.jpush.android.a.b(paramContext, 1);
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[21]);
    localIntent.putExtra(z[19], paramContext.getPackageName());
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, c paramc)
  {
    ac.a();
    Intent localIntent = new Intent(paramContext, DownloadService.class);
    localIntent.putExtra(z[4], paramc);
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, Integer paramInteger, BasicPushNotificationBuilder paramBasicPushNotificationBuilder)
  {
    if (paramContext == null)
    {
      ac.e(z[8], z[17]);
      return;
    }
    if ((b()) || (!e.n))
    {
      cn.jpush.android.a.a(paramContext, paramInteger, paramBasicPushNotificationBuilder.toString());
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[12]);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[11], 1);
    localBundle.putString(z[16], paramInteger);
    localBundle.putString(z[18], paramBasicPushNotificationBuilder.toString());
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static void a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (e(paramContext)))
      return;
    if ((b()) || (!e.n))
    {
      cn.jpush.android.a.a(paramContext, paramString);
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[11], 4);
    localBundle.putString(z[32], paramString);
    localIntent.setAction(z[12]);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  // ERROR //
  public static void a(Context paramContext, String paramString1, String paramString2, cn.jpush.android.api.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 121	cn/jpush/android/service/ServiceInterface:e	(Landroid/content/Context;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: instanceof 222
    //   12: ifne +8 -> 20
    //   15: aload_0
    //   16: invokevirtual 226	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: astore_0
    //   20: aload_0
    //   21: invokestatic 228	cn/jpush/android/e:a	(Landroid/content/Context;)Z
    //   24: ifeq -17 -> 7
    //   27: invokestatic 231	cn/jpush/android/a:n	()J
    //   30: lstore 4
    //   32: aload_3
    //   33: ifnull +22 -> 55
    //   36: aload_3
    //   37: getfield 237	cn/jpush/android/api/b:c	Lcn/jpush/android/api/TagAliasCallback;
    //   40: ifnull +15 -> 55
    //   43: invokestatic 242	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	()Lcn/jpush/android/service/ServiceInterface$TagAliasOperator;
    //   46: lload 4
    //   48: invokestatic 248	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   51: aload_3
    //   52: invokevirtual 251	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	(Ljava/lang/Long;Lcn/jpush/android/api/b;)V
    //   55: new 188	java/lang/StringBuilder
    //   58: dup
    //   59: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   62: bipush 28
    //   64: aaload
    //   65: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: lload 4
    //   70: invokevirtual 257	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: invokestatic 259	cn/jpush/android/util/ac:c	()V
    //   77: invokestatic 242	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	()Lcn/jpush/android/service/ServiceInterface$TagAliasOperator;
    //   80: aload_0
    //   81: invokevirtual 261	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	(Landroid/content/Context;)V
    //   84: new 123	android/content/Intent
    //   87: dup
    //   88: aload_0
    //   89: ldc 125
    //   91: invokespecial 128	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   94: astore 7
    //   96: aload 7
    //   98: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   101: bipush 27
    //   103: aaload
    //   104: invokevirtual 132	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   107: pop
    //   108: aload 7
    //   110: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   113: bipush 26
    //   115: aaload
    //   116: aload_1
    //   117: invokevirtual 141	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   120: pop
    //   121: aload 7
    //   123: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   126: bipush 29
    //   128: aaload
    //   129: aload_2
    //   130: invokevirtual 141	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   133: pop
    //   134: aload 7
    //   136: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   139: bipush 31
    //   141: aaload
    //   142: lload 4
    //   144: invokevirtual 264	android/content/Intent:putExtra	(Ljava/lang/String;J)Landroid/content/Intent;
    //   147: pop
    //   148: aload_0
    //   149: aload 7
    //   151: invokevirtual 145	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   154: pop
    //   155: return
    //   156: astore 11
    //   158: new 188	java/lang/StringBuilder
    //   161: dup
    //   162: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   165: bipush 30
    //   167: aaload
    //   168: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   171: aload 11
    //   173: invokevirtual 267	java/lang/SecurityException:getMessage	()Ljava/lang/String;
    //   176: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: invokestatic 273	cn/jpush/android/util/ac:d	()V
    //   183: aload_3
    //   184: ifnull -177 -> 7
    //   187: aload_3
    //   188: getfield 237	cn/jpush/android/api/b:c	Lcn/jpush/android/api/TagAliasCallback;
    //   191: ifnull -184 -> 7
    //   194: aload_3
    //   195: getfield 237	cn/jpush/android/api/b:c	Lcn/jpush/android/api/TagAliasCallback;
    //   198: getstatic 279	cn/jpush/android/api/d:i	I
    //   201: aload_3
    //   202: getfield 282	cn/jpush/android/api/b:a	Ljava/lang/String;
    //   205: aload_3
    //   206: getfield 285	cn/jpush/android/api/b:b	Ljava/util/Set;
    //   209: invokeinterface 291 4 0
    //   214: invokestatic 242	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	()Lcn/jpush/android/service/ServiceInterface$TagAliasOperator;
    //   217: lload 4
    //   219: invokevirtual 294	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	(J)V
    //   222: return
    //   223: astore 9
    //   225: new 188	java/lang/StringBuilder
    //   228: dup
    //   229: getstatic 108	cn/jpush/android/service/ServiceInterface:z	[Ljava/lang/String;
    //   232: bipush 30
    //   234: aaload
    //   235: invokespecial 254	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: aload 9
    //   240: invokevirtual 295	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   243: invokevirtual 270	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: invokestatic 273	cn/jpush/android/util/ac:d	()V
    //   250: aload_3
    //   251: ifnull -244 -> 7
    //   254: aload_3
    //   255: getfield 237	cn/jpush/android/api/b:c	Lcn/jpush/android/api/TagAliasCallback;
    //   258: ifnull -251 -> 7
    //   261: aload_3
    //   262: getfield 237	cn/jpush/android/api/b:c	Lcn/jpush/android/api/TagAliasCallback;
    //   265: getstatic 279	cn/jpush/android/api/d:i	I
    //   268: aload_3
    //   269: getfield 282	cn/jpush/android/api/b:a	Ljava/lang/String;
    //   272: aload_3
    //   273: getfield 285	cn/jpush/android/api/b:b	Ljava/util/Set;
    //   276: invokeinterface 291 4 0
    //   281: invokestatic 242	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	()Lcn/jpush/android/service/ServiceInterface$TagAliasOperator;
    //   284: lload 4
    //   286: invokevirtual 294	cn/jpush/android/service/ServiceInterface$TagAliasOperator:a	(J)V
    //   289: return
    //   290: astore 8
    //   292: aload 8
    //   294: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   84	155	156	java/lang/SecurityException
    //   84	155	223	java/lang/Exception
    //   84	155	290	finally
    //   158	183	290	finally
    //   225	250	290	finally
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    if (paramContext == null)
      return;
    if ((b()) || (!e.n))
    {
      cn.jpush.android.a.a(paramContext, paramBoolean);
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[12]);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[11], 5);
    localBundle.putBoolean(z[25], paramBoolean);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static boolean a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[0], paramInt1);
      localJSONObject.put(z[1], paramInt2);
      localJSONObject.put(z[3], paramInt3);
      localJSONObject.put(z[2], paramInt4);
      a(paramContext, localJSONObject.toString());
      return true;
    }
    catch (JSONException localJSONException)
    {
    }
    return false;
  }

  public static void b(Context paramContext)
  {
    if (e(paramContext))
      return;
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[23]);
    Bundle localBundle = new Bundle();
    localBundle.putString(z[22], z[22]);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static void b(Context paramContext, int paramInt)
  {
    if (h(paramContext) == 0)
    {
      ac.b(z[8], z[37]);
      return;
    }
    b(paramContext, true);
    cn.jpush.android.a.b(paramContext, 0);
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[36]);
    localIntent.putExtra(z[19], paramContext.getPackageName());
    paramContext.startService(localIntent);
  }

  static void b(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[12]);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[11], 11);
    localBundle.putString(z[15], paramString);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  static void b(Context paramContext, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    ComponentName localComponentName1 = new ComponentName(paramContext.getApplicationContext(), PushReceiver.class);
    ComponentName localComponentName2 = new ComponentName(paramContext.getApplicationContext(), AlarmReceiver.class);
    if (!paramBoolean)
    {
      ac.a();
      localPackageManager.setComponentEnabledSetting(localComponentName1, 2, 1);
      localPackageManager.setComponentEnabledSetting(localComponentName2, 2, 1);
      return;
    }
    ac.a();
    localPackageManager.setComponentEnabledSetting(localComponentName1, 1, 1);
    localPackageManager.setComponentEnabledSetting(localComponentName2, 1, 1);
  }

  public static boolean b()
  {
    return e.o != null;
  }

  public static void c(Context paramContext)
  {
    if (paramContext == null)
    {
      ac.d(z[8], z[38]);
      return;
    }
    if ((b()) || (!e.n))
    {
      m.a(paramContext.getApplicationContext());
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[12]);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[11], 10);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static void c(Context paramContext, int paramInt)
  {
    if (e(paramContext))
      return;
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[23]);
    Bundle localBundle = new Bundle();
    localBundle.putString(z[22], z[22]);
    localBundle.putInt(z[24], paramInt);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static void d(Context paramContext, int paramInt)
  {
    if (paramContext == null)
    {
      ac.d(z[8], z[14]);
      return;
    }
    new StringBuilder(z[9]).append(paramInt);
    ac.a();
    if ((b()) || (!e.n))
    {
      int i = b.b();
      new StringBuilder(z[7]).append(i);
      ac.a();
      if (paramInt < i)
      {
        int j = i - paramInt;
        new StringBuilder(z[13]).append(j);
        ac.a();
        m.a(paramContext, j);
      }
      cn.jpush.android.a.a(paramContext, paramInt);
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[12]);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[11], 2);
    localBundle.putInt(z[10], paramInt);
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static boolean d(Context paramContext)
  {
    return h(paramContext) > 0;
  }

  public static boolean e(Context paramContext)
  {
    boolean bool = d(paramContext);
    if (bool)
      ac.b(z[8], z[35]);
    return bool;
  }

  public static void f(Context paramContext)
  {
    if (e(paramContext))
      return;
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[5]);
    Bundle localBundle = new Bundle();
    localBundle.putString(z[6], a.a.name());
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  public static void g(Context paramContext)
  {
    if (e(paramContext))
      return;
    Intent localIntent = new Intent(paramContext, PushService.class);
    localIntent.setAction(z[5]);
    Bundle localBundle = new Bundle();
    localBundle.putString(z[6], a.b.name());
    localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }

  private static int h(Context paramContext)
  {
    int i = cn.jpush.android.a.c(paramContext);
    new StringBuilder(z[40]).append(Process.myPid()).append(z[39]).append(i);
    ac.b();
    return i;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.ServiceInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */