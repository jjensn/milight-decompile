package cn.jpush.android.service;

import cn.jpush.android.a;
import cn.jpush.android.util.ac;
import com.google.gson.jpush.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SisInfo
{
  private static Pattern IPV4_PATTERN;
  private static final String IPV4_REGEX;
  private static final String TAG;
  private static final k _gson;
  private static final String[] z;
  boolean invalidSis = false;
  List<String> ips;
  String mainConnIp;
  int mainConnPort;
  List<String> op_conns;
  List<String> optionConnIp = new ArrayList();
  List<Integer> optionConnPort = new ArrayList();
  String originSis;
  List<String> ssl_ips;
  List<String> ssl_op_conns;
  List<String> udp_report;
  String user;

  static
  {
    Object localObject1 = new String[7];
    int i = 0;
    String str1 = "IM\033,5|K";
    int j = 6;
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
        i3 = 91;
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
        TAG = str2;
        str1 = "";
        j = 7;
        break;
        IPV4_REGEX = str2;
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
      case 6:
      case 7:
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
        str1 = "\\E\001\t>~\004\034\n{jE\032\026>:M\030\026v+\004EE6{M\006E2j\n";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\\E\001\t>~\004\034\n{jE\032\026>:K\030:8uJ\006Ev:";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "TKH\027>jK\032\021{xE\013\016.j\004\001\025u";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "UJ\004\034{wE\001\013{sTH\f5:W\001\026u";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\\E\001\t>~\004\034\n{jE\032\026>:M\030\026v(\004EE?B\t\0207n\004\001\025u";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        z = localObject2;
        _gson = new k();
        IPV4_PATTERN = Pattern.compile(IPV4_REGEX);
        return;
        i3 = 26;
        continue;
        i3 = 36;
        continue;
        i3 = 104;
        continue;
        i3 = 101;
      }
    }
  }

  public SisInfo()
  {
  }

  public static SisInfo fromJson(String paramString)
  {
    return (SisInfo)_gson.a(paramString, SisInfo.class);
  }

  public static boolean isValidIPV4(String paramString)
  {
    return IPV4_PATTERN.matcher(paramString).matches();
  }

  public void configure()
  {
    int i = this.ips.size();
    if (i == 0);
    while (true)
    {
      return;
      a.f(this.originSis);
      if (i > 1)
        try
        {
          q localq = new q((String)this.ips.get(1));
          a.c(localq.a);
          a.c(localq.b);
          if (i > 2)
          {
            a.d((String)this.ips.get(2));
            if (this.user == null)
              continue;
            a.e(this.user);
          }
        }
        catch (Exception localException)
        {
          while (true)
            ac.a(TAG, z[6], localException);
        }
    }
    while (true)
    {
      ac.d(TAG, z[5]);
      break;
      ac.d(TAG, z[4]);
    }
  }

  public String getMainConnIp()
  {
    return this.mainConnIp;
  }

  public int getMainConnPort()
  {
    return this.mainConnPort;
  }

  public List<String> getOptionConnIp()
  {
    return this.optionConnIp;
  }

  public List<Integer> getOptionConnPort()
  {
    return this.optionConnPort;
  }

  public String getOriginSis()
  {
    return this.originSis;
  }

  public boolean isInvalidSis()
  {
    return this.invalidSis;
  }

  public void parseAndSet(String paramString)
  {
    this.originSis = paramString;
    if (this.ips == null)
    {
      ac.e(TAG, z[1]);
      this.invalidSis = true;
    }
    while (true)
    {
      return;
      if (this.ips.size() == 0)
      {
        ac.e(TAG, z[0]);
        this.invalidSis = true;
        return;
      }
      try
      {
        q localq1 = new q((String)this.ips.get(0));
        this.mainConnIp = localq1.a;
        this.mainConnPort = localq1.b;
        if (this.op_conns == null)
        {
          ac.b();
          return;
        }
      }
      catch (Exception localException1)
      {
        ac.a(TAG, z[2], localException1);
        this.invalidSis = true;
        return;
      }
      Iterator localIterator = this.op_conns.iterator();
      String str;
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        try
        {
          q localq2 = new q(str);
          this.optionConnIp.add(localq2.a);
          this.optionConnPort.add(Integer.valueOf(localq2.b));
        }
        catch (Exception localException2)
        {
          new StringBuilder(z[3]).append(str);
          ac.i();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.SisInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */