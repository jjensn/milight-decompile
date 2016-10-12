package com.irainxun.wifilight.fragment;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.irainxun.wifilight.util.GroupUtil;
import com.irainxun.wifilight.view.PopM;
import com.irainxun.wifilight.xlink.MyApp;

class FUT956ColorFragment$4
  implements View.OnClickListener
{
  FUT956ColorFragment$4(FUT956ColorFragment paramFUT956ColorFragment)
  {
  }

  public void onClick(View paramView)
  {
    MyApp.PlalyKeySound();
    if (paramView == FUT956ColorFragment.access$29(this.this$0))
      new PopM(this.this$0.getActivity()).show(FUT956ColorFragment.access$29(this.this$0), new PopupWindow.OnDismissListener()
      {
        public void onDismiss()
        {
          if (!FUT956ColorFragment.access$29(FUT956ColorFragment.4.this.this$0).getText().equals(FUT956ColorFragment.4.this.this$0.getString(R.string.modes)))
          {
            int i = FUT956ColorFragment.4.this.this$0.getResources().getDimensionPixelSize(R.dimen.dp5);
            int j = FUT956ColorFragment.4.this.this$0.getResources().getDimensionPixelSize(R.dimen.dp20);
            FUT956ColorFragment.access$29(FUT956ColorFragment.4.this.this$0).setPadding(0, i, j, 0);
          }
        }
      });
    do
    {
      return;
      if (paramView == FUT956ColorFragment.access$30(this.this$0))
      {
        FUT956ColorFragment.access$31(this.this$0).addColorPoint(FUT956ColorFragment.access$18(this.this$0));
        return;
      }
      if (paramView == FUT956ColorFragment.access$32(this.this$0))
      {
        FUT956ColorFragment.access$33(this.this$0).selectAll(true);
        MyApp.rain_remo = 0;
        return;
      }
    }
    while (paramView != FUT956ColorFragment.access$17(this.this$0));
    byte[] arrayOfByte = new byte[12];
    arrayOfByte[0] = 49;
    arrayOfByte[1] = MyApp.PasswordByte[0];
    arrayOfByte[2] = MyApp.PasswordByte[1];
    arrayOfByte[3] = MyApp.rain_remoteID;
    arrayOfByte[4] = 3;
    arrayOfByte[5] = 5;
    arrayOfByte[6] = 0;
    arrayOfByte[7] = 0;
    arrayOfByte[8] = 0;
    arrayOfByte[9] = MyApp.rain_remo;
    arrayOfByte[10] = 0;
    arrayOfByte[11] = 0;
    MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
    FUT956ColorFragment.access$17(this.this$0).setTextColor(-1);
    FUT956ColorFragment.access$25(this.this$0, true);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.fragment.FUT956ColorFragment.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */