package cn.jpush.android.b.a;

import android.util.Log;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class c extends WebChromeClient
{
  private static final String[] z;
  private final String a = z[0];
  private d b;
  private boolean c;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "\f&\027)@1-\031\017K7'\020)`)!\030\"W";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 35;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "e!\023&F&<]&Pe!\0238F7.\034/Fe+\022!S)-\t)O<h\022\"\0035:\022+Q ;\016l";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 69;
        break label96;
        i3 = 72;
        break label96;
        i3 = 125;
        break label96;
        i3 = 76;
        break label96;
        m = 0;
      }
    }
  }

  public c(String paramString, Class paramClass)
  {
    this.b = new d(paramString, paramClass);
  }

  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    paramJsResult.confirm();
    return true;
  }

  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    paramJsPromptResult.confirm(this.b.a(paramWebView, paramString2));
    return true;
  }

  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (paramInt <= 25)
      this.c = false;
    while (true)
    {
      super.onProgressChanged(paramWebView, paramInt);
      return;
      if (!this.c)
      {
        paramWebView.loadUrl(this.b.a());
        this.c = true;
        Log.d(z[0], z[1] + paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.b.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */