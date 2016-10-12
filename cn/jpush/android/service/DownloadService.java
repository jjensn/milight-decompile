package cn.jpush.android.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.widget.RemoteViews;
import cn.jpush.android.api.m;
import cn.jpush.android.data.c;
import cn.jpush.android.util.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DownloadService extends IntentService
{
  public static ConcurrentLinkedQueue<c> a;
  private static Bundle b;
  private static final String[] z;
  private NotificationManager c;
  private c d;
  private g e;
  private Notification f;
  private Notification.Builder g;
  private RemoteViews h;
  private Integer i = Integer.valueOf(0);
  private Integer j = Integer.valueOf(0);
  private Integer k = Integer.valueOf(0);
  private Integer l = Integer.valueOf(0);
  private Integer m = Integer.valueOf(0);
  private Handler n = new f(this);

  static
  {
    Object localObject1 = new String[22];
    int i1 = 0;
    String str1 = "c\0047\005;H\n$82U\035)\b2";
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
        i8 = 87;
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
        str1 = "b\023%\b\"S\016`\004;CK$\004 I\007/\n3\007\037!\030<\007F`\030>]\016z";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "t\037!\031#N\005'K#HK$\004 I\007/\n3\007F`\0062T\030!\f2n\017z";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = "I\004446R\037/\031\"I";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "i\004`\0169CK.\004#N\r)\b6S\002/\005y\007\0023K1N\007%;6S\003`\016:W\0379Kh\007F`";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = "J\0045\005#B\017";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "E\004$\022";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "丬輖贄滻奦敯ど讷穦呙炞冐醍旛乜轚ｪ";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "彴刦缑纷乚又畃あ穦呙伽續纭习輪Ｆ";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "丬輖奱赎さ诐穦呎烒冬釪旛之輖ｖ";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "I\0044\0021N\b!\037>H\005\037\0076^\0045\037";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "S\0168\037\bW\031/\f%B\0303";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        i1 = 12;
        str1 = "W\031/\f%B\030345F\031";
        i2 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i1] = str2;
        i1 = 13;
        str1 = "N\b/\005";
        i2 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i1] = str2;
        i1 = 14;
        str1 = "uO)\017";
        i2 = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i1] = str2;
        i1 = 15;
        str1 = "uO,\n.H\0364";
        i2 = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i1] = str2;
        i1 = 16;
        str1 = "S\0024\0072";
        i2 = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i1] = str2;
        i1 = 17;
        str1 = "I\0044\0021N\b!\037>H\005";
        i2 = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i1] = str2;
        i1 = 18;
        str1 = "曓旛爈杇嶥丬輖富殾｛诐烒冻寢袒〥";
        i2 = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i1] = str2;
        i1 = 19;
        str1 = "宮袮卅嶙乜轚寧殕ｧ讠炞冐寉袮さ";
        i2 = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i1] = str2;
        i1 = 20;
        str1 = "D\005n\001'R\030(E6I\0172\004>CE)\005#B\0054E\031h?\t-\036d*\024\"\030i4\t%\004s*\f'\bd'\t(\034b/";
        i2 = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i1] = str2;
        i1 = 21;
        str1 = "丬輖乭Ey\tK";
        i2 = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i1] = str2;
        z = localObject2;
        a = new ConcurrentLinkedQueue();
        return;
        i8 = 39;
        continue;
        i8 = 107;
        continue;
        i8 = 64;
        continue;
        i8 = 107;
      }
    }
  }

  public DownloadService()
  {
    super(z[0]);
  }

  public static void a(Context paramContext)
  {
    int i1 = a.size();
    new StringBuilder(z[1]).append(i1);
    ac.b();
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      c localc1 = (c)a.poll();
      if (localc1 == null)
        break;
      if (localc1.w)
      {
        new StringBuilder(z[2]).append(localc1.c);
        ac.b();
        ServiceInterface.a(paramContext, localc1);
      }
      else
      {
        ac.a();
        localArrayList.add(localc1);
      }
    }
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      c localc2 = (c)localIterator.next();
      a.offer(localc2);
    }
  }

  private void a(c paramc, int paramInt, long paramLong1, long paramLong2)
  {
    String str3;
    String str4;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (this.g == null)
      {
        this.g = new Notification.Builder(getApplicationContext()).setSmallIcon(17301633).setWhen(System.currentTimeMillis()).setDefaults(4).setOngoing(true);
        Intent localIntent4 = new Intent();
        PendingIntent localPendingIntent4 = PendingIntent.getActivity(getApplicationContext(), paramInt, localIntent4, 134217728);
        this.g.setContentIntent(localPendingIntent4);
      }
      str3 = paramc.s;
      str4 = z[21];
      int i2 = (int)(100.0F * ((float)paramLong1 / (float)paramLong2));
      if (paramLong2 > 0L)
        str4 = str4 + i2 + "%";
      if ((this.m != null) && (this.m.intValue() > 0))
      {
        if (this.h == null)
        {
          this.h = new RemoteViews(getPackageName(), this.m.intValue());
          this.h.setTextViewText(this.i.intValue(), str3);
          this.h.setImageViewResource(this.k.intValue(), cn.jpush.android.e.b);
        }
        this.h.setTextViewText(this.l.intValue(), i2 + "%");
        this.h.setProgressBar(this.j.intValue(), 100, i2, false);
        this.g.setContent(this.h);
        this.c.notify(paramInt, this.g.getNotification());
      }
    }
    while (true)
    {
      return;
      Intent localIntent3 = new Intent();
      PendingIntent localPendingIntent3 = PendingIntent.getActivity(getApplicationContext(), paramInt, localIntent3, 134217728);
      this.g.setContentTitle(str3).setContentText(str4).setContentIntent(localPendingIntent3);
      break;
      if (this.f == null)
      {
        this.f = new Notification();
        this.f.icon = 17301633;
        this.f.when = System.currentTimeMillis();
        this.f.flags = 2;
        this.f.defaults = 4;
        Intent localIntent2 = new Intent();
        PendingIntent localPendingIntent2 = PendingIntent.getActivity(getApplicationContext(), paramInt, localIntent2, 134217728);
        this.f.contentIntent = localPendingIntent2;
      }
      String str1 = paramc.s;
      String str2 = z[21];
      int i1 = (int)(100.0F * ((float)paramLong1 / (float)paramLong2));
      if (paramLong2 > 0L)
        str2 = str2 + i1 + "%";
      if ((this.m != null) && (this.m.intValue() > 0))
      {
        if (this.h == null)
        {
          this.h = new RemoteViews(getPackageName(), this.m.intValue());
          this.h.setTextViewText(this.i.intValue(), str1);
          this.h.setImageViewResource(this.k.intValue(), cn.jpush.android.e.b);
        }
        this.h.setTextViewText(this.l.intValue(), i1 + "%");
        this.h.setProgressBar(this.j.intValue(), 100, i1, false);
        this.f.contentView = this.h;
      }
      while (this.f != null)
      {
        this.c.notify(paramInt, this.f);
        return;
        Intent localIntent1 = new Intent();
        PendingIntent localPendingIntent1 = PendingIntent.getActivity(getApplicationContext(), paramInt, localIntent1, 134217728);
        m.a(this.f, this, str1, str2, localPendingIntent1);
      }
    }
  }

  private void a(c paramc, boolean paramBoolean)
  {
    boolean bool1 = paramc.c();
    boolean bool2;
    Intent localIntent;
    if ((paramc.a()) && (!paramBoolean))
    {
      bool2 = true;
      localIntent = new Intent();
      localIntent.putExtra(z[6], paramc);
      localIntent.setClass(getApplicationContext(), PushReceiver.class);
      localIntent.setAction(z[20]);
      if (paramc.c())
        paramc.t = z[18];
    }
    while (true)
    {
      int i1 = m.a(paramc, 0);
      Notification localNotification = m.a(getApplicationContext(), i1, localIntent, paramc, bool1, bool2);
      if (localNotification == null)
        break;
      this.c.notify(i1, localNotification);
      return;
      paramc.t = z[19];
      continue;
      localIntent = cn.jpush.android.util.b.a(getApplicationContext(), paramc, false);
      bool2 = false;
    }
    ac.e();
  }

  public static boolean a()
  {
    return a.size() > 0;
  }

  public void onCreate()
  {
    ac.b();
    super.onCreate();
    this.e = new g(this, getApplicationContext());
    this.c = ((NotificationManager)getSystemService(z[17]));
    if (b == null)
      b = new Bundle();
    try
    {
      if (this.m.intValue() == 0)
      {
        String str1 = z[15];
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = z[10];
        HashMap localHashMap1 = m.a(str1, arrayOfString1);
        if (localHashMap1.size() > 0)
          this.m = ((Integer)localHashMap1.get(z[10]));
        String str2 = z[14];
        String[] arrayOfString2 = new String[4];
        arrayOfString2[0] = z[16];
        arrayOfString2[1] = z[12];
        arrayOfString2[2] = z[13];
        arrayOfString2[3] = z[11];
        HashMap localHashMap2 = m.a(str2, arrayOfString2);
        if (localHashMap2.size() > 0)
        {
          this.i = ((Integer)localHashMap2.get(z[16]));
          this.j = ((Integer)localHashMap2.get(z[12]));
          this.k = ((Integer)localHashMap2.get(z[13]));
          this.l = ((Integer)localHashMap2.get(z[11]));
        }
      }
      return;
    }
    catch (Exception localException)
    {
      ac.h();
    }
  }

  public void onDestroy()
  {
    ac.b();
    super.onDestroy();
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    ac.b();
    this.d = ((c)paramIntent.getSerializableExtra(z[6]));
    if (this.d == null)
    {
      ac.d();
      return;
    }
    if (!Environment.getExternalStorageState().equals(z[5]))
    {
      ac.d();
      this.e.sendEmptyMessage(0);
      return;
    }
    if (this.d.x)
    {
      ac.b();
      return;
    }
    if (this.d.v)
      cn.jpush.android.helpers.i.a(this.d.c, 1012, this);
    if (!a.contains(this.d))
      a.offer(this.d);
    int i1 = m.a(this.d, 1);
    c localc = this.d;
    boolean bool;
    if (localc.e())
    {
      bool = true;
      Thread.currentThread().setPriority(1);
      new b(this, this.d, b, new e(this, bool, i1), 3000);
      return;
    }
    int i2;
    if (localc.a())
    {
      cn.jpush.android.data.i locali = (cn.jpush.android.data.i)localc;
      if (!cn.jpush.android.helpers.f.a(locali.G, locali.H, this))
      {
        a(localc, i1, 0L, 0L);
        i2 = 0;
      }
    }
    while (true)
    {
      if ((i2 != 0) || (localc.b()))
      {
        bool = true;
        break;
        i2 = 1;
        continue;
      }
      bool = false;
      break;
      i2 = 0;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.DownloadService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */