package com.irainxun.wifilight.xlink.manage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class CmdManage$DbHelper extends SQLiteOpenHelper
{
  private static final String TAG = "SQLiteHelper";
  private static final int VERSION = 1;
  private static final String name = "cmd.db";

  public CmdManage$DbHelper(CmdManage paramCmdManage, Context paramContext)
  {
    this(paramCmdManage, paramContext, "cmd.db", 1);
  }

  public CmdManage$DbHelper(CmdManage paramCmdManage, Context paramContext, String paramString)
  {
    this(paramCmdManage, paramContext, paramString, 1);
  }

  public CmdManage$DbHelper(CmdManage paramCmdManage, Context paramContext, String paramString, int paramInt)
  {
    this(paramCmdManage, paramContext, paramString, null, paramInt);
  }

  public CmdManage$DbHelper(CmdManage paramCmdManage, Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
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

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.manage.CmdManage.DbHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */