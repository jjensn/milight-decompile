package cn.jpush.android.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.jpush.android.b.a.f;
import cn.jpush.android.data.m;
import cn.jpush.android.util.ac;

public class FullScreenView extends LinearLayout
{
  private static final String TAG;
  public static f webViewHelper;
  private static final String[] z;
  private View.OnClickListener btnBackClickListener = new a(this);
  private ImageButton imgBtnBack;
  private final Context mContext;
  private WebView mWebView;
  private RelativeLayout rlTitleBar;
  private TextView tvTitle;

  static
  {
    Object localObject1 = new String[9];
    int i = 0;
    String str1 = "R\017_\017&w\bV\006\033B\023V\024";
    int j = 8;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label37: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label53: int i2;
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
        i3 = 117;
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
        break label53;
        TAG = str2;
        str1 = "x\025R\007 f\026\t";
        j = -1;
        break;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label37;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      case 8:
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "}\036";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "r\017_\017\"q\030e\n\020c";
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
        str1 = "g\037R\021\026|8\\\033?u\fR!\007}\036T\006*";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "f\026a\n\026|\nF\020\035@\023G\017\020V\033A";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "}\027T1\034w\022C\026\006|8G\r7u\031X";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "^*F\020\035C\037Q";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "`\fa\n\026|\nF\020\035@\023G\017\020";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        z = localObject2;
        webViewHelper = null;
        return;
        i3 = 20;
        continue;
        i3 = 122;
        continue;
        i3 = 51;
        continue;
        i3 = 99;
      }
    }
  }

  public FullScreenView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  private void quitFullScreen()
  {
    try
    {
      WindowManager.LayoutParams localLayoutParams = ((Activity)this.mContext).getWindow().getAttributes();
      localLayoutParams.flags = (0xFFFFFBFF & localLayoutParams.flags);
      ((Activity)this.mContext).getWindow().setAttributes(localLayoutParams);
      ((Activity)this.mContext).getWindow().clearFlags(512);
      return;
    }
    catch (Exception localException)
    {
      ac.d();
    }
  }

  public void destory()
  {
    removeAllViews();
    if (this.mWebView != null)
    {
      this.mWebView.removeAllViews();
      this.mWebView.destroy();
      this.mWebView = null;
    }
  }

  public void initModule(Context paramContext, cn.jpush.android.data.c paramc)
  {
    m localm = (m)paramc;
    String str = localm.E;
    setFocusable(true);
    this.mWebView = ((WebView)findViewById(getResources().getIdentifier(z[2], z[1], paramContext.getPackageName())));
    this.rlTitleBar = ((RelativeLayout)findViewById(getResources().getIdentifier(z[5], z[1], paramContext.getPackageName())));
    this.tvTitle = ((TextView)findViewById(getResources().getIdentifier(z[8], z[1], paramContext.getPackageName())));
    this.imgBtnBack = ((ImageButton)findViewById(getResources().getIdentifier(z[6], z[1], paramContext.getPackageName())));
    if ((this.mWebView == null) || (this.rlTitleBar == null) || (this.tvTitle == null) || (this.imgBtnBack == null))
    {
      ac.e(TAG, z[3]);
      ((Activity)this.mContext).finish();
    }
    if (1 == localm.G)
    {
      this.rlTitleBar.setVisibility(8);
      ((Activity)paramContext).getWindow().setFlags(1024, 1024);
    }
    while (true)
    {
      this.mWebView.setScrollbarFadingEnabled(true);
      this.mWebView.setScrollBarStyle(33554432);
      WebSettings localWebSettings = this.mWebView.getSettings();
      localWebSettings.setUseWideViewPort(true);
      localWebSettings.setLoadWithOverviewMode(true);
      localWebSettings.setDomStorageEnabled(true);
      cn.jpush.android.util.b.a(localWebSettings);
      webViewHelper = new f(paramContext, paramc);
      this.mWebView.removeJavascriptInterface(z[4]);
      this.mWebView.setWebChromeClient(new cn.jpush.android.b.a.a(z[7], cn.jpush.android.b.a.b.class));
      this.mWebView.setWebViewClient(new c(paramc));
      cn.jpush.android.b.a.b.setWebViewHelper(webViewHelper);
      return;
      this.tvTitle.setText(str);
      this.imgBtnBack.setOnClickListener(this.btnBackClickListener);
    }
  }

  public void loadUrl(String paramString)
  {
    if (this.mWebView != null)
    {
      new StringBuilder(z[0]).append(paramString);
      ac.b();
      this.mWebView.loadUrl(paramString);
    }
  }

  public void pause()
  {
    if (this.mWebView != null)
      this.mWebView.onPause();
  }

  public void resume()
  {
    if (this.mWebView != null)
    {
      this.mWebView.onResume();
      cn.jpush.android.b.a.b.setWebViewHelper(webViewHelper);
    }
  }

  public void showTitleBar()
  {
    if ((this.rlTitleBar != null) && (this.rlTitleBar.getVisibility() == 8))
    {
      this.rlTitleBar.setVisibility(0);
      quitFullScreen();
      this.imgBtnBack.setOnClickListener(this.btnBackClickListener);
      if (this.mWebView != null)
        this.mWebView.postDelayed(new b(this), 1000L);
    }
  }

  public boolean webviewCanGoBack()
  {
    if (this.mWebView != null)
      return this.mWebView.canGoBack();
    return false;
  }

  public void webviewGoBack()
  {
    if (this.mWebView != null)
      this.mWebView.goBack();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.FullScreenView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */