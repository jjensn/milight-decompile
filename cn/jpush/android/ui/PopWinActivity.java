package cn.jpush.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cn.jpush.android.b.a.a;
import cn.jpush.android.b.a.f;
import cn.jpush.android.data.m;
import cn.jpush.android.helpers.i;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import java.io.File;

public class PopWinActivity extends Activity
{
  public static f a;
  private static final String[] z;
  private String b;
  private WebView c;
  private cn.jpush.android.data.c d = null;

  static
  {
    Object localObject1 = new String[17];
    int i = 0;
    String str1 = "kL7r\034XM-l4O@d}8O\031\nO\021w\031-t)^W0;";
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
        i3 = 93;
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
        str1 = "xX*:3TMd}8O\0313?mP!m}RWdv<BV1n}]P(|";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "kU!{.^\031%~9\033U%c2NMdh8HV1h>^\031.j(HQ\033j2KN-t\002WX=u(O\027<w1\033M+:/^Jkv<BV1n}\032";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "R]";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "HQ+m\bIUd'}";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "lX6t4U^ｈt(WUdw8HJ%}8\033\\*n4O@e:\036WV7}kL7r\034XM-l4O@e";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "~A0h<\033]%n<\033P7:3TMdi8IP%v4AX&v8\032";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "QI1i5dI+j*RW\033v<BV1n";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "kU!{.^\0311i8\033]!|<NU0:>T]!:4U\031.j(HQ\033j2KN-t\002WX=u(O\027<w1\032";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "H\\%h>S{+b\027ZO%X/R]#\002";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "]P(g\024\026";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "YV c";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "qi1i5l\\&";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "WX=u(O";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "kL7r\034XM-l4O@";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "LO\024u-LP*";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "]K+w\002LX=";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        z = localObject2;
        a = null;
        return;
        i3 = 59;
        continue;
        i3 = 57;
        continue;
        i3 = 68;
        continue;
        i3 = 26;
      }
    }
  }

  public PopWinActivity()
  {
  }

  public final void a(String paramString)
  {
    if ((this.d != null) && (this.c != null) && ((this.d instanceof m)))
    {
      if (!an.a(paramString))
      {
        ((m)this.d).a = paramString;
        Intent localIntent = new Intent(this, PushActivity.class);
        localIntent.putExtra(z[11], this.d);
        localIntent.putExtra(z[16], true);
        startActivity(localIntent);
      }
      finish();
    }
  }

  public void onBackPressed()
  {
    super.onBackPressed();
    i.a(this.b, 1006, this);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      try
      {
        this.d = ((cn.jpush.android.data.c)getIntent().getSerializableExtra(z[11]));
        if (this.d == null)
          break label451;
        this.b = this.d.c;
        int i = getResources().getIdentifier(z[7], z[13], getPackageName());
        if (i == 0)
        {
          ac.e(z[14], z[2]);
          finish();
        }
        while (true)
        {
          localm = (m)this.d;
          str1 = localm.L;
          str2 = localm.a;
          new StringBuilder(z[4]).append(str2);
          ac.b();
          if ((TextUtils.isEmpty(str1)) || (!new File(str1.replace(z[10], "")).exists()))
            break label439;
          this.c.loadUrl(str1);
          i.a(this.b, 1000, this);
          return;
          setContentView(i);
          j = getResources().getIdentifier(z[15], z[3], getPackageName());
          if (j != 0)
            break;
          ac.e(z[14], z[8]);
          finish();
        }
      }
      catch (Exception localException)
      {
        ac.e(z[14], z[6]);
        localException.printStackTrace();
        finish();
        return;
      }
      while (true)
      {
        m localm;
        String str1;
        String str2;
        int j;
        this.c = ((WebView)findViewById(j));
        if (this.c == null)
        {
          ac.e(z[14], z[1]);
          finish();
        }
        else
        {
          this.c.setScrollbarFadingEnabled(true);
          this.c.setScrollBarStyle(33554432);
          WebSettings localWebSettings = this.c.getSettings();
          localWebSettings.setDomStorageEnabled(true);
          cn.jpush.android.util.b.a(localWebSettings);
          this.c.setBackgroundColor(0);
          a = new f(this, this.d);
          this.c.removeJavascriptInterface(z[9]);
          this.c.setWebChromeClient(new a(z[12], cn.jpush.android.b.a.b.class));
          this.c.setWebViewClient(new c(this.d));
          cn.jpush.android.b.a.b.setWebViewHelper(a);
          continue;
          label439: this.c.loadUrl(str2);
        }
      }
      label451: ac.d(z[14], z[5]);
      finish();
      return;
    }
    ac.d(z[14], z[0]);
    finish();
  }

  protected void onDestroy()
  {
    if (this.c != null)
    {
      this.c.removeAllViews();
      this.c.destroy();
      this.c = null;
    }
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    if (this.c != null)
      this.c.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    if (this.c != null)
    {
      this.c.onResume();
      cn.jpush.android.b.a.b.setWebViewHelper(a);
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.PopWinActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */