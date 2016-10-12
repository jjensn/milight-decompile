package com.irainxun.wifilight.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public class bdData
{
  private static final String TAG = bdData.class.getSimpleName();
  private dbCreat dbHelper;

  public bdData(Context paramContext)
  {
    this.dbHelper = new dbCreat(paramContext);
  }

  public void addDevice(LedDevice paramLedDevice)
  {
    addDevice(paramLedDevice.mac, paramLedDevice.name, paramLedDevice.status, paramLedDevice.photo, paramLedDevice.cpassword, paramLedDevice.icon, paramLedDevice.dispflag, paramLedDevice.login, paramLedDevice.password);
  }

  public void addDevice(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, int paramInt4, String paramString5)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[9];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Integer.valueOf(paramInt1);
    arrayOfObject[3] = paramString3;
    arrayOfObject[4] = paramString4;
    arrayOfObject[5] = Integer.valueOf(paramInt2);
    arrayOfObject[6] = Integer.valueOf(paramInt3);
    arrayOfObject[7] = Integer.valueOf(paramInt4);
    arrayOfObject[8] = paramString5;
    localSQLiteDatabase.execSQL("insert into tbDevice(mac,name,status,photo,cpassword,icon,dispflag,login,password) values(?,?,?,?,?,?,?,?,?)", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public void delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from tbDevice where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public void diydevice_addDevice(diydevice paramdiydevice)
  {
    diydevice_addDevice(paramdiydevice.mac, paramdiydevice.deviceid, paramdiydevice.deviceselect, paramdiydevice.zonech);
  }

  public void diydevice_addDevice(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("insert into diydevice(mac,deviceid,deviceselect,zonech) values(?,?,?,?)", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    localSQLiteDatabase.close();
  }

  public void diydevice_delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from diydevice where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public void diydevice_edit(diydevice paramdiydevice)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramdiydevice.deviceid;
    arrayOfObject[1] = paramdiydevice.deviceselect;
    arrayOfObject[2] = paramdiydevice.zonech;
    arrayOfObject[3] = paramdiydevice.mac;
    localSQLiteDatabase.execSQL("update diydevice set deviceid=?,deviceselect=?,zonech=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public diydevice diydevice_getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,deviceid,deviceselect,zonech from diydevice where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    diydevice localdiydevice = null;
    if (bool)
    {
      localdiydevice = new diydevice();
      localdiydevice.id = localCursor.getInt(0);
      localdiydevice.mac = localCursor.getString(1);
      localdiydevice.deviceid = localCursor.getString(2);
      localdiydevice.deviceselect = localCursor.getString(3);
      localdiydevice.zonech = localCursor.getString(4);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localdiydevice;
  }

  public boolean diydevice_isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from diydevice where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }

  public void editName(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("update tbDevice set name=? where mac=?", new Object[] { paramString2, paramString1 });
    localSQLiteDatabase.close();
  }

  public void editPhoto(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("update tbDevice set photo=? where mac=?", new Object[] { paramString2, paramString1 });
    localSQLiteDatabase.close();
  }

  public void editStatus(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString;
    localSQLiteDatabase.execSQL("update tbDevice set status=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public void editStatus_All()
  {
    Cursor localCursor = this.dbHelper.getReadableDatabase().rawQuery("select _id,mac,name,status,photo,cpassword,icon,dispflag,login,password from tbDevice", null);
    while (true)
    {
      if (!localCursor.moveToNext())
        return;
      editStatus(localCursor.getString(1), 0);
    }
  }

  public void editcCPassword(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("update tbDevice set cpassword=? where mac=?", new Object[] { paramString2, paramString1 });
    localSQLiteDatabase.close();
  }

  public void editcDispFlag(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString;
    localSQLiteDatabase.execSQL("update tbDevice set dispflag=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public void editcIcon(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString;
    localSQLiteDatabase.execSQL("update tbDevice set icon=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public void editcLogin(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = paramString;
    localSQLiteDatabase.execSQL("update tbDevice set login=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public void editcPassword(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("update tbDevice set password=? where mac=?", new Object[] { paramString2, paramString1 });
    localSQLiteDatabase.close();
  }

  public void editcPhoto(String paramString1, String paramString2)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("update tbDevice set photo=? where mac=?", new Object[] { paramString2, paramString1 });
    localSQLiteDatabase.close();
  }

  public String getDeviceCPassword(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select cpassword from tbDevice where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    String str = null;
    if (bool)
      str = localCursor.getString(0);
    localCursor.close();
    localSQLiteDatabase.close();
    return str;
  }

  public int getDeviceLogin(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select login from tbDevice where mac = ?", new String[] { paramString });
    int i = 255;
    if (localCursor.moveToNext())
      i = localCursor.getInt(0);
    localCursor.close();
    localSQLiteDatabase.close();
    return i;
  }

  public String getDevicePassword(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select password from tbDevice where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    String str = null;
    if (bool)
      str = localCursor.getString(0);
    localCursor.close();
    localSQLiteDatabase.close();
    return str;
  }

  public LedDevice getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,name,status,photo,cpassword,icon,dispflag,login,password from tbDevice where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    LedDevice localLedDevice = null;
    if (bool)
    {
      localLedDevice = new LedDevice();
      localLedDevice.id = localCursor.getInt(0);
      localLedDevice.mac = localCursor.getString(1);
      localLedDevice.name = localCursor.getString(2);
      localLedDevice.status = localCursor.getInt(3);
      localLedDevice.photo = localCursor.getString(4);
      localLedDevice.cpassword = localCursor.getString(5);
      localLedDevice.icon = localCursor.getInt(6);
      localLedDevice.dispflag = localCursor.getInt(7);
      localLedDevice.login = localCursor.getInt(8);
      localLedDevice.password = localCursor.getString(9);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localLedDevice;
  }

  public ArrayList<LedDevice> getMyDevices()
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,name,status,photo,cpassword,icon,dispflag,login,password from tbDevice", null);
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      if (!localCursor.moveToNext())
      {
        localCursor.close();
        localSQLiteDatabase.close();
        return localArrayList;
      }
      LedDevice localLedDevice = new LedDevice();
      localLedDevice.id = localCursor.getInt(0);
      localLedDevice.mac = localCursor.getString(1);
      localLedDevice.name = localCursor.getString(2);
      localLedDevice.status = localCursor.getInt(3);
      localLedDevice.photo = localCursor.getString(4);
      localLedDevice.cpassword = localCursor.getString(5);
      localLedDevice.icon = localCursor.getInt(6);
      localLedDevice.dispflag = localCursor.getInt(7);
      localLedDevice.login = localCursor.getInt(8);
      localLedDevice.password = localCursor.getString(9);
      localArrayList.add(localLedDevice);
    }
  }

  public boolean isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from tbDevice where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }

  public void tab1_delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from wifiLight where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public wifi_light tab1_getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,device1,wifilight_ang1,wifilight_b1,wifilight_s1,device2,wifilight_ang2,wifilight_b2,wifilight_s2,device3,wifilight_ang3,wifilight_b3,wifilight_s3,device4,wifilight_ang4,wifilight_b4,wifilight_s4,device5,wifilight_ang5,wifilight_b5,wifilight_s5 from wifiLight where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    wifi_light localwifi_light = null;
    if (bool)
    {
      localwifi_light = new wifi_light();
      localwifi_light.id = localCursor.getInt(0);
      localwifi_light.mac = localCursor.getString(1);
      localwifi_light.device1 = localCursor.getString(2);
      localwifi_light.wifilight_ang1 = localCursor.getString(3);
      localwifi_light.wifilight_b1 = localCursor.getString(4);
      localwifi_light.wifilight_s1 = localCursor.getString(5);
      localwifi_light.device2 = localCursor.getString(6);
      localwifi_light.wifilight_ang2 = localCursor.getString(7);
      localwifi_light.wifilight_b2 = localCursor.getString(8);
      localwifi_light.wifilight_s2 = localCursor.getString(9);
      localwifi_light.device3 = localCursor.getString(10);
      localwifi_light.wifilight_ang3 = localCursor.getString(11);
      localwifi_light.wifilight_b3 = localCursor.getString(12);
      localwifi_light.wifilight_s3 = localCursor.getString(13);
      localwifi_light.device4 = localCursor.getString(14);
      localwifi_light.wifilight_ang4 = localCursor.getString(15);
      localwifi_light.wifilight_b4 = localCursor.getString(16);
      localwifi_light.wifilight_s4 = localCursor.getString(17);
      localwifi_light.device5 = localCursor.getString(18);
      localwifi_light.wifilight_ang5 = localCursor.getString(19);
      localwifi_light.wifilight_b5 = localCursor.getString(20);
      localwifi_light.wifilight_s5 = localCursor.getString(21);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localwifi_light;
  }

  public void wifiLightTime_addDevice(wifiLightTime paramwifiLightTime)
  {
    wifiLightTime_addDevice(paramwifiLightTime.mac, paramwifiLightTime.selectValue, paramwifiLightTime.on_hour, paramwifiLightTime.on_minute, paramwifiLightTime.off_hour, paramwifiLightTime.off_minute);
  }

  public void wifiLightTime_addDevice(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("insert into wifilighttime(mac,selectValue,on_hour,on_minute,off_hour,off_minute) values(?,?,?,?,?,?)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
    localSQLiteDatabase.close();
  }

  public void wifiLightTime_delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from wifilighttime where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public void wifiLightTime_edit(wifiLightTime paramwifiLightTime)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = paramwifiLightTime.selectValue;
    arrayOfObject[1] = paramwifiLightTime.on_hour;
    arrayOfObject[2] = paramwifiLightTime.on_minute;
    arrayOfObject[3] = paramwifiLightTime.off_hour;
    arrayOfObject[4] = paramwifiLightTime.off_minute;
    arrayOfObject[5] = paramwifiLightTime.mac;
    localSQLiteDatabase.execSQL("update wifilighttime set selectValue=?,on_hour=?,on_minute=?,off_hour=?,off_minute=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public wifiLightTime wifiLightTime_getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,selectValue,on_hour,on_minute,off_hour,off_minute from wifilighttime where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    wifiLightTime localwifiLightTime = null;
    if (bool)
    {
      localwifiLightTime = new wifiLightTime();
      localwifiLightTime.id = localCursor.getInt(0);
      localwifiLightTime.mac = localCursor.getString(1);
      localwifiLightTime.selectValue = localCursor.getString(2);
      localwifiLightTime.on_hour = localCursor.getString(3);
      localwifiLightTime.on_minute = localCursor.getString(4);
      localwifiLightTime.off_hour = localCursor.getString(5);
      localwifiLightTime.off_minute = localCursor.getString(6);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localwifiLightTime;
  }

  public boolean wifiLightTime_isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from wifilighttime where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }

  public void wifiLight_addDevice(wifi_light paramwifi_light)
  {
    wifiLight_addDevice(paramwifi_light.mac, paramwifi_light.device1, paramwifi_light.wifilight_ang1, paramwifi_light.wifilight_b1, paramwifi_light.wifilight_s1, paramwifi_light.device2, paramwifi_light.wifilight_ang2, paramwifi_light.wifilight_b2, paramwifi_light.wifilight_s2, paramwifi_light.device3, paramwifi_light.wifilight_ang3, paramwifi_light.wifilight_b3, paramwifi_light.wifilight_s3, paramwifi_light.device4, paramwifi_light.wifilight_ang4, paramwifi_light.wifilight_b4, paramwifi_light.wifilight_s4, paramwifi_light.device5, paramwifi_light.wifilight_ang5, paramwifi_light.wifilight_b5, paramwifi_light.wifilight_s5);
  }

  public void wifiLight_addDevice(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18, String paramString19, String paramString20, String paramString21)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("insert into wifiLight(mac,device1,wifilight_ang1,wifilight_b1,wifilight_s1,device2,wifilight_ang2,wifilight_b2,wifilight_s2,device3,wifilight_ang3,wifilight_b3,wifilight_s3,device4,wifilight_ang4,wifilight_b4,wifilight_s4,device5,wifilight_ang5,wifilight_b5,wifilight_s5) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramString11, paramString12, paramString13, paramString14, paramString15, paramString16, paramString17, paramString18, paramString19, paramString20, paramString21 });
    localSQLiteDatabase.close();
  }

  public void wifiLight_edit(wifi_light paramwifi_light)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[21];
    arrayOfObject[0] = paramwifi_light.device1;
    arrayOfObject[1] = paramwifi_light.wifilight_ang1;
    arrayOfObject[2] = paramwifi_light.wifilight_b1;
    arrayOfObject[3] = paramwifi_light.wifilight_s1;
    arrayOfObject[4] = paramwifi_light.device2;
    arrayOfObject[5] = paramwifi_light.wifilight_ang2;
    arrayOfObject[6] = paramwifi_light.wifilight_b2;
    arrayOfObject[7] = paramwifi_light.wifilight_s2;
    arrayOfObject[8] = paramwifi_light.device3;
    arrayOfObject[9] = paramwifi_light.wifilight_ang3;
    arrayOfObject[10] = paramwifi_light.wifilight_b3;
    arrayOfObject[11] = paramwifi_light.wifilight_s3;
    arrayOfObject[12] = paramwifi_light.device4;
    arrayOfObject[13] = paramwifi_light.wifilight_ang4;
    arrayOfObject[14] = paramwifi_light.wifilight_b4;
    arrayOfObject[15] = paramwifi_light.wifilight_s4;
    arrayOfObject[16] = paramwifi_light.device5;
    arrayOfObject[17] = paramwifi_light.wifilight_ang5;
    arrayOfObject[18] = paramwifi_light.wifilight_b5;
    arrayOfObject[19] = paramwifi_light.wifilight_s5;
    arrayOfObject[20] = paramwifi_light.mac;
    localSQLiteDatabase.execSQL("update wifiLight set device1=?,wifilight_ang1=?,wifilight_b1=?,wifilight_s1=?,device2=?,wifilight_ang2=?,wifilight_b2=?,wifilight_s2=?,device3=?,wifilight_ang3=?,wifilight_b3=?,wifilight_s3=?,device4=?,wifilight_ang4=?,wifilight_b4=?,wifilight_s4=?,device5=?,wifilight_ang5=?,wifilight_b5=?,wifilight_s5=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public boolean wifiLight_isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from wifiLight where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }

  public void wifidiyTime_addDevice(wifidiyTime paramwifidiyTime)
  {
    wifidiyTime_addDevice(paramwifidiyTime.mac, paramwifidiyTime.selectValue, paramwifidiyTime.on_hour, paramwifidiyTime.on_minute, paramwifidiyTime.off_hour, paramwifidiyTime.off_minute, paramwifidiyTime.deviceid, paramwifidiyTime.zonech);
  }

  public void wifidiyTime_addDevice(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("insert into wifidiytime(mac,selectValue,on_hour,on_minute,off_hour,off_minute,deviceid,zonech) values(?,?,?,?,?,?,?,?)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8 });
    localSQLiteDatabase.close();
  }

  public void wifidiyTime_delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from wifidiytime where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public void wifidiyTime_edit(wifidiyTime paramwifidiyTime)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramwifidiyTime.selectValue;
    arrayOfObject[1] = paramwifidiyTime.on_hour;
    arrayOfObject[2] = paramwifidiyTime.on_minute;
    arrayOfObject[3] = paramwifidiyTime.off_hour;
    arrayOfObject[4] = paramwifidiyTime.off_minute;
    arrayOfObject[5] = paramwifidiyTime.deviceid;
    arrayOfObject[6] = paramwifidiyTime.zonech;
    arrayOfObject[7] = paramwifidiyTime.mac;
    localSQLiteDatabase.execSQL("update wifidiytime set selectValue=?,on_hour=?,on_minute=?,off_hour=?,off_minute=?,deviceid =?,zonech=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public wifidiyTime wifidiyTime_getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,selectValue,on_hour,on_minute,off_hour,off_minute, deviceid,zonech from wifidiytime where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    wifidiyTime localwifidiyTime = null;
    if (bool)
    {
      localwifidiyTime = new wifidiyTime();
      localwifidiyTime.id = localCursor.getInt(0);
      localwifidiyTime.mac = localCursor.getString(1);
      localwifidiyTime.selectValue = localCursor.getString(2);
      localwifidiyTime.on_hour = localCursor.getString(3);
      localwifidiyTime.on_minute = localCursor.getString(4);
      localwifidiyTime.off_hour = localCursor.getString(5);
      localwifidiyTime.off_minute = localCursor.getString(6);
      localwifidiyTime.deviceid = localCursor.getString(7);
      localwifidiyTime.zonech = localCursor.getString(8);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localwifidiyTime;
  }

  public boolean wifidiyTime_isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from wifidiytime where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }

  public void zoneName_addDevice(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("insert into zonename(mac,zoneNameone,zoneNametwo,zoneNamethree,zoneNamefour) values(?,?,?,?,?)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
    localSQLiteDatabase.close();
  }

  public void zoneName_delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from zonename where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public void zoneName_edit(zoneName paramzoneName)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramzoneName.zoneNameone;
    arrayOfObject[1] = paramzoneName.zoneNametwo;
    arrayOfObject[2] = paramzoneName.zoneNamethree;
    arrayOfObject[3] = paramzoneName.zoneNamefour;
    arrayOfObject[4] = paramzoneName.mac;
    localSQLiteDatabase.execSQL("update zonename set zoneNameone=?,zoneNametwo=?,zoneNamethree=?,zoneNamefour=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public zoneName zoneName_getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,zoneNameone,zoneNametwo,zoneNamethree,zoneNamefour from zonename where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    zoneName localzoneName = null;
    if (bool)
    {
      localzoneName = new zoneName();
      localzoneName.id = localCursor.getInt(0);
      localzoneName.mac = localCursor.getString(1);
      localzoneName.zoneNameone = localCursor.getString(2);
      localzoneName.zoneNametwo = localCursor.getString(3);
      localzoneName.zoneNamethree = localCursor.getString(4);
      localzoneName.zoneNamefour = localCursor.getString(5);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localzoneName;
  }

  public boolean zoneName_isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from zonename where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }

  public void zoneTime_addDevice(zoneTime paramzoneTime)
  {
    zoneTime_addDevice(paramzoneTime.mac, paramzoneTime.selectValue, paramzoneTime.oneon_hour, paramzoneTime.oneon_minute, paramzoneTime.oneoff_hour, paramzoneTime.oneoff_minute, paramzoneTime.twoon_hour, paramzoneTime.twoon_minute, paramzoneTime.twooff_hour, paramzoneTime.twooff_minute, paramzoneTime.threeon_hour, paramzoneTime.threeon_minute, paramzoneTime.threeoff_hour, paramzoneTime.threeoff_minute, paramzoneTime.fouron_hour, paramzoneTime.fouroff_minute, paramzoneTime.fouroff_hour, paramzoneTime.fouroff_minute);
  }

  public void zoneTime_addDevice(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("insert into wifizonetime(mac,selectValue,oneon_hour,oneon_minute,oneoff_hour,oneoff_minute,twoon_hour,twoon_minute,twooff_hour,twooff_minute,threeon_hour,threeon_minute,threeoff_hour,threeoff_minute,fouron_hour,fouron_minute,fouroff_hour,fouroff_minute) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10, paramString11, paramString12, paramString13, paramString14, paramString15, paramString16, paramString17, paramString18 });
    localSQLiteDatabase.close();
  }

  public void zoneTime_delDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.execSQL("delete from wifizonetime where mac = ?", new Object[] { paramString });
    localSQLiteDatabase.close();
  }

  public void zoneTime_edit(zoneTime paramzoneTime)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    Object[] arrayOfObject = new Object[18];
    arrayOfObject[0] = paramzoneTime.selectValue;
    arrayOfObject[1] = paramzoneTime.oneon_hour;
    arrayOfObject[2] = paramzoneTime.oneon_minute;
    arrayOfObject[3] = paramzoneTime.oneoff_hour;
    arrayOfObject[4] = paramzoneTime.oneoff_minute;
    arrayOfObject[5] = paramzoneTime.twoon_hour;
    arrayOfObject[6] = paramzoneTime.twoon_minute;
    arrayOfObject[7] = paramzoneTime.twooff_hour;
    arrayOfObject[8] = paramzoneTime.twooff_minute;
    arrayOfObject[9] = paramzoneTime.threeon_hour;
    arrayOfObject[10] = paramzoneTime.threeon_minute;
    arrayOfObject[11] = paramzoneTime.threeoff_hour;
    arrayOfObject[12] = paramzoneTime.threeoff_minute;
    arrayOfObject[13] = paramzoneTime.fouron_hour;
    arrayOfObject[14] = paramzoneTime.fouron_minute;
    arrayOfObject[15] = paramzoneTime.fouroff_hour;
    arrayOfObject[16] = paramzoneTime.fouroff_minute;
    arrayOfObject[17] = paramzoneTime.mac;
    localSQLiteDatabase.execSQL("update wifizonetime set selectValue=?,oneon_hour=?,oneon_minute=?,oneoff_hour=?,oneoff_minute=?,twoon_hour=?,twoon_minute=?,twooff_hour=?,twooff_minute=?,threeon_hour=?,threeon_minute=?,threeoff_hour=?,threeoff_minute=?,fouron_hour=?,fouron_minute=?,fouroff_hour=?,fouroff_minute=? where mac=?", arrayOfObject);
    localSQLiteDatabase.close();
  }

  public zoneTime zoneTime_getMyDevice(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select _id,mac,selectValue,oneon_hour,oneon_minute,oneoff_hour,oneoff_minute,twoon_hour,twoon_minute,twooff_hour,twooff_minute,threeon_hour,threeon_minute,threeoff_hour,threeoff_minute,fouron_hour,fouron_minute,fouroff_hour,fouroff_minute from wifizonetime where mac = ?", new String[] { paramString });
    boolean bool = localCursor.moveToNext();
    zoneTime localzoneTime = null;
    if (bool)
    {
      localzoneTime = new zoneTime();
      localzoneTime.id = localCursor.getInt(0);
      localzoneTime.mac = localCursor.getString(1);
      localzoneTime.selectValue = localCursor.getString(2);
      localzoneTime.oneon_hour = localCursor.getString(3);
      localzoneTime.oneon_minute = localCursor.getString(4);
      localzoneTime.oneoff_hour = localCursor.getString(5);
      localzoneTime.oneoff_minute = localCursor.getString(6);
      localzoneTime.twoon_hour = localCursor.getString(7);
      localzoneTime.twoon_minute = localCursor.getString(8);
      localzoneTime.twooff_hour = localCursor.getString(9);
      localzoneTime.twooff_minute = localCursor.getString(10);
      localzoneTime.threeon_hour = localCursor.getString(11);
      localzoneTime.threeon_minute = localCursor.getString(12);
      localzoneTime.threeoff_hour = localCursor.getString(13);
      localzoneTime.threeoff_minute = localCursor.getString(14);
      localzoneTime.fouron_hour = localCursor.getString(15);
      localzoneTime.fouron_minute = localCursor.getString(16);
      localzoneTime.fouroff_hour = localCursor.getString(17);
      localzoneTime.fouroff_minute = localCursor.getString(18);
    }
    localCursor.close();
    localSQLiteDatabase.close();
    return localzoneTime;
  }

  public boolean zoneTime_isDeviceExists(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.rawQuery("select mac from wifizonetime where mac = ?", new String[] { paramString });
    boolean bool1 = localCursor.moveToNext();
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localCursor.close();
    localSQLiteDatabase.close();
    return bool2;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.bdData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */