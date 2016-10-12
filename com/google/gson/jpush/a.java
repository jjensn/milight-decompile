package com.google.gson.jpush;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

final class a
  implements ae<Date>, v<Date>
{
  private static final String[] z;
  private final DateFormat a;
  private final DateFormat b;
  private final DateFormat c;

  static
  {
    String[] arrayOfString1 = new String[4];
    String str1 = "";
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
          i3 = 51;
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
        str1 = " -}\023W\0251}\023@\034*m_WT'}\023RT6lAZ\032\"8ER\0300}";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "\r<aJ\0369\b5WWS\021?{{N(u\t@\007bB\024";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        j = 3;
        arrayOfString2 = arrayOfString1;
        str1 = "!\021[";
        i = 2;
        break;
      case 2:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 116;
        break label96;
        i3 = 69;
        break label96;
        i3 = 24;
        break label96;
        i3 = 51;
        break label96;
        m = 0;
      }
    }
  }

  a()
  {
    this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
  }

  public a(int paramInt1, int paramInt2)
  {
    this(DateFormat.getDateTimeInstance(paramInt1, paramInt2, Locale.US), DateFormat.getDateTimeInstance(paramInt1, paramInt2));
  }

  a(String paramString)
  {
    this(new SimpleDateFormat(paramString, Locale.US), new SimpleDateFormat(paramString));
  }

  private a(DateFormat paramDateFormat1, DateFormat paramDateFormat2)
  {
    this.a = paramDateFormat1;
    this.b = paramDateFormat2;
    this.c = new SimpleDateFormat(z[2], Locale.US);
    this.c.setTimeZone(TimeZone.getTimeZone(z[3]));
  }

  private w a(Date paramDate)
  {
    synchronized (this.b)
    {
      ac localac = new ac(this.a.format(paramDate));
      return localac;
    }
  }

  private Date a(w paramw)
  {
    synchronized (this.b)
    {
      try
      {
        Date localDate3 = this.b.parse(paramw.c());
        return localDate3;
      }
      catch (ParseException localParseException1)
      {
        try
        {
          Date localDate2 = this.a.parse(paramw.c());
          return localDate2;
          localObject = finally;
          throw localObject;
        }
        catch (ParseException localParseException2)
        {
          try
          {
            Date localDate1 = this.c.parse(paramw.c());
            return localDate1;
          }
          catch (ParseException localParseException3)
          {
            throw new af(paramw.c(), localParseException3);
          }
        }
      }
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append((char)'(').append(this.b.getClass().getSimpleName()).append((char)')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */