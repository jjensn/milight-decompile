package com.irainxun.wifilight.xlink.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class XTProperties$DbHelper extends SQLiteOpenHelper
{
  private static final String TAG = "SQLiteHelper";
  private static final int VERSION = 1;
  private static final String name = "device.db";

  public XTProperties$DbHelper(XTProperties paramXTProperties, Context paramContext)
  {
    this(paramXTProperties, paramContext, "device.db", 1);
  }

  public XTProperties$DbHelper(XTProperties paramXTProperties, Context paramContext, String paramString)
  {
    this(paramXTProperties, paramContext, paramString, 1);
  }

  public XTProperties$DbHelper(XTProperties paramXTProperties, Context paramContext, String paramString, int paramInt)
  {
    this(paramXTProperties, paramContext, paramString, null, paramInt);
  }

  public XTProperties$DbHelper(XTProperties paramXTProperties, Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE properties(mac varchar(100) primary key, value TEXT)");
    Log.d("SQLiteHelper", "create properties's db OK!");
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Log.d("SQLiteHelper", "properties's db onUpgrade!");
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.util.XTProperties.DbHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */