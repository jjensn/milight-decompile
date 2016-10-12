package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.af;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.b.d;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class e extends al<Date>
{
  public static final am a;
  private static final String[] z;
  private final DateFormat b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
  private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
  private final DateFormat d;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "u,j";
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
          i3 = 114;
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
        str1 = "Y\001P__m5\004B\026\007,\016n:\032\025D\034\001S_s\001";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new f();
        return;
        i3 = 32;
        break label96;
        i3 = 120;
        break label96;
        i3 = 41;
        break label96;
        i3 = 38;
        break label96;
        m = 0;
      }
    }
  }

  public e()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(z[1], Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone(z[0]));
    this.d = localSimpleDateFormat;
  }

  private Date a(String paramString)
  {
    try
    {
      Date localDate3 = this.c.parse(paramString);
      localObject2 = localDate3;
      return localObject2;
    }
    catch (ParseException localParseException1)
    {
      try
      {
        Date localDate2 = this.b.parse(paramString);
        localObject2 = localDate2;
      }
      catch (ParseException localParseException2)
      {
        try
        {
          Date localDate1 = this.d.parse(paramString);
          Object localObject2 = localDate1;
        }
        catch (ParseException localParseException3)
        {
          throw new af(paramString, localParseException3);
        }
      }
    }
    finally
    {
    }
  }

  private void a(d paramd, Date paramDate)
  {
    if (paramDate == null)
      try
      {
        paramd.f();
        while (true)
        {
          return;
          paramd.b(this.b.format(paramDate));
        }
      }
      finally
      {
      }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */