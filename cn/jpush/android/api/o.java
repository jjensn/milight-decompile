package cn.jpush.android.api;

import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageButton;
import cn.jpush.android.b.a.e;

public final class o
{
  public static e a = null;
  private static int b = 400;
  private static int c = 600;

  public static void a(WindowManager paramWindowManager, WebView paramWebView, ImageButton paramImageButton)
  {
    paramWindowManager.removeView(paramWebView);
    paramWindowManager.removeView(paramImageButton);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */