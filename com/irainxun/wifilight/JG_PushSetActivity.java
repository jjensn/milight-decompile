package com.irainxun.wifilight;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import cn.jpush.android.api.BasicPushNotificationBuilder;
import cn.jpush.android.api.CustomPushNotificationBuilder;
import cn.jpush.android.api.InstrumentedActivity;
import cn.jpush.android.api.JPushInterface;
import cn.jpush.android.api.TagAliasCallback;
import java.util.LinkedHashSet;
import java.util.Set;

public class JG_PushSetActivity extends InstrumentedActivity
  implements View.OnClickListener
{
  private static final int MSG_SET_ALIAS = 1001;
  private static final int MSG_SET_TAGS = 1002;
  private static final String TAG = "JPush";
  private final TagAliasCallback mAliasCallback = new TagAliasCallback()
  {
    public void gotResult(int paramAnonymousInt, String paramAnonymousString, Set<String> paramAnonymousSet)
    {
      String str;
      switch (paramAnonymousInt)
      {
      default:
        str = "Failed with errorCode = " + paramAnonymousInt;
        Log.e("JPush", str);
      case 0:
      case 6002:
      }
      while (true)
      {
        JG_ExampleUtil.showToast(str, JG_PushSetActivity.this.getApplicationContext());
        return;
        str = "Set tag and alias success";
        Log.i("JPush", str);
        continue;
        str = "Failed to set alias and tags due to timeout. Try again after 60s.";
        Log.i("JPush", str);
        if (JG_ExampleUtil.isConnected(JG_PushSetActivity.this.getApplicationContext()))
          JG_PushSetActivity.this.mHandler.sendMessageDelayed(JG_PushSetActivity.this.mHandler.obtainMessage(1001, paramAnonymousString), 60000L);
        else
          Log.i("JPush", "No network");
      }
    }
  };
  private final Handler mHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      super.handleMessage(paramAnonymousMessage);
      switch (paramAnonymousMessage.what)
      {
      default:
        Log.i("JPush", "Unhandled msg - " + paramAnonymousMessage.what);
        return;
      case 1001:
        Log.d("JPush", "Set alias in handler.");
        JPushInterface.setAliasAndTags(JG_PushSetActivity.this.getApplicationContext(), (String)paramAnonymousMessage.obj, null, JG_PushSetActivity.this.mAliasCallback);
        return;
      case 1002:
      }
      Log.d("JPush", "Set tags in handler.");
      JPushInterface.setAliasAndTags(JG_PushSetActivity.this.getApplicationContext(), null, (Set)paramAnonymousMessage.obj, JG_PushSetActivity.this.mTagsCallback);
    }
  };
  Button mSetAlias;
  Button mSetPushTime;
  Button mSetTag;
  Button mStyleBasic;
  Button mStyleCustom;
  private final TagAliasCallback mTagsCallback = new TagAliasCallback()
  {
    public void gotResult(int paramAnonymousInt, String paramAnonymousString, Set<String> paramAnonymousSet)
    {
      String str;
      switch (paramAnonymousInt)
      {
      default:
        str = "Failed with errorCode = " + paramAnonymousInt;
        Log.e("JPush", str);
      case 0:
      case 6002:
      }
      while (true)
      {
        JG_ExampleUtil.showToast(str, JG_PushSetActivity.this.getApplicationContext());
        return;
        str = "Set tag and alias success";
        Log.i("JPush", str);
        continue;
        str = "Failed to set alias and tags due to timeout. Try again after 60s.";
        Log.i("JPush", str);
        if (JG_ExampleUtil.isConnected(JG_PushSetActivity.this.getApplicationContext()))
          JG_PushSetActivity.this.mHandler.sendMessageDelayed(JG_PushSetActivity.this.mHandler.obtainMessage(1002, paramAnonymousSet), 60000L);
        else
          Log.i("JPush", "No network");
      }
    }
  };

  public JG_PushSetActivity()
  {
  }

  private void init()
  {
    this.mSetTag = ((Button)findViewById(R.id.bt_tag));
    this.mSetAlias = ((Button)findViewById(R.id.bt_alias));
    this.mStyleBasic = ((Button)findViewById(R.id.setStyle1));
    this.mStyleCustom = ((Button)findViewById(R.id.setStyle2));
    this.mSetPushTime = ((Button)findViewById(R.id.bu_setTime));
  }

  private void initListener()
  {
    this.mSetTag.setOnClickListener(this);
    this.mSetAlias.setOnClickListener(this);
    this.mStyleBasic.setOnClickListener(this);
    this.mStyleCustom.setOnClickListener(this);
    this.mSetPushTime.setOnClickListener(this);
  }

  private void setAlias()
  {
    String str = ((EditText)findViewById(R.id.et_alias)).getText().toString().trim();
    if (TextUtils.isEmpty(str))
    {
      Toast.makeText(this, R.string.error_alias_empty, 0).show();
      return;
    }
    if (!JG_ExampleUtil.isValidTagAndAlias(str))
    {
      Toast.makeText(this, R.string.error_tag_gs_empty, 0).show();
      return;
    }
    this.mHandler.sendMessage(this.mHandler.obtainMessage(1001, str));
  }

  private void setStyleBasic()
  {
    BasicPushNotificationBuilder localBasicPushNotificationBuilder = new BasicPushNotificationBuilder(this);
    localBasicPushNotificationBuilder.statusBarDrawable = R.drawable.ic_launcher;
    localBasicPushNotificationBuilder.notificationFlags = 16;
    localBasicPushNotificationBuilder.notificationDefaults = 1;
    JPushInterface.setPushNotificationBuilder(Integer.valueOf(1), localBasicPushNotificationBuilder);
    Toast.makeText(this, "Basic Builder - 1", 0).show();
  }

  private void setStyleCustom()
  {
    CustomPushNotificationBuilder localCustomPushNotificationBuilder = new CustomPushNotificationBuilder(this, R.layout.jg_customer_notitfication_layout, R.id.icon, R.id.title, R.id.text);
    localCustomPushNotificationBuilder.layoutIconDrawable = R.drawable.ic_launcher;
    localCustomPushNotificationBuilder.developerArg0 = "developerArg2";
    JPushInterface.setPushNotificationBuilder(Integer.valueOf(2), localCustomPushNotificationBuilder);
    Toast.makeText(this, "Custom Builder - 2", 0).show();
  }

  private void setTag()
  {
    String str1 = ((EditText)findViewById(R.id.et_tag)).getText().toString().trim();
    if (TextUtils.isEmpty(str1))
    {
      Toast.makeText(this, R.string.error_tag_empty, 0).show();
      return;
    }
    String[] arrayOfString = str1.split(",");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = arrayOfString.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
      {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1002, localLinkedHashSet));
        return;
      }
      String str2 = arrayOfString[j];
      if (!JG_ExampleUtil.isValidTagAndAlias(str2))
      {
        Toast.makeText(this, R.string.error_tag_gs_empty, 0).show();
        return;
      }
      localLinkedHashSet.add(str2);
    }
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case R.id.et_alias:
    default:
      return;
    case R.id.bt_tag:
      setTag();
      return;
    case R.id.bt_alias:
      setAlias();
      return;
    case R.id.setStyle1:
      setStyleBasic();
      return;
    case R.id.setStyle2:
      setStyleCustom();
      return;
    case R.id.bu_setTime:
    }
    startActivity(new Intent(this, JG_SettingActivity.class));
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.jg_push_set_dialog);
    init();
    initListener();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
      finish();
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_PushSetActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */