package com.irainxun.wifilight.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.xlink.MyApp;
import java.util.ArrayList;

public class wifilightPopM
{
  private Context context;
  private LayoutInflater inflater;

  public wifilightPopM(Context paramContext)
  {
    this.context = paramContext;
    this.inflater = LayoutInflater.from(paramContext);
  }

  public void show(final TextView paramTextView, PopupWindow.OnDismissListener paramOnDismissListener)
  {
    View localView = this.inflater.inflate(R.layout.pop_m, null);
    int i = this.context.getResources().getDimensionPixelSize(R.dimen.dp20);
    final PopupWindow localPopupWindow = new PopupWindow(localView, this.context.getResources().getDisplayMetrics().widthPixels - i * 2, -2, true);
    localPopupWindow.setBackgroundDrawable(this.context.getResources().getDrawable(R.drawable.transparent));
    GridView localGridView = (GridView)localView.findViewById(R.id.gridview);
    final MAdapter localMAdapter = new MAdapter();
    localGridView.setAdapter(localMAdapter);
    localGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        String str = localMAdapter.getItem(paramAnonymousInt);
        Log.d("debug", "onItemClick = " + paramAnonymousInt);
        paramTextView.setText(str);
        MyApp.PlalyKeySound();
        byte[] arrayOfByte = new byte[12];
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = 0;
        arrayOfByte[4] = 4;
        arrayOfByte[5] = (byte)(paramAnonymousInt + 1);
        arrayOfByte[6] = 0;
        arrayOfByte[7] = 0;
        arrayOfByte[8] = 0;
        arrayOfByte[9] = 1;
        arrayOfByte[10] = 0;
        arrayOfByte[11] = 0;
        MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
        localPopupWindow.dismiss();
      }
    });
    int[] arrayOfInt = new int[2];
    paramTextView.getLocationOnScreen(arrayOfInt);
    ActivityUtil.measureView(localView);
    int j = localView.getMeasuredHeight();
    localPopupWindow.setOnDismissListener(paramOnDismissListener);
    localPopupWindow.showAtLocation(paramTextView, 0, i, arrayOfInt[1] - j);
  }

  class MAdapter extends BaseAdapter
  {
    private ArrayList<String> list = new ArrayList();

    MAdapter()
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
        paramView = wifilightPopM.this.inflater.inflate(R.layout.grid_m_item, null);
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
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.wifilightPopM
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */