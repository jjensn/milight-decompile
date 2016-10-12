package com.irainxun.wifilight.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

class PopM$MAdapter extends BaseAdapter
{
  private ArrayList<String> list = new ArrayList();

  PopM$MAdapter(PopM paramPopM)
  {
    for (int i = 1; ; i++)
    {
      if (i > 9)
        return;
      this.list.add("M" + i);
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
      paramView = PopM.access$0(this.this$0).inflate(R.layout.grid_m_item, null);
      localViewHolder = new ViewHolder();
      localViewHolder.tvM = ((TextView)paramView.findViewById(R.id.tv_m));
      paramView.setTag(localViewHolder);
    }
    while (true)
    {
      String str = getItem(paramInt);
      localViewHolder.tvM.setText(str);
      return paramView;
      localViewHolder = (ViewHolder)paramView.getTag();
    }
  }

  class ViewHolder
  {
    TextView tvM;

    ViewHolder()
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.PopM.MAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */