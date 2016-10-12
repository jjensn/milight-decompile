package cn.jpush.android.api;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import cn.jpush.android.a;
import cn.jpush.android.data.c;
import cn.jpush.android.e;
import cn.jpush.android.helpers.i;
import cn.jpush.android.service.PushReceiver;
import cn.jpush.android.service.PushService;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.p;
import cn.jpush.android.util.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.zip.Adler32;

public final class m
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[37];
    int i = 0;
    String str1 = "\032Na\"$\025\027v'.\032C[$?\022K|(*\017Dz%kV\r{$?\022K|(*\017Dz%\002\037\027";
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
        i3 = 75;
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
        str1 = "\025Ba\"-\022Nt?\"\024C";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "U";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\013Lg*&\036Yp9k\tHf\0372\013H5$9[K|.'\037ct&.\b\rp99\024_;";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003[\004\0372k\\\b\n/dZ\005\0242i";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = ")\t|/";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = ")\ty*2\024Xa";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\bYt?.$Ot9\024\022@t,.$[|.<";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\026Hf8*\034HJ\"&\032Jp\0248\017La.\024\031Lg\024'\032Tz>?";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\032Na\"$\025\027v'.\032CT''5Ba\"-\022Nt?\"\024C5fk\026Hf8*\034H\\/q";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003]\037\0067rE\n\0373";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003|%?\036Cae\0054y\\\r\0028lA\002\0045rG\016\b>dC\016\017";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003]\037\0067rG\016\030";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "5Ba\"-\022Nt?\"\024C].'\013Hg";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "U]p9&\022^f\"$\025\003_\033\036(eJ\006\016(~T\f\016";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "(H{/k\013Xf#k\tHv.\"\rHqk)\tBt/(\032^ak?\024\rq.=\036Az;.\t\rq.-\022Cp/k\tHv.\"\rHg";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\035Dy.qT\002";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\023Ya;qT\002";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003[\004\0372k\\\b\n/dZ\005\024?hC\016\0074}P\031\024:R{";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\032Na\"$\025\027v'.\032C[$?\022K|(*\017Dz%kV\rx.8\bLr.\002\037\027";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "\bHa\007*\017Hf?\016\rH{?\002\025Kz";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "\032Cq9$\022I;*;\013\003[$?\022K|(*\017Dz%";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003|%?\036Cae\006.aA\002\024+Z\b\016(~";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003P\023\037)l";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "\025Ba\"-\022Nt?\"\024CJ\"/";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "\032]e";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003[\004\0372k\\\b\n/dZ\005\024/tE\016";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "\026Xy?\"$Yl;.";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003[\004\0372k\\\b\n/dZ\005\0248b[\037\0165yJ\037\002/aP";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003X\030\f$dQ";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003|%?\036Cae\0054y\\\r\0028lA\002\0045rZ\033\0165hQ\024\033)bM\022e";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "<Bak\005.aYk%\024Y|-\"\030La\"$\025\0035\f\"\rH5>;[Yzk8\023Bbe";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "\037Hy\"=\036_lk9\022N}k;\016^}k?\002]pqk";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003T\007\016)y";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = "\030C;!;\016^}e*\025Ig$\"\037\003|%?\036Cae\0054y\\\r\0028lA\002\0045rZ\033\0165hQ";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = ")\tq9*\fLw'.";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "\021]`8#$Cz?\"\035Dv*?\022B{\024\"\030B{";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 123;
        continue;
        i3 = 45;
        continue;
        i3 = 21;
        continue;
        i3 = 75;
      }
    }
  }

  public static int a(int paramInt)
  {
    int i = 17301586;
    switch (paramInt)
    {
    case 1:
    default:
    case -1:
      while (true)
      {
        return i;
        String str = z[35];
        String[] arrayOfString = new String[1];
        arrayOfString[0] = z[36];
        HashMap localHashMap = a(str, arrayOfString);
        try
        {
          int j = ((Integer)localHashMap.get(z[36])).intValue();
          i = j;
          if (i <= 0)
            return 17301618;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ac.e();
            i = 0;
          }
        }
      }
    case 0:
      return 17301647;
    case 2:
      return 17301618;
    case 3:
    }
    return 17301567;
  }

  public static int a(c paramc, int paramInt)
  {
    String str = paramc.c;
    if (!an.a(paramc.d))
      str = paramc.d;
    return a(str, paramInt);
  }

  private static int a(String paramString, int paramInt)
  {
    int j;
    if (TextUtils.isEmpty(paramString))
    {
      ac.b();
      j = 0;
    }
    do
    {
      return j;
      try
      {
        int k = Integer.valueOf(paramString).intValue();
        return k;
      }
      catch (Exception localException)
      {
        ac.d();
        Adler32 localAdler32 = new Adler32();
        localAdler32.update(paramString.getBytes());
        int i = (int)localAdler32.getValue();
        if (i < 0)
          i = Math.abs(i);
        j = i + 13889152 * paramInt;
      }
    }
    while (j >= 0);
    return Math.abs(j);
  }

  public static Notification a(Context paramContext, int paramInt, Intent paramIntent, c paramc, boolean paramBoolean1, boolean paramBoolean2)
  {
    label399: Notification localNotification1;
    if (paramBoolean1)
    {
      ac.b();
      try
      {
        int j = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 256).applicationInfo.icon;
        i = j;
        if (i < 0)
        {
          ac.d();
          return null;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        while (true)
        {
          i = -1;
          ac.g();
        }
        if (paramBoolean2)
        {
          localPendingIntent = PendingIntent.getBroadcast(paramContext, paramInt, paramIntent, 134217728);
          while (true)
          {
            if (Build.VERSION.SDK_INT < 11)
              break label399;
            localBuilder = new Notification.Builder(paramContext.getApplicationContext()).setWhen(System.currentTimeMillis()).setSmallIcon(i).setTicker(paramc.t);
            if (paramc.h)
            {
              localBuilder.setDefaults(3);
              if (cn.jpush.android.util.b.n(paramContext))
                localBuilder.setDefaults(0);
            }
            if (!an.a(paramc.A))
              try
              {
                localBitmap2 = BitmapFactory.decodeFile(paramc.A);
                if (localBitmap2 != null)
                {
                  str3 = z[5];
                  arrayOfString3 = new String[1];
                  arrayOfString3[0] = z[7];
                  localInteger3 = (Integer)a(str3, arrayOfString3).get(z[7]);
                  str4 = z[6];
                  arrayOfString4 = new String[1];
                  arrayOfString4[0] = z[8];
                  localInteger4 = (Integer)a(str4, arrayOfString4).get(z[8]);
                  if ((localInteger3 != null) && (localInteger4 != null) && (localInteger3.intValue() > 0) && (localInteger4.intValue() > 0))
                  {
                    localRemoteViews2 = new RemoteViews(paramContext.getPackageName(), localInteger4.intValue());
                    localRemoteViews2.setImageViewBitmap(localInteger3.intValue(), localBitmap2);
                    localBuilder.setContent(localRemoteViews2);
                    localBuilder.setContentIntent(localPendingIntent);
                    localNotification2 = localBuilder.getNotification();
                    localNotification2.flags = b(paramc.r);
                    return localNotification2;
                    localPendingIntent = PendingIntent.getActivity(paramContext, paramInt, paramIntent, 134217728);
                  }
                  else
                  {
                    ac.d();
                    return null;
                  }
                }
                else
                {
                  ac.d();
                  return null;
                }
              }
              catch (Exception localException2)
              {
                ac.h();
                return null;
              }
          }
        }
        while (true)
          localBuilder.setContentTitle(paramc.s).setContentText(paramc.t).setContentIntent(localPendingIntent);
        localNotification1 = new Notification();
        localNotification1.when = System.currentTimeMillis();
        localNotification1.icon = i;
        localNotification1.tickerText = paramc.t;
        localNotification1.flags = b(paramc.r);
        if (paramc.h)
        {
          localNotification1.defaults = 3;
          if (cn.jpush.android.util.b.n(paramContext))
            localNotification1.defaults = 0;
        }
        if (!an.a(paramc.A))
          try
          {
            localBitmap1 = BitmapFactory.decodeFile(paramc.A);
            if (localBitmap1 != null)
            {
              str1 = z[5];
              arrayOfString1 = new String[1];
              arrayOfString1[0] = z[7];
              localInteger1 = (Integer)a(str1, arrayOfString1).get(z[7]);
              str2 = z[6];
              arrayOfString2 = new String[1];
              arrayOfString2[0] = z[8];
              localInteger2 = (Integer)a(str2, arrayOfString2).get(z[8]);
              if ((localInteger1 != null) && (localInteger2 != null) && (localInteger1.intValue() > 0) && (localInteger2.intValue() > 0))
              {
                localRemoteViews1 = new RemoteViews(paramContext.getPackageName(), localInteger2.intValue());
                localRemoteViews1.setImageViewBitmap(localInteger1.intValue(), localBitmap1);
                localNotification1.contentView = localRemoteViews1;
                localNotification1.contentIntent = localPendingIntent;
                break label698;
              }
              ac.d();
              return null;
            }
            ac.d();
            return null;
          }
          catch (Exception localException1)
          {
            ac.h();
            return null;
          }
        else
          a(localNotification1, paramContext, paramc.s, paramc.t, localPendingIntent);
      }
    }
    else
    {
      while (true)
      {
        PendingIntent localPendingIntent;
        Notification.Builder localBuilder;
        Bitmap localBitmap2;
        String str3;
        String[] arrayOfString3;
        Integer localInteger3;
        String str4;
        String[] arrayOfString4;
        Integer localInteger4;
        RemoteViews localRemoteViews2;
        Notification localNotification2;
        Bitmap localBitmap1;
        String str1;
        String[] arrayOfString1;
        Integer localInteger1;
        String str2;
        String[] arrayOfString2;
        Integer localInteger2;
        RemoteViews localRemoteViews1;
        int i = -1;
      }
    }
    label698: return localNotification1;
  }

  public static HashMap<String, Integer> a(String paramString, String[] paramArrayOfString)
  {
    int i = 0;
    if ((an.a(paramString)) || (paramArrayOfString.length == 0))
      throw new NullPointerException(z[3]);
    HashMap localHashMap = new HashMap();
    try
    {
      String str1 = e.e.getPackageName();
      for (Class localClass : Class.forName(str1 + z[2]).getDeclaredClasses())
        if (localClass.getName().contains(paramString))
        {
          int m = paramArrayOfString.length;
          while (i < m)
          {
            String str2 = paramArrayOfString[i];
            localHashMap.put(str2, Integer.valueOf(localClass.getDeclaredField(str2).getInt(str2)));
            i++;
          }
        }
    }
    catch (Exception localException)
    {
      ac.h();
    }
    return localHashMap;
  }

  public static void a(Notification paramNotification, Context paramContext, String paramString1, String paramString2, PendingIntent paramPendingIntent)
  {
    try
    {
      Class.forName(z[21]).getDeclaredMethod(z[20], new Class[] { Context.class, CharSequence.class, CharSequence.class, PendingIntent.class }).invoke(paramNotification, new Object[] { paramContext, paramString1, paramString2, paramPendingIntent });
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public static void a(Context paramContext)
  {
    while (true)
    {
      Integer localInteger = Integer.valueOf(cn.jpush.android.helpers.b.a());
      if (localInteger.intValue() == 0)
        break;
      b(paramContext, localInteger.intValue());
    }
  }

  public static void a(Context paramContext, int paramInt)
  {
    if (paramInt <= 0);
    while (true)
    {
      return;
      for (int i = 0; i < paramInt; i++)
      {
        Integer localInteger = Integer.valueOf(cn.jpush.android.helpers.b.a());
        if (localInteger.intValue() != 0)
          b(paramContext, localInteger.intValue());
      }
    }
  }

  public static void a(Context paramContext, c paramc)
  {
    if (Thread.currentThread().getId() == PushService.a)
    {
      ac.c();
      new Thread(new n(paramContext, paramc)).start();
      return;
    }
    b(paramContext, paramc);
  }

  public static void a(Context paramContext, c paramc, int paramInt)
  {
    new StringBuilder(z[19]).append(paramc.c);
    ac.b();
    if (paramContext == null)
      paramContext = e.e;
    ((NotificationManager)paramContext.getSystemService(z[1])).cancel(a(paramc, paramInt));
  }

  public static void a(Context paramContext, String paramString)
  {
    new StringBuilder(z[9]).append(paramString);
    ac.b();
    if (paramContext == null)
      paramContext = e.e;
    NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService(z[1]);
    localNotificationManager.cancel(a(paramString, 0));
    localNotificationManager.cancel(a(paramString, 1));
  }

  private static void a(Context paramContext, Map<String, String> paramMap, int paramInt, String paramString1, String paramString2, c paramc)
  {
    ac.b(z[13], z[15]);
    Intent localIntent = new Intent(z[11]);
    a(localIntent, paramMap, paramInt);
    if (!an.a(paramString1))
      localIntent.putExtra(z[18], paramString1);
    if ((paramc.e()) && ((paramc instanceof cn.jpush.android.data.m)))
    {
      cn.jpush.android.data.m localm = (cn.jpush.android.data.m)paramc;
      if ((localm.G != 0) && (localm.G != 4))
      {
        if ((localm.L != null) && (localm.L.startsWith(z[16])))
        {
          localm.L = localm.L.replaceFirst(z[16], "");
          localIntent.putExtra(z[10], localm.L);
        }
        if ((localm.I != null) && (localm.I.size() > 0))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          String str1 = p.b(paramContext, paramc.c);
          Iterator localIterator = localm.I.iterator();
          while (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            if (str2.startsWith(z[17]))
              str2 = r.c(str2);
            if (an.a(localStringBuilder.toString()))
              localStringBuilder.append(str1).append(str2);
            else
              localStringBuilder.append(",").append(str1).append(str2);
          }
          localIntent.putExtra(z[12], localStringBuilder.toString());
        }
      }
    }
    localIntent.addCategory(paramString2);
    paramContext.sendBroadcast(localIntent, paramString2 + z[14]);
  }

  private static void a(Intent paramIntent, Map<String, String> paramMap, int paramInt)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramIntent.putExtra(str, (String)paramMap.get(str));
    }
    if (paramInt != 0)
      paramIntent.putExtra(z[4], paramInt);
  }

  private static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 0:
    default:
      return 1;
    case 1:
      return 16;
    case 2:
    }
    return 32;
  }

  public static void b(Context paramContext, int paramInt)
  {
    new StringBuilder(z[0]).append(paramInt);
    ac.b();
    if (paramContext == null)
      paramContext = e.e;
    ((NotificationManager)paramContext.getSystemService(z[1])).cancel(paramInt);
  }

  public static void b(Context paramContext, c paramc)
  {
    ac.a();
    int i = a(paramc, 0);
    NotificationManager localNotificationManager;
    String str1;
    String str2;
    String str3;
    if ((paramc.h) && (paramc.e))
    {
      localNotificationManager = (NotificationManager)paramContext.getSystemService(z[1]);
      if ((paramc instanceof cn.jpush.android.data.m))
      {
        str1 = paramc.t;
        str2 = paramc.s;
        str3 = paramc.l;
        if (!an.a(paramc.m))
          break label190;
      }
    }
    HashMap localHashMap;
    label190: for (String str4 = paramContext.getPackageName(); ; str4 = paramc.m)
    {
      localHashMap = new HashMap();
      localHashMap.put(z[29], paramc.c);
      localHashMap.put(z[33], str1);
      if (!TextUtils.isEmpty(str2))
        localHashMap.put(z[28], str2);
      if (!an.a(str3))
        localHashMap.put(z[23], str3);
      if (!an.a(str1))
        break;
      a(paramContext, localHashMap, 0, "", str4, paramc);
      return;
    }
    PushNotificationBuilder localPushNotificationBuilder = JPushInterface.b(paramc.f);
    String str5 = localPushNotificationBuilder.a();
    Notification localNotification = localPushNotificationBuilder.a(str1, localHashMap);
    if ((localNotification != null) && (!an.a(str1)))
    {
      Intent localIntent3;
      PendingIntent localPendingIntent;
      if (!paramc.e())
        if (cn.jpush.android.util.b.d(paramContext, PushReceiver.class.getCanonicalName()))
        {
          localIntent3 = new Intent(z[30] + UUID.randomUUID().toString());
          localIntent3.setClass(paramContext, PushReceiver.class);
          localIntent3.putExtra(z[26], paramc.g);
          a(localIntent3, localHashMap, i);
          localIntent3.putExtra(z[33], str1);
          localIntent3.putExtra(z[25], str4);
          if (!an.a(str5))
            localIntent3.putExtra(z[18], str5);
          localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, localIntent3, 1073741824);
          localNotification.contentIntent = localPendingIntent;
          if (!JPushInterface.a(paramc.f))
          {
            if (1 == paramc.g)
              paramc.r = 1;
            localNotification.flags = b(paramc.r);
            if (localNotification.defaults == 0)
              localNotification.defaults = 3;
          }
          if (cn.jpush.android.util.b.n(paramContext))
            localNotification.defaults = 0;
          if (localNotification != null)
            localNotificationManager.notify(i, localNotification);
          if (1 != paramc.g)
          {
            if ((e.o == null) && (e.n))
              break label711;
            if (!cn.jpush.android.helpers.b.b(i))
              cn.jpush.android.helpers.b.a(i);
            if (cn.jpush.android.helpers.b.b() > a.b(paramContext))
            {
              int j = cn.jpush.android.helpers.b.a();
              if (j != 0)
                b(paramContext, j);
            }
          }
        }
      while (true)
      {
        i.a(paramc.c, 1018, paramContext);
        a(paramContext, localHashMap, i, str5, str4, paramc);
        return;
        ac.c();
        localIntent3 = new Intent(z[34]);
        localIntent3.addCategory(str4);
        break;
        new StringBuilder(z[32]).append(((cn.jpush.android.data.m)paramc).G);
        ac.c();
        Intent localIntent1;
        if ((3 == ((cn.jpush.android.data.m)paramc).G) || (4 == ((cn.jpush.android.data.m)paramc).G) || (((cn.jpush.android.data.m)paramc).G == 0))
          localIntent1 = cn.jpush.android.util.b.a(paramContext, paramc, false);
        while (true)
        {
          localPendingIntent = PendingIntent.getActivity(paramContext, i, localIntent1, 134217728);
          break;
          if (2 == ((cn.jpush.android.data.m)paramc).G)
            localIntent1 = cn.jpush.android.util.b.a(paramContext, paramc);
          else
            localIntent1 = cn.jpush.android.util.b.a(paramContext, paramc, false);
        }
        label711: Intent localIntent2 = new Intent(paramContext, PushService.class);
        localIntent2.setAction(z[22]);
        Bundle localBundle = new Bundle();
        localBundle.putInt(z[27], 9);
        localBundle.putInt(z[24], i);
        localIntent2.putExtras(localBundle);
        paramContext.startService(localIntent2);
      }
    }
    ac.d(z[13], z[31]);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */