package cn.jpush.android.b.a;

import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import cn.jpush.android.api.o;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;

public final class e
{
  private static final String[] z;
  private Context a;
  private WindowManager b;
  private WebView c;
  private ImageButton d;

  static
  {
    Object localObject1 = new String[6];
    int i = 0;
    String str1 = ":MsEL,P5\001]7G/@U=\r\034lh\020u\024{e\006s\034}}\024";
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
        str1 = "t\016p\002\021yS<]]4P}\025\034";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\nZ.[Y4b1JN-t8Mj0F*l]5O?N_2";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "8@)FS7\003p\002\021yP)NN-b>[U/J)V~ m<BYt\016p\002\021t\016pN_-J+FH m<BYy\031}";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\rK8\017]:W4YU-Z}A]4F}FOyJ3Y]5J9\003\034\036J+J\034,Ss\001";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\rK8\017]:W4YU-Z}A]4F}FOyM(CPyL/\017Y4S)V\020yd4YYyV-\001\022";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 89;
        continue;
        i3 = 35;
        continue;
        i3 = 93;
        continue;
        i3 = 47;
      }
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    new StringBuilder(z[3]).append(paramString1).append(z[1]).append(paramString2);
    ac.b();
    if (an.a(paramString1))
      ac.e(z[2], z[5]);
    if (this.a == null);
    while (true)
    {
      return;
      try
      {
        Class localClass = Class.forName(paramString1);
        if (localClass != null)
        {
          Intent localIntent = new Intent(this.a, localClass);
          localIntent.putExtra(z[0], paramString2);
          localIntent.setFlags(268435456);
          this.a.startActivity(localIntent);
          ac.b();
          o.a(this.b, this.c, this.d);
          return;
        }
      }
      catch (Exception localException)
      {
        ac.e(z[2], z[4]);
      }
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.b.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */