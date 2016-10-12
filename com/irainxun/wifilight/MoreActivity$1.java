package com.irainxun.wifilight;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class MoreActivity$1
  implements View.OnClickListener
{
  MoreActivity$1(MoreActivity paramMoreActivity)
  {
  }

  public void onClick(View paramView)
  {
    if (paramView == MoreActivity.access$0(this.this$0))
      this.this$0.finish();
    do
    {
      return;
      if (paramView == MoreActivity.access$1(this.this$0))
      {
        Intent localIntent1 = new Intent(this.this$0, AboutActivity.class);
        this.this$0.startActivity(localIntent1);
        return;
      }
      if (paramView == MoreActivity.access$2(this.this$0))
      {
        Intent localIntent2 = new Intent(this.this$0, InstructionActivity.class);
        localIntent2.putExtra("type", 0);
        this.this$0.startActivity(localIntent2);
        return;
      }
      if (paramView == MoreActivity.access$3(this.this$0))
      {
        Intent localIntent3 = new Intent(this.this$0, InstructionActivity.class);
        localIntent3.putExtra("type", 1);
        this.this$0.startActivity(localIntent3);
        return;
      }
    }
    while (paramView != MoreActivity.access$4(this.this$0));
    Intent localIntent4 = new Intent(this.this$0, LearnActivity.class);
    this.this$0.startActivity(localIntent4);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.MoreActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */