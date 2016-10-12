package cn.jpush.android.service;

import android.text.TextUtils;
import cn.jpush.android.a;
import cn.jpush.android.util.ac;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
{
  private static final HashMap<Integer, String> a;
  private static final HashMap<Integer, String> b;
  private static long c = 0L;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[9];
    int i = 0;
    String str1 = "\036/\027\020N</\\\033S9.\016^B$%\031^\fk";
    int j = -1;
    Object localObject2 = localObject1;
    int i10;
    label133: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int k = localObject3.length;
      int m = 0;
      if (k <= 1);
      while (k > m)
      {
        Object localObject7 = localObject3;
        int i7 = m;
        int i8 = k;
        Object localObject8 = localObject3;
        while (true)
        {
          int i9 = localObject8[m];
          switch (i7 % 5)
          {
          default:
            i10 = 33;
            localObject8[m] = (char)(i10 ^ i9);
            m = i7 + 1;
            if (i8 != 0)
              break label133;
            localObject8 = localObject7;
            i7 = m;
            m = i8;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        k = i8;
        localObject3 = localObject7;
      }
      str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "*1\f!@/%#\fL=";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\"5\025\023D";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "?8\f\033";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "*1\f\027E";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "*\"\b\027N%";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "*%\030";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "9,\n";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\036/\027\020N</\\\fD;.\016\n\001(.\030\033\001fa";
        j = 7;
        localObject1 = localObject2;
      case 7:
      }
    }
    localObject1[i] = str2;
    z = localObject2;
    HashMap localHashMap = new HashMap();
    a = localHashMap;
    Integer localInteger = Integer.valueOf(0);
    String str3 = "\004\n";
    int n = -1;
    label431: label569: String str4;
    while (true)
    {
      Object localObject4 = str3.toCharArray();
      int i1 = localObject4.length;
      int i2 = 0;
      if (i1 <= 1);
      while (i1 > i2)
      {
        Object localObject5 = localObject4;
        int i3 = i2;
        int i4 = i1;
        Object localObject6 = localObject4;
        int i5 = localObject6[i2];
        int i6;
        switch (i3 % 5)
        {
        default:
          i6 = 33;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          localObject6[i2] = (char)(i6 ^ i5);
          i2 = i3 + 1;
          if (i4 != 0)
            break label569;
          localObject6 = localObject5;
          i3 = i2;
          i2 = i4;
          break label431;
          i10 = 75;
          break;
          i10 = 65;
          break;
          i10 = 124;
          break;
          i10 = 126;
          break;
          i6 = 75;
          continue;
          i6 = 65;
          continue;
          i6 = 124;
          continue;
          i6 = 126;
        }
        i1 = i4;
        localObject4 = localObject5;
      }
      str4 = new String((char[])localObject4).intern();
      switch (n)
      {
      default:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-1001);
        str3 = "\0169\037\033D/a\036\013G-$\016^R\";\031P\001\033-\031\037R.a\037\021O? \037\n\00184\f\016N95R";
        n = 0;
        break;
      case 0:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-1000);
        str3 = "\b.\022\020D(5\025\021Ok'\035\027M.%R^q'$\035\rDk\"\024\033B a\005\021T9a\037\021O%$\037\nH$/\\\037O/a\016\033U98\\\022@?$\016_";
        n = 1;
        break;
      case 1:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-998);
        str3 = "\030$\022\032H%&\\\030@\"-\031\032\001$3\\\nH&$\023\013Uea,\022D*2\031^s.5\016\007\001' \b\033Sj";
        n = 2;
        break;
      case 2:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-997);
        str3 = "\031$\037\033H=(\022\031\001- \025\022D/a\023\f\001?(\021\033N>5R^q'$\035\rDk\023\031\nS2a\020\037U.3]";
        n = 3;
        break;
      case 3:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-996);
        str3 = "\b.\022\020D(5\025\021Ok(\017^B'.\017\033Eea,\022D*2\031^s.5\016\007\001' \b\033Sj";
        n = 4;
        break;
      case 4:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-994);
        str3 = "\031$\017\016N%2\031^U\",\031\021T?o\\.M. \017\033\001\031$\b\fXk-\035\nD9`";
        n = 5;
        break;
      case 5:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(-993);
        str3 = "";
        n = 6;
        break;
      case 6:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(11);
        str3 = "\r \025\022D/a\b\021\0019$\033\027R?$\016_";
        n = 7;
        break;
      case 7:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(1005);
        str3 = "\022.\t\f\001*1\f5D2a\035\020Ek \022\032S$(\030^Q*\"\027\037F.a\022\037L.a\035\fDk/\023\n\001& \b\035I.%R^q'$\035\rDk%\023\013C'$\\\035I.\"\027^U#$\021^@(\"\023\fE\"/\033^U$a=\016Q'(\037\037U\".\022^X$4\\\035S. \b\033Ek.\022^q$3\b\037Me";
        n = 8;
        break;
      case 8:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(1006);
        str3 = "\022.\t^@%%\016\021H/a\f\037B  \033\033\001% \021\033\001\"2\\\020N?a\031\006H85P^q'$\035\rDk3\031\031H85\031\f\0012.\t\f\001; \037\037J,$\\\020@&$\\\027Ok\021\023\fU*-R";
        n = 9;
        break;
      case 9:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(1007);
        str3 = "\002/\n\037M\"%\\7L.(P^s.&\025\rU.3\\\037F*(\022P";
        n = 10;
        break;
      case 10:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(1009);
        str3 = "\022.\t\f\001*1\f5D2a\025\r\0019$\020\037U.%\\\nNk \\\020N%l=\020E9.\025\032\001\n1\fPq'$\035\rDk4\017\033\0012.\t\f\001\n/\030\fN\"%\\?Q;f\017^@;17\033Xga\023\f\001*%\030^@%a=\020E9.\025\032\001*1\f^G$3\\\nI\"2\\\037Q;\n\031\007\017";
        n = 11;
        break;
      case 11:
        localHashMap.put(localInteger, str4);
        localHashMap = a;
        localInteger = Integer.valueOf(10000);
        str3 = "\031$\037\033H=$\016^E*5\035^Q*3\017\033\001.3\016\021S";
        n = 12;
        break;
      case 12:
        localHashMap.put(localInteger, str4);
        localHashMap = new HashMap();
        b = localHashMap;
        localInteger = Integer.valueOf(995);
        str3 = "\006$\017\r@,$\\4r\004\017\\\016@92\025\020Fk2\t\035B.$\030";
        n = 13;
        break;
      case 13:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(996);
        str3 = "\006$\017\r@,$\\4r\004\017\\\016@92\025\020Fk'\035\027M.%";
        n = 14;
        break;
      case 14:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(997);
        str3 = "\006$\017\r@,$\\\037M9$\035\032Xk3\031\035D\"7\031\032\rk&\025\bDk4\f";
        n = 15;
        break;
      case 15:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(998);
        str3 = "\006$\017\r@,$\\\037M9$\035\032Xk3\031\035D\"7\031\032\rk2\b\027M'a\f\fN($\017\r";
        n = 16;
        break;
      case 16:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1000);
        str3 = "\0362\031\f\001(-\025\035J.%\\\037O/a\023\016D%$\030^U#$\\3D82\035\031D";
        n = 17;
        break;
      case 17:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1001);
        str3 = "\006$\017\r@,$\\\032N</\020\021@/a\017\013B($\031\032";
        n = 18;
        break;
      case 18:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1002);
        str3 = "\006$\017\r@,$\\\fD($\025\bD/a\017\013B($\031\032";
        n = 19;
        break;
      case 19:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1003);
        str3 = "\006$\017\r@,$\\\rH'$\022\035Dk%\023\tO'.\035\032\00184\037\035D.%";
        n = 20;
        break;
      case 20:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1004);
        str3 = "\035(\030\033Nk2\025\022D%\"\031^E$6\022\022@$%\\\rT(\"\031\033E";
        n = 21;
        break;
      case 21:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1005);
        str3 = "\0362\031\f\001(-\025\035J.%\\\bH/$\023^@%%\\\024T&1\031\032\001?.\\\013S'a1\033R8 \033\033\001c#\016\021V8$\016W";
        n = 22;
        break;
      case 22:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1008);
        str3 = "\035(\030\033Nk(\017^G$3\037\033\001(-\023\rD/a\036\007\001>2\031\f";
        n = 23;
        break;
      case 23:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1007);
        str3 = "";
        n = 24;
        break;
      case 24:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1006);
        str3 = "\0362\031\f\001(-\025\035J.%\\Yb*/\037\033Ml";
        n = 25;
        break;
      case 25:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1011);
        str3 = "\017.\013\020M$ \030^G*(\020\033E";
        n = 26;
        break;
      case 26:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1012);
        str3 = "\0362\031\f\001(-\025\035J.%\\\nNk%\023\tO'.\035\032\001*&\035\027O";
        n = 27;
        break;
      case 27:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1013);
        str3 = "\037)\031^G\"-\031^@'3\031\037E2a\031\006H85\\\037O/a\017\037L.a\017\027[.o\\:N%f\b^E$6\022\022N*%\\\037F*(\022P";
        n = 28;
        break;
      case 28:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1100);
        str3 = "\002/\n\037M\"%\\\016@9 \021^N9a\t\020D31\031\035U.%\\\fD84\020\n\017";
        n = 29;
        break;
      case 29:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1014);
        str3 = "\r \025\022D/a\b\021\001;3\031\022N*%\\\fD:4\025\fD/a\016\033R$4\016\035D";
        n = 30;
        break;
      case 30:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1015);
        str3 = "\0362\031\f\001(-\025\035J.%\\\027O85\035\022Mk \020\033S?a\023\020\00185\035\nT8a\036\037Sk \032\nD9a\030\021V%-\023\037E\"/\033^G\"/\025\rI.%R";
        n = 31;
        break;
      case 31:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1016);
        str3 = "\0362\031\f\001(-\025\035J.%\\\nI.a\013\033C=(\031\t\0068a\t\fM";
        n = 32;
        break;
      case 32:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1017);
        str3 = "\0362\031\f\001(-\025\035J.%\\\035@'-\\\037B?(\023\020";
        n = 33;
        break;
      case 33:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1018);
        str3 = "\037)\031^l.2\017\037F.a\017\026N<a\025\020\001?)\031^R? \b\013Rk#\035\f";
        n = 34;
        break;
      case 34:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1019);
        str3 = "\b-\025\035Jk \f\016M\"2\b^@%%\\\rI$6\\\nI.a1\033R8 \033\033";
        n = 35;
        break;
      case 35:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1020);
        str3 = "\017.\013\020\001\",\035\031Dk'\035\027M.%";
        n = 36;
        break;
      case 36:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1021);
        str3 = "\017.\013\020\001#5\021\022\001- \025\022D/";
        n = 37;
        break;
      case 37:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1022);
        str3 = "\017.\013\020\001\006$\017\r@,$\\\030@\"-\031\032";
        n = 38;
        break;
      case 38:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1030);
        str3 = "\017(\017\035@9%\\\nI.a\021\033R8 \033\033\001)$\037\037T8$\\\027Uk(\017^O$5\\\027Ok5\024\033\001;4\017\026\001?(\021\033";
        n = 39;
        break;
      case 39:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1031);
        str3 = "\0305\023\016\001;4\017\026\0018$\016\bH($";
        n = 40;
        break;
      case 40:
        localHashMap.put(localInteger, str4);
        localHashMap = b;
        localInteger = Integer.valueOf(1032);
        str3 = "\031$\017\013L.a\f\013R#a\017\033S=(\037\033";
        n = 41;
      case 41:
      }
    }
    localHashMap.put(localInteger, str4);
  }

  public static String a(int paramInt)
  {
    if (!a.containsKey(Integer.valueOf(paramInt)))
    {
      new StringBuilder(z[0]).append(paramInt);
      ac.b();
      return null;
    }
    return (String)a.get(Integer.valueOf(paramInt));
  }

  public static JSONObject a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(z[5], z[6]);
      localJSONObject.put(z[4], paramString);
      localJSONObject.put(z[2], a.m());
      localJSONObject.put(z[3], z[1]);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public static String b(int paramInt)
  {
    if (!b.containsKey(Integer.valueOf(paramInt)))
    {
      new StringBuilder(z[8]).append(paramInt);
      ac.b();
      return "";
    }
    return (String)b.get(Integer.valueOf(paramInt));
  }

  public static JSONObject b(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return null;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put(z[5], z[7]);
      localJSONObject.put(z[4], paramString);
      localJSONObject.put(z[2], a.m());
      localJSONObject.put(z[3], z[1]);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */