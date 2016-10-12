package cn.jpush.android.a;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import cn.jpush.android.util.ac;

public final class g
{
  private static final String[] z;
  public double a;
  public double b;
  private Context c;
  private LocationManager d;
  private Location e;
  private String f;
  private long g;
  private final LocationListener h = new h(this);

  static
  {
    String[] arrayOfString1 = new String[5];
    String str1 = "c#CRH-";
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
          i3 = 39;
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
        str1 = "}'DVN{#";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "j6D";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        str1 = "a)TDSd)Y";
        j = 3;
        arrayOfString2 = arrayOfString1;
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        j = 4;
        arrayOfString2 = arrayOfString1;
        str1 = "vd[DS/|\022C\013/*YB\0057cQ\t\005l*C\007\035( \033\007Eh'E\007\035( \033\007Fn%\025\037\002k;";
        i = 3;
        break;
      case 3:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 13;
        break label96;
        i3 = 70;
        break label96;
        i3 = 55;
        break label96;
        i3 = 37;
        break label96;
        m = 0;
      }
    }
  }

  public g(Context paramContext)
  {
    this.c = paramContext;
    String str = z[3];
    this.d = ((LocationManager)this.c.getSystemService(str));
  }

  private void a(Location paramLocation)
  {
    if (paramLocation != null)
      try
      {
        this.a = paramLocation.getLatitude();
        this.b = paramLocation.getLongitude();
        this.g = System.currentTimeMillis();
        String str = z[4];
        Object[] arrayOfObject = new Object[5];
        arrayOfObject[0] = Double.valueOf(this.a);
        arrayOfObject[1] = Double.valueOf(this.b);
        arrayOfObject[2] = Double.valueOf(paramLocation.getAltitude());
        arrayOfObject[3] = Float.valueOf(paramLocation.getBearing());
        arrayOfObject[4] = Float.valueOf(paramLocation.getAccuracy());
        this.f = String.format(str, arrayOfObject);
        return;
      }
      catch (Exception localException)
      {
        localException.getMessage();
        ac.e();
      }
    this.f = "";
  }

  public final boolean a()
  {
    try
    {
      LocationManager localLocationManager = this.d;
      boolean bool1 = false;
      if (localLocationManager != null)
        if ((!this.d.isProviderEnabled(z[2])) && (!this.d.isProviderEnabled(z[0])))
        {
          boolean bool2 = this.d.isProviderEnabled(z[1]);
          bool1 = false;
          if (!bool2);
        }
        else
        {
          bool1 = true;
        }
      return bool1;
    }
    catch (SecurityException localSecurityException)
    {
      ac.d();
      return false;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      ac.d();
    }
    return false;
  }

  public final void b()
  {
    try
    {
      Criteria localCriteria = new Criteria();
      localCriteria.setAccuracy(1);
      localCriteria.setAltitudeRequired(false);
      localCriteria.setBearingRequired(false);
      localCriteria.setCostAllowed(true);
      localCriteria.setPowerRequirement(1);
      String str = this.d.getBestProvider(localCriteria, true);
      if (str != null)
      {
        this.e = this.d.getLastKnownLocation(str);
        if (this.e != null)
          a(this.e);
        this.d.requestLocationUpdates(str, 2000L, 10.0F, this.h);
      }
      return;
    }
    catch (SecurityException localSecurityException)
    {
      ac.d();
      return;
    }
    catch (Exception localException)
    {
      ac.d();
    }
  }

  public final void c()
  {
    try
    {
      if (this.h != null)
      {
        this.d.removeUpdates(this.h);
        return;
      }
      ac.d();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public final String d()
  {
    return this.f;
  }

  public final long e()
  {
    return this.g;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */