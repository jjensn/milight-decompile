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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.irainxun.wifilight.util.LogUtil;
import com.irainxun.wifilight.view.MyViewPager;
import java.util.ArrayList;

public class InstructionActivity extends Activity
{
  private final String TAG = getClass().getSimpleName();
  private MyAdapter adapter;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == InstructionActivity.this.ivBack)
        InstructionActivity.this.goBack();
    }
  };
  private int curPos = 0;
  private int[] imgs;
  private LayoutInflater inflater;
  private ImageView ivBack;
  private int[] msgs;
  private ArrayList<View> pages = null;
  private int[] titles;
  private TextView tvTitle;
  private int type;
  private MyViewPager viewpager;

  public InstructionActivity()
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
    setContentView(R.layout.activity_instruction);
    this.inflater = getLayoutInflater();
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.viewpager = ((MyViewPager)findViewById(R.id.pager));
    this.viewpager.setCanScroll(true);
    this.ivBack.setOnClickListener(this.clickListener);
    this.type = getIntent().getIntExtra("type", 0);
    this.ivBack.setImageResource(R.drawable.back);
    if (this.type == 0)
    {
      this.tvTitle.setText(R.string.smart_link_instruction);
      this.imgs = new int[] { R.drawable.ap_1bu, R.drawable.s_2bu, R.drawable.s_3bu, R.drawable.s_4bu, R.drawable.s_5bu };
      this.titles = new int[] { R.string.smart_inst_1_title, R.string.smart_inst_2_title, R.string.smart_inst_3_title, R.string.smart_inst_4_title, R.string.smart_inst_5_title };
      this.msgs = new int[] { R.string.smart_inst_1_msg, R.string.smart_inst_2_msg, R.string.smart_inst_3_msg, R.string.smart_inst_4_msg, R.string.smart_inst_5_msg };
      this.pages = new ArrayList(this.imgs.length);
    }
    final int i;
    while (true)
    {
      i = 0;
      if (i < this.msgs.length)
        break;
      LogUtil.showMsg(String.valueOf(this.TAG) + " oncreate pages size:" + this.pages.size());
      this.adapter = new MyAdapter(null);
      this.viewpager.setAdapter(this.adapter);
      return;
      if (this.type == 1)
      {
        this.tvTitle.setText(R.string.ap_link_instruction);
        this.imgs = new int[] { R.drawable.ap_1bu, R.drawable.ap_2bu, R.drawable.ap_3bu, R.drawable.ap_4bu, R.drawable.ap_5bu, R.drawable.ap_6bu, R.drawable.ap_7bu, R.drawable.ap_8bu };
        this.titles = new int[] { R.string.smart_inst_1_title, R.string.ap_inst_2_title, R.string.ap_inst_3_title, R.string.ap_inst_4_title, R.string.ap_inst_5_title, R.string.ap_inst_6_title, R.string.ap_inst_7_title, R.string.ap_inst_8_title };
        this.msgs = new int[] { R.string.smart_inst_1_msg, R.string.ap_inst_2_msg, R.string.ap_inst_3_msg, R.string.ap_inst_4_msg, R.string.ap_inst_5_msg, R.string.ap_inst_6_msg, R.string.ap_inst_7_msg, R.string.ap_inst_8_msg };
        this.pages = new ArrayList(this.imgs.length);
      }
    }
    View localView = this.inflater.inflate(R.layout.view_instruction, null);
    ImageView localImageView = (ImageView)localView.findViewById(R.id.iv_img);
    TextView localTextView1 = (TextView)localView.findViewById(R.id.tv_instruction_title);
    TextView localTextView2 = (TextView)localView.findViewById(R.id.tv_instruction_content);
    Button localButton = (Button)localView.findViewById(R.id.btn_next);
    localImageView.setImageResource(this.imgs[i]);
    localTextView1.setText(this.titles[i]);
    localTextView2.setText(this.msgs[i]);
    if (i == -1 + this.msgs.length)
      localButton.setText(R.string.start_setting);
    while (true)
    {
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (i == -1 + InstructionActivity.this.msgs.length)
          {
            Intent localIntent = new Intent(InstructionActivity.this, ConfigurationActivity.class);
            localIntent.putExtras(InstructionActivity.this.getIntent().getExtras());
            InstructionActivity.this.startActivity(localIntent);
            InstructionActivity.this.finish();
          }
          int i;
          do
          {
            return;
            i = InstructionActivity.this.viewpager.getCurrentItem();
          }
          while (i >= -1 + InstructionActivity.this.msgs.length);
          int j = i + 1;
          InstructionActivity.this.viewpager.setCurrentItem(j, true);
        }
      });
      this.pages.add(localView);
      i++;
      break;
      localButton.setText(R.string.next);
    }
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
      paramViewGroup.removeView((View)InstructionActivity.this.pages.get(paramInt));
    }

    public int getCount()
    {
      return InstructionActivity.this.pages.size();
    }

    public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
    {
      paramViewGroup.addView((View)InstructionActivity.this.pages.get(paramInt));
      return InstructionActivity.this.pages.get(paramInt);
    }

    public boolean isViewFromObject(View paramView, Object paramObject)
    {
      return paramView == paramObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.InstructionActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */