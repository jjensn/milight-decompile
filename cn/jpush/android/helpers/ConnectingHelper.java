package cn.jpush.android.helpers;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import cn.jpush.android.service.PushProtocol;
import cn.jpush.android.service.SisInfo;
import cn.jpush.android.service.k;
import cn.jpush.android.service.r;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ah;
import cn.jpush.android.util.an;
import cn.jpush.android.util.b;
import cn.jpush.android.util.u;
import cn.jpush.b.a.a.i;
import cn.jpush.b.a.a.l;
import com.google.gson.jpush.ab;
import com.google.gson.jpush.t;
import com.google.gson.jpush.w;
import com.google.gson.jpush.z;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ConnectingHelper
{
  private static final List<String> a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[78];
    int i = 0;
    String str1 = "V GV\\v;@V^]*EH\\g";
    int j = -1;
    Object localObject2 = localObject1;
    int i16;
    label133: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int k = localObject3.length;
      int m = 0;
      if (k <= 1);
      while (k > m)
      {
        Object localObject10 = localObject3;
        int i13 = m;
        int i14 = k;
        Object localObject11 = localObject3;
        while (true)
        {
          int i15 = localObject11[m];
          switch (i13 % 5)
          {
          default:
            i16 = 57;
            localObject11[m] = (char)(i16 ^ i15);
            m = i13 + 1;
            if (i14 != 0)
              break label133;
            localObject11 = localObject10;
            i13 = m;
            m = i14;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        k = i14;
        localObject3 = localObject10;
      }
      str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "Y JYU5*[JVgoM]Jv=@HM| G\002\031";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "1k";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "'a\030\026\016";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "@!AYWq#L\\\031f*[N\\go[]Je GK\\5*[JVgoJW]po\004\030";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "v!\007RI`<A\026X{+[WPqa@VMp!]\026kP\b`kmG\016}qv[";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "G*NQJa*[\030t&E]]58@LQ5<LJOp=\t]Kg [\030\0245,F\\\\/";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "`!BVVb!";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "v!\007RI`<A\026X{+[WPqa{}~\\\034}jxA\006fvf\\\013";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "匐呂\023\030";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "G*NQJa*[\030J`,J]\\qo\004\030S`&M\002";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "G*NQJa*[\030N|;A\002\031~*P\002";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "9oL@M^*P\002";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "9oJTPp!]qWs \023";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "丘卶酤";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "9oHHRC*[KPz!\023";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "5乁\tyIe\004LA\003";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "9oM]O|,Lq]/";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "e.ZKNz=M\002";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = "@!L@Ip,]]]/o[]^|<]JXa&FVpq`CMPqoZPV`#M\030Wz;\tZ\\5*DHMla\t";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "G*NQJa*[\030_t&E]]5b\tJ\\au";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "9o[]^|<]JXa&FVpqu";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = "9oD]Jf.N]\003";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "9oYWKau";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "F\006z\030kp,LQO|!N\026\027;";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "R*]\030J|<\tQWs \tKLv,L]]58@LQ5'FKM/o";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "R*]\030J|<\tQWs \t]Kg [\030\0245<@Kqz<]\002";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "A \t_\\aoZQJ5b\tPVf;\023";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "P7J]Ia&FV\031b'LV\031v#FK\\5:MH\031f JS\\ao\004\030";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = "F\006z\030kp,LQOp+\tkMg&G_\0035";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "9oZ]Up,]QV{u";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = "S.@T\\qo]W\031g*ZWUc*\tPVf;\t\\Wfo\004\030";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "V.G\030Wz;\t_\\aoZQJ5&G^V5)[WT5'FKM/o";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "9oYWKau\032\b\t%";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = "Z?LV\031v GV\\v;@WW58@LQ5'HJ]v M]]5'FKM5b\tQI/";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "Z?LV\031v GV\\v;@WW58@LQ5+L^X`#]\030\0245&Y\002";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "\\!_YU|+\t\\\\s.\\TM5,FVW;";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = "|\"\037\f\027?\\KQ;,G";
        j = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i] = str2;
        i = 38;
        str1 = "Z?LV\031v GV\\v;@WW5)HQUp+\t\025\031g*]\002";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = "e:ZPfa vQTJ+HLX";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "e:ZPfy NQWJ<LJOp=vLPx*";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = "v!\007RI`<A\026PxaHV]g @\\\027t,]QV{a`ufG\nzhv[\034l";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "T,]QV{o\004\030Jp!Mk\\g9LJm|\"LJ";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = "<FV|m,LHM| G\030\0245";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "e:ZPfy NQWJ#F[Xy\020]QTp";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "|?Z\030Xg=\007T\\{o\004\030";
        j = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[i] = str2;
        i = 46;
        str1 = "e.[K\\F&ZQWs \t[Kt<A\002\003";
        j = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[i] = str2;
        i = 47;
        str1 = "a'L\030Sf G\030\0245";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "\\!_YU|+\tKPfo[]Je GK\\9oOYPy*M\030MzoYYKf*\trjZ\001\007";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "q*OYLy;\tPMa?\023";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        i = 50;
        str1 = "|?Z";
        j = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[i] = str2;
        i = 51;
        str1 = "T,]QV{o\004\030Jp!M{V{!L[M| G{Qt!N]]";
        j = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[i] = str2;
        i = 52;
        str1 = "v!\007RI`<A\026X{+[WPqa@VMp!]\026zZ\001g}zA\006fv";
        j = 51;
        localObject1 = localObject2;
        break;
      case 51:
        localObject1[i] = str2;
        i = 53;
        str1 = "f;HL\\5&Z\030Wz;\t[Qt!N]]5b\t";
        j = 52;
        localObject1 = localObject2;
        break;
      case 52:
        localObject1[i] = str2;
        i = 54;
        str1 = "v!\007RI`<A\026X{+[WPqajww[\njlpZ\001v{qT\001n}";
        j = 53;
        localObject1 = localObject2;
        break;
      case 53:
        localObject1[i] = str2;
        i = 55;
        str1 = "v GV\\v;L\\";
        j = 54;
        localObject1 = localObject2;
        break;
      case 54:
        localObject1[i] = str2;
        i = 56;
        str1 = "@\t";
        j = 55;
        localObject1 = localObject2;
        break;
      case 55:
        localObject1[i] = str2;
        i = 57;
        str1 = "e'FV\\";
        j = 56;
        localObject1 = localObject2;
        break;
      case 56:
        localObject1[i] = str2;
        i = 58;
        str1 = "Y NQW5)HQUp+\tOPa'\tK\\g9LJ\031p=[WK5b\t[Vq*\023";
        j = 57;
        localObject1 = localObject2;
        break;
      case 57:
        localObject1[i] = str2;
        i = 59;
        str1 = "Y NQW58@LQ5b\tRL|+\023";
        j = 58;
        localObject1 = localObject2;
        break;
      case 58:
        localObject1[i] = str2;
        i = 60;
        str1 = "Y NQW5)HQUp+\tOPa'\ttVv.E\030\\g=FJ\0318oJW]pu";
        j = 59;
        localObject1 = localObject2;
        break;
      case 59:
        localObject1[i] = str2;
        i = 61;
        str1 = "9oHHI^*P\002";
        j = 60;
        localObject1 = localObject2;
        break;
      case 60:
        localObject1[i] = str2;
        i = 62;
        str1 = "9oLJKz=\023";
        j = 61;
        localObject1 = localObject2;
        break;
      case 61:
        localObject1[i] = str2;
        i = 63;
        str1 = "Y NQW5<\\[Zp*M\030\0245<@\\\003";
        j = 62;
        localObject1 = localObject2;
        break;
      case 62:
        localObject1[i] = str2;
        i = 64;
        str1 = "y NQW5b\tRL|+\023";
        j = 63;
        localObject1 = localObject2;
        break;
      case 63:
        localObject1[i] = str2;
        i = 65;
        str1 = "9oZ]Kc*[lPx*\022";
        j = 64;
        localObject1 = localObject2;
        break;
      case 64:
        localObject1[i] = str2;
        i = 66;
        str1 = "9oZ\\RC*[KPz!\023";
        j = 65;
        localObject1 = localObject2;
        break;
      case 65:
        localObject1[i] = str2;
        i = 67;
        str1 = "9oOTXru";
        j = 66;
        localObject1 = localObject2;
        break;
      case 66:
        localObject1[i] = str2;
        i = 68;
        str1 = "5#F_P{\035LKIz!Z]\031|<\tVLy#";
        j = 67;
        localObject1 = localObject2;
        break;
      case 67:
        localObject1[i] = str2;
        i = 69;
        str1 = "Y NQW5)HQUp+\tOPa'\tJ\\a:[V\031v M]\003";
        j = 68;
        localObject1 = localObject2;
        break;
      case 68:
        localObject1[i] = str2;
        i = 70;
        str1 = "v GV\\v;@WW";
        j = 69;
        localObject1 = localObject2;
        break;
      case 69:
        localObject1[i] = str2;
        i = 71;
        str1 = "\\!_YU|+\tUX|!\t[V{!";
        j = 70;
        localObject1 = localObject2;
        break;
      case 70:
        localObject1[i] = str2;
        i = 72;
        str1 = "S.@T\\qo^QM}oHTU5,FVWfa";
        j = 71;
        localObject1 = localObject2;
        break;
      case 71:
        localObject1[i] = str2;
        i = 73;
        str1 = "9o@V]p7\023";
        j = 72;
        localObject1 = localObject2;
        break;
      case 72:
        localObject1[i] = str2;
        i = 74;
        str1 = "Z?LV\031v GV\\v;@WW58@LQ5 YLPz!Z\030\0245&Y\002";
        j = 73;
        localObject1 = localObject2;
        break;
      case 73:
        localObject1[i] = str2;
        i = 75;
        str1 = "Z?LV\031v GV\\v;@WW58@LQ5\"HQW5b\tQI/";
        j = 74;
        localObject1 = localObject2;
        break;
      case 74:
        localObject1[i] = str2;
        i = 76;
        str1 = "Z?LV\031v GV\\v;@WW58@LQ5#HKM5(FW]5b\tQI/";
        j = 75;
        localObject1 = localObject2;
        break;
      case 75:
        localObject1[i] = str2;
        i = 77;
        str1 = "F:J[\\p+\tLV5 Y]W5,FVWp,]QV{o\004\030Peu";
        j = 76;
        localObject1 = localObject2;
      case 76:
      }
    }
    localObject1[i] = str2;
    z = localObject2;
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    Object localObject4 = "faCHLf'\007[W".toCharArray();
    int n = localObject4.length;
    int i1 = 0;
    if (n <= 1);
    label2074: label2213: 
    while (n > i1)
    {
      Object localObject8 = localObject4;
      int i9 = i1;
      int i10 = n;
      Object localObject9 = localObject4;
      int i11 = localObject9[i1];
      int i12;
      switch (i9 % 5)
      {
      default:
        i12 = 57;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        localObject9[i1] = (char)(i12 ^ i11);
        i1 = i9 + 1;
        if (i10 != 0)
          break label2213;
        localObject9 = localObject8;
        i9 = i1;
        i1 = i10;
        break label2074;
        i16 = 21;
        break;
        i16 = 79;
        break;
        i16 = 41;
        break;
        i16 = 56;
        break;
        i12 = 21;
        continue;
        i12 = 79;
        continue;
        i12 = 41;
        continue;
        i12 = 56;
      }
      n = i10;
      localObject4 = localObject8;
    }
    localArrayList.add(new String((char[])localObject4).intern());
    List localList = a;
    String str3 = "f&Z\026Se:ZP\027| ";
    int i2 = -1;
    label2409: String str4;
    while (true)
    {
      Object localObject5 = str3.toCharArray();
      int i3 = localObject5.length;
      int i4 = 0;
      if (i3 <= 1);
      while (i3 > i4)
      {
        Object localObject6 = localObject5;
        int i5 = i4;
        int i6 = i3;
        Object localObject7 = localObject5;
        int i7 = localObject7[i4];
        int i8;
        switch (i5 % 5)
        {
        default:
          i8 = 57;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          localObject7[i4] = (char)(i8 ^ i7);
          i4 = i5 + 1;
          if (i6 != 0)
            break label2409;
          localObject7 = localObject6;
          i5 = i4;
          i4 = i6;
          break;
          i8 = 21;
          continue;
          i8 = 79;
          continue;
          i8 = 41;
          continue;
          i8 = 56;
        }
        i3 = i6;
        localObject5 = localObject6;
      }
      str4 = new String((char[])localObject5).intern();
      switch (i2)
      {
      default:
        localList.add(str4);
        localList = a;
        str3 = "p.ZAMz\"LKJt(L\026Zz\"";
        i2 = 0;
        break;
      case 0:
        localList.add(str4);
        localList = a;
        str3 = "$~\032\026\n$a\030\017\027$\021";
        i2 = 1;
      case 1:
      }
    }
    localList.add(str4);
  }

  public ConnectingHelper()
  {
  }

  private static int a(k paramk, long paramLong)
  {
    String str1 = cn.jpush.android.a.s();
    int i = cn.jpush.android.a.t();
    ac.b(z[0], z[35] + str1 + z[23] + i);
    int j;
    if ((str1 == null) || (i == 0))
    {
      ac.b(z[0], z[36]);
      j = -1;
    }
    do
    {
      return j;
      j = a(paramk, paramLong, str1, i);
    }
    while (j == 0);
    InetAddress localInetAddress;
    try
    {
      localInetAddress = a(z[37]);
      if (localInetAddress == null)
        throw new Exception();
    }
    catch (Exception localException)
    {
      ac.b();
      return j;
    }
    String str2 = localInetAddress.getHostAddress();
    new StringBuilder(z[34]).append(str2).append(z[33]);
    ac.b();
    int k = a(paramk, paramLong, str2, 3000);
    return k;
  }

  private static int a(k paramk, long paramLong, String paramString, int paramInt)
  {
    int i;
    if (paramk.b())
    {
      ac.d();
      i = -991;
    }
    do
    {
      return i;
      i = PushProtocol.InitPush(paramLong, paramString, paramInt);
    }
    while (i == 0);
    if (paramk.b())
    {
      new StringBuilder(z[38]).append(i);
      ac.a();
      return i;
    }
    ac.b(z[0], z[38] + i);
    return i;
  }

  // ERROR //
  private static SisInfo a(Context paramContext, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 276	cn/jpush/android/util/b:r	(Landroid/content/Context;)Ljava/lang/String;
    //   4: invokestatic 279	cn/jpush/android/a:b	(Ljava/lang/String;)Z
    //   7: istore 4
    //   9: iload_1
    //   10: ifne +24 -> 34
    //   13: iload 4
    //   15: ifne +19 -> 34
    //   18: invokestatic 282	cn/jpush/android/a:j	()Z
    //   21: ifne +13 -> 34
    //   24: invokestatic 285	cn/jpush/android/util/ac:c	()V
    //   27: invokestatic 288	cn/jpush/android/a:v	()Ljava/lang/String;
    //   30: invokestatic 292	cn/jpush/android/helpers/ConnectingHelper:parseSisInfo	(Ljava/lang/String;)Lcn/jpush/android/service/SisInfo;
    //   33: areturn
    //   34: ldc_w 294
    //   37: astore 5
    //   39: new 296	java/net/DatagramSocket
    //   42: dup
    //   43: invokespecial 297	java/net/DatagramSocket:<init>	()V
    //   46: astore 6
    //   48: sipush 1024
    //   51: newarray byte
    //   53: astore 19
    //   55: getstatic 189	cn/jpush/android/helpers/ConnectingHelper:a	Ljava/util/List;
    //   58: iload_2
    //   59: invokeinterface 301 2 0
    //   64: checkcast 13	java/lang/String
    //   67: astore 20
    //   69: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   72: iconst_0
    //   73: aaload
    //   74: new 218	java/lang/StringBuilder
    //   77: dup
    //   78: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   81: bipush 27
    //   83: aaload
    //   84: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload 20
    //   89: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   95: bipush 23
    //   97: aaload
    //   98: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: iload_3
    //   102: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   105: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   108: bipush 30
    //   110: aaload
    //   111: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: iload_2
    //   115: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   118: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: invokestatic 237	cn/jpush/android/util/ac:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   124: iload_2
    //   125: iconst_2
    //   126: if_icmpgt +112 -> 238
    //   129: aload 20
    //   131: invokestatic 243	cn/jpush/android/helpers/ConnectingHelper:a	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   134: astore 23
    //   136: aload 23
    //   138: ifnonnull +107 -> 245
    //   141: new 207	java/lang/Exception
    //   144: dup
    //   145: new 218	java/lang/StringBuilder
    //   148: dup
    //   149: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   152: bipush 31
    //   154: aaload
    //   155: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload 20
    //   160: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokespecial 302	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   169: athrow
    //   170: astore 22
    //   172: aload 6
    //   174: astore 10
    //   176: aload 20
    //   178: astore 9
    //   180: aload 22
    //   182: astore 7
    //   184: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   187: iconst_0
    //   188: aaload
    //   189: new 218	java/lang/StringBuilder
    //   192: dup
    //   193: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   196: bipush 26
    //   198: aaload
    //   199: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   202: aload 9
    //   204: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   210: aload 7
    //   212: invokestatic 305	cn/jpush/android/util/ac:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   215: iinc 2 1
    //   218: aload 10
    //   220: ifnull +8 -> 228
    //   223: aload 10
    //   225: invokevirtual 308	java/net/DatagramSocket:close	()V
    //   228: iload_2
    //   229: iconst_4
    //   230: if_icmpge +431 -> 661
    //   233: iconst_1
    //   234: istore_1
    //   235: goto -235 -> 0
    //   238: aload 20
    //   240: invokestatic 311	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   243: astore 23
    //   245: new 313	java/net/DatagramPacket
    //   248: dup
    //   249: aload_0
    //   250: getstatic 319	cn/jpush/android/e:f	Ljava/lang/String;
    //   253: invokestatic 323	cn/jpush/android/a:x	()J
    //   256: invokestatic 326	cn/jpush/android/helpers/ConnectingHelper:a	(Landroid/content/Context;Ljava/lang/String;J)[B
    //   259: sipush 128
    //   262: aload 23
    //   264: iload_3
    //   265: invokespecial 329	java/net/DatagramPacket:<init>	([BILjava/net/InetAddress;I)V
    //   268: astore 24
    //   270: aload 6
    //   272: sipush 6000
    //   275: invokevirtual 333	java/net/DatagramSocket:setSoTimeout	(I)V
    //   278: aload 6
    //   280: aload 24
    //   282: invokevirtual 337	java/net/DatagramSocket:send	(Ljava/net/DatagramPacket;)V
    //   285: new 313	java/net/DatagramPacket
    //   288: dup
    //   289: aload 19
    //   291: sipush 1024
    //   294: invokespecial 340	java/net/DatagramPacket:<init>	([BI)V
    //   297: astore 25
    //   299: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   302: iconst_0
    //   303: aaload
    //   304: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   307: bipush 24
    //   309: aaload
    //   310: invokestatic 237	cn/jpush/android/util/ac:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: aload 6
    //   315: aload 25
    //   317: invokevirtual 343	java/net/DatagramSocket:receive	(Ljava/net/DatagramPacket;)V
    //   320: aload 25
    //   322: invokevirtual 346	java/net/DatagramPacket:getLength	()I
    //   325: newarray byte
    //   327: astore 26
    //   329: aload 25
    //   331: invokevirtual 350	java/net/DatagramPacket:getData	()[B
    //   334: iconst_0
    //   335: aload 26
    //   337: iconst_0
    //   338: aload 26
    //   340: arraylength
    //   341: invokestatic 356	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   344: new 13	java/lang/String
    //   347: dup
    //   348: aload 26
    //   350: invokespecial 359	java/lang/String:<init>	([B)V
    //   353: astore 27
    //   355: new 218	java/lang/StringBuilder
    //   358: dup
    //   359: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   362: bipush 29
    //   364: aaload
    //   365: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   368: aload 27
    //   370: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: invokestatic 285	cn/jpush/android/util/ac:c	()V
    //   377: aload 27
    //   379: invokestatic 292	cn/jpush/android/helpers/ConnectingHelper:parseSisInfo	(Ljava/lang/String;)Lcn/jpush/android/service/SisInfo;
    //   382: astore 29
    //   384: aload 29
    //   386: ifnull +48 -> 434
    //   389: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   392: iconst_0
    //   393: aaload
    //   394: new 218	java/lang/StringBuilder
    //   397: dup
    //   398: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   401: bipush 25
    //   403: aaload
    //   404: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   407: aload 20
    //   409: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   415: invokestatic 361	cn/jpush/android/util/ac:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: invokestatic 364	cn/jpush/android/a:k	()V
    //   421: aload 6
    //   423: ifnull +8 -> 431
    //   426: aload 6
    //   428: invokevirtual 308	java/net/DatagramSocket:close	()V
    //   431: aload 29
    //   433: areturn
    //   434: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   437: iconst_0
    //   438: aaload
    //   439: new 218	java/lang/StringBuilder
    //   442: dup
    //   443: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   446: bipush 32
    //   448: aaload
    //   449: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   452: aload 20
    //   454: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   460: invokestatic 366	cn/jpush/android/util/ac:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   463: goto -42 -> 421
    //   466: astore 21
    //   468: aload 20
    //   470: astore 5
    //   472: aload 21
    //   474: astore 16
    //   476: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   479: iconst_0
    //   480: aaload
    //   481: new 218	java/lang/StringBuilder
    //   484: dup
    //   485: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   488: bipush 26
    //   490: aaload
    //   491: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   494: aload 5
    //   496: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   502: aload 16
    //   504: invokestatic 305	cn/jpush/android/util/ac:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   507: iinc 2 1
    //   510: aload 6
    //   512: ifnull -284 -> 228
    //   515: aload 6
    //   517: invokevirtual 308	java/net/DatagramSocket:close	()V
    //   520: goto -292 -> 228
    //   523: astore 17
    //   525: new 218	java/lang/StringBuilder
    //   528: dup
    //   529: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   532: bipush 28
    //   534: aaload
    //   535: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   538: aload 17
    //   540: invokevirtual 367	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   543: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: pop
    //   547: invokestatic 370	cn/jpush/android/util/ac:e	()V
    //   550: goto -322 -> 228
    //   553: astore 30
    //   555: new 218	java/lang/StringBuilder
    //   558: dup
    //   559: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   562: bipush 28
    //   564: aaload
    //   565: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   568: aload 30
    //   570: invokevirtual 367	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   573: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: pop
    //   577: invokestatic 370	cn/jpush/android/util/ac:e	()V
    //   580: goto -149 -> 431
    //   583: astore 14
    //   585: new 218	java/lang/StringBuilder
    //   588: dup
    //   589: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   592: bipush 28
    //   594: aaload
    //   595: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   598: aload 14
    //   600: invokevirtual 367	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   603: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: pop
    //   607: invokestatic 370	cn/jpush/android/util/ac:e	()V
    //   610: goto -382 -> 228
    //   613: astore 11
    //   615: aconst_null
    //   616: astore 6
    //   618: aload 6
    //   620: ifnull +8 -> 628
    //   623: aload 6
    //   625: invokevirtual 308	java/net/DatagramSocket:close	()V
    //   628: aload 11
    //   630: athrow
    //   631: astore 12
    //   633: new 218	java/lang/StringBuilder
    //   636: dup
    //   637: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   640: bipush 28
    //   642: aaload
    //   643: invokespecial 221	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   646: aload 12
    //   648: invokevirtual 367	java/lang/AssertionError:toString	()Ljava/lang/String;
    //   651: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   654: pop
    //   655: invokestatic 370	cn/jpush/android/util/ac:e	()V
    //   658: goto -30 -> 628
    //   661: aconst_null
    //   662: areturn
    //   663: astore 11
    //   665: goto -47 -> 618
    //   668: astore 11
    //   670: aload 10
    //   672: astore 6
    //   674: goto -56 -> 618
    //   677: astore 16
    //   679: aconst_null
    //   680: astore 6
    //   682: goto -206 -> 476
    //   685: astore 16
    //   687: goto -211 -> 476
    //   690: astore 7
    //   692: aload 5
    //   694: astore 9
    //   696: aconst_null
    //   697: astore 10
    //   699: goto -515 -> 184
    //   702: astore 7
    //   704: aload 6
    //   706: astore 8
    //   708: aload 5
    //   710: astore 9
    //   712: aload 8
    //   714: astore 10
    //   716: goto -532 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   69	124	170	java/lang/AssertionError
    //   129	136	170	java/lang/AssertionError
    //   141	170	170	java/lang/AssertionError
    //   238	245	170	java/lang/AssertionError
    //   245	384	170	java/lang/AssertionError
    //   389	421	170	java/lang/AssertionError
    //   434	463	170	java/lang/AssertionError
    //   69	124	466	java/lang/Exception
    //   129	136	466	java/lang/Exception
    //   141	170	466	java/lang/Exception
    //   238	245	466	java/lang/Exception
    //   245	384	466	java/lang/Exception
    //   389	421	466	java/lang/Exception
    //   434	463	466	java/lang/Exception
    //   515	520	523	java/lang/AssertionError
    //   426	431	553	java/lang/AssertionError
    //   223	228	583	java/lang/AssertionError
    //   39	48	613	finally
    //   623	628	631	java/lang/AssertionError
    //   48	69	663	finally
    //   69	124	663	finally
    //   129	136	663	finally
    //   141	170	663	finally
    //   238	245	663	finally
    //   245	384	663	finally
    //   389	421	663	finally
    //   434	463	663	finally
    //   476	507	663	finally
    //   184	215	668	finally
    //   39	48	677	java/lang/Exception
    //   48	69	685	java/lang/Exception
    //   39	48	690	java/lang/AssertionError
    //   48	69	702	java/lang/AssertionError
  }

  private static InetAddress a(String paramString)
  {
    a locala = new a(paramString);
    try
    {
      locala.start();
      locala.join(3000L);
      InetAddress localInetAddress = locala.a();
      return localInetAddress;
    }
    catch (InterruptedException localInterruptedException)
    {
      ac.e();
      return null;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  // ERROR //
  private static byte[] a(Context paramContext, String paramString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 392	cn/jpush/android/util/b:c	(Landroid/content/Context;)Ljava/lang/String;
    //   4: astore 4
    //   6: aload_0
    //   7: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   10: bipush 57
    //   12: aaload
    //   13: invokevirtual 398	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   16: checkcast 400	android/telephony/TelephonyManager
    //   19: astore 5
    //   21: aload 5
    //   23: invokevirtual 403	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   26: astore 14
    //   28: aload 14
    //   30: astore 7
    //   32: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   35: bipush 56
    //   37: aaload
    //   38: astore 8
    //   40: new 218	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 404	java/lang/StringBuilder:<init>	()V
    //   47: aload 8
    //   49: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload 4
    //   54: invokevirtual 225	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: astore 9
    //   62: aload 7
    //   64: invokestatic 410	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   67: invokevirtual 413	java/lang/Integer:intValue	()I
    //   70: istore 13
    //   72: iload 13
    //   74: istore 11
    //   76: sipush 128
    //   79: newarray byte
    //   81: astore 12
    //   83: iconst_2
    //   84: newarray byte
    //   86: dup
    //   87: iconst_0
    //   88: ldc_w 414
    //   91: bastore
    //   92: dup
    //   93: iconst_1
    //   94: ldc_w 415
    //   97: bastore
    //   98: iconst_0
    //   99: aload 12
    //   101: iconst_0
    //   102: iconst_2
    //   103: invokestatic 356	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   106: aload 12
    //   108: aload 9
    //   110: iconst_2
    //   111: invokestatic 420	cn/jpush/b/a/c/a:a	([BLjava/lang/String;I)V
    //   114: aload 12
    //   116: iload 11
    //   118: bipush 34
    //   120: invokestatic 423	cn/jpush/b/a/c/a:a	([BII)V
    //   123: aload 12
    //   125: new 218	java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial 404	java/lang/StringBuilder:<init>	()V
    //   132: ldc2_w 424
    //   135: lload_2
    //   136: land
    //   137: l2i
    //   138: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   141: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 429	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   147: bipush 38
    //   149: invokestatic 423	cn/jpush/b/a/c/a:a	([BII)V
    //   152: aload_1
    //   153: invokevirtual 432	java/lang/String:length	()I
    //   156: bipush 50
    //   158: if_icmple +11 -> 169
    //   161: aload_1
    //   162: iconst_0
    //   163: bipush 49
    //   165: invokevirtual 436	java/lang/String:substring	(II)Ljava/lang/String;
    //   168: astore_1
    //   169: aload 12
    //   171: aload_1
    //   172: bipush 42
    //   174: invokestatic 420	cn/jpush/b/a/c/a:a	([BLjava/lang/String;I)V
    //   177: aload 12
    //   179: getstatic 183	cn/jpush/android/helpers/ConnectingHelper:z	[Ljava/lang/String;
    //   182: iconst_3
    //   183: aaload
    //   184: bipush 92
    //   186: invokestatic 420	cn/jpush/b/a/c/a:a	([BLjava/lang/String;I)V
    //   189: aload 12
    //   191: iconst_0
    //   192: bipush 102
    //   194: invokestatic 423	cn/jpush/b/a/c/a:a	([BII)V
    //   197: aload 12
    //   199: areturn
    //   200: astore 6
    //   202: aload 6
    //   204: invokevirtual 390	java/lang/Exception:printStackTrace	()V
    //   207: ldc_w 294
    //   210: astore 7
    //   212: goto -180 -> 32
    //   215: astore 10
    //   217: iconst_0
    //   218: istore 11
    //   220: goto -144 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   21	28	200	java/lang/Exception
    //   62	72	215	java/lang/Exception
  }

  public static short getIMLoginFlag()
  {
    return 1;
  }

  public static int login(Context paramContext, long paramLong)
  {
    byte[] arrayOfByte = new byte[''];
    long l1 = cn.jpush.android.a.x();
    String str1 = an.b(cn.jpush.android.a.A());
    String str2 = cn.jpush.android.a.E();
    int i = b.c(z[3]);
    ac.c(z[0], z[59] + l1 + z[61] + str2 + z[66] + i);
    long l2 = System.currentTimeMillis();
    short s = getIMLoginFlag();
    new StringBuilder(z[64]).append(l1).append(z[67]).append(s);
    ac.b();
    int j = PushProtocol.LogPush(paramLong, cn.jpush.android.a.n(), arrayOfByte, l1, str1, str2, i, s);
    long l3 = System.currentTimeMillis();
    cn.jpush.b.a.a.j localj;
    int k;
    int m;
    if ((j == 0) || (j == 9999))
    {
      localj = (cn.jpush.b.a.a.j)cn.jpush.b.a.a.e.a(arrayOfByte);
      if (localj == null)
      {
        ac.d(z[0], z[69] + j + z[68]);
        u.a(paramContext, j, l3 - l2, 1);
        return -1;
      }
      localj.toString();
      ac.b();
      k = localj.g;
      if (k == 0)
      {
        int n = localj.a();
        long l4 = 1000L * localj.d();
        cn.jpush.android.a.b(n);
        cn.jpush.android.a.a(l4);
        ac.c(z[0], z[63] + n + z[65] + l4);
        sendServerTimer(paramContext, l4);
        m = 0;
      }
    }
    while (true)
    {
      u.a(paramContext, j, l3 - l2, m);
      if (k != 10000)
        break;
      return -1;
      if (k == 10000)
      {
        ac.d(z[0], z[60] + k + z[62] + localj.h);
        m = 1;
      }
      else
      {
        ac.d(z[0], z[58] + k + z[62] + localj.h);
        m = 0;
        continue;
        m = 1;
        ac.d(z[0], z[69] + j);
        k = 0;
      }
    }
    return j;
  }

  public static boolean openConnection(k paramk, Context paramContext, long paramLong, SisInfo paramSisInfo)
  {
    if (paramSisInfo == null)
      try
      {
        String str2 = cn.jpush.android.a.h();
        int i1 = cn.jpush.android.a.i();
        if (str2 != null)
        {
          ac.b(z[0], z[76] + str2 + z[23] + i1);
          i2 = a(paramk, paramLong, str2, i1);
          if (i2 == 0)
            bool = true;
        }
        while (true)
        {
          return bool;
          if (a(paramk, paramLong) != 0)
            break;
          bool = true;
          continue;
          localObject2 = paramSisInfo.getMainConnIp();
          i = paramSisInfo.getMainConnPort();
          ac.b(z[0], z[75] + (String)localObject2 + z[23] + i);
          if ((localObject2 == null) || (i == 0))
          {
            j = -1;
            ac.d(z[0], z[71]);
          }
          while (j != 0)
          {
            localList = paramSisInfo.getOptionConnIp();
            k = 0;
            localIterator = localList.iterator();
            while (localIterator.hasNext())
            {
              str1 = (String)localIterator.next();
              m = ((Integer)paramSisInfo.getOptionConnPort().get(k)).intValue();
              ac.b(z[0], z[74] + str1 + z[23] + m + z[73] + k);
              n = a(paramk, paramLong, str1, m);
              if (n == 0)
                break label470;
              k++;
              i = m;
              localObject2 = str1;
              j = n;
            }
            j = a(paramk, paramLong, (String)localObject2, i);
          }
          if (j != 0)
            j = a(paramk, paramLong);
          if (j == 0)
          {
            cn.jpush.android.a.a((String)localObject2);
            cn.jpush.android.a.a(i);
            ac.c(z[0], z[77] + (String)localObject2 + z[23] + i);
            bool = true;
          }
          else
          {
            ac.d(z[0], z[72]);
            bool = false;
          }
        }
      }
      finally
      {
      }
    while (true)
    {
      int i2;
      List localList;
      int k;
      Iterator localIterator;
      String str1;
      int m;
      int n;
      boolean bool = false;
      continue;
      label470: int i = m;
      Object localObject2 = str1;
      int j = n;
    }
  }

  public static SisInfo parseSisInfo(String paramString)
  {
    try
    {
      SisInfo localSisInfo = SisInfo.fromJson(paramString);
      if (localSisInfo == null)
      {
        ac.d(z[0], z[48]);
        return null;
      }
      w localw1 = new ab().a(paramString);
      new StringBuilder(z[47]).append(localw1.toString());
      ac.a();
      if ((localw1 instanceof z))
      {
        z localz = localw1.h();
        if (!localz.a(z[50]))
          break label203;
        w localw2 = localz.b(z[50]);
        if ((localw2 instanceof t))
        {
          t localt = localw2.i();
          new StringBuilder(z[45]).append(localt.a());
          ac.a();
          if (localt.a() >= 3)
          {
            String str = localt.a(2).c();
            new StringBuilder(z[49]).append(str);
            ac.b();
            ah.a(str);
          }
        }
      }
      while (true)
      {
        localSisInfo.parseAndSet(paramString);
        if (localSisInfo.isInvalidSis())
          break;
        return localSisInfo;
        ac.e();
      }
    }
    catch (Exception localException)
    {
      ac.d(z[0], z[46] + localException);
    }
    label203: return null;
  }

  public static boolean register(Context paramContext, long paramLong, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[''];
    String str1 = j.a(paramContext);
    String str2 = j.b(paramContext);
    String str3 = b.a(paramContext, z[3]);
    String str4 = b.j(paramContext);
    String str5 = b.i(paramContext);
    String str6 = b.g(paramContext, " ");
    String str7 = b.j(paramContext, " ");
    String str8 = Build.SERIAL;
    if (an.a(str4))
      str4 = " ";
    if (an.a(str5))
      str5 = " ";
    if (an.a(str6))
      str6 = " ";
    if (an.a(str7))
      str7 = " ";
    if ((an.a(str8)) || (z[7].equalsIgnoreCase(str8)))
      str8 = " ";
    cn.jpush.android.a.j(str7);
    cn.jpush.android.a.k(str5);
    cn.jpush.android.a.l(str6);
    String str9 = b.a + z[2] + str4 + z[2] + str7 + z[2] + str5 + z[2] + str6 + z[2] + str8;
    new StringBuilder(z[11]).append(str1).append(z[15]).append(str2).append(z[13]).append(str3).append(z[12]).append(str9);
    ac.b();
    if (PushProtocol.RegPush(paramLong, cn.jpush.android.a.n(), str1, str2, str3, str9) == -991)
      return false;
    int i = PushProtocol.RecvPush(paramLong, arrayOfByte, 30);
    int j;
    if (i > 0)
    {
      i locali = cn.jpush.b.a.a.e.a(arrayOfByte);
      if (locali == null)
      {
        ac.e();
        return false;
      }
      locali.toString();
      ac.b();
      if (locali.e() != 0)
      {
        ac.e();
        return false;
      }
      l locall = (l)locali;
      j = locall.g;
      cn.jpush.android.a.c(paramContext, j);
      if (j == 0)
      {
        long l = locall.a();
        String str13 = locall.d();
        String str14 = locall.h();
        String str15 = locall.i();
        ac.c(z[0], z[10] + l + z[21] + str14 + z[17] + str15);
        new StringBuilder(z[18]).append(str13);
        ac.a();
        if ((an.a(str14)) || (0L == l))
          ac.e(z[0], z[19]);
        b.l(paramContext, str15);
        cn.jpush.android.a.a(l, str13, str14, str15, cn.jpush.android.e.f);
        cn.jpush.android.e.g = l;
        cn.jpush.android.e.h = str13;
        if (!paramBoolean)
          b.a(paramContext, z[5], z[8], str14);
        return true;
      }
      String str10 = locall.h;
      ac.e(z[0], z[6] + j + z[22] + str10);
      String str11 = r.a(j);
      if (str11 != null)
        ac.d(z[0], z[1] + str11);
      if (1006 == j)
        cn.jpush.android.a.r();
    }
    while (true)
    {
      return false;
      if (1007 == j)
      {
        ac.c();
      }
      else if (1005 == j)
      {
        String str12 = z[9] + cn.jpush.android.e.c + z[16] + cn.jpush.android.e.f + z[14];
        b.b(paramContext, str12, str12, -1);
        cn.jpush.android.a.r();
      }
      else if (1009 == j)
      {
        cn.jpush.android.a.r();
      }
      else
      {
        new StringBuilder(z[4]).append(j);
        ac.c();
        continue;
        ac.e(z[0], z[20] + i);
      }
    }
  }

  public static void sendConnectionChanged(Context paramContext, cn.jpush.android.service.a parama)
  {
    ac.b(z[0], z[51]);
    if (parama == cn.jpush.android.a.a(paramContext))
    {
      new StringBuilder(z[53]).append(parama);
      ac.a();
      return;
    }
    cn.jpush.android.a.a(paramContext, parama);
    Bundle localBundle = new Bundle();
    String str = z[54];
    boolean bool1 = parama.name().equals(z[55]);
    boolean bool2 = false;
    if (bool1)
      bool2 = true;
    localBundle.putBoolean(str, bool2);
    b.a(paramContext, z[52], localBundle);
  }

  public static void sendConnectionToHandler(Message paramMessage, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong(z[70], paramLong);
    paramMessage.setData(localBundle);
    paramMessage.sendToTarget();
  }

  public static void sendServerTimer(Context paramContext, long paramLong)
  {
    ac.b(z[0], z[42]);
    try
    {
      Bundle localBundle = new Bundle();
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(z[40], paramLong);
      localJSONObject.put(z[44], System.currentTimeMillis());
      localBundle.putString(z[39], localJSONObject.toString());
      b.a(paramContext, z[41], localBundle);
      return;
    }
    catch (JSONException localJSONException)
    {
      new StringBuilder(z[43]).append(localJSONException.getMessage());
      ac.d();
    }
  }

  public static SisInfo sendSis(Context paramContext)
  {
    try
    {
      SisInfo localSisInfo = a(paramContext, false, 0, 19000);
      return localSisInfo;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.ConnectingHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */