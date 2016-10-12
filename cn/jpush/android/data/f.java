package cn.jpush.android.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import cn.jpush.android.util.ac;

public final class f
{
  public static final String[] a = localObject2;
  private static final String[] z;
  private Context b;
  private g c;
  private SQLiteDatabase d;

  static
  {
    Object localObject1 = new String[17];
    int i = 0;
    String str1 = "";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 105;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    String str2;
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "gx]\006\006~xv";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "In\n\njzl\n\035bpk\006\bm\013";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "gx]\006\006~xv[Y";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "gx]\021\020{s";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "gx]\f\r";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "gx]\004\roIv\f\004n";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "gx]\f\r6";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "gx]\006\006~xvX";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "dfg\013Idfg\013>yv\004\013gsF\004\035jtc\026\f+pc\f\005+s8";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "6&";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "+wl\001Igx]\021\020{s";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        z = localObject2;
        localObject1 = new String[8];
        str1 = "Tf";
        j = 16;
        localObject2 = localObject1;
        i = 0;
        break;
        i3 = 11;
        continue;
        i3 = 22;
        continue;
        i3 = 2;
        continue;
        i3 = 101;
      case 16:
      }
    }
    localObject1[i] = str2;
    localObject2[1] = z[8];
    localObject2[2] = z[1];
    localObject2[3] = z[0];
    localObject2[4] = z[4];
    localObject2[5] = z[10];
    localObject2[6] = z[11];
    localObject2[7] = z[9];
  }

  public f(Context paramContext)
  {
    this.b = paramContext;
    this.c = new g(paramContext);
  }

  private boolean c()
  {
    try
    {
      this.d = this.c.getWritableDatabase();
      bool = true;
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder(z[14]).append(localException.getMessage());
        ac.e();
        boolean bool = false;
      }
    }
    finally
    {
    }
  }

  private boolean d()
  {
    try
    {
      this.d = this.c.getReadableDatabase();
      bool = true;
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder(z[7]).append(localException.getMessage());
        ac.e();
        boolean bool = false;
      }
    }
    finally
    {
    }
  }

  public final long a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, String paramString, long paramLong2, long paramLong3)
  {
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(z[8], Long.valueOf(paramLong1));
      localContentValues.put(z[1], Integer.valueOf(1));
      localContentValues.put(z[0], Integer.valueOf(0));
      localContentValues.put(z[4], Integer.valueOf(0));
      localContentValues.put(z[10], paramString);
      localContentValues.put(z[11], Long.valueOf(paramLong2));
      localContentValues.put(z[9], Long.valueOf(paramLong3));
      l1 = 0L;
      try
      {
        long l2 = this.d.insert(z[2], null, localContentValues);
        l1 = l2;
        return l1;
      }
      catch (Exception localException)
      {
        while (true)
          localException.printStackTrace();
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public final android.database.Cursor a(int paramInt, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 91	java/lang/StringBuilder
    //   5: dup
    //   6: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   9: bipush 13
    //   11: aaload
    //   12: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: iconst_1
    //   16: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   19: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   22: bipush 6
    //   24: aaload
    //   25: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc 149
    //   30: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: lload_2
    //   34: invokevirtual 152	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   37: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore 8
    //   42: aload_0
    //   43: getfield 89	cn/jpush/android/data/f:d	Landroid/database/sqlite/SQLiteDatabase;
    //   46: iconst_1
    //   47: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   50: iconst_2
    //   51: aaload
    //   52: getstatic 69	cn/jpush/android/data/f:a	[Ljava/lang/String;
    //   55: aload 8
    //   57: aconst_null
    //   58: aconst_null
    //   59: aconst_null
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokevirtual 159	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   65: astore 9
    //   67: aload 9
    //   69: astore 7
    //   71: aload 7
    //   73: ifnull +11 -> 84
    //   76: aload 7
    //   78: invokeinterface 164 1 0
    //   83: pop
    //   84: aload_0
    //   85: monitorexit
    //   86: aload 7
    //   88: areturn
    //   89: astore 5
    //   91: aload 5
    //   93: astore 6
    //   95: aconst_null
    //   96: astore 7
    //   98: aload 6
    //   100: invokevirtual 143	java/lang/Exception:printStackTrace	()V
    //   103: goto -19 -> 84
    //   106: astore 4
    //   108: aload_0
    //   109: monitorexit
    //   110: aload 4
    //   112: athrow
    //   113: astore 6
    //   115: goto -17 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   2	67	89	java/lang/Exception
    //   2	67	106	finally
    //   76	84	106	finally
    //   98	103	106	finally
    //   76	84	113	java/lang/Exception
  }

  // ERROR //
  public final android.database.Cursor a(long paramLong, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 91	java/lang/StringBuilder
    //   5: dup
    //   6: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   9: bipush 12
    //   11: aaload
    //   12: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: lload_1
    //   16: invokevirtual 152	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   19: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   22: bipush 16
    //   24: aaload
    //   25: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   31: bipush 15
    //   33: aaload
    //   34: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore 7
    //   42: aload_0
    //   43: getfield 89	cn/jpush/android/data/f:d	Landroid/database/sqlite/SQLiteDatabase;
    //   46: iconst_1
    //   47: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   50: iconst_2
    //   51: aaload
    //   52: getstatic 69	cn/jpush/android/data/f:a	[Ljava/lang/String;
    //   55: aload 7
    //   57: aconst_null
    //   58: aconst_null
    //   59: aconst_null
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokevirtual 159	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   65: astore 8
    //   67: aload 8
    //   69: astore 5
    //   71: aload 5
    //   73: ifnull +11 -> 84
    //   76: aload 5
    //   78: invokeinterface 164 1 0
    //   83: pop
    //   84: aload_0
    //   85: monitorexit
    //   86: aload 5
    //   88: areturn
    //   89: astore 6
    //   91: aload_0
    //   92: monitorexit
    //   93: aload 6
    //   95: athrow
    //   96: astore 4
    //   98: aconst_null
    //   99: astore 5
    //   101: goto -17 -> 84
    //   104: astore 9
    //   106: goto -22 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   2	67	89	finally
    //   76	84	89	finally
    //   2	67	96	java/lang/Exception
    //   76	84	104	java/lang/Exception
  }

  // ERROR //
  public final android.database.Cursor a(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 167
    //   5: lload_1
    //   6: ladd
    //   7: lstore 5
    //   9: new 91	java/lang/StringBuilder
    //   12: dup
    //   13: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   16: iconst_5
    //   17: aaload
    //   18: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: lload 5
    //   23: invokevirtual 152	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   26: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   29: bipush 6
    //   31: aaload
    //   32: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 170
    //   37: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: lload_1
    //   41: invokevirtual 152	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   44: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore 8
    //   49: aload_0
    //   50: getfield 89	cn/jpush/android/data/f:d	Landroid/database/sqlite/SQLiteDatabase;
    //   53: iconst_1
    //   54: getstatic 65	cn/jpush/android/data/f:z	[Ljava/lang/String;
    //   57: iconst_2
    //   58: aaload
    //   59: getstatic 69	cn/jpush/android/data/f:a	[Ljava/lang/String;
    //   62: aload 8
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: invokevirtual 159	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 11
    //   74: aload 11
    //   76: astore 10
    //   78: aload 10
    //   80: ifnull +11 -> 91
    //   83: aload 10
    //   85: invokeinterface 164 1 0
    //   90: pop
    //   91: aload_0
    //   92: monitorexit
    //   93: aload 10
    //   95: areturn
    //   96: astore 7
    //   98: aload_0
    //   99: monitorexit
    //   100: aload 7
    //   102: athrow
    //   103: astore 9
    //   105: aconst_null
    //   106: astore 10
    //   108: goto -17 -> 91
    //   111: astore 12
    //   113: goto -22 -> 91
    //
    // Exception table:
    //   from	to	target	type
    //   9	49	96	finally
    //   49	74	96	finally
    //   83	91	96	finally
    //   49	74	103	java/lang/Exception
    //   83	91	111	java/lang/Exception
  }

  public final void a()
  {
    try
    {
      if (this.d != null)
        this.d.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public final void a(android.database.Cursor paramCursor, h paramh)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_1
    //   7: invokeinterface 178 1 0
    //   12: ifne +9 -> 21
    //   15: invokestatic 180	cn/jpush/android/util/ac:b	()V
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: aload_2
    //   22: ifnonnull +11 -> 33
    //   25: new 182	cn/jpush/android/data/h
    //   28: dup
    //   29: invokespecial 183	cn/jpush/android/data/h:<init>	()V
    //   32: astore_2
    //   33: aload_2
    //   34: aload_1
    //   35: iconst_1
    //   36: invokeinterface 187 2 0
    //   41: invokevirtual 190	cn/jpush/android/data/h:a	(J)V
    //   44: aload_2
    //   45: aload_1
    //   46: iconst_2
    //   47: invokeinterface 194 2 0
    //   52: invokevirtual 197	cn/jpush/android/data/h:a	(I)V
    //   55: aload_2
    //   56: aload_1
    //   57: iconst_3
    //   58: invokeinterface 194 2 0
    //   63: invokevirtual 199	cn/jpush/android/data/h:b	(I)V
    //   66: aload_2
    //   67: aload_1
    //   68: iconst_4
    //   69: invokeinterface 194 2 0
    //   74: invokevirtual 201	cn/jpush/android/data/h:c	(I)V
    //   77: aload_2
    //   78: aload_1
    //   79: iconst_5
    //   80: invokeinterface 205 2 0
    //   85: invokevirtual 207	cn/jpush/android/data/h:a	(Ljava/lang/String;)V
    //   88: aload_2
    //   89: aload_1
    //   90: bipush 6
    //   92: invokeinterface 187 2 0
    //   97: invokevirtual 209	cn/jpush/android/data/h:c	(J)V
    //   100: aload_2
    //   101: aload_1
    //   102: bipush 7
    //   104: invokeinterface 187 2 0
    //   109: invokevirtual 211	cn/jpush/android/data/h:b	(J)V
    //   112: aload_2
    //   113: invokevirtual 212	cn/jpush/android/data/h:toString	()Ljava/lang/String;
    //   116: pop
    //   117: invokestatic 214	cn/jpush/android/util/ac:c	()V
    //   120: goto -102 -> 18
    //   123: astore_3
    //   124: aload_0
    //   125: monitorexit
    //   126: aload_3
    //   127: athrow
    //   128: astore 4
    //   130: aload 4
    //   132: invokevirtual 218	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   135: pop
    //   136: goto -24 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	123	finally
    //   15	18	123	finally
    //   25	33	123	finally
    //   33	112	123	finally
    //   112	120	123	finally
    //   130	136	123	finally
    //   33	112	128	java/lang/Exception
  }

  public final boolean a(boolean paramBoolean)
  {
    if (paramBoolean)
      try
      {
        boolean bool3 = c();
        boolean bool1;
        for (boolean bool2 = bool3; ; bool2 = bool1)
        {
          return bool2;
          bool1 = d();
        }
      }
      finally
      {
      }
  }

  public final boolean b()
  {
    bool = true;
    try
    {
      String str = z[3];
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(z[1], Integer.valueOf(0));
      localContentValues.put(z[0], Integer.valueOf(1));
      localContentValues.put(z[4], Integer.valueOf(0));
      int i = this.d.update(z[2], localContentValues, str, null);
      if (i > 0);
      while (true)
      {
        return bool;
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        localException.printStackTrace();
        bool = false;
      }
    }
    finally
    {
    }
  }

  public final boolean b(long paramLong1, int paramInt1, int paramInt2, int paramInt3, String paramString, long paramLong2, long paramLong3)
  {
    try
    {
      String str = z[12] + paramLong1;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(z[8], Long.valueOf(paramLong1));
      localContentValues.put(z[1], Integer.valueOf(paramInt1));
      localContentValues.put(z[0], Integer.valueOf(paramInt2));
      localContentValues.put(z[4], Integer.valueOf(0));
      localContentValues.put(z[10], paramString);
      localContentValues.put(z[11], Long.valueOf(paramLong2));
      localContentValues.put(z[9], Long.valueOf(paramLong3));
      int i = this.d.update(z[2], localContentValues, str, null);
      if (i > 0);
      for (bool = true; ; bool = false)
        return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localException.printStackTrace();
        boolean bool = false;
      }
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */