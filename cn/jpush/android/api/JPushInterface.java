package cn.jpush.android.api;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import cn.jpush.android.data.JPushLocalNotification;
import cn.jpush.android.helpers.i;
import cn.jpush.android.service.PushService;
import cn.jpush.android.service.ServiceInterface;
import cn.jpush.android.service.h;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ae;
import cn.jpush.android.util.an;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JPushInterface
{
  public static final String ACTION_ACTIVITY_OPENDED;
  public static final String ACTION_CONNECTION_CHANGE;
  public static final String ACTION_MESSAGE_RECEIVED;
  public static final String ACTION_NOTIFICATION_OPENED;
  public static final String ACTION_NOTIFICATION_RECEIVED;
  public static final String ACTION_NOTIFICATION_RECEIVED_PROXY;
  public static final String ACTION_REGISTRATION_ID;
  public static final String ACTION_RESTOREPUSH;
  public static final String ACTION_RICHPUSH_CALLBACK;
  public static final String ACTION_STATUS;
  public static final String ACTION_STOPPUSH;
  public static final String EXTRA_ACTIVITY_PARAM;
  public static final String EXTRA_ALERT;
  public static final String EXTRA_APP_KEY;
  public static final String EXTRA_CONNECTION_CHANGE;
  public static final String EXTRA_CONTENT_TYPE;
  public static final String EXTRA_EXTRA;
  public static final String EXTRA_MESSAGE;
  public static final String EXTRA_MSG_ID;
  public static final String EXTRA_NOTIFICATION_DEVELOPER_ARG0;
  public static final String EXTRA_NOTIFICATION_ID;
  public static final String EXTRA_NOTIFICATION_TITLE;
  public static final String EXTRA_NOTI_TYPE;
  public static final String EXTRA_PUSH_ID;
  public static final String EXTRA_REGISTRATION_ID;
  public static final String EXTRA_RICHPUSH_FILE_PATH;
  public static final String EXTRA_RICHPUSH_FILE_TYPE;
  public static final String EXTRA_RICHPUSH_HTML_PATH;
  public static final String EXTRA_RICHPUSH_HTML_RES;
  public static final String EXTRA_STATUS;
  public static final String EXTRA_TITLE;
  private static final Integer a;
  private static e b;
  private static ConcurrentLinkedQueue<Long> c;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[66];
    int i = 0;
    String str1 = "^YZu\033HD\0341\nSS\006p\002Y\0311G?ov";
    int j = 65;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label37: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label53: int i2;
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
        i3 = 107;
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
        break label53;
        EXTRA_EXTRA = str2;
        str1 = "";
        j = 66;
        break;
        ACTION_STATUS = str2;
        str1 = "";
        j = 67;
        break;
        ACTION_NOTIFICATION_OPENED = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031:P?tq=\\*i~;Q4~x:K.sc+K\"i{1";
        j = 68;
        break;
        EXTRA_NOTIFICATION_TITLE = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031&Z,td M*i~;Q4ts";
        j = 69;
        break;
        EXTRA_REGISTRATION_ID = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031<K&qh&Z8";
        j = 70;
        break;
        EXTRA_RICHPUSH_HTML_RES = str2;
        str1 = "";
        j = 71;
        break;
        ACTION_RESTOREPUSH = str2;
        str1 = "";
        j = 72;
        break;
        ACTION_ACTIVITY_OPENDED = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0312V'xh F;x";
        j = 73;
        break;
        EXTRA_RICHPUSH_FILE_TYPE = str2;
        str1 = "";
        j = 74;
        break;
        ACTION_MESSAGE_RECEIVED = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031:P?tq=\\*i~;Q4ts";
        j = 75;
        break;
        EXTRA_NOTIFICATION_ID = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0319L,b~0";
        j = 76;
        break;
        EXTRA_MSG_ID = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0315\\?ta=K2bg5M*p";
        j = 77;
        break;
        EXTRA_ACTIVITY_PARAM = str2;
        str1 = "";
        j = 78;
        break;
        ACTION_CONNECTION_CHANGE = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031:P?tq=\\*i~;Q4yr\"Z'rg1M4|e3/";
        j = 79;
        break;
        EXTRA_NOTIFICATION_DEVELOPER_ARG0 = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0315O;vr-";
        j = 80;
        break;
        EXTRA_APP_KEY = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031 V?qr";
        j = 81;
        break;
        EXTRA_TITLE = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031'K*ib'";
        j = 82;
        break;
        EXTRA_STATUS = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0317P%ir:K4in$Z";
        j = 83;
        break;
        EXTRA_CONTENT_TYPE = str2;
        str1 = "";
        j = 84;
        break;
        ACTION_REGISTRATION_ID = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031<K&qh$^?u";
        j = 85;
        break;
        EXTRA_RICHPUSH_HTML_PATH = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0312V'xh$^?u";
        j = 86;
        break;
        EXTRA_RICHPUSH_FILE_PATH = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0315S.oc";
        j = 87;
        break;
        EXTRA_ALERT = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031$J8uh=[";
        j = 88;
        break;
        EXTRA_PUSH_ID = str2;
        str1 = "";
        j = 89;
        break;
        ACTION_NOTIFICATION_RECEIVED_PROXY = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0319Z8nv3Z";
        j = 90;
        break;
        EXTRA_MESSAGE = str2;
        str1 = "";
        j = 91;
        break;
        ACTION_STOPPUSH = str2;
        str1 = "";
        j = 92;
        break;
        ACTION_NOTIFICATION_RECEIVED = str2;
        str1 = "";
        j = 93;
        break;
        ACTION_RICHPUSH_CALLBACK = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\0317P%sr7K\"ry+\\#|y3Z";
        j = 94;
        break;
        EXTRA_CONNECTION_CHANGE = str2;
        str1 = "^YZu\033HD\0341\nSS\006p\002Y\031:P?tq=\\*i~;Q4in$Z";
        j = 95;
        break;
        EXTRA_NOTI_TYPE = str2;
        str1 = "";
        j = -1;
        break;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label37;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 94:
      case 95:
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
        str1 = "tY\002~\007TSTk\002PRTy\004OZ\025kK\020\027\007k\nOC<p\036O\027\007w\004H[\020?\007XD\007?\037UV\032?\016SS<p\036O";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\r\006F,_\b\001+/5\017\004";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "棽浼剄彌刦沜朾缥练ど歙功伨尙坃朴罦纨早膁劕绐纙扸蠧〿";
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
        str1 = "PB\030k\002bC\ro\016";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "QX\027~\007bY\033k\002[^\027~\037TX\032@\002Y";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "nN\007k\016P\031\030p\nY{\035}\031\\E\r%QWG\001l\003\017\006C";
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
        str1 = "WG\001l\003\017\006C";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\021\027\026j\002QS={Q\016\007M";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "tY\002~\007TSTk\nZ\rT";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "sb8SK^X\032k\016EC";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "QX\027~\007bY\033k\002[^\027~\037TX\032";
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
        str1 = "";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "NR\007l\016TX\032?\037TZ\021p\036I\027\030~\031ZR\006?\037UV\032?ZYV\r";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "TSTl\003RB\030{K_RTs\nOP\021mKI_\025qK\r";
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
        str1 = "";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "\035\032Y?";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "\035\rT";
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
        str1 = "tY\002~\007TSTq\004I^\022v\b\\C\035p\005tSX?,TA\021?\036M\027\025|\037TX\0321E";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "PV\fQ\036P\027\007w\004H[\020?U\035\007X?,TA\021?\036M\027\025|\037TX\0321E";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "";
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
        str1 = "";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "\021\027\003v\007Q\027\032p\037\035D\021kK\\[\035~\030\035C\034v\030\035C\035r\016\023";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "IV\023lKQR\032x\037U\r";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = "tY\002~\007TST~\007TV\007%K";
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
        str1 = "sb8SK\\[\035~\030\035V\032{KIV\023lE\035p\035i\016\035B\004?\n^C\035p\005\023";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "i_\021?\007XY\023k\003\035X\022?\037\\P\007?\030UX\001s\017\035U\021?\007XD\007?\037UV\032?\\\r\007D?\tDC\021lE";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = "tY\002~\007TSTk\nZ\027N?";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "i_\021?\007XY\023w\037\035X\022?\037\\P\007?\006\\N\026zKPX\006zKI_\025qK\f\007D/E";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = "";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "i_\021?\006NP={KTDTq\004I\027\002~\007TST2K";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "i_\021?\tH^\030{\016O\027\003v\037U\027\035{Q";
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
        str1 = "\\Y\020m\004TSZp\030\023u\001v\007Y\031\"Z9n~;QEns?@\"scH-X";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "OR\005j\016NC$z\031P^\007l\002RY\007";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "\\Y\020m\004TSZo\016OZ\035l\030TX\03219xv0@;ux:Z4nc5K.";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        i = 50;
        str1 = "\\Y\020m\004TSZo\016OZ\035l\030TX\0321*~t1L8bq=Q.b{;\\*i~;Q";
        j = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[i] = str2;
        i = 51;
        str1 = "\\Y\020m\004TSZo\016OZ\035l\030TX\0321<o~ Z4xo Z9sv8@8ix&^,x";
        j = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[i] = str2;
        i = 52;
        str1 = "\\Y\020m\004TSZ~\033M\0315|\037TA\035k\022";
        j = 51;
        localObject1 = localObject2;
        break;
      case 51:
        localObject1[i] = str2;
        i = 53;
        str1 = "";
        j = 52;
        localObject1 = localObject2;
        break;
      case 52:
        localObject1[i] = str2;
        i = 54;
        str1 = "|[\006z\nYNTL\016Ig\001l\003i^\031zG\035P\035i\016\035B\004?F\035";
        j = 53;
        localObject1 = localObject2;
        break;
      case 53:
        localObject1[i] = str2;
        i = 55;
        str1 = "\025lD2]`LD3\\@\036+7C";
        j = 54;
        localObject1 = localObject2;
        break;
      case 54:
        localObject1[i] = str2;
        i = 56;
        str1 = "\024\036";
        j = 55;
        localObject1 = localObject2;
        break;
      case 55:
        localObject1[i] = str2;
        i = 57;
        str1 = "\021\027\004j\030Uc\035r\016\007";
        j = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[i] = str2;
        i = 58;
        str1 = "tY\002~\007TSTk\002PRTy\004OZ\025kK\020\027";
        j = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[i] = str2;
        i = 59;
        str1 = "\025lD2R`KED[\020\016)cYf\007Y,6\024k*70\r\032MB\027\flD2R`KFD[\020\004)6";
        j = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[i] = str2;
        i = 60;
        str1 = "";
        j = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[i] = str2;
        i = 61;
        str1 = "\024K\\";
        j = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[i] = str2;
        i = 62;
        str1 = "\020\036_7";
        j = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[i] = str2;
        i = 63;
        str1 = "";
        j = 62;
        localObject1 = localObject2;
        break;
      case 62:
        localObject1[i] = str2;
        i = 64;
        str1 = "";
        j = 63;
        localObject1 = localObject2;
        break;
      case 63:
        localObject1[i] = str2;
        i = 65;
        str1 = "~B\007k\004P^\016z\017\035U\001v\007YR\006?\rOX\031?\030\\A\021{KME\021y\016OR\032|\016\035\032T";
        j = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[i] = str2;
        z = localObject2;
        a = Integer.valueOf(0);
        b = e.b();
        c = new ConcurrentLinkedQueue();
        return;
        i3 = 61;
        continue;
        i3 = 55;
        continue;
        i3 = 116;
        continue;
        i3 = 31;
      }
    }
  }

  public JPushInterface()
  {
  }

  private static PushNotificationBuilder a(String paramString)
  {
    new StringBuilder(z[64]).append(paramString);
    ac.a();
    String str = cn.jpush.android.a.e(cn.jpush.android.e.e, paramString);
    if (an.a(str))
      return null;
    new StringBuilder(z[65]).append(str);
    ac.a();
    return BasicPushNotificationBuilder.a(str);
  }

  private static void a(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException(z[15]);
    cn.jpush.android.a.q(paramContext);
  }

  private static void a(Context paramContext, String paramString, Set<String> paramSet, TagAliasCallback paramTagAliasCallback, boolean paramBoolean)
  {
    if (paramContext == null)
      throw new IllegalArgumentException(z[15]);
    if ((cn.jpush.android.e.a) && (!cn.jpush.android.util.b.b(paramContext)))
      ac.b(z[1], z[4]);
    if (paramString != null)
    {
      int m = ae.b(paramString);
      if (m != 0)
      {
        ac.b(z[1], z[37] + paramString + z[35]);
        if (paramTagAliasCallback != null)
          paramTagAliasCallback.gotResult(m, paramString, paramSet);
      }
    }
    String str1;
    do
    {
      int k;
      do
      {
        return;
        if ((paramTagAliasCallback == null) && (!paramBoolean))
          paramSet = filterValidTags(paramSet);
        if (paramSet == null)
          break;
        k = ae.a(paramSet);
        if (k == 0)
          break;
        ac.b(z[1], z[34]);
      }
      while (paramTagAliasCallback == null);
      paramTagAliasCallback.gotResult(k, paramString, paramSet);
      return;
      str1 = getStringTags(paramSet);
      if ((paramString != null) || (str1 != null))
        break;
      ac.e(z[1], z[39]);
    }
    while (paramTagAliasCallback == null);
    paramTagAliasCallback.gotResult(d.a, paramString, paramSet);
    return;
    String str2;
    if (str1 != null)
    {
      str2 = str1.replaceAll(",", "");
      if (an.a(str2))
        break label381;
    }
    label381: for (int i = 0 + str2.getBytes().length; ; i = 0)
    {
      new StringBuilder(z[36]).append(i);
      ac.a();
      int j = 0;
      if (i <= 7000)
        j = 1;
      if (j == 0)
      {
        if (paramTagAliasCallback != null)
          paramTagAliasCallback.gotResult(d.h, paramString, paramSet);
        ac.e(z[1], z[40]);
        return;
      }
      ac.b(z[1], z[33] + paramString + z[38] + str1);
      ServiceInterface.a(paramContext, paramString, str1, new b(paramString, paramSet, paramTagAliasCallback));
      return;
    }
  }

  private static void a(Context paramContext, boolean paramBoolean, String paramString)
  {
    ac.b();
    cn.jpush.android.a.b(paramContext, paramBoolean);
    if (!paramBoolean)
    {
      ac.b(z[1], z[53]);
      return;
    }
    String str1 = z[59];
    if (Pattern.compile(z[55] + str1 + z[61] + str1 + z[62] + str1 + z[56]).matcher(paramString).matches())
    {
      String str2 = cn.jpush.android.a.f(paramContext);
      if (paramString.equals(str2))
      {
        ac.b(z[1], z[54] + str2);
        return;
      }
      ac.b(z[1], z[63] + paramBoolean + z[57] + paramString);
      if ((ServiceInterface.b()) || (!cn.jpush.android.e.n))
      {
        cn.jpush.android.a.b(paramContext, paramString);
        return;
      }
      Intent localIntent = new Intent(paramContext, PushService.class);
      localIntent.setAction(z[9]);
      Bundle localBundle = new Bundle();
      localBundle.putInt(z[7], 3);
      localBundle.putString(z[60], paramString);
      localIntent.putExtras(localBundle);
      paramContext.startService(localIntent);
      return;
    }
    ac.e(z[1], z[58] + paramString);
  }

  static boolean a(int paramInt)
  {
    if (paramInt <= 0)
      return false;
    if (a(paramInt) == null)
    {
      ac.d(z[1], z[45] + paramInt + z[46]);
      return false;
    }
    return true;
  }

  public static void addLocalNotification(Context paramContext, JPushLocalNotification paramJPushLocalNotification)
  {
    a(paramContext);
    if (!cn.jpush.android.e.n)
    {
      h.a(paramContext).a(paramContext, paramJPushLocalNotification);
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[7], 6);
    localBundle.putSerializable(z[16], paramJPushLocalNotification);
    localIntent.putExtras(localBundle);
    localIntent.setAction(z[9]);
    paramContext.startService(localIntent);
  }

  static PushNotificationBuilder b(int paramInt)
  {
    ac.a(z[1], z[17] + paramInt);
    if (paramInt <= 0)
      paramInt = a.intValue();
    try
    {
      PushNotificationBuilder localPushNotificationBuilder = a(paramInt);
      localObject = localPushNotificationBuilder;
      if (localObject == null)
      {
        ac.b();
        localObject = new DefaultPushNotificationBuilder();
      }
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ac.g();
        Object localObject = null;
      }
    }
  }

  public static void clearAllNotifications(Context paramContext)
  {
    a(paramContext);
    ServiceInterface.c(paramContext);
  }

  public static void clearLocalNotifications(Context paramContext)
  {
    a(paramContext);
    if (!cn.jpush.android.e.n)
    {
      h.a(paramContext).b(paramContext);
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[7], 8);
    localIntent.putExtras(localBundle);
    localIntent.setAction(z[9]);
    paramContext.startService(localIntent);
  }

  public static void clearNotificationById(Context paramContext, int paramInt)
  {
    a(paramContext);
    if (paramInt <= 0)
    {
      ac.e(z[1], z[29]);
      return;
    }
    ((NotificationManager)paramContext.getSystemService(z[30])).cancel(paramInt);
  }

  public static Set<String> filterValidTags(Set<String> paramSet)
  {
    if (paramSet == null)
      paramSet = null;
    while (paramSet.isEmpty())
      return paramSet;
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Iterator localIterator = paramSet.iterator();
    int j;
    for (int i = 0; localIterator.hasNext(); i = j)
    {
      String str = (String)localIterator.next();
      if ((!an.a(str)) && (ae.a(str)))
      {
        localLinkedHashSet.add(str);
        j = i + 1;
        if (j >= 1000)
        {
          ac.d(z[1], z[42]);
          return localLinkedHashSet;
        }
      }
      else
      {
        ac.e(z[1], z[41] + str);
        j = i;
      }
    }
    return localLinkedHashSet;
  }

  public static boolean getConnectionState(Context paramContext)
  {
    a(paramContext);
    cn.jpush.android.service.a locala = cn.jpush.android.a.a(paramContext);
    return cn.jpush.android.service.a.a == locala;
  }

  public static String getRegistrationID(Context paramContext)
  {
    a(paramContext);
    return cn.jpush.android.a.B();
  }

  public static String getStringTags(Set<String> paramSet)
  {
    Object localObject1 = null;
    if (paramSet == null);
    int i;
    label30: String str;
    label73: int j;
    do
    {
      return localObject1;
      if (paramSet.isEmpty())
        return "";
      i = 0;
      Iterator localIterator = paramSet.iterator();
      if (!localIterator.hasNext())
        break;
      str = (String)localIterator.next();
      if ((an.a(str)) || (!ae.a(str)))
        break label127;
      if (localObject1 != null)
        break label98;
      localObject1 = str;
      j = i + 1;
    }
    while (j >= 1000);
    for (Object localObject2 = localObject1; ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      i = j;
      break label30;
      break;
      label98: localObject1 = (String)localObject1 + "," + str;
      break label73;
      label127: ac.e(z[1], z[14] + str);
      j = i;
    }
  }

  public static String getUdid(Context paramContext)
  {
    a(paramContext);
    return cn.jpush.android.util.b.j(paramContext);
  }

  public static void init(Context paramContext)
  {
    ac.b(z[1], z[11] + ServiceInterface.a() + z[13]);
    try
    {
      System.loadLibrary(z[12]);
      a(paramContext);
      if ((cn.jpush.android.e.a) && (!cn.jpush.android.util.b.b(paramContext)))
        ac.b(z[1], z[4]);
      if (!cn.jpush.android.e.a(paramContext))
        return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ac.e(z[1], z[10] + localThrowable);
        localThrowable.printStackTrace();
      }
      if (cn.jpush.android.a.b(paramContext) == -1)
        setLatestNotificationNumber(paramContext, 5);
      ServiceInterface.a(paramContext);
    }
  }

  public static void initCrashHandler(Context paramContext)
  {
    a(paramContext);
    c.a().a(paramContext);
  }

  public static boolean isPushStopped(Context paramContext)
  {
    a(paramContext);
    return ServiceInterface.d(paramContext);
  }

  public static void onFragmentPause(Context paramContext, String paramString)
  {
    a(paramContext);
    b.b(paramContext, paramString);
  }

  public static void onFragmentResume(Context paramContext, String paramString)
  {
    a(paramContext);
    b.a(paramContext, paramString);
  }

  public static void onKillProcess(Context paramContext)
  {
    b.c(paramContext);
  }

  public static void onPause(Context paramContext)
  {
    a(paramContext);
    b.b(paramContext);
  }

  public static void onResume(Context paramContext)
  {
    a(paramContext);
    b.a(paramContext);
  }

  public static void removeLocalNotification(Context paramContext, long paramLong)
  {
    a(paramContext);
    if (!cn.jpush.android.e.n)
    {
      h.a(paramContext).a(paramContext, paramLong);
      return;
    }
    Intent localIntent = new Intent(paramContext, PushService.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt(z[7], 7);
    localBundle.putLong(z[8], paramLong);
    localIntent.putExtras(localBundle);
    localIntent.setAction(z[9]);
    paramContext.startService(localIntent);
  }

  public static void reportNotificationOpened(Context paramContext, String paramString)
  {
    a(paramContext);
    if (an.a(paramString))
      ac.e(z[1], z[44] + paramString);
    i.a(paramString, 1028, paramContext);
  }

  public static void requestPermission(Context paramContext)
  {
    if ((Build.VERSION.SDK_INT >= 23) && ((paramContext instanceof Activity)))
    {
      String[] arrayOfString = new String[3];
      arrayOfString[0] = z[51];
      arrayOfString[1] = z[50];
      arrayOfString[2] = z[49];
      String str1 = z[51];
      String str2 = z[50];
      String str3 = z[49];
      boolean bool1 = cn.jpush.android.util.b.c(paramContext, str1);
      boolean bool2 = cn.jpush.android.util.b.c(paramContext, str2);
      boolean bool3 = cn.jpush.android.util.b.c(paramContext, str3);
      if ((bool1) && (bool2) && (bool3))
        return;
      try
      {
        Class localClass = Class.forName(z[52]);
        String str4 = z[48];
        Class[] arrayOfClass = new Class[2];
        arrayOfClass[0] = [Ljava.lang.String.class;
        arrayOfClass[1] = Integer.TYPE;
        Method localMethod = localClass.getDeclaredMethod(str4, arrayOfClass);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = arrayOfString;
        arrayOfObject[1] = Integer.valueOf(1);
        localMethod.invoke(paramContext, arrayOfObject);
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
    }
    ac.b(z[1], z[47]);
  }

  public static void resumePush(Context paramContext)
  {
    ac.b(z[1], z[5]);
    a(paramContext);
    if (cn.jpush.android.a.o())
    {
      ac.b();
      ServiceInterface.a(paramContext, false);
      return;
    }
    ServiceInterface.b(paramContext, 1);
  }

  public static void setAlias(Context paramContext, String paramString, TagAliasCallback paramTagAliasCallback)
  {
    a(paramContext);
    setAliasAndTags(paramContext, paramString, null, paramTagAliasCallback);
  }

  @Deprecated
  public static void setAliasAndTags(Context paramContext, String paramString, Set<String> paramSet)
  {
    a(paramContext);
    a(paramContext, paramString, paramSet, null, false);
  }

  public static void setAliasAndTags(Context paramContext, String paramString, Set<String> paramSet, TagAliasCallback paramTagAliasCallback)
  {
    a(paramContext);
    long l = System.currentTimeMillis();
    int i;
    if (c.size() < 10)
    {
      c.offer(Long.valueOf(l));
      i = 1;
    }
    while (i == 0)
    {
      ac.d();
      if (paramTagAliasCallback != null)
        paramTagAliasCallback.gotResult(d.k, paramString, paramSet);
      return;
      if (l - ((Long)c.element()).longValue() > 10000L)
      {
        while (c.size() >= 10)
          c.poll();
        c.offer(Long.valueOf(l));
        i = 1;
      }
      else
      {
        i = 0;
      }
    }
    a(paramContext, paramString, paramSet, paramTagAliasCallback, true);
  }

  public static void setDebugMode(boolean paramBoolean)
  {
    cn.jpush.android.e.a = paramBoolean;
  }

  public static void setDefaultPushNotificationBuilder(BasicPushNotificationBuilder paramBasicPushNotificationBuilder)
  {
    if (paramBasicPushNotificationBuilder == null)
      throw new IllegalArgumentException(z[6]);
    ServiceInterface.a(cn.jpush.android.e.e, a, paramBasicPushNotificationBuilder);
  }

  public static void setLatestNotificationNumber(Context paramContext, int paramInt)
  {
    a(paramContext);
    ac.b(z[1], z[32] + paramInt);
    if (paramInt <= 0)
    {
      ac.e(z[1], z[31]);
      return;
    }
    ServiceInterface.d(paramContext, paramInt);
  }

  public static void setPushNotificationBuilder(Integer paramInteger, BasicPushNotificationBuilder paramBasicPushNotificationBuilder)
  {
    ac.a(z[1], z[22] + paramInteger);
    if (paramBasicPushNotificationBuilder == null)
      throw new IllegalArgumentException(z[21]);
    if (paramInteger.intValue() <= 0)
    {
      ac.e(z[1], z[20]);
      return;
    }
    ServiceInterface.a(cn.jpush.android.e.e, paramInteger, paramBasicPushNotificationBuilder);
  }

  public static void setPushTime(Context paramContext, Set<Integer> paramSet, int paramInt1, int paramInt2)
  {
    a(paramContext);
    if ((cn.jpush.android.e.a) && (!cn.jpush.android.util.b.b(paramContext)))
      ac.b(z[1], z[4]);
    if (paramSet == null)
    {
      a(paramContext, true, z[3]);
      return;
    }
    if ((paramSet.size() == 0) || (paramSet.isEmpty()))
    {
      a(paramContext, false, z[3]);
      return;
    }
    if (paramInt1 > paramInt2)
    {
      ac.e(z[1], z[2]);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if ((localInteger.intValue() > 6) || (localInteger.intValue() < 0))
      {
        ac.e(z[1], z[0] + localInteger);
        return;
      }
      localStringBuilder.append(localInteger);
    }
    localStringBuilder.append("_");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("^");
    localStringBuilder.append(paramInt2);
    a(paramContext, true, localStringBuilder.toString());
  }

  public static void setSilenceTime(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramContext);
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt3 < 0) || (paramInt4 < 0) || (paramInt2 > 59) || (paramInt4 > 59) || (paramInt3 > 23) || (paramInt1 > 23))
    {
      ac.e(z[1], z[25]);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
    {
      ServiceInterface.a(paramContext, "");
      ac.b(z[1], z[23]);
      return;
    }
    if (ServiceInterface.a(paramContext, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      ac.b(z[1], z[24] + paramInt1 + z[27] + paramInt2 + z[26] + paramInt3 + z[27] + paramInt4);
      return;
    }
    ac.e(z[1], z[28]);
  }

  public static void setStatisticsEnable(boolean paramBoolean)
  {
    b.a(paramBoolean);
  }

  public static void setStatisticsSessionTimeout(long paramLong)
  {
    if (paramLong < 10L)
    {
      ac.d(z[1], z[18]);
      return;
    }
    if (paramLong > 86400L)
    {
      ac.d(z[1], z[19]);
      return;
    }
    b.a(paramLong);
  }

  public static void setTags(Context paramContext, Set<String> paramSet, TagAliasCallback paramTagAliasCallback)
  {
    a(paramContext);
    setAliasAndTags(paramContext, null, paramSet, paramTagAliasCallback);
  }

  public static void stopPush(Context paramContext)
  {
    ac.b(z[1], z[43]);
    a(paramContext);
    if (cn.jpush.android.a.o())
    {
      ac.b();
      ServiceInterface.a(paramContext, true);
      return;
    }
    ServiceInterface.a(paramContext, 1);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.JPushInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */