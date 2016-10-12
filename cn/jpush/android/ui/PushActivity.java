package cn.jpush.android.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import cn.jpush.android.api.m;
import cn.jpush.android.data.c;
import cn.jpush.android.helpers.i;
import cn.jpush.android.util.ac;
import java.util.List;

public class PushActivity extends Activity
{
  private static final String[] z;
  private boolean a = false;
  private String b;
  private FullScreenView c = null;
  private Handler d = new f(this);

  static
  {
    Object localObject1 = new String[20];
    int i = 0;
    String str1 = "\034b\013hd).\033zrlj\013ov9b\032)t#j\013)~\".\004yb?f1~r.x\007l`\023b\017px9z@qz /";
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
        i3 = 23;
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
        str1 = "\034{\035aV/z\007~8w";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "*g\002l-c!";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = " o\027fb8";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "-m\032`x\"l\017{[-w\001|c\005j";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "&~\033z\023y\013ka%k\031V{-w\001|c";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\002{\002e7!k\035zv+kNly8g\032p6lM\002fd).>|d$O\r}~:g\032p6";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\034b\013hd).\017mslb\017px9zN{r?a\033{t).\004yb?f1~r.x\007l`\023b\017px9z@qz .\032f7>k\035&{-w\001|cl/";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "%j";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\tv\032{vlj\017}vlg\035)y#zNzr>g\017e~6o\ferm";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "*|\001dH;o\027";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = ".a\np";
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
        str1 = "";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\005`\030h{%jNdd+.\032pg).\032f7?f\001~7a.";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = ".o\035lV/z\007~8wN)*l";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "8a\036Ht8g\030`c5.N47";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "-m\032`a%z\027";
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
        str1 = "";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 76;
        continue;
        i3 = 14;
        continue;
        i3 = 110;
        continue;
        i3 = 9;
      }
    }
  }

  public PushActivity()
  {
  }

  private void c()
  {
    PackageManager localPackageManager = getPackageManager();
    String str = getApplicationContext().getPackageName();
    Intent localIntent;
    if (!str.isEmpty())
    {
      localIntent = localPackageManager.getLaunchIntentForPackage(str);
      if (localIntent == null)
        ac.d(z[1], z[18]);
    }
    else
    {
      ac.d(z[1], z[19]);
      return;
    }
    localIntent.addFlags(335544320);
    startActivity(localIntent);
  }

  public final void a()
  {
    if (this.c != null)
      this.c.showTitleBar();
  }

  public final void b()
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)getSystemService(z[17]);
      ComponentName localComponentName1 = ((ActivityManager.RunningTaskInfo)localActivityManager.getRunningTasks(1).get(0)).baseActivity;
      ComponentName localComponentName2 = ((ActivityManager.RunningTaskInfo)localActivityManager.getRunningTasks(1).get(0)).topActivity;
      new StringBuilder(z[15]).append(localComponentName1.toString());
      ac.b();
      new StringBuilder(z[16]).append(localComponentName2.toString());
      ac.b();
      if ((localComponentName1 != null) && (localComponentName2 != null) && (localComponentName2.toString().equals(localComponentName1.toString())))
        c();
      finish();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        c();
    }
  }

  public void onBackPressed()
  {
    if ((this.c != null) && (this.c.webviewCanGoBack()))
    {
      this.c.webviewGoBack();
      return;
    }
    i.a(this.b, 1006, this);
    b();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      try
      {
        this.a = getIntent().getBooleanExtra(z[10], false);
        c localc = (c)getIntent().getSerializableExtra(z[11]);
        if (localc == null)
          break label197;
        this.b = localc.c;
        if (localc != null)
        {
          switch (localc.o)
          {
          default:
            new StringBuilder(z[14]).append(localc.o);
            ac.d();
            m.a(this, localc, 0);
            finish();
            return;
          case 0:
          }
          Message localMessage = new Message();
          localMessage.what = 1;
          localMessage.obj = localc;
          this.d.sendMessageDelayed(localMessage, 500L);
          return;
        }
      }
      catch (Exception localException)
      {
        ac.e(z[1], z[9]);
        localException.printStackTrace();
        finish();
        return;
      }
      ac.d(z[1], z[6]);
      finish();
      return;
      label197: ac.d(z[1], z[12]);
      finish();
      return;
    }
    ac.d(z[1], z[13]);
    finish();
  }

  protected void onDestroy()
  {
    if (this.c != null)
      this.c.destory();
    if (this.d.hasMessages(2))
      this.d.removeMessages(2);
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    if (this.c != null)
      this.c.pause();
  }

  protected void onResume()
  {
    super.onResume();
    if (this.c != null)
      this.c.resume();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.PushActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */