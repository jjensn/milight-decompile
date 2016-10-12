package cn.jpush.android.b.a;

import android.webkit.WebView;
import cn.jpush.android.api.o;
import cn.jpush.android.util.ac;

public class b
{
  private static final String TAG;
  private static f mWebViewHelper;
  private static final String z;

  static
  {
    String str1 = "AeNeg\\s\tWlC{\tF{N,\t";
    int i = -1;
    Object localObject1 = str1.toCharArray();
    int j = localObject1.length;
    int k;
    label21: int i2;
    if (j <= 1)
    {
      k = 0;
      Object localObject2 = localObject1;
      int m = k;
      int n = j;
      Object localObject3 = localObject1;
      while (true)
      {
        int i1 = localObject3[k];
        switch (m % 5)
        {
        default:
          i2 = 30;
          label80: localObject3[k] = (char)(i2 ^ i1);
          k = m + 1;
          if (n != 0)
            break label117;
          localObject3 = localObject2;
          m = k;
          k = n;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label117: j = n;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (j > k)
        break label21;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        z = str2;
        str1 = "dyZET_EJ^nI";
        i = 0;
        break;
      case 0:
        TAG = str2;
        return;
        i2 = 44;
        break label80;
        i2 = 22;
        break label80;
        i2 = 41;
        break label80;
        i2 = 49;
        break label80;
        k = 0;
      }
    }
  }

  public b()
  {
  }

  public static void click(WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.b(paramString1, paramString2, paramString3);
  }

  public static void close(WebView paramWebView)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.a();
  }

  public static void createShortcut(WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.a(paramString1, paramString2, paramString3);
  }

  public static void download(WebView paramWebView, String paramString)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.c(paramString);
  }

  public static void download(WebView paramWebView, String paramString1, String paramString2)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.c(paramString1, paramString2);
  }

  public static void download(WebView paramWebView, String paramString1, String paramString2, String paramString3)
  {
    if (mWebViewHelper == null)
      return;
    f localf = mWebViewHelper;
    new StringBuilder(z).append(paramString3);
    ac.a();
    localf.c(paramString1, paramString2);
  }

  public static void executeMsgMessage(WebView paramWebView, String paramString)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.e(paramString);
  }

  public static void setWebViewHelper(f paramf)
  {
    if (paramf == null)
      return;
    mWebViewHelper = paramf;
  }

  public static void showTitleBar(WebView paramWebView)
  {
    if (mWebViewHelper != null)
      mWebViewHelper.b();
  }

  public static void showToast(WebView paramWebView, String paramString)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.d(paramString);
  }

  public static void startActivityByIntent(WebView paramWebView, String paramString1, String paramString2)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.b(paramString1, paramString2);
  }

  public static void startActivityByName(WebView paramWebView, String paramString1, String paramString2)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.a(paramString1, paramString2);
  }

  public static void startActivityByNameWithSystemAlert(WebView paramWebView, String paramString1, String paramString2)
  {
    if (o.a == null)
      return;
    o.a.a(paramString1, paramString2);
  }

  public static void startMainActivity(WebView paramWebView, String paramString)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.b(paramString);
  }

  public static void startPushActivity(WebView paramWebView, String paramString)
  {
    if (mWebViewHelper != null)
      mWebViewHelper.f(paramString);
  }

  public static void triggerNativeAction(WebView paramWebView, String paramString)
  {
    if (mWebViewHelper == null)
      return;
    mWebViewHelper.a(paramString);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.b.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */