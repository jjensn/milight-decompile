package com.irainxun.wifilight.apsetting.utils;

public final class Constants
{
  public static final int BATTERY_MIN = 30;
  public static final String CMD_ENTER_CMD_MODE = "+ok";
  public static final String CMD_EXIT_CMD_MODE = "AT+Q\r";
  public static final String CMD_NETWORK_PROTOCOL = "AT+NETP\r";
  public static final String CMD_RELOAD = "AT+RELD\r";
  public static final String CMD_RESET = "AT+Z\r";
  public static final String CMD_SCAN_MODULES = "HF-A11ASSISTHREAD";
  public static final String CMD_STA = "AT+WMODE=STA\r\n";
  public static final String CMD_TEST = "AT+\r";
  public static final String CMD_TRANSPARENT_TRANSMISSION = "AT+ENTM\r";
  public static final String CMD_VER = "AT+VER\r\n";
  public static final String CMD_WSKEY = "AT+WSKEY=%s\r\n";
  public static final String CMD_WSSSID = "AT+WSSSID=%s\r\n";
  public static final String CMD_WSTCH = "AT+WSTCH\r\n";
  public static final String CMD_WSTRY = "AT+WSTRY=%s\r\n";
  public static final String DEFAULT_SSID = "Milight3.0";
  public static final String ENTER = "<0x0d>";
  public static final String FILE_TO_SEND = "FilePath";
  public static final String KEY_CMD_SCAN_MODULES = "cmd_scan_modules";
  public static final String KEY_ENCRYPTION = "ENCRYPTION";
  public static final String KEY_IP = "ip";
  public static final String KEY_MODULE_COUNT = "module_count";
  public static final String KEY_PASSWORD = "PASSWORD";
  public static final String KEY_PRE_ID = "id_";
  public static final String KEY_PRE_IP = "ip_";
  public static final String KEY_PRE_MAC = "mac_";
  public static final String KEY_PRE_MODULEID = "moduleid_";
  public static final String KEY_SSID = "SSID";
  public static final String KEY_UDP_PORT = "udp_port";
  public static final int REQUEST_CODE_CHOOSE_FILE = 1;
  public static final String RESPONSE_ERR = "+ERR";
  public static final String RESPONSE_OK = "+ok";
  public static final String RESPONSE_OK_OPTION = "+ok=";
  public static final String RESPONSE_REBOOT_OK = "+ok=rebooting";
  public static final String RESPONSE_WSTRY_NOK = "+ok=TRY NOK";
  public static final String RESPONSE_WSTRY_OK = "+ok=TRY OK";
  public static final int RESULT_CODE_CHOOSE_FILE = 1;
  public static final String SHARED_PREFERENCES = "_preferences";
  public static final String TAG = "SmartLink | ";
  public static final int TIMER_CHECK_CMD = 30000;
  public static final int UDP_PORT = 48899;
  public static final int WIFI_MIN = 150;

  public Constants()
  {
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.utils.Constants
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */