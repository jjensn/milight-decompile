package cn.jpush.android.util;

import cn.jpush.android.api.d;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ae
{
  public static final Pattern a;
  public static final Pattern b;
  public static final Pattern c;
  public static final Pattern d;
  public static final Pattern e;
  public static final Pattern f = Pattern.compile(str4);
  private static final String[] z;

  static
  {
    Object localObject1 = new String[3];
    int i = 0;
    String str1 = "A@乧2鿚/6^~ReZJE >[D;Y50Z1\003￺¾:dO3/Wb[";
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
            i16 = 127;
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
        str1 = "A@乧2鿚/6^~ReZJE >[D;Y50Z1\003￺¾:4[";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "73O7$~6\035^RE+J&ß2ퟤ不2ﶰ﷯6ﾈB$~6\035^RE+J&ß2ퟤ不2ﶰ﷯6ﾈCRB1N5$~6\035^RE+J&ß2ퟤ不2ﶰ﷯6ﾈB#12L";
        j = 1;
        localObject1 = localObject2;
      case 1:
      }
    }
    localObject1[i] = str2;
    z = localObject2;
    String str3 = "";
    int n = -1;
    label237: String str4;
    while (true)
    {
      Object localObject4 = str3.toCharArray();
      int i1 = localObject4.length;
      int i2 = 0;
      if (i1 <= 1);
      label274: label561: 
      while (i1 > i2)
      {
        Object localObject8 = localObject4;
        int i9 = i2;
        int i10 = i1;
        Object localObject9 = localObject4;
        int i11 = localObject9[i2];
        int i12;
        switch (i9 % 5)
        {
        default:
          i12 = 127;
        case 0:
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          localObject9[i2] = (char)(i12 ^ i11);
          i2 = i9 + 1;
          if (i10 != 0)
            break label651;
          localObject9 = localObject8;
          i9 = i2;
          i2 = i10;
          break label274;
          i16 = 31;
          break;
          i16 = 27;
          break;
          i16 = 103;
          break;
          i16 = 31;
          break;
          c = Pattern.compile(str4);
          StringBuilder localStringBuilder = new StringBuilder(z[2]).append(a);
          Object localObject5 = "6g".toCharArray();
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
              i8 = 127;
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
                break label561;
              localObject7 = localObject6;
              i5 = i4;
              i4 = i6;
              break;
              i8 = 31;
              continue;
              i8 = 27;
              continue;
              i8 = 103;
              continue;
              i8 = 31;
            }
            i3 = i6;
            localObject5 = localObject6;
          }
          d = Pattern.compile(new String((char[])localObject5).intern() + c + ")");
          str3 = "DzJe>2AW2FC0;1#@GBCRC0:dN3)R)\002C[<~ReZJEO2\":D\0362a&2%/6^CRB`W3I+fOCQDzJe>2AW2FB@\0062\005^6=/R&GJB\004/7U*\00260";
          n = 2;
          break label237;
          i12 = 31;
          continue;
          i12 = 27;
          continue;
          i12 = 103;
          continue;
          i12 = 31;
        }
        i1 = i10;
        localObject4 = localObject8;
      }
      label651: str4 = new String((char[])localObject4).intern();
      switch (n)
      {
      case 1:
      default:
        a = Pattern.compile(str4);
        str3 = "";
        n = 0;
        break;
      case 0:
        b = Pattern.compile(str4);
        str3 = "73U*$/6RB\003-@W2KB@W2FBg</R.F</R&F\034-\002c@V2FB@W2FBg<.R&FNCQ7)RDO2.:cMD+J+\"D+J&\"c@W2NB@W2FB`Ub\003D*J&\"D+J&\"c@V2FBgW6#13U*$/6RB\003-@W2KB@W2FBg</R.F</R&F\034-\002c@V2FB@W2FBg<.R&F\033/VC5O-JD+J*\"c)</R+F</R&F\033DO2*:DO2\":dMbg<.R&F</R&F\033DO2\":6V";
        n = 1;
        break;
      case 2:
        e = Pattern.compile(str4);
        str3 = "7GLDO2\":4$C6GCQB1N WC3</R&FLCVDGJ?#1FM6@7@W2FB@W2FC6GCQB@W2FC6GCQB0</R&FN";
        n = 3;
      case 3:
      }
    }
  }

  public static int a(Set<String> paramSet)
  {
    if ((paramSet == null) || (paramSet.isEmpty()))
      return 0;
    if (paramSet.size() > 1000)
      return d.g;
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (str == null)
        return d.e;
      if (str.getBytes().length > 40)
        return d.f;
      if (!Pattern.compile(z[1]).matcher(str).matches())
        return d.e;
    }
    return 0;
  }

  public static boolean a(String paramString)
  {
    if (paramString == null)
      return false;
    return Pattern.compile(z[0]).matcher(paramString).matches();
  }

  public static int b(String paramString)
  {
    if ((paramString == null) || (an.a(paramString)));
    do
    {
      return 0;
      if (paramString.getBytes().length > 40)
        return d.d;
    }
    while (Pattern.compile(z[1]).matcher(paramString).matches());
    return d.c;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */