package com.irainxun.wifilight.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import java.util.ArrayList;

class FUT090SelectModeDialog$MAdapter extends BaseAdapter
{
  private ArrayList<String> list = new ArrayList();

  FUT090SelectModeDialog$MAdapter(FUT090SelectModeDialog paramFUT090SelectModeDialog)
  {
    for (int i = 1; ; i++)
    {
      if (i > 9)
        return;
      this.list.add(String.valueOf(i));
    }
  }

  public int getCount()
  {
    return this.list.size();
  }

  public String getItem(int paramInt)
  {
    return (String)this.list.get(paramInt);
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ViewHolder localViewHolder;
    if (paramView == null)
    {
      paramView = FUT090SelectModeDialog.access$0(this.this$0).inflate(R.layout.dialog_delt_item, null);
      localViewHolder = new ViewHolder();
      localViewHolder.btnMode = ((Button)paramView);
      paramView.setTag(localViewHolder);
    }
    while (true)
    {
      String str = getItem(paramInt);
      localViewHolder.btnMode.setText(str);
      localViewHolder.btnMode.setTextColor(FUT090SelectModeDialog.access$0(this.this$0).getContext().getResources().getColor(R.color.select_mode));
      return paramView;
      localViewHolder = (ViewHolder)paramView.getTag();
    }
  }

  class ViewHolder
  {
    Button btnMode;

    ViewHolder()
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.FUT090SelectModeDialog.MAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */