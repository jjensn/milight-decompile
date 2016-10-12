package com.irainxun.wifilight.controller;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.irainxun.wifilight.util.LogUtil;
import com.irainxun.wifilight.xlink.MyApp;

class BaseControllerActivity$2
  implements AdapterView.OnItemSelectedListener
{
  BaseControllerActivity$2(BaseControllerActivity paramBaseControllerActivity, BaseControllerActivity.CAdapter paramCAdapter)
  {
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    LogUtil.showMsg(String.valueOf(this.this$0.TAG) + " ItemSelected pos:" + paramInt);
    this.val$adapter.setSelectItem(paramInt);
    MyApp.PlalyKeySound();
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.BaseControllerActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */