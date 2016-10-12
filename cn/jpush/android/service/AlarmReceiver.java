package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cn.jpush.android.e;
import cn.jpush.android.util.ac;

public class AlarmReceiver extends BroadcastReceiver
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "N^^\\KXC\030\030ZCT\002YRI\036\031XOH^\004\030iys";
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
          i3 = 59;
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
        str1 = "B^\"SXHY\006S\033':";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "_D\023i_H\\\021O";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "l\\\021DVU\023SR[U\002";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 45;
        break label96;
        i3 = 48;
        break label96;
        i3 = 112;
        break label96;
        i3 = 54;
        break label96;
        m = 0;
      }
    }
  }

  public AlarmReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    ac.b(z[3], z[1]);
    if (!e.a(paramContext.getApplicationContext()))
      return;
    if (ServiceInterface.e(paramContext))
    {
      ServiceInterface.b(paramContext, false);
      return;
    }
    try
    {
      Intent localIntent = new Intent(paramContext, PushService.class);
      localIntent.setAction(z[0]);
      localIntent.putExtra(z[2], 0);
      paramContext.startService(localIntent);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      localSecurityException.printStackTrace();
      ac.b();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      ac.b();
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.AlarmReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */