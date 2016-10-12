package com.irainxun.wifilight.xlink.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.irainxun.wifilight.xlink.MyApp;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class XTProperties
  implements Map<String, String>
{
  private static final String LOG_TAG = "XTProperties";
  private static final String MAC = "mac";
  private static String TABLE = "properties";
  private static final String VALUE = "value";
  private DbHelper dbHelper;
  private Map<String, String> properties;

  private XTProperties()
  {
  }

  private void deleteProperty(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.delete(TABLE, "mac=?", new String[] { paramString });
    localSQLiteDatabase.close();
    Log.d("XTProperties", "property deleted: " + paramString);
  }

  public static XTProperties getInstance()
  {
    return DodaPropertyHolder.instance;
  }

  private void insertProperty(String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("mac", paramString1);
    localContentValues.put("value", paramString2);
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.insert(TABLE, null, localContentValues);
    localSQLiteDatabase.close();
    Log.d("XTProperties", "property inserted: " + paramString1);
  }

  private void loadProperties()
  {
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getReadableDatabase();
    Cursor localCursor = localSQLiteDatabase.query(TABLE, new String[] { "mac", "value" }, null, null, null, null, null);
    while (true)
    {
      if (!localCursor.moveToNext())
      {
        localCursor.close();
        localSQLiteDatabase.close();
        return;
      }
      String str1 = localCursor.getString(localCursor.getColumnIndex("mac"));
      String str2 = localCursor.getString(localCursor.getColumnIndex("value"));
      this.properties.put(str1, str2);
    }
  }

  private void updateProperty(String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("value", paramString2);
    SQLiteDatabase localSQLiteDatabase = this.dbHelper.getWritableDatabase();
    localSQLiteDatabase.update(TABLE, localContentValues, "mac=?", new String[] { paramString1 });
    localSQLiteDatabase.close();
    Log.d("XTProperties", "property updated: " + paramString1);
  }

  public void clear()
  {
    throw new UnsupportedOperationException();
  }

  public boolean containsKey(Object paramObject)
  {
    return this.properties.containsKey(paramObject);
  }

  public boolean containsValue(Object paramObject)
  {
    return this.properties.containsValue(paramObject);
  }

  public Set<Map.Entry<String, String>> entrySet()
  {
    return Collections.unmodifiableSet(this.properties.entrySet());
  }

  public String get(Object paramObject)
  {
    return (String)this.properties.get(paramObject);
  }

  public boolean getBooleanProperty(String paramString)
  {
    return Boolean.valueOf(get(paramString)).booleanValue();
  }

  public boolean getBooleanProperty(String paramString, boolean paramBoolean)
  {
    String str = get(paramString);
    if (str != null)
      paramBoolean = Boolean.valueOf(str).booleanValue();
    return paramBoolean;
  }

  public Collection<String> getChildrenNames(String paramString)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.properties.keySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localHashSet;
      String str = (String)localIterator.next();
      if ((str.startsWith(String.valueOf(paramString) + ".")) && (!str.equals(paramString)))
      {
        int i = str.indexOf(".", 1 + paramString.length());
        if (i < 1)
        {
          if (!localHashSet.contains(str))
            localHashSet.add(str);
        }
        else
          localHashSet.add(String.valueOf(paramString) + str.substring(paramString.length(), i));
      }
    }
  }

  public Map<String, String> getProperties()
  {
    return this.properties;
  }

  public String getProperty(String paramString1, String paramString2)
  {
    String str = (String)this.properties.get(paramString1);
    if (str != null)
      return str;
    return paramString2;
  }

  public Collection<String> getPropertyNames()
  {
    return this.properties.keySet();
  }

  public void init()
  {
    if (this.properties == null)
      this.properties = new ConcurrentHashMap();
    while (true)
    {
      this.dbHelper = new DbHelper(MyApp.getApp());
      loadProperties();
      return;
      this.properties.clear();
    }
  }

  public boolean isEmpty()
  {
    return this.properties.isEmpty();
  }

  public Set<String> keySet()
  {
    return Collections.unmodifiableSet(this.properties.keySet());
  }

  public String put(String paramString1, String paramString2)
  {
    if (paramString2 == null)
      return remove(paramString1);
    if (paramString1 == null)
      throw new NullPointerException("Key cannot be null. Key=" + paramString1 + ", " + "value" + "=" + paramString2);
    if (paramString1.endsWith("."))
      paramString1 = paramString1.substring(0, -1 + paramString1.length());
    str1 = paramString1.trim();
    try
    {
      if (this.properties.containsKey(str1))
        if (!((String)this.properties.get(str1)).equals(paramString2))
          updateProperty(str1, paramString2);
      while (true)
      {
        String str2 = (String)this.properties.put(str1, paramString2);
        new HashMap().put("value", paramString2);
        return str2;
        insertProperty(str1, paramString2);
      }
    }
    finally
    {
    }
  }

  public void putAll(Map<? extends String, ? extends String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put((String)localEntry.getKey(), (String)localEntry.getValue());
    }
  }

  public String remove(Object paramObject)
  {
    try
    {
      String str1 = (String)this.properties.remove(paramObject);
      Iterator localIterator = getPropertyNames().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
        {
          deleteProperty((String)paramObject);
          return str1;
        }
        String str2 = (String)localIterator.next();
        if (str2.startsWith((String)paramObject))
          this.properties.remove(str2);
      }
    }
    finally
    {
    }
  }

  public int size()
  {
    return this.properties.size();
  }

  public Collection<String> values()
  {
    return Collections.unmodifiableCollection(this.properties.values());
  }

  public class DbHelper extends SQLiteOpenHelper
  {
    private static final String TAG = "SQLiteHelper";
    private static final int VERSION = 1;
    private static final String name = "device.db";

    public DbHelper(Context arg2)
    {
      this(localContext, "device.db", 1);
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
      paramSQLiteDatabase.execSQL("CREATE TABLE properties(mac varchar(100) primary key, value TEXT)");
      Log.d("SQLiteHelper", "create properties's db OK!");
    }

    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      Log.d("SQLiteHelper", "properties's db onUpgrade!");
    }
  }

  private static class DodaPropertyHolder
  {
    private static final XTProperties instance = new XTProperties(null);

    static
    {
      instance.init();
    }

    private DodaPropertyHolder()
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.util.XTProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */