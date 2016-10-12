package cn.jpush.android.helpers;

import cn.jpush.android.util.ac;
import java.net.InetAddress;
import java.net.UnknownHostException;

final class a extends Thread
{
  private static final String[] z;
  private String a = null;
  private InetAddress b = null;

  static
  {
    String[] arrayOfString1 = new String[5];
    String str1 = "J,DQ\026n,S\036>V\032\027X\033q%\027X\bw$\027V\025k=\r\036";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 122;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "[&YP\037{=^P\035P,[N\037j";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "j,DQ\026n,S\036>V\032\027\023Zp&DJ@";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        str1 = "M'\\P\025o'\027V\025k=\027[\002{,GJ\023w'\026";
        j = 3;
        arrayOfString2 = arrayOfString1;
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        j = 4;
        arrayOfString2 = arrayOfString1;
        str1 = "L!R\036\034y [K\b}iVN\n}(EMZl&\027V\033n,\027\\\037}'\027_Zt(TUZw/\027w4L\fep?Li\026";
        i = 3;
        break;
      case 3:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 24;
        break label96;
        i3 = 73;
        break label96;
        i3 = 55;
        break label96;
        i3 = 62;
        break label96;
        m = 0;
      }
    }
  }

  public a(String paramString)
  {
    this.a = paramString;
  }

  public final InetAddress a()
  {
    try
    {
      if (this.b != null);
      for (InetAddress localInetAddress = this.b; ; localInetAddress = null)
      {
        return localInetAddress;
        new StringBuilder(z[0]).append(this.a);
        ac.d();
      }
    }
    finally
    {
    }
  }

  public final void run()
  {
    try
    {
      new StringBuilder(z[2]).append(this.a);
      ac.c();
      this.b = InetAddress.getByName(this.a);
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      ac.a(z[1], z[3], localUnknownHostException);
      return;
    }
    catch (Exception localException)
    {
      ac.a(z[1], z[4], localException);
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */