package com.irainxun.wifilight.xlink.manage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.CmdBean;
import com.irainxun.wifilight.xlink.util.SharedPreferencesUtil;
import com.irainxun.wifilight.xlink.util.XlinkUtils;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class CmdManage
{
  private static final String NAME = "name";
  private static final String TABLE = "cmd";
  private static final String VALUE = "value";
  private static ConcurrentHashMap<String, CmdBean> cmdBeanMap = new ConcurrentHashMap();
  private static CmdManage instance;
  private static final ArrayList<CmdBean> listCmd = new ArrayList();
  private DbHelper dbHelper = new DbHelper(MyApp.getApp());

  private CmdManage()
  {
    loadProperties();
    initCmd();
  }

  private void delete(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
      localSQLiteDatabase.delete("cmd", "name=?", new String[] { paramString });
      localSQLiteDatabase.close();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public static CmdManage getInstance()
  {
    if (instance == null)
      instance = new CmdManage();
    return instance;
  }

  private void initCmd()
  {
    if (!SharedPreferencesUtil.queryBooleanValue("isinit"))
    {
      CmdBean localCmdBean1 = new CmdBean();
      localCmdBean1.name = "开";
      localCmdBean1.strCmd = "01";
      localCmdBean1.setData(XlinkUtils.stringToByteArray(localCmdBean1.strCmd));
      CmdBean localCmdBean2 = new CmdBean();
      localCmdBean2.name = "关";
      localCmdBean2.strCmd = "02";
      localCmdBean2.setData(XlinkUtils.stringToByteArray(localCmdBean2.strCmd));
      CmdBean localCmdBean3 = new CmdBean();
      localCmdBean3.name = "加";
      localCmdBean3.strCmd = "03";
      localCmdBean3.setData(XlinkUtils.stringToByteArray(localCmdBean3.strCmd));
      CmdBean localCmdBean4 = new CmdBean();
      localCmdBean4.name = "减";
      localCmdBean4.strCmd = "04";
      localCmdBean4.setData(XlinkUtils.stringToByteArray(localCmdBean4.strCmd));
      addCmd(localCmdBean1);
      addCmd(localCmdBean2);
      addCmd(localCmdBean3);
      addCmd(localCmdBean4);
      SharedPreferencesUtil.keepShared("isinit", true);
    }
  }

  private void insert(String paramString1, String paramString2)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("name", paramString1);
      localContentValues.put("value", paramString2);
      SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
      localSQLiteDatabase.insert("cmd", null, localContentValues);
      localSQLiteDatabase.close();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  private void loadProperties()
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.query("cmd", new String[] { "name", "value" }, null, null, null, null, null);
    while (true)
    {
      if (!localCursor.moveToNext())
      {
        localCursor.close();
        localSQLiteDatabase.close();
        return;
      }
      String str1 = localCursor.getString(localCursor.getColumnIndex("name"));
      String str2 = localCursor.getString(localCursor.getColumnIndex("value"));
      CmdBean localCmdBean = new CmdBean();
      localCmdBean.name = str1;
      localCmdBean.strCmd = str2;
      localCmdBean.setData(XlinkUtils.stringToByteArray(str2));
      cmdBeanMap.put(str1, localCmdBean);
      listCmd.add(localCmdBean);
    }
  }

  private void update(String paramString1, String paramString2)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("value", paramString2);
      SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
      localSQLiteDatabase.update("cmd", localContentValues, "name=?", new String[] { paramString1 });
      localSQLiteDatabase.close();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public void addCmd(CmdBean paramCmdBean)
  {
    if (cmdBeanMap.get(paramCmdBean) != null)
      update(paramCmdBean.name, paramCmdBean.strCmd);
    while (true)
    {
      listCmd.add(paramCmdBean);
      cmdBeanMap.put(paramCmdBean.name, paramCmdBean);
      return;
      insert(paramCmdBean.name, paramCmdBean.strCmd);
    }
  }

  public void deleteCmd(String paramString)
  {
    listCmd.remove(cmdBeanMap.get(paramString));
    cmdBeanMap.remove(paramString);
    delete(paramString);
  }

  public CmdBean getCmd(String paramString)
  {
    return (CmdBean)cmdBeanMap.get(paramString);
  }

  public ArrayList<CmdBean> getCmds()
  {
    try
    {
      ArrayList localArrayList = listCmd;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public class DbHelper extends SQLiteOpenHelper
  {
    private static final String TAG = "SQLiteHelper";
    private static final int VERSION = 1;
    private static final String name = "cmd.db";

    public DbHelper(Context arg2)
    {
      this(localContext, "cmd.db", 1);
    }

    public DbHelper(Context paramString, String arg3)
    {
      this(paramString, str, 1);
    }

    public DbHelper(Context paramString, String paramInt, int arg4)
    {
      this(paramString, paramInt, null, i);
    }

    public DbHelper(Context paramString, String paramCursorFactory, SQLiteDatabase.CursorFactory paramInt, int arg5)
    {
      super(paramCursorFactory, paramInt, i);
    }

    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE cmd(name varchar(100) primary key, value TEXT)");
    }

    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      Log.d("SQLiteHelper", "properties's db onUpgrade!");
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.manage.CmdManage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */