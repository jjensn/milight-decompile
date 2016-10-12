package cn.jpush.android.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import cn.jpush.android.util.ac;

public final class o
{
  public static final String[] a = localObject2;
  private static o e;
  private static Object f = new Object();
  private static final String[] z;
  private Context b;
  private p c;
  private SQLiteDatabase d;

  static
  {
    Object localObject1 = new String[21];
    int i = 0;
    String str1 = "\036>\002K)+=\003Y5\035=\003Q\"\007";
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
        i3 = 65;
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
        str1 = "\007:(K.\006:(S$\rsP";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\033>\022Va\033>\022V\026\006'\003Y#\030+3Y5\025,\026K$T(\026Q-T+M";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\020+\033]5\021n\021J.\031n\035H4\007&(K5\025:\036K5\035-\004";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "";
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
        str1 = "]n\021J.\031n\035H4\007&(K5\025:\036K5\035-\004";
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
        str1 = "";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\007:(^ \035\"\022\\";
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
        str1 = "\007:([.\001 \003gp";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\007:([.\032 (Q1";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\007:([.\001 \003gpD";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\007:(T.\027/\033g%\032=";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\007:([.\001 \003gp+}";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\007:([.\001 \003gr+G";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\007:(K.\006:(S$\r";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\007:(K.\001<\024]";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        z = localObject2;
        localObject1 = new String[12];
        localObject1[0] = z[18];
        i = 1;
        str1 = "+'\023";
        j = 20;
        localObject2 = localObject1;
        break;
        i3 = 116;
        continue;
        i3 = 78;
        continue;
        i3 = 119;
        continue;
        i3 = 56;
      case 20:
      }
    }
    localObject1[i] = str2;
    localObject2[2] = z[20];
    localObject2[3] = z[13];
    localObject2[4] = z[15];
    localObject2[5] = z[19];
    localObject2[6] = z[9];
    localObject2[7] = z[7];
    localObject2[8] = z[12];
    localObject2[9] = z[16];
    localObject2[10] = z[17];
    localObject2[11] = z[14];
  }

  private o(Context paramContext)
  {
    this.b = paramContext;
    this.c = new p(paramContext);
  }

  public static o a(Context paramContext)
  {
    synchronized (f)
    {
      if (e == null)
        e = new o(paramContext);
      return e;
    }
  }

  private boolean e()
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
        new StringBuilder(z[2]).append(localException.getMessage());
        ac.e();
        boolean bool = false;
      }
    }
    finally
    {
    }
  }

  private boolean f()
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
        new StringBuilder(z[4]).append(localException.getMessage());
        ac.e();
        boolean bool = false;
      }
    }
    finally
    {
    }
  }

  public final long a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    l1 = 0L;
    try
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(z[18], paramString1);
      localContentValues.put(z[20], paramString2);
      localContentValues.put(z[13], paramString3);
      localContentValues.put(z[15], paramString4);
      localContentValues.put(z[19], paramString5);
      localContentValues.put(z[9], Integer.valueOf(paramInt1));
      localContentValues.put(z[7], Integer.valueOf(1));
      localContentValues.put(z[12], Integer.valueOf(paramInt3));
      localContentValues.put(z[16], Integer.valueOf(paramInt4));
      localContentValues.put(z[17], Integer.valueOf(paramInt5));
      localContentValues.put(z[14], Integer.valueOf(0));
      try
      {
        long l2 = this.d.insert(z[0], null, localContentValues);
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
  public final q a(android.database.Cursor paramCursor)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_1
    //   7: invokeinterface 159 1 0
    //   12: ifne +12 -> 24
    //   15: invokestatic 161	cn/jpush/android/util/ac:b	()V
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_3
    //   23: areturn
    //   24: new 163	cn/jpush/android/data/q
    //   27: dup
    //   28: invokespecial 164	cn/jpush/android/data/q:<init>	()V
    //   31: astore_3
    //   32: aload_3
    //   33: aload_1
    //   34: iconst_1
    //   35: invokeinterface 168 2 0
    //   40: invokevirtual 170	cn/jpush/android/data/q:a	(Ljava/lang/String;)V
    //   43: aload_3
    //   44: aload_1
    //   45: iconst_2
    //   46: invokeinterface 168 2 0
    //   51: invokevirtual 172	cn/jpush/android/data/q:b	(Ljava/lang/String;)V
    //   54: aload_3
    //   55: aload_1
    //   56: iconst_3
    //   57: invokeinterface 168 2 0
    //   62: invokevirtual 174	cn/jpush/android/data/q:c	(Ljava/lang/String;)V
    //   65: aload_3
    //   66: aload_1
    //   67: iconst_4
    //   68: invokeinterface 168 2 0
    //   73: invokevirtual 176	cn/jpush/android/data/q:d	(Ljava/lang/String;)V
    //   76: aload_3
    //   77: aload_1
    //   78: iconst_5
    //   79: invokeinterface 168 2 0
    //   84: invokevirtual 178	cn/jpush/android/data/q:e	(Ljava/lang/String;)V
    //   87: aload_3
    //   88: aload_1
    //   89: bipush 6
    //   91: invokeinterface 182 2 0
    //   96: invokevirtual 185	cn/jpush/android/data/q:a	(I)V
    //   99: aload_3
    //   100: aload_1
    //   101: bipush 7
    //   103: invokeinterface 182 2 0
    //   108: invokevirtual 187	cn/jpush/android/data/q:b	(I)V
    //   111: aload_3
    //   112: aload_1
    //   113: bipush 8
    //   115: invokeinterface 182 2 0
    //   120: invokevirtual 189	cn/jpush/android/data/q:c	(I)V
    //   123: aload_3
    //   124: aload_1
    //   125: bipush 9
    //   127: invokeinterface 182 2 0
    //   132: invokevirtual 191	cn/jpush/android/data/q:d	(I)V
    //   135: aload_3
    //   136: aload_1
    //   137: bipush 10
    //   139: invokeinterface 182 2 0
    //   144: invokevirtual 193	cn/jpush/android/data/q:e	(I)V
    //   147: aload_3
    //   148: aload_1
    //   149: bipush 11
    //   151: invokeinterface 182 2 0
    //   156: invokevirtual 195	cn/jpush/android/data/q:f	(I)V
    //   159: aload_3
    //   160: invokevirtual 198	cn/jpush/android/data/q:toString	()Ljava/lang/String;
    //   163: pop
    //   164: invokestatic 200	cn/jpush/android/util/ac:c	()V
    //   167: goto -147 -> 20
    //   170: astore_2
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_2
    //   174: athrow
    //   175: astore 4
    //   177: aload 4
    //   179: invokevirtual 152	java/lang/Exception:printStackTrace	()V
    //   182: goto -23 -> 159
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	170	finally
    //   15	18	170	finally
    //   24	32	170	finally
    //   32	159	170	finally
    //   159	167	170	finally
    //   177	182	170	finally
    //   32	159	175	java/lang/Exception
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
  public final boolean a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: new 109	java/lang/StringBuilder
    //   7: dup
    //   8: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   11: iconst_5
    //   12: aaload
    //   13: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: aload_1
    //   17: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: ldc 206
    //   22: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: astore 4
    //   30: aload_0
    //   31: getfield 107	cn/jpush/android/data/o:d	Landroid/database/sqlite/SQLiteDatabase;
    //   34: aload 4
    //   36: aconst_null
    //   37: invokevirtual 211	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   40: astore_2
    //   41: iconst_0
    //   42: istore 7
    //   44: aload_2
    //   45: ifnull +27 -> 72
    //   48: aload_2
    //   49: invokeinterface 214 1 0
    //   54: pop
    //   55: aload_2
    //   56: iconst_0
    //   57: invokeinterface 182 2 0
    //   62: istore 9
    //   64: iconst_0
    //   65: istore 7
    //   67: iload 9
    //   69: ifne +18 -> 87
    //   72: aload_2
    //   73: ifnull +9 -> 82
    //   76: aload_2
    //   77: invokeinterface 215 1 0
    //   82: aload_0
    //   83: monitorexit
    //   84: iload 7
    //   86: ireturn
    //   87: iconst_1
    //   88: istore 7
    //   90: goto -18 -> 72
    //   93: astore 6
    //   95: aload 6
    //   97: invokevirtual 152	java/lang/Exception:printStackTrace	()V
    //   100: iconst_0
    //   101: istore 7
    //   103: aload_2
    //   104: ifnull -22 -> 82
    //   107: aload_2
    //   108: invokeinterface 215 1 0
    //   113: iconst_0
    //   114: istore 7
    //   116: goto -34 -> 82
    //   119: astore_3
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_3
    //   123: athrow
    //   124: astore 5
    //   126: aload_2
    //   127: ifnull +9 -> 136
    //   130: aload_2
    //   131: invokeinterface 215 1 0
    //   136: aload 5
    //   138: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   30	41	93	java/lang/Exception
    //   48	64	93	java/lang/Exception
    //   4	30	119	finally
    //   76	82	119	finally
    //   107	113	119	finally
    //   130	136	119	finally
    //   136	139	119	finally
    //   30	41	124	finally
    //   48	64	124	finally
    //   95	100	124	finally
  }

  public final boolean a(boolean paramBoolean)
  {
    if (paramBoolean)
      try
      {
        boolean bool3 = e();
        boolean bool1;
        for (boolean bool2 = bool3; ; bool2 = bool1)
        {
          return bool2;
          bool1 = f();
        }
      }
      finally
      {
      }
  }

  // ERROR //
  public final int b(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   7: bipush 9
    //   9: aaload
    //   10: astore 4
    //   12: iload_1
    //   13: ifeq +11 -> 24
    //   16: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   19: bipush 7
    //   21: aaload
    //   22: astore 4
    //   24: new 109	java/lang/StringBuilder
    //   27: dup
    //   28: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   31: bipush 8
    //   33: aaload
    //   34: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   37: aload 4
    //   39: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   45: bipush 6
    //   47: aaload
    //   48: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore 5
    //   56: aload_0
    //   57: getfield 107	cn/jpush/android/data/o:d	Landroid/database/sqlite/SQLiteDatabase;
    //   60: aload 5
    //   62: aconst_null
    //   63: invokevirtual 211	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   66: astore_2
    //   67: iconst_0
    //   68: istore 8
    //   70: aload_2
    //   71: ifnull +23 -> 94
    //   74: aload_2
    //   75: invokeinterface 214 1 0
    //   80: pop
    //   81: aload_2
    //   82: iconst_0
    //   83: invokeinterface 182 2 0
    //   88: istore 10
    //   90: iload 10
    //   92: istore 8
    //   94: aload_2
    //   95: ifnull +9 -> 104
    //   98: aload_2
    //   99: invokeinterface 215 1 0
    //   104: aload_0
    //   105: monitorexit
    //   106: iload 8
    //   108: ireturn
    //   109: astore 7
    //   111: aload 7
    //   113: invokevirtual 152	java/lang/Exception:printStackTrace	()V
    //   116: iconst_0
    //   117: istore 8
    //   119: aload_2
    //   120: ifnull -16 -> 104
    //   123: aload_2
    //   124: invokeinterface 215 1 0
    //   129: iconst_0
    //   130: istore 8
    //   132: goto -28 -> 104
    //   135: astore_3
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_3
    //   139: athrow
    //   140: astore 6
    //   142: aload_2
    //   143: ifnull +9 -> 152
    //   146: aload_2
    //   147: invokeinterface 215 1 0
    //   152: aload 6
    //   154: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   56	67	109	java/lang/Exception
    //   74	90	109	java/lang/Exception
    //   4	12	135	finally
    //   16	24	135	finally
    //   24	56	135	finally
    //   98	104	135	finally
    //   123	129	135	finally
    //   146	152	135	finally
    //   152	155	135	finally
    //   56	67	140	finally
    //   74	90	140	finally
    //   111	116	140	finally
  }

  // ERROR //
  public final android.database.Cursor b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 109	java/lang/StringBuilder
    //   5: dup
    //   6: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   9: iconst_1
    //   10: aaload
    //   11: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: ldc 206
    //   20: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: astore 6
    //   28: aload_0
    //   29: getfield 107	cn/jpush/android/data/o:d	Landroid/database/sqlite/SQLiteDatabase;
    //   32: iconst_1
    //   33: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   36: iconst_0
    //   37: aaload
    //   38: getstatic 81	cn/jpush/android/data/o:a	[Ljava/lang/String;
    //   41: aload 6
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: invokevirtual 226	android/database/sqlite/SQLiteDatabase:query	(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore 7
    //   53: aload 7
    //   55: astore 5
    //   57: aload 5
    //   59: ifnull +11 -> 70
    //   62: aload 5
    //   64: invokeinterface 214 1 0
    //   69: pop
    //   70: aload_0
    //   71: monitorexit
    //   72: aload 5
    //   74: areturn
    //   75: astore_3
    //   76: aload_3
    //   77: astore 4
    //   79: aconst_null
    //   80: astore 5
    //   82: aload 4
    //   84: invokevirtual 152	java/lang/Exception:printStackTrace	()V
    //   87: goto -17 -> 70
    //   90: astore_2
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_2
    //   94: athrow
    //   95: astore 4
    //   97: goto -15 -> 82
    //
    // Exception table:
    //   from	to	target	type
    //   2	53	75	java/lang/Exception
    //   2	53	90	finally
    //   62	70	90	finally
    //   82	87	90	finally
    //   62	70	95	java/lang/Exception
  }

  public final void b()
  {
    try
    {
      String str = z[3];
      try
      {
        this.d.execSQL(str);
        return;
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

  public final boolean b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    try
    {
      String str = z[1] + paramString1 + "'";
      ContentValues localContentValues = new ContentValues();
      localContentValues.put(z[18], paramString1);
      localContentValues.put(z[20], paramString2);
      localContentValues.put(z[13], paramString3);
      localContentValues.put(z[15], paramString4);
      localContentValues.put(z[19], paramString5);
      localContentValues.put(z[9], Integer.valueOf(paramInt1));
      localContentValues.put(z[7], Integer.valueOf(paramInt2));
      localContentValues.put(z[12], Integer.valueOf(paramInt3));
      localContentValues.put(z[16], Integer.valueOf(paramInt4));
      localContentValues.put(z[17], Integer.valueOf(paramInt5));
      localContentValues.put(z[14], Integer.valueOf(paramInt6));
      try
      {
        int i = this.d.update(z[0], localContentValues, str, null);
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
    }
    finally
    {
    }
  }

  // ERROR //
  public final android.database.Cursor c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   5: bipush 11
    //   7: aaload
    //   8: astore_2
    //   9: aload_0
    //   10: getfield 107	cn/jpush/android/data/o:d	Landroid/database/sqlite/SQLiteDatabase;
    //   13: aload_2
    //   14: aconst_null
    //   15: invokevirtual 211	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   18: astore 6
    //   20: aload 6
    //   22: astore 4
    //   24: aload 4
    //   26: ifnull +11 -> 37
    //   29: aload 4
    //   31: invokeinterface 214 1 0
    //   36: pop
    //   37: aload_0
    //   38: monitorexit
    //   39: aload 4
    //   41: areturn
    //   42: astore_3
    //   43: aconst_null
    //   44: astore 4
    //   46: aload_3
    //   47: astore 5
    //   49: aload 5
    //   51: invokevirtual 152	java/lang/Exception:printStackTrace	()V
    //   54: goto -17 -> 37
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    //   62: astore 5
    //   64: goto -15 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   9	20	42	java/lang/Exception
    //   2	9	57	finally
    //   9	20	57	finally
    //   29	37	57	finally
    //   49	54	57	finally
    //   29	37	62	java/lang/Exception
  }

  // ERROR //
  public final android.database.Cursor d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 77	cn/jpush/android/data/o:z	[Ljava/lang/String;
    //   5: bipush 10
    //   7: aaload
    //   8: astore_2
    //   9: aload_0
    //   10: getfield 107	cn/jpush/android/data/o:d	Landroid/database/sqlite/SQLiteDatabase;
    //   13: aload_2
    //   14: aconst_null
    //   15: invokevirtual 211	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   18: astore 6
    //   20: aload 6
    //   22: astore 4
    //   24: aload 4
    //   26: ifnull +11 -> 37
    //   29: aload 4
    //   31: invokeinterface 214 1 0
    //   36: pop
    //   37: aload_0
    //   38: monitorexit
    //   39: aload 4
    //   41: areturn
    //   42: astore_3
    //   43: aconst_null
    //   44: astore 4
    //   46: aload_3
    //   47: astore 5
    //   49: aload 5
    //   51: invokevirtual 152	java/lang/Exception:printStackTrace	()V
    //   54: goto -17 -> 37
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    //   62: astore 5
    //   64: goto -15 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   9	20	42	java/lang/Exception
    //   2	9	57	finally
    //   9	20	57	finally
    //   29	37	57	finally
    //   49	54	57	finally
    //   29	37	62	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */