package com.google.gson.jpush;

import com.google.gson.jpush.b.a;
import com.google.gson.jpush.b.c;
import com.google.gson.jpush.b.e;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class ab
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "f#rL\bDbkA\037S+uGMj\021TnMS-nR\016Ex;";
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
          i3 = 109;
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
        str1 = "";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 32;
        break label96;
        i3 = 66;
        break label96;
        i3 = 27;
        break label96;
        i3 = 32;
        break label96;
        m = 0;
      }
    }
  }

  public ab()
  {
  }

  // ERROR //
  private static w a(a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 44	com/google/gson/jpush/b/a:p	()Z
    //   4: istore_1
    //   5: aload_0
    //   6: iconst_1
    //   7: invokevirtual 47	com/google/gson/jpush/b/a:a	(Z)V
    //   10: aload_0
    //   11: invokestatic 51	com/google/gson/jpush/internal/ag:a	(Lcom/google/gson/jpush/b/a;)Lcom/google/gson/jpush/w;
    //   14: astore 5
    //   16: aload_0
    //   17: iload_1
    //   18: invokevirtual 47	com/google/gson/jpush/b/a:a	(Z)V
    //   21: aload 5
    //   23: areturn
    //   24: astore 4
    //   26: new 53	com/google/gson/jpush/aa
    //   29: dup
    //   30: new 55	java/lang/StringBuilder
    //   33: dup
    //   34: getstatic 30	com/google/gson/jpush/ab:z	[Ljava/lang/String;
    //   37: iconst_0
    //   38: aaload
    //   39: invokespecial 58	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   42: aload_0
    //   43: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   46: getstatic 30	com/google/gson/jpush/ab:z	[Ljava/lang/String;
    //   49: iconst_1
    //   50: aaload
    //   51: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: aload 4
    //   59: invokespecial 71	com/google/gson/jpush/aa:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   62: athrow
    //   63: astore_3
    //   64: aload_0
    //   65: iload_1
    //   66: invokevirtual 47	com/google/gson/jpush/b/a:a	(Z)V
    //   69: aload_3
    //   70: athrow
    //   71: astore_2
    //   72: new 53	com/google/gson/jpush/aa
    //   75: dup
    //   76: new 55	java/lang/StringBuilder
    //   79: dup
    //   80: getstatic 30	com/google/gson/jpush/ab:z	[Ljava/lang/String;
    //   83: iconst_0
    //   84: aaload
    //   85: invokespecial 58	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload_0
    //   89: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   92: getstatic 30	com/google/gson/jpush/ab:z	[Ljava/lang/String;
    //   95: iconst_1
    //   96: aaload
    //   97: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: aload_2
    //   104: invokespecial 71	com/google/gson/jpush/aa:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   107: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   10	16	24	java/lang/StackOverflowError
    //   10	16	63	finally
    //   26	63	63	finally
    //   72	108	63	finally
    //   10	16	71	java/lang/OutOfMemoryError
  }

  private w a(Reader paramReader)
  {
    w localw;
    try
    {
      a locala = new a(paramReader);
      localw = a(locala);
      if ((!(localw instanceof y)) && (locala.f() != c.j))
        throw new af(z[2]);
    }
    catch (e locale)
    {
      throw new af(locale);
    }
    catch (IOException localIOException)
    {
      throw new x(localIOException);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw new af(localNumberFormatException);
    }
    return localw;
  }

  public final w a(String paramString)
  {
    return a(new StringReader(paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */