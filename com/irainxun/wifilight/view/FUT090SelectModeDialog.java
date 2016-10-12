package com.irainxun.wifilight.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import com.irainxun.wifilight.util.LogUtil;
import com.irainxun.wifilight.xlink.MyApp;
import java.util.ArrayList;

public class FUT090SelectModeDialog extends Dialog
{
  private final String TAG = getClass().getSimpleName();
  private GridView gridView;
  private LayoutInflater inflater;
  private ImageView ivClose;
  private int mode;
  private int remo;

  public FUT090SelectModeDialog(Context paramContext)
  {
    super(paramContext, R.style.EditLightDialog);
    this.inflater = LayoutInflater.from(paramContext);
  }

  private FUT090SelectModeDialog(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
  }

  public void FUT090SelectMode(int paramInt1, int paramInt2)
  {
    this.mode = paramInt1;
    this.remo = paramInt2;
    Log.d("debug", "modeSelect = " + this.mode);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.dialog_fut090_select_mode);
    setCanceledOnTouchOutside(false);
    setCancelable(false);
    final MAdapter localMAdapter = new MAdapter();
    this.gridView = ((GridView)findViewById(R.id.gridview));
    this.gridView.setAdapter(localMAdapter);
    this.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        MyApp.PlalyKeySound();
        String str = localMAdapter.getItem(paramAnonymousInt);
        LogUtil.showMsg(String.valueOf(FUT090SelectModeDialog.this.TAG) + " onItemClick pos:" + paramAnonymousInt + ",m:" + str);
        Log.d("debug", "modeSelect = " + FUT090SelectModeDialog.this.mode);
        Log.d("debug", " onItemClick pos:" + paramAnonymousInt + ",m:" + str);
        byte[] arrayOfByte = new byte[12];
        arrayOfByte[0] = 49;
        arrayOfByte[1] = MyApp.PasswordByte[0];
        arrayOfByte[2] = MyApp.PasswordByte[1];
        arrayOfByte[3] = MyApp.rain_remoteID;
        if (FUT090SelectModeDialog.this.mode == 2)
          arrayOfByte[4] = 7;
        while (true)
        {
          arrayOfByte[5] = (byte)Integer.parseInt(str);
          arrayOfByte[6] = 0;
          arrayOfByte[7] = 0;
          arrayOfByte[8] = (byte)MyApp.rain_setch;
          if (!MyApp.ch_zone)
            arrayOfByte[8] = (byte)(0x80 | arrayOfByte[8]);
          arrayOfByte[9] = (byte)MyApp.rain_setremo;
          arrayOfByte[10] = (byte)(MyApp.rain_setremo >> 8);
          arrayOfByte[11] = 0;
          MyApp.sendData(arrayOfByte, MyApp.DeviceControl);
          FUT090SelectModeDialog.this.dismiss();
          return;
          if (FUT090SelectModeDialog.this.mode == 1)
            arrayOfByte[4] = 23;
        }
      }
    });
    this.ivClose = ((ImageView)findViewById(R.id.iv_delt));
    this.ivClose.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        FUT090SelectModeDialog.this.dismiss();
      }
    });
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
        paramView = FUT090SelectModeDialog.this.inflater.inflate(R.layout.dialog_delt_item, null);
        localViewHolder = new ViewHolder();
        localViewHolder.btnMode = ((Button)paramView);
        paramView.setTag(localViewHolder);
      }
      while (true)
      {
        String str = getItem(paramInt);
        localViewHolder.btnMode.setText(str);
        localViewHolder.btnMode.setTextColor(FUT090SelectModeDialog.this.inflater.getContext().getResources().getColor(R.color.select_mode));
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
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.FUT090SelectModeDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */