package com.irainxun.wifilight.util;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.irainxun.wifilight.controller.BaseControllerActivity;
import com.irainxun.wifilight.xlink.MyApp;

class GroupUtil$GroupItemClickListener
  implements View.OnClickListener
{
  int pos;

  GroupUtil$GroupItemClickListener(GroupUtil paramGroupUtil, int paramInt)
  {
    this.pos = paramInt;
  }

  public void onClick(View paramView)
  {
    GroupUtil.access$0(this.this$0, this.pos);
    MyApp.PlalyKeySound();
    Log.d("debug", "selectPos = " + GroupUtil.access$1(this.this$0));
    MyApp.rain_remo = (byte)(1 + GroupUtil.access$1(this.this$0));
    Log.d("debug", "MyApp.rain_remo = " + MyApp.rain_remo);
    if ((GroupUtil.access$2(this.this$0) instanceof BaseControllerActivity))
      ((BaseControllerActivity)GroupUtil.access$2(this.this$0)).setGroupPos(this.pos);
    int i = GroupUtil.access$3(this.this$0).getChildCount();
    int j = 0;
    if (j >= i)
      return;
    View localView = GroupUtil.access$3(this.this$0).getChildAt(j);
    TextView localTextView;
    GroupUtil localGroupUtil;
    if ((localView instanceof TextView))
    {
      localTextView = (TextView)localView;
      localGroupUtil = this.this$0;
      if (localTextView != paramView)
        break label191;
    }
    label191: for (boolean bool = true; ; bool = false)
    {
      GroupUtil.access$4(localGroupUtil, localTextView, bool);
      j++;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.GroupUtil.GroupItemClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */