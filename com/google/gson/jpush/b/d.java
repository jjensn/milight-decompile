package com.google.gson.jpush.b;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class d
  implements Closeable, Flushable
{
  private static final String[] a;
  private static final String[] b;
  private static final String[] z;
  private final Writer c;
  private int[] d = new int[32];
  private int e = 0;
  private String f;
  private String g;
  private boolean h;
  private boolean i;
  private String j;
  private boolean k;

  static
  {
    Object localObject1 = new String[18];
    int m = 0;
    String str1 = "475\013";
    int n = -1;
    Object localObject2 = localObject1;
    int i15;
    label133: String str2;
    while (true)
    {
      Object localObject3 = str1.toCharArray();
      int i1 = localObject3.length;
      int i2 = 0;
      if (i1 <= 1);
      while (i1 > i2)
      {
        Object localObject8 = localObject3;
        int i12 = i2;
        int i13 = i1;
        Object localObject9 = localObject3;
        while (true)
        {
          int i14 = localObject9[i2];
          switch (i12 % 5)
          {
          default:
            i15 = 118;
            localObject9[i2] = (char)(i15 ^ i14);
            i2 = i12 + 1;
            if (i13 != 0)
              break label133;
            localObject9 = localObject8;
            i12 = i2;
            i2 = i13;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
        i1 = i13;
        localObject3 = localObject8;
      }
      str2 = new String((char[])localObject3).intern();
      switch (n)
      {
      default:
        localObject1[m] = str2;
        m = 1;
        str1 = "\024'*\023\0374%y\027\0045 5\002\033t";
        localObject1 = localObject2;
        n = 0;
        break;
      case 0:
        localObject1[m] = str2;
        m = 2;
        str1 = "";
        n = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[m] = str2;
        m = 3;
        str1 = "\020\021\026)V77*\023V)68\025\002z50\023\036z#7G\027(08\036V50y\006\030z-;\r\02396w";
        n = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[m] = str2;
        m = 4;
        str1 = "\02016\t!(+-\002\004z+*G\0256-*\002\022t";
        n = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[m] = str2;
        m = 5;
        str1 = "";
        n = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[m] = str2;
        m = 6;
        str1 = "\023,:\b\033*.<\023\023z&6\004\0037'7\023";
        n = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[m] = str2;
        m = 7;
        str1 = "w\0137\001\0374+-\036";
        n = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[m] = str2;
        m = 8;
        str1 = "\02474\002\0043!y\021\02767<\024V77*\023V8'y\001\0374+-\002Zz ,\023V-#*G";
        n = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[m] = str2;
        m = 9;
        str1 = "\023,?\016\03036 ";
        n = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[m] = str2;
        m = 10;
        str1 = "\024#\027";
        n = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[m] = str2;
        m = 11;
        str1 = "`b";
        n = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[m] = str2;
        m = 12;
        str1 = ".0,\002";
        n = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[m] = str2;
        m = 13;
        str1 = "<#5\024\023";
        n = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[m] = str2;
        m = 14;
        str1 = "57-GKgb7\022\0326";
        n = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[m] = str2;
        m = 15;
        str1 = "\0067kWDc";
        n = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[m] = str2;
        m = 16;
        str1 = "\0067kWDb";
        n = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[m] = str2;
        m = 17;
        str1 = "4#4\002Vgy\t\0036.";
        n = 16;
        localObject1 = localObject2;
      case 16:
      }
    }
    localObject1[m] = str2;
    z = localObject2;
    a = new String[''];
    int i3 = 0;
    String str3;
    int i5;
    Object localObject4;
    int i4;
    if (i3 <= 31)
    {
      String[] arrayOfString2 = a;
      str3 = "\0067|WB\"";
      i5 = -1;
      localObject4 = arrayOfString2;
      i4 = i3;
    }
    label659: label797: String str4;
    while (true)
    {
      Object localObject5 = str3.toCharArray();
      int i6 = localObject5.length;
      int i7 = 0;
      if (i6 <= 1);
      while (i6 > i7)
      {
        Object localObject6 = localObject5;
        int i8 = i7;
        int i9 = i6;
        Object localObject7 = localObject5;
        int i10 = localObject7[i7];
        int i11;
        switch (i8 % 5)
        {
        default:
          i11 = 118;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          localObject7[i7] = (char)(i11 ^ i10);
          i7 = i8 + 1;
          if (i9 != 0)
            break label797;
          localObject7 = localObject6;
          i8 = i7;
          i7 = i9;
          break label659;
          i15 = 90;
          break;
          i15 = 66;
          break;
          i15 = 89;
          break;
          i15 = 103;
          break;
          i11 = 90;
          continue;
          i11 = 66;
          continue;
          i11 = 89;
          continue;
          i11 = 103;
        }
        i6 = i9;
        localObject5 = localObject6;
      }
      str4 = new String((char[])localObject5).intern();
      switch (i5)
      {
      default:
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i3);
        localObject4[i4] = String.format(str4, arrayOfObject);
        i3++;
        break;
        localObject4 = a;
        i4 = 34;
        str3 = "\006`";
        i5 = 0;
        break;
      case 0:
        localObject4[i4] = str4;
        localObject4 = a;
        i4 = 92;
        str3 = "\006\036";
        i5 = 1;
        break;
      case 1:
        localObject4[i4] = str4;
        localObject4 = a;
        i4 = 9;
        str3 = "\0066";
        i5 = 2;
        break;
      case 2:
        localObject4[i4] = str4;
        localObject4 = a;
        i4 = 8;
        str3 = "\006 ";
        i5 = 3;
        break;
      case 3:
        localObject4[i4] = str4;
        localObject4 = a;
        i4 = 10;
        str3 = "\006,";
        i5 = 4;
        break;
      case 4:
        localObject4[i4] = str4;
        localObject4 = a;
        i4 = 13;
        str3 = "\0060";
        i5 = 5;
        break;
      case 5:
        localObject4[i4] = str4;
        localObject4 = a;
        i4 = 12;
        str3 = "\006$";
        i5 = 6;
        break;
      case 6:
        localObject4[i4] = str4;
        String[] arrayOfString1 = (String[])a.clone();
        b = arrayOfString1;
        str3 = "\0067iWE9";
        i4 = 60;
        localObject4 = arrayOfString1;
        i5 = 7;
        break;
      case 7:
        localObject4[i4] = str4;
        localObject4 = b;
        i4 = 62;
        str3 = "\0067iWE?";
        i5 = 8;
        break;
      case 8:
        localObject4[i4] = str4;
        localObject4 = b;
        i4 = 38;
        str3 = "\0067iWDl";
        i5 = 9;
        break;
      case 9:
        localObject4[i4] = str4;
        localObject4 = b;
        i4 = 61;
        str3 = "\0067iWE>";
        i5 = 10;
        break;
      case 10:
        localObject4[i4] = str4;
        localObject4 = b;
        i4 = 39;
        str3 = "\0067iWDm";
        i5 = 11;
      case 11:
      }
    }
    localObject4[i4] = str4;
  }

  public d(Writer paramWriter)
  {
    a(6);
    this.g = ":";
    this.k = true;
    if (paramWriter == null)
      throw new NullPointerException(z[14]);
    this.c = paramWriter;
  }

  private int a()
  {
    if (this.e == 0)
      throw new IllegalStateException(z[4]);
    return this.d[(-1 + this.e)];
  }

  private d a(int paramInt1, int paramInt2, String paramString)
  {
    int m = a();
    if ((m != paramInt2) && (m != paramInt1))
      throw new IllegalStateException(z[1]);
    if (this.j != null)
      throw new IllegalStateException(z[5] + this.j);
    this.e = (-1 + this.e);
    if (m == paramInt2)
      k();
    this.c.write(paramString);
    return this;
  }

  private d a(int paramInt, String paramString)
  {
    e(true);
    a(paramInt);
    this.c.write(paramString);
    return this;
  }

  private void a(int paramInt)
  {
    if (this.e == this.d.length)
    {
      int[] arrayOfInt2 = new int[2 * this.e];
      System.arraycopy(this.d, 0, arrayOfInt2, 0, this.e);
      this.d = arrayOfInt2;
    }
    int[] arrayOfInt1 = this.d;
    int m = this.e;
    this.e = (m + 1);
    arrayOfInt1[m] = paramInt;
  }

  private void b(int paramInt)
  {
    this.d[(-1 + this.e)] = paramInt;
  }

  private void d(String paramString)
  {
    int m = 0;
    if (this.i);
    int n;
    int i1;
    int i2;
    for (String[] arrayOfString = b; ; arrayOfString = a)
    {
      this.c.write("\"");
      n = paramString.length();
      for (i1 = 0; ; i1++)
      {
        if (i1 >= n)
          break label149;
        i2 = paramString.charAt(i1);
        if (i2 >= 128)
          break;
        str = arrayOfString[i2];
        if (str != null)
          break label94;
      }
    }
    if (i2 == 8232);
    for (String str = z[16]; ; str = z[15])
    {
      label94: if (m < i1)
        this.c.write(paramString, m, i1 - m);
      this.c.write(str);
      m = i1 + 1;
      break;
      if (i2 != 8233)
        break;
    }
    label149: if (m < n)
      this.c.write(paramString, m, n - m);
    this.c.write("\"");
  }

  private void e(boolean paramBoolean)
  {
    switch (a())
    {
    case 3:
    case 5:
    default:
      throw new IllegalStateException(z[1]);
    case 7:
      if (!this.h)
        throw new IllegalStateException(z[2]);
    case 6:
      if ((!this.h) && (!paramBoolean))
        throw new IllegalStateException(z[3]);
      b(7);
      return;
    case 1:
      b(2);
      k();
      return;
    case 2:
      this.c.append((char)',');
      k();
      return;
    case 4:
    }
    this.c.append(this.g);
    b(5);
  }

  private void j()
  {
    int m;
    if (this.j != null)
    {
      m = a();
      if (m != 5)
        break label49;
      this.c.write(44);
    }
    label49: 
    while (m == 3)
    {
      k();
      b(4);
      d(this.j);
      this.j = null;
      return;
    }
    throw new IllegalStateException(z[1]);
  }

  private void k()
  {
    if (this.f == null);
    while (true)
    {
      return;
      this.c.write("\n");
      int m = 1;
      int n = this.e;
      while (m < n)
      {
        this.c.write(this.f);
        m++;
      }
    }
  }

  public d a(long paramLong)
  {
    j();
    e(false);
    this.c.write(Long.toString(paramLong));
    return this;
  }

  public d a(Number paramNumber)
  {
    if (paramNumber == null)
      return f();
    j();
    String str = paramNumber.toString();
    if ((!this.h) && ((str.equals(z[7])) || (str.equals(z[9])) || (str.equals(z[10]))))
      throw new IllegalArgumentException(z[8] + paramNumber);
    e(false);
    this.c.append(str);
    return this;
  }

  public d a(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException(z[17]);
    if (this.j != null)
      throw new IllegalStateException();
    if (this.e == 0)
      throw new IllegalStateException(z[4]);
    this.j = paramString;
    return this;
  }

  public d a(boolean paramBoolean)
  {
    j();
    e(false);
    Writer localWriter = this.c;
    if (paramBoolean);
    for (String str = z[12]; ; str = z[13])
    {
      localWriter.write(str);
      return this;
    }
  }

  public d b()
  {
    j();
    return a(1, "[");
  }

  public d b(String paramString)
  {
    if (paramString == null)
      return f();
    j();
    e(false);
    d(paramString);
    return this;
  }

  public final void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }

  public d c()
  {
    return a(1, 2, "]");
  }

  public final void c(String paramString)
  {
    if (paramString.length() == 0)
    {
      this.f = null;
      this.g = ":";
      return;
    }
    this.f = paramString;
    this.g = z[11];
  }

  public final void c(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }

  public void close()
  {
    this.c.close();
    int m = this.e;
    if ((m > 1) || ((m == 1) && (this.d[(m - 1)] != 7)))
      throw new IOException(z[6]);
    this.e = 0;
  }

  public d d()
  {
    j();
    return a(3, "{");
  }

  public final void d(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public d e()
  {
    return a(3, 5, "}");
  }

  public d f()
  {
    if (this.j != null)
    {
      if (this.k)
        j();
    }
    else
    {
      e(false);
      this.c.write(z[0]);
      return this;
    }
    this.j = null;
    return this;
  }

  public void flush()
  {
    if (this.e == 0)
      throw new IllegalStateException(z[4]);
    this.c.flush();
  }

  public final boolean g()
  {
    return this.h;
  }

  public final boolean h()
  {
    return this.i;
  }

  public final boolean i()
  {
    return this.k;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */