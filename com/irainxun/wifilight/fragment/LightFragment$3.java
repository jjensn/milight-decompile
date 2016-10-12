package com.irainxun.wifilight.fragment;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

class LightFragment$3
  implements Runnable
{
  LightFragment$3(LightFragment paramLightFragment)
  {
  }

  public void run()
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)LightFragment.access$20(this.this$0).getLayoutParams();
    int i = localLayoutParams.leftMargin + LightFragment.access$20(this.this$0).getWidth() / 2;
    int j = localLayoutParams.topMargin + LightFragment.access$20(this.this$0).getHeight() / 2;
    LightFragment.access$22(this.this$0, LightFragment.access$21(this.this$0).getPixel(i, j));
    LightFragment.access$18(this.this$0).setTextColor(LightFragment.access$17(this.this$0));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.LightFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */