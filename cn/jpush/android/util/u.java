package cn.jpush.android.util;

import android.content.Context;
import cn.jpush.android.data.o;
import cn.jpush.android.data.q;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[23];
    int i = 0;
    String str1 = "e\021\006f}s";
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
        i3 = 30;
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
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "u\021\035zA\016";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "x\033\007";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "b\027\036qm";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "z\021\020urI\032\035g";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "u\021\006zjIM,";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "u\021\006zjIN,%";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "e\013\020w{e\r,p{b\037\032xm";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "u\021\006zjIO,'";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "p\037\032x{r!\007{n";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "z\021\024}pI\n\034`z";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "r\037\007q";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "e\013\020w{s\032,`qf";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "o\007\nm3[3^pz";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "z\021\024}pI\030\022}rs\032";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "b\007\003q";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "e\032\030Kwx\032\026l";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\n\032y{";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "6\020\034`>s\006\032gje^I4wx\r\026fj";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "e\021\001`A}\033\n.";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "e\021\001`A}\033\n4$6";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 22;
        continue;
        i3 = 126;
        continue;
        i3 = 115;
        continue;
        i3 = 20;
      }
    }
  }

  private static JSONObject a(q paramq)
  {
    JSONObject localJSONObject1 = new JSONObject();
    try
    {
      localJSONObject1.put(z[2], paramq.b());
      localJSONObject1.put(z[1], paramq.c());
      localJSONObject1.put(z[4], paramq.d());
      localJSONObject1.put(z[0], paramq.e());
      localJSONObject1.put(z[3], paramq.g());
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put(z[6], paramq.h());
      localJSONObject2.put(z[8], paramq.i());
      localJSONObject2.put(z[5], paramq.j());
      localJSONObject1.put(z[7], localJSONObject2);
      return localJSONObject1;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return localJSONObject1;
  }

  public static void a(Context paramContext)
  {
    if (paramContext == null)
      return;
    b(paramContext);
    c(paramContext);
  }

  // ERROR //
  public static void a(Context paramContext, int paramInt1, long paramLong, int paramInt2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 127	cn/jpush/android/util/ac:c	()V
    //   6: aload_0
    //   7: invokestatic 133	cn/jpush/android/util/b:r	(Landroid/content/Context;)Ljava/lang/String;
    //   10: astore 6
    //   12: invokestatic 137	cn/jpush/android/a:h	()Ljava/lang/String;
    //   15: ifnonnull +151 -> 166
    //   18: ldc 139
    //   20: astore 7
    //   22: new 141	java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   29: aload 6
    //   31: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: ldc 148
    //   36: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: iload_1
    //   40: invokevirtual 151	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   43: ldc 148
    //   45: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload 7
    //   50: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc 148
    //   55: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokestatic 152	cn/jpush/android/util/b:d	()Ljava/lang/String;
    //   61: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 8
    //   69: new 141	java/lang/StringBuilder
    //   72: dup
    //   73: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   76: bipush 22
    //   78: aaload
    //   79: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: aload 8
    //   84: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   90: bipush 19
    //   92: aaload
    //   93: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: lload_2
    //   97: invokevirtual 161	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: invokestatic 163	cn/jpush/android/util/ac:b	()V
    //   104: iconst_0
    //   105: istore 10
    //   107: iconst_0
    //   108: istore 11
    //   110: iconst_0
    //   111: istore 12
    //   113: iload 4
    //   115: ifne +24 -> 139
    //   118: lload_2
    //   119: ldc2_w 164
    //   122: lcmp
    //   123: istore 26
    //   125: iconst_0
    //   126: istore 10
    //   128: iload 26
    //   130: ifgt +351 -> 481
    //   133: iconst_1
    //   134: istore 10
    //   136: goto +345 -> 481
    //   139: aload_0
    //   140: invokestatic 170	cn/jpush/android/data/o:a	(Landroid/content/Context;)Lcn/jpush/android/data/o;
    //   143: astore 13
    //   145: aload 13
    //   147: ifnull +15 -> 162
    //   150: aload 13
    //   152: iconst_1
    //   153: invokevirtual 173	cn/jpush/android/data/o:a	(Z)Z
    //   156: ifne +18 -> 174
    //   159: invokestatic 175	cn/jpush/android/util/ac:e	()V
    //   162: ldc 2
    //   164: monitorexit
    //   165: return
    //   166: invokestatic 137	cn/jpush/android/a:h	()Ljava/lang/String;
    //   169: astore 7
    //   171: goto -149 -> 22
    //   174: aload 13
    //   176: aload 8
    //   178: invokevirtual 178	cn/jpush/android/data/o:a	(Ljava/lang/String;)Z
    //   181: ifeq +214 -> 395
    //   184: new 141	java/lang/StringBuilder
    //   187: dup
    //   188: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   191: bipush 21
    //   193: aaload
    //   194: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   197: aload 8
    //   199: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   205: bipush 18
    //   207: aaload
    //   208: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: invokestatic 127	cn/jpush/android/util/ac:c	()V
    //   215: aload 13
    //   217: aload 8
    //   219: invokevirtual 181	cn/jpush/android/data/o:b	(Ljava/lang/String;)Landroid/database/Cursor;
    //   222: astore 22
    //   224: aload 22
    //   226: astore 21
    //   228: aload 21
    //   230: ifnonnull +6 -> 236
    //   233: invokestatic 183	cn/jpush/android/util/ac:d	()V
    //   236: aload 13
    //   238: aload 21
    //   240: invokevirtual 186	cn/jpush/android/data/o:a	(Landroid/database/Cursor;)Lcn/jpush/android/data/q;
    //   243: astore 24
    //   245: aload 24
    //   247: ifnull +106 -> 353
    //   250: aload 13
    //   252: aload 8
    //   254: aload 6
    //   256: aload 7
    //   258: invokestatic 152	cn/jpush/android/util/b:d	()Ljava/lang/String;
    //   261: new 141	java/lang/StringBuilder
    //   264: dup
    //   265: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   268: iload_1
    //   269: invokevirtual 151	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   272: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: iload 4
    //   277: aload 24
    //   279: invokevirtual 189	cn/jpush/android/data/q:f	()I
    //   282: iadd
    //   283: iconst_1
    //   284: aload 24
    //   286: invokevirtual 100	cn/jpush/android/data/q:g	()I
    //   289: iadd
    //   290: iload 10
    //   292: aload 24
    //   294: invokevirtual 106	cn/jpush/android/data/q:h	()I
    //   297: iadd
    //   298: iload 11
    //   300: aload 24
    //   302: invokevirtual 109	cn/jpush/android/data/q:i	()I
    //   305: iadd
    //   306: iload 12
    //   308: aload 24
    //   310: invokevirtual 112	cn/jpush/android/data/q:j	()I
    //   313: iadd
    //   314: iconst_0
    //   315: aload 24
    //   317: invokevirtual 192	cn/jpush/android/data/q:k	()I
    //   320: iadd
    //   321: invokevirtual 195	cn/jpush/android/data/o:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)Z
    //   324: pop
    //   325: aload 21
    //   327: ifnull +10 -> 337
    //   330: aload 21
    //   332: invokeinterface 200 1 0
    //   337: aload 13
    //   339: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   342: goto -180 -> 162
    //   345: astore 5
    //   347: ldc 2
    //   349: monitorexit
    //   350: aload 5
    //   352: athrow
    //   353: invokestatic 183	cn/jpush/android/util/ac:d	()V
    //   356: goto -31 -> 325
    //   359: astore 23
    //   361: aload 21
    //   363: astore 19
    //   365: aload 19
    //   367: ifnull -30 -> 337
    //   370: aload 19
    //   372: invokeinterface 200 1 0
    //   377: goto -40 -> 337
    //   380: aload 21
    //   382: ifnull +10 -> 392
    //   385: aload 21
    //   387: invokeinterface 200 1 0
    //   392: aload 20
    //   394: athrow
    //   395: new 141	java/lang/StringBuilder
    //   398: dup
    //   399: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   402: bipush 21
    //   404: aaload
    //   405: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   408: aload 8
    //   410: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   416: bipush 20
    //   418: aaload
    //   419: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: pop
    //   423: invokestatic 127	cn/jpush/android/util/ac:c	()V
    //   426: aload 13
    //   428: aload 8
    //   430: aload 6
    //   432: aload 7
    //   434: invokestatic 152	cn/jpush/android/util/b:d	()Ljava/lang/String;
    //   437: new 141	java/lang/StringBuilder
    //   440: dup
    //   441: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   444: iload_1
    //   445: invokevirtual 151	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   448: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   451: iload 4
    //   453: iconst_1
    //   454: iload 10
    //   456: iload 11
    //   458: iload 12
    //   460: iconst_0
    //   461: invokevirtual 205	cn/jpush/android/data/o:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)J
    //   464: pop2
    //   465: goto -128 -> 337
    //   468: astore 20
    //   470: goto -90 -> 380
    //   473: astore 18
    //   475: aconst_null
    //   476: astore 19
    //   478: goto -113 -> 365
    //   481: lload_2
    //   482: ldc2_w 164
    //   485: lcmp
    //   486: istore 27
    //   488: iconst_0
    //   489: istore 11
    //   491: iload 27
    //   493: ifle +21 -> 514
    //   496: lload_2
    //   497: ldc2_w 206
    //   500: lcmp
    //   501: istore 29
    //   503: iconst_0
    //   504: istore 11
    //   506: iload 29
    //   508: ifgt +6 -> 514
    //   511: iconst_1
    //   512: istore 11
    //   514: lload_2
    //   515: ldc2_w 206
    //   518: lcmp
    //   519: istore 28
    //   521: iconst_0
    //   522: istore 12
    //   524: iload 28
    //   526: ifle -387 -> 139
    //   529: iconst_1
    //   530: istore 12
    //   532: goto -393 -> 139
    //   535: astore 20
    //   537: aconst_null
    //   538: astore 21
    //   540: goto -160 -> 380
    //
    // Exception table:
    //   from	to	target	type
    //   3	18	345	finally
    //   22	104	345	finally
    //   139	145	345	finally
    //   150	162	345	finally
    //   166	171	345	finally
    //   174	215	345	finally
    //   330	337	345	finally
    //   337	342	345	finally
    //   370	377	345	finally
    //   385	392	345	finally
    //   392	395	345	finally
    //   395	465	345	finally
    //   233	236	359	java/lang/Exception
    //   236	245	359	java/lang/Exception
    //   250	325	359	java/lang/Exception
    //   353	356	359	java/lang/Exception
    //   233	236	468	finally
    //   236	245	468	finally
    //   250	325	468	finally
    //   353	356	468	finally
    //   215	224	473	java/lang/Exception
    //   215	224	535	finally
  }

  private static JSONObject b(q paramq)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[2], paramq.b());
      localJSONObject.put(z[1], paramq.c());
      localJSONObject.put(z[4], paramq.d());
      localJSONObject.put(z[0], paramq.e());
      localJSONObject.put(z[3], paramq.g());
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return localJSONObject;
  }

  // ERROR //
  private static void b(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: invokestatic 211	cn/jpush/android/a:y	()Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifne +7 -> 17
    //   13: ldc 2
    //   15: monitorexit
    //   16: return
    //   17: new 76	org/json/JSONObject
    //   20: dup
    //   21: invokespecial 78	org/json/JSONObject:<init>	()V
    //   24: astore 4
    //   26: aload_0
    //   27: invokestatic 170	cn/jpush/android/data/o:a	(Landroid/content/Context;)Lcn/jpush/android/data/o;
    //   30: astore 5
    //   32: aload 4
    //   34: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   37: bipush 17
    //   39: aaload
    //   40: invokestatic 215	cn/jpush/android/a:m	()J
    //   43: invokevirtual 218	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   46: pop
    //   47: aload 4
    //   49: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   52: bipush 15
    //   54: aaload
    //   55: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   58: bipush 16
    //   60: aaload
    //   61: invokevirtual 87	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   64: pop
    //   65: aload 4
    //   67: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   70: bipush 11
    //   72: aaload
    //   73: new 220	java/text/SimpleDateFormat
    //   76: dup
    //   77: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   80: bipush 13
    //   82: aaload
    //   83: invokespecial 221	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   86: new 223	java/util/Date
    //   89: dup
    //   90: invokestatic 225	cn/jpush/android/a:g	()J
    //   93: invokespecial 228	java/util/Date:<init>	(J)V
    //   96: invokevirtual 232	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   99: invokevirtual 87	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   102: pop
    //   103: aload 5
    //   105: iconst_0
    //   106: invokevirtual 173	cn/jpush/android/data/o:a	(Z)Z
    //   109: istore 12
    //   111: aconst_null
    //   112: astore_1
    //   113: iload 12
    //   115: ifne +25 -> 140
    //   118: invokestatic 175	cn/jpush/android/util/ac:e	()V
    //   121: aload 5
    //   123: ifnull -110 -> 13
    //   126: aload 5
    //   128: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   131: goto -118 -> 13
    //   134: astore_2
    //   135: ldc 2
    //   137: monitorexit
    //   138: aload_2
    //   139: athrow
    //   140: aload 4
    //   142: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   145: bipush 10
    //   147: aaload
    //   148: aload 5
    //   150: iconst_1
    //   151: invokevirtual 235	cn/jpush/android/data/o:b	(Z)I
    //   154: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   157: pop
    //   158: aload 4
    //   160: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   163: bipush 14
    //   165: aaload
    //   166: aload 5
    //   168: iconst_0
    //   169: invokevirtual 235	cn/jpush/android/data/o:b	(Z)I
    //   172: invokevirtual 103	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   175: pop
    //   176: new 237	org/json/JSONArray
    //   179: dup
    //   180: invokespecial 238	org/json/JSONArray:<init>	()V
    //   183: astore 15
    //   185: aload 5
    //   187: invokevirtual 241	cn/jpush/android/data/o:c	()Landroid/database/Cursor;
    //   190: astore 16
    //   192: aload 16
    //   194: ifnull +48 -> 242
    //   197: aload 5
    //   199: aload 16
    //   201: invokevirtual 186	cn/jpush/android/data/o:a	(Landroid/database/Cursor;)Lcn/jpush/android/data/q;
    //   204: astore 22
    //   206: aload 22
    //   208: ifnull +14 -> 222
    //   211: aload 22
    //   213: invokevirtual 243	cn/jpush/android/data/q:a	()Ljava/lang/String;
    //   216: invokestatic 246	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   219: ifeq +146 -> 365
    //   222: invokestatic 163	cn/jpush/android/util/ac:b	()V
    //   225: aload 16
    //   227: invokeinterface 249 1 0
    //   232: ifne -35 -> 197
    //   235: aload 16
    //   237: invokeinterface 200 1 0
    //   242: aload 4
    //   244: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   247: bipush 9
    //   249: aaload
    //   250: aload 15
    //   252: invokevirtual 87	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   255: pop
    //   256: new 237	org/json/JSONArray
    //   259: dup
    //   260: invokespecial 238	org/json/JSONArray:<init>	()V
    //   263: astore 18
    //   265: aload 5
    //   267: invokevirtual 251	cn/jpush/android/data/o:d	()Landroid/database/Cursor;
    //   270: astore_1
    //   271: aload_1
    //   272: ifnull +45 -> 317
    //   275: aload 5
    //   277: aload_1
    //   278: invokevirtual 186	cn/jpush/android/data/o:a	(Landroid/database/Cursor;)Lcn/jpush/android/data/q;
    //   281: astore 20
    //   283: aload 20
    //   285: ifnull +14 -> 299
    //   288: aload 20
    //   290: invokevirtual 243	cn/jpush/android/data/q:a	()Ljava/lang/String;
    //   293: invokestatic 246	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   296: ifeq +119 -> 415
    //   299: invokestatic 163	cn/jpush/android/util/ac:b	()V
    //   302: aload_1
    //   303: invokeinterface 249 1 0
    //   308: ifne -33 -> 275
    //   311: aload_1
    //   312: invokeinterface 200 1 0
    //   317: aload 4
    //   319: getstatic 70	cn/jpush/android/util/u:z	[Ljava/lang/String;
    //   322: bipush 12
    //   324: aaload
    //   325: aload 18
    //   327: invokevirtual 87	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   330: pop
    //   331: aload 5
    //   333: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   336: aload_0
    //   337: aload 4
    //   339: invokestatic 256	cn/jpush/android/util/ah:a	(Landroid/content/Context;Lorg/json/JSONObject;)V
    //   342: aload_1
    //   343: ifnull +9 -> 352
    //   346: aload_1
    //   347: invokeinterface 200 1 0
    //   352: aload 5
    //   354: ifnull -341 -> 13
    //   357: aload 5
    //   359: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   362: goto -349 -> 13
    //   365: aload 15
    //   367: aload 22
    //   369: invokestatic 258	cn/jpush/android/util/u:b	(Lcn/jpush/android/data/q;)Lorg/json/JSONObject;
    //   372: invokevirtual 261	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   375: pop
    //   376: goto -151 -> 225
    //   379: astore 8
    //   381: aload 16
    //   383: astore_1
    //   384: invokestatic 175	cn/jpush/android/util/ac:e	()V
    //   387: aload 8
    //   389: invokevirtual 115	org/json/JSONException:printStackTrace	()V
    //   392: aload_1
    //   393: ifnull +9 -> 402
    //   396: aload_1
    //   397: invokeinterface 200 1 0
    //   402: aload 5
    //   404: ifnull -391 -> 13
    //   407: aload 5
    //   409: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   412: goto -399 -> 13
    //   415: aload 18
    //   417: aload 20
    //   419: invokestatic 263	cn/jpush/android/util/u:a	(Lcn/jpush/android/data/q;)Lorg/json/JSONObject;
    //   422: invokevirtual 261	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   425: pop
    //   426: goto -124 -> 302
    //   429: astore 8
    //   431: goto -47 -> 384
    //   434: astore 7
    //   436: invokestatic 175	cn/jpush/android/util/ac:e	()V
    //   439: aload 7
    //   441: invokevirtual 264	java/lang/Exception:printStackTrace	()V
    //   444: aload_1
    //   445: ifnull +9 -> 454
    //   448: aload_1
    //   449: invokeinterface 200 1 0
    //   454: aload 5
    //   456: ifnull -443 -> 13
    //   459: aload 5
    //   461: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   464: goto -451 -> 13
    //   467: aload_1
    //   468: ifnull +9 -> 477
    //   471: aload_1
    //   472: invokeinterface 200 1 0
    //   477: aload 5
    //   479: ifnull +8 -> 487
    //   482: aload 5
    //   484: invokevirtual 202	cn/jpush/android/data/o:a	()V
    //   487: aload 6
    //   489: athrow
    //   490: astore 6
    //   492: aload 16
    //   494: astore_1
    //   495: goto -28 -> 467
    //   498: astore 7
    //   500: aload 16
    //   502: astore_1
    //   503: goto -67 -> 436
    //   506: astore 6
    //   508: goto -41 -> 467
    //
    // Exception table:
    //   from	to	target	type
    //   5	9	134	finally
    //   17	32	134	finally
    //   126	131	134	finally
    //   346	352	134	finally
    //   357	362	134	finally
    //   396	402	134	finally
    //   407	412	134	finally
    //   448	454	134	finally
    //   459	464	134	finally
    //   471	477	134	finally
    //   482	487	134	finally
    //   487	490	134	finally
    //   197	206	379	org/json/JSONException
    //   211	222	379	org/json/JSONException
    //   222	225	379	org/json/JSONException
    //   225	242	379	org/json/JSONException
    //   242	256	379	org/json/JSONException
    //   365	376	379	org/json/JSONException
    //   32	111	429	org/json/JSONException
    //   118	121	429	org/json/JSONException
    //   140	192	429	org/json/JSONException
    //   256	271	429	org/json/JSONException
    //   275	283	429	org/json/JSONException
    //   288	299	429	org/json/JSONException
    //   299	302	429	org/json/JSONException
    //   302	317	429	org/json/JSONException
    //   317	342	429	org/json/JSONException
    //   415	426	429	org/json/JSONException
    //   32	111	434	java/lang/Exception
    //   118	121	434	java/lang/Exception
    //   140	192	434	java/lang/Exception
    //   256	271	434	java/lang/Exception
    //   275	283	434	java/lang/Exception
    //   288	299	434	java/lang/Exception
    //   299	302	434	java/lang/Exception
    //   302	317	434	java/lang/Exception
    //   317	342	434	java/lang/Exception
    //   415	426	434	java/lang/Exception
    //   197	206	490	finally
    //   211	222	490	finally
    //   222	225	490	finally
    //   225	242	490	finally
    //   242	256	490	finally
    //   365	376	490	finally
    //   197	206	498	java/lang/Exception
    //   211	222	498	java/lang/Exception
    //   222	225	498	java/lang/Exception
    //   225	242	498	java/lang/Exception
    //   242	256	498	java/lang/Exception
    //   365	376	498	java/lang/Exception
    //   32	111	506	finally
    //   118	121	506	finally
    //   140	192	506	finally
    //   256	271	506	finally
    //   275	283	506	finally
    //   288	299	506	finally
    //   299	302	506	finally
    //   302	317	506	finally
    //   317	342	506	finally
    //   384	392	506	finally
    //   415	426	506	finally
    //   436	444	506	finally
  }

  private static void c(Context paramContext)
  {
    try
    {
      o localo = o.a(paramContext);
      if (localo != null)
      {
        localo.a(true);
        localo.b();
        localo.a();
      }
      return;
    }
    finally
    {
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */