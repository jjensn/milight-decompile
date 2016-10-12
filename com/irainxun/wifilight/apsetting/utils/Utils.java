package com.irainxun.wifilight.apsetting.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiConfiguration.EnterpriseField;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.widget.Toast;
import com.irainxun.wifilight.apsetting.android.AccessPoint;
import com.irainxun.wifilight.apsetting.model.Module;
import com.irainxun.wifilight.apsetting.model.NetworkProtocol;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Utils
{
  public static int COMMAND = 0;
  private static final String ENTER = "\r";
  private static final String KEYSTORE_SPACE = "keystore://";
  public static final String LAST_SCAN_RESULT_CONNECTED = "last_scan_result_connected";
  public static final String PREFERENCES_MODULE_MID = "module_mid";
  public static final String PREFERENCES_SCAN_RESULT_PASSWD = "scan_result";
  public static int RESPONSE_CMD = 0;
  public static int RESPONSE_TTS = 0;
  public static final String SECURITY_AES = "AES";
  public static final String SECURITY_NONE = "NONE";
  public static final String SECURITY_OPEN = "OPEN";
  public static final String SECURITY_OPEN_NONE = "open,none";
  public static final String SECURITY_OPEN_WEP_A = "open,wep-a";
  public static final String SECURITY_OPEN_WEP_H = "open,wep-h";
  public static final String SECURITY_SHARED = "SHARED";
  public static final String SECURITY_SHARED_WEP_A = "shared,wep-a";
  public static final String SECURITY_SHARED_WEP_H = "shared,wep-h";
  public static final String SECURITY_TKIP = "TKIP";
  public static final String SECURITY_WEP = "wep";
  public static final String SECURITY_WEP_A = "WEP-A";
  public static final String SECURITY_WEP_H = "WEP-H";
  public static final String SECURITY_WPA2PSK = "WPA2PSK";
  public static final String SECURITY_WPA2PSK_AES = "wpa2psk,aes";
  public static final String SECURITY_WPA2PSK_TKIP = "wpa2psk,tkip";
  public static final String SECURITY_WPAPSK = "WPAPSK";
  public static final String SECURITY_WPAPSK_AES = "wpapsk,aes";
  public static final String SECURITY_WPAPSK_TKIP = "wpapsk,tkip";
  public static int TTS = 0;
  public static final int WEP_ASCII = 1;
  public static final int WEP_HEX = 2;
  public static final int WEP_INVALID = -1;

  public Utils()
  {
  }

  public static void SettingApSSID(Context paramContext, String paramString)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(String.valueOf(paramContext.getPackageName()) + "_preferences", 0).edit();
    localEditor.putString("SSID", paramString);
    localEditor.commit();
  }

  public static String appendCharacters(String paramString1, String paramString2, int paramInt)
  {
    if (((paramString1 == null) && (paramString2 == null)) || (paramInt < 0))
      return null;
    if (paramInt == 0)
      return new String(paramString1);
    StringBuffer localStringBuffer;
    if (paramString1 == null)
      localStringBuffer = new StringBuffer();
    for (int i = 0; ; i++)
    {
      if (i >= paramInt)
      {
        return localStringBuffer.toString();
        localStringBuffer = new StringBuffer(paramString1);
        break;
      }
      localStringBuffer.append(paramString2);
    }
  }

  public static int checkWepType(String paramString)
  {
    if (paramString == null);
    String str;
    int i;
    do
    {
      return -1;
      str = paramString.trim();
      i = str.length();
      if ((i == 5) || (i == 13))
        return 1;
    }
    while (((i != 10) || (!str.matches("[0-9A-Fa-f]{10}"))) && ((i != 26) || (!str.matches("[0-9A-Fa-f]{26}"))));
    return 2;
  }

  public static String convertToQuotedString(String paramString)
  {
    try
    {
      String str = "\"" + paramString + "\"";
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static Module decodeBroadcast2Module(String paramString)
  {
    localModule = null;
    if (paramString == null);
    while (true)
    {
      return localModule;
      try
      {
        String[] arrayOfString = paramString.split(",");
        localModule = null;
        if (arrayOfString == null)
          continue;
        if (arrayOfString.length < 2)
        {
          int i = arrayOfString.length;
          localModule = null;
          if (i > 3)
            continue;
        }
        boolean bool1 = isIP(arrayOfString[0]);
        localModule = null;
        if (!bool1)
          continue;
        boolean bool2 = isMAC(arrayOfString[1]);
        localModule = null;
        if (!bool2)
          continue;
        localModule = new Module();
        localModule.setIp(arrayOfString[0]);
        localModule.setMac(arrayOfString[1]);
        if (arrayOfString.length != 3)
          continue;
        localModule.setModuleID(arrayOfString[2]);
      }
      finally
      {
      }
    }
  }

  public static List<Module> decodePackets(Context paramContext, List<DatagramPacket> paramList)
  {
    int i = 1;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    while (true)
    {
      if (!localIterator1.hasNext())
        return localArrayList2;
      DatagramPacket localDatagramPacket = (DatagramPacket)localIterator1.next();
      String str = new String(localDatagramPacket.getData(), 0, localDatagramPacket.getLength());
      if (!str.equals(getCMDScanModules(paramContext)))
      {
        Iterator localIterator2 = localArrayList1.iterator();
        do
          if (!localIterator2.hasNext())
          {
            localArrayList1.add(str);
            Module localModule = decodeBroadcast2Module(str);
            if (localModule == null)
              break;
            localModule.setId(i);
            localArrayList2.add(localModule);
            i++;
            break;
          }
        while (!((String)localIterator2.next()).equals(str));
      }
    }
  }

  public static NetworkProtocol decodeProtocol(String paramString)
  {
    if (paramString == null);
    for (NetworkProtocol localNetworkProtocol = null; ; localNetworkProtocol = null)
    {
      while (true)
      {
        return localNetworkProtocol;
        try
        {
          String[] arrayOfString = paramString.split(",");
          if (arrayOfString == null)
          {
            localNetworkProtocol = null;
            continue;
            while (true)
            {
              while (true)
              {
                if (j >= arrayOfString.length)
                  break label182;
                if (!arrayOfString[j].equals("TCP"))
                {
                  bool = arrayOfString[j].equals("UDP");
                  if (!bool);
                }
                else
                {
                  i = j;
                  break label182;
                }
                j++;
                continue;
                k = i + 3;
                try
                {
                  if (!isIP(arrayOfString[k]))
                  {
                    localNetworkProtocol = null;
                    break;
                  }
                  localNetworkProtocol = new NetworkProtocol();
                  localNetworkProtocol.setProtocol(arrayOfString[0]);
                  localNetworkProtocol.setServer(arrayOfString[1]);
                  localNetworkProtocol.setPort(Integer.valueOf(arrayOfString[(i + 2)]).intValue());
                  localNetworkProtocol.setIp(arrayOfString[(i + 3)]);
                }
                catch (Exception localException)
                {
                  localException.printStackTrace();
                  localNetworkProtocol = null;
                }
              }
              break;
            }
          }
        }
        finally
        {
        }
      }
      int i;
      label182: 
      do
        while (true)
        {
          boolean bool;
          int k;
          i = -1;
          int j = 0;
        }
      while (i != -1);
    }
  }

  public static Module findModule(List<Module> paramList, String paramString)
  {
    Iterator localIterator = paramList.iterator();
    Module localModule;
    do
    {
      if (!localIterator.hasNext())
        return null;
      localModule = (Module)localIterator.next();
    }
    while (!localModule.getModuleID().equals(paramString));
    return localModule;
  }

  public static void forceStrictMode()
  {
    if (Build.VERSION.SDK_INT > 9)
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
  }

  public static final String generateScanResultKey(ScanResult paramScanResult)
  {
    if (paramScanResult == null)
      localObject2 = null;
    while (true)
    {
      return localObject2;
      try
      {
        StringBuffer localStringBuffer = new StringBuffer();
        if (paramScanResult.SSID != null)
        {
          localStringBuffer.append("ssid:");
          localStringBuffer.append(paramScanResult.SSID);
          localStringBuffer.append("[MaGiCsTrInG]");
        }
        if (paramScanResult.BSSID != null)
        {
          localStringBuffer.append("bssid:");
          localStringBuffer.append(paramScanResult.BSSID);
          localStringBuffer.append("[MaGiCsTrInG]");
        }
        if (paramScanResult.capabilities != null)
        {
          localStringBuffer.append("capabilities:");
          localStringBuffer.append(paramScanResult.capabilities);
          localStringBuffer.append("[MaGiCsTrInG]");
        }
        String str = localStringBuffer.toString();
        localObject2 = str;
      }
      finally
      {
      }
    }
  }

  public static String generateTry2ConnectCmd(AccessPoint paramAccessPoint, String paramString)
  {
    String str = parseSecurity(paramAccessPoint.getScanResult().capabilities);
    if ((paramAccessPoint.getSecurity() == 0) || ("open,none".equals(str)))
      return generateTry2ConnectCmd(paramAccessPoint.getSsid(), "open,none");
    if ("wep".equals(str))
      if (checkWepType(paramString) != 1)
        break label67;
    label67: for (str = "shared,wep-a"; ; str = "shared,wep-h")
      return generateTry2ConnectCmd(paramAccessPoint.getSsid(), str, paramString);
  }

  public static String generateTry2ConnectCmd(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = (String.valueOf(paramString1) + "," + paramString2);
    return String.format("AT+WSTRY=%s\r\n", arrayOfObject);
  }

  public static String generateTry2ConnectCmd(String paramString1, String paramString2, String paramString3)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = (String.valueOf(paramString1) + "," + paramString2 + "," + paramString3);
    return String.format("AT+WSTRY=%s\r\n", arrayOfObject);
  }

  public static WifiConfiguration generateWifiConfiguration(AccessPoint paramAccessPoint, String paramString)
  {
    WifiConfiguration localWifiConfiguration;
    if ((paramAccessPoint != null) && (paramAccessPoint.getNetworkId() != -1))
      localWifiConfiguration = null;
    do
    {
      do
      {
        do
        {
          return localWifiConfiguration;
          localWifiConfiguration = new WifiConfiguration();
          if (paramAccessPoint == null)
            localWifiConfiguration.hiddenSSID = true;
          while (true)
            switch (paramAccessPoint.getSecurity())
            {
            default:
              return null;
              if (paramAccessPoint.getNetworkId() == -1)
                localWifiConfiguration.SSID = AccessPoint.convertToQuotedString(paramAccessPoint.getSsid());
              else
                localWifiConfiguration.networkId = paramAccessPoint.getNetworkId();
            case 0:
            case 1:
            case 2:
            case 3:
            }
          localWifiConfiguration.allowedKeyManagement.set(0);
          return localWifiConfiguration;
          localWifiConfiguration.allowedKeyManagement.set(0);
          localWifiConfiguration.allowedAuthAlgorithms.set(0);
          localWifiConfiguration.allowedAuthAlgorithms.set(1);
        }
        while (paramString.length() == 0);
        int i = paramString.length();
        if (((i == 10) || (i == 26) || (i == 58)) && (paramString.matches("[0-9A-Fa-f]*")))
        {
          localWifiConfiguration.wepKeys[0] = paramString;
          return localWifiConfiguration;
        }
        localWifiConfiguration.wepKeys[0] = (String.valueOf('"') + paramString + '"');
        return localWifiConfiguration;
        localWifiConfiguration.allowedKeyManagement.set(1);
      }
      while (paramString.length() == 0);
      if (paramString.matches("[0-9A-Fa-f]{64}"))
      {
        localWifiConfiguration.preSharedKey = paramString;
        return localWifiConfiguration;
      }
      localWifiConfiguration.preSharedKey = (String.valueOf((char)'"') + paramString + '"');
      return localWifiConfiguration;
      localWifiConfiguration.allowedKeyManagement.set(2);
      localWifiConfiguration.allowedKeyManagement.set(3);
    }
    while (paramString.length() == 0);
    localWifiConfiguration.password.setValue(paramString);
    return localWifiConfiguration;
  }

  public static String generateWskeyCmd(ScanResult paramScanResult, String paramString)
  {
    String str1 = parseSecurity(paramScanResult.capabilities);
    String str2;
    if ("open,none".equals(str1))
      str2 = generateWskeyCmd("OPEN", "NONE");
    boolean bool;
    do
    {
      return str2;
      if ("wep".equals(str1))
      {
        if (checkWepType(paramString) == 1)
          return generateWskeyCmd("SHARED", "WEP-A", paramString);
        return generateWskeyCmd("SHARED", "WEP-H", paramString);
      }
      if ("wpa2psk,aes".equals(str1))
        return generateWskeyCmd("WPA2PSK", "AES", paramString);
      if ("wpa2psk,tkip".equals(str1))
        return generateWskeyCmd("WPA2PSK", "TKIP", paramString);
      if ("wpapsk,aes".equals(str1))
        return generateWskeyCmd("WPAPSK", "AES", paramString);
      bool = "wpapsk,tkip".equals(str1);
      str2 = null;
    }
    while (!bool);
    return generateWskeyCmd("WPAPSK", "TKIP", paramString);
  }

  public static String generateWskeyCmd(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = (String.valueOf(paramString1) + "," + paramString2);
    return String.format("AT+WSKEY=%s\r\n", arrayOfObject);
  }

  public static String generateWskeyCmd(String paramString1, String paramString2, String paramString3)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = (String.valueOf(paramString1) + "," + paramString2 + "," + paramString3);
    return String.format("AT+WSKEY=%s\r\n", arrayOfObject);
  }

  public static String generateWsssid(String paramString)
  {
    return String.format("AT+WSSSID=%s\r\n", new Object[] { paramString });
  }

  public static String gernerateCMD(String paramString)
  {
    if (paramString == null)
      return null;
    return String.valueOf(paramString) + "\r";
  }

  public static String gernerateEchoText(int paramInt, String paramString)
  {
    try
    {
      if (paramInt == COMMAND)
        if (paramString == null)
          paramString = ">\n";
      while (true)
      {
        return paramString;
        paramString = ">" + paramString + "\n";
        continue;
        if (paramInt == TTS)
        {
          if (paramString == null)
            paramString = ">\n";
          else
            paramString = ">" + paramString + "\n";
        }
        else if (paramInt == RESPONSE_CMD)
        {
          if (paramString == null)
            paramString = "\n";
          else
            paramString = " " + paramString;
        }
        else if (paramInt == RESPONSE_TTS)
        {
          if (paramString == null)
            paramString = "";
        }
        else if (paramString == null)
          paramString = "";
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public static int getAndroidInternalId(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 461
    //   6: invokestatic 467	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   9: aload_0
    //   10: invokevirtual 471	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   13: aconst_null
    //   14: invokevirtual 477	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
    //   17: istore 7
    //   19: iload 7
    //   21: istore_2
    //   22: ldc 2
    //   24: monitorexit
    //   25: iload_2
    //   26: ireturn
    //   27: astore 6
    //   29: aload 6
    //   31: invokevirtual 478	java/lang/IllegalAccessException:printStackTrace	()V
    //   34: goto +34 -> 68
    //   37: astore 5
    //   39: aload 5
    //   41: invokevirtual 479	java/lang/IllegalArgumentException:printStackTrace	()V
    //   44: goto +24 -> 68
    //   47: astore_3
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_3
    //   52: athrow
    //   53: astore 4
    //   55: aload 4
    //   57: invokevirtual 480	java/lang/NoSuchFieldException:printStackTrace	()V
    //   60: goto +8 -> 68
    //   63: astore_1
    //   64: aload_1
    //   65: invokevirtual 481	java/lang/ClassNotFoundException:printStackTrace	()V
    //   68: iconst_0
    //   69: istore_2
    //   70: goto -48 -> 22
    //
    // Exception table:
    //   from	to	target	type
    //   3	19	27	java/lang/IllegalAccessException
    //   3	19	37	java/lang/IllegalArgumentException
    //   3	19	47	finally
    //   29	34	47	finally
    //   39	44	47	finally
    //   55	60	47	finally
    //   64	68	47	finally
    //   3	19	53	java/lang/NoSuchFieldException
    //   3	19	63	java/lang/ClassNotFoundException
  }

  public static String getCMDScanModules(Context paramContext)
  {
    return paramContext.getSharedPreferences(String.valueOf(paramContext.getPackageName()) + "_preferences", 0).getString("cmd_scan_modules", "HF-A11ASSISTHREAD");
  }

  public static Module getDevice(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("module_mid", 0);
    int i = localSharedPreferences.getInt("id_" + paramString, -2147483648);
    if (i == -2147483648)
      return null;
    Module localModule = new Module();
    localModule.setId(i);
    localModule.setIp(localSharedPreferences.getString("ip_" + paramString, null));
    localModule.setMac(localSharedPreferences.getString("mac_" + paramString, null));
    localModule.setModuleID(localSharedPreferences.getString("moduleid_" + paramString, null));
    return localModule;
  }

  public static final ScanResult getLastScanResult(Context paramContext)
  {
    try
    {
      String str = paramContext.getSharedPreferences("scan_result", 0).getString("last_scan_result_connected", null);
      Object localObject2 = null;
      if (str == null);
      while (true)
      {
        return localObject2;
        ScanResult localScanResult = parseScanResult(str);
        localObject2 = localScanResult;
      }
    }
    finally
    {
    }
  }

  public static final String getScanResultPassword(Context paramContext, ScanResult paramScanResult)
  {
    localObject1 = null;
    if (paramScanResult == null);
    while (true)
    {
      return localObject1;
      try
      {
        String str1 = generateScanResultKey(paramScanResult);
        String str2 = paramContext.getSharedPreferences("scan_result", 0).getString(str1, null);
        localObject1 = str2;
      }
      finally
      {
      }
    }
  }

  public static String getSettingApPassword(Context paramContext)
  {
    return paramContext.getSharedPreferences(String.valueOf(paramContext.getPackageName()) + "_preferences", 0).getString("PASSWORD", "").trim();
  }

  public static String getSettingApSSID(Context paramContext)
  {
    return paramContext.getSharedPreferences(String.valueOf(paramContext.getPackageName()) + "_preferences", 0).getString("SSID", "").trim();
  }

  public static int getUdpPort(Context paramContext)
  {
    String str = paramContext.getSharedPreferences(String.valueOf(paramContext.getPackageName()) + "_preferences", 0).getString("udp_port", "48899");
    try
    {
      int i = Integer.valueOf(str).intValue();
      return i;
    }
    catch (Exception localException)
    {
    }
    return 48899;
  }

  public static boolean isIP(String paramString)
  {
    return Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b").matcher(paramString).matches();
  }

  public static boolean isMAC(String paramString)
  {
    String str = paramString.trim();
    if (str.length() != 12)
      return false;
    char[] arrayOfChar = new char[12];
    str.getChars(0, 12, arrayOfChar, 0);
    for (int i = 0; ; i++)
    {
      if (i >= arrayOfChar.length)
        return true;
      if (((arrayOfChar[i] < '0') || (arrayOfChar[i] > '9')) && ((arrayOfChar[i] < 'A') || (arrayOfChar[i] > 'F')) && ((arrayOfChar[i] < 'a') || (arrayOfChar[i] > 'f')))
        break;
    }
  }

  public static List<Module> loadDevices(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("module_list", 0);
    int i = localSharedPreferences.getInt("module_count", 0);
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return localArrayList;
      Module localModule = new Module();
      localModule.setId(localSharedPreferences.getInt("id_" + j, -1));
      localModule.setIp(localSharedPreferences.getString("ip_" + j, null));
      localModule.setMac(localSharedPreferences.getString("mac_" + j, null));
      localModule.setModuleID(localSharedPreferences.getString("moduleid_" + j, null));
      localArrayList.add(localModule);
    }
  }

  public static final ScanResult parseScanResult(String paramString)
  {
    int i = 0;
    ScanResult localScanResult;
    if (paramString == null)
      localScanResult = null;
    while (true)
    {
      return localScanResult;
      try
      {
        String[] arrayOfString = paramString.trim().split("\\[MaGiCsTrInG]");
        if (arrayOfString != null)
        {
          str1 = null;
          str2 = null;
          str3 = null;
          j = arrayOfString.length;
          if (i >= j)
          {
            if ((str1 == null) || (str2 == null) || (str3 == null))
              break label275;
            k = Build.VERSION.SDK_INT;
            if (k >= 17)
              break label281;
            try
            {
              arrayOfClass2 = new Class[5];
              arrayOfClass2[0] = String.class;
              arrayOfClass2[1] = String.class;
              arrayOfClass2[2] = String.class;
              arrayOfClass2[3] = Integer.TYPE;
              arrayOfClass2[4] = Integer.TYPE;
              localConstructor2 = ScanResult.class.getConstructor(arrayOfClass2);
              arrayOfObject2 = new Object[5];
              arrayOfObject2[0] = str1;
              arrayOfObject2[1] = str2;
              arrayOfObject2[2] = str3;
              arrayOfObject2[3] = Integer.valueOf(0);
              arrayOfObject2[4] = Integer.valueOf(0);
              localScanResult = (ScanResult)localConstructor2.newInstance(arrayOfObject2);
              continue;
              str4 = arrayOfString[i];
              if (str4.startsWith("ssid:"))
                str1 = str4.substring("ssid:".length());
              else if (str4.startsWith("bssid:"))
                str2 = str4.substring("bssid:".length());
              else if (str4.startsWith("capabilities:"))
                str3 = str4.substring("capabilities:".length());
            }
            catch (Exception localException2)
            {
              localException2.printStackTrace();
            }
          }
        }
        else
        {
          while (true)
            while (true)
            {
              localScanResult = null;
              break;
              try
              {
                localClass = Class.forName("android.net.wifi.WifiSsid");
                arrayOfClass1 = new Class[6];
                arrayOfClass1[0] = localClass;
                arrayOfClass1[1] = String.class;
                arrayOfClass1[2] = String.class;
                arrayOfClass1[3] = Integer.TYPE;
                arrayOfClass1[4] = Integer.TYPE;
                arrayOfClass1[5] = Long.TYPE;
                localConstructor1 = ScanResult.class.getConstructor(arrayOfClass1);
                localMethod = localClass.getMethod("createFromAsciiEncoded", new Class[] { String.class });
                arrayOfObject1 = new Object[6];
                arrayOfObject1[0] = localMethod.invoke(null, new Object[] { str1 });
                arrayOfObject1[1] = str2;
                arrayOfObject1[2] = str3;
                arrayOfObject1[3] = Integer.valueOf(0);
                arrayOfObject1[4] = Integer.valueOf(0);
                arrayOfObject1[5] = Long.valueOf(System.currentTimeMillis());
                localScanResult = (ScanResult)localConstructor1.newInstance(arrayOfObject1);
              }
              catch (Exception localException1)
              {
                localException1.printStackTrace();
              }
            }
        }
      }
      finally
      {
      }
    }
    while (true)
    {
      String str1;
      String str2;
      String str3;
      int j;
      int k;
      Class[] arrayOfClass2;
      Constructor localConstructor2;
      Object[] arrayOfObject2;
      String str4;
      label275: label281: Class localClass;
      Class[] arrayOfClass1;
      Constructor localConstructor1;
      Method localMethod;
      Object[] arrayOfObject1;
      i++;
    }
  }

  public static final String parseSecurity(String paramString)
  {
    String str2;
    if (paramString == null)
      str2 = null;
    while (true)
    {
      return str2;
      try
      {
        String str1 = paramString.replace("][", ";").replace("[", "").replace("]", "");
        System.out.println("capabilities: " + str1);
        if (str1.contains("WEP"))
        {
          str2 = "wep";
        }
        else
        {
          i = -1;
          j = -1;
          arrayOfString = str1.split(";");
          k = 0;
          if (k >= arrayOfString.length)
          {
            if (j != -1)
              if (arrayOfString[j].contains("CCMP"))
                str2 = "wpa2psk,aes";
          }
          else if ((arrayOfString[k].contains("WPA2")) && (arrayOfString[k].contains("PSK")))
          {
            j = k;
          }
          else if ((arrayOfString[k].contains("WPA")) && (arrayOfString[k].contains("PSK")))
          {
            i = k;
            break label280;
            if (arrayOfString[j].contains("TKIP"))
            {
              str2 = "wpa2psk,tkip";
              continue;
            }
            if (i != -1)
            {
              if (arrayOfString[i].contains("CCMP"))
              {
                str2 = "wpapsk,aes";
                continue;
              }
              if (arrayOfString[i].contains("TKIP"))
              {
                str2 = "wpapsk,tkip";
                continue;
              }
            }
            str2 = "open,none";
            continue;
          }
        }
      }
      finally
      {
      }
    }
    while (true)
    {
      int i;
      int j;
      String[] arrayOfString;
      int k;
      label280: k++;
    }
  }

  public static String removeDoubleQuotes(String paramString)
  {
    if (paramString == null)
      paramString = null;
    while (true)
    {
      return paramString;
      try
      {
        int i = paramString.length();
        if ((i <= 1) || (paramString.charAt(0) != '"') || (paramString.charAt(i - 1) != '"'))
          continue;
        String str = paramString.substring(1, i - 1);
        paramString = str;
      }
      finally
      {
      }
    }
  }

  // ERROR //
  public static boolean requireKeyStore(WifiConfiguration paramWifiConfiguration)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: iconst_0
    //   4: istore_1
    //   5: aload_0
    //   6: ifnonnull +8 -> 14
    //   9: ldc 2
    //   11: monitorexit
    //   12: iload_1
    //   13: ireturn
    //   14: aconst_null
    //   15: astore_2
    //   16: iconst_0
    //   17: istore_3
    //   18: ldc_w 377
    //   21: ldc_w 653
    //   24: invokevirtual 471	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   27: astore_2
    //   28: iconst_1
    //   29: istore_3
    //   30: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   33: ldc_w 655
    //   36: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   39: iload_3
    //   40: ifne +24 -> 64
    //   43: ldc_w 377
    //   46: ldc_w 657
    //   49: invokevirtual 471	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   52: astore_2
    //   53: iconst_2
    //   54: istore_3
    //   55: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   58: ldc_w 659
    //   61: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   64: iload_3
    //   65: ifne +45 -> 110
    //   68: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   71: ldc_w 661
    //   74: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   77: iconst_0
    //   78: istore_1
    //   79: goto -70 -> 9
    //   82: astore 11
    //   84: ldc 2
    //   86: monitorexit
    //   87: aload 11
    //   89: athrow
    //   90: astore 4
    //   92: aload 4
    //   94: invokevirtual 480	java/lang/NoSuchFieldException:printStackTrace	()V
    //   97: goto -58 -> 39
    //   100: astore 15
    //   102: aload 15
    //   104: invokevirtual 480	java/lang/NoSuchFieldException:printStackTrace	()V
    //   107: goto -43 -> 64
    //   110: ldc_w 423
    //   113: ldc_w 663
    //   116: iconst_0
    //   117: anewarray 463	java/lang/Class
    //   120: invokevirtual 589	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   123: aload_2
    //   124: aload_0
    //   125: invokevirtual 667	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   128: iconst_0
    //   129: anewarray 4	java/lang/Object
    //   132: invokevirtual 595	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   135: astore 13
    //   137: aload 13
    //   139: ifnonnull +28 -> 167
    //   142: aconst_null
    //   143: astore 6
    //   145: iload_3
    //   146: iconst_2
    //   147: if_icmpne +47 -> 194
    //   150: aload 6
    //   152: invokestatic 672	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   155: istore 12
    //   157: iload 12
    //   159: ifne +35 -> 194
    //   162: iconst_1
    //   163: istore_1
    //   164: goto -155 -> 9
    //   167: aload 13
    //   169: checkcast 114	java/lang/String
    //   172: astore 14
    //   174: aload 14
    //   176: astore 6
    //   178: goto -33 -> 145
    //   181: astore 5
    //   183: aload 5
    //   185: invokevirtual 291	java/lang/Exception:printStackTrace	()V
    //   188: aconst_null
    //   189: astore 6
    //   191: goto -46 -> 145
    //   194: iload_3
    //   195: iconst_1
    //   196: if_icmpne +81 -> 277
    //   199: iconst_3
    //   200: anewarray 114	java/lang/String
    //   203: astore 7
    //   205: aload 7
    //   207: iconst_0
    //   208: aload_0
    //   209: getfield 675	android/net/wifi/WifiConfiguration:ca_cert	Landroid/net/wifi/WifiConfiguration$EnterpriseField;
    //   212: invokevirtual 677	android/net/wifi/WifiConfiguration$EnterpriseField:value	()Ljava/lang/String;
    //   215: aastore
    //   216: aload 7
    //   218: iconst_1
    //   219: aload_0
    //   220: getfield 680	android/net/wifi/WifiConfiguration:client_cert	Landroid/net/wifi/WifiConfiguration$EnterpriseField;
    //   223: invokevirtual 677	android/net/wifi/WifiConfiguration$EnterpriseField:value	()Ljava/lang/String;
    //   226: aastore
    //   227: aload 7
    //   229: iconst_2
    //   230: aload 6
    //   232: aastore
    //   233: aload 7
    //   235: arraylength
    //   236: istore 8
    //   238: iconst_0
    //   239: istore 9
    //   241: iconst_0
    //   242: istore_1
    //   243: iload 9
    //   245: iload 8
    //   247: if_icmpge -238 -> 9
    //   250: aload 7
    //   252: iload 9
    //   254: aaload
    //   255: astore 10
    //   257: aload 10
    //   259: ifnull +49 -> 308
    //   262: aload 10
    //   264: ldc 14
    //   266: invokevirtual 574	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   269: ifeq +39 -> 308
    //   272: iconst_1
    //   273: istore_1
    //   274: goto -265 -> 9
    //   277: iconst_2
    //   278: anewarray 114	java/lang/String
    //   281: astore 7
    //   283: aload 7
    //   285: iconst_0
    //   286: aload_0
    //   287: getfield 675	android/net/wifi/WifiConfiguration:ca_cert	Landroid/net/wifi/WifiConfiguration$EnterpriseField;
    //   290: invokevirtual 677	android/net/wifi/WifiConfiguration$EnterpriseField:value	()Ljava/lang/String;
    //   293: aastore
    //   294: aload 7
    //   296: iconst_1
    //   297: aload_0
    //   298: getfield 680	android/net/wifi/WifiConfiguration:client_cert	Landroid/net/wifi/WifiConfiguration$EnterpriseField;
    //   301: invokevirtual 677	android/net/wifi/WifiConfiguration$EnterpriseField:value	()Ljava/lang/String;
    //   304: aastore
    //   305: goto -72 -> 233
    //   308: iinc 9 1
    //   311: goto -70 -> 241
    //
    // Exception table:
    //   from	to	target	type
    //   18	28	82	finally
    //   30	39	82	finally
    //   43	53	82	finally
    //   55	64	82	finally
    //   68	77	82	finally
    //   92	97	82	finally
    //   102	107	82	finally
    //   110	137	82	finally
    //   150	157	82	finally
    //   167	174	82	finally
    //   183	188	82	finally
    //   199	233	82	finally
    //   233	238	82	finally
    //   250	257	82	finally
    //   262	272	82	finally
    //   277	305	82	finally
    //   18	28	90	java/lang/NoSuchFieldException
    //   30	39	90	java/lang/NoSuchFieldException
    //   43	53	100	java/lang/NoSuchFieldException
    //   55	64	100	java/lang/NoSuchFieldException
    //   110	137	181	java/lang/Exception
    //   167	174	181	java/lang/Exception
  }

  public static void saveDevice(Context paramContext, String paramString, Module paramModule)
  {
    if (paramModule == null)
      return;
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("module_mid", 0).edit();
    localEditor.putInt("id_" + paramString, paramModule.getId());
    localEditor.putString("ip_" + paramString, paramModule.getIp());
    localEditor.putString("mac_" + paramString, paramModule.getMac());
    localEditor.putString("moduleid_" + paramString, paramModule.getModuleID());
    localEditor.commit();
  }

  public static void saveDevices(Context paramContext, List<Module> paramList)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("module_list", 0).edit();
    if (paramList.size() > 0)
    {
      int i = 0;
      Iterator localIterator = paramList.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
        {
          localEditor.putInt("module_count", paramList.size());
          localEditor.commit();
          return;
        }
        Module localModule = (Module)localIterator.next();
        localEditor.putInt("id_" + i, localModule.getId());
        localEditor.putString("ip_" + i, localModule.getIp());
        localEditor.putString("mac_" + i, localModule.getMac());
        localEditor.putString("moduleid_" + i, localModule.getModuleID());
        i++;
      }
    }
    localEditor.clear().commit();
  }

  public static final void saveLastScanResult(Context paramContext, ScanResult paramScanResult)
  {
    if (paramScanResult != null);
    try
    {
      paramContext.getSharedPreferences("scan_result", 0).edit().putString("last_scan_result_connected", generateScanResultKey(paramScanResult)).commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static final void saveScanResultPassword(Context paramContext, ScanResult paramScanResult, String paramString)
  {
    if ((paramScanResult == null) || (paramString == null));
    while (true)
    {
      return;
      try
      {
        String str = paramString.trim();
        paramContext.getSharedPreferences("scan_result", 0).edit().putString(generateScanResultKey(paramScanResult), str).commit();
      }
      finally
      {
      }
    }
  }

  // ERROR //
  public static boolean testKeyStoreNoError()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: aconst_null
    //   6: astore_1
    //   7: iconst_0
    //   8: istore_2
    //   9: ldc_w 712
    //   12: ldc_w 714
    //   15: iconst_0
    //   16: anewarray 463	java/lang/Class
    //   19: invokevirtual 589	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   22: astore_1
    //   23: iconst_1
    //   24: istore_2
    //   25: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   28: ldc_w 716
    //   31: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   34: iload_2
    //   35: ifne +28 -> 63
    //   38: ldc_w 712
    //   41: ldc_w 718
    //   44: iconst_0
    //   45: anewarray 463	java/lang/Class
    //   48: invokevirtual 589	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   51: astore_1
    //   52: iconst_2
    //   53: istore_2
    //   54: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   57: ldc_w 720
    //   60: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   63: iload_2
    //   64: ifne +52 -> 116
    //   67: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   70: ldc_w 722
    //   73: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   76: ldc 2
    //   78: monitorexit
    //   79: iload_0
    //   80: ireturn
    //   81: astore 4
    //   83: getstatic 725	java/lang/System:err	Ljava/io/PrintStream;
    //   86: ldc_w 727
    //   89: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   92: aload 4
    //   94: invokevirtual 728	java/lang/NoSuchMethodException:printStackTrace	()V
    //   97: goto -63 -> 34
    //   100: astore_3
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_3
    //   105: athrow
    //   106: astore 11
    //   108: aload 11
    //   110: invokevirtual 728	java/lang/NoSuchMethodException:printStackTrace	()V
    //   113: goto -50 -> 63
    //   116: iload_2
    //   117: iconst_1
    //   118: if_icmpne +78 -> 196
    //   121: aload_1
    //   122: invokestatic 732	android/security/KeyStore:getInstance	()Landroid/security/KeyStore;
    //   125: iconst_0
    //   126: anewarray 4	java/lang/Object
    //   129: invokevirtual 595	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   132: astore 9
    //   134: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   137: new 106	java/lang/StringBuilder
    //   140: dup
    //   141: ldc_w 734
    //   144: invokespecial 121	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   147: aload 9
    //   149: invokevirtual 735	java/lang/Object:toString	()Ljava/lang/String;
    //   152: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   158: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   161: aload 9
    //   163: checkcast 278	java/lang/Integer
    //   166: invokevirtual 284	java/lang/Integer:intValue	()I
    //   169: istore 10
    //   171: iconst_0
    //   172: istore_0
    //   173: iload 10
    //   175: iconst_1
    //   176: if_icmpne -100 -> 76
    //   179: iconst_1
    //   180: istore_0
    //   181: goto -105 -> 76
    //   184: astore 8
    //   186: aload 8
    //   188: invokevirtual 291	java/lang/Exception:printStackTrace	()V
    //   191: iconst_0
    //   192: istore_0
    //   193: goto -117 -> 76
    //   196: aload_1
    //   197: invokestatic 732	android/security/KeyStore:getInstance	()Landroid/security/KeyStore;
    //   200: iconst_0
    //   201: anewarray 4	java/lang/Object
    //   204: invokevirtual 595	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   207: astore 6
    //   209: getstatic 620	java/lang/System:out	Ljava/io/PrintStream;
    //   212: new 106	java/lang/StringBuilder
    //   215: dup
    //   216: ldc_w 734
    //   219: invokespecial 121	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   222: aload 6
    //   224: invokevirtual 735	java/lang/Object:toString	()Ljava/lang/String;
    //   227: invokevirtual 127	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: invokevirtual 627	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   236: aload 6
    //   238: invokevirtual 735	java/lang/Object:toString	()Ljava/lang/String;
    //   241: ldc_w 737
    //   244: invokevirtual 250	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   247: istore 7
    //   249: iload 7
    //   251: istore_0
    //   252: goto -176 -> 76
    //   255: astore 5
    //   257: aload 5
    //   259: invokevirtual 291	java/lang/Exception:printStackTrace	()V
    //   262: iconst_0
    //   263: istore_0
    //   264: goto -188 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   9	23	81	java/lang/NoSuchMethodException
    //   25	34	81	java/lang/NoSuchMethodException
    //   9	23	100	finally
    //   25	34	100	finally
    //   38	52	100	finally
    //   54	63	100	finally
    //   67	76	100	finally
    //   83	97	100	finally
    //   108	113	100	finally
    //   121	171	100	finally
    //   186	191	100	finally
    //   196	249	100	finally
    //   257	262	100	finally
    //   38	52	106	java/lang/NoSuchMethodException
    //   54	63	106	java/lang/NoSuchMethodException
    //   121	171	184	java/lang/Exception
    //   196	249	255	java/lang/Exception
  }

  public static void toast(Context paramContext, int paramInt)
  {
    Toast.makeText(paramContext, paramInt, 1).show();
  }

  public static void toast(Context paramContext, String paramString)
  {
    Toast.makeText(paramContext, paramString, 0).show();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.utils.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */