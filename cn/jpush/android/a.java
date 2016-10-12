package cn.jpush.android;

import android.content.Context;
import android.content.SharedPreferences;
import cn.jpush.android.helpers.c;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.af;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import cn.jpush.android.util.i;
import java.util.Random;

public final class a extends i
{
  private static final String[] z;

  static
  {
    Object localObject1 = new String[81];
    int i = 0;
    String str1 = "\t\tV\004D\b3P\fT\036\033O\037C";
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
        i3 = 39;
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
        str1 = "\007\034U\036O2\036E\nN\036\030E\037x\016\003D\b";
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
        str1 = "\036\bK2Q\b\036S\004H\003";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "_\016\031]C\b\\F\\AUTE\fAYU\025T\024\013]DU\025Z\016\021TD[_";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\003\031M\017B\0373A\035W\036\tC\037B\031";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\016\003N\003B\016\030I\003@2\037T\fS\b";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\001\rS\031x\037\tP\002U\0313L\002D\f\030I\002I";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\005\tA\037S\017\tA\031x\004\002T\bU\033\rL";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\003\016\030W\001\003A\t";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\001\rS\031x\036\005S2U\b\035U\bT\0313T\004J\b";
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
        str1 = "\t\tV\004D\b3M\fN\0033A\003C\037\003I\tx\004\b";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "\003\031M\017B\0373N\030J";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\004\001\001H\n\005N2D\002\031N\031";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "\t\tV\016N\b3I\tx\n\tN\bU\f\030E\t";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "\035\031S\005x\030\bI\t";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "\001\rS\031x\016\004E\016L2\031S\bU\f\034P2T\031\rT\030T";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "\t\tF\fR\001\030\016H\003\002\004W";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "\\]\023C\024\\B\021Z\t\\\\\026";
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
        str1 = "\003\003T\004A\f\017T\004H\0033N\030J";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "\036\tR\033N\016\t\036S\002\034E\t";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "\035\031S\005S\004\001E";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "\t\tV\004D\b3M\fN\0033I\tT";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "\007\034U\036O2\037I\036x\037\tC\bN\033\tR2T\031\036I\003@";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "\007\034U\036O2\017O\003I2\001I\035";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "\001\017T\004J\b";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "\017\rC\006R\0353R\bW\002\036T2F\t\bR";
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
        str1 = "\016\002\016\007W\030\037HCT\b\036V\bU\016\003N\013N\n";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "\037\tG\004T\031\tR2C\b\032I\016B2\001A\016";
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
        str1 = "\001\rS\031x\037\tP\002U\0313D\bQ\004\017E2N\003\nO";
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
        str1 = "\004\001E\004";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = "\007\034U\036O2\037I\036x\003\tT\031^\035\t";
        j = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i] = str2;
        i = 38;
        str1 = "\001\rS\031x\n\003O\tx\016\003N\003x\035\003R\031";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = "\037\tG\004T\031\036A\031N\002\002\004C";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "\005\030T\035x\037\tP\002U\0313S\004T2\031R\001";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = "\037\tG\004T\031\tR2C\b\032I\016B2\rN\tU\002\005D2N\t";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "\t\tF\fR\001\030\016H\003\002\035H\037\030";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = "'<U\036O2(E\033N\016\ti\t";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "\007\034U\036O2\017O\003I2\001P\002U\031";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "\036\tR\033N\016\t\016H\003\002E\016B\031";
        j = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[i] = str2;
        i = 46;
        str1 = "\t\tV\004D\b3M\fN\0033M\fD";
        j = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[i] = str2;
        i = 47;
        str1 = "\016\002\016\007W\030\037HCF\003\bR\002N\tBa=w&)y";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "\037\tG\004T\031\tR2C\b\032I\016B2\005M\bN";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "\001\rS\031x\n\003O\tx\016\003N\003x\004\034";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        i = 50;
        str1 = "\001\rS\031x\016\003N\003B\016\030I\002I2\030Y\035B";
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
        str1 = "\001\rS\031x\n\003O\tx\036\005S";
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
        str1 = "\037\tG\004T\031\tR2C\b\032I\016B2\005N\013H";
        j = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[i] = str2;
        i = 58;
        str1 = "\\B\023C\027";
        j = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[i] = str2;
        i = 59;
        str1 = "\003\031M\017B\0373V\bU\036\005O\003";
        j = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[i] = str2;
        i = 60;
        str1 = "\t\tV\004D\b3R\b@\004\037T\bU\b\b\fW\035\007E\024";
        j = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[i] = str2;
        i = 61;
        str1 = "\003\003T\004A\004\017A\031N\002\002\bI\f\016L\bC";
        j = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[i] = str2;
        i = 62;
        str1 = "\036\tS\036N\002\002\004C";
        j = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[i] = str2;
        i = 63;
        str1 = "\t\tV\004D\b3A\035W\006\tY";
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
        str1 = "";
        j = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[i] = str2;
        i = 66;
        str1 = "";
        j = 65;
        localObject1 = localObject2;
        break;
      case 65:
        localObject1[i] = str2;
        i = 67;
        str1 = "\017\rC\006R\0353U\036B\0373A\tC\037";
        j = 66;
        localObject1 = localObject2;
        break;
      case 66:
        localObject1[i] = str2;
        i = 68;
        str1 = "\001\rS\031x\037\tP\002U\0313I\003C\b\024";
        j = 67;
        localObject1 = localObject2;
        break;
      case 67:
        localObject1[i] = str2;
        i = 69;
        str1 = "\t\tV\004D\b3C\005F\003\002E\001";
        j = 68;
        localObject1 = localObject2;
        break;
      case 68:
        localObject1[i] = str2;
        i = 70;
        str1 = "\t\tV\004D\b3U\004C";
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
        str1 = "\003\031M\017B\0373A\035W\004\b";
        j = 71;
        localObject1 = localObject2;
        break;
      case 71:
        localObject1[i] = str2;
        i = 73;
        str1 = "\t\tV\004D\b3R\b@\004\037T\037F\031\005O\003x\004\b";
        j = 72;
        localObject1 = localObject2;
        break;
      case 72:
        localObject1[i] = str2;
        i = 74;
        str1 = "\037\tP\002U\0313L\002D\f\030I\002I2\nR\bV\030\tN\016^";
        j = 73;
        localObject1 = localObject2;
        break;
      case 73:
        localObject1[i] = str2;
        i = 75;
        str1 = "\001\016S2U\b\034O\037S2\tN\fE\001\t";
        j = 74;
        localObject1 = localObject2;
        break;
      case 74:
        localObject1[i] = str2;
        i = 76;
        str1 = "\003\016\001F\036\030T\004J\b";
        j = 75;
        localObject1 = localObject2;
        break;
      case 75:
        localObject1[i] = str2;
        i = 77;
        str1 = "\003\031M\017B\0373U\037K";
        j = 76;
        localObject1 = localObject2;
        break;
      case 76:
        localObject1[i] = str2;
        i = 78;
        str1 = ":%f$";
        j = 77;
        localObject1 = localObject2;
        break;
      case 77:
        localObject1[i] = str2;
        i = 79;
        str1 = "\003\tX\031x\037\005D";
        j = 78;
        localObject1 = localObject2;
        break;
      case 78:
        localObject1[i] = str2;
        i = 80;
        str1 = "\005\030T\035\035BC\021U\025CU\022C\025]B\021U\036WU\020T\036B";
        j = 79;
        localObject1 = localObject2;
        break;
      case 79:
        localObject1[i] = str2;
        z = localObject2;
        return;
        i3 = 109;
        continue;
        i3 = 108;
        continue;
        i3 = 32;
        continue;
        i3 = 109;
      }
    }
  }

  public static String A()
  {
    String str = e.h;
    if (an.a(str))
    {
      str = c.b(e.e, z[0], "");
      e.h = str;
    }
    return str;
  }

  public static String B()
  {
    return c.b(e.e, z[73], "");
  }

  public static String C()
  {
    return d(z[60], null);
  }

  public static String D()
  {
    return c.b(e.e, z[15], "");
  }

  public static String E()
  {
    return c.b(e.e, z[63], "");
  }

  public static String F()
  {
    return d(z[69], null);
  }

  public static boolean G()
  {
    String str1 = d(z[11], "");
    String str2 = d(z[12], "");
    String str3 = d(z[46], "");
    if ((str1.isEmpty()) && (str2.isEmpty()) && (str3.isEmpty()))
    {
      ac.c();
      return true;
    }
    return false;
  }

  public static String H()
  {
    return d(z[11], "");
  }

  public static String I()
  {
    return d(z[3], "");
  }

  public static void J()
  {
    a(z[76], System.currentTimeMillis());
  }

  private static long K()
  {
    long l = c.b(e.e, z[74], 3600000L);
    if (l > 0L)
      return l;
    return 3600000L;
  }

  public static cn.jpush.android.service.a a(Context paramContext)
  {
    return cn.jpush.android.service.a.valueOf(c.b(paramContext, z[6], cn.jpush.android.service.a.b.name()));
  }

  public static void a(int paramInt)
  {
    a(z[38], paramInt);
  }

  public static void a(long paramLong)
  {
    a(z[33], paramLong);
    a(z[20], System.currentTimeMillis());
  }

  public static void a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    a(Long.valueOf(paramLong));
    p(paramString1);
    q(paramString2);
    if (!an.a(paramString3))
      g(paramString3);
    c(z[60], paramString4);
  }

  public static void a(Context paramContext, int paramInt)
  {
    c.a(paramContext, z[55], paramInt);
  }

  public static void a(Context paramContext, int paramInt, String paramString)
  {
    if ((paramInt < 0) || (paramInt >= 3))
      return;
    d(paramContext, z[77] + paramInt, paramString);
  }

  public static void a(Context paramContext, long paramLong)
  {
    if (paramLong > 0L);
    for (long l = 1000L * paramLong; ; l = K())
    {
      c.a(paramContext, z[74], l);
      return;
    }
  }

  public static void a(Context paramContext, cn.jpush.android.service.a parama)
  {
    c.a(paramContext, z[6], parama.name());
  }

  public static void a(Context paramContext, String paramString)
  {
    c.a(paramContext, z[35], paramString);
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    c.a(paramContext, z[66] + paramString1, paramString2);
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    c.a(paramContext, z[65], paramBoolean);
  }

  private static void a(Long paramLong)
  {
    e.g = paramLong.longValue();
    c.a(e.e, z[70], paramLong.longValue());
  }

  public static void a(String paramString)
  {
    c(z[49], paramString);
  }

  public static void a(boolean paramBoolean)
  {
    c.a(e.e, z[71], paramBoolean);
  }

  public static boolean a()
  {
    long l1 = b(z[34], 0L);
    long l2 = System.currentTimeMillis();
    if (l2 - l1 > 86400000L)
    {
      a(z[34], l2);
      return true;
    }
    return false;
  }

  public static boolean a(String paramString1, String paramString2)
  {
    String str1 = d(z[11], "");
    String str2 = d(z[12], "");
    if ((paramString1.equals(str1)) && (paramString2.equals(str2)))
    {
      ac.c();
      return true;
    }
    ac.c();
    return false;
  }

  public static int b(Context paramContext)
  {
    int i = c.b(paramContext, z[55], 5);
    new StringBuilder(z[64]).append(i);
    ac.a();
    return i;
  }

  public static void b(int paramInt)
  {
    a(z[62], paramInt);
  }

  public static void b(long paramLong)
  {
    a(z[2], paramLong);
  }

  public static void b(Context paramContext, int paramInt)
  {
    c.a(paramContext, z[22], paramInt);
  }

  public static void b(Context paramContext, String paramString)
  {
    c.a(paramContext, z[56], paramString);
  }

  public static void b(Context paramContext, boolean paramBoolean)
  {
    c.a(paramContext, z[61], paramBoolean);
  }

  public static boolean b()
  {
    long l1 = b(z[7], 0L);
    long l2 = System.currentTimeMillis();
    long l3 = K();
    if (l2 - l1 > l3)
    {
      a(z[7], l2);
      return true;
    }
    return false;
  }

  public static boolean b(String paramString)
  {
    if (paramString == null)
      return true;
    if (!paramString.equalsIgnoreCase(d(z[50], null)))
    {
      c(z[50], paramString);
      return true;
    }
    return false;
  }

  public static boolean b(String paramString1, String paramString2)
  {
    String str1 = d(z[12], "");
    String str2 = d(z[46], "");
    if ((an.a(paramString2)) || (an.a(str2)))
      return paramString1.equals(str1);
    if ((paramString1.equals(str1)) && (paramString2.equals(str2)))
    {
      ac.c();
      return true;
    }
    ac.c();
    return false;
  }

  public static int c(Context paramContext)
  {
    return c.b(paramContext, z[22], 0);
  }

  public static void c()
  {
    a(z[7], System.currentTimeMillis());
  }

  public static void c(int paramInt)
  {
    a(z[42], paramInt);
  }

  public static void c(Context paramContext, int paramInt)
  {
    c.a(paramContext, z[1], paramInt);
  }

  public static void c(Context paramContext, String paramString)
  {
    b(paramContext, z[16], paramString);
  }

  public static void c(Context paramContext, boolean paramBoolean)
  {
    c.a(paramContext, z[75], paramBoolean);
  }

  public static void c(String paramString)
  {
    c(z[18], paramString);
  }

  public static String d(Context paramContext, int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= 3))
      return z[80];
    return e(paramContext, z[77] + paramInt, z[80]);
  }

  public static void d(Context paramContext, String paramString)
  {
    b(paramContext, z[36], paramString);
  }

  private static void d(Context paramContext, String paramString1, String paramString2)
  {
    c.a(paramContext, paramString1, o(paramString2));
  }

  public static void d(Context paramContext, boolean paramBoolean)
  {
    c.a(paramContext, z[9], paramBoolean);
  }

  public static void d(String paramString)
  {
    c.a(e.e, z[28], paramString);
  }

  public static boolean d()
  {
    long l1 = b(z[17], 0L);
    long l2 = System.currentTimeMillis();
    if (l2 - l1 > 3600000L)
    {
      a(z[17], l2);
      return true;
    }
    return false;
  }

  public static boolean d(Context paramContext)
  {
    return c.b(paramContext, z[65], false);
  }

  public static String e(Context paramContext)
  {
    return c.b(paramContext, z[35], "");
  }

  public static String e(Context paramContext, String paramString)
  {
    return c.b(paramContext, z[66] + paramString, "");
  }

  private static String e(Context paramContext, String paramString1, String paramString2)
  {
    String str = c.b(paramContext, paramString1, "");
    if (an.a(str))
      return paramString2;
    return e(str, paramString2);
  }

  public static void e()
  {
    a(z[17], System.currentTimeMillis());
  }

  public static void e(String paramString)
  {
    c(z[67], paramString);
  }

  public static String f(Context paramContext)
  {
    return c.b(paramContext, z[56], "");
  }

  public static void f(Context paramContext, String paramString)
  {
    d(paramContext, z[59], paramString);
  }

  public static void f(String paramString)
  {
    c(z[52], paramString);
  }

  public static boolean f()
  {
    try
    {
      long l1 = b(z[68], 0L);
      long l2 = System.currentTimeMillis();
      if (l2 - l1 > 86400000L)
        a(z[68], l2);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
    finally
    {
    }
  }

  public static long g()
  {
    return b(z[68], 0L);
  }

  public static void g(Context paramContext, String paramString)
  {
    d(paramContext, z[72], paramString);
  }

  public static void g(String paramString)
  {
    c.a(e.e, z[15], paramString);
  }

  public static boolean g(Context paramContext)
  {
    return c.b(paramContext, z[61], true);
  }

  public static String h()
  {
    return d(z[49], null);
  }

  public static String h(Context paramContext)
  {
    return c(paramContext, z[16], "");
  }

  public static void h(Context paramContext, String paramString)
  {
    d(paramContext, z[5], paramString);
  }

  public static void h(String paramString)
  {
    c.a(e.e, z[63], paramString);
  }

  public static int i()
  {
    return b(z[38], 0);
  }

  public static String i(Context paramContext)
  {
    return c(paramContext, z[36], "");
  }

  public static void i(Context paramContext, String paramString)
  {
    String str = af.b(paramContext);
    if (an.a(str))
      str = z[13];
    d(paramContext, str, paramString);
  }

  public static void i(String paramString)
  {
    c(z[69], paramString);
  }

  public static void j(String paramString)
  {
    c(z[11], paramString);
  }

  public static boolean j()
  {
    long l = b(z[10], 0L);
    return System.currentTimeMillis() - l > 180000L;
  }

  public static boolean j(Context paramContext)
  {
    return c.b(paramContext, z[75], true);
  }

  public static String k(Context paramContext)
  {
    return e(paramContext, z[59], z[58]);
  }

  public static void k()
  {
    a(z[10], System.currentTimeMillis());
  }

  public static void k(String paramString)
  {
    c(z[12], paramString);
  }

  public static int l()
  {
    return b(z[62], 0);
  }

  public static String l(Context paramContext)
  {
    return e(paramContext, z[72], "7");
  }

  public static void l(String paramString)
  {
    c(z[46], paramString);
  }

  public static long m()
  {
    long l1 = b(z[20], 0L);
    long l2 = b(z[33], 0L);
    return (System.currentTimeMillis() + (l2 - l1)) / 1000L;
  }

  public static String m(Context paramContext)
  {
    return e(paramContext, z[5], z[4]);
  }

  public static void m(String paramString)
  {
    c(z[3], paramString);
  }

  public static long n()
  {
    try
    {
      String str = z[79];
      long l1 = Math.abs(new Random().nextInt(32767));
      if (l1 % 2L == 0L)
        l1 += 1L;
      long l2 = b(str, l1) % 32767L;
      a(z[79], l2 + 2L);
      long l3 = l2 + 2L;
      return l3;
    }
    finally
    {
    }
  }

  public static String n(Context paramContext)
  {
    String str = af.b(paramContext);
    if (an.a(str))
      str = z[13];
    return e(paramContext, str, "");
  }

  public static boolean o()
  {
    return c.b(e.e, z[71], false);
  }

  public static boolean o(Context paramContext)
  {
    if (b.c(paramContext).toUpperCase().startsWith(z[78]));
    long l;
    do
    {
      do
        return false;
      while ((!c.b(paramContext, z[9], false)) && (!an.a(n(paramContext))));
      l = b(z[76], 0L);
    }
    while (System.currentTimeMillis() - l <= 3600000L);
    return true;
  }

  public static void p()
  {
    int i = c.b(e.e, z[14], -1);
    c.a(e.e, z[14], i + 1);
  }

  public static void p(Context paramContext)
  {
    q(paramContext);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(z[30], 0);
    String str1 = z[6];
    if (localSharedPreferences.getInt(z[45], 0) == 1);
    for (String str2 = cn.jpush.android.service.a.a.name(); ; str2 = cn.jpush.android.service.a.b.name())
    {
      b(paramContext, str1, str2);
      b(paramContext, z[24], localSharedPreferences.getString(z[57], ""));
      b(paramContext, z[11], localSharedPreferences.getString(z[48], ""));
      b(paramContext, z[12], localSharedPreferences.getString(z[41], ""));
      b(paramContext, z[46], localSharedPreferences.getString(z[31], ""));
      b(paramContext, z[50], localSharedPreferences.getString(z[37], ""));
      b(paramContext, z[52], localSharedPreferences.getString(z[25], ""));
      b(paramContext, z[18], localSharedPreferences.getString(z[51], ""));
      b(paramContext, z[28], localSharedPreferences.getString(z[40], ""));
      b(paramContext, z[49], localSharedPreferences.getString(z[26], ""));
      b(paramContext, z[16], localSharedPreferences.getString(z[16], ""));
      b(paramContext, z[36], localSharedPreferences.getString(z[36], ""));
      a(paramContext, z[42], localSharedPreferences.getInt(z[29], 0));
      a(paramContext, z[38], localSharedPreferences.getInt(z[44], 0));
      a(paramContext, z[20], localSharedPreferences.getLong(z[27], 0L));
      a(paramContext, z[34], localSharedPreferences.getLong(z[32], 0L));
      a(paramContext, z[33], localSharedPreferences.getLong(z[33], 0L));
      a(paramContext, z[7], localSharedPreferences.getLong(z[54], 0L));
      q(localSharedPreferences.getString(z[39], ""));
      h(localSharedPreferences.getString(z[47], ""));
      g(localSharedPreferences.getString(z[43], ""));
      String str3 = localSharedPreferences.getString(z[53], "");
      c.a(paramContext, z[35], str3);
      String str4 = localSharedPreferences.getString(z[23], "");
      c.a(paramContext, z[56], str4);
      int i = localSharedPreferences.getInt(z[21], 5);
      c.a(paramContext, z[55], i);
      int j = localSharedPreferences.getInt(z[22], 0);
      c.a(paramContext, z[22], j);
      return;
    }
  }

  private static void p(String paramString)
  {
    e.h = paramString;
    c.a(e.e, z[0], paramString);
  }

  public static int q()
  {
    return b(z[8], 290);
  }

  private static void q(String paramString)
  {
    c.a(e.e, z[73], paramString);
  }

  public static void r()
  {
    a(z[8], 86400);
  }

  public static String s()
  {
    return d(z[18], z[19]);
  }

  public static int t()
  {
    return b(z[42], 7000);
  }

  public static String u()
  {
    return c.b(e.e, z[28], null);
  }

  public static String v()
  {
    return d(z[52], null);
  }

  public static long w()
  {
    return b(z[2], -1L);
  }

  public static long x()
  {
    long l = e.g;
    if (l == 0L)
    {
      l = c.b(e.e, z[70], 0L);
      e.g = l;
    }
    return l;
  }

  public static boolean y()
  {
    long l = x();
    String str = B();
    return (l > 0L) && (!an.a(str));
  }

  public static void z()
  {
    a(Long.valueOf(0L));
    p("");
    q("");
    g("");
    n(z[60]);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */