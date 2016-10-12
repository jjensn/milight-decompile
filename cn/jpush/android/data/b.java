package cn.jpush.android.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import cn.jpush.android.util.ac;

public final class b extends SQLiteOpenHelper
{
  public static final String[] a;
  public static final String[] b = localObject2;
  private static b c;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[13];
    int i = 0;
    String str1 = "WL s\003V";
    int j = -1;
    Object localObject2 = localObject1;
    label36: label52: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int k = localObject3.length;
      int m = 0;
      Object localObject4;
      int n;
      int i1;
      Object localObject5;
      int i2;
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
          i3 = 112;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
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
          str1 = "OO+E\031F";
          localObject1 = localObject2;
          j = 0;
          break;
        case 0:
          localObject1[i] = str2;
          i = 2;
          str1 = "CL<E\031F\001s";
          j = 1;
          localObject1 = localObject2;
          break;
        case 1:
          localObject1[i] = str2;
          i = 3;
          str1 = "MJ)h\002KX)E\031F";
          j = 2;
          localObject1 = localObject2;
          break;
        case 2:
          localObject1[i] = str2;
          i = 4;
          str1 = "CL<E\031F";
          j = 3;
          localObject1 = localObject2;
          break;
        case 3:
          localObject1[i] = str2;
          i = 5;
          str1 = "O]%t/KX";
          j = 4;
          localObject1 = localObject2;
          break;
        case 4:
          localObject1[i] = str2;
          i = 6;
          str1 = "QY>l\031AYb~\022";
          j = 5;
          localObject1 = localObject2;
          break;
        case 5:
          localObject1[i] = str2;
          i = 7;
          str1 = "FN#jPV].v\025\002I<v\031QH";
          j = 6;
          localObject1 = localObject2;
          break;
        case 6:
          localObject1[i] = str2;
          i = 8;
          str1 = "FN#jPV].v\025\002X#m\036NU?n";
          j = 7;
          localObject1 = localObject2;
          break;
        case 7:
          localObject1[i] = str2;
          i = 9;
          str1 = "vT):\037NX\032\002QU#tPKOv:";
          j = 8;
          localObject1 = localObject2;
          break;
        case 8:
          localObject1[i] = str2;
          i = 10;
          str1 = "\002H$PLY;L\025PO%u\036\002U?:J\002";
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
          str1 = "";
          j = 11;
          localObject1 = localObject2;
          break;
        case 11:
          localObject1[i] = str2;
          z = localObject2;
          localObject1 = new String[6];
          str1 = "}U(";
          j = 12;
          localObject2 = localObject1;
          i = 0;
          break;
          i3 = 34;
          continue;
          i3 = 60;
          continue;
          i3 = 76;
          continue;
          i3 = 26;
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        }
      }
      localObject1[i] = str2;
      localObject2[1] = z[1];
      i = 2;
      str1 = "PY<\021Vc\"o\035";
      j = 13;
      localObject1 = localObject2;
      continue;
      localObject1[i] = str2;
      i = 3;
      str1 = "QH-h\004}L#i";
      j = 14;
      localObject1 = localObject2;
      continue;
      localObject1[i] = str2;
      i = 4;
      str1 = "";
      j = 15;
      localObject1 = localObject2;
      continue;
      localObject1[i] = str2;
      i = 5;
      str1 = "AS\"n\025LH";
      j = 16;
      localObject1 = localObject2;
      continue;
      localObject1[i] = str2;
      a = localObject2;
      localObject1 = new String[4];
      str1 = "}U(";
      j = 17;
      localObject2 = localObject1;
      i = 0;
    }
    localObject1[i] = str2;
    localObject2[1] = z[1];
    localObject2[2] = z[4];
    localObject2[3] = z[5];
  }

  private b(Context paramContext)
  {
    super(paramContext, z[6], null, 3);
  }

  private static b a(Context paramContext)
  {
    if (c == null)
      c = new b(paramContext);
    return c;
  }

  // ERROR //
  public static String a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 82	cn/jpush/android/data/b:a	(Landroid/content/Context;)Lcn/jpush/android/data/b;
    //   7: invokevirtual 86	cn/jpush/android/data/b:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 7
    //   12: aload 7
    //   14: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   17: iconst_0
    //   18: aaload
    //   19: getstatic 68	cn/jpush/android/data/b:b	[Ljava/lang/String;
    //   22: aconst_null
    //   23: aconst_null
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 92	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore 8
    //   32: aload 8
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +274 -> 310
    //   39: aload_3
    //   40: invokeinterface 98 1 0
    //   45: iflt +265 -> 310
    //   48: aload_3
    //   49: invokeinterface 102 1 0
    //   54: ifeq +256 -> 310
    //   57: aload_3
    //   58: aload_3
    //   59: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   62: iconst_4
    //   63: aaload
    //   64: invokeinterface 106 2 0
    //   69: invokeinterface 110 2 0
    //   74: astore 17
    //   76: aload_3
    //   77: aload_3
    //   78: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   81: iconst_1
    //   82: aaload
    //   83: invokeinterface 106 2 0
    //   88: invokeinterface 110 2 0
    //   93: astore 18
    //   95: aload_3
    //   96: aload_3
    //   97: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   100: iconst_5
    //   101: aaload
    //   102: invokeinterface 106 2 0
    //   107: invokeinterface 110 2 0
    //   112: astore 19
    //   114: aload_3
    //   115: aload_3
    //   116: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   119: iconst_3
    //   120: aaload
    //   121: invokeinterface 106 2 0
    //   126: invokeinterface 110 2 0
    //   131: astore 20
    //   133: aload_1
    //   134: aload 17
    //   136: invokevirtual 114	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   139: istore 21
    //   141: iload 21
    //   143: ifeq -95 -> 48
    //   146: aload 18
    //   148: astore 12
    //   150: aload 19
    //   152: astore 11
    //   154: aload 17
    //   156: astore 10
    //   158: aload 20
    //   160: astore 9
    //   162: aload 7
    //   164: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   167: iconst_0
    //   168: aaload
    //   169: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   172: iconst_2
    //   173: aaload
    //   174: iconst_1
    //   175: anewarray 14	java/lang/String
    //   178: dup
    //   179: iconst_0
    //   180: aload 10
    //   182: aastore
    //   183: invokevirtual 118	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   186: pop
    //   187: new 120	java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial 122	java/lang/StringBuilder:<init>	()V
    //   194: aload 12
    //   196: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: ldc 128
    //   201: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: aload 11
    //   206: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: ldc 128
    //   211: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: aload 9
    //   216: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: astore 15
    //   224: aload 15
    //   226: astore 6
    //   228: aload_3
    //   229: ifnull +9 -> 238
    //   232: aload_3
    //   233: invokeinterface 134 1 0
    //   238: ldc 2
    //   240: monitorexit
    //   241: aload 6
    //   243: areturn
    //   244: astore 5
    //   246: aconst_null
    //   247: astore_3
    //   248: ldc 136
    //   250: astore 6
    //   252: aload_3
    //   253: ifnull -15 -> 238
    //   256: aload_3
    //   257: invokeinterface 134 1 0
    //   262: goto -24 -> 238
    //   265: astore 4
    //   267: ldc 2
    //   269: monitorexit
    //   270: aload 4
    //   272: athrow
    //   273: astore_2
    //   274: aconst_null
    //   275: astore_3
    //   276: aload_3
    //   277: ifnull +9 -> 286
    //   280: aload_3
    //   281: invokeinterface 134 1 0
    //   286: aload_2
    //   287: athrow
    //   288: astore_2
    //   289: goto -13 -> 276
    //   292: astore 16
    //   294: ldc 136
    //   296: astore 6
    //   298: goto -46 -> 252
    //   301: astore 13
    //   303: aload 12
    //   305: astore 6
    //   307: goto -55 -> 252
    //   310: ldc 136
    //   312: astore 9
    //   314: ldc 136
    //   316: astore 10
    //   318: ldc 136
    //   320: astore 11
    //   322: ldc 136
    //   324: astore 12
    //   326: goto -164 -> 162
    //
    // Exception table:
    //   from	to	target	type
    //   3	32	244	java/lang/Exception
    //   232	238	265	finally
    //   256	262	265	finally
    //   280	286	265	finally
    //   286	288	265	finally
    //   3	32	273	finally
    //   39	48	288	finally
    //   48	141	288	finally
    //   162	224	288	finally
    //   39	48	292	java/lang/Exception
    //   48	141	292	java/lang/Exception
    //   162	224	301	java/lang/Exception
  }

  public static void a(Context paramContext, c paramc, String paramString1, String paramString2)
  {
    try
    {
      a(paramContext, paramc.c, paramc.d, paramString1, paramString2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 82	cn/jpush/android/data/b:a	(Landroid/content/Context;)Lcn/jpush/android/data/b;
    //   7: invokevirtual 86	cn/jpush/android/data/b:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 10
    //   12: aload 10
    //   14: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   17: iconst_0
    //   18: aaload
    //   19: getstatic 68	cn/jpush/android/data/b:b	[Ljava/lang/String;
    //   22: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   25: iconst_2
    //   26: aaload
    //   27: iconst_1
    //   28: anewarray 14	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: aload_3
    //   34: aastore
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: invokevirtual 92	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   41: astore 11
    //   43: aload 11
    //   45: astore 9
    //   47: aload 9
    //   49: ifnull +13 -> 62
    //   52: aload 9
    //   54: invokeinterface 98 1 0
    //   59: ifgt +87 -> 146
    //   62: new 150	android/content/ContentValues
    //   65: dup
    //   66: invokespecial 151	android/content/ContentValues:<init>	()V
    //   69: astore 12
    //   71: aload 12
    //   73: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   76: iconst_1
    //   77: aaload
    //   78: aload_1
    //   79: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: aload 12
    //   84: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   87: iconst_4
    //   88: aaload
    //   89: aload_3
    //   90: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   93: aload 12
    //   95: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   98: iconst_5
    //   99: aaload
    //   100: aload 4
    //   102: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: aload 12
    //   107: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   110: iconst_3
    //   111: aaload
    //   112: aload_2
    //   113: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: aload 10
    //   118: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   121: iconst_0
    //   122: aaload
    //   123: aconst_null
    //   124: aload 12
    //   126: invokevirtual 159	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   129: pop2
    //   130: aload 9
    //   132: ifnull +10 -> 142
    //   135: aload 9
    //   137: invokeinterface 134 1 0
    //   142: ldc 2
    //   144: monitorexit
    //   145: return
    //   146: aload 9
    //   148: invokeinterface 162 1 0
    //   153: pop
    //   154: new 150	android/content/ContentValues
    //   157: dup
    //   158: invokespecial 151	android/content/ContentValues:<init>	()V
    //   161: astore 17
    //   163: aload 17
    //   165: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   168: iconst_1
    //   169: aaload
    //   170: aload_1
    //   171: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload 17
    //   176: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   179: iconst_5
    //   180: aaload
    //   181: aload 4
    //   183: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload 17
    //   188: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   191: iconst_3
    //   192: aaload
    //   193: aload_2
    //   194: invokevirtual 155	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   197: aload 10
    //   199: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   202: iconst_0
    //   203: aaload
    //   204: aload 17
    //   206: getstatic 54	cn/jpush/android/data/b:z	[Ljava/lang/String;
    //   209: iconst_2
    //   210: aaload
    //   211: iconst_1
    //   212: anewarray 14	java/lang/String
    //   215: dup
    //   216: iconst_0
    //   217: aload_3
    //   218: aastore
    //   219: invokevirtual 166	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   222: pop
    //   223: goto -93 -> 130
    //   226: astore 13
    //   228: aload 9
    //   230: astore 6
    //   232: aload 6
    //   234: ifnull -92 -> 142
    //   237: aload 6
    //   239: invokeinterface 134 1 0
    //   244: goto -102 -> 142
    //   247: astore 7
    //   249: ldc 2
    //   251: monitorexit
    //   252: aload 7
    //   254: athrow
    //   255: astore 8
    //   257: aconst_null
    //   258: astore 9
    //   260: aload 9
    //   262: ifnull +10 -> 272
    //   265: aload 9
    //   267: invokeinterface 134 1 0
    //   272: aload 8
    //   274: athrow
    //   275: astore 8
    //   277: goto -17 -> 260
    //   280: astore 5
    //   282: aconst_null
    //   283: astore 6
    //   285: goto -53 -> 232
    //
    // Exception table:
    //   from	to	target	type
    //   52	62	226	java/lang/Exception
    //   62	130	226	java/lang/Exception
    //   146	223	226	java/lang/Exception
    //   135	142	247	finally
    //   237	244	247	finally
    //   265	272	247	finally
    //   272	275	247	finally
    //   3	43	255	finally
    //   52	62	275	finally
    //   62	130	275	finally
    //   146	223	275	finally
    //   3	43	280	java/lang/Exception
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    ac.b();
    paramSQLiteDatabase.execSQL(z[12]);
    paramSQLiteDatabase.execSQL(z[11]);
  }

  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    new StringBuilder(z[9]).append(paramInt1).append(z[10]).append(paramInt2);
    ac.b();
    paramSQLiteDatabase.execSQL(z[8]);
    paramSQLiteDatabase.execSQL(z[7]);
    onCreate(paramSQLiteDatabase);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    new StringBuilder(z[9]).append(paramInt1).append(z[10]).append(paramInt2);
    ac.b();
    paramSQLiteDatabase.execSQL(z[8]);
    paramSQLiteDatabase.execSQL(z[7]);
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.data.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */