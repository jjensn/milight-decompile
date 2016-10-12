package com.irainxun.wifilight;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

class LearnActivity$MyAdapter extends PagerAdapter
{
  private LearnActivity$MyAdapter(LearnActivity paramLearnActivity)
  {
  }

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)LearnActivity.access$0(this.this$0).get(paramInt));
  }

  public int getCount()
  {
    return LearnActivity.access$0(this.this$0).size();
  }

  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.addView((View)LearnActivity.access$0(this.this$0).get(paramInt));
    return LearnActivity.access$0(this.this$0).get(paramInt);
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.LearnActivity.MyAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */