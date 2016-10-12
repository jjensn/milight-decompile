package cn.jpush.android.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import cn.jpush.android.data.JPushLocalNotification;
import cn.jpush.android.e;
import cn.jpush.android.helpers.ConnectingHelper;
import cn.jpush.android.helpers.d;
import cn.jpush.android.helpers.i;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ah;
import cn.jpush.android.util.an;
import cn.jpush.b.a.b.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public class PushService extends Service
{
  public static long a;
  public static String b = new String((char[])localObject4).intern();
  public static boolean c = false;
  public static boolean d = false;
  private static final String[] z;
  private boolean e = true;
  private n f;
  private ExecutorService g;
  private k h;
  private m i;
  private boolean j = false;
  private int k = 0;
  private int l = 0;
  private long m = 0L;
  private cn.jpush.android.c n = null;

  static
  {
    Object localObject1 = new String[76];
    int i1 = 0;
    String str1 = "QE&/(dB#.\030d";
    int i2 = -1;
    Object localObject2 = localObject1;
    int i14;
    label133: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int i3 = localObject3.length;
      int i4 = 0;
      if (i3 <= 1);
      while (i3 > i4)
      {
        Object localObject7 = localObject3;
        int i11 = i4;
        int i12 = i3;
        Object localObject8 = localObject3;
        while (true)
        {
          int i13 = localObject8[i4];
          switch (i11 % 5)
          {
          default:
            i14 = 123;
            localObject8[i4] = (char)(i14 ^ i13);
            i4 = i11 + 1;
            if (i12 != 0)
              break label133;
            localObject8 = localObject7;
            i11 = i4;
            i4 = i12;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        i3 = i12;
        localObject3 = localObject7;
      }
      str2 = new String((char[])localObject3).intern();
      switch (i2)
      {
      default:
        localObject1[i1] = str2;
        i1 = 1;
        str1 = "n^\031(\034h^\023&\022mU1gV!S:)\025dS!.\024o\n";
        localObject1 = localObject2;
        i2 = 0;
        break;
      case 0:
        localObject1[i1] = str2;
        i1 = 2;
        str1 = "-\020'\"\bqs:#\036;";
        i2 = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i1] = str2;
        i1 = 3;
        str1 = "@S!.\024o\020xg\024ox0&\tuR0&\017RE6$\036dTuj[b_;)\036bD<(\025;";
        i2 = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i1] = str2;
        i1 = 4;
        str1 = "iU45\017cU43[,\020?2\022e\n";
        i2 = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i1] = str2;
        i1 = 5;
        str1 = "RU;#[iU45\017!R0&\017";
        i2 = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i1] = str2;
        i1 = 6;
        str1 = "-\0203+\032f\n";
        i2 = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i1] = str2;
        i1 = 7;
        str1 = "@S!.\024o\020xg\024ot<4\030n^;\"\030uU1gV!S:)\025dS!.\024o\n";
        i2 = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i1] = str2;
        i1 = 8;
        str1 = "";
        i2 = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i1] = str2;
        i1 = 9;
        str1 = "@S!.\024o\020xg\tdC!&\tu~03\fnB>.\025fs9.\036oDyg\013hTo";
        i2 = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i1] = str2;
        i1 = 10;
        str1 = "@S!.\024o\020xg\024ox0&\tuR0&\017UY8\"\024tDuj[uY8\"\024tD\001.\026dCo";
        i2 = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i1] = str2;
        i1 = 11;
        str1 = "@\\'\"\032eIu+\024fW0#[h^{g<hF0g\016q\020!([sU!5\002/";
        i2 = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i1] = str2;
        i1 = 12;
        str1 = "HCu$\024o^0$\017h^2g\025nG{g<hF0g\016q\020!([sU!5\002/";
        i2 = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i1] = str2;
        i1 = 13;
        str1 = "<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF<\rhzF";
        i2 = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i1] = str2;
        i1 = 14;
        str1 = "n^\021\"\buB:>[,\020%5\024bU&42e\n";
        i2 = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i1] = str2;
        i1 = 15;
        str1 = "RU'1\022bUu%\016oT9\"[,\020";
        i2 = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i1] = str2;
        i1 = 16;
        str1 = "eU65\036`C0\t\024uY3.\030`D<(\025;";
        i2 = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i1] = str2;
        i1 = 17;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i8N~\033\0028Uy\003\016/Xo\026\017:Ow\020";
        i2 = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i1] = str2;
        i1 = 18;
        str1 = "`@%";
        i2 = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i1] = str2;
        i1 = 19;
        str1 = "h]\n5\036pE04\017^Z&(\025";
        i2 = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i1] = str2;
        i1 = 20;
        str1 = "m_6&\027^^:3\022gY6&\017h_;";
        i2 = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i1] = str2;
        i1 = 21;
        str1 = "";
        i2 = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i1] = str2;
        i1 = 22;
        str1 = "d^4%\027do%2\bio!.\026d";
        i2 = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i1] = str2;
        i1 = 23;
        str1 = "-\0206(\025oU63\022n^o";
        i2 = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i1] = str2;
        i1 = 24;
        str1 = "bX4)\034do%&\030jQ2\"\025`]0";
        i2 = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i1] = str2;
        i1 = 25;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i(U\005\027.Rx";
        i2 = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i1] = str2;
        i1 = 26;
        str1 = "m_6&\027^^:3\022gY6&\017h_;\030\022e";
        i2 = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i1] = str2;
        i1 = 27;
        str1 = "rD:7$uX'\"\032e";
        i2 = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i1] = str2;
        i1 = 28;
        str1 = "sD6";
        i2 = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i1] = str2;
        i1 = 29;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i:My\024\024$Uq\022\024";
        i2 = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i1] = str2;
        i1 = 30;
        str1 = "-\020%,\034;";
        i2 = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i1] = str2;
        i1 = 31;
        str1 = "uQ24";
        i2 = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i1] = str2;
        i1 = 32;
        str1 = "";
        i2 = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i1] = str2;
        i1 = 33;
        str1 = "n^\0063\032sD\026(\026lQ;#[,\020<)\017d^!}";
        i2 = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i1] = str2;
        i1 = 34;
        str1 = "T^=&\025e\\0#[rU'1\022bUu&\030uY:)[,\020";
        i2 = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i1] = str2;
        i1 = 35;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i)Us";
        i2 = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i1] = str2;
        i1 = 36;
        str1 = "o_!.\035hS43\022n^\n%\016hT9\"\t^Y1";
        i2 = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i1] = str2;
        i1 = 37;
        str1 = "IQ;#\027d\0204$\017h_;g\035nBu*\016mD<g\017x@0gA!";
        i2 = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i1] = str2;
        i1 = 38;
        str1 = "sD6\030\037d\\4>";
        i2 = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i1] = str2;
        i1 = 39;
        str1 = "qE&/$rD:7\013dT";
        i2 = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i1] = str2;
        i1 = 40;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i6T|\001\016$Qb\032\004>Rc";
        i2 = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i1] = str2;
        i1 = 41;
        str1 = "`\\<&\b";
        i2 = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i1] = str2;
        i1 = 42;
        str1 = "uQ2&\027hQ&g\036yS07\017h_;}";
        i2 = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i1] = str2;
        i1 = 43;
        str1 = "tC05$fB:2\025e";
        i2 = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i1] = str2;
        i1 = 44;
        str1 = "T^0?\013dS!\"\037!\035u\r+tC=g\022oY!g\035`Y9\"\037-\020&3\024q\020&\"\twY6\"[r_:)";
        i2 = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i1] = str2;
        i1 = 45;
        str1 = "o_!.\035hS43\022n^\n*\032y^ *";
        i2 = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[i1] = str2;
        i1 = 46;
        str1 = "@S!.\024o\020xg\023`^1+\036RU'1\022bU\024$\017h_;gV!Q63\022n^o";
        i2 = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[i1] = str2;
        i1 = 47;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i)D`\032\025/";
        i2 = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i1] = str2;
        i1 = 48;
        str1 = "sU%(\tu";
        i2 = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i1] = str2;
        i1 = 49;
        str1 = "b^{-\013tC=i\022l\0364)\037s_<#U`S!.\024o\036\034\n$Su\004\022>Rd";
        i2 = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i1] = str2;
        i1 = 50;
        str1 = "rU$\030\022e";
        i2 = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[i1] = str2;
        i1 = 51;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i)Dw\034\024/Db";
        i2 = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[i1] = str2;
        i1 = 52;
        str1 = "lE93\022^D,7\036";
        i2 = 51;
        localObject1 = localObject2;
        break;
      case 51:
        localObject1[i1] = str2;
        i1 = 53;
        str1 = "rY9\"\025bU\n7\016rX\n3\022lU";
        i2 = 52;
        localObject1 = localObject2;
        break;
      case 52:
        localObject1[i1] = str2;
        i1 = 54;
        str1 = "h]\n$\026e";
        i2 = 53;
        localObject1 = localObject2;
        break;
      case 53:
        localObject1[i1] = str2;
        i1 = 55;
        str1 = "o_!.\035hS43\022n^\n%\016hT9\"\t";
        i2 = 54;
        localObject1 = localObject2;
        break;
      case 54:
        localObject1[i1] = str2;
        i1 = 56;
        str1 = "T^0?\013dS!\"\037!\035u.\027mU2&\027!y\030g\tdA \"\bu\036";
        i2 = 55;
        localObject1 = localObject2;
        break;
      case 55:
        localObject1[i1] = str2;
        i1 = 57;
        str1 = "b^{-\013tC=i\032oT'(\022e\036<)\017d^!i2Oy\001";
        i2 = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[i1] = str2;
        i1 = 58;
        str1 = "n^\0063\032sD\026(\026lQ;#[,\020;(\017!F4+\022e\020\037\027\016rXu5\016o^<)\034!\035u\024\023nE9#[o_!g\031d\020=\"\td\036";
        i2 = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[i1] = str2;
        i1 = 59;
        str1 = "o_!.\035hS43\022n^\n.\037";
        i2 = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[i1] = str2;
        i1 = 60;
        str1 = "b_;)\036bD<(\025,C!&\017d";
        i2 = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[i1] = str2;
        i1 = 61;
        str1 = "n^\021.\bb_;)\036bD0#[`^1g\tdD'>[sU&3\032sDu$\024o^uj[eU9&\002;";
        i2 = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[i1] = str2;
        i1 = 62;
        str1 = "@S!.\024o\020xg\tdD'>8n^;\"\030u\020xg\037hC6(\025oU63\036ed<*\036r\n";
        i2 = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[i1] = str2;
        i1 = 63;
        str1 = "`\\45\026";
        i2 = 62;
        localObject1 = localObject2;
        break;
      case 62:
        localObject1[i1] = str2;
        i1 = 64;
        str1 = "VUu!\024t^1g\017iUu&\013q{0>[hCu$\023`^2\"\037/\020\002.\027m\020'\"VsU2.\buU'i";
        i2 = 63;
        localObject1 = localObject2;
        break;
      case 63:
        localObject1[i1] = str2;
        i1 = 65;
        str1 = "RU'1\022bU\035\"\027qU'";
        i2 = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[i1] = str2;
        i1 = 66;
        str1 = "@S!.\024o\nu.\025hDu\027\016rX\006\"\twY6\"";
        i2 = 65;
        localObject1 = localObject2;
        break;
      case 65:
        localObject1[i1] = str2;
        i1 = 67;
        str1 = "RU'1\022bUu*\032h^u3\023sU4#[,\020!/\tdQ1\016\037;";
        i2 = 66;
        localObject1 = localObject2;
        break;
      case 66:
        localObject1[i1] = str2;
        i1 = 68;
        str1 = "oE9+";
        i2 = 67;
        localObject1 = localObject2;
        break;
      case 67:
        localObject1[i1] = str2;
        i1 = 69;
        str1 = "K` 4\023!B )\025h^2g\030iU6,\036e\0203&\022mU1f";
        i2 = 68;
        localObject1 = localObject2;
        break;
      case 68:
        localObject1[i1] = str2;
        i1 = 70;
        str1 = "@S!.\024o\020xg\024o|: \034dT\034)[,\0206(\025oU63\022n^o";
        i2 = 69;
        localObject1 = localObject2;
        break;
      case 69:
        localObject1[i1] = str2;
        i1 = 71;
        str1 = "HCu$\024o^0$\017h^2g\025nG{g<hF0g\016q\020!([sU&3\032sD{";
        i2 = 70;
        localObject1 = localObject2;
        break;
      case 70:
        localObject1[i1] = str2;
        i1 = 72;
        str1 = "@\\'\"\032eIu+\024fW0#[h^{g<hF0g\016q\020!([sU&3\032sD{";
        i2 = 71;
        localObject1 = localObject2;
        break;
      case 71:
        localObject1[i1] = str2;
        i1 = 73;
        str1 = "@S!.\024o\020xg\tdC!&\tud=\"\025IU45\017cU43";
        i2 = 72;
        localObject1 = localObject2;
        break;
      case 72:
        localObject1[i1] = str2;
        i1 = 74;
        str1 = "@S!.\024o\nu/\032oT9\"(u_%\027\016rXuj[`@%\f\036x\n";
        i2 = 73;
        localObject1 = localObject2;
        break;
      case 73:
        localObject1[i1] = str2;
        i1 = 75;
        str1 = "iQ;#\027dc!(\013QE&/[`@%k[rU;#\036s\02005\tnBog^r\020p4";
        i2 = 74;
        localObject1 = localObject2;
      case 74:
      }
    }
    localObject1[i1] = str2;
    z = localObject2;
    Object localObject4 = "`\\9".toCharArray();
    int i5 = localObject4.length;
    int i6 = 0;
    if (i5 <= 1);
    label2012: label2147: 
    while (i5 > i6)
    {
      Object localObject5 = localObject4;
      int i7 = i6;
      int i8 = i5;
      Object localObject6 = localObject4;
      int i9 = localObject6[i6];
      int i10;
      switch (i7 % 5)
      {
      default:
        i10 = 123;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        localObject6[i6] = (char)(i10 ^ i9);
        i6 = i7 + 1;
        if (i8 != 0)
          break label2147;
        localObject6 = localObject5;
        i7 = i6;
        i6 = i8;
        break label2012;
        i14 = 1;
        break;
        i14 = 48;
        break;
        i14 = 85;
        break;
        i14 = 71;
        break;
        i10 = 1;
        continue;
        i10 = 48;
        continue;
        i10 = 85;
        continue;
        i10 = 71;
      }
      i5 = i8;
      localObject4 = localObject5;
    }
  }

  public PushService()
  {
  }

  private void a()
  {
    ac.a(z[0], z[73]);
    if (e())
    {
      ac.b(z[0], z[71]);
      return;
    }
    if ((this.j) && (!d()))
    {
      ac.b(z[0], z[72]);
      return;
    }
    this.i.removeMessages(1011);
    this.i.removeMessages(1005);
    b();
  }

  private void a(long paramLong)
  {
    ac.b();
    new Thread(new l(this, paramLong)).start();
  }

  private void a(String paramString1, String paramString2)
  {
    try
    {
      new StringBuilder(z[74]).append(paramString2);
      ac.b();
      if ((an.a(paramString1)) || (an.a(paramString2)))
      {
        String.format(z[75], new Object[] { paramString1, paramString2 });
        ac.e();
        if (this.i.hasMessages(1005))
        {
          ac.a();
          this.i.removeMessages(1005);
        }
        ConnectingHelper.sendConnectionChanged(getApplicationContext(), a.b);
        if (this.h == null)
          ac.d();
        while (true)
        {
          if (this.f != null)
            this.f.b();
          stopSelf();
          return;
          this.h.a();
        }
      }
      if (this.i.hasMessages(1005))
      {
        ac.a();
        this.i.removeMessages(1005);
      }
      ConnectingHelper.sendConnectionChanged(getApplicationContext(), a.b);
      if (this.h == null)
        ac.d();
      while (true)
      {
        if (this.f != null)
          this.f.b();
        stopSelf();
        return;
        this.h.a();
      }
    }
    catch (Exception localException)
    {
      if (this.i.hasMessages(1005))
      {
        ac.a();
        this.i.removeMessages(1005);
      }
      ConnectingHelper.sendConnectionChanged(getApplicationContext(), a.b);
      if (this.h == null)
        ac.d();
      while (true)
      {
        if (this.f != null)
          this.f.b();
        stopSelf();
        return;
        this.h.a();
      }
    }
    finally
    {
      if (this.i.hasMessages(1005))
      {
        ac.a();
        this.i.removeMessages(1005);
      }
      ConnectingHelper.sendConnectionChanged(getApplicationContext(), a.b);
      if (this.h != null)
        break label354;
    }
    ac.d();
    while (true)
    {
      if (this.f != null)
        this.f.b();
      stopSelf();
      throw localObject;
      label354: this.h.a();
    }
  }

  private static void a(ExecutorService paramExecutorService)
  {
    ac.a();
    if (paramExecutorService == null)
      return;
    paramExecutorService.shutdown();
    try
    {
      if (!paramExecutorService.awaitTermination(100L, TimeUnit.MILLISECONDS))
      {
        paramExecutorService.shutdownNow();
        if (!paramExecutorService.awaitTermination(100L, TimeUnit.MILLISECONDS))
          ac.a();
      }
      ac.a();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        paramExecutorService.shutdownNow();
        ac.a();
        Thread.currentThread().interrupt();
      }
    }
  }

  private void b()
  {
    try
    {
      ac.b(z[0], z[9] + Process.myPid());
      if (!cn.jpush.android.util.b.b(getApplicationContext()))
        ac.c(z[0], z[8]);
      while (true)
      {
        return;
        if ((this.g != null) && (!this.g.isShutdown()))
        {
          ac.b();
          a(this.g);
        }
        this.g = Executors.newSingleThreadExecutor();
        this.h = new k(getApplicationContext(), this.i, false);
        this.g.execute(this.h);
      }
    }
    finally
    {
    }
  }

  private void c()
  {
    ac.b(z[0], z[62] + this.k);
    int i1 = cn.jpush.android.util.b.f(getApplicationContext());
    int i2 = (int)(1000.0D * (3.0D * Math.pow(2.0D, this.k)));
    int i3 = cn.jpush.android.a.q();
    if (i2 > i3 * 1000 / 2)
      i2 = i3 * 1000 / 2;
    if ((this.k < 5) || (i1 == 1))
    {
      if (!this.i.hasMessages(1011))
      {
        ac.b(z[0], z[61] + i2);
        this.i.sendEmptyMessageDelayed(1011, i2);
        return;
      }
      ac.b();
      return;
    }
    ac.b();
  }

  private boolean d()
  {
    return this.l > 1;
  }

  private boolean e()
  {
    return (k.a.get() != 0L) && (!this.j);
  }

  public IBinder onBind(Intent paramIntent)
  {
    ac.b();
    return this.n;
  }

  public void onCreate()
  {
    ac.c();
    new StringBuilder(z[67]).append(Thread.currentThread().getId());
    ac.a();
    e.l = true;
    this.n = new d(this);
    a = Thread.currentThread().getId();
    ServiceInterface.b(getApplicationContext(), true);
    super.onCreate();
    this.i = new m(this);
    ac.b(z[0], z[66]);
    if (e.a(getApplicationContext()))
    {
      this.e = cn.jpush.android.util.b.o(getApplicationContext());
      if (!this.e)
        ac.d(z[0], z[69]);
    }
    else
    {
      ac.a();
      long l1 = 1000L * cn.jpush.android.a.q();
      long l2 = l1 + System.currentTimeMillis();
      PendingIntent localPendingIntent = PendingIntent.getBroadcast(this, 0, new Intent(this, AlarmReceiver.class), 0);
      ((AlarmManager)getSystemService(z[63])).setInexactRepeating(0, l2, l1, localPendingIntent);
      if (e.m)
        a(0L);
      return;
    }
    this.f = new n(getApplicationContext(), this.i);
    Context localContext = getApplicationContext();
    String str = cn.jpush.android.a.C();
    if ((an.a(str)) || (z[68].equals(str)));
    while (true)
    {
      cn.jpush.android.util.b.s(getApplicationContext());
      break;
      if (!e.f.equalsIgnoreCase(str))
      {
        ac.b(z[65], z[64]);
        cn.jpush.android.a.z();
        ah.a(localContext);
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    new StringBuilder(z[14]).append(Process.myPid());
    ac.b();
    e.l = false;
    if (this.i != null)
      this.i.removeCallbacksAndMessages(null);
    cn.jpush.android.util.b.p(getApplicationContext());
    n localn;
    if (this.f != null)
    {
      localn = this.f;
      if (Build.VERSION.SDK_INT < 18)
        break label130;
      localn.quitSafely();
    }
    while (true)
    {
      if ((this.h != null) && (k.a.get() != 0L))
        this.h.a();
      if ((this.g != null) && (!this.g.isShutdown()))
        a(this.g);
      return;
      label130: localn.quit();
    }
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    ac.b(z[0], z[33] + paramIntent + z[30] + e.c + z[23] + k.a.get());
    if (!this.e)
    {
      ac.b(z[0], z[58]);
      this.i.sendEmptyMessageDelayed(1003, 100L);
    }
    String str1;
    Bundle localBundle;
    label373: int i3;
    do
    {
      do
      {
        do
        {
          String str6;
          String str7;
          long l2;
          do
          {
            do
            {
              do
              {
                return 1;
                str1 = null;
                localBundle = null;
                if (paramIntent != null)
                {
                  str1 = paramIntent.getAction();
                  localBundle = paramIntent.getExtras();
                }
                if (localBundle != null)
                {
                  new StringBuilder(z[15]).append(localBundle.toString());
                  ac.a();
                }
              }
              while ((str1 == null) || (localBundle == null));
              ac.b(z[0], z[46] + str1);
              if (z[49].equals(str1))
              {
                String str10 = localBundle.getString(z[19]);
                int i8 = localBundle.getInt(z[54]);
                if ((str10 == null) || (i8 == 0))
                {
                  ac.e(z[0], z[56]);
                  return 1;
                }
                cn.jpush.b.a.a.c localc = q.a(str10, i8).a(e.f);
                int i9 = 60000;
                if ((i8 == 3) || (i8 == 4))
                  i9 = 300000;
                if (i8 == 1)
                {
                  if (!ServiceInterface.d(getApplicationContext()))
                    break label373;
                  cn.jpush.android.a.a(getApplicationContext(), true);
                  cn.jpush.android.a.b(getApplicationContext(), 0);
                  ServiceInterface.b(getApplicationContext(), true);
                  b();
                }
                while (this.f == null)
                {
                  ac.e(z[0], z[44]);
                  this.i.sendEmptyMessageDelayed(1003, 100L);
                  return 1;
                  cn.jpush.android.a.a(getApplicationContext(), false);
                }
                this.f.a(localc, i9);
                return 1;
              }
              if (z[35].equals(str1))
              {
                cn.jpush.android.util.b.k(this);
                if (k.a.get() == 0L)
                  a();
                while (true)
                {
                  cn.jpush.android.util.b.b();
                  return 1;
                  int i7 = localBundle.getInt(z[38], 0);
                  if (!an.a(localBundle.getString(z[28])))
                  {
                    if (i7 == 0)
                    {
                      this.i.removeMessages(1005);
                      if (!this.i.hasMessages(1004))
                        this.i.sendEmptyMessage(1005);
                    }
                    else
                    {
                      this.i.removeMessages(1005);
                      this.i.removeMessages(1004);
                      this.i.sendEmptyMessageDelayed(1004, i7);
                    }
                  }
                  else
                    this.i.sendEmptyMessage(1005);
                }
              }
              if (z[17].equals(str1))
              {
                cn.jpush.android.util.b.k(this);
                String str9 = localBundle.getString(z[60]);
                if (!an.a(str9))
                  if (str9.equals(a.a.name()))
                  {
                    ac.b();
                    if (k.a.get() == 0L)
                      a();
                  }
                while (true)
                {
                  cn.jpush.android.util.b.b();
                  return 1;
                  this.i.sendEmptyMessage(1006);
                  continue;
                  str9.equals(a.b.name());
                  ac.b();
                }
              }
              if (z[57].equals(str1))
              {
                cn.jpush.android.a.b(getApplicationContext(), 0);
                if (k.a.get() == 0L)
                {
                  b();
                  return 1;
                }
                ac.b();
                return 1;
              }
              if (z[25].equals(str1))
              {
                cn.jpush.android.a.b(getApplicationContext(), 1);
                a(localBundle.getString(z[18]), e.f);
                return 1;
              }
              if (z[47].equals(str1))
              {
                localBundle.getString(z[48]);
                return 1;
              }
              if (!z[32].equals(str1))
                break;
            }
            while (localBundle.getInt(z[43], -1) == -1);
            ac.b();
            return 1;
            if (!z[29].equals(str1))
              break;
            if (k.a.get() == 0L)
              b();
            str6 = localBundle.getString(z[41]);
            str7 = localBundle.getString(z[31]);
            l2 = localBundle.getLong(z[50], 0L);
          }
          while ((str6 == null) && (str7 == null));
          JSONObject localJSONObject = new JSONObject();
          if (str6 != null);
          try
          {
            localJSONObject.put(z[41], str6);
            if (str7 != null)
              localJSONObject.put(z[31], str7);
            String str8 = localJSONObject.toString();
            cn.jpush.b.a.a.m localm = new cn.jpush.b.a.a.m(l2, e.f, str8);
            this.f.a(localm, 20000);
            return 1;
          }
          catch (JSONException localJSONException)
          {
            new StringBuilder(z[42]).append(localJSONException.getMessage());
            ac.d();
            return 1;
          }
          if (z[21].equals(str1))
          {
            cn.jpush.android.a.b(getApplicationContext(), 0);
            if (k.a.get() == 0L)
            {
              b();
              return 1;
            }
            ac.b();
            return 1;
          }
        }
        while ((z[27].equals(str1)) || (z[51].equals(str1)));
        if (!z[40].equals(str1))
          break;
        int i1 = localBundle.getInt(z[52]);
        new StringBuilder(z[37]).append(i1);
        ac.a();
        switch (i1)
        {
        default:
          return 1;
        case 1:
          String str4 = localBundle.getString(z[36]);
          String str5 = localBundle.getString(z[55]);
          cn.jpush.android.a.a(getApplicationContext(), str4, str5);
          return 1;
        case 2:
          int i4 = localBundle.getInt(z[45]);
          int i5 = cn.jpush.android.helpers.b.b();
          if (i4 < i5)
          {
            int i6 = i5 - i4;
            new StringBuilder(z[16]).append(i6);
            ac.a();
            cn.jpush.android.api.m.a(getApplicationContext(), i6);
          }
          cn.jpush.android.a.a(getApplicationContext(), i4);
          return 1;
        case 3:
          String str3 = localBundle.getString(z[22]);
          cn.jpush.android.a.b(getApplicationContext(), str3);
          return 1;
        case 4:
          String str2 = localBundle.getString(z[53]);
          cn.jpush.android.a.a(getApplicationContext(), str2);
          return 1;
        case 5:
          boolean bool = localBundle.getBoolean(z[39]);
          cn.jpush.android.a.a(getApplicationContext(), bool);
          return 1;
        case 6:
          JPushLocalNotification localJPushLocalNotification = (JPushLocalNotification)localBundle.getSerializable(z[20]);
          h.a(getApplicationContext()).a(getApplicationContext(), localJPushLocalNotification);
          return 1;
        case 7:
          long l1 = localBundle.getLong(z[26]);
          h.a(getApplicationContext()).a(getApplicationContext(), l1);
          return 1;
        case 8:
          h.a(getApplicationContext()).b(getApplicationContext());
          return 1;
        case 10:
          cn.jpush.android.api.m.a(getApplicationContext());
          return 1;
        case 9:
          int i2 = localBundle.getInt(z[59]);
          if (!cn.jpush.android.helpers.b.b(i2))
            cn.jpush.android.helpers.b.a(i2);
        case 11:
        }
      }
      while (cn.jpush.android.helpers.b.b() <= cn.jpush.android.a.b(getApplicationContext()));
      i3 = cn.jpush.android.helpers.b.a();
    }
    while (i3 == 0);
    cn.jpush.android.api.m.b(getApplicationContext(), i3);
    return 1;
    i.a(getApplicationContext(), localBundle.getString(z[24]));
    return 1;
    new StringBuilder(z[34]).append(str1);
    ac.d();
    return 1;
  }

  public boolean onUnbind(Intent paramIntent)
  {
    ac.e();
    return super.onUnbind(paramIntent);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.PushService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */