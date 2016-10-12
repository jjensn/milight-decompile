package com.irainxun.wifilight.fragment;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class FUT090ColorFragment$3
  implements Runnable
{
  FUT090ColorFragment$3(FUT090ColorFragment paramFUT090ColorFragment)
  {
  }

  public void run()
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)FUT090ColorFragment.access$32(this.this$0).getLayoutParams();
    int i = localLayoutParams.leftMargin + FUT090ColorFragment.access$32(this.this$0).getWidth() / 2;
    int j = localLayoutParams.topMargin + FUT090ColorFragment.access$32(this.this$0).getHeight() / 2;
    MyApp.rain_curColor = FUT090ColorFragment.access$33(this.this$0).getPixel(i, j);
    FUT090ColorFragment.access$34(this.this$0).setTextColor(MyApp.rain_curColor);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT090ColorFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */