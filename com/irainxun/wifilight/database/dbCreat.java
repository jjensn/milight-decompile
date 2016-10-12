package com.irainxun.wifilight.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;

public class dbCreat extends SQLiteOpenHelper
{
  private static final String DATABASE_NAME = "milight-wifi.db";
  private static final int DATABASE_VERSION = 1;
  public static final String TAB_DIY_DEVICE = "diydevice";
  public static final String TAB_WIFIDIY_TIME = "wifidiytime";
  public static final String TAB_WIFILIGHT_TIME = "wifilighttime";
  public static final String TAB_WIFIZONE_TIME = "wifizonetime";
  public static final String TAB_WIFI_LIGHT = "wifiLight";
  public static final String TAB_ZONE_NAME = "zonename";
  private static final String TAG = dbCreat.class.getSimpleName();
  public static final String TB_DEVICE = "tbDevice";

  public dbCreat(Context paramContext)
  {
    super(paramContext, "milight-wifi.db", null, 1);
  }

  private ArrayList<String> createTables()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("create table if not exists tbDevice(_id integer primary key autoincrement,mac varchar(32) not null,name varchar(32) not null,status smallint not null,photo varchar(100) not null,cpassword varchar(32) not null,icon smallint not null,dispflag smallint not null,login smallint not null,password varchar(32) not null)");
    Log.d("debug", "creat sql");
    localArrayList.add("create table if not exists wifiLight(_id integer primary key autoincrement,mac varchar(32) not null,device1 varchar(32),wifilight_ang1 varchar(32),wifilight_b1 varchar(32),wifilight_s1 varchar(32),device2 varchar(32),wifilight_ang2 varchar(32),wifilight_b2 varchar(32),wifilight_s2 varchar(32),device3 varchar(32),wifilight_ang3 varchar(32),wifilight_b3 varchar(32),wifilight_s3 varchar(32),device4 varchar(32),wifilight_ang4 varchar(32),wifilight_b4 varchar(32),wifilight_s4 varchar(32),device5 varchar(32),wifilight_ang5 varchar(32),wifilight_b5 varchar(32),wifilight_s5 varchar(32))");
    localArrayList.add("create table if not exists zonename(_id integer primary key autoincrement,mac varchar(32) not null,zoneNameone varchar(32),zoneNametwo varchar(32),zoneNamethree varchar(32),zoneNamefour varchar(32))");
    localArrayList.add("create table if not exists wifilighttime(_id integer primary key autoincrement,mac varchar(32) not null,selectValue varchar(32),on_hour varchar(32),on_minute varchar(32),off_hour varchar(32),off_minute varchar(32))");
    localArrayList.add("create table if not exists wifizonetime(_id integer primary key autoincrement,mac varchar(32) not null,selectValue varchar(32),oneon_hour varchar(32),oneon_minute varchar(32),oneoff_hour varchar(32),oneoff_minute varchar(32),twoon_hour varchar(32),twoon_minute varchar(32),twooff_hour varchar(32),twooff_minute varchar(32),threeon_hour varchar(32),threeon_minute varchar(32),threeoff_hour varchar(32),threeoff_minute varchar(32),fouron_hour varchar(32),fouron_minute varchar(32),fouroff_hour varchar(32),fouroff_minute varchar(32))");
    localArrayList.add("create table if not exists diydevice(_id integer primary key autoincrement,mac varchar(32) not null,deviceid varchar(32),deviceselect varchar(32),zonech varchar(32))");
    localArrayList.add("create table if not exists wifidiytime(_id integer primary key autoincrement,mac varchar(32) not null,selectValue varchar(32),on_hour varchar(32),on_minute varchar(32),off_hour varchar(32),off_minute varchar(32),deviceid varchar(32),zonech varchar(32))");
    return localArrayList;
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    ArrayList localArrayList = createTables();
    int i = localArrayList.size();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      paramSQLiteDatabase.execSQL((String)localArrayList.get(j));
    }
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.dbCreat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */