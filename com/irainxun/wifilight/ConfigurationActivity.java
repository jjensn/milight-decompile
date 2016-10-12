package com.irainxun.wifilight;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.security.Credentials;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.hiflying.smartlink.OnSmartLinkListener;
import com.hiflying.smartlink.SmartLinkedModule;
import com.hiflying.smartlink.v3.SnifferSmartLinker;
import com.irainxun.wifilight.apsetting.android.AccessPoint;
import com.irainxun.wifilight.apsetting.android.Repeater;
import com.irainxun.wifilight.apsetting.android.Scanner;
import com.irainxun.wifilight.apsetting.model.ATCommand;
import com.irainxun.wifilight.apsetting.model.ATCommandListener;
import com.irainxun.wifilight.apsetting.model.Module;
import com.irainxun.wifilight.apsetting.model.NetworkProtocol;
import com.irainxun.wifilight.apsetting.model.WifiStatus;
import com.irainxun.wifilight.apsetting.net.UdpBroadcast;
import com.irainxun.wifilight.apsetting.net.UdpUnicast;
import com.irainxun.wifilight.apsetting.utils.Utils;
import com.irainxun.wifilight.util.ActivityUtil;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConfigurationActivity extends Activity
  implements View.OnClickListener, OnSmartLinkListener
{
  private static final int CONFIG_TIME = 60;
  private static final int MSG_ENABLE_WIFI = 3;
  private static final int MSG_ENTER_CMD = 1;
  private static final int MSG_RETRY_ENTER_CMD = 2;
  private static final int MSG_SMARTLINT_DONE = 4;
  private static final int REQCODE_SELECT_WIFI = 100;
  public static final int TYPE_AP = 1;
  public static final int TYPE_SMART;
  private ScanResult ApScanResult;
  private boolean ConnectMode;
  protected final String TAG = getClass().getSimpleName();
  private Button btnInstruction;
  private Button btnSetting;
  private CheckBox cbShowPwd;
  private CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener()
  {
    public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
    {
      if (paramAnonymousCompoundButton == ConfigurationActivity.this.cbShowPwd)
      {
        if (!paramAnonymousBoolean)
          break label49;
        ConfigurationActivity.this.etWiFiPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
      }
      while (true)
      {
        ConfigurationActivity.this.etWiFiPwd.setSelection(ConfigurationActivity.this.etWiFiPwd.length());
        return;
        label49: ConfigurationActivity.this.etWiFiPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
      }
    }
  };
  private boolean configResult;
  private EditText etWiFiName;
  private EditText etWiFiPwd;
  private Handler handler = new Handler();
  private ImageView ivBack;
  private ATCommand mATCommand;
  private ATCommandListener mATCommandListener;
  private StringBuffer mAtResponse = new StringBuffer();
  private ScanResult mConnect2ScanResult;
  private int mFailedTimes;
  private final IntentFilter mFilter = new IntentFilter();
  private boolean mIsCMDMode;
  private boolean mIsExit;
  private long mLastCMD;
  private WifiInfo mLastInfo;
  private NetworkInfo.DetailedState mLastState;
  private WifiStatus mLastWifiStatus;
  private List<AccessPoint> mLatestAccessPoints;
  private List<Module> mModules;
  private Handler mNetworkHandler;
  private final BroadcastReceiver mReceiver;
  private boolean mResetNetworks = true;
  private UdpBroadcast mScanBroadcast;
  private Scanner mScanner;
  protected SnifferSmartLinker mSnifferSmartLinker;
  private Repeater mTestCmdRepeater;
  private UdpUnicast mUdpUnicast;
  private BroadcastReceiver mWifiChangedReceiver;
  private WifiManager mWifiManager;
  private RadioGroup.OnCheckedChangeListener onModelChangedListener = new RadioGroup.OnCheckedChangeListener()
  {
    public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
    {
      switch (paramAnonymousInt)
      {
      default:
      case R.id.rb1:
      case R.id.rb2:
      }
      do
      {
        return;
        ConfigurationActivity.this.ConnectMode = false;
        ConfigurationActivity.this.mSnifferSmartLinker = SnifferSmartLinker.getInstence();
        Log.d("debug", "smartLink setting!");
        ConfigurationActivity.this.vChooseWiFi.setVisibility(4);
        return;
        Log.d("debug", "AP_mode setting!");
        ConfigurationActivity.this.vChooseWiFi.setVisibility(0);
        ConfigurationActivity.this.ConnectMode = true;
      }
      while (ConfigurationActivity.this.mSnifferSmartLinker == null);
      ConfigurationActivity.this.mSnifferSmartLinker.setOnSmartLinkListener(null);
      ConfigurationActivity.this.mSnifferSmartLinker.stop();
    }
  };
  private RadioButton rbApLink;
  private RadioButton rbSmartLink;
  private RadioGroup rgModelType;
  private List<ScanResult> scanResults;
  private Dialog smartdialog;
  private int time;
  protected TextView tvRight;
  protected TextView tvTitle;
  private View vChooseWiFi;

  public ConfigurationActivity()
  {
    this.mFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    this.mFilter.addAction("android.net.wifi.SCAN_RESULTS");
    this.mFilter.addAction("android.net.wifi.NETWORK_IDS_CHANGED");
    this.mFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
    this.mFilter.addAction("android.net.wifi.STATE_CHANGE");
    this.mFilter.addAction("android.net.wifi.RSSI_CHANGED");
    this.mReceiver = new BroadcastReceiver()
    {
      public void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        ConfigurationActivity.this.handleEvent(paramAnonymousIntent);
      }
    };
    this.mScanBroadcast = new UdpBroadcast()
    {
      public void onReceived(List<DatagramPacket> paramAnonymousList)
      {
        ConfigurationActivity.this.mScanBroadcast.close();
        ConfigurationActivity.this.mModules = Utils.decodePackets(ConfigurationActivity.this, paramAnonymousList);
        if ((ConfigurationActivity.this.mModules != null) && (ConfigurationActivity.this.mModules.size() > 0) && (ConfigurationActivity.this.mModules.get(0) != null))
        {
          Log.d("debug", "ScanBroadcast: save the module info in local file:" + ConfigurationActivity.this.mModules.get(0));
          Utils.saveDevice(ConfigurationActivity.this, ConfigurationActivity.this.generateNetworkKey(), (Module)ConfigurationActivity.this.mModules.get(0));
          return;
        }
        Log.d("debug", "ScanBroadcast: not find any module info");
        ConfigurationActivity.this.mScanBroadcast.open();
        ConfigurationActivity.this.mScanBroadcast.send(Utils.getCMDScanModules(ConfigurationActivity.this));
      }
    };
    this.mNetworkHandler = new Handler()
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        super.handleMessage(paramAnonymousMessage);
        switch (paramAnonymousMessage.what)
        {
        case 3:
        default:
          return;
        case 1:
          Log.d("debug", "try to enter cmd mode");
          Module localModule = Utils.getDevice(ConfigurationActivity.this, ConfigurationActivity.this.generateNetworkKey());
          if (localModule != null)
          {
            if (ConfigurationActivity.this.mModules != null)
              break label176;
            ConfigurationActivity.this.mModules = new ArrayList();
            ConfigurationActivity.this.mModules.add(localModule);
          }
          while (true)
          {
            ConfigurationActivity.this.mUdpUnicast.setIp(((Module)ConfigurationActivity.this.mModules.get(0)).getIp());
            ConfigurationActivity.this.mUdpUnicast.open();
            ConfigurationActivity.this.mFailedTimes = 0;
            new Thread(new Runnable()
            {
              public void run()
              {
                ConfigurationActivity.this.mATCommand.enterCMDMode();
              }
            }).start();
            return;
            ConfigurationActivity.this.mModules.add(0, localModule);
          }
        case 2:
          label176: Log.d("debug", "MSG_RETRY_ENTER_CMD");
          ConfigurationActivity.this.setProgressBarIndeterminateVisibility(true);
          if (ConfigurationActivity.this.mFailedTimes > 3)
          {
            Log.d("debug", "MSG_RETRY_ENTER_CMD = R.string.retry");
            ConfigurationActivity.this.configResult = false;
            ConfigurationActivity.this.time = 0;
            return;
          }
          Log.d("debug", "MSG_RETRY_ENTER_CMD = R.string.waitting");
          return;
        case 4:
        }
        ConfigurationActivity.this.configResult = true;
        ConfigurationActivity.this.time = 0;
      }
    };
    this.mLatestAccessPoints = new ArrayList();
    Log.d("debug", "Init AP data");
  }

  private void ApTip()
  {
    final Dialog localDialog = new Dialog(this, R.style.EditLightDialog);
    localDialog.setContentView(R.layout.ap_dialog_config);
    localDialog.setCanceledOnTouchOutside(false);
    localDialog.setCancelable(false);
    Window localWindow = localDialog.getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    localWindow.setGravity(17);
    localLayoutParams.width = (ActivityUtil.getScreenWidth(this) - getResources().getDimensionPixelSize(R.dimen.dp60));
    localLayoutParams.height = -2;
    localLayoutParams.alpha = 1.0F;
    localWindow.setAttributes(localLayoutParams);
    localDialog.show();
    final TextView localTextView1 = (TextView)localDialog.findViewById(R.id.t_title);
    final TextView localTextView2 = (TextView)localDialog.findViewById(R.id.t_msg);
    final Button localButton = (Button)localDialog.findViewById(R.id.btn_cancel);
    final Runnable local9 = new Runnable()
    {
      public void run()
      {
        if (ConfigurationActivity.this.time > 1)
        {
          ConfigurationActivity localConfigurationActivity1 = ConfigurationActivity.this;
          localConfigurationActivity1.time = (-1 + localConfigurationActivity1.time);
          TextView localTextView = localTextView2;
          ConfigurationActivity localConfigurationActivity2 = ConfigurationActivity.this;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(ConfigurationActivity.this.time);
          localTextView.setText(localConfigurationActivity2.getString(R.string.tips_config_msg, arrayOfObject));
          ConfigurationActivity.this.handler.postDelayed(this, 1000L);
          return;
        }
        if (ConfigurationActivity.this.configResult)
        {
          localTextView1.setText("Configured");
          localTextView1.setTextColor(Color.rgb(255, 0, 0));
          localTextView2.setText(null);
          localButton.setText("OK");
          return;
        }
        localTextView1.setText(R.string.config_fail);
        localTextView1.setTextColor(-65536);
        localTextView2.setText(R.string.apdesc_config_fail);
      }
    };
    this.time = 60;
    localTextView1.setText(R.string.configing);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.time);
    localTextView2.setText(getString(R.string.tips_config_msg, arrayOfObject));
    this.handler.postDelayed(local9, 1000L);
    doConfig();
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        ConfigurationActivity.this.handler.removeCallbacks(local9);
        localDialog.dismiss();
      }
    });
  }

  private void InitAP()
  {
    this.mWifiManager = ((WifiManager)getSystemService("wifi"));
    this.mWifiManager.startScan();
    this.scanResults = this.mWifiManager.getScanResults();
    this.mConnect2ScanResult = Utils.getLastScanResult(this);
    this.mLastWifiStatus = new WifiStatus(this);
    this.mLastWifiStatus.load();
    String str1 = this.mLastWifiStatus.getBSSID();
    Log.d("debug", "bssid = " + str1);
    int j;
    ScanResult localScanResult;
    if (str1 != null)
      if (this.scanResults != null)
      {
        j = 0;
        int k = this.scanResults.size();
        localScanResult = null;
        if (j < k)
          break label317;
        label126: if (localScanResult != null)
          this.mConnect2ScanResult = localScanResult;
      }
    label317: label464: 
    while (true)
    {
      this.mScanner = new Scanner(this);
      WifiInfo localWifiInfo = this.mWifiManager.getConnectionInfo();
      String str2 = localWifiInfo.getSSID();
      Log.d(this.TAG, "The current connection ssid is " + localWifiInfo);
      Log.d(this.TAG, "The current connection ssid is " + str2);
      this.mATCommandListener = new ATCommandListener()
      {
        public void onEnterCMDMode(boolean paramAnonymousBoolean)
        {
          Log.d(ConfigurationActivity.this.TAG, "onEnterCMDMode:" + paramAnonymousBoolean);
          ConfigurationActivity.this.setProgressBarIndeterminateVisibility(false);
          ConfigurationActivity.this.mIsCMDMode = paramAnonymousBoolean;
          if (paramAnonymousBoolean)
          {
            if (ConfigurationActivity.this.mTestCmdRepeater != null)
              ConfigurationActivity.this.mTestCmdRepeater.pause();
            ConfigurationActivity.this.mTestCmdRepeater = new Repeater(30000L)
            {
              public void repeateAction()
              {
                ConfigurationActivity.this.mATCommand.send("AT+VER\r\n");
              }
            };
            ConfigurationActivity.this.mTestCmdRepeater.resume();
          }
          do
          {
            return;
            ConfigurationActivity localConfigurationActivity = ConfigurationActivity.this;
            localConfigurationActivity.mFailedTimes = (1 + localConfigurationActivity.mFailedTimes);
            if (ConfigurationActivity.this.mFailedTimes > 3)
              Log.d("debug", "R.color.red, getString(R.string.enter_cmd_mode_failed)");
          }
          while (ConfigurationActivity.this.mIsExit);
          Log.d("debug", "Retry to enter CMD mode again for times");
          ConfigurationActivity.this.mNetworkHandler.sendEmptyMessageDelayed(2, 1000L);
        }

        public void onExitCMDMode(boolean paramAnonymousBoolean, NetworkProtocol paramAnonymousNetworkProtocol)
        {
          Log.d("debug", "onExitCMDMode:" + paramAnonymousBoolean);
        }

        public void onReload(boolean paramAnonymousBoolean)
        {
        }

        public void onReset(boolean paramAnonymousBoolean)
        {
        }

        public void onResponse(String paramAnonymousString)
        {
          Log.d(ConfigurationActivity.this.TAG, "onResponse:" + paramAnonymousString);
          String str = paramAnonymousString.trim();
          if (((str.equals("+ok")) || (str.startsWith("+ERR"))) && (System.currentTimeMillis() - ConfigurationActivity.this.mLastCMD < 2000L))
            synchronized (ConfigurationActivity.this.mAtResponse)
            {
              ConfigurationActivity.this.mAtResponse.setLength(0);
              ConfigurationActivity.this.mAtResponse.append(str);
              ConfigurationActivity.this.mAtResponse.notifyAll();
              return;
            }
        }

        public void onResponseOfSendFile(String paramAnonymousString)
        {
        }

        public void onSendFile(boolean paramAnonymousBoolean)
        {
        }
      };
      this.mUdpUnicast = new UdpUnicast();
      this.mUdpUnicast.setPort(Utils.getUdpPort(this));
      Log.d("debug", "setPort = " + Utils.getUdpPort(this));
      this.mATCommand = new ATCommand(this.mUdpUnicast);
      this.mATCommand.setListener(this.mATCommandListener);
      registerReceiver(this.mReceiver, this.mFilter);
      return;
      if (Utils.removeDoubleQuotes(((ScanResult)this.scanResults.get(j)).BSSID).equals(Utils.removeDoubleQuotes(str1)))
      {
        localScanResult = (ScanResult)this.scanResults.get(j);
        break label126;
      }
      j++;
      break;
      if ((this.mConnect2ScanResult != null) && (this.scanResults != null))
        for (int i = 0; ; i++)
        {
          if (i >= this.scanResults.size())
            break label464;
          if (Utils.removeDoubleQuotes(((ScanResult)this.scanResults.get(i)).BSSID).equals(Utils.removeDoubleQuotes(this.mConnect2ScanResult.BSSID)))
          {
            this.mConnect2ScanResult = ((ScanResult)this.scanResults.get(i));
            break;
          }
        }
    }
  }

  private void SmartLinkTip()
  {
    this.smartdialog.setContentView(R.layout.dialog_config);
    this.smartdialog.setCanceledOnTouchOutside(false);
    this.smartdialog.setCancelable(false);
    Window localWindow = this.smartdialog.getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    localWindow.setGravity(17);
    localLayoutParams.width = (ActivityUtil.getScreenWidth(this) - getResources().getDimensionPixelSize(R.dimen.dp60));
    localLayoutParams.height = -2;
    localLayoutParams.alpha = 1.0F;
    localWindow.setAttributes(localLayoutParams);
    this.smartdialog.show();
    final TextView localTextView1 = (TextView)this.smartdialog.findViewById(R.id.t_title);
    final TextView localTextView2 = (TextView)this.smartdialog.findViewById(R.id.t_msg);
    Button localButton1 = (Button)this.smartdialog.findViewById(R.id.btn_retry);
    final Button localButton2 = (Button)this.smartdialog.findViewById(R.id.btn_cancel);
    final Runnable local6 = new Runnable()
    {
      public void run()
      {
        if (ConfigurationActivity.this.time > 1)
        {
          ConfigurationActivity localConfigurationActivity1 = ConfigurationActivity.this;
          localConfigurationActivity1.time = (-1 + localConfigurationActivity1.time);
          TextView localTextView = localTextView2;
          ConfigurationActivity localConfigurationActivity2 = ConfigurationActivity.this;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(ConfigurationActivity.this.time);
          localTextView.setText(localConfigurationActivity2.getString(R.string.tips_config_msg, arrayOfObject));
          ConfigurationActivity.this.handler.postDelayed(this, 1000L);
          return;
        }
        if (ConfigurationActivity.this.configResult)
        {
          localTextView1.setText(R.string.config_success);
          localButton2.setText("OK");
          localTextView2.setText(null);
          return;
        }
        localTextView1.setText(R.string.config_fail);
        localTextView1.setTextColor(-65536);
        localTextView2.setText(R.string.desc_config_fail);
      }
    };
    this.time = 60;
    localTextView1.setText(R.string.configing);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.time);
    localTextView2.setText(getString(R.string.tips_config_msg, arrayOfObject));
    this.handler.postDelayed(local6, 1000L);
    doConfig();
    localButton1.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        try
        {
          ConfigurationActivity.this.mSnifferSmartLinker.setOnSmartLinkListener(ConfigurationActivity.this);
          SnifferSmartLinker localSnifferSmartLinker = ConfigurationActivity.this.mSnifferSmartLinker;
          Context localContext = ConfigurationActivity.this.getApplicationContext();
          String str = ConfigurationActivity.this.etWiFiPwd.getText().toString().trim();
          String[] arrayOfString = new String[1];
          arrayOfString[0] = ConfigurationActivity.this.etWiFiName.getText().toString().trim();
          localSnifferSmartLinker.start(localContext, str, arrayOfString);
          ConfigurationActivity.this.smartdialog.dismiss();
          ConfigurationActivity.this.SmartLinkTip();
          ConfigurationActivity.this.handler.removeCallbacks(local6);
          ConfigurationActivity.this.time = 60;
          localTextView1.setText(R.string.configing);
          TextView localTextView = localTextView2;
          ConfigurationActivity localConfigurationActivity = ConfigurationActivity.this;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(ConfigurationActivity.this.time);
          localTextView.setText(localConfigurationActivity.getString(R.string.tips_config_msg, arrayOfObject));
          ConfigurationActivity.this.handler.postDelayed(local6, 1000L);
          ConfigurationActivity.this.doConfig();
          return;
        }
        catch (Exception localException)
        {
          while (true)
            localException.printStackTrace();
        }
      }
    });
    localButton2.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        ConfigurationActivity.this.handler.removeCallbacks(local6);
        ConfigurationActivity.this.smartdialog.dismiss();
      }
    });
  }

  private void closeActions()
  {
    this.mNetworkHandler.removeMessages(2);
    this.mScanBroadcast.close();
    this.mUdpUnicast.close();
    if (this.mTestCmdRepeater != null)
      this.mTestCmdRepeater.pause();
  }

  private void connect(int paramInt)
  {
    if (paramInt == -1)
      return;
    this.mWifiManager.enableNetwork(paramInt, true);
    this.mWifiManager.reconnect();
    updateAccessPoints();
  }

  private void connectAP(AccessPoint paramAccessPoint, String paramString)
  {
    Log.d("debug", "connectSecurityAP- " + paramAccessPoint);
    WifiConfiguration localWifiConfiguration = Utils.generateWifiConfiguration(paramAccessPoint, paramString);
    if (localWifiConfiguration == null)
      if ((paramAccessPoint != null) && (!requireKeyStore(paramAccessPoint.getConfig())))
        connect(paramAccessPoint.getNetworkId());
    int i;
    do
    {
      do
      {
        return;
        if (localWifiConfiguration.networkId == -1)
          break;
      }
      while (paramAccessPoint == null);
      this.mWifiManager.updateNetwork(localWifiConfiguration);
      saveNetworks();
      return;
      i = this.mWifiManager.addNetwork(localWifiConfiguration);
    }
    while (i == -1);
    this.mWifiManager.enableNetwork(i, false);
    localWifiConfiguration.networkId = i;
    if (requireKeyStore(localWifiConfiguration))
    {
      saveNetworks();
      return;
    }
    connect(i);
  }

  private void doConfig()
  {
    this.configResult = false;
  }

  private void enableNetworks()
  {
    for (int i = -1 + this.mLatestAccessPoints.size(); ; i--)
    {
      if (i < 0)
        return;
      WifiConfiguration localWifiConfiguration = ((AccessPoint)this.mLatestAccessPoints.get(i)).getConfig();
      if ((localWifiConfiguration != null) && (localWifiConfiguration.status != 2))
        this.mWifiManager.enableNetwork(localWifiConfiguration.networkId, false);
    }
  }

  private String generateNetworkKey()
  {
    WifiInfo localWifiInfo = this.mWifiManager.getConnectionInfo();
    if ((localWifiInfo != null) && (localWifiInfo.getBSSID() != null))
      return localWifiInfo.getBSSID();
    return Utils.getSettingApSSID(this);
  }

  private void goBack()
  {
    if (!"deviceList".equals(getIntent().getStringExtra("from")))
    {
      Intent localIntent = new Intent(this, MoreActivity.class);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
    }
    finish();
  }

  private void handleEvent(Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if ("android.net.wifi.WIFI_STATE_CHANGED".equals(str1))
    {
      updateWifiState(paramIntent.getIntExtra("wifi_state", 4));
      Log.d("debug", "WifiManager.WIFI_STATE_CHANGED_ACTION");
    }
    NetworkInfo.DetailedState localDetailedState;
    label435: label450: 
    do
    {
      do
      {
        return;
        if ("android.net.wifi.SCAN_RESULTS".equals(str1))
        {
          Log.d("debug", "WifiManager.SCAN_RESULTS_AVAILABLE_ACTION");
          updateAccessPoints();
          return;
        }
        if ("android.net.wifi.NETWORK_IDS_CHANGED".equals(str1))
        {
          updateAccessPoints();
          Log.d("debug", "WifiManager.NETWORK_IDS_CHANGED_ACTION");
          return;
        }
        if ("android.net.wifi.supplicant.STATE_CHANGE".equals(str1))
        {
          updateConnectionState(WifiInfo.getDetailedStateOf((SupplicantState)paramIntent.getParcelableExtra("newState")));
          Log.d("debug", "WifiManager.SUPPLICANT_STATE_CHANGED_ACTION");
          return;
        }
      }
      while (!"android.net.wifi.STATE_CHANGE".equals(str1));
      localDetailedState = ((NetworkInfo)paramIntent.getParcelableExtra("networkInfo")).getDetailedState();
      String str2 = AccessPoint.removeDoubleQuotes(this.mWifiManager.getConnectionInfo().getSSID());
      Log.d("debug", "get ssid  = " + str2);
      Log.d("debug", "get ssid len  = " + str2.length());
      if (str2.length() == 17)
        Log.d("debug", "substring name = " + str2.substring(0, 10));
      if ((localDetailedState == NetworkInfo.DetailedState.CONNECTED) && (str2 != null) && (str2.length() == 17) && ("Milight3.0".equals(str2.substring(0, 10))))
      {
        Log.d("debug", "DetailedState.CONNECTED");
        Log.d("debug", String.valueOf(str2) + " is connected.");
        Utils.SettingApSSID(this, str2);
        Log.d("debug", "get setting ssid = " + Utils.getSettingApSSID(this));
        Module localModule;
        if (!this.mIsCMDMode)
        {
          localModule = Utils.getDevice(this, generateNetworkKey());
          if (localModule == null)
            break label450;
          if (this.mModules != null)
            break label435;
          this.mModules = new ArrayList();
          this.mModules.add(localModule);
          this.mNetworkHandler.removeMessages(2);
          this.mNetworkHandler.sendEmptyMessage(1);
        }
        while (true)
        {
          Log.d("debug", "mWifiAutomaticConnecter  great");
          return;
          this.mModules.add(0, localModule);
          break;
          Log.d("debug", "Start to broadcast to find module info...");
          this.mScanBroadcast.open();
          this.mScanBroadcast.send(Utils.getCMDScanModules(this));
        }
      }
    }
    while ((localDetailedState == NetworkInfo.DetailedState.DISCONNECTED) || (localDetailedState == NetworkInfo.DetailedState.OBTAINING_IPADDR));
    "android.net.wifi.RSSI_CHANGED".equals(str1);
  }

  private boolean requireKeyStore(WifiConfiguration paramWifiConfiguration)
  {
    if ((Utils.requireKeyStore(paramWifiConfiguration)) && (!Utils.testKeyStoreNoError()))
    {
      Credentials.getInstance().unlock(this);
      return true;
    }
    return false;
  }

  private void saveNetworks()
  {
    this.mWifiManager.saveConfiguration();
    updateAccessPoints();
  }

  private boolean sendAtCmd(String paramString, StringBuffer paramStringBuffer)
  {
    boolean bool1 = false;
    int i = 0;
    if (i >= 2)
      return bool1;
    synchronized (this.mAtResponse)
    {
      this.mAtResponse.setLength(0);
      if (this.mATCommand != null)
      {
        this.mLastCMD = System.currentTimeMillis();
        this.mATCommand.send(paramString);
      }
      boolean bool2 = "AT+Z\r".equals(paramString);
      if (!bool2)
        try
        {
          this.mAtResponse.wait(2000L);
          str = this.mAtResponse.toString().trim();
          if (str.equals("+ok"))
          {
            if (paramStringBuffer != null)
              paramStringBuffer.append("+ok");
            return true;
            localObject = finally;
            throw localObject;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          while (true)
            localInterruptedException.printStackTrace();
          if (str.startsWith("+ERR"))
          {
            if (paramStringBuffer != null)
              paramStringBuffer.append("+ERR");
            return false;
          }
        }
    }
    while (true)
    {
      String str;
      i++;
      break;
      bool1 = true;
    }
  }

  private void switchModule2STA(final ScanResult paramScanResult, final String paramString)
  {
    new AsyncTask()
    {
      private static final int RESULT_CMD_MODE_FAILED = -1;
      private static final int RESULT_RESPONSE_ERROR = -2;
      private static final int RESULT_RESPONSE_TIME_OUT = -3;
      private static final int RESULT_SUCCESS;

      protected Integer doInBackground(Void[] paramAnonymousArrayOfVoid)
      {
        int i = -2;
        StringBuffer localStringBuffer1 = new StringBuffer();
        if (!ConfigurationActivity.this.sendAtCmd("AT+\r", localStringBuffer1))
          synchronized (ConfigurationActivity.this.mAtResponse)
          {
            Log.d("debuga", "Try to enter into cmd mode again");
            ConfigurationActivity.this.mAtResponse.setLength(0);
            ConfigurationActivity.this.mATCommand.enterCMDMode();
            try
            {
              ConfigurationActivity.this.mAtResponse.wait(15000L);
              if (ConfigurationActivity.this.mAtResponse.toString().trim().equals(""))
              {
                Log.d("debugaa", "Enter into cmd mode failed");
                return Integer.valueOf(-1);
              }
            }
            catch (InterruptedException localInterruptedException2)
            {
              while (true)
                localInterruptedException2.printStackTrace();
            }
          }
        localStringBuffer1.setLength(0);
        if (!ConfigurationActivity.this.sendAtCmd("AT+WMODE=STA\r\n", localStringBuffer1))
        {
          Log.d("debugaa", "Failed: send AT+WMODE=STA");
          if (localStringBuffer1.toString().equals("+ERR"));
          while (true)
          {
            return Integer.valueOf(i);
            i = -3;
          }
        }
        localStringBuffer1.setLength(0);
        if (!ConfigurationActivity.this.sendAtCmd(Utils.generateWsssid(paramScanResult.SSID), localStringBuffer1))
        {
          Log.d("debugaa", "Failed: send AT+WSSSID=%s");
          if (localStringBuffer1.toString().equals("+ERR"));
          while (true)
          {
            return Integer.valueOf(i);
            i = -3;
          }
        }
        localStringBuffer1.setLength(0);
        if (!ConfigurationActivity.this.sendAtCmd(Utils.generateWskeyCmd(paramScanResult, paramString), localStringBuffer1))
        {
          Log.d("debugaa", "Failed: send AT+WSKEY=%s");
          if (localStringBuffer1.toString().equals("+ERR"));
          while (true)
          {
            return Integer.valueOf(i);
            i = -3;
          }
        }
        ConfigurationActivity.this.sendAtCmd("AT+Z\r", null);
        try
        {
          Thread.sleep(300L);
          return Integer.valueOf(0);
        }
        catch (InterruptedException localInterruptedException1)
        {
          while (true)
            localInterruptedException1.printStackTrace();
        }
      }

      protected void onPostExecute(Integer paramAnonymousInteger)
      {
        if (paramAnonymousInteger != null);
        switch (paramAnonymousInteger.intValue())
        {
        default:
          return;
        case -1:
          Log.d("debug", "ap mode simpleDialog(R.string.enter_cmd_mode_failed)");
          ConfigurationActivity.this.configResult = false;
          ConfigurationActivity.this.time = 0;
          return;
        case -2:
          Log.d("debug", "ap mode simpleDialog(R.string.response_failed)");
          ConfigurationActivity.this.configResult = false;
          ConfigurationActivity.this.time = 0;
          return;
        case -3:
          ConfigurationActivity.this.configResult = false;
          ConfigurationActivity.this.time = 0;
          Log.d("debug", "ap mode simpleDialog(R.string.response_time_out)");
          return;
        case 0:
        }
        ConfigurationActivity.this.configResult = true;
        ConfigurationActivity.this.time = 0;
        Log.d("debug", "ap mode setting right!!!!!!");
      }

      protected void onPreExecute()
      {
        ConfigurationActivity.this.showDialog(1);
      }
    }
    .execute(new Void[] { null, null, null });
  }

  private List<AccessPoint> updateAccessPoints()
  {
    while (true);
    ArrayList localArrayList1;
    List localList1;
    break label72;
    try
    {
      localArrayList1 = new ArrayList();
      localList1 = this.mWifiManager.getConfiguredNetworks();
      if (localList1 != null)
      {
        localIterator1 = localList1.iterator();
        if (localIterator1.hasNext());
      }
      else
      {
        localArrayList2 = new ArrayList();
        localList2 = this.mWifiManager.getScanResults();
        if (localList2 != null)
        {
          localIterator2 = localList2.iterator();
          if (localIterator2.hasNext())
            break label201;
        }
        this.mLatestAccessPoints.clear();
        this.mLatestAccessPoints.addAll(localArrayList2);
        return localArrayList2;
      }
      localWifiConfiguration = (WifiConfiguration)localIterator1.next();
      if (localWifiConfiguration.status == 0)
      {
        localWifiConfiguration.status = 2;
        localAccessPoint = new AccessPoint(this, localWifiConfiguration);
        localAccessPoint.update(this.mLastInfo, this.mLastState);
        localArrayList1.add(localAccessPoint);
        break label30;
      }
    }
    finally
    {
    }
    while (true)
    {
      Iterator localIterator1;
      label30: ArrayList localArrayList2;
      List localList2;
      Iterator localIterator2;
      label72: WifiConfiguration localWifiConfiguration;
      AccessPoint localAccessPoint;
      if ((this.mResetNetworks) && (localWifiConfiguration.status == 1))
      {
        localWifiConfiguration.status = 0;
      }
      else
      {
        continue;
        label201: ScanResult localScanResult = (ScanResult)localIterator2.next();
        if ((localScanResult.SSID != null) && (localScanResult.SSID.length() != 0) && (!localScanResult.capabilities.contains("[IBSS]")))
        {
          localArrayList2.add(new AccessPoint(this, localScanResult));
          Iterator localIterator3 = localArrayList1.iterator();
          while (localIterator3.hasNext())
            ((AccessPoint)localIterator3.next()).update(localScanResult);
        }
      }
    }
  }

  private void updateConnectionState(NetworkInfo.DetailedState paramDetailedState)
  {
    if (!this.mWifiManager.isWifiEnabled())
    {
      this.mScanner.pause();
      return;
    }
    if (paramDetailedState == NetworkInfo.DetailedState.OBTAINING_IPADDR)
    {
      this.mScanner.pause();
      label32: this.mLastInfo = this.mWifiManager.getConnectionInfo();
      if (paramDetailedState != null)
        this.mLastState = paramDetailedState;
    }
    for (int i = -1 + this.mLatestAccessPoints.size(); ; i--)
    {
      if (i < 0)
      {
        if ((!this.mResetNetworks) || ((paramDetailedState != NetworkInfo.DetailedState.CONNECTED) && (paramDetailedState != NetworkInfo.DetailedState.DISCONNECTED) && (paramDetailedState != NetworkInfo.DetailedState.FAILED)))
          break;
        updateAccessPoints();
        enableNetworks();
        return;
        this.mScanner.resume();
        break label32;
      }
      ((AccessPoint)this.mLatestAccessPoints.get(i)).update(this.mLastInfo, this.mLastState);
    }
  }

  private void updateWifiState(int paramInt)
  {
    if (paramInt == 3)
    {
      this.mScanner.resume();
      updateAccessPoints();
      return;
    }
    this.mScanner.pause();
    this.mLatestAccessPoints.clear();
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    String str2;
    if ((paramInt1 == 100) && (paramInt2 == -1))
    {
      String str1 = paramIntent.getStringExtra("wifi");
      str2 = paramIntent.getStringExtra("wifibssid");
      Log.d("debuga", "wifi name = " + str1);
      Log.d("debuga", "wifi addr = " + str2);
      this.etWiFiName.setText(str1);
      this.etWiFiPwd.setText(null);
      this.etWiFiPwd.requestFocus();
      if (this.scanResults == null);
    }
    for (int i = 0; ; i++)
    {
      int j = this.scanResults.size();
      ScanResult localScanResult = null;
      if (i >= j);
      while (true)
      {
        if (localScanResult != null)
        {
          this.mConnect2ScanResult = localScanResult;
          this.ApScanResult = localScanResult;
          Log.d("debuga", "wifi mConnect2ScanResult = " + this.ApScanResult);
          if (this.ConnectMode)
          {
            if (Utils.getDevice(this, generateNetworkKey()) != null)
              break label272;
            Toast.makeText(this, "please wait!", 1).show();
          }
        }
        return;
        if (!Utils.removeDoubleQuotes(((ScanResult)this.scanResults.get(i)).BSSID).equals(Utils.removeDoubleQuotes(str2)))
          break;
        localScanResult = (ScanResult)this.scanResults.get(i);
      }
    }
    label272: this.mNetworkHandler.removeMessages(2);
    this.mNetworkHandler.sendEmptyMessage(1);
  }

  public void onClick(View paramView)
  {
    if (paramView == this.ivBack)
      goBack();
    do
    {
      return;
      if (paramView == this.vChooseWiFi)
      {
        startActivityForResult(new Intent(this, WifiListActivity.class), 100);
        return;
      }
      if (paramView == this.btnInstruction)
      {
        Intent localIntent = new Intent(this, InstructionActivity.class);
        if (!this.ConnectMode)
          localIntent.putExtra("type", 0);
        while (true)
        {
          startActivity(localIntent);
          return;
          localIntent.putExtra("type", 1);
        }
      }
    }
    while ((paramView != this.btnSetting) || (this.etWiFiPwd.getText().length() == 0) || (this.etWiFiName.getText().length() == 0));
    if (!this.ConnectMode)
      try
      {
        this.mSnifferSmartLinker.setOnSmartLinkListener(this);
        SnifferSmartLinker localSnifferSmartLinker = this.mSnifferSmartLinker;
        Context localContext = getApplicationContext();
        String str = this.etWiFiPwd.getText().toString().trim();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.etWiFiName.getText().toString().trim();
        localSnifferSmartLinker.start(localContext, str, arrayOfString);
        SmartLinkTip();
        SmartLinkTip();
        return;
      }
      catch (Exception localException)
      {
        while (true)
          localException.printStackTrace();
      }
    Log.d("debug", "switchModule2STA");
    if (Utils.getDevice(this, generateNetworkKey()) == null)
    {
      Toast.makeText(this, "please wait!", 1).show();
      return;
    }
    this.mNetworkHandler.removeMessages(2);
    this.mNetworkHandler.sendEmptyMessage(1);
    try
    {
      Thread.sleep(1000L);
      ApTip();
      switchModule2STA(this.ApScanResult, this.etWiFiPwd.getText().toString());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        localInterruptedException.printStackTrace();
    }
  }

  public void onCompleted()
  {
    Log.d("debugaa", "smartlink onCompleted");
    this.configResult = true;
    this.time = 0;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_configuration);
    WifiInfo localWifiInfo = ((WifiManager)getSystemService("wifi")).getConnectionInfo();
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.tvRight = ((TextView)findViewById(R.id.tv_right));
    this.rgModelType = ((RadioGroup)findViewById(R.id.rg_tab));
    this.rbSmartLink = ((RadioButton)findViewById(R.id.rb1));
    this.rbApLink = ((RadioButton)findViewById(R.id.rb2));
    this.etWiFiName = ((EditText)findViewById(R.id.et_wifi_name));
    this.etWiFiPwd = ((EditText)findViewById(R.id.et_wifi_pwd));
    this.vChooseWiFi = findViewById(R.id.tv_choose_wifi);
    this.cbShowPwd = ((CheckBox)findViewById(R.id.cb_show_pwd));
    this.btnSetting = ((Button)findViewById(R.id.btn_setting));
    this.btnInstruction = ((Button)findViewById(R.id.btn_instruction));
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.smart_setting);
    this.tvRight.setText(R.string.help);
    this.tvRight.setVisibility(8);
    this.ivBack.setOnClickListener(this);
    this.vChooseWiFi.setOnClickListener(this);
    this.btnSetting.setOnClickListener(this);
    this.btnInstruction.setOnClickListener(this);
    this.rgModelType.setOnCheckedChangeListener(this.onModelChangedListener);
    this.cbShowPwd.setOnCheckedChangeListener(this.checkedChangeListener);
    this.ConnectMode = false;
    this.smartdialog = new Dialog(this, R.style.EditLightDialog);
    InitAP();
    String str2;
    if (getIntent().getIntExtra("type", 0) == 0)
    {
      this.rbSmartLink.setChecked(true);
      if (localWifiInfo != null)
      {
        String str1 = localWifiInfo.getSSID();
        if (!TextUtils.isEmpty(str1))
        {
          str2 = str1.replace("\"", "");
          if (str2.length() < 10)
            break label491;
          Log.d("debug", "SSID = " + str2.substring(0, 10));
          if (!"Milight3.0".equals(str2.substring(0, 10)))
            break label479;
          this.etWiFiName.setText(null);
        }
      }
    }
    while (true)
    {
      this.etWiFiPwd.requestFocus();
      this.mConnect2ScanResult = Utils.getLastScanResult(this);
      this.ApScanResult = this.mConnect2ScanResult;
      this.ConnectMode = false;
      this.mSnifferSmartLinker = SnifferSmartLinker.getInstence();
      return;
      this.rbApLink.setChecked(true);
      break;
      label479: this.etWiFiName.setText(str2);
      continue;
      label491: this.etWiFiName.setText(str2);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.mIsExit = true;
    if (this.mUdpUnicast != null)
    {
      this.mUdpUnicast.send("AT+Q\r");
      closeActions();
      this.mLastWifiStatus.reload();
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onLinked(SmartLinkedModule paramSmartLinkedModule)
  {
    Log.d("debugaa", "smartlink onLinked = " + paramSmartLinkedModule);
    this.mNetworkHandler.sendEmptyMessageDelayed(4, 1000L);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.mReceiver != null)
      try
      {
        unregisterReceiver(this.mReceiver);
        label19: this.mScanner.pause();
        if (!this.mIsCMDMode)
          this.mScanBroadcast.close();
        return;
      }
      catch (Exception localException)
      {
        break label19;
      }
  }

  protected void onResume()
  {
    super.onResume();
    registerReceiver(this.mReceiver, this.mFilter);
  }

  public void onTimeOut()
  {
    Log.d("debugaa", "smartlink onTimeOut");
    this.configResult = false;
    this.time = 0;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */