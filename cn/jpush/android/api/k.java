package cn.jpush.android.api;

import android.app.Application;
import java.util.HashMap;

public final class k
{
  public static boolean a;
  private static boolean b = true;
  private static String c = new String((char[])localObject1).intern();
  private static HashMap<String, Integer> d = new HashMap();
  private static String e = null;
  private static String f = null;
  private static String g = null;

  static
  {
    a = false;
    Object localObject1 = "诊團惟殂世|S\003$JTD\016盉SSb\022>IPU_d咰R^',INU_d皸NE\007(N\025\031呹豎甔盅元纨诬斅注Ｊ=\035INX>#HXB\021,_X\036\030#nXC\002 Y\025\031W品\034w`\002>Tt^\003(N[Q\024(\022R^',INU_d".toCharArray();
    int i = localObject1.length;
    int j = 0;
    if (i <= 1);
    label140: 
    while (i > j)
    {
      Object localObject2 = localObject1;
      int k = j;
      int m = i;
      Object localObject3 = localObject1;
      int n = localObject3[j];
      int i1;
      switch (k % 5)
      {
      default:
        i1 = 60;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        localObject3[j] = (char)(i1 ^ n);
        j = k + 1;
        if (m != 0)
          break label140;
        localObject3 = localObject2;
        k = j;
        j = m;
        break;
        i1 = 61;
        continue;
        i1 = 48;
        continue;
        i1 = 119;
        continue;
        i1 = 77;
      }
      i = m;
      localObject1 = localObject2;
    }
  }

  public static void a(Application paramApplication)
  {
    l locall = new l();
    paramApplication.unregisterActivityLifecycleCallbacks(locall);
    paramApplication.registerActivityLifecycleCallbacks(locall);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */