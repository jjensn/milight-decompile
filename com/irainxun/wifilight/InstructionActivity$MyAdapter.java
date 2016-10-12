package com.irainxun.wifilight;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

class InstructionActivity$MyAdapter extends PagerAdapter
{
  private InstructionActivity$MyAdapter(InstructionActivity paramInstructionActivity)
  {
  }

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((View)InstructionActivity.access$2(this.this$0).get(paramInt));
  }

  public int getCount()
  {
    return InstructionActivity.access$2(this.this$0).size();
  }

  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.addView((View)InstructionActivity.access$2(this.this$0).get(paramInt));
    return InstructionActivity.access$2(this.this$0).get(paramInt);
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == paramObject;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.InstructionActivity.MyAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */