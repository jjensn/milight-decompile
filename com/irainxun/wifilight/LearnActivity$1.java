package com.irainxun.wifilight;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.view.MyViewPager;

class LearnActivity$1
  implements View.OnClickListener
{
  LearnActivity$1(LearnActivity paramLearnActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (LearnActivity.access$1(this.this$0).getCurrentItem() < -1 + LearnActivity.access$2(this.this$0).length)
    {
      int i = 1 + LearnActivity.access$1(this.this$0).getCurrentItem();
      LearnActivity.access$1(this.this$0).setCurrentItem(i, false);
      return;
    }
    Intent localIntent = new Intent(this.this$0, DeviceListActivity.class);
    this.this$0.startActivity(localIntent);
    this.this$0.finish();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.LearnActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */