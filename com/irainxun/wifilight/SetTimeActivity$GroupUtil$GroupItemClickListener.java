package com.irainxun.wifilight;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.irainxun.wifilight.xlink.MyApp;

class SetTimeActivity$GroupUtil$GroupItemClickListener
  implements View.OnClickListener
{
  int pos;

  SetTimeActivity$GroupUtil$GroupItemClickListener(SetTimeActivity.GroupUtil paramGroupUtil, int paramInt)
  {
    this.pos = paramInt;
  }

  public void onClick(View paramView)
  {
    SetTimeActivity.GroupUtil.access$0(this.this$1, this.pos);
    MyApp.PlalyKeySound();
    Log.d("debug", "selectPos = " + SetTimeActivity.GroupUtil.access$1(this.this$1));
    SetTimeActivity.access$34(SetTimeActivity.GroupUtil.access$5(this.this$1), (byte)(1 + SetTimeActivity.GroupUtil.access$1(this.this$1)));
    Log.d("debug", "local_remo = " + SetTimeActivity.access$35(SetTimeActivity.GroupUtil.access$5(this.this$1)));
    int i = SetTimeActivity.GroupUtil.access$2(this.this$1).getChildCount();
    int j = 0;
    if (j >= i)
    {
      SetTimeActivity.access$36(SetTimeActivity.GroupUtil.access$5(this.this$1));
      return;
    }
    View localView = SetTimeActivity.GroupUtil.access$2(this.this$1).getChildAt(j);
    TextView localTextView;
    SetTimeActivity.GroupUtil localGroupUtil;
    if ((localView instanceof TextView))
    {
      localTextView = (TextView)localView;
      localGroupUtil = this.this$1;
      if (localTextView != paramView)
        break label185;
    }
    label185: for (boolean bool = true; ; bool = false)
    {
      SetTimeActivity.GroupUtil.access$3(localGroupUtil, localTextView, bool);
      j++;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.SetTimeActivity.GroupUtil.GroupItemClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */