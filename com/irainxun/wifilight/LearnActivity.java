package com.irainxun.wifilight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.irainxun.wifilight.util.LogUtil;
import com.irainxun.wifilight.view.MyViewPager;
import com.irainxun.wifilight.xlink.MyApp;
import java.util.ArrayList;

public class LearnActivity extends Activity
{
  private final String TAG = getClass().getSimpleName();
  private MyAdapter adapter;
  private int[] imgs;
  private LayoutInflater inflater;
  private ArrayList<View> pages = null;
  private MyViewPager viewpager;

  public LearnActivity()
  {
  }

  private void goBack()
  {
    finish();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_learn);
    this.viewpager = ((MyViewPager)findViewById(R.id.pager));
    this.viewpager.setCanScroll(true);
    this.imgs = new int[] { R.drawable.learn1, R.drawable.learn2, R.drawable.learn3, R.drawable.learn4, R.drawable.learn5 };
    this.pages = new ArrayList(this.imgs.length);
    this.inflater = getLayoutInflater();
    for (int i = 0; ; i++)
    {
      if (i >= this.imgs.length)
      {
        LogUtil.showMsg(String.valueOf(this.TAG) + " oncreate pages size:" + this.pages.size());
        this.adapter = new MyAdapter(null);
        this.viewpager.setAdapter(this.adapter);
        return;
      }
      View localView = this.inflater.inflate(R.layout.view_learn, null);
      ImageView localImageView = (ImageView)localView.findViewById(R.id.iv_img);
      localImageView.setImageResource(this.imgs[i]);
      localImageView.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (LearnActivity.this.viewpager.getCurrentItem() < -1 + LearnActivity.this.imgs.length)
          {
            int i = 1 + LearnActivity.this.viewpager.getCurrentItem();
            LearnActivity.this.viewpager.setCurrentItem(i, false);
            return;
          }
          Intent localIntent = new Intent(LearnActivity.this, DeviceListActivity.class);
          LearnActivity.this.startActivity(localIntent);
          LearnActivity.this.finish();
        }
      });
      this.pages.add(localView);
    }
  }

  protected void onDestroy()
  {
    MyApp.modifyMusic("1", "ONEUP");
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  private class MyAdapter extends PagerAdapter
  {
    private MyAdapter()
    {
    }

    public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
    {
      paramViewGroup.removeView((View)LearnActivity.this.pages.get(paramInt));
    }

    public int getCount()
    {
      return LearnActivity.this.pages.size();
    }

    public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup.addView((View)LearnActivity.this.pages.get(paramInt));
      return LearnActivity.this.pages.get(paramInt);
    }

    public boolean isViewFromObject(View paramView, Object paramObject)
    {
      return paramView == paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.LearnActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */