package cn.jpush.android.util;

import android.app.Activity;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.Notification;;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import cn.jpush.android.a;
import cn.jpush.android.api.InstrumentedActivity;
import cn.jpush.android.api.InstrumentedListActivity;
import cn.jpush.android.api.m;
import cn.jpush.android.e;
import cn.jpush.android.helpers.i;
import cn.jpush.android.service.AlarmReceiver;
import cn.jpush.android.service.DaemonService;
import cn.jpush.android.service.DownloadService;
import cn.jpush.android.service.PushReceiver;
import cn.jpush.android.service.PushService;
import cn.jpush.android.service.s;
import cn.jpush.android.service.t;
import cn.jpush.android.ui.PopWinActivity;
import cn.jpush.android.ui.PushActivity;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static int a;
  private static List<String> b;
  private static final X500Principal c;
  private static long d;
  private static final ArrayList<String> e;
  private static final ArrayList<String> f;
  private static final ArrayList<String> g;
  private static PushReceiver h;
  private static final String[] z;

  static
  {
    Object localObject1 = new String['°'];
    int i = 0;
    String str1 = "\n\013 Q4\032\027";
    int j = -1;
    Object localObject2 = localObject1;
    int i17;
    label137: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int k = localObject3.length;
      int m = 0;
      if (k <= 1);
      while (k > m)
      {
        Object localObject10 = localObject3;
        int i14 = m;
        int i15 = k;
        Object localObject11 = localObject3;
        while (true)
        {
          int i16 = localObject11[m];
          switch (i14 % 5)
          {
          default:
            i17 = 91;
            localObject11[m] = (char)(i17 ^ i16);
            m = i14 + 1;
            if (i15 != 0)
              break label137;
            localObject11 = localObject10;
            i14 = m;
            m = i15;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        k = i15;
        localObject3 = localObject10;
      }
      str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "\034\021%k/\"\f*j";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\034\021%k/'\n1k";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "CE*v,\"\f*#";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\001\n3Q4\032\027~";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "O\033d";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = ".\013 k4\006\001\021m2\003";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "CE!w?\"\f*#";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\n\013 m\026\006\0137";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "CE7m:\035\021\fv.\035_";
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
        str1 = "CE!w?'\n1ka";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "CE7m:\035\021\tp5U";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\f=,\020\\\004*=\020\\\t!$\bF\b;*\026X\034*";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\f\001)x";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\b\026)";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\003\021!";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\032\013/w4\030\013";
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
        str1 = "";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "\001\004)|";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "\037\016#";
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
        str1 = "\037\0207q{\033\f)|{\006\026d＃";
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
        str1 = "";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "3;";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "%51j3掿祟～缣届纰评产砘";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "";
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
        str1 = "";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "\005\0251j30\013+m2\t\f'x/\006\n*F2\f\n*";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "\033\0344|";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = "\016\0060p-\006\021=";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "讘剕dI4\035\021%u{乥菒厒悱盟卪周哈X+\037.!`席暛旕\005w?\035\n-}\026\016\013->\034\021皼庍嬌毚";
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
        str1 = "%51j3掿祟～匜呖哣$4i\020\n\034义匠鄖";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = "";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "\013\027%n:\r\t!";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = "";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "(\n09(\013\006%k?O\003-u>O\026%o>\013E1}2\013Ei9";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = "A\0251j30\020 p?";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "%5\021J\0230$\024I\020*<";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "\037\0207q\004\033\n\033p60\001%m:";
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
        str1 = ".\0060p4\001Ei9(\n\013 W>\033\022+k0,\r%w<\n\001\020v\022\"";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "\f\013js+\032\026,72\002K%w?\035\n-}u\016\0060p4\001K\rT\004= \027I\024!6\001";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "\005\026+w\036\027\006!i/\006\n*9vO";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        i = 50;
        str1 = "";
        j = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[i] = str2;
        i = 51;
        str1 = "";
        j = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[i] = str2;
        i = 52;
        str1 = "\r\n `";
        j = 51;
        localObject1 = localObject2;
        break;
      case 51:
        localObject1[i] = str2;
        i = 53;
        str1 = "7Kq)b";
        j = 52;
        localObject1 = localObject2;
        break;
      case 52:
        localObject1[i] = str2;
        i = 54;
        str1 = "";
        j = 53;
        localObject1 = localObject2;
        break;
      case 53:
        localObject1[i] = str2;
        i = 55;
        str1 = "";
        j = 54;
        localObject1 = localObject2;
        break;
      case 54:
        localObject1[i] = str2;
        i = 56;
        str1 = "";
        j = 55;
        localObject1 = localObject2;
        break;
      case 55:
        localObject1[i] = str2;
        i = 57;
        str1 = "";
        j = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[i] = str2;
        i = 58;
        str1 = "\013\0204u2\f\0040|";
        j = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[i] = str2;
        i = 59;
        str1 = "";
        j = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[i] = str2;
        i = 60;
        str1 = ":\013!a+\n\0060|?UE-w-\016\t-}{\032\027(9vO";
        j = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[i] = str2;
        i = 61;
        str1 = "(\n09(\013\006%k?O\003-u>O\026%o>\013E |-\006\006!P?OHd";
        j = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[i] = str2;
        i = 62;
        str1 = "_Ot";
        j = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[i] = str2;
        i = 63;
        str1 = ":\013/w4\030\013";
        j = 62;
        localObject1 = localObject2;
        break;
      case 62:
        localObject1[i] = str2;
        i = 64;
        str1 = "\f\n*w>\f\021-o2\033\034";
        j = 63;
        localObject1 = localObject2;
        break;
      case 63:
        localObject1[i] = str2;
        i = 65;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K\001A\017=$";
        j = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[i] = str2;
        i = 66;
        str1 = "\"\004-w{\f\t%j(O\f79";
        j = 65;
        localObject1 = localObject2;
        break;
      case 65:
        localObject1[i] = str2;
        i = 67;
        str1 = "";
        j = 66;
        localObject1 = localObject2;
        break;
      case 66:
        localObject1[i] = str2;
        i = 68;
        str1 = "";
        j = 67;
        localObject1 = localObject2;
        break;
      case 67:
        localObject1[i] = str2;
        i = 69;
        str1 = "";
        j = 68;
        localObject1 = localObject2;
        break;
      case 68:
        localObject1[i] = str2;
        i = 70;
        str1 = "\037\r+w>";
        j = 69;
        localObject1 = localObject2;
        break;
      case 69:
        localObject1[i] = str2;
        i = 71;
        str1 = "";
        j = 70;
        localObject1 = localObject2;
        break;
      case 70:
        localObject1[i] = str2;
        i = 72;
        str1 = "";
        j = 71;
        localObject1 = localObject2;
        break;
      case 71:
        localObject1[i] = str2;
        i = 73;
        str1 = "\"!q";
        j = 72;
        localObject1 = localObject2;
        break;
      case 72:
        localObject1[i] = str2;
        i = 74;
        str1 = "\"$\0079:\013\001692\001\003+4vBHd";
        j = 73;
        localObject1 = localObject2;
        break;
      case 73:
        localObject1[i] = str2;
        i = 75;
        str1 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\032,&\001J\b02\r_\02206\020X\017*";
        j = 74;
        localObject1 = localObject2;
        break;
      case 74:
        localObject1[i] = str2;
        i = 76;
        str1 = "\002\n1w/\n\001";
        j = 75;
        localObject1 = localObject2;
        break;
      case 75:
        localObject1[i] = str2;
        i = 77;
        str1 = "";
        j = 76;
        localObject1 = localObject2;
        break;
      case 76:
        localObject1[i] = str2;
        i = 78;
        str1 = "";
        j = 77;
        localObject1 = localObject2;
        break;
      case 77:
        localObject1[i] = str2;
        i = 79;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K-w/\n\01307\025 1\r_\022,$\020P\024!:\026\\\030*,\022\\\03705\026V\0036";
        j = 78;
        localObject1 = localObject2;
        break;
      case 78:
        localObject1[i] = str2;
        i = 80;
        str1 = "";
        j = 79;
        localObject1 = localObject2;
        break;
      case 79:
        localObject1[i] = str2;
        i = 81;
        str1 = "";
        j = 80;
        localObject1 = localObject2;
        break;
      case 80:
        localObject1[i] = str2;
        i = 82;
        str1 = "\016\013 k4\006\001jw>\033K'v5\001K\007V\025! \007M\0229,\020@\004,-\005W\034*";
        j = 81;
        localObject1 = localObject2;
        break;
      case 81:
        localObject1[i] = str2;
        i = 83;
        str1 = "\032\021\"4c";
        j = 82;
        localObject1 = localObject2;
        break;
      case 82:
        localObject1[i] = str2;
        i = 84;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K\020P\017# ";
        j = 83;
        localObject1 = localObject2;
        break;
      case 83:
        localObject1[i] = str2;
        i = 85;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K\007V\025; \nM\004;<\024\\";
        j = 84;
        localObject1 = localObject2;
        break;
      case 84:
        localObject1[i] = str2;
        i = 86;
        str1 = "";
        j = 85;
        localObject1 = localObject2;
        break;
      case 85:
        localObject1[i] = str2;
        i = 87;
        str1 = "J\026ji>\035\b-j(\006\n*7\021?0\027Q\004\" \027J\032( ";
        j = 86;
        localObject1 = localObject2;
        break;
      case 86:
        localObject1[i] = str2;
        i = 88;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K-w/\n\01307\026*6\027X\034*:\026\\\030*,\022\\\037";
        j = 87;
        localObject1 = localObject2;
        break;
      case 87:
        localObject1[i] = str2;
        i = 89;
        str1 = "";
        j = 88;
        localObject1 = localObject2;
        break;
      case 88:
        localObject1[i] = str2;
        i = 90;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K\002P\027*:\024X\017'";
        j = 89;
        localObject1 = localObject2;
        break;
      case 89:
        localObject1[i] = str2;
        i = 91;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K\005I\013$ \035";
        j = 90;
        localObject1 = localObject2;
        break;
      case 90:
        localObject1[i] = str2;
        i = 92;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K\t\\\b<$\003\\";
        j = 91;
        localObject1 = localObject2;
        break;
      case 91:
        localObject1[i] = str2;
        i = 93;
        str1 = "";
        j = 92;
        localObject1 = localObject2;
        break;
      case 92:
        localObject1[i] = str2;
        i = 94;
        str1 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\f=,\020\\\004< \020M\022!\"\027";
        j = 93;
        localObject1 = localObject2;
        break;
      case 93:
        localObject1[i] = str2;
        i = 95;
        str1 = "3K";
        j = 94;
        localObject1 = localObject2;
        break;
      case 94:
        localObject1[i] = str2;
        i = 96;
        str1 = "\034\021%m.\034";
        j = 95;
        localObject1 = localObject2;
        break;
      case 95:
        localObject1[i] = str2;
        i = 97;
        str1 = "\037\t1~<\n\001";
        j = 96;
        localObject1 = localObject2;
        break;
      case 96:
        localObject1[i] = str2;
        i = 98;
        str1 = "";
        j = 97;
        localObject1 = localObject2;
        break;
      case 97:
        localObject1[i] = str2;
        i = 99;
        str1 = "\n\b4m\"O\025%k:\002\026";
        j = 98;
        localObject1 = localObject2;
        break;
      case 98:
        localObject1[i] = str2;
        i = 100;
        str1 = "\035\njt2\032\fjl2A\023!k(\006\n*75\016\b!";
        j = 99;
        localObject1 = localObject2;
        break;
      case 99:
        localObject1[i] = str2;
        i = 101;
        str1 = "\r\027%w?OXd";
        j = 100;
        localObject1 = localObject2;
        break;
      case 100:
        localObject1[i] = str2;
        i = 102;
        str1 = "7\f%v6\006";
        j = 101;
        localObject1 = localObject2;
        break;
      case 101:
        localObject1[i] = str2;
        i = 103;
        str1 = "9Rj(";
        j = 102;
        localObject1 = localObject2;
        break;
      case 102:
        localObject1[i] = str2;
        i = 104;
        str1 = "";
        j = 103;
        localObject1 = localObject2;
        break;
      case 103:
        localObject1[i] = str2;
        i = 105;
        str1 = "";
        j = 104;
        localObject1 = localObject2;
        break;
      case 104:
        localObject1[i] = str2;
        i = 106;
        str1 = "";
        j = 105;
        localObject1 = localObject2;
        break;
      case 105:
        localObject1[i] = str2;
        i = 107;
        str1 = "";
        j = 106;
        localObject1 = localObject2;
        break;
      case 106:
        localObject1[i] = str2;
        i = 108;
        str1 = "";
        j = 107;
        localObject1 = localObject2;
        break;
      case 107:
        localObject1[i] = str2;
        i = 109;
        str1 = "\013\0040x";
        j = 108;
        localObject1 = localObject2;
        break;
      case 108:
        localObject1[i] = str2;
        i = 110;
        str1 = "\006\021-t>";
        j = 109;
        localObject1 = localObject2;
        break;
      case 109:
        localObject1[i] = str2;
        i = 111;
        str1 = "\006\026\021i?\016\021!O>\035\026-v5";
        j = 110;
        localObject1 = localObject2;
        break;
      case 110:
        localObject1[i] = str2;
        i = 112;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K1pu?\0207q\032\f\021-o2\033\034";
        j = 111;
        localObject1 = localObject2;
        break;
      case 111:
        localObject1[i] = str2;
        i = 113;
        str1 = "4\004ikB\\\0054\0352\036u-&";
        j = 112;
        localObject1 = localObject2;
        break;
      case 112:
        localObject1[i] = str2;
        i = 114;
        str1 = "4Ui \006\024Tqd";
        j = 113;
        localObject1 = localObject2;
        break;
      case 113:
        localObject1[i] = str2;
        i = 115;
        str1 = "4U\0313";
        j = 114;
        localObject1 = localObject2;
        break;
      case 114:
        localObject1[i] = str2;
        i = 116;
        str1 = "\032\027(";
        j = 115;
        localObject1 = localObject2;
        break;
      case 115:
        localObject1[i] = str2;
        i = 117;
        str1 = "\002\n |7";
        j = 116;
        localObject1 = localObject2;
        break;
      case 116:
        localObject1[i] = str2;
        i = 118;
        str1 = "\r\0047|9\016\013 ";
        j = 117;
        localObject1 = localObject2;
        break;
      case 117:
        localObject1[i] = str2;
        i = 119;
        str1 = "\f\r%w5\n\t";
        j = 118;
        localObject1 = localObject2;
        break;
      case 118:
        localObject1[i] = str2;
        i = 120;
        str1 = "";
        j = 119;
        localObject1 = localObject2;
        break;
      case 119:
        localObject1[i] = str2;
        i = 121;
        str1 = "\b\026)7-\n\0277p4\001K&x(\n\007%w?";
        j = 120;
        localObject1 = localObject2;
        break;
      case 120:
        localObject1[i] = str2;
        i = 122;
        str1 = "";
        j = 121;
        localObject1 = localObject2;
        break;
      case 121:
        localObject1[i] = str2;
        i = 123;
        str1 = "";
        j = 122;
        localObject1 = localObject2;
        break;
      case 122:
        localObject1[i] = str2;
        i = 124;
        str1 = "";
        j = 123;
        localObject1 = localObject2;
        break;
      case 123:
        localObject1[i] = str2;
        i = 125;
        str1 = "";
        j = 124;
        localObject1 = localObject2;
        break;
      case 124:
        localObject1[i] = str2;
        i = 126;
        str1 = "O\001)73\n\f#q/?\f<|7\034_";
        j = 125;
        localObject1 = localObject2;
        break;
      case 125:
        localObject1[i] = str2;
        i = 127;
        str1 = "\037\n-w/A\034";
        j = 126;
        localObject1 = localObject2;
        break;
      case 126:
        localObject1[i] = str2;
        i = 128;
        str1 = "O\001)7\"\013\025-#";
        j = 127;
        localObject1 = localObject2;
        break;
      case 127:
        localObject1[i] = str2;
        i = 129;
        str1 = "\013\bja?\037\fd#{";
        j = 128;
        localObject1 = localObject2;
        break;
      case 128:
        localObject1[i] = str2;
        i = 130;
        str1 = "\037\n-w/A\035~";
        j = 129;
        localObject1 = localObject2;
        break;
      case 129:
        localObject1[i] = str2;
        i = 131;
        str1 = "";
        j = 130;
        localObject1 = localObject2;
        break;
      case 130:
        localObject1[i] = str2;
        i = 132;
        str1 = "?\027!()\f(|";
        j = 131;
        localObject1 = localObject2;
        break;
      case 131:
        localObject1[i] = str2;
        i = 133;
        str1 = "";
        j = 132;
        localObject1 = localObject2;
        break;
      case 132:
        localObject1[i] = str2;
        i = 134;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E-w/\n\01309=\006\t0|)O_dz5A\0174l(\007K%w?\035\n-}u\006\0130|5\033K\026\\\013 7\020";
        j = 133;
        localObject1 = localObject2;
        break;
      case 133:
        localObject1[i] = str2;
        i = 135;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E-w/\n\01309=\006\t0|)O\003+k{?\0207q\b\n\0272p8\n_dz5A\0174l(\007K%w?\035\n-}u\006\0130|5\033K\026\\\034&6\020\\\t";
        j = 134;
        localObject1 = localObject2;
        break;
      case 134:
        localObject1[i] = str2;
        i = 136;
        str1 = "";
        j = 135;
        localObject1 = localObject2;
        break;
      case 135:
        localObject1[i] = str2;
        i = 137;
        str1 = "";
        j = 136;
        localObject1 = localObject2;
        break;
      case 136:
        localObject1[i] = str2;
        i = 138;
        str1 = "";
        j = 137;
        localObject1 = localObject2;
        break;
      case 137:
        localObject1[i] = str2;
        i = 139;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E7|)\031\f'|aO";
        j = 138;
        localObject1 = localObject2;
        break;
      case 138:
        localObject1[i] = str2;
        i = 140;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E-w/\n\01309=\006\t0|)O\003+k{?\0207q\t\n\006!p-\n\027~98\001K.i.\034\rjx5\013\027+p?A\f*m>\001\021jW\024;,\002P\030.1\rV\02507\001Z\036&3\001]\004?7\013A\002";
        j = 139;
        localObject1 = localObject2;
        break;
      case 139:
        localObject1[i] = str2;
        i = 141;
        str1 = "";
        j = 140;
        localObject1 = localObject2;
        break;
      case 140:
        localObject1[i] = str2;
        i = 142;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K-w/\n\01307\t*5\013K\017";
        j = 141;
        localObject1 = localObject2;
        break;
      case 141:
        localObject1[i] = str2;
        i = 143;
        str1 = ";\r!9+\n\027)p(\034\n-w{\006\026dk>\036\020-k>\013Ei9";
        j = 142;
        localObject1 = localObject2;
        break;
      case 142:
        localObject1[i] = str2;
        i = 144;
        str1 = "";
        j = 143;
        localObject1 = localObject2;
        break;
      case 143:
        localObject1[i] = str2;
        i = 145;
        str1 = "A\025!k6\006\0267p4\001K\016I\016<-\033T\036<6\005^\036";
        j = 144;
        localObject1 = localObject2;
        break;
      case 144:
        localObject1[i] = str2;
        i = 146;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E%z/\006\023-m\"UE";
        j = 145;
        localObject1 = localObject2;
        break;
      case 145:
        localObject1[i] = str2;
        i = 147;
        str1 = "";
        j = 146;
        localObject1 = localObject2;
        break;
      case 146:
        localObject1[i] = str2;
        i = 148;
        str1 = "";
        j = 147;
        localObject1 = localObject2;
        break;
      case 147:
        localObject1[i] = str2;
        i = 149;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E-w/\n\01309=\006\t0|)O\003+k{?\0207q\032\f\021-o2\033\034~98\001K.i.\034\rjx5\013\027+p?A\020-7\013\032\026,X8\033\f2p/\026";
        j = 148;
        localObject1 = localObject2;
        break;
      case 148:
        localObject1[i] = str2;
        i = 150;
        str1 = ".\013 k4\006\001\tx5\006\003!j/A\035)u{\002\f7j2\001\002dk>\036\020-k>\013E6|8\n\f2|)UE";
        j = 149;
        localObject1 = localObject2;
        break;
      case 149:
        localObject1[i] = str2;
        i = 151;
        str1 = "";
        j = 150;
        localObject1 = localObject2;
        break;
      case 150:
        localObject1[i] = str2;
        i = 152;
        str1 = "";
        j = 151;
        localObject1 = localObject2;
        break;
      case 151:
        localObject1[i] = str2;
        i = 153;
        str1 = "\016\0060p4\001_'q>\f\016\022x7\006\001\tx5\006\003!j/";
        j = 152;
        localObject1 = localObject2;
        break;
      case 152:
        localObject1[i] = str2;
        i = 154;
        str1 = "\f\013js+\032\026,7:\001\0016v2\013K-w/\n\01307\t*\"\rJ\017*7";
        j = 153;
        localObject1 = localObject2;
        break;
      case 153:
        localObject1[i] = str2;
        i = 155;
        str1 = "@\001%m:@";
        j = 154;
        localObject1 = localObject2;
        break;
      case 154:
        localObject1[i] = str2;
        i = 156;
        str1 = "\016\013 k4\006\001\033p?";
        j = 155;
        localObject1 = localObject2;
        break;
      case 155:
        localObject1[i] = str2;
        i = 157;
        str1 = ":1\0024c";
        j = 156;
        localObject1 = localObject2;
        break;
      case 156:
        localObject1[i] = str2;
        i = 158;
        str1 = ",\0206k>\001\021di0O\f*j/\016\t(|?O\025%m3UE";
        j = 157;
        localObject1 = localObject2;
        break;
      case 157:
        localObject1[i] = str2;
        i = 159;
        str1 = "@\001%m:@\0044it";
        j = 158;
        localObject1 = localObject2;
        break;
      case 158:
        localObject1[i] = str2;
        i = 160;
        str1 = "@\026=j/\n\bkx+\037J";
        j = 159;
        localObject1 = localObject2;
        break;
      case 159:
        localObject1[i] = str2;
        i = 161;
        str1 = "KA";
        j = 160;
        localObject1 = localObject2;
        break;
      case 160:
        localObject1[i] = str2;
        i = 162;
        str1 = "";
        j = 161;
        localObject1 = localObject2;
        break;
      case 161:
        localObject1[i] = str2;
        i = 163;
        str1 = "\037\n3|)";
        j = 162;
        localObject1 = localObject2;
        break;
      case 162:
        localObject1[i] = str2;
        i = 164;
        str1 = "0/\024l(\007";
        j = 163;
        localObject1 = localObject2;
        break;
      case 163:
        localObject1[i] = str2;
        i = 165;
        str1 = "(\f2|{\032\025dm4O\0260x)\033E%i+O\003+k{\006\0132x7\006\001di:\035\004)j{BE4x8\004\004#|\025\016\b!#";
        j = 164;
        localObject1 = localObject2;
        break;
      case 164:
        localObject1[i] = str2;
        i = 166;
        str1 = "!0\bU{\f\n*m>\027\021";
        j = 165;
        localObject1 = localObject2;
        break;
      case 165:
        localObject1[i] = str2;
        i = 167;
        str1 = "";
        j = 166;
        localObject1 = localObject2;
        break;
      case 166:
        localObject1[i] = str2;
        i = 168;
        str1 = "";
        j = 167;
        localObject1 = localObject2;
        break;
      case 167:
        localObject1[i] = str2;
        i = 169;
        str1 = "\030\f\"p";
        j = 168;
        localObject1 = localObject2;
        break;
      case 168:
        localObject1[i] = str2;
        i = 170;
        str1 = "?\027+z>\034\026+k";
        j = 169;
        localObject1 = localObject2;
        break;
      case 169:
        localObject1[i] = str2;
        i = 171;
        str1 = "@\0256v8@\0064l2\001\003+";
        j = 170;
        localObject1 = localObject2;
        break;
      case 170:
        localObject1[i] = str2;
        i = 172;
        str1 = "]\002";
        j = 171;
        localObject1 = localObject2;
        break;
      case 171:
        localObject1[i] = str2;
        i = 173;
        str1 = "\\\002";
        j = 172;
        localObject1 = localObject2;
        break;
      case 172:
        localObject1[i] = str2;
        i = 174;
        str1 = "[\002";
        j = 173;
        localObject1 = localObject2;
        break;
      case 173:
        localObject1[i] = str2;
        i = 175;
        str1 = ",+yX5\013\027+p?O!!{.\bI\013$\032\001\0016v2\013I\007$\016<";
        j = 174;
        localObject1 = localObject2;
      case 174:
      }
    }
    localObject1[i] = str2;
    z = localObject2;
    a = 1;
    ArrayList localArrayList = new ArrayList();
    b = localArrayList;
    String str3 = "\\P|/l\\Uu*lVP| n";
    int n = -1;
    label4605: String str4;
    while (true)
    {
      Object localObject4 = str3.toCharArray();
      int i1 = localObject4.length;
      int i2 = 0;
      if (i1 <= 1);
      label4745: 
      while (i1 > i2)
      {
        Object localObject8 = localObject4;
        int i10 = i2;
        int i11 = i1;
        Object localObject9 = localObject4;
        int i12 = localObject9[i2];
        int i13;
        switch (i10 % 5)
        {
        default:
          i13 = 91;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          localObject9[i2] = (char)(i13 ^ i12);
          i2 = i10 + 1;
          if (i11 != 0)
            break label4745;
          localObject9 = localObject8;
          i10 = i2;
          i2 = i11;
          break label4605;
          i17 = 111;
          break;
          i17 = 101;
          break;
          i17 = 68;
          break;
          i17 = 25;
          break;
          i13 = 111;
          continue;
          i13 = 101;
          continue;
          i13 = 68;
          continue;
          i13 = 25;
        }
        i1 = i11;
        localObject4 = localObject8;
      }
      str4 = new String((char[])localObject4).intern();
      switch (n)
      {
      default:
        localArrayList.add(str4);
        List localList = b;
        String str5 = "_Up bVUu)m[Ut)k";
        int i3 = -1;
        String str6;
        while (true)
        {
          Object localObject5 = str5.toCharArray();
          int i4 = localObject5.length;
          int i5 = 0;
          if (i4 <= 1);
          while (i4 > i5)
          {
            Object localObject6 = localObject5;
            int i6 = i5;
            int i7 = i4;
            Object localObject7 = localObject5;
            int i8 = localObject7[i5];
            int i9;
            switch (i6 % 5)
            {
            default:
              i9 = 91;
            case 0:
            case 1:
            case 2:
            case 3:
            }
            while (true)
            {
              localObject7[i5] = (char)(i9 ^ i8);
              i5 = i6 + 1;
              if (i7 != 0)
                break label4993;
              localObject7 = localObject6;
              i6 = i5;
              i5 = i7;
              break;
              i9 = 111;
              continue;
              i9 = 101;
              continue;
              i9 = 68;
              continue;
              i9 = 25;
            }
            i4 = i7;
            localObject5 = localObject6;
          }
          str6 = new String((char[])localObject5).intern();
          switch (i3)
          {
          default:
            localList.add(str6);
            localList = b;
            str5 = "_Ut)k_Ut)k_Ut)";
            i3 = 0;
            break;
          case 0:
            localList.add(str6);
            localList = b;
            str5 = "_Ut)k_Ut)k_Ut)k";
            i3 = 1;
          case 1:
          }
        }
        localList.add(str6);
        c = new X500Principal(z['¯']);
        d = 0L;
        e = new ArrayList();
        f = new ArrayList();
        localArrayList = e;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\022!1\001K\025*1";
        n = 0;
        break;
      case 0:
        localArrayList.add(str4);
        localArrayList = e;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\f..\001F\027 &\017";
        n = 1;
        break;
      case 1:
        localArrayList.add(str4);
        localArrayList = e;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\032,&\001J\b0+\001M\f 7\017F\b;$\020\\";
        n = 2;
        break;
      case 2:
        localArrayList.add(str4);
        localArrayList = f;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\r&'\026X\017*";
        n = 3;
        break;
      case 3:
        localArrayList.add(str4);
        localArrayList = f;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\030'$\n^\03602\r_\02206\020X\017*";
        n = 4;
        break;
      case 4:
        localArrayList.add(str4);
        localArrayList = new ArrayList();
        g = localArrayList;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\032,&\001J\b0#\rW\0360)\013Z\032;,\013W";
        n = 5;
        break;
      case 5:
        localArrayList.add(str4);
        localArrayList = g;
        str3 = "\016\013 k4\006\001ji>\035\b-j(\006\n*7\032,&\001J\b0&\013X\t< \033U\024,$\020P\024!";
        n = 6;
        break;
      case 6:
        label4993: localArrayList.add(str4);
        localArrayList = g;
        str3 = "";
        n = 7;
      case 7:
      }
    }
    localArrayList.add(str4);
    g.add(z[75]);
  }

  private static String A(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(z[''], 0);
    String str = localSharedPreferences.getString(z[''], null);
    if (str == null)
    {
      str = UUID.randomUUID().toString();
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      localEditor.putString(z[''], str);
      localEditor.commit();
    }
    return str;
  }

  private static boolean B(Context paramContext)
  {
    try
    {
      Intent localIntent = new Intent(z[68]);
      localIntent.setPackage(paramContext.getPackageName());
      localIntent.addCategory(z[67]);
      ActivityInfo localActivityInfo = paramContext.getPackageManager().resolveActivity(localIntent, 0).activityInfo;
      if (localActivityInfo != null)
      {
        Class localClass = Class.forName(localActivityInfo.name);
        if (localClass == null)
          return false;
        if (!InstrumentedActivity.class.isAssignableFrom(localClass))
        {
          boolean bool = InstrumentedListActivity.class.isAssignableFrom(localClass);
          if (!bool);
        }
        else
        {
          return true;
        }
      }
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private static void C(Context paramContext)
  {
    ac.c();
    if (h == null)
      h = new PushReceiver();
    paramContext.registerReceiver(h, new IntentFilter(z[78]));
    paramContext.registerReceiver(h, new IntentFilter(z[82]));
    try
    {
      IntentFilter localIntentFilter1 = new IntentFilter(z[80]);
      localIntentFilter1.addDataScheme(z[81]);
      IntentFilter localIntentFilter2 = new IntentFilter(z[77]);
      localIntentFilter2.addDataScheme(z[81]);
      IntentFilter localIntentFilter3 = new IntentFilter(z[79]);
      localIntentFilter3.setPriority(1000);
      localIntentFilter3.addCategory(paramContext.getPackageName());
      paramContext.registerReceiver(h, localIntentFilter1);
      paramContext.registerReceiver(h, localIntentFilter2);
      paramContext.registerReceiver(h, localIntentFilter3);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static int a(Context paramContext, float paramFloat)
  {
    return (int)(paramFloat * paramContext.getResources().getDisplayMetrics().density);
  }

  public static Intent a(Context paramContext, cn.jpush.android.data.c paramc)
  {
    Intent localIntent = new Intent(paramContext, PopWinActivity.class);
    localIntent.putExtra(z[52], paramc);
    localIntent.addFlags(335544320);
    return localIntent;
  }

  public static Intent a(Context paramContext, cn.jpush.android.data.c paramc, boolean paramBoolean)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra(z[111], paramBoolean);
    localIntent.putExtra(z[52], paramc);
    localIntent.setAction(z[112]);
    localIntent.addCategory(paramContext.getPackageName());
    localIntent.addFlags(335544320);
    return localIntent;
  }

  public static String a(int paramInt)
  {
    String str = z[18];
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 8))
      str = z[16];
    do
    {
      return str;
      if ((paramInt == 4) || (paramInt == 7) || (paramInt == 5) || (paramInt == 6))
        return z[15];
    }
    while (paramInt != 13);
    return z[17];
  }

  public static String a(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics == null)
      return z[62];
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    return i + "*" + j;
  }

  public static String a(Context paramContext, String paramString)
  {
    String str1 = Build.VERSION.RELEASE + "," + Integer.toString(Build.VERSION.SDK_INT);
    String str2 = Build.MODEL;
    String str3 = s.a(paramContext, z[121], z[118]);
    String str4 = Build.DEVICE;
    String str5 = a.F();
    if (an.a(str5))
      str5 = " ";
    StringBuilder localStringBuilder = new StringBuilder().append(str1).append(z['¡']).append(str2).append(z['¡']).append(str3).append(z['¡']).append(str4).append(z['¡']).append(str5).append(z['¡']).append(paramString).append(z['¡']);
    String str6 = paramContext.getApplicationInfo().sourceDir;
    int i;
    if (an.a(str6))
    {
      ac.e();
      i = 0;
      if (i == 0)
        break label306;
    }
    label306: for (int j = 1; ; j = 0)
    {
      return j + z['¡'] + a(paramContext);
      new StringBuilder(z['']).append(str6);
      ac.b();
      if (str6.startsWith(z[' ']))
      {
        i = 1;
        break;
      }
      if (str6.startsWith(z['']))
      {
        i = 0;
        break;
      }
      ac.c();
      i = 0;
      break;
    }
  }

  public static String a(String paramString)
  {
    int i = 0;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance(z[73]);
      char[] arrayOfChar = paramString.toCharArray();
      byte[] arrayOfByte1 = new byte[arrayOfChar.length];
      for (int j = 0; j < arrayOfChar.length; j++)
        arrayOfByte1[j] = (byte)arrayOfChar[j];
      byte[] arrayOfByte2 = localMessageDigest.digest(arrayOfByte1);
      StringBuffer localStringBuffer = new StringBuffer();
      while (i < arrayOfByte2.length)
      {
        int k = 0xFF & arrayOfByte2[i];
        if (k < 16)
          localStringBuffer.append("0");
        localStringBuffer.append(Integer.toHexString(k));
        i++;
      }
      String str = localStringBuffer.toString();
      return str;
    }
    catch (Exception localException)
    {
      ac.b();
    }
    return "";
  }

  public static String a(byte[] paramArrayOfByte)
  {
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance(z[73]).digest(paramArrayOfByte);
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfByte.length; i++)
      {
        int j = 0xFF & arrayOfByte[i];
        if (j < 16)
          localStringBuffer.append("0");
        localStringBuffer.append(Integer.toHexString(j));
      }
      String str = localStringBuffer.toString();
      return str;
    }
    catch (Exception localException)
    {
      ac.b();
    }
    return "";
  }

  public static JSONObject a(String paramString1, String paramString2)
  {
    if ((paramString2 == null) || (paramString2.length() == 0))
      return null;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[109], paramString2);
      localJSONObject.put(z[33], paramString1);
      localJSONObject.put(z[110], a.m());
      return localJSONObject;
    }
    catch (Exception localException)
    {
      localException.getMessage();
      ac.e();
    }
    return null;
  }

  public static JSONObject a(String paramString, JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      return null;
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[109], paramJSONArray);
      localJSONObject.put(z[33], paramString);
      localJSONObject.put(z[110], a.m());
      return localJSONObject;
    }
    catch (Exception localException)
    {
      localException.getMessage();
      ac.e();
    }
    return null;
  }

  public static void a(Context paramContext, String paramString, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      ac.e(z[6], z[108]);
      return;
    }
    Intent localIntent = new Intent(paramString);
    paramBundle.putString(z[91], a.E());
    localIntent.putExtras(paramBundle);
    String str = paramContext.getPackageName();
    localIntent.addCategory(str);
    paramContext.sendBroadcast(localIntent, String.format(z[87], new Object[] { str }));
  }

  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    Uri localUri = Uri.parse(paramString2);
    if (localUri == null)
    {
      new StringBuilder(z[60]).append(paramString2);
      ac.b();
      return;
    }
    Intent localIntent1 = new Intent(z[57], localUri);
    localIntent1.setFlags(335544320);
    Intent.ShortcutIconResource localShortcutIconResource = Intent.ShortcutIconResource.fromContext(paramContext, paramInt);
    Intent localIntent2 = new Intent(z[56]);
    localIntent2.putExtra(z[58], false);
    localIntent2.putExtra(z[54], paramString1);
    localIntent2.putExtra(z[59], localIntent1);
    localIntent2.putExtra(z[55], localShortcutIconResource);
    paramContext.sendBroadcast(localIntent2);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = new Bundle();
    if (paramString2 != null)
      localBundle.putString(paramString2, paramString3);
    a(paramContext, paramString1, localBundle);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    Bundle localBundle = new Bundle();
    if ((paramString2 != null) && (paramArrayOfByte != null))
      localBundle.putSerializable(paramString2, paramArrayOfByte);
    a(paramContext, paramString1, localBundle);
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    ac.b(z[6], z[47]);
    try
    {
      Bundle localBundle = new Bundle();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(z[46], paramBoolean);
      localBundle.putString(z[45], localJSONObject.toString());
      a(paramContext, z[48], localBundle);
      return;
    }
    catch (JSONException localJSONException)
    {
      new StringBuilder(z[49]).append(localJSONException.getMessage());
      ac.d();
    }
  }

  public static void a(WebSettings paramWebSettings)
  {
    paramWebSettings.setJavaScriptEnabled(true);
    paramWebSettings.setDefaultTextEncodingName(z['']);
    paramWebSettings.setSupportZoom(true);
    paramWebSettings.setCacheMode(2);
    paramWebSettings.setSaveFormData(false);
    paramWebSettings.setSavePassword(false);
  }

  public static boolean a()
  {
    boolean bool = Environment.getExternalStorageState().equals(z[76]);
    if (!bool)
      ac.b();
    return bool;
  }

  private static boolean a(Context paramContext, Class<?> paramClass)
  {
    return !paramContext.getPackageManager().queryBroadcastReceivers(new Intent(paramContext, paramClass), 0).isEmpty();
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext == null)
      throw new IllegalArgumentException(z['¦']);
    if (TextUtils.isEmpty(paramString1))
    {
      new StringBuilder(z['¥']).append(paramString1);
      ac.d();
      return false;
    }
    Intent localIntent = n(paramContext, paramString1);
    if (localIntent == null)
    {
      try
      {
        if (TextUtils.isEmpty(paramString2))
        {
          ac.b();
          return false;
        }
      }
      catch (Exception localException)
      {
        ac.g();
        return false;
      }
      localIntent = new Intent();
      localIntent.setClassName(paramString1, paramString2);
      localIntent.addCategory(z[67]);
    }
    localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
    return true;
  }

  public static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString);
    localIntent.addCategory(paramContext.getPackageName());
    return !localPackageManager.queryBroadcastReceivers(localIntent, 0).isEmpty();
  }

  public static String b(Context paramContext, String paramString)
  {
    String str1 = Build.VERSION.RELEASE + "," + Integer.toString(Build.VERSION.SDK_INT);
    String str2 = Build.MODEL;
    String str3 = s.a(paramContext, z[121], z[118]);
    String str4 = Build.DEVICE;
    String str5 = a.F();
    if (an.a(str5))
      str5 = " ";
    String str6 = c(paramContext);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(z[123], str1);
      localJSONObject.put(z[117], str2);
      localJSONObject.put(z[118], str3);
      localJSONObject.put(z[120], str4);
      localJSONObject.put(z[119], str5);
      localJSONObject.put(z[122], str6);
      localJSONObject.put(z[116], paramString);
      label187: return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      break label187;
    }
  }

  public static String b(String paramString)
  {
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance(z[73]).digest(paramString.getBytes(z[83]));
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfByte.length; i++)
      {
        int j = 0xFF & arrayOfByte[i];
        if (j < 16)
          localStringBuffer.append("0");
        localStringBuffer.append(Integer.toHexString(j));
      }
      String str = localStringBuffer.toString();
      return str;
    }
    catch (Exception localException)
    {
      ac.b();
    }
    return "";
  }

  public static void b()
  {
    try
    {
      PowerManager.WakeLock localWakeLock = t.a().b();
      if (localWakeLock != null)
      {
        boolean bool = localWakeLock.isHeld();
        if (!bool);
      }
      else
      {
        try
        {
          localWakeLock.release();
          long l = System.currentTimeMillis() - d;
          d = 0L;
          new StringBuilder(z[41]).append(l);
          ac.a();
          return;
        }
        catch (RuntimeException localRuntimeException)
        {
          ac.h();
          return;
        }
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      localIllegalStateException.printStackTrace();
      ac.b();
      return;
      ac.a();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      ac.b();
    }
  }

  public static void b(Context paramContext, cn.jpush.android.data.c paramc)
  {
    try
    {
      Intent localIntent = new Intent(z[88]);
      localIntent.putExtra(z[91], paramc.n);
      localIntent.putExtra(z[92], paramc.i);
      localIntent.putExtra(z[85], paramc.j);
      localIntent.putExtra(z[84], paramc.k);
      localIntent.putExtra(z[65], paramc.l);
      localIntent.putExtra(z[89], paramc.c);
      if (paramc.e())
        localIntent.putExtra(z[90], paramc.C);
      localIntent.addCategory(paramc.m);
      String str1 = z[87];
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramc.m;
      paramContext.sendBroadcast(localIntent, String.format(str1, arrayOfObject1));
      StringBuilder localStringBuilder = new StringBuilder(z[86]);
      String str2 = z[87];
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = paramc.m;
      localStringBuilder.append(String.format(str2, arrayOfObject2));
      ac.c();
      i.a(paramc.c, 1018, paramContext);
      return;
    }
    catch (Exception localException)
    {
      localException.getMessage();
      ac.e();
    }
  }

  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    a(paramContext, paramString1, z[65], paramString2);
  }

  public static void b(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    if (!g(paramContext));
    Intent localIntent;
    PendingIntent localPendingIntent;
    NotificationManager localNotificationManager;
    int i;
    while (true)
    {
      return;
      ac.b();
      localIntent = new Intent(paramContext, PushReceiver.class);
      localIntent.setAction(z[30]);
      localIntent.putExtra(z[31], true);
      if (-1 == paramInt)
      {
        localIntent.putExtra(z[37], paramString2);
        localIntent.putExtra(z[33], paramInt);
        localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, localIntent, 134217728);
        localNotificationManager = (NotificationManager)paramContext.getSystemService(z[39]);
        i = paramContext.getApplicationContext().getResources().getIdentifier(z[32], z[40], paramContext.getApplicationContext().getPackageName());
        if (i != 0)
          break label372;
        try
        {
          int k = paramContext.getPackageManager().getApplicationInfo(paramContext.getApplicationContext().getPackageName(), 0).icon;
          j = k;
          if (-1 == paramInt)
          {
            str1 = z[38];
            str2 = z[36];
            l = System.currentTimeMillis();
            if (Build.VERSION.SDK_INT < 11)
              break label332;
            localObject = new Notification.Builder(paramContext.getApplicationContext()).setContentTitle(str1).setContentText(str2).setContentIntent(localPendingIntent).setSmallIcon(j).setTicker(paramString1).setWhen(l).getNotification();
            ((Notification)localObject).flags = 34;
            if (localObject == null)
              continue;
            localNotificationManager.notify(paramString1.hashCode(), (Notification)localObject);
            return;
            localIntent.putExtra(z[34], paramString2);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ac.b(z[6], z[29], localException);
            j = 17301586;
            continue;
            str1 = z[28];
            str2 = z[35];
            continue;
            localNotification = new Notification(j, paramString1, l);
            localNotification.flags = 34;
            m.a(localNotification, paramContext, str1, str2, localPendingIntent);
            localObject = localNotification;
          }
        }
      }
    }
    while (true)
    {
      String str1;
      String str2;
      long l;
      Object localObject;
      label332: Notification localNotification;
      label372: int j = i;
    }
  }

  public static boolean b(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService(z[64])).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        boolean bool = localNetworkInfo.isConnected();
        if (bool)
          return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }

  private static boolean b(Context paramContext, Class<?> paramClass)
  {
    return !paramContext.getPackageManager().queryIntentServices(new Intent(paramContext, paramClass), 0).isEmpty();
  }

  private static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString);
    if (paramBoolean)
      localIntent.addCategory(paramContext.getPackageName());
    return !localPackageManager.queryIntentServices(localIntent, 0).isEmpty();
  }

  public static int c(String paramString)
  {
    String[] arrayOfString = paramString.split(z[95]);
    return (Integer.parseInt(arrayOfString[0]) << 16) + (Integer.parseInt(arrayOfString[1]) << 8) + Integer.parseInt(arrayOfString[2]);
  }

  public static String c()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    BufferedReader localBufferedReader;
    if (new File(z['«']).exists())
      try
      {
        localBufferedReader = new BufferedReader(new FileReader(new File(z['«'])));
        while (true)
        {
          str = localBufferedReader.readLine();
          if (str == null)
            break;
          if (str.contains(z['ª']))
          {
            i = str.indexOf(":");
            if ((i >= 0) && (i < -1 + str.length()))
              localStringBuffer.append(str.substring(i + 1).trim());
          }
        }
      }
      catch (IOException localIOException)
      {
      }
    while (true)
    {
      String str;
      int i;
      return localStringBuffer.toString();
      localBufferedReader.close();
    }
  }

  public static String c(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService(z[64])).getActiveNetworkInfo();
      if (localNetworkInfo == null)
        return z[63];
      str1 = localNetworkInfo.getTypeName();
      String str2 = localNetworkInfo.getSubtypeName();
      if (str1 == null)
        return z[63];
      if (!an.a(str2))
      {
        String str3 = str1 + "," + str2;
        return str3;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      str1 = z[63];
    }
    String str1;
    return str1;
  }

  public static boolean c(Context paramContext, String paramString)
  {
    if (paramContext != null);
    try
    {
      if (TextUtils.isEmpty(paramString))
        throw new IllegalArgumentException(z[99]);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return false;
    }
    int i;
    do
      i = paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName());
    while (i != 0);
    return true;
  }

  private static boolean c(Context paramContext, String paramString1, String paramString2)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent(paramString2);
    localIntent.setPackage(paramContext.getPackageName());
    Iterator localIterator = localPackageManager.queryBroadcastReceivers(localIntent, 0).iterator();
    while (localIterator.hasNext())
    {
      ActivityInfo localActivityInfo = ((ResolveInfo)localIterator.next()).activityInfo;
      if ((localActivityInfo != null) && (localActivityInfo.name.equals(paramString1)))
        return true;
    }
    return false;
  }

  public static String d()
  {
    try
    {
      InetAddress localInetAddress;
      do
      {
        Enumeration localEnumeration1 = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration2;
        while (!localEnumeration2.hasMoreElements())
        {
          if (!localEnumeration1.hasMoreElements())
            break;
          localEnumeration2 = ((NetworkInterface)localEnumeration1.nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration2.nextElement();
      }
      while ((localInetAddress.isLoopbackAddress()) || (!(localInetAddress instanceof Inet4Address)));
      String str = localInetAddress.getHostAddress().toString();
      return str;
    }
    catch (Exception localException)
    {
      ac.d();
      localException.printStackTrace();
    }
    return "";
  }

  public static String d(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService(z[64])).getActiveNetworkInfo();
      if (localNetworkInfo == null)
        return "";
      String str = localNetworkInfo.getTypeName().toUpperCase(Locale.getDefault());
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return "";
  }

  public static boolean d(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), paramString);
    try
    {
      localPackageManager.getReceiverInfo(localComponentName, 128);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  private static boolean d(String paramString)
  {
    if (an.a(paramString));
    while (paramString.length() < 10)
      return false;
    for (int i = 0; ; i++)
    {
      if (i >= b.size())
        break label73;
      if ((paramString.equals(b.get(i))) || (paramString.startsWith((String)b.get(i))))
        break;
    }
    label73: return true;
  }

  private static String e()
  {
    try
    {
      String str2 = Environment.getExternalStorageDirectory().getPath();
      str1 = str2;
      if (!an.a(str1))
        str1 = str1 + z[''];
      return str1;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      while (true)
      {
        localArrayIndexOutOfBoundsException.printStackTrace();
        str1 = null;
      }
    }
    catch (Exception localException)
    {
      while (true)
        String str1 = null;
    }
  }

  // ERROR //
  private static String e(String paramString)
  {
    // Byte code:
    //   0: invokestatic 1180	cn/jpush/android/util/b:e	()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_1
    //   5: invokestatic 660	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   8: ifeq +10 -> 18
    //   11: invokestatic 673	cn/jpush/android/util/ac:e	()V
    //   14: aconst_null
    //   15: astore_0
    //   16: aload_0
    //   17: areturn
    //   18: new 1053	java/io/File
    //   21: dup
    //   22: aload_1
    //   23: invokespecial 1054	java/io/File:<init>	(Ljava/lang/String;)V
    //   26: astore_2
    //   27: aload_2
    //   28: invokevirtual 1057	java/io/File:exists	()Z
    //   31: ifne +8 -> 39
    //   34: aload_2
    //   35: invokevirtual 1183	java/io/File:mkdir	()Z
    //   38: pop
    //   39: invokestatic 1185	cn/jpush/android/util/b:f	()Ljava/lang/String;
    //   42: invokestatic 660	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   45: ifeq +28 -> 73
    //   48: getstatic 392	cn/jpush/android/util/b:z	[Ljava/lang/String;
    //   51: bipush 6
    //   53: aaload
    //   54: getstatic 392	cn/jpush/android/util/b:z	[Ljava/lang/String;
    //   57: bipush 51
    //   59: aaload
    //   60: invokestatic 737	cn/jpush/android/util/ac:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: aconst_null
    //   64: areturn
    //   65: astore 16
    //   67: invokestatic 1187	cn/jpush/android/util/ac:i	()V
    //   70: goto -31 -> 39
    //   73: new 1053	java/io/File
    //   76: dup
    //   77: new 612	java/lang/StringBuilder
    //   80: dup
    //   81: invokespecial 613	java/lang/StringBuilder:<init>	()V
    //   84: aload_1
    //   85: invokevirtual 622	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: getstatic 392	cn/jpush/android/util/b:z	[Ljava/lang/String;
    //   91: bipush 50
    //   93: aaload
    //   94: invokevirtual 622	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: invokevirtual 623	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokespecial 1054	java/io/File:<init>	(Ljava/lang/String;)V
    //   103: astore_3
    //   104: aload_3
    //   105: invokevirtual 1057	java/io/File:exists	()Z
    //   108: ifeq +8 -> 116
    //   111: aload_3
    //   112: invokevirtual 1190	java/io/File:delete	()Z
    //   115: pop
    //   116: aload_3
    //   117: invokevirtual 1193	java/io/File:createNewFile	()Z
    //   120: pop
    //   121: new 1195	java/io/FileOutputStream
    //   124: dup
    //   125: aload_3
    //   126: invokespecial 1196	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   129: astore 6
    //   131: aload 6
    //   133: aload_0
    //   134: invokevirtual 1199	java/lang/String:getBytes	()[B
    //   137: invokevirtual 1203	java/io/FileOutputStream:write	([B)V
    //   140: aload 6
    //   142: invokevirtual 1206	java/io/FileOutputStream:flush	()V
    //   145: invokestatic 542	cn/jpush/android/util/ac:c	()V
    //   148: aload 6
    //   150: ifnull -134 -> 16
    //   153: aload 6
    //   155: invokevirtual 1207	java/io/FileOutputStream:close	()V
    //   158: aload_0
    //   159: areturn
    //   160: astore 11
    //   162: aload_0
    //   163: areturn
    //   164: astore 14
    //   166: aconst_null
    //   167: areturn
    //   168: astore 4
    //   170: invokestatic 1187	cn/jpush/android/util/ac:i	()V
    //   173: aconst_null
    //   174: areturn
    //   175: astore 13
    //   177: aconst_null
    //   178: astore 6
    //   180: invokestatic 1187	cn/jpush/android/util/ac:i	()V
    //   183: aload 6
    //   185: ifnull +8 -> 193
    //   188: aload 6
    //   190: invokevirtual 1207	java/io/FileOutputStream:close	()V
    //   193: aconst_null
    //   194: areturn
    //   195: astore 12
    //   197: aconst_null
    //   198: astore 6
    //   200: aload 12
    //   202: astore 8
    //   204: aload 6
    //   206: ifnull +8 -> 214
    //   209: aload 6
    //   211: invokevirtual 1207	java/io/FileOutputStream:close	()V
    //   214: aload 8
    //   216: athrow
    //   217: astore 10
    //   219: goto -26 -> 193
    //   222: astore 9
    //   224: goto -10 -> 214
    //   227: astore 8
    //   229: goto -25 -> 204
    //   232: astore 7
    //   234: goto -54 -> 180
    //
    // Exception table:
    //   from	to	target	type
    //   34	39	65	java/lang/Exception
    //   153	158	160	java/io/IOException
    //   111	116	164	java/lang/SecurityException
    //   116	121	168	java/io/IOException
    //   121	131	175	java/io/IOException
    //   121	131	195	finally
    //   188	193	217	java/io/IOException
    //   209	214	222	java/io/IOException
    //   131	148	227	finally
    //   180	183	227	finally
    //   131	148	232	java/io/IOException
  }

  public static void e(Context paramContext)
  {
    h(paramContext, null);
  }

  public static void e(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    localIntent.setAction(z[57]);
    localIntent.setDataAndType(Uri.fromFile(new File(paramString)), z['¢']);
    paramContext.startActivity(localIntent);
  }

  public static int f(Context paramContext)
  {
    if (paramContext == null);
    while (true)
    {
      return -1;
      IntentFilter localIntentFilter = new IntentFilter(z[98]);
      try
      {
        Intent localIntent2 = paramContext.registerReceiver(null, localIntentFilter);
        localIntent1 = localIntent2;
        if (localIntent1 == null)
          continue;
        int i = localIntent1.getIntExtra(z[96], -1);
        if ((i == 2) || (i == 5))
        {
          j = 1;
          if (j == 0)
            continue;
          return localIntent1.getIntExtra(z[97], -1);
        }
      }
      catch (SecurityException localSecurityException)
      {
        while (true)
        {
          localSecurityException.printStackTrace();
          localIntent1 = null;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          localException.printStackTrace();
          Intent localIntent1 = null;
          continue;
          int j = 0;
        }
      }
    }
  }

  private static int f(String paramString)
  {
    if (an.a(paramString))
      ac.d();
    do
    {
      return 0;
      if (Pattern.matches(z[115], paramString))
      {
        ac.c();
        return 0;
      }
      if (Pattern.matches(z[114], paramString))
      {
        ac.c();
        return 1;
      }
    }
    while (!Pattern.matches(z[113], paramString));
    ac.c();
    return 2;
  }

  private static String f()
  {
    String str = e();
    if (str == null)
      return null;
    return str + z[50];
  }

  public static boolean f(Context paramContext, String paramString)
  {
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 0);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  private static String g()
  {
    String str1 = f();
    if (an.a(str1))
    {
      ac.e(z[6], z[51]);
      return null;
    }
    File localFile = new File(str1);
    if (localFile.exists())
      try
      {
        ArrayList localArrayList = r.a(new FileInputStream(localFile));
        if (localArrayList.size() > 0)
        {
          String str2 = (String)localArrayList.get(0);
          new StringBuilder(z[61]).append(str2);
          ac.c();
          return str2;
        }
      }
      catch (Exception localException)
      {
        return null;
      }
    return null;
  }

  public static String g(Context paramContext, String paramString)
  {
    if (Build.VERSION.SDK_INT < 23)
    {
      if (!c(paramContext, z[75]));
      while (true)
      {
        return paramString;
        try
        {
          String str3 = ((WifiManager)paramContext.getSystemService(z['©'])).getConnectionInfo().getMacAddress();
          boolean bool = an.a(str3);
          if (!bool)
            return str3;
        }
        catch (Exception localException2)
        {
          ac.i();
          return paramString;
        }
      }
    }
    String str1 = "";
    try
    {
      String str2 = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec(z['¨']).getInputStream())).readLine();
      if (!TextUtils.isEmpty(str2))
      {
        str1 = str2.trim();
        new StringBuilder(z['§']).append(str1);
        ac.b();
      }
      return str1;
    }
    catch (Exception localException1)
    {
      while (true)
        localException1.printStackTrace();
    }
  }

  public static boolean g(Context paramContext)
  {
    boolean bool1 = false;
    try
    {
      Signature[] arrayOfSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures;
      CertificateFactory localCertificateFactory = CertificateFactory.getInstance(z[53]);
      int i = 0;
      while (true)
      {
        if (i >= arrayOfSignature.length)
          break label104;
        boolean bool3 = ((X509Certificate)localCertificateFactory.generateCertificate(new ByteArrayInputStream(arrayOfSignature[i].toByteArray()))).getSubjectX500Principal().equals(c);
        bool2 = bool3;
        if (bool2)
          break;
        i++;
        bool1 = bool2;
      }
    }
    catch (Exception localException)
    {
      boolean bool2 = bool1;
      return bool2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      return bool1;
    }
    label104: return bool1;
  }

  public static String h(Context paramContext)
  {
    String str1 = a.i(paramContext);
    if ((!an.a(str1)) && (d(str1)))
      return str1;
    String str2 = x(paramContext);
    a.d(paramContext, str2);
    return str2;
  }

  public static void h(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(z[68]);
    String str = paramContext.getPackageName();
    localIntent.setPackage(str);
    if (!an.a(paramString))
      localIntent.putExtra(z[65], paramString);
    localIntent.addCategory(z[67]);
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 0);
    new StringBuilder(z[66]).append(localResolveInfo.activityInfo.name);
    ac.c();
    localIntent.setClassName(str, localResolveInfo.activityInfo.name);
    localIntent.setFlags(268435456);
    paramContext.startActivity(localIntent);
  }

  public static String i(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), z['']);
  }

  public static String i(Context paramContext, String paramString)
  {
    try
    {
      if (c(paramContext, z[69]))
      {
        String str = ((TelephonyManager)paramContext.getSystemService(z[70])).getSimSerialNumber();
        paramString = str;
      }
      return paramString;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }

  public static String j(Context paramContext)
  {
    String str1 = null;
    String str2 = a.D();
    if (!an.a(str2))
    {
      a = -1 + c.d;
      return str2;
    }
    String str3 = p(paramContext, str2);
    if (!an.a(str3))
    {
      a = -1 + c.b;
      o(paramContext, str3);
      a.g(str3);
      return str3;
    }
    if (!a())
      ac.e();
    while (!an.a(str1))
    {
      a = -1 + c.c;
      q(paramContext, str1);
      a.g(str1);
      return str1;
      boolean bool1 = c(paramContext, z[13]);
      str1 = null;
      if (bool1)
        if (Build.VERSION.SDK_INT >= 23)
        {
          boolean bool2 = c(paramContext, z[13]);
          str1 = null;
          if (bool2)
          {
            boolean bool3 = c(paramContext, z[14]);
            str1 = null;
            if (!bool3);
          }
        }
        else
        {
          str1 = g();
        }
    }
    if (Build.VERSION.SDK_INT < 23);
    for (String str4 = j(paramContext, str1); ; str4 = "")
    {
      String str5 = i(paramContext);
      String str6 = g(paramContext, "");
      String str7 = UUID.randomUUID().toString();
      String str8 = a(str4 + str5 + str6 + str7);
      if (an.a(str8))
        str8 = str7;
      a.g(str8);
      a = -1 + c.a;
      q(paramContext, str8);
      o(paramContext, str8);
      return str8;
    }
  }

  public static String j(Context paramContext, String paramString)
  {
    try
    {
      if (c(paramContext, z[69]))
      {
        String str = ((TelephonyManager)paramContext.getSystemService(z[70])).getDeviceId();
        paramString = str;
      }
      return paramString;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }

  public static String k(Context paramContext, String paramString)
  {
    try
    {
      if (c(paramContext, z[69]))
      {
        String str = ((TelephonyManager)paramContext.getSystemService(z[70])).getSubscriberId();
        paramString = str;
      }
      return paramString;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }

  public static void k(Context paramContext)
  {
    try
    {
      PowerManager.WakeLock localWakeLock = ((PowerManager)paramContext.getSystemService(z['£'])).newWakeLock(1, e.c + z['¤']);
      localWakeLock.setReferenceCounted(false);
      t.a().a(localWakeLock);
      if (!t.a().b().isHeld())
      {
        t.a().b().acquire();
        d = System.currentTimeMillis();
        ac.a();
        return;
      }
      ac.a();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      localIllegalStateException.printStackTrace();
      ac.b();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      ac.b();
    }
  }

  public static JSONArray l(Context paramContext)
  {
    ArrayList localArrayList = v.a(paramContext, true);
    JSONArray localJSONArray = new JSONArray();
    try
    {
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        ad localad = (ad)localIterator.next();
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put(z[21], localad.a);
        localJSONObject.put(z[22], localad.b);
        localJSONObject.put(z[19], localad.c);
        localJSONObject.put(z[20], localad.d);
        localJSONArray.put(localJSONObject);
      }
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONArray;
  }

  public static void l(Context paramContext, String paramString)
  {
    if (!an.a(paramString))
    {
      q(paramContext, paramString);
      o(paramContext, paramString);
      a.g(paramString);
    }
  }

  public static boolean m(Context paramContext)
  {
    try
    {
      if (!a.g(paramContext))
      {
        ac.c(z[6], z[25]);
        return false;
      }
      str1 = a.f(paramContext);
      if (an.a(str1))
      {
        ac.c();
        return true;
      }
      new StringBuilder(z[24]).append(str1);
      ac.c();
      arrayOfString1 = str1.split("_");
      str2 = arrayOfString1[0];
      str3 = arrayOfString1[1];
      arrayOfChar = str2.toCharArray();
      arrayOfString2 = str3.split(z[27]);
      localCalendar = Calendar.getInstance();
      i = localCalendar.get(7);
      j = localCalendar.get(11);
      k = arrayOfChar.length;
      m = 0;
      if (m < k)
      {
        if (i == 1 + Integer.valueOf(String.valueOf(arrayOfChar[m])).intValue())
        {
          n = Integer.valueOf(arrayOfString2[0]).intValue();
          i1 = Integer.valueOf(arrayOfString2[1]).intValue();
          if ((j >= n) && (j <= i1))
            return true;
        }
      }
      else
      {
        ac.c(z[6], z[26] + str1);
        return false;
      }
    }
    catch (Exception localException)
    {
      return true;
    }
    while (true)
    {
      String str1;
      String[] arrayOfString1;
      String str2;
      String str3;
      char[] arrayOfChar;
      String[] arrayOfString2;
      Calendar localCalendar;
      int i;
      int j;
      int k;
      int m;
      int n;
      int i1;
      m++;
    }
  }

  private static boolean m(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString)))
      throw new IllegalArgumentException(z[99]);
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      localPackageManager.getPermissionInfo(paramString, 128);
      return true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return false;
  }

  private static Intent n(Context paramContext, String paramString)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager.getPackageInfo(paramString, 256) != null)
      {
        Intent localIntent = localPackageManager.getLaunchIntentForPackage(paramString);
        return localIntent;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return null;
  }

  public static boolean n(Context paramContext)
  {
    ac.b();
    String str = a.e(paramContext);
    if (TextUtils.isEmpty(str));
    int i;
    int j;
    int k;
    int m;
    while (true)
    {
      return false;
      try
      {
        JSONObject localJSONObject = new JSONObject(str);
        i = localJSONObject.optInt(z[2], -1);
        j = localJSONObject.optInt(z[1], -1);
        k = localJSONObject.optInt(z[0], -1);
        m = localJSONObject.optInt(z[8], -1);
        if ((i >= 0) && (j >= 0) && (k >= 0) && (m >= 0) && (j <= 59) && (m <= 59) && (k <= 23) && (i <= 23))
        {
          localCalendar = Calendar.getInstance();
          n = localCalendar.get(11);
          i1 = localCalendar.get(12);
          new StringBuilder(z[4]).append(n).append(z[3]).append(i1).append(z[9]).append(i).append(z[12]).append(j).append(z[11]).append(k).append(z[7]).append(m);
          ac.a();
          if (i < k)
          {
            if ((n <= i) || (n >= k));
          }
          else
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    ac.c(z[6], z[10] + i + ":" + j + z[5] + k + ":" + m);
                    return true;
                    if (i != k)
                      break label387;
                    if (j < m)
                      break;
                  }
                  while ((n != i) || (i1 <= m) || (i1 >= j));
                  return false;
                  if ((n != i) || (i1 < j))
                    break;
                }
                while (i1 <= m);
                return false;
                if (i <= k)
                  break;
              }
              while (((n > i) && (n <= 23)) || ((n >= 0) && (n < k)) || ((n == i) && (i1 >= j)));
              if (n != k)
                break;
            }
            while (i1 <= m);
            return false;
          }
        }
      }
      catch (JSONException localJSONException)
      {
        return false;
      }
    }
    while (true)
    {
      Calendar localCalendar;
      int n;
      int i1;
      label387: if ((n != i) || (i1 < j))
        if ((n != k) || (i1 > m))
          break;
    }
  }

  private static String o(Context paramContext, String paramString)
  {
    if ((!a()) || (!c(paramContext, z[13])));
    do
    {
      return null;
      if (Build.VERSION.SDK_INT < 23)
        return e(paramString);
    }
    while ((!c(paramContext, z[13])) || (!c(paramContext, z[14])));
    return e(paramString);
  }

  public static boolean o(Context paramContext)
  {
    ac.b(z[6], z['']);
    int k;
    int m;
    if (!b(paramContext, PushService.class))
    {
      ac.e(z[6], z[''] + PushService.class.getCanonicalName());
      k = 0;
      if (an.a(a.E()))
        break label1092;
      m = 1;
    }
    while (true)
    {
      if ((!e.k) && (!B(paramContext)))
        ac.d(z[6], z['']);
      if ((m == 0) || (k == 0))
        break label1135;
      return true;
      if (r(paramContext, PushService.class.getCanonicalName()))
        ac.a();
      for (e.n = true; ; e.n = false)
      {
        if (b(paramContext, z[''], false))
          break label184;
        ac.e(z[6], z['']);
        k = 0;
        break;
        ac.a();
      }
      label184: if (!b(paramContext, z[''], false))
      {
        ac.e(z[6], z['']);
        k = 0;
        break;
      }
      if (!b(paramContext, DaemonService.class))
      {
        ac.d(z[6], z[''] + DaemonService.class.getCanonicalName());
        e.m = false;
        label270: if (!b(paramContext, DownloadService.class))
          ac.d(z[6], z[''] + DownloadService.class.getCanonicalName());
        if (a(paramContext, PushReceiver.class))
          break label414;
        ac.e(z[6], z[''] + PushReceiver.class.getCanonicalName());
        C(paramContext);
      }
      while (true)
      {
        k = 1;
        break;
        if (!b(paramContext, z[71], true))
        {
          ac.d(z[6], z['']);
          e.m = false;
          break label270;
        }
        e.m = true;
        break label270;
        label414: if (c(paramContext, PushReceiver.class.getCanonicalName(), z['']))
          ac.d(z[6], z['']);
        if (!a(paramContext, z[79], true))
        {
          ac.e(z[6], z['']);
          k = 0;
          break;
        }
        if (!a(paramContext, AlarmReceiver.class))
        {
          ac.e(z[6], z[''] + AlarmReceiver.class.getCanonicalName());
          k = 0;
          break;
        }
        if (paramContext.getPackageManager().queryIntentActivities(new Intent(paramContext, PushActivity.class), 0).isEmpty());
        for (int i = 0; ; i = 1)
        {
          if (i != 0)
            break label616;
          ac.e(z[6], z[''] + PushActivity.class.getCanonicalName());
          k = 0;
          break;
        }
        label616: String str1 = z[112];
        PackageManager localPackageManager = paramContext.getPackageManager();
        Intent localIntent = new Intent(str1);
        localIntent.addCategory(paramContext.getPackageName());
        if (localPackageManager.queryIntentActivities(localIntent, 0).isEmpty());
        for (int j = 0; ; j = 1)
        {
          if (j != 0)
            break label699;
          ac.e(z[6], z['']);
          k = 0;
          break;
        }
        label699: String str2 = paramContext.getPackageName() + z[''];
        if (!m(paramContext, str2))
        {
          ac.e(z[6], z[''] + str2);
          k = 0;
          break;
        }
        e.add(str2);
        Iterator localIterator1 = e.iterator();
        while (true)
          if (localIterator1.hasNext())
          {
            String str5 = (String)localIterator1.next();
            if (!c(paramContext.getApplicationContext(), str5))
            {
              ac.e(z[6], z[''] + str5);
              k = 0;
              break;
            }
          }
        if (Build.VERSION.SDK_INT < 23)
        {
          if (!c(paramContext.getApplicationContext(), z[13]))
          {
            ac.e(z[6], z['']);
            k = 0;
            break;
          }
          if (!c(paramContext.getApplicationContext(), z[94]))
          {
            ac.e(z[6], z['']);
            k = 0;
            break;
          }
        }
        Iterator localIterator2 = f.iterator();
        while (localIterator2.hasNext())
        {
          String str4 = (String)localIterator2.next();
          if (!c(paramContext.getApplicationContext(), str4))
          {
            new StringBuilder(z['']).append(str4);
            ac.d();
          }
        }
        Iterator localIterator3 = g.iterator();
        while (localIterator3.hasNext())
        {
          String str3 = (String)localIterator3.next();
          if (!c(paramContext.getApplicationContext(), str3))
          {
            new StringBuilder(z['']).append(str3).append(z['']);
            ac.d();
          }
        }
      }
      label1092: if (!an.a(e.f))
      {
        a.h(e.f);
        m = 1;
      }
      else
      {
        ac.d(z[6], z['']);
        m = 0;
      }
    }
    label1135: return false;
  }

  private static String p(Context paramContext, String paramString)
  {
    if (c(paramContext, z[94]))
      try
      {
        String str = Settings.System.getString(paramContext.getContentResolver(), z[93]);
        paramString = str;
        return paramString;
      }
      catch (Exception localException)
      {
        ac.e();
      }
    return paramString;
  }

  public static void p(Context paramContext)
  {
    if ((h != null) && (!d(paramContext, PushReceiver.class.getCanonicalName())));
    try
    {
      paramContext.unregisterReceiver(h);
      return;
    }
    catch (Exception localException)
    {
      localException.getMessage();
      ac.e();
    }
  }

  public static String q(Context paramContext)
  {
    Object localObject = e.f;
    if (an.a((String)localObject))
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      try
      {
        ApplicationInfo localApplicationInfo = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 128);
        if ((localApplicationInfo != null) && (localApplicationInfo.metaData != null))
        {
          String str = localApplicationInfo.metaData.getString(z[44]);
          localObject = str;
        }
        return localObject;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return localObject;
  }

  private static String q(Context paramContext, String paramString)
  {
    if (c(paramContext, z[94]))
      try
      {
        boolean bool = Settings.System.putString(paramContext.getContentResolver(), z[93], paramString);
        if (bool)
          return paramString;
      }
      catch (Exception localException)
      {
        ac.e();
      }
    return null;
  }

  public static String r(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService(z[64])).getActiveNetworkInfo();
      if (localNetworkInfo == null)
        return z[18];
      if (localNetworkInfo.getType() == 1)
        return z['©'];
      if (localNetworkInfo.getType() == 0)
      {
        i = localNetworkInfo.getSubtype();
        if ((i != 4) && (i != 1) && (i != 2))
          break label114;
        return z['¬'];
        return z['­'];
        if (i == 13)
        {
          str = z['®'];
          return str;
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    while (true)
    {
      int i;
      String str;
      return "";
      label114: if ((i != 3) && (i != 8) && (i != 6) && (i != 5))
        if (i != 12);
    }
  }

  private static boolean r(Context paramContext, String paramString)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), paramString);
    try
    {
      ServiceInfo localServiceInfo = localPackageManager.getServiceInfo(localComponentName, 128);
      new StringBuilder(z[107]).append(localServiceInfo.processName);
      ac.a();
      boolean bool = localServiceInfo.processName.contains(paramContext.getPackageName() + ":");
      if (bool)
        return true;
    }
    catch (NullPointerException localNullPointerException)
    {
      new StringBuilder(z[106]).append(paramString);
      ac.a();
      return false;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label116;
    }
  }

  public static void s(Context paramContext)
  {
    if (a.G());
    String str1;
    String str2;
    String str3;
    String str4;
    int i;
    int j;
    do
    {
      return;
      str1 = j(paramContext, "");
      str2 = a.H();
      str3 = i(paramContext);
      if (an.a(str3))
        str3 = " ";
      str4 = g(paramContext, "");
      if (an.a(str4))
        str4 = " ";
      i = f(str2);
      j = f(str1);
      if ((i != 0) && (j != 0))
        break;
    }
    while (a.b(str3, str4));
    label159: 
    do
    {
      do
      {
        do
        {
          ac.b();
          a.z();
          q(paramContext, "");
          o(paramContext, "");
          return;
          if (((1 == i) && (2 == j)) || ((2 == i) && (1 == j)))
            break;
        }
        while (i != j);
        if (!str1.equals(str2))
          break label159;
      }
      while (!a.a(str1, str3));
      return;
    }
    while (!a.b(str3, str4));
  }

  public static List<ComponentName> t(Context paramContext)
  {
    ac.b();
    ArrayList localArrayList = new ArrayList();
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent();
    localIntent.setAction(z[71]);
    List localList = localPackageManager.queryIntentServices(localIntent, 0);
    if ((localList == null) || (localList.size() == 0))
      return null;
    for (int i = 0; i < localList.size(); i++)
    {
      ServiceInfo localServiceInfo = ((ResolveInfo)localList.get(i)).serviceInfo;
      String str1 = localServiceInfo.name;
      String str2 = localServiceInfo.packageName;
      if ((localServiceInfo.exported) && (localServiceInfo.enabled) && (!e.c.equals(str2)))
      {
        new StringBuilder(z[72]).append(str2).append("/").append(str1).append("}");
        ac.b();
        localArrayList.add(new ComponentName(str2, str1));
      }
    }
    return localArrayList;
  }

  public static boolean u(Context paramContext)
  {
    String str1 = s.a(paramContext, z[104]);
    new StringBuilder(z[101]).append(str1);
    ac.b();
    String str2 = s.a(paramContext, z[100]);
    if ((!TextUtils.isEmpty(str1)) && (z[102].equals(str1)) && (!TextUtils.isEmpty(str2)))
    {
      String str3 = s.a(paramContext, z[105]);
      if ((!TextUtils.isEmpty(str3)) && (str3.startsWith(z[103])))
      {
        ac.d();
        return false;
      }
    }
    return true;
  }

  public static double v(Context paramContext)
  {
    Point localPoint = new Point();
    Display localDisplay;
    DisplayMetrics localDisplayMetrics;
    double d1;
    if ((paramContext instanceof Activity))
    {
      localDisplay = ((Activity)paramContext).getWindowManager().getDefaultDisplay();
      if (Build.VERSION.SDK_INT >= 17)
      {
        localDisplay.getRealSize(localPoint);
        new StringBuilder(z['']).append(localPoint.x).append(z[127]).append(localPoint.y);
        ac.b();
      }
    }
    else
    {
      localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      new StringBuilder(z['']).append(localDisplayMetrics.xdpi).append(z['']).append(localDisplayMetrics.ydpi);
      ac.b();
      if (!(paramContext instanceof Activity))
        break label252;
      d1 = Math.pow(localPoint.x / localDisplayMetrics.xdpi, 2.0D);
    }
    for (double d2 = Math.pow(localPoint.y / localDisplayMetrics.ydpi, 2.0D); ; d2 = Math.pow(localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi, 2.0D))
    {
      double d3 = Math.sqrt(d2 + d1);
      new StringBuilder(z[124]).append(d3);
      ac.b();
      return d3;
      if (Build.VERSION.SDK_INT >= 13)
      {
        localDisplay.getSize(localPoint);
        break;
      }
      localPoint.x = localDisplay.getWidth();
      localPoint.y = localDisplay.getHeight();
      break;
      label252: new StringBuilder(z[125]).append(localDisplayMetrics.widthPixels).append(z[126]).append(localDisplayMetrics.heightPixels);
      ac.b();
      d1 = Math.pow(localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi, 2.0D);
    }
  }

  private static String w(Context paramContext)
  {
    if (!c(paramContext, z[75]));
    while (true)
    {
      return null;
      try
      {
        String str1 = g(paramContext, "");
        if ((str1 != null) && (!str1.equals("")))
        {
          new StringBuilder(z[74]).append(str1);
          ac.c();
          String str2 = a(str1 + Build.MODEL);
          return str2;
        }
      }
      catch (Exception localException)
      {
        ac.i();
      }
    }
    return null;
  }

  private static String x(Context paramContext)
  {
    try
    {
      String str2 = j(paramContext, "");
      if (d(str2))
        return str2;
      str1 = i(paramContext);
      if ((an.a(str1)) || (!d(str1)) || (z[23].equals(str1.toLowerCase(Locale.getDefault()))))
      {
        str1 = w(paramContext);
        if ((an.a(str1)) || (!d(str1)))
        {
          str1 = y(paramContext);
          if (str1 == null)
            return " ";
        }
      }
    }
    catch (Exception localException)
    {
      ac.i();
      str1 = y(paramContext);
    }
    String str1;
    return str1;
  }

  private static String y(Context paramContext)
  {
    ac.b();
    String str = paramContext.getSharedPreferences(z[''], 0).getString(z[''], null);
    if (!an.a(str));
    do
    {
      return str;
      if (!a())
        return A(paramContext);
      str = a.h(paramContext);
    }
    while (str != null);
    if ((Build.VERSION.SDK_INT >= 23) && ((!c(paramContext, z[13])) || (!c(paramContext, z[14]))))
      return A(paramContext);
    return z(paramContext);
  }

  // ERROR //
  private static String z(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 1180	cn/jpush/android/util/b:e	()Ljava/lang/String;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnonnull +99 -> 106
    //   10: aconst_null
    //   11: astore_3
    //   12: aload_3
    //   13: invokestatic 660	cn/jpush/android/util/an:a	(Ljava/lang/String;)Z
    //   16: ifne +297 -> 313
    //   19: new 1053	java/io/File
    //   22: dup
    //   23: aload_3
    //   24: invokespecial 1054	java/io/File:<init>	(Ljava/lang/String;)V
    //   27: astore 4
    //   29: aload 4
    //   31: ifnull +109 -> 140
    //   34: aload 4
    //   36: invokevirtual 1057	java/io/File:exists	()Z
    //   39: ifeq +101 -> 140
    //   42: new 1232	java/io/FileInputStream
    //   45: dup
    //   46: aload 4
    //   48: invokespecial 1233	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   51: invokestatic 1238	cn/jpush/android/util/r:a	(Ljava/io/InputStream;)Ljava/util/ArrayList;
    //   54: astore 16
    //   56: aload 16
    //   58: invokevirtual 1239	java/util/ArrayList:size	()I
    //   61: ifle +79 -> 140
    //   64: aload 16
    //   66: iconst_0
    //   67: invokevirtual 1240	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   70: checkcast 26	java/lang/String
    //   73: astore 5
    //   75: aload_0
    //   76: aload 5
    //   78: invokestatic 1655	cn/jpush/android/a:c	(Landroid/content/Context;Ljava/lang/String;)V
    //   81: new 612	java/lang/StringBuilder
    //   84: dup
    //   85: getstatic 392	cn/jpush/android/util/b:z	[Ljava/lang/String;
    //   88: bipush 42
    //   90: aaload
    //   91: invokespecial 676	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: aload 5
    //   96: invokevirtual 622	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: invokestatic 542	cn/jpush/android/util/ac:c	()V
    //   103: aload 5
    //   105: areturn
    //   106: new 612	java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial 613	java/lang/StringBuilder:<init>	()V
    //   113: aload_2
    //   114: invokevirtual 622	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: getstatic 392	cn/jpush/android/util/b:z	[Ljava/lang/String;
    //   120: bipush 43
    //   122: aaload
    //   123: invokevirtual 622	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: invokevirtual 623	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore_3
    //   130: goto -118 -> 12
    //   133: astore 15
    //   135: aload 15
    //   137: invokevirtual 908	java/lang/Exception:printStackTrace	()V
    //   140: new 612	java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial 613	java/lang/StringBuilder:<init>	()V
    //   147: invokestatic 897	java/lang/System:currentTimeMillis	()J
    //   150: invokevirtual 900	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   153: invokevirtual 623	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokevirtual 1199	java/lang/String:getBytes	()[B
    //   159: invokestatic 1659	java/util/UUID:nameUUIDFromBytes	([B)Ljava/util/UUID;
    //   162: invokevirtual 469	java/util/UUID:toString	()Ljava/lang/String;
    //   165: invokestatic 1661	cn/jpush/android/util/an:b	(Ljava/lang/String;)Ljava/lang/String;
    //   168: astore 5
    //   170: aload_0
    //   171: aload 5
    //   173: invokestatic 1655	cn/jpush/android/a:c	(Landroid/content/Context;Ljava/lang/String;)V
    //   176: aload 4
    //   178: ifnull +56 -> 234
    //   181: aload 4
    //   183: invokevirtual 1193	java/io/File:createNewFile	()Z
    //   186: pop
    //   187: new 1195	java/io/FileOutputStream
    //   190: dup
    //   191: aload 4
    //   193: invokespecial 1196	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   196: astore 8
    //   198: aload 8
    //   200: aload 5
    //   202: invokevirtual 1199	java/lang/String:getBytes	()[B
    //   205: invokevirtual 1203	java/io/FileOutputStream:write	([B)V
    //   208: aload 8
    //   210: invokevirtual 1206	java/io/FileOutputStream:flush	()V
    //   213: invokestatic 542	cn/jpush/android/util/ac:c	()V
    //   216: aload 8
    //   218: ifnull -115 -> 103
    //   221: aload 8
    //   223: invokevirtual 1207	java/io/FileOutputStream:close	()V
    //   226: aload 5
    //   228: areturn
    //   229: astore 13
    //   231: aload 5
    //   233: areturn
    //   234: invokestatic 673	cn/jpush/android/util/ac:e	()V
    //   237: aload 5
    //   239: areturn
    //   240: astore 6
    //   242: invokestatic 1187	cn/jpush/android/util/ac:i	()V
    //   245: aload 5
    //   247: areturn
    //   248: astore 14
    //   250: invokestatic 1187	cn/jpush/android/util/ac:i	()V
    //   253: aload_1
    //   254: ifnull -151 -> 103
    //   257: aload_1
    //   258: invokevirtual 1207	java/io/FileOutputStream:close	()V
    //   261: aload 5
    //   263: areturn
    //   264: astore 12
    //   266: aload 5
    //   268: areturn
    //   269: astore 10
    //   271: aconst_null
    //   272: astore 8
    //   274: aload 8
    //   276: ifnull +8 -> 284
    //   279: aload 8
    //   281: invokevirtual 1207	java/io/FileOutputStream:close	()V
    //   284: aload 10
    //   286: athrow
    //   287: astore 11
    //   289: goto -5 -> 284
    //   292: astore 10
    //   294: goto -20 -> 274
    //   297: astore 10
    //   299: aload_1
    //   300: astore 8
    //   302: goto -28 -> 274
    //   305: astore 9
    //   307: aload 8
    //   309: astore_1
    //   310: goto -60 -> 250
    //   313: aconst_null
    //   314: astore 4
    //   316: goto -287 -> 29
    //
    // Exception table:
    //   from	to	target	type
    //   34	103	133	java/lang/Exception
    //   221	226	229	java/io/IOException
    //   181	187	240	java/io/IOException
    //   234	237	240	java/io/IOException
    //   187	198	248	java/io/IOException
    //   257	261	264	java/io/IOException
    //   187	198	269	finally
    //   279	284	287	java/io/IOException
    //   198	216	292	finally
    //   250	253	297	finally
    //   198	216	305	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */