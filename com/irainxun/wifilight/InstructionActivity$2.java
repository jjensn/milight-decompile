package com.irainxun.wifilight;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.irainxun.wifilight.view.MyViewPager;

class InstructionActivity$2
  implements View.OnClickListener
{
  InstructionActivity$2(InstructionActivity paramInstructionActivity, int paramInt)
  {
  }

  public void onClick(View paramView)
  {
    if (this.val$pos == -1 + InstructionActivity.access$3(this.this$0).length)
    {
      Intent localIntent = new Intent(this.this$0, ConfigurationActivity.class);
      localIntent.putExtras(this.this$0.getIntent().getExtras());
      this.this$0.startActivity(localIntent);
      this.this$0.finish();
    }
    int i;
    do
    {
      return;
      i = InstructionActivity.access$4(this.this$0).getCurrentItem();
    }
    while (i >= -1 + InstructionActivity.access$3(this.this$0).length);
    int j = i + 1;
    InstructionActivity.access$4(this.this$0).setCurrentItem(j, true);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.InstructionActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */