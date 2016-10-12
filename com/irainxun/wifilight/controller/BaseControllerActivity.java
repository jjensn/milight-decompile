package com.irainxun.wifilight.controller;

import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.irainxun.wifilight.LinkUnlinkActivity;
import com.irainxun.wifilight.LinkUnlinkFUT090Activity;
import com.irainxun.wifilight.SetTimeActivity;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.fragment.LightFragment;
import com.irainxun.wifilight.util.LogUtil;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;

public abstract class BaseControllerActivity extends FragmentActivity
  implements View.OnClickListener
{
  public static TextView tvTitle;
  protected final String TAG = getClass().getSimpleName();
  protected Button btnTimer;
  private RadioGroup.OnCheckedChangeListener checkedChangeListener = new RadioGroup.OnCheckedChangeListener()
  {
    public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
    {
      FragmentTransaction localFragmentTransaction = BaseControllerActivity.this.fragmentManager.beginTransaction();
      if (paramAnonymousInt == R.id.rb1)
      {
        BaseControllerActivity.this.ivCode.setVisibility(4);
        BaseControllerActivity.tvTitle.setText(R.string.wifi_light);
        localFragmentTransaction.replace(R.id.content, BaseControllerActivity.this.lightFragment);
      }
      while (true)
      {
        localFragmentTransaction.commit();
        return;
        if (paramAnonymousInt == R.id.rb2)
        {
          BaseControllerActivity.this.ivCode.setVisibility(0);
          BaseControllerActivity.tvTitle.setText(R.string.colors);
          localFragmentTransaction.replace(R.id.content, BaseControllerActivity.this.colorFragment);
        }
        else if (paramAnonymousInt == R.id.rb3)
        {
          BaseControllerActivity.this.ivCode.setVisibility(0);
          BaseControllerActivity.tvTitle.setText(R.string.kelvin);
          localFragmentTransaction.replace(R.id.content, BaseControllerActivity.this.kelvinFragment);
        }
        else if (paramAnonymousInt == R.id.rb4)
        {
          BaseControllerActivity.this.ivCode.setVisibility(0);
          BaseControllerActivity.tvTitle.setText(R.string.modes);
          localFragmentTransaction.replace(R.id.content, BaseControllerActivity.this.modeFragment);
        }
      }
    }
  };
  private Fragment colorFragment;
  private FragmentManager fragmentManager;
  private int groupPos;
  private ImageView ivBack;
  private ImageView ivChange;
  private ImageView ivCode;
  private Fragment kelvinFragment;
  private Fragment lightFragment;
  private Fragment modeFragment;
  private int oldSelectPos = 0;
  protected RadioButton rbTabColor;
  protected RadioButton rbTabKelvin;
  protected RadioButton rbTabLight;
  protected RadioButton rbTabMode;
  protected RadioGroup rgTab;
  private int selectPos = 6;

  public BaseControllerActivity()
  {
  }

  private void go2TargetControllerActivity()
  {
    int i = this.selectPos;
    Object localObject = null;
    switch (i)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      LogUtil.showMsg(String.valueOf(this.TAG) + " onItemClick pos:" + this.selectPos + ",class:" + localObject);
      if ((localObject != null) && (getClass() != localObject))
      {
        Intent localIntent = new Intent(this, (Class)localObject);
        localIntent.addFlags(67108864);
        startActivity(localIntent);
      }
      return;
      localObject = FUT092Activity.class;
      MyApp.rain_remoteID = 8;
      continue;
      localObject = FUT956Activity.class;
      continue;
      localObject = FUT028Activity.class;
      continue;
      localObject = FUT098Activity.class;
      continue;
      localObject = FUT020Activity.class;
      continue;
      localObject = FUT022Activity.class;
      continue;
      localObject = FUT021Activity.class;
      continue;
      localObject = FUT093Activity.class;
      continue;
      localObject = FUT091Activity.class;
      continue;
      localObject = FUT567Activity.class;
      continue;
      localObject = FUT090Activity.class;
    }
  }

  protected abstract Fragment getColorFragment();

  public int getGroupPos()
  {
    return this.groupPos;
  }

  protected abstract Fragment getKelvinFragment();

  protected abstract Fragment getModeFragment();

  public void onClick(View paramView)
  {
    if (paramView == this.ivBack)
      finish();
    do
    {
      return;
      if (paramView == this.ivCode)
      {
        MyApp.PlalyKeySound();
        if (tvTitle.getText().equals(getString(R.string.fut090)));
        for (Intent localIntent = new Intent(this, LinkUnlinkFUT090Activity.class); ; localIntent = new Intent(this, LinkUnlinkActivity.class))
        {
          startActivity(localIntent);
          return;
        }
      }
      if (paramView == this.ivChange)
      {
        final Dialog localDialog = new Dialog(this, R.style.EditLightDialog);
        localDialog.setContentView(R.layout.dialog_select_controller);
        localDialog.setCanceledOnTouchOutside(false);
        localDialog.show();
        ((ImageView)localDialog.findViewById(R.id.c_left));
        ((ImageView)localDialog.findViewById(R.id.c_right));
        Gallery localGallery = (Gallery)localDialog.findViewById(R.id.gallery);
        final CAdapter localCAdapter = new CAdapter();
        this.selectPos = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
        this.oldSelectPos = this.selectPos;
        localGallery.setSelection(this.selectPos);
        localGallery.setAdapter(localCAdapter);
        localGallery.setSelection(this.selectPos);
        localGallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            LogUtil.showMsg(String.valueOf(BaseControllerActivity.this.TAG) + " ItemSelected pos:" + paramAnonymousInt);
            localCAdapter.setSelectItem(paramAnonymousInt);
            MyApp.PlalyKeySound();
          }

          public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
          }
        });
        localGallery.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            Log.d("debug", "onItemClick = " + paramAnonymousInt);
            switch (paramAnonymousInt)
            {
            default:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            }
            while (true)
            {
              MyApp.deviceService.editcLogin(MyApp.DeviceControl.getMacAddress(), BaseControllerActivity.this.selectPos);
              if (BaseControllerActivity.this.oldSelectPos == BaseControllerActivity.this.selectPos)
                break label363;
              if (((BaseControllerActivity.this.selectPos != 10) && (BaseControllerActivity.this.selectPos != 11) && (BaseControllerActivity.this.selectPos != 12)) || ((BaseControllerActivity.this.oldSelectPos != 10) && (BaseControllerActivity.this.oldSelectPos != 11) && (BaseControllerActivity.this.oldSelectPos != 12)))
                break;
              localDialog.dismiss();
              return;
              MyApp.rain_remoteID = 8;
              continue;
              MyApp.rain_remoteID = 7;
              continue;
              MyApp.rain_remoteID = 6;
              continue;
              MyApp.rain_remoteID = 5;
              continue;
              MyApp.rain_remoteID = 4;
              continue;
              MyApp.rain_remoteID = 4;
              continue;
              MyApp.rain_remoteID = 4;
              continue;
              MyApp.rain_remoteID = 2;
              continue;
              MyApp.rain_remoteID = 3;
              continue;
              MyApp.rain_remoteID = 1;
              continue;
              MyApp.rain_remoteID = 9;
            }
            if (((BaseControllerActivity.this.selectPos == 1) || (BaseControllerActivity.this.selectPos == 2)) && ((BaseControllerActivity.this.oldSelectPos == 1) || (BaseControllerActivity.this.oldSelectPos == 2)))
            {
              localDialog.dismiss();
              return;
            }
            BaseControllerActivity.this.finish();
            localDialog.dismiss();
            BaseControllerActivity.this.go2TargetControllerActivity();
            return;
            label363: localDialog.dismiss();
          }
        });
        localDialog.findViewById(R.id.tv_cancel).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            localDialog.dismiss();
          }
        });
        localDialog.findViewById(R.id.tv_ok).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            switch (BaseControllerActivity.this.selectPos)
            {
            default:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            }
            while (true)
            {
              MyApp.deviceService.editcLogin(MyApp.DeviceControl.getMacAddress(), BaseControllerActivity.this.selectPos);
              if (BaseControllerActivity.this.oldSelectPos == BaseControllerActivity.this.selectPos)
                break label347;
              if (((BaseControllerActivity.this.selectPos != 10) && (BaseControllerActivity.this.selectPos != 11) && (BaseControllerActivity.this.selectPos != 12)) || ((BaseControllerActivity.this.oldSelectPos != 10) && (BaseControllerActivity.this.oldSelectPos != 11) && (BaseControllerActivity.this.oldSelectPos != 12)))
                break;
              localDialog.dismiss();
              return;
              MyApp.rain_remoteID = 8;
              continue;
              MyApp.rain_remoteID = 7;
              continue;
              MyApp.rain_remoteID = 6;
              continue;
              MyApp.rain_remoteID = 5;
              continue;
              MyApp.rain_remoteID = 4;
              continue;
              MyApp.rain_remoteID = 4;
              continue;
              MyApp.rain_remoteID = 4;
              continue;
              MyApp.rain_remoteID = 2;
              continue;
              MyApp.rain_remoteID = 3;
              continue;
              MyApp.rain_remoteID = 1;
              continue;
              MyApp.rain_remoteID = 9;
            }
            if (((BaseControllerActivity.this.selectPos == 1) || (BaseControllerActivity.this.selectPos == 2)) && ((BaseControllerActivity.this.oldSelectPos == 1) || (BaseControllerActivity.this.oldSelectPos == 2)))
            {
              localDialog.dismiss();
              return;
            }
            BaseControllerActivity.this.finish();
            localDialog.dismiss();
            BaseControllerActivity.this.go2TargetControllerActivity();
            return;
            label347: localDialog.dismiss();
          }
        });
        return;
      }
    }
    while (paramView != this.btnTimer);
    startActivity(new Intent(this, SetTimeActivity.class));
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_controller_base);
    this.fragmentManager = getFragmentManager();
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    tvTitle = (TextView)findViewById(R.id.tv_title);
    this.ivCode = ((ImageView)findViewById(R.id.iv_code));
    this.ivChange = ((ImageView)findViewById(R.id.iv_right));
    this.rgTab = ((RadioGroup)findViewById(R.id.rg_tab));
    this.rbTabLight = ((RadioButton)findViewById(R.id.rb1));
    this.rbTabColor = ((RadioButton)findViewById(R.id.rb2));
    this.rbTabKelvin = ((RadioButton)findViewById(R.id.rb3));
    this.rbTabMode = ((RadioButton)findViewById(R.id.rb4));
    this.btnTimer = ((Button)findViewById(R.id.btn_timer));
    this.ivBack.setOnClickListener(this);
    this.ivCode.setOnClickListener(this);
    this.ivChange.setOnClickListener(this);
    this.btnTimer.setOnClickListener(this);
    this.ivBack.setImageResource(R.drawable.back);
    this.ivCode.setImageResource(R.drawable.ic_code);
    this.ivChange.setImageResource(R.drawable.ic_change);
    this.rgTab.setOnCheckedChangeListener(this.checkedChangeListener);
    int i = 1;
    this.lightFragment = new LightFragment();
    this.colorFragment = getColorFragment();
    if (this.colorFragment != null)
    {
      this.rbTabColor.setVisibility(0);
      i++;
    }
    this.kelvinFragment = getKelvinFragment();
    if (this.kelvinFragment != null)
    {
      this.rbTabKelvin.setVisibility(0);
      i++;
    }
    this.modeFragment = getModeFragment();
    if (this.modeFragment != null)
    {
      this.rbTabMode.setVisibility(0);
      i++;
    }
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.rgTab.getLayoutParams();
    localLayoutParams.weight = i;
    this.rgTab.setLayoutParams(localLayoutParams);
  }

  public void setGroupPos(int paramInt)
  {
    this.groupPos = paramInt;
  }

  class CAdapter extends BaseAdapter
  {
    private int cH;
    private int[] cRes = { R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.c11, R.drawable.c12, R.drawable.c13, R.drawable.c14 };
    private int cW;
    private int selectCH;
    private int selectCW;

    CAdapter()
    {
      Resources localResources = BaseControllerActivity.this.getResources();
      this.cW = localResources.getDimensionPixelSize(R.dimen.c_w);
      this.cH = localResources.getDimensionPixelSize(R.dimen.c_h);
      this.selectCW = localResources.getDimensionPixelSize(R.dimen.c_select_w);
      this.selectCH = localResources.getDimensionPixelSize(R.dimen.c_select_h);
    }

    public int getCount()
    {
      return this.cRes.length;
    }

    public Integer getItem(int paramInt)
    {
      return Integer.valueOf(this.cRes[paramInt]);
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      ViewHolder localViewHolder;
      if (paramView == null)
      {
        localViewHolder = new ViewHolder();
        ImageView localImageView = new ImageView(BaseControllerActivity.this);
        localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        localViewHolder.ivC = localImageView;
        paramView = localImageView;
        paramView.setTag(localViewHolder);
      }
      while (true)
      {
        localViewHolder.ivC.setImageResource(this.cRes[paramInt]);
        if (BaseControllerActivity.this.selectPos != paramInt)
          break;
        localViewHolder.ivC.setLayoutParams(new Gallery.LayoutParams(this.selectCW, this.selectCH));
        return paramView;
        localViewHolder = (ViewHolder)paramView.getTag();
      }
      localViewHolder.ivC.setLayoutParams(new Gallery.LayoutParams(this.cW, this.cH));
      return paramView;
    }

    public void setSelectItem(int paramInt)
    {
      if (BaseControllerActivity.this.selectPos != paramInt)
      {
        BaseControllerActivity.this.selectPos = paramInt;
        notifyDataSetChanged();
      }
    }

    class ViewHolder
    {
      ImageView ivC;

      ViewHolder()
      {
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.controller.BaseControllerActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */