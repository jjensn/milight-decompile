package cn.jpush.android.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import cn.jpush.android.util.ac;

final class p extends SQLiteOpenHelper
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 25;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "\bU\03019\030F\025-\\lN\021A\\\024N\0045Jlm'\024j$X$\025x8n$\025p/t";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 76;
        break label96;
        i3 = 7;
        break label96;
        i3 = 87;
        break label96;
        i3 = 97;
        break label96;
        m = 0;
      }
    }
  }

  public p(Context paramContext)
  {
    this(paramContext, z[0], null, 1);
  }

  private p(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, null, 1);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.execSQL(z[1]);
      return;
    }
    catch (Exception localException)
    {
      ac.a();
    }
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL(z[2]);
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */