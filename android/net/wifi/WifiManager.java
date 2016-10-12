package android.net.wifi;

import android.content.Context;
import android.net.DhcpInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.WorkSource;
import android.util.Log;
import android.util.SparseArray;
import com.android.internal.util.AsyncChannel;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class WifiManager
{
  public static final String ACTION_PICK_WIFI_NETWORK = "android.net.wifi.PICK_WIFI_NETWORK";
  private static final int BASE = 151552;
  public static final int BUSY = 2;
  public static final int CANCEL_WPS = 151566;
  public static final int CANCEL_WPS_FAILED = 151567;
  public static final int CANCEL_WPS_SUCCEDED = 151568;
  public static final int CHANGE_REASON_ADDED = 0;
  public static final int CHANGE_REASON_CONFIG_CHANGE = 2;
  public static final int CHANGE_REASON_REMOVED = 1;
  public static final String CONFIGURED_NETWORKS_CHANGED_ACTION = "android.net.wifi.CONFIGURED_NETWORKS_CHANGE";
  public static final int CONNECT_NETWORK = 151553;
  public static final int CONNECT_NETWORK_FAILED = 151554;
  public static final int CONNECT_NETWORK_SUCCEEDED = 151555;
  public static final int DATA_ACTIVITY_IN = 1;
  public static final int DATA_ACTIVITY_INOUT = 3;
  public static final int DATA_ACTIVITY_NONE = 0;
  public static final int DATA_ACTIVITY_NOTIFICATION = 1;
  public static final int DATA_ACTIVITY_OUT = 2;
  public static final int DISABLE_NETWORK = 151569;
  public static final int DISABLE_NETWORK_FAILED = 151570;
  public static final int DISABLE_NETWORK_SUCCEEDED = 151571;
  public static final int ENABLE_TRAFFIC_STATS_POLL = 151583;
  public static final int ERROR = 0;
  public static final int ERROR_AUTHENTICATING = 1;
  public static final String EXTRA_BSSID = "bssid";
  public static final String EXTRA_CHANGE_REASON = "changeReason";
  public static final String EXTRA_LINK_CAPABILITIES = "linkCapabilities";
  public static final String EXTRA_LINK_PROPERTIES = "linkProperties";
  public static final String EXTRA_MULTIPLE_NETWORKS_CHANGED = "multipleChanges";
  public static final String EXTRA_NETWORK_INFO = "networkInfo";
  public static final String EXTRA_NEW_RSSI = "newRssi";
  public static final String EXTRA_NEW_STATE = "newState";
  public static final String EXTRA_PREVIOUS_WIFI_AP_STATE = "previous_wifi_state";
  public static final String EXTRA_PREVIOUS_WIFI_STATE = "previous_wifi_state";
  public static final String EXTRA_SUPPLICANT_CONNECTED = "connected";
  public static final String EXTRA_SUPPLICANT_ERROR = "supplicantError";
  public static final String EXTRA_WIFI_AP_STATE = "wifi_state";
  public static final String EXTRA_WIFI_CONFIGURATION = "wifiConfiguration";
  public static final String EXTRA_WIFI_INFO = "wifiInfo";
  public static final String EXTRA_WIFI_STATE = "wifi_state";
  public static final int FORGET_NETWORK = 151556;
  public static final int FORGET_NETWORK_FAILED = 151557;
  public static final int FORGET_NETWORK_SUCCEEDED = 151558;
  private static final int INVALID_KEY = 0;
  public static final int IN_PROGRESS = 1;
  public static final String LINK_CONFIGURATION_CHANGED_ACTION = "android.net.wifi.LINK_CONFIGURATION_CHANGED";
  private static final int MAX_ACTIVE_LOCKS = 50;
  private static final int MAX_RSSI = -55;
  private static final int MIN_RSSI = -100;
  public static final String NETWORK_IDS_CHANGED_ACTION = "android.net.wifi.NETWORK_IDS_CHANGED";
  public static final String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
  public static final String RSSI_CHANGED_ACTION = "android.net.wifi.RSSI_CHANGED";
  public static final int RSSI_LEVELS = 5;
  public static final int RSSI_PKTCNT_FETCH = 151572;
  public static final int RSSI_PKTCNT_FETCH_FAILED = 151574;
  public static final int RSSI_PKTCNT_FETCH_SUCCEEDED = 151573;
  public static final int SAVE_NETWORK = 151559;
  public static final int SAVE_NETWORK_FAILED = 151560;
  public static final int SAVE_NETWORK_SUCCEEDED = 151561;
  public static final String SCAN_RESULTS_AVAILABLE_ACTION = "android.net.wifi.SCAN_RESULTS";
  public static final int START_WPS = 151562;
  public static final int START_WPS_SUCCEEDED = 151563;
  public static final String SUPPLICANT_CONNECTION_CHANGE_ACTION = "android.net.wifi.supplicant.CONNECTION_CHANGE";
  public static final String SUPPLICANT_STATE_CHANGED_ACTION = "android.net.wifi.supplicant.STATE_CHANGE";
  private static final String TAG = "WifiManager";
  public static final int TRAFFIC_STATS_POLL = 151584;
  public static final String WIFI_AP_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_AP_STATE_CHANGED";
  public static final int WIFI_AP_STATE_DISABLED = 11;
  public static final int WIFI_AP_STATE_DISABLING = 10;
  public static final int WIFI_AP_STATE_ENABLED = 13;
  public static final int WIFI_AP_STATE_ENABLING = 12;
  public static final int WIFI_AP_STATE_FAILED = 14;
  public static final int WIFI_FREQUENCY_BAND_2GHZ = 2;
  public static final int WIFI_FREQUENCY_BAND_5GHZ = 1;
  public static final int WIFI_FREQUENCY_BAND_AUTO = 0;
  public static final int WIFI_MODE_FULL = 1;
  public static final int WIFI_MODE_FULL_HIGH_PERF = 3;
  public static final int WIFI_MODE_SCAN_ONLY = 2;
  public static final String WIFI_STATE_CHANGED_ACTION = "android.net.wifi.WIFI_STATE_CHANGED";
  public static final int WIFI_STATE_DISABLED = 1;
  public static final int WIFI_STATE_DISABLING = 0;
  public static final int WIFI_STATE_ENABLED = 3;
  public static final int WIFI_STATE_ENABLING = 2;
  public static final int WIFI_STATE_UNKNOWN = 4;
  public static final int WPS_AUTH_FAILURE = 6;
  public static final int WPS_COMPLETED = 151565;
  public static final int WPS_FAILED = 151564;
  public static final int WPS_OVERLAP_ERROR = 3;
  public static final int WPS_TIMED_OUT = 7;
  public static final int WPS_TKIP_ONLY_PROHIBITED = 5;
  public static final int WPS_WEP_PROHIBITED = 4;
  private static HandlerThread sHandlerThread;
  private static int sThreadRefCount;
  private static Object sThreadRefLock = new Object();
  private int mActiveLockCount;
  private AsyncChannel mAsyncChannel = new AsyncChannel();
  private final CountDownLatch mConnected = new CountDownLatch(1);
  private Context mContext;
  private ServiceHandler mHandler;
  private int mListenerKey = 1;
  private final SparseArray mListenerMap = new SparseArray();
  private final Object mListenerMapLock = new Object();
  IWifiManager mService;
  private Messenger mWifiServiceMessenger;

  public WifiManager(Context paramContext, IWifiManager paramIWifiManager)
  {
    this.mContext = paramContext;
    this.mService = paramIWifiManager;
    init();
  }

  private int addOrUpdateNetwork(WifiConfiguration paramWifiConfiguration)
  {
    try
    {
      int i = this.mService.addOrUpdateNetwork(paramWifiConfiguration);
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return -1;
  }

  public static int calculateSignalLevel(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= -100)
      return 0;
    if (paramInt1 >= -55)
      return paramInt2 - 1;
    return (int)(paramInt2 - 1 * paramInt1 + 100 / 45.0F);
  }

  public static int compareSignalLevel(int paramInt1, int paramInt2)
  {
    return paramInt1 - paramInt2;
  }

  private void init()
  {
    this.mWifiServiceMessenger = getWifiServiceMessenger();
    if (this.mWifiServiceMessenger == null)
    {
      this.mAsyncChannel = null;
      return;
    }
    synchronized (sThreadRefLock)
    {
      int i = 1 + sThreadRefCount;
      sThreadRefCount = i;
      if (i == 1)
      {
        sHandlerThread = new HandlerThread("WifiManager");
        sHandlerThread.start();
      }
      this.mHandler = new ServiceHandler(sHandlerThread.getLooper());
      this.mAsyncChannel.connect(this.mContext, this.mHandler, this.mWifiServiceMessenger);
      try
      {
        this.mConnected.await();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        Log.e("WifiManager", "interrupted wait at init");
        return;
      }
    }
  }

  private int putListener(Object paramObject)
  {
    if (paramObject == null)
      return 0;
    synchronized (this.mListenerMapLock)
    {
      int i;
      do
      {
        i = this.mListenerKey;
        this.mListenerKey = (i + 1);
      }
      while (i == 0);
      this.mListenerMap.put(i, paramObject);
      return i;
    }
  }

  private Object removeListener(int paramInt)
  {
    if (paramInt == 0)
      return null;
    synchronized (this.mListenerMapLock)
    {
      Object localObject3 = this.mListenerMap.get(paramInt);
      this.mListenerMap.remove(paramInt);
      return localObject3;
    }
  }

  private void validateChannel()
  {
    if (this.mAsyncChannel == null)
      throw new IllegalStateException("No permission to access and change wifi or a bad initialization");
  }

  public int addNetwork(WifiConfiguration paramWifiConfiguration)
  {
    if (paramWifiConfiguration == null)
      return -1;
    paramWifiConfiguration.networkId = -1;
    return addOrUpdateNetwork(paramWifiConfiguration);
  }

  public boolean addToBlacklist(String paramString)
  {
    try
    {
      this.mService.addToBlacklist(paramString);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public void cancelWps(ActionListener paramActionListener)
  {
    validateChannel();
    this.mAsyncChannel.sendMessage(151566, 0, putListener(paramActionListener));
  }

  public void captivePortalCheckComplete()
  {
    try
    {
      this.mService.captivePortalCheckComplete();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public boolean clearBlacklist()
  {
    try
    {
      this.mService.clearBlacklist();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public void connect(int paramInt, ActionListener paramActionListener)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Network id cannot be negative");
    validateChannel();
    this.mAsyncChannel.sendMessage(151553, paramInt, putListener(paramActionListener));
  }

  public void connect(WifiConfiguration paramWifiConfiguration, ActionListener paramActionListener)
  {
    if (paramWifiConfiguration == null)
      throw new IllegalArgumentException("config cannot be null");
    validateChannel();
    this.mAsyncChannel.sendMessage(151553, -1, putListener(paramActionListener), paramWifiConfiguration);
  }

  public MulticastLock createMulticastLock(String paramString)
  {
    return new MulticastLock(paramString, null);
  }

  public WifiLock createWifiLock(int paramInt, String paramString)
  {
    return new WifiLock(paramInt, paramString, null);
  }

  public WifiLock createWifiLock(String paramString)
  {
    return new WifiLock(1, paramString, null);
  }

  public void disable(int paramInt, ActionListener paramActionListener)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Network id cannot be negative");
    validateChannel();
    this.mAsyncChannel.sendMessage(151569, paramInt, putListener(paramActionListener));
  }

  public boolean disableNetwork(int paramInt)
  {
    try
    {
      boolean bool = this.mService.disableNetwork(paramInt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean disconnect()
  {
    try
    {
      this.mService.disconnect();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean enableNetwork(int paramInt, boolean paramBoolean)
  {
    try
    {
      boolean bool = this.mService.enableNetwork(paramInt, paramBoolean);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  protected void finalize()
    throws Throwable
  {
    try
    {
      synchronized (sThreadRefLock)
      {
        int i = -1 + sThreadRefCount;
        sThreadRefCount = i;
        if ((i == 0) && (sHandlerThread != null))
          sHandlerThread.getLooper().quit();
        return;
      }
    }
    finally
    {
      super.finalize();
    }
  }

  public void forget(int paramInt, ActionListener paramActionListener)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("Network id cannot be negative");
    validateChannel();
    this.mAsyncChannel.sendMessage(151556, paramInt, putListener(paramActionListener));
  }

  public String getConfigFile()
  {
    try
    {
      String str = this.mService.getConfigFile();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public List<WifiConfiguration> getConfiguredNetworks()
  {
    try
    {
      List localList = this.mService.getConfiguredNetworks();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public WifiInfo getConnectionInfo()
  {
    try
    {
      WifiInfo localWifiInfo = this.mService.getConnectionInfo();
      return localWifiInfo;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public DhcpInfo getDhcpInfo()
  {
    try
    {
      DhcpInfo localDhcpInfo = this.mService.getDhcpInfo();
      return localDhcpInfo;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public int getFrequencyBand()
  {
    try
    {
      int i = this.mService.getFrequencyBand();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return -1;
  }

  public List<ScanResult> getScanResults()
  {
    try
    {
      List localList = this.mService.getScanResults();
      return localList;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public void getTxPacketCount(TxPacketCountListener paramTxPacketCountListener)
  {
    validateChannel();
    this.mAsyncChannel.sendMessage(151572, 0, putListener(paramTxPacketCountListener));
  }

  public WifiConfiguration getWifiApConfiguration()
  {
    try
    {
      WifiConfiguration localWifiConfiguration = this.mService.getWifiApConfiguration();
      return localWifiConfiguration;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public int getWifiApState()
  {
    try
    {
      int i = this.mService.getWifiApEnabledState();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 14;
  }

  public Messenger getWifiServiceMessenger()
  {
    try
    {
      Messenger localMessenger = this.mService.getWifiServiceMessenger();
      return localMessenger;
    }
    catch (RemoteException localRemoteException)
    {
      return null;
    }
    catch (SecurityException localSecurityException)
    {
    }
    return null;
  }

  public int getWifiState()
  {
    try
    {
      int i = this.mService.getWifiEnabledState();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return 4;
  }

  public Messenger getWifiStateMachineMessenger()
  {
    try
    {
      Messenger localMessenger = this.mService.getWifiStateMachineMessenger();
      return localMessenger;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return null;
  }

  public boolean initializeMulticastFiltering()
  {
    try
    {
      this.mService.initializeMulticastFiltering();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean isDualBandSupported()
  {
    try
    {
      boolean bool = this.mService.isDualBandSupported();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean isMulticastEnabled()
  {
    try
    {
      boolean bool = this.mService.isMulticastEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean isWifiApEnabled()
  {
    return getWifiApState() == 13;
  }

  public boolean isWifiEnabled()
  {
    return getWifiState() == 3;
  }

  public boolean pingSupplicant()
  {
    if (this.mService == null)
      return false;
    try
    {
      boolean bool = this.mService.pingSupplicant();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean reassociate()
  {
    try
    {
      this.mService.reassociate();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean reconnect()
  {
    try
    {
      this.mService.reconnect();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean removeNetwork(int paramInt)
  {
    try
    {
      boolean bool = this.mService.removeNetwork(paramInt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public void save(WifiConfiguration paramWifiConfiguration, ActionListener paramActionListener)
  {
    if (paramWifiConfiguration == null)
      throw new IllegalArgumentException("config cannot be null");
    validateChannel();
    this.mAsyncChannel.sendMessage(151559, 0, putListener(paramActionListener), paramWifiConfiguration);
  }

  public boolean saveConfiguration()
  {
    try
    {
      boolean bool = this.mService.saveConfiguration();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public void setCountryCode(String paramString, boolean paramBoolean)
  {
    try
    {
      this.mService.setCountryCode(paramString, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public void setFrequencyBand(int paramInt, boolean paramBoolean)
  {
    try
    {
      this.mService.setFrequencyBand(paramInt, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
  }

  public boolean setWifiApConfiguration(WifiConfiguration paramWifiConfiguration)
  {
    try
    {
      this.mService.setWifiApConfiguration(paramWifiConfiguration);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean setWifiApEnabled(WifiConfiguration paramWifiConfiguration, boolean paramBoolean)
  {
    try
    {
      this.mService.setWifiApEnabled(paramWifiConfiguration, paramBoolean);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean setWifiEnabled(boolean paramBoolean)
  {
    try
    {
      boolean bool = this.mService.setWifiEnabled(paramBoolean);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean startScan()
  {
    try
    {
      this.mService.startScan(false);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean startScanActive()
  {
    try
    {
      this.mService.startScan(true);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public boolean startWifi()
  {
    try
    {
      this.mService.startWifi();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public void startWps(WpsInfo paramWpsInfo, WpsListener paramWpsListener)
  {
    if (paramWpsInfo == null)
      throw new IllegalArgumentException("config cannot be null");
    validateChannel();
    this.mAsyncChannel.sendMessage(151562, 0, putListener(paramWpsListener), paramWpsInfo);
  }

  public boolean stopWifi()
  {
    try
    {
      this.mService.stopWifi();
      return true;
    }
    catch (RemoteException localRemoteException)
    {
    }
    return false;
  }

  public int updateNetwork(WifiConfiguration paramWifiConfiguration)
  {
    if ((paramWifiConfiguration == null) || (paramWifiConfiguration.networkId < 0))
      return -1;
    return addOrUpdateNetwork(paramWifiConfiguration);
  }

  public static abstract interface ActionListener
  {
    public abstract void onFailure(int paramInt);

    public abstract void onSuccess();
  }

  public class MulticastLock
  {
    private final IBinder mBinder;
    private boolean mHeld;
    private int mRefCount;
    private boolean mRefCounted;
    private String mTag;

    private MulticastLock(String arg2)
    {
      Object localObject;
      this.mTag = localObject;
      this.mBinder = new Binder();
      this.mRefCount = 0;
      this.mRefCounted = true;
      this.mHeld = false;
    }

    public void acquire()
    {
      synchronized (this.mBinder)
      {
        if (this.mRefCounted)
        {
          int i = 1 + this.mRefCount;
          this.mRefCount = i;
          if (i != 1);
        }
        while (true)
        {
          try
          {
            WifiManager.this.mService.acquireMulticastLock(this.mBinder, this.mTag);
            synchronized (WifiManager.this)
            {
              if (WifiManager.this.mActiveLockCount < 50)
                break;
              WifiManager.this.mService.releaseMulticastLock();
              throw new UnsupportedOperationException("Exceeded maximum number of wifi locks");
            }
          }
          catch (RemoteException localRemoteException)
          {
          }
          this.mHeld = true;
          boolean bool;
          do
          {
            return;
            bool = this.mHeld;
          }
          while (bool);
        }
        WifiManager.access$508(WifiManager.this);
      }
    }

    protected void finalize()
      throws Throwable
    {
      super.finalize();
      setReferenceCounted(false);
      release();
    }

    public boolean isHeld()
    {
      synchronized (this.mBinder)
      {
        boolean bool = this.mHeld;
        return bool;
      }
    }

    public void release()
    {
      synchronized (this.mBinder)
      {
        if (this.mRefCounted)
        {
          int i = -1 + this.mRefCount;
          this.mRefCount = i;
          if (i == 0)
            try
            {
              while (true)
              {
                WifiManager.this.mService.releaseMulticastLock();
                synchronized (WifiManager.this)
                {
                  WifiManager.access$510(WifiManager.this);
                  this.mHeld = false;
                  boolean bool;
                  do
                  {
                    if (this.mRefCount >= 0)
                      break;
                    throw new RuntimeException("MulticastLock under-locked " + this.mTag);
                    localObject1 = finally;
                    throw localObject1;
                    bool = this.mHeld;
                  }
                  while (!bool);
                }
              }
            }
            catch (RemoteException localRemoteException)
            {
              break label65;
            }
        }
      }
      label65:
    }

    public void setReferenceCounted(boolean paramBoolean)
    {
      this.mRefCounted = paramBoolean;
    }

    public String toString()
    {
      while (true)
      {
        synchronized (this.mBinder)
        {
          String str1 = Integer.toHexString(System.identityHashCode(this));
          if (this.mHeld)
          {
            str2 = "held; ";
            if (!this.mRefCounted)
              break label115;
            str3 = "refcounted: refcount = " + this.mRefCount;
            String str4 = "MulticastLock{ " + str1 + "; " + str2 + str3 + " }";
            return str4;
          }
        }
        String str2 = "";
        continue;
        label115: String str3 = "not refcounted";
      }
    }
  }

  private class ServiceHandler extends Handler
  {
    ServiceHandler(Looper arg2)
    {
      super();
    }

    public void handleMessage(Message paramMessage)
    {
      Object localObject1 = WifiManager.this.removeListener(paramMessage.arg2);
      switch (paramMessage.what)
      {
      case 69634:
      default:
      case 69632:
      case 69636:
      case 151554:
      case 151557:
      case 151560:
      case 151567:
      case 151570:
      case 151555:
      case 151558:
      case 151561:
      case 151568:
      case 151571:
      case 151563:
      case 151565:
      case 151564:
      case 151573:
      case 151574:
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return;
                    if (paramMessage.arg1 == 0)
                      WifiManager.this.mAsyncChannel.sendMessage(69633);
                    while (true)
                    {
                      WifiManager.this.mConnected.countDown();
                      return;
                      Log.e("WifiManager", "Failed to set up channel connection");
                      WifiManager.access$102(WifiManager.this, null);
                    }
                    Log.e("WifiManager", "Channel connection lost");
                    WifiManager.access$102(WifiManager.this, null);
                    getLooper().quit();
                    return;
                  }
                  while (localObject1 == null);
                  ((WifiManager.ActionListener)localObject1).onFailure(paramMessage.arg1);
                  return;
                }
                while (localObject1 == null);
                ((WifiManager.ActionListener)localObject1).onSuccess();
                return;
              }
              while (localObject1 == null);
              WpsResult localWpsResult = (WpsResult)paramMessage.obj;
              ((WifiManager.WpsListener)localObject1).onStartSuccess(localWpsResult.pin);
              synchronized (WifiManager.this.mListenerMapLock)
              {
                WifiManager.this.mListenerMap.put(paramMessage.arg2, localObject1);
                return;
              }
            }
            while (localObject1 == null);
            ((WifiManager.WpsListener)localObject1).onCompletion();
            return;
          }
          while (localObject1 == null);
          ((WifiManager.WpsListener)localObject1).onFailure(paramMessage.arg1);
          return;
        }
        while (localObject1 == null);
        RssiPacketCountInfo localRssiPacketCountInfo = (RssiPacketCountInfo)paramMessage.obj;
        if (localRssiPacketCountInfo != null)
        {
          ((WifiManager.TxPacketCountListener)localObject1).onSuccess(localRssiPacketCountInfo.txgood + localRssiPacketCountInfo.txbad);
          return;
        }
        ((WifiManager.TxPacketCountListener)localObject1).onFailure(0);
        return;
      }
      while (localObject1 == null);
      ((WifiManager.TxPacketCountListener)localObject1).onFailure(paramMessage.arg1);
    }
  }

  public static abstract interface TxPacketCountListener
  {
    public abstract void onFailure(int paramInt);

    public abstract void onSuccess(int paramInt);
  }

  public class WifiLock
  {
    private final IBinder mBinder;
    private boolean mHeld;
    int mLockType;
    private int mRefCount;
    private boolean mRefCounted;
    private String mTag;
    private WorkSource mWorkSource;

    private WifiLock(int paramString, String arg3)
    {
      Object localObject;
      this.mTag = localObject;
      this.mLockType = paramString;
      this.mBinder = new Binder();
      this.mRefCount = 0;
      this.mRefCounted = true;
      this.mHeld = false;
    }

    public void acquire()
    {
      synchronized (this.mBinder)
      {
        if (this.mRefCounted)
        {
          int i = 1 + this.mRefCount;
          this.mRefCount = i;
          if (i != 1);
        }
        while (true)
        {
          try
          {
            WifiManager.this.mService.acquireWifiLock(this.mBinder, this.mLockType, this.mTag, this.mWorkSource);
            synchronized (WifiManager.this)
            {
              if (WifiManager.this.mActiveLockCount < 50)
                break;
              WifiManager.this.mService.releaseWifiLock(this.mBinder);
              throw new UnsupportedOperationException("Exceeded maximum number of wifi locks");
            }
          }
          catch (RemoteException localRemoteException)
          {
          }
          this.mHeld = true;
          boolean bool;
          do
          {
            return;
            bool = this.mHeld;
          }
          while (bool);
        }
        WifiManager.access$508(WifiManager.this);
      }
    }

    protected void finalize()
      throws Throwable
    {
      super.finalize();
      label57: synchronized (this.mBinder)
      {
        boolean bool = this.mHeld;
        if (bool)
          try
          {
            WifiManager.this.mService.releaseWifiLock(this.mBinder);
            synchronized (WifiManager.this)
            {
              WifiManager.access$510(WifiManager.this);
              return;
            }
          }
          catch (RemoteException localRemoteException)
          {
            break label57;
          }
      }
    }

    public boolean isHeld()
    {
      synchronized (this.mBinder)
      {
        boolean bool = this.mHeld;
        return bool;
      }
    }

    public void release()
    {
      synchronized (this.mBinder)
      {
        if (this.mRefCounted)
        {
          int i = -1 + this.mRefCount;
          this.mRefCount = i;
          if (i == 0)
            try
            {
              while (true)
              {
                WifiManager.this.mService.releaseWifiLock(this.mBinder);
                synchronized (WifiManager.this)
                {
                  WifiManager.access$510(WifiManager.this);
                  this.mHeld = false;
                  boolean bool;
                  do
                  {
                    if (this.mRefCount >= 0)
                      break;
                    throw new RuntimeException("WifiLock under-locked " + this.mTag);
                    localObject1 = finally;
                    throw localObject1;
                    bool = this.mHeld;
                  }
                  while (!bool);
                }
              }
            }
            catch (RemoteException localRemoteException)
            {
              break label70;
            }
        }
      }
      label70:
    }

    public void setReferenceCounted(boolean paramBoolean)
    {
      this.mRefCounted = paramBoolean;
    }

    // ERROR //
    public void setWorkSource(WorkSource paramWorkSource)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 34	android/net/wifi/WifiManager$WifiLock:mBinder	Landroid/os/IBinder;
      //   4: astore_2
      //   5: aload_2
      //   6: monitorenter
      //   7: aload_1
      //   8: ifnull +12 -> 20
      //   11: aload_1
      //   12: invokevirtual 115	android/os/WorkSource:size	()I
      //   15: ifne +5 -> 20
      //   18: aconst_null
      //   19: astore_1
      //   20: iconst_1
      //   21: istore_3
      //   22: aload_1
      //   23: ifnonnull +46 -> 69
      //   26: aload_0
      //   27: aconst_null
      //   28: putfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   31: iload_3
      //   32: ifeq +34 -> 66
      //   35: aload_0
      //   36: getfield 40	android/net/wifi/WifiManager$WifiLock:mHeld	Z
      //   39: istore 5
      //   41: iload 5
      //   43: ifeq +23 -> 66
      //   46: aload_0
      //   47: getfield 22	android/net/wifi/WifiManager$WifiLock:this$0	Landroid/net/wifi/WifiManager;
      //   50: getfield 52	android/net/wifi/WifiManager:mService	Landroid/net/wifi/IWifiManager;
      //   53: aload_0
      //   54: getfield 34	android/net/wifi/WifiManager$WifiLock:mBinder	Landroid/os/IBinder;
      //   57: aload_0
      //   58: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   61: invokeinterface 119 3 0
      //   66: aload_2
      //   67: monitorexit
      //   68: return
      //   69: aload_0
      //   70: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   73: ifnonnull +39 -> 112
      //   76: aload_0
      //   77: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   80: ifnull +27 -> 107
      //   83: iconst_1
      //   84: istore_3
      //   85: aload_0
      //   86: new 111	android/os/WorkSource
      //   89: dup
      //   90: aload_1
      //   91: invokespecial 121	android/os/WorkSource:<init>	(Landroid/os/WorkSource;)V
      //   94: putfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   97: goto -66 -> 31
      //   100: astore 4
      //   102: aload_2
      //   103: monitorexit
      //   104: aload 4
      //   106: athrow
      //   107: iconst_0
      //   108: istore_3
      //   109: goto -24 -> 85
      //   112: aload_0
      //   113: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   116: aload_1
      //   117: invokevirtual 125	android/os/WorkSource:diff	(Landroid/os/WorkSource;)Z
      //   120: istore_3
      //   121: iload_3
      //   122: ifeq -91 -> 31
      //   125: aload_0
      //   126: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
      //   129: aload_1
      //   130: invokevirtual 128	android/os/WorkSource:set	(Landroid/os/WorkSource;)V
      //   133: goto -102 -> 31
      //   136: astore 6
      //   138: goto -72 -> 66
      //
      // Exception table:
      //   from	to	target	type
      //   11	18	100	finally
      //   26	31	100	finally
      //   35	41	100	finally
      //   46	66	100	finally
      //   66	68	100	finally
      //   69	83	100	finally
      //   85	97	100	finally
      //   102	104	100	finally
      //   112	121	100	finally
      //   125	133	100	finally
      //   46	66	136	android/os/RemoteException
    }

    public String toString()
    {
      while (true)
      {
        synchronized (this.mBinder)
        {
          String str1 = Integer.toHexString(System.identityHashCode(this));
          if (this.mHeld)
          {
            str2 = "held; ";
            if (!this.mRefCounted)
              break label115;
            str3 = "refcounted: refcount = " + this.mRefCount;
            String str4 = "WifiLock{ " + str1 + "; " + str2 + str3 + " }";
            return str4;
          }
        }
        String str2 = "";
        continue;
        label115: String str3 = "not refcounted";
      }
    }
  }

  public static abstract interface WpsListener
  {
    public abstract void onCompletion();

    public abstract void onFailure(int paramInt);

    public abstract void onStartSuccess(String paramString);
  }
}

/* Location:
 * Qualified Name:     android.net.wifi.WifiManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */