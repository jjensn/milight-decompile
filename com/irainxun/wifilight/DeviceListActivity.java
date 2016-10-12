package com.irainxun.wifilight;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.controller.FUT020Activity;
import com.irainxun.wifilight.controller.FUT021Activity;
import com.irainxun.wifilight.controller.FUT022Activity;
import com.irainxun.wifilight.controller.FUT028Activity;
import com.irainxun.wifilight.controller.FUT090Activity;
import com.irainxun.wifilight.controller.FUT091Activity;
import com.irainxun.wifilight.controller.FUT092Activity;
import com.irainxun.wifilight.controller.FUT093Activity;
import com.irainxun.wifilight.controller.FUT098Activity;
import com.irainxun.wifilight.controller.FUT567Activity;
import com.irainxun.wifilight.controller.FUT956Activity;
import com.irainxun.wifilight.database.LedDevice;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.util.ActivityUtil;
import com.irainxun.wifilight.view.MyLayout;
import com.irainxun.wifilight.view.SearchDialog;
import com.irainxun.wifilight.xlink.Constant;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.MyApp.OnDeviceMessage;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.manage.DeviceManage;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;
import io.xlink.wifi.sdk.listener.ScanDeviceListener;
import io.xlink.wifi.sdk.listener.SetDeviceAccessKeyListener;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class DeviceListActivity extends Activity
  implements MyApp.OnDeviceMessage
{
  private static final int REQCODE_EDIT = 100;
  public static ArrayList<Device> devices = new ArrayList();
  public static ArrayList<Device> devicesa = new ArrayList();
  private static boolean getPasswordStatus = false;
  private final String TAG = getClass().getSimpleName();
  private LightAdapter adapter;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == DeviceListActivity.this.ivLogo)
      {
        localIntent1 = new Intent(DeviceListActivity.this, MoreActivity.class);
        DeviceListActivity.this.startActivity(localIntent1);
      }
      while (paramAnonymousView != DeviceListActivity.this.ivAdd)
      {
        Intent localIntent1;
        return;
      }
      Intent localIntent2 = new Intent(DeviceListActivity.this, ConfigurationActivity.class);
      localIntent2.putExtra("from", "deviceList");
      DeviceListActivity.this.startActivity(localIntent2);
    }
  };
  int count = 0;
  private int deviceCount = 0;
  private boolean deviceReadFlag = false;
  private ImageView ivAdd;
  private ImageView ivLogo;
  private ListView listView;
  private boolean loginFlag = false;
  public Device logoinDevice;
  private MyApp mApplication;
  private Handler mHandler = new Handler();
  private Handler myHandler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default:
      case 1:
      }
      do
      {
        super.handleMessage(paramAnonymousMessage);
        return;
      }
      while ((!DeviceListActivity.this.deviceReadFlag) || (DeviceListActivity.this.deviceCount >= DeviceManage.getInstance().getDevices().size()));
      int i;
      if (((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getAccessKey() == 123456789)
      {
        Log.d("debug", "device mac = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getMacAddress());
        Log.d("debug", "device status = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).isConnect());
        Log.d("debug", "device net status = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).isConnect());
        Log.d("debug", "device net status = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getXDevice().isLAN());
        Log.d("debug", "device getDeviceConnectStates = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getXDevice().getDevcieConnectStates());
        if (((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getXDevice().getDevcieConnectStates() < 0)
          DeviceListActivity.this.SetDeviceStatus(((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getXDevice(), 0);
        MyApp.Aiyuxun_ConnectDevice(((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getXDevice(), ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getAccessKey());
        i = 0;
        label415: if (i < DeviceListActivity.devices.size());
      }
      while (true)
      {
        DeviceListActivity localDeviceListActivity = DeviceListActivity.this;
        localDeviceListActivity.deviceCount = (1 + localDeviceListActivity.deviceCount);
        DeviceListActivity.this.myHandler.sendEmptyMessageDelayed(1, 4000L);
        break;
        if (((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getMacAddress().equals(((Device)DeviceListActivity.devices.get(i)).getMacAddress()))
        {
          if (((Device)DeviceListActivity.devices.get(i)).getPassword == 0)
            MyApp.sendData(new byte[] { 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51 }, (Device)DeviceListActivity.devices.get(i));
        }
        else
        {
          i++;
          break label415;
          Log.d("debug", "password = " + ((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getAccessKey());
          if (!((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount)).getXDevice().isInit())
            DeviceListActivity.setDevicePassword((Device)DeviceManage.getInstance().getDevices().get(DeviceListActivity.this.deviceCount), 123456789);
          Log.d("debug", "device mac set password!");
        }
      }
    }
  };
  private MyLayout myLayout;
  private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener()
  {
    public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      if (!MyApp.getApp().auth)
      {
        Log.d("debug", "非法启动");
        MyApp.getApp().auth = true;
        DeviceListActivity.this.finish();
      }
      do
      {
        return;
        Log.d("debug", " onItemClick pos:" + paramAnonymousInt);
        String str1 = MyApp.deviceService.getDeviceCPassword(DeviceListActivity.this.adapter.getItem(paramAnonymousInt).getMacAddress());
        String str2 = MyApp.deviceService.getDevicePassword(DeviceListActivity.this.adapter.getItem(paramAnonymousInt).getMacAddress());
        Log.d("debug", "password CPassword = " + str1);
        Log.d("debug", "password Password = " + str2);
      }
      while (DeviceListActivity.this.adapter.getItem(paramAnonymousInt).status <= 0);
      byte[] arrayOfByte = new byte[12];
      DeviceListActivity.this.logoinDevice = DeviceListActivity.this.adapter.getItem(paramAnonymousInt);
      MyApp.DeviceControl = DeviceListActivity.this.logoinDevice;
      DeviceListActivity.this.loginFlag = true;
      arrayOfByte[0] = 51;
      arrayOfByte[1] = 0;
      arrayOfByte[2] = 0;
      arrayOfByte[3] = 0;
      arrayOfByte[4] = 0;
      arrayOfByte[5] = 0;
      arrayOfByte[6] = 0;
      arrayOfByte[7] = 0;
      arrayOfByte[8] = 0;
      arrayOfByte[9] = 0;
      arrayOfByte[10] = 0;
      arrayOfByte[11] = 51;
      MyApp.sendData(arrayOfByte, DeviceListActivity.this.adapter.getItem(paramAnonymousInt));
      Log.d("debug", "send data to get password");
    }
  };
  Runnable runnable = new Runnable()
  {
    public void run()
    {
      Log.d("debug", "time count = " + DeviceListActivity.this.count);
      DeviceListActivity localDeviceListActivity = DeviceListActivity.this;
      localDeviceListActivity.count = (1 + localDeviceListActivity.count);
      if (DeviceListActivity.this.count < 7)
        DeviceListActivity.this.mHandler.postDelayed(DeviceListActivity.this.runnable, 800L);
      while (DeviceListActivity.this.searchDialog == null)
        return;
      DeviceListActivity.this.searchDialog.dismiss();
    }
  };
  private ScanDeviceListener scanListener = new ScanDeviceListener()
  {
    public void onGotDeviceByScan(XDevice paramAnonymousXDevice)
    {
      XlinkUtils.shortTips("扫描到设备:" + paramAnonymousXDevice.getMacAddress());
      XlinkUtils.shortTips("设备名字:" + paramAnonymousXDevice.getDeviceName());
      Log.d("debug", "设备名字:" + paramAnonymousXDevice.getDeviceName());
      Device localDevice;
      if (DeviceListActivity.this.scanf_flag)
      {
        DeviceManage.getInstance().addDevice(paramAnonymousXDevice);
        localDevice = (Device)DeviceManage.deviceMap.get(paramAnonymousXDevice.getMacAddress());
        if (localDevice != null)
        {
          if (DeviceListActivity.devices.size() != 0)
            break label132;
          DeviceListActivity.devices.add(localDevice);
          DeviceListActivity.this.adapter.notifyDataSetChanged();
        }
      }
      return;
      label132: label229: for (int i = 0; ; i++)
      {
        int j = DeviceListActivity.devices.size();
        int k = 0;
        if (i >= j);
        while (k == 0)
        {
          DeviceListActivity.devices.add(localDevice);
          XlinkUtils.shortTips("device mac = " + paramAnonymousXDevice.getMacAddress());
          DeviceListActivity.this.adapter.notifyDataSetChanged();
          return;
          if (!((Device)DeviceListActivity.devices.get(i)).getMacAddress().equals(paramAnonymousXDevice.getMacAddress()))
            break label229;
          k = 1;
        }
        break;
      }
    }
  };
  private boolean scanf_flag = false;
  SearchDialog searchDialog;
  private TextView tvTitle;

  public DeviceListActivity()
  {
  }

  private void LoginMain(Device paramDevice)
  {
    if ((this.loginFlag) && (paramDevice.getMacAddress().equals(this.logoinDevice.getMacAddress())))
    {
      this.loginFlag = false;
      String str1 = MyApp.deviceService.getDeviceCPassword(this.logoinDevice.getMacAddress());
      String str2 = MyApp.deviceService.getDevicePassword(this.logoinDevice.getMacAddress());
      if ((str1 != null) && (str1.equals(str2)))
      {
        MyApp.DeviceControl = this.logoinDevice;
        Conversion.hexStringtoByte(str2, MyApp.PasswordByte);
        LoginUI();
      }
    }
    else
    {
      return;
    }
    final Dialog localDialog = new Dialog(this, R.style.EditLightDialog);
    localDialog.setContentView(R.layout.activity_password);
    localDialog.setCanceledOnTouchOutside(false);
    localDialog.setCancelable(false);
    localDialog.show();
    final EditText localEditText = (EditText)localDialog.findViewById(R.id.et_name);
    localEditText.setSelection(localEditText.length());
    localDialog.findViewById(R.id.iv_clear).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        localEditText.setText(null);
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
        String str1 = localEditText.getText().toString();
        if (!TextUtils.isEmpty(str1))
        {
          String str2 = MyApp.deviceService.getDevicePassword(DeviceListActivity.this.logoinDevice.getMacAddress());
          if (str2.equals(str1))
          {
            MyApp.DeviceControl = DeviceListActivity.this.logoinDevice;
            Conversion.hexStringtoByte(str2, MyApp.PasswordByte);
            MyApp.deviceService.editcCPassword(DeviceListActivity.this.logoinDevice.getMacAddress(), str1);
            DeviceListActivity.this.LoginUI();
            localDialog.dismiss();
            return;
          }
          Toast.makeText(DeviceListActivity.this, R.string.tips_pwd_error, 0).show();
          return;
        }
        Toast.makeText(DeviceListActivity.this, R.string.tips_name_empty, 1).show();
      }
    });
  }

  private void LoginUI()
  {
    int i = MyApp.deviceService.getDeviceLogin(MyApp.DeviceControl.getMacAddress());
    Object localObject = null;
    switch (i)
    {
    default:
    case 255:
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
      startActivity(new Intent(this, (Class)localObject));
      return;
      localObject = FUT092Activity.class;
      MyApp.rain_remoteID = 8;
      continue;
      localObject = FUT092Activity.class;
      MyApp.rain_remoteID = 8;
      continue;
      localObject = FUT956Activity.class;
      MyApp.rain_remoteID = 7;
      continue;
      localObject = FUT028Activity.class;
      MyApp.rain_remoteID = 6;
      continue;
      localObject = FUT098Activity.class;
      MyApp.rain_remoteID = 5;
      continue;
      localObject = FUT020Activity.class;
      MyApp.rain_remoteID = 4;
      continue;
      localObject = FUT022Activity.class;
      MyApp.rain_remoteID = 4;
      continue;
      localObject = FUT021Activity.class;
      MyApp.rain_remoteID = 4;
      continue;
      localObject = FUT093Activity.class;
      MyApp.rain_remoteID = 2;
      continue;
      localObject = FUT091Activity.class;
      MyApp.rain_remoteID = 3;
      continue;
      localObject = FUT567Activity.class;
      MyApp.rain_remoteID = 1;
      continue;
      localObject = FUT090Activity.class;
      MyApp.rain_remoteID = 9;
    }
  }

  private static void SUCCEED(Device paramDevice, XDevice paramXDevice, int paramInt)
  {
    paramDevice.setxDevice(paramXDevice);
    paramDevice.setAccessKey(paramInt);
    DeviceManage.getInstance().addDevice(paramDevice);
    getPasswordStatus = true;
    MyApp.Aiyuxun_ConnectDevice(paramXDevice, paramInt);
  }

  private static void fail(Device paramDevice, int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "错误码：" + paramInt;
      if (paramDevice.getXDevice().isInit())
        new StringBuilder("设备认证失败,").append(str).toString();
    case 2:
    case 10:
    }
    while (true)
    {
      Log.d("debug", "linkDeviceError(tips)");
      return;
      str = "密码错误";
      break;
      str = "设备不在线";
      break;
      new StringBuilder("设置初始密码失败,：").append(str).toString();
    }
  }

  public static void getDevicePassword(Device paramDevice, int paramInt)
  {
    paramDevice.setAccessKey(paramInt);
    paramDevice.setxDevice(paramDevice.getXDevice());
    DeviceManage.getInstance().addDevice(paramDevice);
    MyApp.Aiyuxun_ConnectDevice(paramDevice.getXDevice(), paramInt);
  }

  public static int setDevicePassword(Device paramDevice, final int paramInt)
  {
    paramDevice.setAccessKey(paramInt);
    DeviceManage.getInstance().addDevice(paramDevice);
    return XlinkAgent.getInstance().setDeviceAccessKey(paramDevice.getXDevice(), paramInt, new SetDeviceAccessKeyListener()
    {
      public void onSetLocalDeviceAccessKey(XDevice paramAnonymousXDevice, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        switch (paramAnonymousInt1)
        {
        default:
          DeviceListActivity.fail(DeviceListActivity.this, paramAnonymousInt1);
        case 0:
        }
        while (true)
        {
          Log.d("debug", "设置默认密码:" + paramAnonymousInt1);
          return;
          DeviceListActivity.SUCCEED(DeviceListActivity.this, DeviceListActivity.this.getXDevice(), paramInt);
        }
      }
    });
  }

  public void Aiyunxun_onRecvPipeData(Device paramDevice, byte[] paramArrayOfByte)
  {
    Log.d("debug", "Aiyunxun_onRecvPipeData = " + Conversion.BytetohexString(paramArrayOfByte, paramArrayOfByte.length));
    if (paramArrayOfByte.length == 12)
      switch (paramArrayOfByte[0])
      {
      default:
      case 52:
      }
    while (true)
    {
      return;
      byte[] arrayOfByte = new byte[2];
      arrayOfByte[0] = paramArrayOfByte[1];
      arrayOfByte[1] = paramArrayOfByte[2];
      String str = Conversion.bytesToHexString(arrayOfByte);
      Log.d("debug", "disp getPassowrd = " + str);
      Log.d("debug", "disp cpassword = " + MyApp.deviceService.getDevicePassword(paramDevice.getMacAddress()));
      Log.d("debug", "disp password = " + MyApp.deviceService.getDeviceCPassword(paramDevice.getMacAddress()));
      for (int i = 0; i < devices.size(); i++)
        if (paramDevice.getMacAddress().equals(((Device)devices.get(i)).getMacAddress()))
        {
          ((Device)devices.get(i)).getPassword = 1;
          Log.d("debug", "device.getpassowrd mac  = " + paramDevice.getMacAddress());
          Log.d("debug", "device.getpassword = 1");
          MyApp.deviceService.editcPassword(paramDevice.getMacAddress(), str);
          LoginMain(paramDevice);
          return;
        }
    }
  }

  public void Aiyuxun_DeviceNetStatus(XDevice paramXDevice, int paramInt)
  {
    Log.d("aiyuxun", "device = " + paramXDevice.getMacAddress() + "  status = " + paramInt);
    switch (paramInt)
    {
    default:
      SetDeviceStatus(paramXDevice, 0);
      return;
    case 0:
      SetDeviceStatus(paramXDevice, 1);
      return;
    case 1:
    }
    SetDeviceStatus(paramXDevice, 2);
  }

  public void Aiyuxun_onDeviceStateChanged(Device paramDevice, int paramInt)
  {
  }

  public void Aiyuxun_onRecvPipeSyncData(Device paramDevice, byte[] paramArrayOfByte)
  {
    Log.d("debug", "Aiyuxun_onRecvPipeSyncData = " + Conversion.BytetohexString(paramArrayOfByte, paramArrayOfByte.length));
    if (paramArrayOfByte.length == 12)
      switch (paramArrayOfByte[0])
      {
      default:
      case 52:
      }
    while (true)
    {
      return;
      byte[] arrayOfByte = new byte[2];
      arrayOfByte[0] = paramArrayOfByte[1];
      arrayOfByte[1] = paramArrayOfByte[2];
      String str = Conversion.bytesToHexString(arrayOfByte);
      Log.d("debug", "disp getPassowrd = " + str);
      Log.d("debug", "disp cpassword = " + MyApp.deviceService.getDevicePassword(paramDevice.getMacAddress()));
      Log.d("debug", "disp password = " + MyApp.deviceService.getDeviceCPassword(paramDevice.getMacAddress()));
      for (int i = 0; i < devices.size(); i++)
        if (paramDevice.getMacAddress().equals(((Device)devices.get(i)).getMacAddress()))
        {
          ((Device)devices.get(i)).getPassword = 1;
          Log.d("debug", "device.getpassowrd mac  = " + paramDevice.getMacAddress());
          Log.d("debug", "device.getpassword = 1");
          MyApp.deviceService.editcPassword(paramDevice.getMacAddress(), str);
          LoginMain(paramDevice);
          return;
        }
    }
  }

  public void Aiyuxun_onSendData(XDevice paramXDevice, int paramInt)
  {
  }

  void SetDeviceStatus(XDevice paramXDevice, int paramInt)
  {
    for (int i = 0; ; i++)
    {
      if (i >= devices.size())
      {
        this.adapter.notifyDataSetChanged();
        return;
      }
      if (paramXDevice.getMacAddress().equals(((Device)devices.get(i)).getMacAddress()))
      {
        ((Device)devices.get(i)).status = paramInt;
        Log.d("debug", "new SetDeviceStatus = " + ((Device)devices.get(i)).dispFlag);
        Log.d("debug", "new devices.get(i).iconRes = " + ((Device)devices.get(i)).iconRes);
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 100) && (paramInt2 == -1))
    {
      Device localDevice = (Device)paramIntent.getSerializableExtra("light");
      this.adapter.updateLight(localDevice);
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_device_list);
    this.myLayout = ((MyLayout)findViewById(R.id.mylayout));
    this.ivLogo = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.ivAdd = ((ImageView)findViewById(R.id.iv_right));
    this.listView = ((ListView)findViewById(R.id.list));
    this.ivLogo.setImageResource(R.drawable.logo);
    this.tvTitle.setText(R.string.device_list);
    this.ivAdd.setImageResource(R.drawable.add);
    this.ivLogo.setOnClickListener(this.clickListener);
    this.ivAdd.setOnClickListener(this.clickListener);
    MyApp.getApp().auth = true;
    if (!XlinkAgent.getInstance().isConnectedLocal())
      XlinkAgent.getInstance().start();
    if (!XlinkAgent.getInstance().isConnectedOuterNet())
      XlinkAgent.getInstance().login(MyApp.getApp().getAppid(), MyApp.getApp().getAuth());
    devicesa.clear();
    devices.clear();
    devicesa = DeviceManage.getInstance().getDevices();
    Log.d("debug", "wifi light mac size = " + devicesa.size());
    for (int i = 0; ; i++)
    {
      if (i >= devicesa.size())
      {
        this.adapter = new LightAdapter();
        this.listView.setAdapter(this.adapter);
        this.listView.setOnItemClickListener(this.onItemClickListener);
        this.myLayout.setScrollEvent(this.listView);
        this.scanf_flag = true;
        return;
      }
      Log.d("debug", "wifi light mac = " + ((Device)devicesa.get(i)).getMacAddress());
      Log.d("debug", "wifi light mac size = " + devicesa.size());
      if (MyApp.deviceService.isDeviceExists(((Device)devicesa.get(i)).getMacAddress()))
      {
        LedDevice localLedDevice = MyApp.deviceService.getMyDevice(((Device)devicesa.get(i)).getMacAddress());
        ((Device)devicesa.get(i)).name = localLedDevice.name;
        ((Device)devicesa.get(i)).dispFlag = localLedDevice.dispflag;
        ((Device)devicesa.get(i)).iconPath = localLedDevice.photo;
        ((Device)devicesa.get(i)).iconRes = localLedDevice.icon;
        ((Device)devicesa.get(i)).login = localLedDevice.login;
        devices.add((Device)devicesa.get(i));
      }
    }
  }

  protected void onNewIntent(Intent paramIntent)
  {
    Log.d("debug", "----onNewIntent()");
    MyApp.getApp().auth = true;
    super.onNewIntent(paramIntent);
  }

  protected void onPause()
  {
    super.onPause();
    Log.d("debug", "onPause");
    this.deviceReadFlag = false;
    this.mApplication.cleanDeviceMessage(this);
  }

  protected void onResume()
  {
    super.onResume();
    Log.d("debug", "onResume");
    this.mApplication = ((MyApp)getApplication());
    this.mApplication.setDeviceMessage(this);
    this.deviceReadFlag = true;
    this.deviceCount = 0;
    this.myHandler.sendEmptyMessageDelayed(1, 100L);
    MyApp.SettingPasswordContext(null);
  }

  public void searchDevice(View paramView)
  {
    int i = XlinkAgent.getInstance().scanDeviceByProductId(Constant.PRODUCTID, this.scanListener);
    Log.d("debug", "on search device ret = " + i);
    if (i < 0)
    {
      switch (i)
      {
      default:
      case -4:
        do
        {
          return;
          Toast.makeText(this, getResources().getString(R.string.tip_local_net_not_open), 0).show();
        }
        while (!XlinkUtils.isWifi());
        XlinkAgent.getInstance().start();
        return;
      case -10:
      }
      Toast.makeText(this, getResources().getString(R.string.tip_phone_not_net), 0).show();
      return;
    }
    Log.d("debug", "on search stop time");
    this.searchDialog = new SearchDialog(this);
    this.searchDialog.show();
    this.count = 0;
    this.mHandler.post(this.runnable);
  }

  class LightAdapter extends BaseAdapter
  {
    private LayoutInflater inflater = DeviceListActivity.this.getLayoutInflater();
    private int itemWidth = 0;
    private final int screenWidth = ActivityUtil.getScreenWidth(DeviceListActivity.this);

    LightAdapter()
    {
    }

    public int getCount()
    {
      return DeviceListActivity.devices.size();
    }

    public Device getItem(int paramInt)
    {
      return (Device)DeviceListActivity.devices.get(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return 0L;
    }

    public View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      ViewHolder localViewHolder;
      final Device localDevice;
      if (paramView == null)
      {
        paramView = this.inflater.inflate(R.layout.list_light_item, null);
        localViewHolder = new ViewHolder(paramView);
        paramView.setTag(localViewHolder);
        AbsListView.LayoutParams localLayoutParams = (AbsListView.LayoutParams)paramView.getLayoutParams();
        if (localLayoutParams == null)
          localLayoutParams = new AbsListView.LayoutParams(-2, -2);
        LinearLayout.LayoutParams localLayoutParams2 = (LinearLayout.LayoutParams)localViewHolder.contentView.getLayoutParams();
        localLayoutParams2.width = this.screenWidth;
        localViewHolder.contentView.setLayoutParams(localLayoutParams2);
        if (this.itemWidth == 0)
        {
          ActivityUtil.measureView(localViewHolder.holderView);
          this.itemWidth = (this.screenWidth + localViewHolder.holderView.getMeasuredWidth());
        }
        localLayoutParams.width = this.itemWidth;
        paramView.setLayoutParams(localLayoutParams);
        localDevice = getItem(paramInt);
        Log.d("debug", "item.dispFlag = " + localDevice.dispFlag);
        if (localDevice.dispFlag != 0)
          break label335;
        localViewHolder.ivIcon.setImageBitmap(BitmapFactory.decodeFile(localDevice.iconPath));
        label195: localViewHolder.tvName.setText(localDevice.name);
        localDevice.mac = XlinkUtils.getHexBinString(XlinkUtils.stringToByteArray(localDevice.getMacAddress()), ":");
        localViewHolder.tvMac.setText(localDevice.mac);
        if (localDevice.status != 0)
          break label351;
        localViewHolder.ivStatus.setImageResource(R.drawable.offline);
      }
      while (true)
      {
        localViewHolder.btnEdit.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            Intent localIntent = new Intent(DeviceListActivity.this, DeviceEditActivity.class);
            localIntent.putExtra("light", localDevice);
            DeviceListActivity.this.startActivityForResult(localIntent, 100);
          }
        });
        localViewHolder.btnDel.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            Device localDevice = (Device)DeviceListActivity.devices.get(paramInt);
            String str1 = String.valueOf(localDevice.getMacAddress()) + "aa";
            if (MyApp.deviceService.wifiLight_isDeviceExists(str1))
              MyApp.deviceService.tab1_delDevice(str1);
            String str2 = String.valueOf(localDevice.getMacAddress()) + "00";
            if (MyApp.deviceService.wifiLight_isDeviceExists(str2))
              MyApp.deviceService.tab1_delDevice(str2);
            String str3 = String.valueOf(localDevice.getMacAddress()) + "01";
            MyApp.deviceService.zoneName_delDevice(str3);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str3))
              MyApp.deviceService.tab1_delDevice(str3);
            String str4 = String.valueOf(localDevice.getMacAddress()) + "02";
            MyApp.deviceService.zoneName_delDevice(str4);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str4))
              MyApp.deviceService.tab1_delDevice(str4);
            String str5 = String.valueOf(localDevice.getMacAddress()) + "03";
            MyApp.deviceService.zoneName_delDevice(str5);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str5))
              MyApp.deviceService.tab1_delDevice(str5);
            String str6 = String.valueOf(localDevice.getMacAddress()) + "04";
            MyApp.deviceService.zoneName_delDevice(str6);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str6))
              MyApp.deviceService.tab1_delDevice(str6);
            String str7 = String.valueOf(localDevice.getMacAddress()) + "05";
            MyApp.deviceService.zoneName_delDevice(str7);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str7))
              MyApp.deviceService.tab1_delDevice(str7);
            String str8 = String.valueOf(localDevice.getMacAddress()) + "06";
            MyApp.deviceService.zoneName_delDevice(str8);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str8))
              MyApp.deviceService.tab1_delDevice(str8);
            String str9 = String.valueOf(localDevice.getMacAddress()) + "07";
            MyApp.deviceService.zoneName_delDevice(str9);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str9))
              MyApp.deviceService.tab1_delDevice(str9);
            String str10 = String.valueOf(localDevice.getMacAddress()) + "08";
            MyApp.deviceService.zoneName_delDevice(str10);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str10))
              MyApp.deviceService.tab1_delDevice(str10);
            String str11 = String.valueOf(localDevice.getMacAddress()) + "09";
            MyApp.deviceService.zoneName_delDevice(str11);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str11))
              MyApp.deviceService.tab1_delDevice(str11);
            String str12 = String.valueOf(localDevice.getMacAddress()) + "10";
            MyApp.deviceService.zoneName_delDevice(str12);
            if (MyApp.deviceService.wifiLight_isDeviceExists(str12))
              MyApp.deviceService.tab1_delDevice(str12);
            MyApp.deviceService.delDevice(localDevice.getMacAddress());
            if (MyApp.deviceService.wifiLightTime_isDeviceExists(localDevice.getMacAddress()))
              MyApp.deviceService.wifiLightTime_delDevice(localDevice.getMacAddress());
            DeviceManage.getInstance().removeDevice(localDevice.getMacAddress());
            DeviceListActivity.devices.remove(localDevice);
            DeviceListActivity.LightAdapter.this.notifyDataSetChanged();
          }
        });
        LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localViewHolder.contentView.getLayoutParams();
        localLayoutParams1.leftMargin = 0;
        localViewHolder.contentView.setLayoutParams(localLayoutParams1);
        return paramView;
        localViewHolder = (ViewHolder)paramView.getTag();
        break;
        label335: localViewHolder.ivIcon.setImageResource(localDevice.iconRes);
        break label195;
        label351: if (localDevice.status == 1)
          localViewHolder.ivStatus.setImageResource(R.drawable.online);
        else if (localDevice.status == 2)
          localViewHolder.ivStatus.setImageResource(R.drawable.internet);
      }
    }

    public void updateLight(Device paramDevice)
    {
      int i = getCount();
      int j = -1;
      for (int k = 0; ; k++)
      {
        if (k >= i);
        while (true)
        {
          if (j != -1)
          {
            ((Device)DeviceListActivity.devices.get(j)).dispFlag = paramDevice.dispFlag;
            ((Device)DeviceListActivity.devices.get(j)).iconPath = paramDevice.iconPath;
            ((Device)DeviceListActivity.devices.get(j)).iconRes = paramDevice.iconRes;
            ((Device)DeviceListActivity.devices.get(j)).name = paramDevice.name;
            notifyDataSetChanged();
          }
          return;
          if (!getItem(k).getMacAddress().equals(paramDevice.getMacAddress()))
            break;
          j = k;
        }
      }
    }

    class ViewHolder
    {
      Button btnDel;
      Button btnEdit;
      View contentView;
      View holderView;
      ImageView ivIcon;
      ImageView ivStatus;
      TextView tvMac;
      TextView tvName;

      ViewHolder(View arg2)
      {
        Object localObject;
        this.contentView = localObject.findViewById(R.id.contentview);
        this.holderView = localObject.findViewById(R.id.holderview);
        this.ivIcon = ((ImageView)localObject.findViewById(R.id.iv_icon));
        this.tvName = ((TextView)localObject.findViewById(R.id.tv_name));
        this.tvMac = ((TextView)localObject.findViewById(R.id.tv_mac));
        this.ivStatus = ((ImageView)localObject.findViewById(R.id.iv_status));
        this.btnEdit = ((Button)localObject.findViewById(R.id.btn_edit));
        this.btnDel = ((Button)localObject.findViewById(R.id.btn_del));
      }
    }
  }

  public class PasswordDialog_Device extends Dialog
  {
    private Button btnOk;
    private View.OnClickListener clickListener = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (paramAnonymousView == DeviceListActivity.PasswordDialog_Device.this.btnOk)
        {
          String str1 = MyApp.deviceService.getDevicePassword(DeviceListActivity.this.adapter.getItem(DeviceListActivity.PasswordDialog_Device.this.device_id).getMacAddress());
          String str2 = DeviceListActivity.PasswordDialog_Device.this.etPwd.getText().toString().trim();
          if (str1.equals(str2))
          {
            Intent localIntent = new Intent(DeviceListActivity.this, FUT092Activity.class);
            localIntent.putExtra("device-mac", DeviceListActivity.this.adapter.getItem(DeviceListActivity.PasswordDialog_Device.this.device_id));
            DeviceListActivity.this.startActivity(localIntent);
            MyApp.deviceService.editcCPassword(DeviceListActivity.this.adapter.getItem(DeviceListActivity.PasswordDialog_Device.this.device_id).getMacAddress(), str2);
            DeviceListActivity.PasswordDialog_Device.this.dismiss();
          }
        }
        else
        {
          return;
        }
        Toast.makeText(DeviceListActivity.PasswordDialog_Device.this.getContext(), R.string.tips_pwd_error, 1).show();
      }
    };
    private int device_id = 0;
    private EditText etPwd;

    public PasswordDialog_Device(Context arg2)
    {
      super(R.style.pwdDialog);
    }

    private PasswordDialog_Device(Context paramInt, int arg3)
    {
      super(i);
    }

    private void SetDeviceID(int paramInt)
    {
      this.device_id = paramInt;
    }

    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      setContentView(R.layout.dialog_password);
      this.etPwd = ((EditText)findViewById(R.id.et_pwd));
      this.btnOk = ((Button)findViewById(R.id.btn_ok));
      this.btnOk.setOnClickListener(this.clickListener);
      setCancelable(false);
      setCanceledOnTouchOutside(false);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceListActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */