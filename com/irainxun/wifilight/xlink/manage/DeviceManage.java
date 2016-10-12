package com.irainxun.wifilight.xlink.manage;

import android.content.Intent;
import android.util.Log;
import com.irainxun.wifilight.DeviceListActivity;
import com.irainxun.wifilight.database.LedDevice;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.Constant;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import com.irainxun.wifilight.xlink.util.XTGlobals;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.XlinkAgent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceManage
{
  private static String ACCESSKEY;
  private static String PASSWORD;
  private static final String TAG = "DeviceManage";
  public static ConcurrentHashMap<String, Device> deviceMap = new ConcurrentHashMap();
  private static DeviceManage instance;
  public static final ArrayList<Device> listDev;

  static
  {
    PASSWORD = "password";
    ACCESSKEY = "accessKey";
    Iterator localIterator = XTGlobals.getAllProperty().entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        listDev = new ArrayList();
        return;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      try
      {
        JSONObject localJSONObject = new JSONObject((String)localEntry.getValue());
        XDevice localXDevice = XlinkAgent.JsonToDevice(localJSONObject);
        if (localXDevice != null)
        {
          Device localDevice = new Device(localXDevice);
          if (!localJSONObject.isNull(PASSWORD))
            localDevice.setPassword(localJSONObject.getString(PASSWORD));
          if (!localJSONObject.isNull(ACCESSKEY))
            localDevice.setAccessKey(localJSONObject.getInt(ACCESSKEY));
          Log.e("DeviceManage", "get Device :" + localDevice);
          deviceMap.put(localXDevice.getMacAddress(), localDevice);
        }
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
      }
    }
  }

  private DeviceManage()
  {
  }

  public static DeviceManage getInstance()
  {
    if (instance == null)
      instance = new DeviceManage();
    return instance;
  }

  public static byte weekToByte(ArrayList<Integer> paramArrayList)
  {
    byte b = 0;
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
      return 0;
    Iterator localIterator = paramArrayList.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        if (b != 0)
          break;
        return b;
      }
      Integer localInteger = (Integer)localIterator.next();
      if (localInteger.intValue() <= 6)
        b = XlinkUtils.setByteBit(localInteger.intValue(), b);
    }
    return XlinkUtils.setByteBit(7, b);
  }

  public Device RaingetDevice(XDevice paramXDevice)
  {
    return (Device)deviceMap.get(paramXDevice.getMacAddress());
  }

  public void addDevice(Device paramDevice)
  {
    deviceMap.put(paramDevice.getMacAddress(), paramDevice);
    saveDevice(paramDevice);
  }

  public void addDevice(XDevice paramXDevice)
  {
    Device localDevice1 = (Device)deviceMap.get(paramXDevice.getMacAddress());
    if (localDevice1 != null)
    {
      localDevice1.setxDevice(paramXDevice);
      deviceMap.put(paramXDevice.getMacAddress(), localDevice1);
      saveDevice(localDevice1);
      return;
    }
    Log.d("debug", "into my setting!");
    Device localDevice2 = new Device(paramXDevice);
    localDevice2.name = "Mi-Light";
    localDevice2.status = 0;
    localDevice2.dispFlag = 1;
    localDevice2.getPassword = 0;
    localDevice2.iconRes = R.drawable.ic_light;
    LedDevice localLedDevice = new LedDevice();
    localLedDevice.mac = localDevice2.getMacAddress();
    localLedDevice.name = localDevice2.name;
    localLedDevice.id = 1;
    localLedDevice.password = "0000";
    localLedDevice.cpassword = "0000";
    localLedDevice.dispflag = 1;
    localLedDevice.icon = R.drawable.ic_light;
    localLedDevice.status = 0;
    localLedDevice.photo = "1";
    Log.d("debug", "leddevice = " + localLedDevice.toString());
    deviceMap.put(paramXDevice.getMacAddress(), localDevice2);
    saveDevice(localDevice2);
    if (paramXDevice.getAccessKey() > 0)
      localDevice2.setAccessKey(paramXDevice.getAccessKey());
    Log.d("debug", "device key save = " + localDevice2.getAccessKey());
    XlinkAgent.getInstance().initDevice(localDevice2.getXDevice());
    if (paramXDevice.getAccessKey() > 0)
    {
      Log.d("debug", "scanf password if = " + localDevice2.getAccessKey());
      DeviceListActivity.getDevicePassword(localDevice2, 123456789);
    }
    while (true)
    {
      MyApp.deviceService.addDevice(localLedDevice);
      return;
      Log.d("debug", "scanf password else = " + localDevice2.getAccessKey());
      DeviceListActivity.setDevicePassword(localDevice2, 123456789);
    }
  }

  public void clearAllDevice()
  {
    try
    {
      Iterator localIterator = getDevices().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
        {
          deviceMap.clear();
          listDev.clear();
          XlinkAgent.getInstance().removeAllDevice();
          return;
        }
        XTGlobals.deleteProperty(((Device)localIterator.next()).getMacAddress());
      }
    }
    finally
    {
    }
  }

  public Device getDevice(int paramInt)
  {
    Iterator localIterator = getDevices().iterator();
    Device localDevice;
    do
    {
      if (!localIterator.hasNext())
        return null;
      localDevice = (Device)localIterator.next();
    }
    while (localDevice.getXDevice().getDeviceId() != paramInt);
    return localDevice;
  }

  public Device getDevice(XDevice paramXDevice)
  {
    return (Device)deviceMap.get(paramXDevice.getMacAddress());
  }

  public Device getDevice(String paramString)
  {
    return (Device)deviceMap.get(paramString);
  }

  public ArrayList<Device> getDevices()
  {
    try
    {
      listDev.clear();
      Iterator localIterator = deviceMap.entrySet().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
        {
          ArrayList localArrayList = listDev;
          return localArrayList;
        }
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        listDev.add((Device)localEntry.getValue());
      }
    }
    finally
    {
    }
  }

  public String getWeekList(ArrayList<Integer> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramArrayList.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localStringBuffer.toString();
      Integer localInteger = (Integer)localIterator.next();
      localStringBuffer.append(localInteger + " ");
    }
  }

  public void notificationSocket(Device paramDevice, int paramInt)
  {
    Intent localIntent = new Intent(Constant.BROADCAST_SOCKET_STATUS);
    localIntent.putExtra("device-mac", paramDevice.getMacAddress());
    localIntent.putExtra("status", paramInt);
    MyApp.getApp().sendBroadcast(localIntent);
  }

  public void notificationTimer(Device paramDevice)
  {
    Intent localIntent = new Intent(Constant.BROADCAST_TIMER_UPDATE);
    localIntent.putExtra("device-mac", paramDevice.getMacAddress());
    MyApp.getApp().sendBroadcast(localIntent);
  }

  public void removeDevice(XDevice paramXDevice)
  {
    removeDevice(paramXDevice.getMacAddress());
  }

  public void removeDevice(String paramString)
  {
    deviceMap.remove(paramString);
    XlinkAgent.getInstance().removeDevice(paramString);
    XTGlobals.deleteProperty(paramString);
  }

  // ERROR //
  public void saveDevice(Device paramDevice)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 259	com/irainxun/wifilight/xlink/bean/Device:getXDevice	()Lio/xlink/wifi/sdk/XDevice;
    //   4: invokestatic 370	io/xlink/wifi/sdk/XlinkAgent:deviceToJson	(Lio/xlink/wifi/sdk/XDevice;)Lorg/json/JSONObject;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnonnull +4 -> 13
    //   12: return
    //   13: aload_1
    //   14: invokevirtual 372	com/irainxun/wifilight/xlink/bean/Device:getPassword	()Ljava/lang/String;
    //   17: ifnull +15 -> 32
    //   20: aload_2
    //   21: getstatic 33	com/irainxun/wifilight/xlink/manage/DeviceManage:PASSWORD	Ljava/lang/String;
    //   24: aload_1
    //   25: invokevirtual 372	com/irainxun/wifilight/xlink/bean/Device:getPassword	()Ljava/lang/String;
    //   28: invokevirtual 375	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   31: pop
    //   32: aload_1
    //   33: invokevirtual 249	com/irainxun/wifilight/xlink/bean/Device:getAccessKey	()I
    //   36: ifle +15 -> 51
    //   39: aload_2
    //   40: getstatic 37	com/irainxun/wifilight/xlink/manage/DeviceManage:ACCESSKEY	Ljava/lang/String;
    //   43: aload_1
    //   44: invokevirtual 249	com/irainxun/wifilight/xlink/bean/Device:getAccessKey	()I
    //   47: invokevirtual 378	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   50: pop
    //   51: ldc 10
    //   53: new 114	java/lang/StringBuilder
    //   56: dup
    //   57: ldc_w 380
    //   60: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: aload_2
    //   64: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 131	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: aload_1
    //   75: invokevirtual 176	com/irainxun/wifilight/xlink/bean/Device:getMacAddress	()Ljava/lang/String;
    //   78: aload_2
    //   79: invokevirtual 381	org/json/JSONObject:toString	()Ljava/lang/String;
    //   82: invokestatic 385	com/irainxun/wifilight/xlink/util/XTGlobals:setProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: return
    //   86: astore 6
    //   88: aload 6
    //   90: invokevirtual 143	org/json/JSONException:printStackTrace	()V
    //   93: goto -61 -> 32
    //   96: astore 4
    //   98: aload 4
    //   100: invokevirtual 143	org/json/JSONException:printStackTrace	()V
    //   103: goto -52 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   20	32	86	org/json/JSONException
    //   39	51	96	org/json/JSONException
  }

  public void setAuth(String paramString1, String paramString2)
  {
    Device localDevice = (Device)deviceMap.get(paramString1);
    if (localDevice != null)
    {
      localDevice.setPassword(paramString2);
      updateDevice(localDevice);
    }
  }

  public void updateDevice(Device paramDevice)
  {
    deviceMap.remove(paramDevice.getMacAddress());
    deviceMap.put(paramDevice.getMacAddress(), paramDevice);
    saveDevice(paramDevice);
  }

  public void updateDevice(XDevice paramXDevice)
  {
    Device localDevice = (Device)deviceMap.get(paramXDevice.getMacAddress());
    if (localDevice == null)
      return;
    localDevice.setxDevice(paramXDevice);
    updateDevice(localDevice);
  }

  public void updateNoSaveDevice(Device paramDevice)
  {
    deviceMap.remove(paramDevice.getMacAddress());
    deviceMap.put(paramDevice.getMacAddress(), paramDevice);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.manage.DeviceManage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */