package cn.jpush.android.util;

import android.content.Context;
import android.text.TextUtils;
import cn.jpush.android.helpers.i;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class af extends Thread
{
  private static ExecutorService a;
  private static Object b;
  private static AtomicInteger c;
  private static CookieManager j;
  private static final String[] z;
  private String d;
  private String e;
  private String f;
  private Context g;
  private int h = 0;
  private String i;

  static
  {
    Object localObject1 = new String[92];
    int k = 0;
    String str1 = "(F\001\020r";
    int m = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int n = localObject3.length;
    int i1 = 0;
    label36: Object localObject4;
    int i2;
    int i3;
    Object localObject5;
    label52: int i4;
    int i5;
    if (n <= 1)
    {
      localObject4 = localObject3;
      i2 = i1;
      i3 = n;
      localObject5 = localObject3;
      i4 = localObject5[i1];
      switch (i2 % 5)
      {
      default:
        i5 = 66;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[i1] = (char)(i5 ^ i4);
      i1 = i2 + 1;
      if (i3 == 0)
      {
        localObject5 = localObject4;
        i2 = i1;
        i1 = i3;
        break label52;
      }
      n = i3;
      localObject3 = localObject4;
      if (n > i1)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (m)
      {
      default:
        localObject1[k] = str2;
        k = 1;
        str1 = "(F\001\020p";
        localObject1 = localObject2;
        m = 0;
        break;
      case 0:
        localObject1[k] = str2;
        k = 2;
        str1 = "(F\001\020q";
        m = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[k] = str2;
        k = 3;
        str1 = "l\002^V+x\025CS\013r\024TXx";
        m = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[k] = str2;
        k = 4;
        str1 = "(F\001\020s";
        m = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[k] = str2;
        k = 5;
        str1 = "o\031VNx";
        m = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[k] = str2;
        k = 6;
        str1 = "";
        m = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[k] = str2;
        k = 7;
        str1 = "";
        m = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[k] = str2;
        k = 8;
        str1 = "n\025@6u\035T";
        m = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[k] = str2;
        k = 9;
        str1 = "o\004PT+o\004XCmm\005TR;#";
        m = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[k] = str2;
        k = 10;
        str1 = "";
        m = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[k] = str2;
        k = 11;
        str1 = "<\003EA6i\003rO&yJ";
        m = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[k] = str2;
        k = 12;
        str1 = "i\002]\032";
        m = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[k] = str2;
        k = 13;
        str1 = "";
        m = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[k] = str2;
        k = 14;
        str1 = "u\035BI";
        m = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[k] = str2;
        k = 15;
        str1 = "<\002BP\006}\004P\032";
        m = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[k] = str2;
        k = 16;
        str1 = "u\023RI&";
        m = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[k] = str2;
        k = 17;
        str1 = "o\031VN";
        m = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[k] = str2;
        k = 18;
        str1 = "n\025BPln\021F";
        m = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[k] = str2;
        k = 19;
        str1 = "u\035TI";
        m = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[k] = str2;
        k = 20;
        str1 = "r\005\\";
        m = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[k] = str2;
        k = 21;
        str1 = "<\031RC+xJ";
        m = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[k] = str2;
        k = 22;
        str1 = "<\031\\S+&";
        m = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[k] = str2;
        k = 23;
        str1 = "I$w\rz";
        m = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[k] = str2;
        k = 24;
        str1 = "n\025BPlf\031A";
        m = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[k] = str2;
        k = 25;
        str1 = "\037UE";
        m = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[k] = str2;
        k = 26;
        str1 = "j\025CS+s\036";
        m = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[k] = str2;
        k = 27;
        str1 = "]\023EO,<]\021O,X\025EC*L\030^N'R\005\\B'nPAH-r\025U/~\025C\032";
        m = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[k] = str2;
        k = 28;
        str1 = "y\036rR2h\trO,h\025_Tx";
        m = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[k] = str2;
        k = 29;
        str1 = "\037_T'r\004";
        m = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[k] = str2;
        k = 30;
        str1 = "h\tAE";
        m = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[k] = str2;
        k = 31;
        str1 = "n\025AR-hPRO,h\025_Tx";
        m = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[k] = str2;
        k = 32;
        str1 = "r\022";
        m = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[k] = str2;
        k = 33;
        str1 = "u\004XM'";
        m = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[k] = str2;
        k = 34;
        str1 = "~\021BEbi\002]\032";
        m = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[k] = str2;
        k = 35;
        str1 = "\021_\0076<\037AE,<";
        m = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[k] = str2;
        k = 36;
        str1 = "";
        m = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[k] = str2;
        k = 37;
        str1 = "";
        m = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[k] = str2;
        k = 38;
        str1 = "<\\\021G+j\025\021U2<\003PV'<J";
        m = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[k] = str2;
        k = 39;
        str1 = "";
        m = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[k] = str2;
        k = 40;
        str1 = "0P";
        m = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[k] = str2;
        k = 41;
        str1 = "";
        m = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[k] = str2;
        k = 42;
        str1 = "\021_\0076<\007CI6yP";
        m = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[k] = str2;
        k = 43;
        str1 = "\021_\0076<\025_C-x\031_Gb";
        m = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[k] = str2;
        k = 44;
        str1 = "\021z<*";
        m = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[k] = str2;
        k = 45;
        str1 = "&P";
        m = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[k] = str2;
        k = 46;
        str1 = "O\025E\r\001s\037ZI'";
        m = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[k] = str2;
        k = 47;
        str1 = "_\030XN#Q\037SI.y";
        m = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[k] = str2;
        k = 48;
        str1 = "_\030XN#H\025]E!s\035";
        m = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[k] = str2;
        k = 49;
        str1 = "_\030XN#I\036XC-q";
        m = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[k] = str2;
        k = 50;
        str1 = "n\025E\032";
        m = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[k] = str2;
        k = 51;
        str1 = "";
        m = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[k] = str2;
        k = 52;
        str1 = "n\025BP\035x\021EA";
        m = 51;
        localObject1 = localObject2;
        break;
      case 51:
        localObject1[k] = str2;
        k = 53;
        str1 = "x\025RO&y YO,y>DM y\002\021D'\002HP6<\024PT#&";
        m = 52;
        localObject1 = localObject2;
        break;
      case 52:
        localObject1[k] = str2;
        k = 54;
        str1 = "I\036TX2y\023EE&<]\021F#u\034TDbh\037\021a\007OPUE!n\tATlyJ";
        m = 53;
        localObject1 = localObject2;
        break;
      case 53:
        localObject1[k] = str2;
        k = 55;
        str1 = "<\033TY1y\004\013";
        m = 54;
        localObject1 = localObject2;
        break;
      case 54:
        localObject1[k] = str2;
        k = 56;
        str1 = "1]";
        m = 55;
        localObject1 = localObject2;
        break;
      case 55:
        localObject1[k] = str2;
        k = 57;
        str1 = "z\031]Ex";
        m = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[k] = str2;
        k = 58;
        str1 = "";
        m = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[k] = str2;
        k = 59;
        str1 = "n\025@U'o\004\021T+q\025^U6&D\001\030b1P";
        m = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[k] = str2;
        k = 60;
        str1 = " LWA+p\025U5u\004Y0y\004CI'oN\017";
        m = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[k] = str2;
        k = 61;
        str1 = "_\030PR1y\004";
        m = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[k] = str2;
        k = 62;
        str1 = "n\003Ac-x\025\013";
        m = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[k] = str2;
        k = 63;
        str1 = "'\022^U,x\021CY";
        m = 62;
        localObject1 = localObject2;
        break;
      case 62:
        localObject1[k] = str2;
        k = 64;
        str1 = "<PWI.y\036PM'&";
        m = 63;
        localObject1 = localObject2;
        break;
      case 63:
        localObject1[k] = str2;
        k = 65;
        str1 = "z\021]S'";
        m = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[k] = str2;
        k = 66;
        str1 = "\021z";
        m = 65;
        localObject1 = localObject2;
        break;
      case 65:
        localObject1[k] = str2;
        k = 67;
        str1 = "\026PWI.yJ";
        m = 66;
        localObject1 = localObject2;
        break;
      case 66:
        localObject1[k] = str2;
        k = 68;
        str1 = "";
        m = 67;
        localObject1 = localObject2;
        break;
      case 67:
        localObject1[k] = str2;
        k = 69;
        str1 = "P\037RA6u\037_";
        m = 68;
        localObject1 = localObject2;
        break;
      case 68:
        localObject1[k] = str2;
        k = 70;
        str1 = "";
        m = 69;
        localObject1 = localObject2;
        break;
      case 69:
        localObject1[k] = str2;
        k = 71;
        str1 = "0PDR.&";
        m = 70;
        localObject1 = localObject2;
        break;
      case 70:
        localObject1[k] = str2;
        k = 72;
        str1 = "";
        m = 71;
        localObject1 = localObject2;
        break;
      case 71:
        localObject1[k] = str2;
        k = 73;
        str1 = "_\037_T'r\004\034t;l\025";
        m = 72;
        localObject1 = localObject2;
        break;
      case 72:
        localObject1[k] = str2;
        k = 74;
        str1 = " LTR0s\002\017\036";
        m = 73;
        localObject1 = localObject2;
        break;
      case 73:
        localObject1[k] = str2;
        k = 75;
        str1 = "_\037^K+y";
        m = 74;
        localObject1 = localObject2;
        break;
      case 74:
        localObject1[k] = str2;
        k = 76;
        str1 = "I\003TRo]\027TN6";
        m = 75;
        localObject1 = localObject2;
        break;
      case 75:
        localObject1[k] = str2;
        k = 77;
        str1 = "q\005]T+l\021CTmz\037CMox\021EA";
        m = 76;
        localObject1 = localObject2;
        break;
      case 76:
        localObject1[k] = str2;
        k = 78;
        str1 = "";
        m = 77;
        localObject1 = localObject2;
        break;
      case 77:
        localObject1[k] = str2;
        k = 79;
        str1 = "i\002]Sx";
        m = 78;
        localObject1 = localObject2;
        break;
      case 78:
        localObject1[k] = str2;
        k = 80;
        str1 = "t\004EPlw\025TP\003p\031GE";
        m = 79;
        localObject1 = localObject2;
        break;
      case 79:
        localObject1[k] = str2;
        k = 81;
        str1 = "S\004YE0<\007CO,{PCE1l\037_S'<\003EA6i\003\021\rb";
        m = 80;
        localObject1 = localObject2;
        break;
      case 80:
        localObject1[k] = str2;
        k = 82;
        str1 = "";
        m = 81;
        localObject1 = localObject2;
        break;
      case 81:
        localObject1[k] = str2;
        k = 83;
        str1 = "p\037RA6u\037_\032";
        m = 82;
        localObject1 = localObject2;
        break;
      case 82:
        localObject1[k] = str2;
        k = 84;
        str1 = ">KF+p\025_A/yM\023";
        m = 83;
        localObject1 = localObject2;
        break;
      case 83:
        localObject1[k] = str2;
        k = 85;
        str1 = "\037_F.u\023E\032v,I\021\rb";
        m = 84;
        localObject1 = localObject2;
        break;
      case 84:
        localObject1[k] = str2;
        k = 86;
        str1 = "o\025CV'nPWA+p";
        m = 85;
        localObject1 = localObject2;
        break;
      case 85:
        localObject1[k] = str2;
        k = 87;
        str1 = "";
        m = 86;
        localObject1 = localObject2;
        break;
      case 86:
        localObject1[k] = str2;
        k = 88;
        str1 = "";
        m = 87;
        localObject1 = localObject2;
        break;
      case 87:
        localObject1[k] = str2;
        k = 89;
        str1 = "O\025CV'nPTR0s\002\021\rb";
        m = 88;
        localObject1 = localObject2;
        break;
      case 88:
        localObject1[k] = str2;
        k = 90;
        str1 = "L?bt";
        m = 89;
        localObject1 = localObject2;
        break;
      case 89:
        localObject1[k] = str2;
        k = 91;
        str1 = "O\025CV'nPCE1l\037_S'<\026PI.i\002T\032v,@\021\rb";
        m = 90;
        localObject1 = localObject2;
        break;
      case 90:
        localObject1[k] = str2;
        z = localObject2;
        a = Executors.newSingleThreadExecutor();
        b = new Object();
        c = new AtomicInteger();
        return;
        i5 = 28;
        continue;
        i5 = 112;
        continue;
        i5 = 49;
        continue;
        i5 = 32;
      }
    }
  }

  private af()
  {
  }

  private af(Context paramContext)
  {
    String str1 = b.j(paramContext, this.d);
    String str2 = b.i(paramContext, this.e);
    String str3 = b.k(paramContext, this.f);
    CookieManager localCookieManager = new CookieManager();
    j = localCookieManager;
    localCookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
    CookieHandler.setDefault(j);
    this.g = paramContext;
    this.d = str1;
    this.e = str2;
    this.f = str3;
  }

  public static int a(String paramString)
  {
    if (an.a(paramString));
    do
    {
      return -1;
      if (paramString.equalsIgnoreCase(z[48]))
        return 2;
      if (paramString.equalsIgnoreCase(z[47]))
        return 0;
    }
    while (!paramString.equalsIgnoreCase(z[49]));
    return 1;
  }

  // ERROR //
  private ag a(Context paramContext, String paramString1, int paramInt, long paramLong, boolean paramBoolean, File paramFile, String paramString2)
  {
    // Byte code:
    //   0: invokestatic 311	cn/jpush/android/util/ac:a	()V
    //   3: new 313	java/lang/StringBuilder
    //   6: dup
    //   7: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   10: bipush 79
    //   12: aaload
    //   13: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: aload_2
    //   17: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   23: bipush 67
    //   25: aaload
    //   26: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: astore 9
    //   31: aload 7
    //   33: ifnull +677 -> 710
    //   36: aload 7
    //   38: invokevirtual 325	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: astore 10
    //   43: aload 9
    //   45: aload 10
    //   47: invokevirtual 328	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   50: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   53: bipush 55
    //   55: aaload
    //   56: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload 8
    //   61: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   67: bipush 64
    //   69: aaload
    //   70: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: astore 11
    //   75: aload 7
    //   77: ifnull +640 -> 717
    //   80: aload 7
    //   82: invokevirtual 331	java/io/File:getName	()Ljava/lang/String;
    //   85: astore 12
    //   87: aload 11
    //   89: aload 12
    //   91: invokevirtual 328	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   94: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   97: bipush 88
    //   99: aaload
    //   100: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: iload 6
    //   105: invokevirtual 334	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: invokestatic 311	cn/jpush/android/util/ac:a	()V
    //   112: lload 4
    //   114: ldc2_w 335
    //   117: lcmp
    //   118: iflt +12 -> 130
    //   121: lload 4
    //   123: ldc2_w 337
    //   126: lcmp
    //   127: ifle +8 -> 135
    //   130: ldc2_w 339
    //   133: lstore 4
    //   135: invokestatic 346	java/util/UUID:randomUUID	()Ljava/util/UUID;
    //   138: invokevirtual 349	java/util/UUID:toString	()Ljava/lang/String;
    //   141: astore 14
    //   143: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   146: bipush 56
    //   148: aaload
    //   149: astore 15
    //   151: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   154: bipush 66
    //   156: aaload
    //   157: astore 16
    //   159: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   162: bipush 77
    //   164: aaload
    //   165: astore 17
    //   167: aconst_null
    //   168: astore 18
    //   170: aconst_null
    //   171: astore 19
    //   173: iconst_m1
    //   174: istore 20
    //   176: getstatic 269	cn/jpush/android/util/af:j	Ljava/net/CookieManager;
    //   179: ifnonnull +13 -> 192
    //   182: new 266	java/net/CookieManager
    //   185: dup
    //   186: invokespecial 267	java/net/CookieManager:<init>	()V
    //   189: putstatic 269	cn/jpush/android/util/af:j	Ljava/net/CookieManager;
    //   192: iconst_0
    //   193: istore 21
    //   195: aconst_null
    //   196: astore 22
    //   198: aload_1
    //   199: aload_2
    //   200: invokestatic 354	cn/jpush/android/util/s:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   203: astore 42
    //   205: aload 42
    //   207: astore 28
    //   209: aload 28
    //   211: sipush 30000
    //   214: invokevirtual 360	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   217: aload 28
    //   219: sipush 30000
    //   222: invokevirtual 363	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   225: aload 28
    //   227: iconst_1
    //   228: invokevirtual 367	java/net/HttpURLConnection:setDoInput	(Z)V
    //   231: aload 28
    //   233: iconst_1
    //   234: invokevirtual 370	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   237: aload 28
    //   239: iconst_0
    //   240: invokevirtual 373	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   243: aload 28
    //   245: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   248: bipush 90
    //   250: aaload
    //   251: invokevirtual 376	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   254: aload 28
    //   256: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   259: bipush 61
    //   261: aaload
    //   262: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   265: bipush 23
    //   267: aaload
    //   268: invokevirtual 380	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   271: aload 28
    //   273: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   276: bipush 76
    //   278: aaload
    //   279: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   282: bipush 58
    //   284: aaload
    //   285: invokevirtual 383	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: getstatic 388	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   291: invokestatic 393	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   294: bipush 8
    //   296: if_icmpge +19 -> 315
    //   299: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   302: bipush 80
    //   304: aaload
    //   305: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   308: bipush 65
    //   310: aaload
    //   311: invokestatic 399	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   314: pop
    //   315: getstatic 269	cn/jpush/android/util/af:j	Ljava/net/CookieManager;
    //   318: invokevirtual 403	java/net/CookieManager:getCookieStore	()Ljava/net/CookieStore;
    //   321: invokeinterface 409 1 0
    //   326: invokeinterface 415 1 0
    //   331: ifle +31 -> 362
    //   334: aload 28
    //   336: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   339: bipush 75
    //   341: aaload
    //   342: ldc_w 417
    //   345: getstatic 269	cn/jpush/android/util/af:j	Ljava/net/CookieManager;
    //   348: invokevirtual 403	java/net/CookieManager:getCookieStore	()Ljava/net/CookieStore;
    //   351: invokeinterface 409 1 0
    //   356: invokestatic 423	android/text/TextUtils:join	(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;
    //   359: invokevirtual 380	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: aload 28
    //   364: iload 6
    //   366: invokevirtual 426	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   369: new 313	java/lang/StringBuilder
    //   372: dup
    //   373: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   376: bipush 57
    //   378: aaload
    //   379: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   382: aload 7
    //   384: invokevirtual 328	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: invokestatic 311	cn/jpush/android/util/ac:a	()V
    //   391: aload 7
    //   393: ifnull +394 -> 787
    //   396: aload 28
    //   398: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   401: bipush 73
    //   403: aaload
    //   404: new 313	java/lang/StringBuilder
    //   407: dup
    //   408: invokespecial 427	java/lang/StringBuilder:<init>	()V
    //   411: aload 17
    //   413: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   419: bipush 63
    //   421: aaload
    //   422: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: aload 14
    //   427: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   433: invokevirtual 380	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   436: new 430	java/io/DataOutputStream
    //   439: dup
    //   440: aload 28
    //   442: invokevirtual 434	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   445: invokespecial 437	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   448: astore 47
    //   450: new 439	java/lang/StringBuffer
    //   453: dup
    //   454: invokespecial 440	java/lang/StringBuffer:<init>	()V
    //   457: astore 48
    //   459: aload 48
    //   461: aload 15
    //   463: invokevirtual 443	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   466: pop
    //   467: aload 48
    //   469: aload 14
    //   471: invokevirtual 443	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   474: pop
    //   475: aload 48
    //   477: aload 16
    //   479: invokevirtual 443	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   482: pop
    //   483: aload 48
    //   485: new 313	java/lang/StringBuilder
    //   488: dup
    //   489: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   492: bipush 68
    //   494: aaload
    //   495: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   498: aload 8
    //   500: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   506: bipush 84
    //   508: aaload
    //   509: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: aload 7
    //   514: invokevirtual 331	java/io/File:getName	()Ljava/lang/String;
    //   517: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: ldc_w 445
    //   523: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: aload 16
    //   528: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   531: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   534: invokevirtual 443	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   537: pop
    //   538: aload 48
    //   540: new 313	java/lang/StringBuilder
    //   543: dup
    //   544: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   547: bipush 78
    //   549: aaload
    //   550: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   553: aload 16
    //   555: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   558: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   561: invokevirtual 443	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   564: pop
    //   565: aload 48
    //   567: aload 16
    //   569: invokevirtual 443	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   572: pop
    //   573: aload 47
    //   575: aload 48
    //   577: invokevirtual 446	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   580: invokevirtual 450	java/lang/String:getBytes	()[B
    //   583: invokevirtual 454	java/io/DataOutputStream:write	([B)V
    //   586: new 456	java/io/FileInputStream
    //   589: dup
    //   590: aload 7
    //   592: invokespecial 459	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   595: astore 55
    //   597: sipush 1024
    //   600: newarray byte
    //   602: astore 56
    //   604: aload 55
    //   606: aload 56
    //   608: invokevirtual 465	java/io/InputStream:read	([B)I
    //   611: istore 57
    //   613: iload 57
    //   615: iconst_m1
    //   616: if_icmpeq +108 -> 724
    //   619: aload 47
    //   621: aload 56
    //   623: iconst_0
    //   624: iload 57
    //   626: invokevirtual 468	java/io/DataOutputStream:write	([BII)V
    //   629: goto -25 -> 604
    //   632: astore 45
    //   634: aload 19
    //   636: astore 26
    //   638: aload 18
    //   640: astore 24
    //   642: aload 28
    //   644: astore 25
    //   646: invokestatic 470	cn/jpush/android/util/ac:e	()V
    //   649: aload 24
    //   651: ifnull +8 -> 659
    //   654: aload 24
    //   656: invokevirtual 473	java/io/InputStream:close	()V
    //   659: aload 25
    //   661: ifnull +1287 -> 1948
    //   664: aload 25
    //   666: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   669: aload 26
    //   671: astore 19
    //   673: aload 24
    //   675: astore 18
    //   677: aload 25
    //   679: astore 30
    //   681: iload 20
    //   683: sipush 404
    //   686: if_icmpeq +18 -> 704
    //   689: iload 20
    //   691: sipush 200
    //   694: if_icmpeq +605 -> 1299
    //   697: aload_1
    //   698: invokestatic 479	cn/jpush/android/util/b:b	(Landroid/content/Context;)Z
    //   701: ifne +598 -> 1299
    //   704: aconst_null
    //   705: astore 31
    //   707: aload 31
    //   709: areturn
    //   710: aload 7
    //   712: astore 10
    //   714: goto -671 -> 43
    //   717: aload 7
    //   719: astore 12
    //   721: goto -634 -> 87
    //   724: aload 55
    //   726: invokevirtual 473	java/io/InputStream:close	()V
    //   729: aload 47
    //   731: aload 16
    //   733: invokevirtual 450	java/lang/String:getBytes	()[B
    //   736: invokevirtual 454	java/io/DataOutputStream:write	([B)V
    //   739: aload 47
    //   741: new 313	java/lang/StringBuilder
    //   744: dup
    //   745: invokespecial 427	java/lang/StringBuilder:<init>	()V
    //   748: aload 15
    //   750: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: aload 14
    //   755: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: aload 15
    //   760: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: aload 16
    //   765: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   768: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   771: invokevirtual 450	java/lang/String:getBytes	()[B
    //   774: invokevirtual 454	java/io/DataOutputStream:write	([B)V
    //   777: aload 47
    //   779: invokevirtual 482	java/io/DataOutputStream:flush	()V
    //   782: aload 47
    //   784: invokevirtual 483	java/io/DataOutputStream:close	()V
    //   787: aload 28
    //   789: invokevirtual 486	java/net/HttpURLConnection:getResponseCode	()I
    //   792: istore 58
    //   794: iload 58
    //   796: istore 38
    //   798: aload 28
    //   800: invokevirtual 490	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   803: invokestatic 493	cn/jpush/android/util/af:a	(Ljava/util/Map;)V
    //   806: new 313	java/lang/StringBuilder
    //   809: dup
    //   810: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   813: bipush 62
    //   815: aaload
    //   816: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   819: iload 38
    //   821: invokevirtual 496	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   824: pop
    //   825: invokestatic 311	cn/jpush/android/util/ac:a	()V
    //   828: iload 38
    //   830: sipush 302
    //   833: if_icmpne +128 -> 961
    //   836: aload 28
    //   838: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   841: bipush 69
    //   843: aaload
    //   844: invokevirtual 500	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   847: astore 62
    //   849: new 313	java/lang/StringBuilder
    //   852: dup
    //   853: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   856: bipush 83
    //   858: aaload
    //   859: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   862: aload 62
    //   864: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   867: pop
    //   868: invokestatic 311	cn/jpush/android/util/ac:a	()V
    //   871: iload_3
    //   872: iflt +57 -> 929
    //   875: aload_0
    //   876: aload_1
    //   877: aload 62
    //   879: iload_3
    //   880: iconst_1
    //   881: isub
    //   882: lconst_0
    //   883: iload 6
    //   885: aconst_null
    //   886: aconst_null
    //   887: invokespecial 502	cn/jpush/android/util/af:a	(Landroid/content/Context;Ljava/lang/String;IJZLjava/io/File;Ljava/lang/String;)Lcn/jpush/android/util/ag;
    //   890: astore 64
    //   892: aload 64
    //   894: astore 31
    //   896: aload 18
    //   898: ifnull +8 -> 906
    //   901: aload 18
    //   903: invokevirtual 473	java/io/InputStream:close	()V
    //   906: aload 28
    //   908: ifnull -201 -> 707
    //   911: aload 28
    //   913: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   916: aload 31
    //   918: areturn
    //   919: astore 65
    //   921: aload 65
    //   923: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   926: goto -20 -> 906
    //   929: aload 18
    //   931: ifnull +8 -> 939
    //   934: aload 18
    //   936: invokevirtual 473	java/io/InputStream:close	()V
    //   939: aload 28
    //   941: ifnull +8 -> 949
    //   944: aload 28
    //   946: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   949: aconst_null
    //   950: areturn
    //   951: astore 66
    //   953: aload 66
    //   955: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   958: goto -19 -> 939
    //   961: iload 38
    //   963: sipush 200
    //   966: if_icmpne +113 -> 1079
    //   969: aload 28
    //   971: invokevirtual 509	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   974: astore 68
    //   976: aload 28
    //   978: invokevirtual 490	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   981: astore 71
    //   983: new 27	java/lang/String
    //   986: dup
    //   987: aload 68
    //   989: invokestatic 514	cn/jpush/android/util/am:a	(Ljava/io/InputStream;)[B
    //   992: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   995: bipush 23
    //   997: aaload
    //   998: invokespecial 517	java/lang/String:<init>	([BLjava/lang/String;)V
    //   1001: astore 72
    //   1003: aload 68
    //   1005: ifnull +8 -> 1013
    //   1008: aload 68
    //   1010: invokevirtual 473	java/io/InputStream:close	()V
    //   1013: aload 28
    //   1015: ifnull +8 -> 1023
    //   1018: aload 28
    //   1020: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   1023: iload 38
    //   1025: sipush 200
    //   1028: if_icmplt +345 -> 1373
    //   1031: iload 38
    //   1033: sipush 300
    //   1036: if_icmpge +337 -> 1373
    //   1039: aload 72
    //   1041: ifnonnull +14 -> 1055
    //   1044: invokestatic 519	cn/jpush/android/util/ac:g	()V
    //   1047: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1050: bipush 74
    //   1052: aaload
    //   1053: astore 72
    //   1055: new 521	cn/jpush/android/util/ag
    //   1058: dup
    //   1059: iload 38
    //   1061: aload 71
    //   1063: aload 72
    //   1065: invokespecial 524	cn/jpush/android/util/ag:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   1068: areturn
    //   1069: astore 82
    //   1071: aload 82
    //   1073: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   1076: goto -63 -> 1013
    //   1079: aload 18
    //   1081: ifnull +8 -> 1089
    //   1084: aload 18
    //   1086: invokevirtual 473	java/io/InputStream:close	()V
    //   1089: aload 28
    //   1091: ifnull +839 -> 1930
    //   1094: aload 28
    //   1096: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   1099: iload 38
    //   1101: istore 20
    //   1103: aload 28
    //   1105: astore 30
    //   1107: goto -426 -> 681
    //   1110: astore 67
    //   1112: aload 67
    //   1114: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   1117: goto -28 -> 1089
    //   1120: astore 34
    //   1122: aload 34
    //   1124: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   1127: goto -468 -> 659
    //   1130: astore 84
    //   1132: iload 38
    //   1134: istore 20
    //   1136: aload 71
    //   1138: astore 19
    //   1140: aload 68
    //   1142: astore 18
    //   1144: invokestatic 519	cn/jpush/android/util/ac:g	()V
    //   1147: aload 18
    //   1149: ifnull +8 -> 1157
    //   1152: aload 18
    //   1154: invokevirtual 473	java/io/InputStream:close	()V
    //   1157: aload 28
    //   1159: ifnull +782 -> 1941
    //   1162: aload 28
    //   1164: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   1167: aload 28
    //   1169: astore 30
    //   1171: goto -490 -> 681
    //   1174: astore 36
    //   1176: aload 36
    //   1178: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   1181: goto -24 -> 1157
    //   1184: astore 39
    //   1186: aload 71
    //   1188: astore 19
    //   1190: aload 68
    //   1192: astore 18
    //   1194: new 313	java/lang/StringBuilder
    //   1197: dup
    //   1198: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1201: bipush 72
    //   1203: aaload
    //   1204: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1207: aload 39
    //   1209: invokevirtual 525	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   1212: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1215: pop
    //   1216: invokestatic 470	cn/jpush/android/util/ac:e	()V
    //   1219: aload 18
    //   1221: ifnull +8 -> 1229
    //   1224: aload 18
    //   1226: invokevirtual 473	java/io/InputStream:close	()V
    //   1229: aload 28
    //   1231: ifnull +699 -> 1930
    //   1234: aload 28
    //   1236: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   1239: iload 38
    //   1241: istore 20
    //   1243: aload 28
    //   1245: astore 30
    //   1247: goto -566 -> 681
    //   1250: astore 41
    //   1252: aload 41
    //   1254: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   1257: goto -28 -> 1229
    //   1260: astore 27
    //   1262: aload 68
    //   1264: astore 18
    //   1266: aload 18
    //   1268: ifnull +8 -> 1276
    //   1271: aload 18
    //   1273: invokevirtual 473	java/io/InputStream:close	()V
    //   1276: aload 28
    //   1278: ifnull +8 -> 1286
    //   1281: aload 28
    //   1283: invokevirtual 476	java/net/HttpURLConnection:disconnect	()V
    //   1286: aload 27
    //   1288: athrow
    //   1289: astore 29
    //   1291: aload 29
    //   1293: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   1296: goto -20 -> 1276
    //   1299: iload 21
    //   1301: iconst_3
    //   1302: if_icmplt +20 -> 1322
    //   1305: new 521	cn/jpush/android/util/ag
    //   1308: dup
    //   1309: iconst_m1
    //   1310: aload 19
    //   1312: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1315: bipush 60
    //   1317: aaload
    //   1318: invokespecial 524	cn/jpush/android/util/ag:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   1321: areturn
    //   1322: iload 21
    //   1324: iconst_1
    //   1325: iadd
    //   1326: istore 32
    //   1328: lload 4
    //   1330: invokestatic 529	java/lang/Thread:sleep	(J)V
    //   1333: iload 32
    //   1335: istore 21
    //   1337: aload 30
    //   1339: astore 22
    //   1341: goto -1143 -> 198
    //   1344: astore 33
    //   1346: iload 32
    //   1348: istore 21
    //   1350: aload 30
    //   1352: astore 22
    //   1354: goto -1156 -> 198
    //   1357: astore 81
    //   1359: invokestatic 531	cn/jpush/android/util/ac:f	()V
    //   1362: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1365: bipush 74
    //   1367: aaload
    //   1368: astore 72
    //   1370: goto -315 -> 1055
    //   1373: iload 38
    //   1375: sipush 400
    //   1378: if_icmplt +251 -> 1629
    //   1381: iload 38
    //   1383: sipush 500
    //   1386: if_icmpge +243 -> 1629
    //   1389: sipush 400
    //   1392: iload 38
    //   1394: if_icmpne +35 -> 1429
    //   1397: new 313	java/lang/StringBuilder
    //   1400: dup
    //   1401: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1404: bipush 91
    //   1406: aaload
    //   1407: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1410: aload_2
    //   1411: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1414: pop
    //   1415: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1418: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1421: bipush 86
    //   1423: aaload
    //   1424: astore 72
    //   1426: goto -371 -> 1055
    //   1429: sipush 401
    //   1432: iload 38
    //   1434: if_icmpne +35 -> 1469
    //   1437: new 313	java/lang/StringBuilder
    //   1440: dup
    //   1441: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1444: bipush 82
    //   1446: aaload
    //   1447: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1450: aload_2
    //   1451: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1454: pop
    //   1455: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1458: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1461: bipush 74
    //   1463: aaload
    //   1464: astore 72
    //   1466: goto -411 -> 1055
    //   1469: sipush 404
    //   1472: iload 38
    //   1474: if_icmpne +35 -> 1509
    //   1477: new 313	java/lang/StringBuilder
    //   1480: dup
    //   1481: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1484: bipush 87
    //   1486: aaload
    //   1487: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1490: aload_2
    //   1491: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1494: pop
    //   1495: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1498: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1501: bipush 74
    //   1503: aaload
    //   1504: astore 72
    //   1506: goto -451 -> 1055
    //   1509: sipush 406
    //   1512: iload 38
    //   1514: if_icmpne +35 -> 1549
    //   1517: new 313	java/lang/StringBuilder
    //   1520: dup
    //   1521: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1524: bipush 70
    //   1526: aaload
    //   1527: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1530: aload_2
    //   1531: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1534: pop
    //   1535: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1538: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1541: bipush 74
    //   1543: aaload
    //   1544: astore 72
    //   1546: goto -491 -> 1055
    //   1549: sipush 408
    //   1552: iload 38
    //   1554: if_icmpne +35 -> 1589
    //   1557: new 313	java/lang/StringBuilder
    //   1560: dup
    //   1561: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1564: bipush 59
    //   1566: aaload
    //   1567: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1570: aload_2
    //   1571: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1574: pop
    //   1575: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1578: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1581: bipush 74
    //   1583: aaload
    //   1584: astore 72
    //   1586: goto -531 -> 1055
    //   1589: sipush 409
    //   1592: iload 38
    //   1594: if_icmpne +330 -> 1924
    //   1597: new 313	java/lang/StringBuilder
    //   1600: dup
    //   1601: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1604: bipush 85
    //   1606: aaload
    //   1607: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1610: aload_2
    //   1611: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1614: pop
    //   1615: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1618: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1621: bipush 74
    //   1623: aaload
    //   1624: astore 72
    //   1626: goto -571 -> 1055
    //   1629: iload 38
    //   1631: sipush 500
    //   1634: if_icmplt +57 -> 1691
    //   1637: iload 38
    //   1639: sipush 600
    //   1642: if_icmpge +49 -> 1691
    //   1645: new 313	java/lang/StringBuilder
    //   1648: dup
    //   1649: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1652: bipush 89
    //   1654: aaload
    //   1655: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1658: iload 38
    //   1660: invokevirtual 496	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1663: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1666: bipush 71
    //   1668: aaload
    //   1669: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1672: aload_2
    //   1673: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1676: pop
    //   1677: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1680: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1683: bipush 74
    //   1685: aaload
    //   1686: astore 72
    //   1688: goto -633 -> 1055
    //   1691: new 313	java/lang/StringBuilder
    //   1694: dup
    //   1695: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1698: bipush 81
    //   1700: aaload
    //   1701: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1704: iload 38
    //   1706: invokevirtual 496	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1709: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1712: bipush 71
    //   1714: aaload
    //   1715: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1718: aload_2
    //   1719: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1722: pop
    //   1723: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   1726: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   1729: bipush 74
    //   1731: aaload
    //   1732: astore 72
    //   1734: goto -679 -> 1055
    //   1737: astore 27
    //   1739: aload 24
    //   1741: astore 18
    //   1743: aload 25
    //   1745: astore 28
    //   1747: goto -481 -> 1266
    //   1750: astore 27
    //   1752: goto -486 -> 1266
    //   1755: astore 27
    //   1757: aload 22
    //   1759: astore 28
    //   1761: goto -495 -> 1266
    //   1764: astore 37
    //   1766: iload 20
    //   1768: istore 38
    //   1770: aload 22
    //   1772: astore 28
    //   1774: aload 37
    //   1776: astore 39
    //   1778: goto -584 -> 1194
    //   1781: astore 44
    //   1783: iload 20
    //   1785: istore 38
    //   1787: aload 44
    //   1789: astore 39
    //   1791: goto -597 -> 1194
    //   1794: astore 39
    //   1796: goto -602 -> 1194
    //   1799: astore 39
    //   1801: aload 68
    //   1803: astore 18
    //   1805: goto -611 -> 1194
    //   1808: astore 35
    //   1810: aload 22
    //   1812: astore 28
    //   1814: goto -670 -> 1144
    //   1817: astore 43
    //   1819: goto -675 -> 1144
    //   1822: astore 60
    //   1824: iload 38
    //   1826: istore 20
    //   1828: goto -684 -> 1144
    //   1831: astore 70
    //   1833: iload 38
    //   1835: istore 20
    //   1837: aload 68
    //   1839: astore 18
    //   1841: goto -697 -> 1144
    //   1844: astore 83
    //   1846: iload 38
    //   1848: istore 20
    //   1850: aload 28
    //   1852: astore 25
    //   1854: aload 71
    //   1856: astore 26
    //   1858: aload 68
    //   1860: astore 24
    //   1862: goto -1216 -> 646
    //   1865: astore 23
    //   1867: aload 18
    //   1869: astore 24
    //   1871: aload 22
    //   1873: astore 25
    //   1875: aload 19
    //   1877: astore 26
    //   1879: goto -1233 -> 646
    //   1882: astore 59
    //   1884: iload 38
    //   1886: istore 20
    //   1888: aload 19
    //   1890: astore 26
    //   1892: aload 18
    //   1894: astore 24
    //   1896: aload 28
    //   1898: astore 25
    //   1900: goto -1254 -> 646
    //   1903: astore 69
    //   1905: iload 38
    //   1907: istore 20
    //   1909: aload 68
    //   1911: astore 24
    //   1913: aload 28
    //   1915: astore 25
    //   1917: aload 19
    //   1919: astore 26
    //   1921: goto -1275 -> 646
    //   1924: aconst_null
    //   1925: astore 72
    //   1927: goto -872 -> 1055
    //   1930: iload 38
    //   1932: istore 20
    //   1934: aload 28
    //   1936: astore 30
    //   1938: goto -1257 -> 681
    //   1941: aload 28
    //   1943: astore 30
    //   1945: goto -1264 -> 681
    //   1948: aload 26
    //   1950: astore 19
    //   1952: aload 24
    //   1954: astore 18
    //   1956: aload 25
    //   1958: astore 30
    //   1960: goto -1279 -> 681
    //
    // Exception table:
    //   from	to	target	type
    //   209	315	632	javax/net/ssl/SSLPeerUnverifiedException
    //   315	362	632	javax/net/ssl/SSLPeerUnverifiedException
    //   362	391	632	javax/net/ssl/SSLPeerUnverifiedException
    //   396	604	632	javax/net/ssl/SSLPeerUnverifiedException
    //   604	613	632	javax/net/ssl/SSLPeerUnverifiedException
    //   619	629	632	javax/net/ssl/SSLPeerUnverifiedException
    //   724	787	632	javax/net/ssl/SSLPeerUnverifiedException
    //   787	794	632	javax/net/ssl/SSLPeerUnverifiedException
    //   901	906	919	java/io/IOException
    //   934	939	951	java/io/IOException
    //   1008	1013	1069	java/io/IOException
    //   1084	1089	1110	java/io/IOException
    //   654	659	1120	java/io/IOException
    //   983	1003	1130	java/lang/Exception
    //   1152	1157	1174	java/io/IOException
    //   983	1003	1184	java/lang/AssertionError
    //   1224	1229	1250	java/io/IOException
    //   976	983	1260	finally
    //   983	1003	1260	finally
    //   1271	1276	1289	java/io/IOException
    //   1328	1333	1344	java/lang/InterruptedException
    //   1044	1055	1357	java/lang/Exception
    //   646	649	1737	finally
    //   209	315	1750	finally
    //   315	362	1750	finally
    //   362	391	1750	finally
    //   396	604	1750	finally
    //   604	613	1750	finally
    //   619	629	1750	finally
    //   724	787	1750	finally
    //   787	794	1750	finally
    //   798	828	1750	finally
    //   836	871	1750	finally
    //   875	892	1750	finally
    //   969	976	1750	finally
    //   1144	1147	1750	finally
    //   1194	1219	1750	finally
    //   198	205	1755	finally
    //   198	205	1764	java/lang/AssertionError
    //   209	315	1781	java/lang/AssertionError
    //   315	362	1781	java/lang/AssertionError
    //   362	391	1781	java/lang/AssertionError
    //   396	604	1781	java/lang/AssertionError
    //   604	613	1781	java/lang/AssertionError
    //   619	629	1781	java/lang/AssertionError
    //   724	787	1781	java/lang/AssertionError
    //   787	794	1781	java/lang/AssertionError
    //   798	828	1794	java/lang/AssertionError
    //   836	871	1794	java/lang/AssertionError
    //   875	892	1794	java/lang/AssertionError
    //   969	976	1794	java/lang/AssertionError
    //   976	983	1799	java/lang/AssertionError
    //   198	205	1808	java/lang/Exception
    //   209	315	1817	java/lang/Exception
    //   315	362	1817	java/lang/Exception
    //   362	391	1817	java/lang/Exception
    //   396	604	1817	java/lang/Exception
    //   604	613	1817	java/lang/Exception
    //   619	629	1817	java/lang/Exception
    //   724	787	1817	java/lang/Exception
    //   787	794	1817	java/lang/Exception
    //   798	828	1822	java/lang/Exception
    //   836	871	1822	java/lang/Exception
    //   875	892	1822	java/lang/Exception
    //   969	976	1822	java/lang/Exception
    //   976	983	1831	java/lang/Exception
    //   983	1003	1844	javax/net/ssl/SSLPeerUnverifiedException
    //   198	205	1865	javax/net/ssl/SSLPeerUnverifiedException
    //   798	828	1882	javax/net/ssl/SSLPeerUnverifiedException
    //   836	871	1882	javax/net/ssl/SSLPeerUnverifiedException
    //   875	892	1882	javax/net/ssl/SSLPeerUnverifiedException
    //   969	976	1882	javax/net/ssl/SSLPeerUnverifiedException
    //   976	983	1903	javax/net/ssl/SSLPeerUnverifiedException
  }

  private String a(int paramInt)
  {
    this.i = cn.jpush.android.a.d(this.g, paramInt);
    new StringBuilder(z[34]).append(this.i);
    ac.a();
    return this.i;
  }

  private String a(String paramString, ag paramag)
  {
    if (a(this.g, paramag))
      return d(paramString);
    return null;
  }

  private String a(TreeMap<String, String> paramTreeMap)
  {
    if (paramTreeMap.size() == 0)
    {
      ac.d();
      return null;
    }
    Iterator localIterator = paramTreeMap.entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator.hasNext())
      localStringBuilder.append(((Map.Entry)localIterator.next()).getValue());
    String str1 = cn.jpush.android.a.m(this.g);
    new StringBuilder(z[6]).append(str1);
    ac.a();
    String str2 = b.a(localStringBuilder.toString() + str1).toUpperCase();
    new StringBuilder(z[7]).append(localStringBuilder);
    ac.a();
    new StringBuilder(z[5]).append(str2);
    ac.a();
    return str2;
  }

  public static void a(Context paramContext)
  {
    ac.a();
    if (c.get() >= 2)
    {
      ac.a();
      return;
    }
    a.execute(new af(paramContext));
  }

  private static void a(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get(z[46]);
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        j.getCookieStore().add(null, (HttpCookie)HttpCookie.parse(str).get(0));
      }
    }
  }

  // ERROR //
  private static boolean a(Context paramContext, ag paramag)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +8 -> 9
    //   4: invokestatic 553	cn/jpush/android/util/ac:d	()V
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: ifnull +24 -> 34
    //   13: new 313	java/lang/StringBuilder
    //   16: dup
    //   17: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   20: bipush 39
    //   22: aaload
    //   23: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_1
    //   27: invokevirtual 328	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: invokestatic 311	cn/jpush/android/util/ac:a	()V
    //   34: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   37: bipush 18
    //   39: aaload
    //   40: astore_2
    //   41: new 313	java/lang/StringBuilder
    //   44: dup
    //   45: ldc_w 625
    //   48: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   51: astore_3
    //   52: aload_1
    //   53: getfield 628	cn/jpush/android/util/ag:c	Ljava/util/Map;
    //   56: ifnull +185 -> 241
    //   59: aload_1
    //   60: getfield 628	cn/jpush/android/util/ag:c	Ljava/util/Map;
    //   63: invokeinterface 629 1 0
    //   68: ifle +173 -> 241
    //   71: aload_1
    //   72: getfield 628	cn/jpush/android/util/ag:c	Ljava/util/Map;
    //   75: invokeinterface 630 1 0
    //   80: invokeinterface 563 1 0
    //   85: astore 25
    //   87: aload 25
    //   89: invokeinterface 569 1 0
    //   94: ifeq +147 -> 241
    //   97: aload 25
    //   99: invokeinterface 573 1 0
    //   104: checkcast 575	java/util/Map$Entry
    //   107: astore 26
    //   109: aload 26
    //   111: invokeinterface 633 1 0
    //   116: ifnull +27 -> 143
    //   119: aload_3
    //   120: aload 26
    //   122: invokeinterface 633 1 0
    //   127: checkcast 27	java/lang/String
    //   130: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   136: bipush 45
    //   138: aaload
    //   139: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload 26
    //   145: invokeinterface 578 1 0
    //   150: checkcast 411	java/util/List
    //   153: invokeinterface 604 1 0
    //   158: astore 27
    //   160: aload 27
    //   162: invokeinterface 569 1 0
    //   167: ifeq +63 -> 230
    //   170: aload_3
    //   171: aload 27
    //   173: invokeinterface 573 1 0
    //   178: checkcast 27	java/lang/String
    //   181: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload 27
    //   187: invokeinterface 569 1 0
    //   192: ifeq +38 -> 230
    //   195: aload_3
    //   196: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   199: bipush 40
    //   201: aaload
    //   202: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: aload 27
    //   207: invokeinterface 573 1 0
    //   212: checkcast 27	java/lang/String
    //   215: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: goto -34 -> 185
    //   222: astore 32
    //   224: invokestatic 635	cn/jpush/android/util/ac:h	()V
    //   227: goto -193 -> 34
    //   230: aload_3
    //   231: ldc_w 637
    //   234: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: goto -151 -> 87
    //   241: aload_3
    //   242: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   245: bipush 44
    //   247: aaload
    //   248: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: aload_1
    //   253: getfield 639	cn/jpush/android/util/ag:b	Ljava/lang/String;
    //   256: invokestatic 643	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   259: ifne +12 -> 271
    //   262: aload_3
    //   263: aload_1
    //   264: getfield 639	cn/jpush/android/util/ag:b	Ljava/lang/String;
    //   267: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: pop
    //   271: aload_0
    //   272: aload_2
    //   273: invokevirtual 648	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   276: pop
    //   277: aload_0
    //   278: aload_2
    //   279: iconst_0
    //   280: invokevirtual 652	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   283: astore 16
    //   285: aload 16
    //   287: astore 6
    //   289: aload 6
    //   291: aload_3
    //   292: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   295: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   298: bipush 23
    //   300: aaload
    //   301: invokevirtual 655	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   304: invokevirtual 658	java/io/FileOutputStream:write	([B)V
    //   307: aload 6
    //   309: invokestatic 663	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   312: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   315: bipush 24
    //   317: aaload
    //   318: astore 19
    //   320: aload_0
    //   321: aload 19
    //   323: invokevirtual 648	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   326: pop
    //   327: new 313	java/lang/StringBuilder
    //   330: dup
    //   331: invokespecial 427	java/lang/StringBuilder:<init>	()V
    //   334: aload_0
    //   335: invokevirtual 667	android/content/Context:getFilesDir	()Ljava/io/File;
    //   338: invokevirtual 328	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   341: getstatic 670	java/io/File:separator	Ljava/lang/String;
    //   344: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   350: astore 21
    //   352: new 672	java/util/ArrayList
    //   355: dup
    //   356: invokespecial 673	java/util/ArrayList:<init>	()V
    //   359: astore 22
    //   361: aload 22
    //   363: new 322	java/io/File
    //   366: dup
    //   367: new 313	java/lang/StringBuilder
    //   370: dup
    //   371: invokespecial 427	java/lang/StringBuilder:<init>	()V
    //   374: aload 21
    //   376: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   382: bipush 18
    //   384: aaload
    //   385: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   391: invokespecial 674	java/io/File:<init>	(Ljava/lang/String;)V
    //   394: invokeinterface 677 2 0
    //   399: pop
    //   400: aload 22
    //   402: new 322	java/io/File
    //   405: dup
    //   406: new 313	java/lang/StringBuilder
    //   409: dup
    //   410: invokespecial 427	java/lang/StringBuilder:<init>	()V
    //   413: aload 21
    //   415: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: aload 19
    //   420: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: invokevirtual 428	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   426: invokespecial 674	java/io/File:<init>	(Ljava/lang/String;)V
    //   429: invokestatic 682	cn/jpush/android/util/r:a	(Ljava/util/Collection;Ljava/io/File;)V
    //   432: iconst_1
    //   433: istore 18
    //   435: iload 18
    //   437: ireturn
    //   438: astore 13
    //   440: aconst_null
    //   441: astore 6
    //   443: new 313	java/lang/StringBuilder
    //   446: dup
    //   447: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   450: bipush 35
    //   452: aaload
    //   453: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   456: aload_2
    //   457: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   463: bipush 37
    //   465: aaload
    //   466: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: aload 13
    //   471: invokevirtual 685	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   474: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   481: aload 6
    //   483: invokestatic 663	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   486: iconst_0
    //   487: ireturn
    //   488: astore 11
    //   490: aconst_null
    //   491: astore 6
    //   493: new 313	java/lang/StringBuilder
    //   496: dup
    //   497: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   500: bipush 43
    //   502: aaload
    //   503: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   506: aload_2
    //   507: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   513: bipush 38
    //   515: aaload
    //   516: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: aload 11
    //   521: invokevirtual 686	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   524: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: pop
    //   528: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   531: aload 6
    //   533: invokestatic 663	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   536: iconst_0
    //   537: ireturn
    //   538: astore 9
    //   540: aconst_null
    //   541: astore 6
    //   543: new 313	java/lang/StringBuilder
    //   546: dup
    //   547: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   550: bipush 42
    //   552: aaload
    //   553: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   556: aload_2
    //   557: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   563: bipush 38
    //   565: aaload
    //   566: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: aload 9
    //   571: invokevirtual 687	java/io/IOException:getMessage	()Ljava/lang/String;
    //   574: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: pop
    //   578: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   581: aload 6
    //   583: invokestatic 663	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   586: iconst_0
    //   587: ireturn
    //   588: astore 7
    //   590: aconst_null
    //   591: astore 6
    //   593: new 313	java/lang/StringBuilder
    //   596: dup
    //   597: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   600: bipush 36
    //   602: aaload
    //   603: invokespecial 316	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   606: aload_2
    //   607: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: getstatic 225	cn/jpush/android/util/af:z	[Ljava/lang/String;
    //   613: bipush 41
    //   615: aaload
    //   616: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   619: aload 7
    //   621: invokevirtual 688	java/lang/NullPointerException:getMessage	()Ljava/lang/String;
    //   624: invokevirtual 320	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: pop
    //   628: invokestatic 533	cn/jpush/android/util/ac:b	()V
    //   631: aload 6
    //   633: invokestatic 663	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   636: iconst_0
    //   637: ireturn
    //   638: astore 5
    //   640: aconst_null
    //   641: astore 6
    //   643: aload 6
    //   645: invokestatic 663	cn/jpush/android/util/ah:a	(Ljava/io/Closeable;)V
    //   648: aload 5
    //   650: athrow
    //   651: astore 17
    //   653: aload 17
    //   655: invokevirtual 505	java/io/IOException:printStackTrace	()V
    //   658: iconst_0
    //   659: istore 18
    //   661: goto -226 -> 435
    //   664: astore 5
    //   666: goto -23 -> 643
    //   669: astore 7
    //   671: goto -78 -> 593
    //   674: astore 9
    //   676: goto -133 -> 543
    //   679: astore 11
    //   681: goto -188 -> 493
    //   684: astore 13
    //   686: goto -243 -> 443
    //
    // Exception table:
    //   from	to	target	type
    //   13	34	222	java/lang/Exception
    //   271	285	438	java/io/FileNotFoundException
    //   271	285	488	java/io/UnsupportedEncodingException
    //   271	285	538	java/io/IOException
    //   271	285	588	java/lang/NullPointerException
    //   271	285	638	finally
    //   312	432	651	java/io/IOException
    //   289	307	664	finally
    //   443	481	664	finally
    //   493	531	664	finally
    //   543	581	664	finally
    //   593	631	664	finally
    //   289	307	669	java/lang/NullPointerException
    //   289	307	674	java/io/IOException
    //   289	307	679	java/io/UnsupportedEncodingException
    //   289	307	684	java/io/FileNotFoundException
  }

  private boolean a(String paramString1, String paramString2, String paramString3)
  {
    new StringBuilder(z[13]).append(paramString1).append(z[21]).append(paramString2).append(z[22]).append(paramString3);
    ac.a();
    TreeMap localTreeMap = new TreeMap();
    if (!an.a(paramString1))
      localTreeMap.put(z[19], paramString1);
    if (!an.a(paramString2))
      localTreeMap.put(z[16], paramString2);
    if (!an.a(paramString3))
      localTreeMap.put(z[14], paramString3);
    localTreeMap.put(z[26], cn.jpush.android.a.k(this.g));
    localTreeMap.put(z[10], cn.jpush.android.a.l(this.g));
    localTreeMap.put(z[8], m.b());
    localTreeMap.put(z[17], a(localTreeMap));
    Iterator localIterator = localTreeMap.entrySet().iterator();
    Object localObject1 = "";
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      try
      {
        String str2 = (String)localObject1 + "&" + (String)localEntry.getKey() + "=" + URLEncoder.encode((String)localEntry.getValue(), z[23]);
        localObject1 = str2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
    new StringBuilder(z[12]).append((String)localObject1);
    ac.a();
    ag localag;
    try
    {
      localag = a(this.g, this.i + z[9] + (String)localObject1, 10, 30000L, false, null, null);
      new StringBuilder(z[11]).append(localag.a).append(z[15]).append(localag.b);
      ac.a();
      if (localag.a != 200)
        return false;
    }
    catch (Throwable localThrowable1)
    {
      return false;
    }
    JSONObject localJSONObject = c(localag.b);
    if (localJSONObject != null)
      if (localJSONObject.optInt(z[25], -1) != 200)
        return false;
    label603: for (Object localObject4 = b(localJSONObject.optString(z[20])); ; localObject4 = null)
    {
      while (true)
        if (!TextUtils.isEmpty((java.lang.CharSequence)localObject4))
        {
          e((String)localObject4);
          return true;
          if ((localag.c == null) && (TextUtils.isEmpty(localag.b)))
            break label603;
          synchronized (b)
          {
            this.h = 0;
            try
            {
              String str1 = a((String)localObject1, localag);
              localObject4 = str1;
              this.g.deleteFile(z[18]);
              this.g.deleteFile(z[24]);
              continue;
              localObject3 = finally;
              throw localObject3;
            }
            catch (Throwable localThrowable2)
            {
              while (true)
                localObject4 = null;
            }
          }
        }
      return false;
    }
  }

  public static String b(Context paramContext)
  {
    if (paramContext == null)
    {
      ac.d();
      return "";
    }
    String str1 = b.j(paramContext, "");
    String str2 = b.i(paramContext, "");
    String str3 = b.k(paramContext, "");
    String str4 = b.a(str1 + str2 + str3);
    new StringBuilder(z[50]).append(str4);
    ac.a();
    return str4;
  }

  private String b(String paramString)
  {
    String str = f(paramString);
    new StringBuilder(z[53]).append(str);
    ac.a();
    if (an.a(str))
    {
      ac.d();
      return null;
    }
    if (!ae.f.matcher(str).matches())
    {
      ac.d();
      return null;
    }
    return str;
  }

  private static JSONObject c(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      return null;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  private String d(String paramString)
  {
    new StringBuilder(z[51]).append(paramString);
    ac.b();
    if (TextUtils.isEmpty(paramString))
      ac.d();
    while (true)
    {
      return null;
      try
      {
        ag localag = a(this.g, this.i + z[9] + paramString, 10, 30000L, false, new File(this.g.getFilesDir() + File.separator + z[24]), z[52]);
        new StringBuilder(z[11]).append(localag.a).append(z[15]).append(localag.b);
        ac.a();
        if (localag.a == 200)
        {
          JSONObject localJSONObject = c(localag.b);
          if (localJSONObject != null)
          {
            if (localJSONObject.optInt(z[25], -1) != 200);
          }
          else
            for (Object localObject = b(localJSONObject.optString(z[20])); ; localObject = null)
              while (true)
              {
                return localObject;
                if ((localag.c != null) || (!TextUtils.isEmpty(localag.b)))
                {
                  if (this.h > 4)
                    break;
                  this.h = (1 + this.h);
                  try
                  {
                    String str = a(paramString, localag);
                    localObject = str;
                  }
                  catch (Throwable localThrowable2)
                  {
                  }
                }
              }
        }
      }
      catch (Throwable localThrowable1)
      {
      }
    }
    return null;
  }

  private void e(String paramString)
  {
    new StringBuilder(z[27]).append(paramString);
    ac.a();
    cn.jpush.android.a.i(this.g, paramString);
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      localJSONObject1.put(z[20], paramString);
      if (!an.a(this.d))
        localJSONObject1.put(z[19], this.d);
      if (!an.a(this.f))
        localJSONObject1.put(z[14], this.f);
      if (!an.a(this.e))
        localJSONObject1.put(z[16], this.e);
      String str1 = localJSONObject1.toString();
      localObject = str1;
      try
      {
        String str2 = cn.jpush.android.a.o((String)localObject);
        localObject = str2;
        if (!an.a((String)localObject))
        {
          JSONObject localJSONObject2 = new JSONObject();
          localJSONObject2.put(z[29], localObject);
          localJSONObject2.put(z[33], cn.jpush.android.a.m());
          localJSONObject2.put(z[30], z[32]);
          new StringBuilder(z[28]).append((String)localObject);
          ac.a();
          new StringBuilder(z[31]).append(localJSONObject2.toString());
          ac.a();
          i.a(this.g, localJSONObject2);
          cn.jpush.android.a.d(this.g, false);
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
          localException.printStackTrace();
      }
    }
    catch (JSONException localJSONException)
    {
      Object localObject;
      ac.i();
    }
  }

  private String f(String paramString)
  {
    try
    {
      String str = a.a(paramString, cn.jpush.android.a.m(this.g).substring(0, 16));
      return str;
    }
    catch (Exception localException)
    {
      new StringBuilder(z[54]).append(localException.getMessage());
      ac.d();
    }
    return null;
  }

  public final void run()
  {
    k = 1;
    c.incrementAndGet();
    try
    {
      if ((an.a(this.d)) && (an.a(this.e)) && (an.a(this.f)))
      {
        ac.d();
        return;
      }
      String str1 = cn.jpush.android.a.n(this.g);
      String str2;
      if (an.a(str1))
      {
        cn.jpush.android.a.J();
        str2 = this.f;
        if (an.a(str2))
          break label310;
        if (str2.startsWith(z[0]))
          break label305;
        if (str2.startsWith(z[1]))
        {
          break label305;
          new StringBuilder(z[3]).append(k);
          ac.a();
          if (k == -1)
            break label315;
          a(k);
          if (!an.a(this.i))
            a(this.d, this.e, this.f);
        }
      }
      while (true)
      {
        c.decrementAndGet();
        return;
        if (str2.startsWith(z[4]))
          break;
        if (str2.startsWith(z[2]))
        {
          k = 2;
          break;
        }
        while (true)
        {
          int m;
          if (m >= 3)
            break label324;
          a(m);
          new StringBuilder(z[3]).append(m);
          ac.a();
          m++;
          String str3;
          if ((an.a(this.i)) || (str3.equals(this.i)))
          {
            ac.a();
          }
          else
          {
            str3 = this.i;
            if (a(this.d, this.e, this.f))
            {
              break label164;
              e(str1);
              break label164;
              k = 0;
              break;
              k = -1;
              break;
              str3 = "";
              m = 0;
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      break label164;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */