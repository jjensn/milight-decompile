package cn.jpush.android.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;

public final class s
{
  public static boolean a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[50];
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
        i3 = 101;
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
        str1 = "";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "==\006\t-\020%\002\034\027";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\024*\006\020\n\033s\032\r\021\005\016\027\rEXi";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "4*\021\034\025\001d7\027\006\032-\033\027\002";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\034-\027\027\021\034=\013";
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
        str1 = "Yi\007\013\tO";
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
        str1 = "\035=\006\tK\036,\027\t$\031 \004\034";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "%;\035\r\n\026&\036<\035\026,\002\r\f\032'H";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "4<\006\021\n\007 \b\030\021\034&\034";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\0223\033\t";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "7(\001\020\006U";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "\0249\002\025\f\026(\006\020\n\033f\030\030\026\032'";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "%\006!-";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "4*\021\034\025\001";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "\006=\023\r\020\006i\021\026\001\020s";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "6!\023\013\026\020=";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = " \0354T]";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "Iu\024\030\f\031,\026G[";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "Iu\027\013\027\032;LG";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = "\033&\006Y\004\026*\027\t\021\024+\036\034_AyDYHU";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "\024*\006\020\n\033s\032\r\021\005\032\033\024\025\031,5\034\021UdR";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = "";
        j = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i] = str2;
        i = 38;
        str1 = "";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = "\026&\034\037\t\034*\006CQEpRTE";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = "Dy\\IKEgCNW";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "\026$\005\030\025";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = "F.\005\030\025";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "";
        j = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[i] = str2;
        i = 46;
        str1 = "";
        j = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[i] = str2;
        i = 47;
        str1 = " :\027\013H4.\027\027\021";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "?\031'*-X\03262";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "4*\021\034\025\001d1\021\004\007:\027\r";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        z = localObject2;
        a = false;
        return;
        i3 = 117;
        continue;
        i3 = 73;
        continue;
        i3 = 114;
        continue;
        i3 = 121;
      }
    }
  }

  // ERROR //
  public static int a(Context paramContext, org.json.JSONObject paramJSONObject, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_2
    //   1: invokestatic 142	cn/jpush/android/util/ah:a	(I)Ljava/lang/String;
    //   4: astore_3
    //   5: new 144	java/lang/StringBuilder
    //   8: dup
    //   9: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   12: bipush 28
    //   14: aaload
    //   15: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: aload_3
    //   19: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: invokestatic 155	cn/jpush/android/util/ac:a	()V
    //   26: invokestatic 155	cn/jpush/android/util/ac:a	()V
    //   29: aload_3
    //   30: invokestatic 160	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   33: ifeq +13 -> 46
    //   36: iconst_0
    //   37: istore 5
    //   39: iload 5
    //   41: ifne +56 -> 97
    //   44: iconst_m1
    //   45: ireturn
    //   46: aload_3
    //   47: invokestatic 163	cn/jpush/android/util/ah:b	(Ljava/lang/String;)Z
    //   50: ifeq +25 -> 75
    //   53: aload_3
    //   54: invokestatic 168	android/webkit/URLUtil:isHttpUrl	(Ljava/lang/String;)Z
    //   57: ifne +12 -> 69
    //   60: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   63: iconst_0
    //   64: istore 5
    //   66: goto -27 -> 39
    //   69: iconst_1
    //   70: istore 5
    //   72: goto -33 -> 39
    //   75: aload_3
    //   76: invokestatic 174	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
    //   79: ifne +12 -> 91
    //   82: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   85: iconst_0
    //   86: istore 5
    //   88: goto -49 -> 39
    //   91: iconst_1
    //   92: istore 5
    //   94: goto -55 -> 39
    //   97: aload_0
    //   98: aload_3
    //   99: invokestatic 177	cn/jpush/android/util/s:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   102: astore 6
    //   104: aload 6
    //   106: sipush 30000
    //   109: invokevirtual 183	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   112: aload 6
    //   114: sipush 30000
    //   117: invokevirtual 186	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   120: aload 6
    //   122: iconst_1
    //   123: invokevirtual 190	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   126: aload 6
    //   128: iconst_1
    //   129: invokevirtual 193	java/net/HttpURLConnection:setDoInput	(Z)V
    //   132: aload 6
    //   134: iconst_0
    //   135: invokevirtual 196	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   138: getstatic 202	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   141: invokestatic 208	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   144: bipush 8
    //   146: if_icmpge +19 -> 165
    //   149: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   152: bipush 12
    //   154: aaload
    //   155: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   158: bipush 13
    //   160: aaload
    //   161: invokestatic 214	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   164: pop
    //   165: aload 6
    //   167: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   170: bipush 23
    //   172: aaload
    //   173: invokevirtual 217	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   176: ldc 219
    //   178: astore 8
    //   180: aload_1
    //   181: ifnull +9 -> 190
    //   184: aload_1
    //   185: invokevirtual 224	org/json/JSONObject:toString	()Ljava/lang/String;
    //   188: astore 8
    //   190: aload 8
    //   192: invokestatic 160	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   195: ifeq +19 -> 214
    //   198: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   201: bipush 254
    //   203: ireturn
    //   204: astore 7
    //   206: aload 7
    //   208: invokevirtual 229	java/net/ProtocolException:printStackTrace	()V
    //   211: goto -35 -> 176
    //   214: aload 6
    //   216: ifnonnull +20 -> 236
    //   219: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   222: iconst_0
    //   223: istore 11
    //   225: iload 11
    //   227: ifne +192 -> 419
    //   230: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   233: bipush 253
    //   235: ireturn
    //   236: aload 6
    //   238: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   241: bipush 24
    //   243: aaload
    //   244: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   247: bipush 22
    //   249: aaload
    //   250: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: aload 6
    //   255: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   258: bipush 6
    //   260: aaload
    //   261: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   264: bipush 19
    //   266: aaload
    //   267: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: aload 6
    //   272: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   275: bipush 15
    //   277: aaload
    //   278: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   281: bipush 19
    //   283: aaload
    //   284: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   287: aload 6
    //   289: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   292: bipush 21
    //   294: aaload
    //   295: aload_0
    //   296: invokestatic 239	cn/jpush/android/util/b:q	(Landroid/content/Context;)Ljava/lang/String;
    //   299: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   302: aload 8
    //   304: ifnonnull +25 -> 329
    //   307: invokestatic 241	cn/jpush/android/util/ah:a	()Ljava/lang/String;
    //   310: astore 9
    //   312: aload 9
    //   314: invokestatic 160	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   317: ifeq +23 -> 340
    //   320: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   323: iconst_0
    //   324: istore 11
    //   326: goto -101 -> 225
    //   329: aload 8
    //   331: iconst_2
    //   332: invokestatic 244	cn/jpush/android/util/ah:a	(Ljava/lang/String;I)Ljava/lang/String;
    //   335: astore 9
    //   337: goto -25 -> 312
    //   340: aload 9
    //   342: invokestatic 248	cn/jpush/android/util/ah:c	(Ljava/lang/String;)Ljava/lang/String;
    //   345: astore 10
    //   347: aload 10
    //   349: invokestatic 160	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   352: ifeq +12 -> 364
    //   355: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   358: iconst_0
    //   359: istore 11
    //   361: goto -136 -> 225
    //   364: aload 6
    //   366: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   369: bipush 18
    //   371: aaload
    //   372: new 144	java/lang/StringBuilder
    //   375: dup
    //   376: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   379: bipush 20
    //   381: aaload
    //   382: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   385: aload 10
    //   387: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: invokevirtual 249	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   393: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   396: aload 6
    //   398: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   401: bipush 27
    //   403: aaload
    //   404: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   407: bipush 29
    //   409: aaload
    //   410: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   413: iconst_1
    //   414: istore 11
    //   416: goto -191 -> 225
    //   419: aload 8
    //   421: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   424: bipush 29
    //   426: aaload
    //   427: invokevirtual 253	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   430: astore 14
    //   432: new 255	java/io/ByteArrayOutputStream
    //   435: dup
    //   436: invokespecial 257	java/io/ByteArrayOutputStream:<init>	()V
    //   439: astore 15
    //   441: new 259	java/util/zip/GZIPOutputStream
    //   444: dup
    //   445: aload 15
    //   447: invokespecial 262	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   450: astore 16
    //   452: aload 16
    //   454: aload 14
    //   456: invokevirtual 268	java/io/OutputStream:write	([B)V
    //   459: aload 16
    //   461: invokevirtual 271	java/io/OutputStream:close	()V
    //   464: aload 15
    //   466: invokevirtual 275	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   469: astore 17
    //   471: aload 15
    //   473: invokevirtual 276	java/io/ByteArrayOutputStream:close	()V
    //   476: aload 6
    //   478: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   481: bipush 16
    //   483: aaload
    //   484: aload 17
    //   486: arraylength
    //   487: invokestatic 279	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   490: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   493: aload 6
    //   495: invokevirtual 283	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   498: astore 18
    //   500: aload 18
    //   502: aload 17
    //   504: invokevirtual 268	java/io/OutputStream:write	([B)V
    //   507: aload 18
    //   509: invokevirtual 286	java/io/OutputStream:flush	()V
    //   512: aload 18
    //   514: invokevirtual 271	java/io/OutputStream:close	()V
    //   517: aload 6
    //   519: invokevirtual 290	java/net/HttpURLConnection:getResponseCode	()I
    //   522: istore 26
    //   524: new 144	java/lang/StringBuilder
    //   527: dup
    //   528: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   531: bipush 25
    //   533: aaload
    //   534: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   537: iload 26
    //   539: invokevirtual 293	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   542: pop
    //   543: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   546: iload 26
    //   548: lookupswitch	default:+44->592, 200:+91->639, 401:+105->653, 404:+122->670, 429:+136->684
    //   593: iload_0
    //   594: bipush 100
    //   596: idiv
    //   597: istore 28
    //   599: iload 28
    //   601: iconst_5
    //   602: if_icmpne +96 -> 698
    //   605: aload 6
    //   607: ifnull +8 -> 615
    //   610: aload 6
    //   612: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   615: sipush 500
    //   618: ireturn
    //   619: astore 13
    //   621: aload 13
    //   623: invokevirtual 297	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   626: bipush 252
    //   628: ireturn
    //   629: astore 12
    //   631: aload 12
    //   633: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   636: bipush 252
    //   638: ireturn
    //   639: aload 6
    //   641: ifnull +8 -> 649
    //   644: aload 6
    //   646: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   649: sipush 200
    //   652: ireturn
    //   653: invokestatic 301	cn/jpush/android/util/ac:d	()V
    //   656: aload 6
    //   658: ifnull +8 -> 666
    //   661: aload 6
    //   663: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   666: sipush 401
    //   669: ireturn
    //   670: aload 6
    //   672: ifnull +8 -> 680
    //   675: aload 6
    //   677: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   680: sipush 404
    //   683: ireturn
    //   684: aload 6
    //   686: ifnull +8 -> 694
    //   689: aload 6
    //   691: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   694: sipush 429
    //   697: ireturn
    //   698: aload 6
    //   700: ifnull +8 -> 708
    //   703: aload 6
    //   705: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   708: bipush 251
    //   710: ireturn
    //   711: astore 24
    //   713: new 144	java/lang/StringBuilder
    //   716: dup
    //   717: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   720: bipush 14
    //   722: aaload
    //   723: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   726: aload 24
    //   728: invokevirtual 304	java/net/ProtocolException:getMessage	()Ljava/lang/String;
    //   731: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   734: pop
    //   735: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   738: aload 6
    //   740: ifnull +8 -> 748
    //   743: aload 6
    //   745: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   748: iconst_m1
    //   749: ireturn
    //   750: astore 22
    //   752: new 144	java/lang/StringBuilder
    //   755: dup
    //   756: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   759: bipush 17
    //   761: aaload
    //   762: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   765: aload 22
    //   767: invokevirtual 305	java/io/IOException:getMessage	()Ljava/lang/String;
    //   770: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: pop
    //   774: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   777: aload 6
    //   779: ifnull -31 -> 748
    //   782: aload 6
    //   784: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   787: goto -39 -> 748
    //   790: astore 20
    //   792: new 144	java/lang/StringBuilder
    //   795: dup
    //   796: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   799: bipush 26
    //   801: aaload
    //   802: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   805: aload 20
    //   807: invokevirtual 306	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   810: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: pop
    //   814: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   817: aload 6
    //   819: ifnull -71 -> 748
    //   822: aload 6
    //   824: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   827: goto -79 -> 748
    //   830: astore 19
    //   832: aload 6
    //   834: ifnull +8 -> 842
    //   837: aload 6
    //   839: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   842: aload 19
    //   844: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   165	176	204	java/net/ProtocolException
    //   419	517	619	java/io/UnsupportedEncodingException
    //   419	517	629	java/io/IOException
    //   517	546	711	java/net/ProtocolException
    //   592	599	711	java/net/ProtocolException
    //   653	656	711	java/net/ProtocolException
    //   517	546	750	java/io/IOException
    //   592	599	750	java/io/IOException
    //   653	656	750	java/io/IOException
    //   517	546	790	java/lang/AssertionError
    //   592	599	790	java/lang/AssertionError
    //   653	656	790	java/lang/AssertionError
    //   517	546	830	finally
    //   592	599	830	finally
    //   653	656	830	finally
    //   713	738	830	finally
    //   752	777	830	finally
    //   792	817	830	finally
  }

  // ERROR //
  public static String a(String paramString, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: new 144	java/lang/StringBuilder
    //   3: dup
    //   4: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   7: bipush 35
    //   9: aaload
    //   10: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: pop
    //   18: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   21: lload_2
    //   22: ldc2_w 314
    //   25: lcmp
    //   26: iflt +11 -> 37
    //   29: lload_2
    //   30: ldc2_w 316
    //   33: lcmp
    //   34: ifle +7 -> 41
    //   37: ldc2_w 318
    //   40: lstore_2
    //   41: aconst_null
    //   42: astore 5
    //   44: aconst_null
    //   45: astore 6
    //   47: iconst_0
    //   48: istore 7
    //   50: new 321	java/net/URL
    //   53: dup
    //   54: aload_0
    //   55: invokespecial 322	java/net/URL:<init>	(Ljava/lang/String;)V
    //   58: invokevirtual 326	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   61: checkcast 179	java/net/HttpURLConnection
    //   64: astore 18
    //   66: aload 18
    //   68: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   71: bipush 8
    //   73: aaload
    //   74: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   77: iconst_2
    //   78: aaload
    //   79: invokevirtual 329	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: aload 18
    //   84: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   87: bipush 6
    //   89: aaload
    //   90: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   93: bipush 7
    //   95: aaload
    //   96: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: getstatic 202	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   102: invokestatic 208	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   105: bipush 8
    //   107: if_icmpge +19 -> 126
    //   110: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   113: bipush 12
    //   115: aaload
    //   116: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   119: bipush 13
    //   121: aaload
    //   122: invokestatic 214	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   125: pop
    //   126: aload 18
    //   128: invokevirtual 290	java/net/HttpURLConnection:getResponseCode	()I
    //   131: istore 28
    //   133: new 144	java/lang/StringBuilder
    //   136: dup
    //   137: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   140: iconst_0
    //   141: aaload
    //   142: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   145: iload 28
    //   147: invokevirtual 293	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: invokestatic 155	cn/jpush/android/util/ac:a	()V
    //   154: iload 28
    //   156: sipush 200
    //   159: if_icmpne +95 -> 254
    //   162: aload 18
    //   164: invokevirtual 333	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   167: astore 30
    //   169: new 12	java/lang/String
    //   172: dup
    //   173: aload 30
    //   175: invokestatic 338	cn/jpush/android/util/am:a	(Ljava/io/InputStream;)[B
    //   178: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   181: bipush 29
    //   183: aaload
    //   184: invokespecial 341	java/lang/String:<init>	([BLjava/lang/String;)V
    //   187: astore 31
    //   189: aload 30
    //   191: ifnull +8 -> 199
    //   194: aload 30
    //   196: invokevirtual 344	java/io/InputStream:close	()V
    //   199: aload 18
    //   201: ifnull +8 -> 209
    //   204: aload 18
    //   206: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   209: iload 28
    //   211: sipush 200
    //   214: if_icmplt +354 -> 568
    //   217: iload 28
    //   219: sipush 300
    //   222: if_icmpge +346 -> 568
    //   225: aload 31
    //   227: ifnonnull +771 -> 998
    //   230: invokestatic 347	cn/jpush/android/util/ac:g	()V
    //   233: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   236: bipush 32
    //   238: aaload
    //   239: astore 41
    //   241: aload 41
    //   243: areturn
    //   244: astore 42
    //   246: aload 42
    //   248: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   251: goto -52 -> 199
    //   254: aload 6
    //   256: ifnull +8 -> 264
    //   259: aload 6
    //   261: invokevirtual 344	java/io/InputStream:close	()V
    //   264: aload 18
    //   266: ifnull +735 -> 1001
    //   269: aload 18
    //   271: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   274: aload 18
    //   276: astore 5
    //   278: iload 7
    //   280: iconst_5
    //   281: if_icmplt +249 -> 530
    //   284: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   287: bipush 33
    //   289: aaload
    //   290: areturn
    //   291: astore 47
    //   293: aload 47
    //   295: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   298: goto -34 -> 264
    //   301: astore 46
    //   303: aload 18
    //   305: astore 10
    //   307: aload 30
    //   309: astore 9
    //   311: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   314: iconst_4
    //   315: aaload
    //   316: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   319: iconst_3
    //   320: aaload
    //   321: invokestatic 349	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   324: aload 9
    //   326: ifnull +8 -> 334
    //   329: aload 9
    //   331: invokevirtual 344	java/io/InputStream:close	()V
    //   334: aload 10
    //   336: ifnull +672 -> 1008
    //   339: aload 10
    //   341: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   344: aload 10
    //   346: astore 5
    //   348: aload 9
    //   350: astore 6
    //   352: goto -74 -> 278
    //   355: astore 16
    //   357: aload 16
    //   359: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   362: goto -28 -> 334
    //   365: astore 45
    //   367: aload 30
    //   369: astore 6
    //   371: invokestatic 347	cn/jpush/android/util/ac:g	()V
    //   374: aload 6
    //   376: ifnull +8 -> 384
    //   379: aload 6
    //   381: invokevirtual 344	java/io/InputStream:close	()V
    //   384: aload 18
    //   386: ifnull +615 -> 1001
    //   389: aload 18
    //   391: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   394: aload 18
    //   396: astore 5
    //   398: goto -120 -> 278
    //   401: astore 20
    //   403: aload 20
    //   405: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   408: goto -24 -> 384
    //   411: astore 44
    //   413: aload 30
    //   415: astore 6
    //   417: aload 18
    //   419: astore 5
    //   421: aload 44
    //   423: astore 21
    //   425: new 144	java/lang/StringBuilder
    //   428: dup
    //   429: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   432: bipush 26
    //   434: aaload
    //   435: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   438: aload 21
    //   440: invokevirtual 306	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   443: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: pop
    //   447: invokestatic 171	cn/jpush/android/util/ac:e	()V
    //   450: aload 6
    //   452: ifnull +8 -> 460
    //   455: aload 6
    //   457: invokevirtual 344	java/io/InputStream:close	()V
    //   460: aload 5
    //   462: ifnull -184 -> 278
    //   465: aload 5
    //   467: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   470: goto -192 -> 278
    //   473: astore 23
    //   475: aload 23
    //   477: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   480: goto -20 -> 460
    //   483: astore 43
    //   485: aload 30
    //   487: astore 6
    //   489: aload 18
    //   491: astore 5
    //   493: aload 43
    //   495: astore 12
    //   497: aload 6
    //   499: ifnull +8 -> 507
    //   502: aload 6
    //   504: invokevirtual 344	java/io/InputStream:close	()V
    //   507: aload 5
    //   509: ifnull +8 -> 517
    //   512: aload 5
    //   514: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   517: aload 12
    //   519: athrow
    //   520: astore 13
    //   522: aload 13
    //   524: invokevirtual 298	java/io/IOException:printStackTrace	()V
    //   527: goto -20 -> 507
    //   530: iload 7
    //   532: iconst_1
    //   533: iadd
    //   534: istore 14
    //   536: lload_2
    //   537: invokestatic 355	java/lang/Thread:sleep	(J)V
    //   540: iload 14
    //   542: istore 7
    //   544: goto -494 -> 50
    //   547: astore 15
    //   549: iload 14
    //   551: istore 7
    //   553: goto -503 -> 50
    //   556: astore 40
    //   558: invokestatic 358	cn/jpush/android/util/ac:f	()V
    //   561: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   564: bipush 32
    //   566: aaload
    //   567: areturn
    //   568: iload 28
    //   570: sipush 400
    //   573: if_icmplt +227 -> 800
    //   576: iload 28
    //   578: sipush 500
    //   581: if_icmpge +219 -> 800
    //   584: sipush 400
    //   587: iload 28
    //   589: if_icmpne +31 -> 620
    //   592: new 144	java/lang/StringBuilder
    //   595: dup
    //   596: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   599: bipush 37
    //   601: aaload
    //   602: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   605: aload_0
    //   606: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   609: pop
    //   610: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   613: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   616: bipush 30
    //   618: aaload
    //   619: areturn
    //   620: sipush 401
    //   623: iload 28
    //   625: if_icmpne +31 -> 656
    //   628: new 144	java/lang/StringBuilder
    //   631: dup
    //   632: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   635: bipush 38
    //   637: aaload
    //   638: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   641: aload_0
    //   642: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   645: pop
    //   646: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   649: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   652: bipush 32
    //   654: aaload
    //   655: areturn
    //   656: sipush 404
    //   659: iload 28
    //   661: if_icmpne +31 -> 692
    //   664: new 144	java/lang/StringBuilder
    //   667: dup
    //   668: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   671: bipush 11
    //   673: aaload
    //   674: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   677: aload_0
    //   678: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   681: pop
    //   682: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   685: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   688: bipush 32
    //   690: aaload
    //   691: areturn
    //   692: sipush 406
    //   695: iload 28
    //   697: if_icmpne +31 -> 728
    //   700: new 144	java/lang/StringBuilder
    //   703: dup
    //   704: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   707: bipush 34
    //   709: aaload
    //   710: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   713: aload_0
    //   714: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: pop
    //   718: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   721: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   724: bipush 32
    //   726: aaload
    //   727: areturn
    //   728: sipush 408
    //   731: iload 28
    //   733: if_icmpne +31 -> 764
    //   736: new 144	java/lang/StringBuilder
    //   739: dup
    //   740: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   743: bipush 40
    //   745: aaload
    //   746: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   749: aload_0
    //   750: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: pop
    //   754: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   757: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   760: bipush 32
    //   762: aaload
    //   763: areturn
    //   764: sipush 409
    //   767: iload 28
    //   769: if_icmpne +227 -> 996
    //   772: new 144	java/lang/StringBuilder
    //   775: dup
    //   776: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   779: bipush 39
    //   781: aaload
    //   782: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   785: aload_0
    //   786: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   789: pop
    //   790: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   793: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   796: bipush 32
    //   798: aaload
    //   799: areturn
    //   800: iload 28
    //   802: sipush 500
    //   805: if_icmplt +53 -> 858
    //   808: iload 28
    //   810: sipush 600
    //   813: if_icmpge +45 -> 858
    //   816: new 144	java/lang/StringBuilder
    //   819: dup
    //   820: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   823: bipush 36
    //   825: aaload
    //   826: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   829: iload 28
    //   831: invokevirtual 293	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   834: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   837: bipush 9
    //   839: aaload
    //   840: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   843: aload_0
    //   844: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   847: pop
    //   848: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   851: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   854: bipush 32
    //   856: aaload
    //   857: areturn
    //   858: new 144	java/lang/StringBuilder
    //   861: dup
    //   862: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   865: iconst_1
    //   866: aaload
    //   867: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   870: iload 28
    //   872: invokevirtual 293	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   875: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   878: bipush 9
    //   880: aaload
    //   881: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   884: aload_0
    //   885: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   888: pop
    //   889: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   892: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   895: bipush 32
    //   897: aaload
    //   898: areturn
    //   899: astore 11
    //   901: aload 10
    //   903: astore 5
    //   905: aload 9
    //   907: astore 6
    //   909: aload 11
    //   911: astore 12
    //   913: goto -416 -> 497
    //   916: astore 19
    //   918: aload 18
    //   920: astore 5
    //   922: aload 19
    //   924: astore 12
    //   926: goto -429 -> 497
    //   929: astore 12
    //   931: goto -434 -> 497
    //   934: astore 21
    //   936: goto -511 -> 425
    //   939: astore 27
    //   941: aload 18
    //   943: astore 5
    //   945: aload 27
    //   947: astore 21
    //   949: goto -524 -> 425
    //   952: astore 17
    //   954: aload 5
    //   956: astore 18
    //   958: goto -587 -> 371
    //   961: astore 26
    //   963: goto -592 -> 371
    //   966: astore 8
    //   968: aload 6
    //   970: astore 9
    //   972: aload 5
    //   974: astore 10
    //   976: goto -665 -> 311
    //   979: astore 24
    //   981: aload 6
    //   983: astore 25
    //   985: aload 18
    //   987: astore 10
    //   989: aload 25
    //   991: astore 9
    //   993: goto -682 -> 311
    //   996: aconst_null
    //   997: areturn
    //   998: aload 31
    //   1000: areturn
    //   1001: aload 18
    //   1003: astore 5
    //   1005: goto -727 -> 278
    //   1008: aload 10
    //   1010: astore 5
    //   1012: aload 9
    //   1014: astore 6
    //   1016: goto -738 -> 278
    //
    // Exception table:
    //   from	to	target	type
    //   194	199	244	java/io/IOException
    //   259	264	291	java/io/IOException
    //   169	189	301	javax/net/ssl/SSLPeerUnverifiedException
    //   329	334	355	java/io/IOException
    //   169	189	365	java/lang/Exception
    //   379	384	401	java/io/IOException
    //   169	189	411	java/lang/AssertionError
    //   455	460	473	java/io/IOException
    //   169	189	483	finally
    //   502	507	520	java/io/IOException
    //   536	540	547	java/lang/InterruptedException
    //   230	241	556	java/lang/Exception
    //   311	324	899	finally
    //   66	126	916	finally
    //   126	154	916	finally
    //   162	169	916	finally
    //   371	374	916	finally
    //   50	66	929	finally
    //   425	450	929	finally
    //   50	66	934	java/lang/AssertionError
    //   66	126	939	java/lang/AssertionError
    //   126	154	939	java/lang/AssertionError
    //   162	169	939	java/lang/AssertionError
    //   50	66	952	java/lang/Exception
    //   66	126	961	java/lang/Exception
    //   126	154	961	java/lang/Exception
    //   162	169	961	java/lang/Exception
    //   50	66	966	javax/net/ssl/SSLPeerUnverifiedException
    //   66	126	979	javax/net/ssl/SSLPeerUnverifiedException
    //   126	154	979	javax/net/ssl/SSLPeerUnverifiedException
    //   162	169	979	javax/net/ssl/SSLPeerUnverifiedException
  }

  public static HttpURLConnection a(Context paramContext, String paramString)
  {
    try
    {
      URL localURL = new URL(paramString);
      if (paramContext.getPackageManager().checkPermission(z[45], paramContext.getPackageName()) == 0)
      {
        NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService(z[46])).getActiveNetworkInfo();
        if ((localNetworkInfo != null) && (localNetworkInfo.getType() != 1))
        {
          String str = localNetworkInfo.getExtraInfo();
          if ((str != null) && ((str.equals(z[42])) || (str.equals(z[43])) || (str.equals(z[44]))))
          {
            InetSocketAddress localInetSocketAddress = new InetSocketAddress(z[41], 80);
            return (HttpURLConnection)localURL.openConnection(new Proxy(Proxy.Type.HTTP, localInetSocketAddress));
          }
        }
      }
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
      return localHttpURLConnection;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      localMalformedURLException.printStackTrace();
      return null;
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  public static void a(HttpURLConnection paramHttpURLConnection, boolean paramBoolean)
  {
    if (paramHttpURLConnection == null)
    {
      ac.e();
      return;
    }
    if (paramBoolean);
    try
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.setDoInput(true);
      paramHttpURLConnection.setRequestMethod(z[23]);
      paramHttpURLConnection.setUseCaches(false);
      paramHttpURLConnection.setRequestProperty(z[47], z[48]);
      paramHttpURLConnection.setRequestProperty(z[49], z[29]);
      paramHttpURLConnection.setConnectTimeout(30000);
      paramHttpURLConnection.setReadTimeout(30000);
      return;
    }
    catch (ProtocolException localProtocolException)
    {
      while (true)
        localProtocolException.printStackTrace();
    }
  }

  public static boolean a(String paramString)
  {
    return (TextUtils.isEmpty(paramString)) || (paramString.equals(z[32])) || (paramString.equals(z[30])) || (paramString.equals(z[33])) || (paramString.equals(z[31]));
  }

  public static byte[] a(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    byte[] arrayOfByte = null;
    for (int i = 0; i < 4; i++)
    {
      arrayOfByte = b(paramString, 5, 5000L);
      if (arrayOfByte != null)
        break;
    }
    return arrayOfByte;
  }

  // ERROR //
  private static byte[] b(String paramString, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: iload_1
    //   1: ifle +9 -> 10
    //   4: iload_1
    //   5: bipush 10
    //   7: if_icmple +5 -> 12
    //   10: iconst_1
    //   11: istore_1
    //   12: lload_2
    //   13: ldc2_w 314
    //   16: lcmp
    //   17: iflt +11 -> 28
    //   20: lload_2
    //   21: ldc2_w 316
    //   24: lcmp
    //   25: ifle +7 -> 32
    //   28: ldc2_w 318
    //   31: lstore_2
    //   32: new 144	java/lang/StringBuilder
    //   35: dup
    //   36: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   39: iconst_5
    //   40: aaload
    //   41: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: aload_0
    //   45: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   52: iconst_0
    //   53: istore 5
    //   55: aconst_null
    //   56: astore 6
    //   58: aconst_null
    //   59: astore 7
    //   61: new 321	java/net/URL
    //   64: dup
    //   65: aload_0
    //   66: invokespecial 322	java/net/URL:<init>	(Ljava/lang/String;)V
    //   69: invokevirtual 326	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   72: checkcast 179	java/net/HttpURLConnection
    //   75: astore 20
    //   77: aload 20
    //   79: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   82: bipush 6
    //   84: aaload
    //   85: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   88: bipush 7
    //   90: aaload
    //   91: invokevirtual 233	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload 20
    //   96: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   99: bipush 8
    //   101: aaload
    //   102: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   105: iconst_2
    //   106: aaload
    //   107: invokevirtual 329	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   110: getstatic 202	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   113: invokestatic 208	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   116: bipush 8
    //   118: if_icmpge +19 -> 137
    //   121: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   124: bipush 12
    //   126: aaload
    //   127: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   130: bipush 13
    //   132: aaload
    //   133: invokestatic 214	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   136: pop
    //   137: aload 20
    //   139: invokevirtual 290	java/net/HttpURLConnection:getResponseCode	()I
    //   142: istore 26
    //   144: new 144	java/lang/StringBuilder
    //   147: dup
    //   148: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   151: iconst_0
    //   152: aaload
    //   153: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   156: iload 26
    //   158: invokevirtual 293	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: invokestatic 155	cn/jpush/android/util/ac:a	()V
    //   165: iload 26
    //   167: sipush 200
    //   170: if_icmpne +71 -> 241
    //   173: aload 20
    //   175: invokevirtual 433	java/net/HttpURLConnection:getContentLength	()I
    //   178: istore 28
    //   180: aload 20
    //   182: invokevirtual 333	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   185: astore 29
    //   187: aload 29
    //   189: ifnull +477 -> 666
    //   192: aload 29
    //   194: invokestatic 338	cn/jpush/android/util/am:a	(Ljava/io/InputStream;)[B
    //   197: astore 39
    //   199: aload 39
    //   201: astore 30
    //   203: aload 29
    //   205: ifnull +8 -> 213
    //   208: aload 29
    //   210: invokevirtual 344	java/io/InputStream:close	()V
    //   213: aload 20
    //   215: ifnull +8 -> 223
    //   218: aload 20
    //   220: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   223: sipush 200
    //   226: iload 26
    //   228: if_icmpne +229 -> 457
    //   231: iload 28
    //   233: ifne +201 -> 434
    //   236: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   239: aconst_null
    //   240: areturn
    //   241: aload 6
    //   243: ifnull +8 -> 251
    //   246: aload 6
    //   248: invokevirtual 344	java/io/InputStream:close	()V
    //   251: aload 20
    //   253: ifnull +406 -> 659
    //   256: aload 20
    //   258: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   261: aload 20
    //   263: astore 7
    //   265: iload 5
    //   267: iload_1
    //   268: if_icmplt +132 -> 400
    //   271: aconst_null
    //   272: areturn
    //   273: astore 38
    //   275: aload 20
    //   277: astore 10
    //   279: aload 29
    //   281: astore 9
    //   283: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   286: iconst_4
    //   287: aaload
    //   288: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   291: iconst_3
    //   292: aaload
    //   293: invokestatic 349	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: aload 9
    //   298: ifnull +8 -> 306
    //   301: aload 9
    //   303: invokevirtual 344	java/io/InputStream:close	()V
    //   306: aload 10
    //   308: ifnull +364 -> 672
    //   311: aload 10
    //   313: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   316: aload 10
    //   318: astore 7
    //   320: aload 9
    //   322: astore 6
    //   324: goto -59 -> 265
    //   327: astore 37
    //   329: aload 29
    //   331: astore 6
    //   333: invokestatic 347	cn/jpush/android/util/ac:g	()V
    //   336: aload 6
    //   338: ifnull +8 -> 346
    //   341: aload 6
    //   343: invokevirtual 344	java/io/InputStream:close	()V
    //   346: aload 20
    //   348: ifnull +311 -> 659
    //   351: aload 20
    //   353: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   356: aload 20
    //   358: astore 7
    //   360: goto -95 -> 265
    //   363: astore 36
    //   365: aload 29
    //   367: astore 6
    //   369: aload 20
    //   371: astore 7
    //   373: aload 36
    //   375: astore 12
    //   377: aload 6
    //   379: ifnull +8 -> 387
    //   382: aload 6
    //   384: invokevirtual 344	java/io/InputStream:close	()V
    //   387: aload 7
    //   389: ifnull +8 -> 397
    //   392: aload 7
    //   394: invokevirtual 296	java/net/HttpURLConnection:disconnect	()V
    //   397: aload 12
    //   399: athrow
    //   400: iload 5
    //   402: iconst_1
    //   403: iadd
    //   404: istore 14
    //   406: lload_2
    //   407: iload 14
    //   409: i2l
    //   410: lmul
    //   411: lstore 15
    //   413: lload 15
    //   415: invokestatic 355	java/lang/Thread:sleep	(J)V
    //   418: iload 14
    //   420: istore 5
    //   422: goto -361 -> 61
    //   425: astore 17
    //   427: iload 14
    //   429: istore 5
    //   431: goto -370 -> 61
    //   434: aload 30
    //   436: arraylength
    //   437: iload 28
    //   439: if_icmpge +8 -> 447
    //   442: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   445: aconst_null
    //   446: areturn
    //   447: aload 30
    //   449: areturn
    //   450: astore 34
    //   452: invokestatic 347	cn/jpush/android/util/ac:g	()V
    //   455: aconst_null
    //   456: areturn
    //   457: sipush 400
    //   460: iload 26
    //   462: if_icmpne +26 -> 488
    //   465: new 144	java/lang/StringBuilder
    //   468: dup
    //   469: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   472: bipush 10
    //   474: aaload
    //   475: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   478: aload_0
    //   479: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: pop
    //   483: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   486: aconst_null
    //   487: areturn
    //   488: sipush 404
    //   491: iload 26
    //   493: if_icmpne +26 -> 519
    //   496: new 144	java/lang/StringBuilder
    //   499: dup
    //   500: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   503: bipush 11
    //   505: aaload
    //   506: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   509: aload_0
    //   510: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   513: pop
    //   514: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   517: aconst_null
    //   518: areturn
    //   519: new 144	java/lang/StringBuilder
    //   522: dup
    //   523: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   526: iconst_1
    //   527: aaload
    //   528: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   531: iload 26
    //   533: invokevirtual 293	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   536: getstatic 126	cn/jpush/android/util/s:z	[Ljava/lang/String;
    //   539: bipush 9
    //   541: aaload
    //   542: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: aload_0
    //   546: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   549: pop
    //   550: invokestatic 226	cn/jpush/android/util/ac:b	()V
    //   553: aconst_null
    //   554: areturn
    //   555: astore 35
    //   557: goto -344 -> 213
    //   560: astore 40
    //   562: goto -311 -> 251
    //   565: astore 18
    //   567: goto -261 -> 306
    //   570: astore 22
    //   572: goto -226 -> 346
    //   575: astore 13
    //   577: goto -190 -> 387
    //   580: astore 11
    //   582: aload 10
    //   584: astore 7
    //   586: aload 9
    //   588: astore 6
    //   590: aload 11
    //   592: astore 12
    //   594: goto -217 -> 377
    //   597: astore 21
    //   599: aload 20
    //   601: astore 7
    //   603: aload 21
    //   605: astore 12
    //   607: goto -230 -> 377
    //   610: astore 12
    //   612: goto -235 -> 377
    //   615: astore 19
    //   617: aload 7
    //   619: astore 20
    //   621: goto -288 -> 333
    //   624: astore 25
    //   626: goto -293 -> 333
    //   629: astore 8
    //   631: aload 6
    //   633: astore 9
    //   635: aload 7
    //   637: astore 10
    //   639: goto -356 -> 283
    //   642: astore 23
    //   644: aload 6
    //   646: astore 24
    //   648: aload 20
    //   650: astore 10
    //   652: aload 24
    //   654: astore 9
    //   656: goto -373 -> 283
    //   659: aload 20
    //   661: astore 7
    //   663: goto -398 -> 265
    //   666: aconst_null
    //   667: astore 30
    //   669: goto -466 -> 203
    //   672: aload 10
    //   674: astore 7
    //   676: aload 9
    //   678: astore 6
    //   680: goto -415 -> 265
    //
    // Exception table:
    //   from	to	target	type
    //   192	199	273	javax/net/ssl/SSLPeerUnverifiedException
    //   192	199	327	java/lang/Exception
    //   192	199	363	finally
    //   413	418	425	java/lang/InterruptedException
    //   236	239	450	java/lang/Exception
    //   434	445	450	java/lang/Exception
    //   208	213	555	java/io/IOException
    //   246	251	560	java/io/IOException
    //   301	306	565	java/io/IOException
    //   341	346	570	java/io/IOException
    //   382	387	575	java/io/IOException
    //   283	296	580	finally
    //   77	137	597	finally
    //   137	165	597	finally
    //   173	187	597	finally
    //   333	336	597	finally
    //   61	77	610	finally
    //   61	77	615	java/lang/Exception
    //   77	137	624	java/lang/Exception
    //   137	165	624	java/lang/Exception
    //   173	187	624	java/lang/Exception
    //   61	77	629	javax/net/ssl/SSLPeerUnverifiedException
    //   77	137	642	javax/net/ssl/SSLPeerUnverifiedException
    //   137	165	642	javax/net/ssl/SSLPeerUnverifiedException
    //   173	187	642	javax/net/ssl/SSLPeerUnverifiedException
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */