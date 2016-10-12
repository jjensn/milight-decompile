package cn.jpush.android.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import cn.jpush.android.e;
import cn.jpush.android.helpers.i;
import cn.jpush.android.util.ac;

public final class c extends WebViewClient
{
  private static final String[] z;
  private final cn.jpush.android.data.c a;

  static
  {
    Object localObject1 = new String[22];
    int i = 0;
    String str1 = "\036XhqL\034";
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
        i3 = 56;
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
        str1 = "]Tq.";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "L]ho]\020M<{Y\037Jd";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\022WeoW\032]/tV\007\\oi\026\022ZutW\035\027WT}$";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\003U`tV\\MdeL";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "]\nfm";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\022LetW\\\023";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\022WeoW\032]/tV\007\\oi\026\026AuoY]mDEl";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "UZnsL\026Wu ";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "&Km=N\022Lmx\030\032J!'";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\"LdoA MstV\024\003!";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "U]ho]\020M<{Y\037Jd";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "]Tq)";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\b\033toTQ\003#8KQD";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\027Psx[\007\004";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\022WeoW\032]/tV\007\\oi\026\026AuoY]jT_r6zU";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\022WeoW\032]/tV\007\\oi\026\022ZutW\035\027RXv7";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\022WeoW\032]/tV\007\\oi\026\026AuoY]|L\\q?";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\005PexW\\\023";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\007Puq]N";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "&Kh'\030";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "\033Mum";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 115;
        continue;
        i3 = 57;
        continue;
        i3 = 1;
        continue;
        i3 = 29;
      }
    }
  }

  public c(cn.jpush.android.data.c paramc)
  {
    this.a = paramc;
  }

  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    super.onLoadResource(paramWebView, paramString);
  }

  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
  }

  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }

  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Context localContext = paramWebView.getContext();
    new StringBuilder(z[9]).append(paramString);
    ac.c();
    String str1;
    try
    {
      str1 = String.format(z[13], new Object[] { paramString });
      if (this.a.y)
      {
        localContext.startActivity(new Intent(z[3], Uri.parse(paramString)));
        i.a(this.a.c, 1016, str1, e.e);
        return true;
      }
      if (paramString.endsWith(z[1]))
      {
        Intent localIntent1 = new Intent(z[3]);
        localIntent1.setDataAndType(Uri.parse(paramString), z[6]);
        paramWebView.getContext().startActivity(localIntent1);
        return true;
      }
    }
    catch (Exception localException)
    {
      ac.e();
      return true;
    }
    if ((paramString.endsWith(z[12])) || (paramString.endsWith(z[5])))
    {
      Intent localIntent2 = new Intent(z[3]);
      localIntent2.setDataAndType(Uri.parse(paramString), z[18]);
      paramWebView.getContext().startActivity(localIntent2);
      return true;
    }
    if (paramString.startsWith(z[21]))
    {
      paramWebView.loadUrl(paramString);
      i.a(this.a.c, 1016, str1, e.e);
    }
    else if ((paramString != null) && (paramString.startsWith(z[0])))
    {
      if ((paramString.lastIndexOf(z[14]) < 0) && (!paramString.startsWith(z[0])))
        if (paramString.indexOf("?") <= 0)
          break label630;
      label630: String str6;
      for (paramString = paramString + z[11]; ; paramString = str6)
      {
        paramString.lastIndexOf(z[14]);
        int i = paramString.indexOf("?");
        String str2 = paramString.substring(0, i);
        String str3 = paramString.substring(i);
        new StringBuilder(z[20]).append(str2);
        ac.a();
        new StringBuilder(z[10]).append(str3);
        ac.a();
        boolean bool = str2.startsWith(z[0]);
        Intent localIntent3 = null;
        if (bool)
        {
          String[] arrayOfString1 = str2.split(":");
          localIntent3 = null;
          if (arrayOfString1 != null)
          {
            int j = arrayOfString1.length;
            localIntent3 = null;
            if (j == 2)
            {
              int k = 6 + str3.indexOf(z[19]);
              int m = str3.indexOf(z[8]);
              String str4 = str3.substring(k, m);
              String str5 = str3.substring(m + 9);
              String[] arrayOfString2 = new String[1];
              arrayOfString2[0] = arrayOfString1[1];
              localIntent3 = new Intent(z[16]);
              localIntent3.setType(z[4]);
              localIntent3.putExtra(z[17], arrayOfString2);
              localIntent3.putExtra(z[15], str4);
              localIntent3.putExtra(z[7], str5);
            }
          }
        }
        if (localIntent3 != null)
          localContext.startActivity(localIntent3);
        i.a(this.a.c, 1016, str1, e.e);
        return true;
        str6 = paramString + z[2];
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */