package cn.jpush.android.util;

public final class a
{
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "JBQ\017-ID-p%HT7p\017ockN\t";
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
          i3 = 110;
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
        str1 = "JTAi'";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        str1 = "JBQ";
        j = 2;
        arrayOfString2 = arrayOfString1;
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 11;
        break label96;
        i3 = 7;
        break label96;
        i3 = 2;
        break label96;
        i3 = 32;
        break label96;
        m = 0;
      }
    }
  }

  // ERROR //
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_1
    //   7: invokevirtual 38	java/lang/String:length	()I
    //   10: bipush 16
    //   12: if_icmpne -8 -> 4
    //   15: new 40	javax/crypto/spec/SecretKeySpec
    //   18: dup
    //   19: aload_1
    //   20: getstatic 30	cn/jpush/android/util/a:z	[Ljava/lang/String;
    //   23: iconst_1
    //   24: aaload
    //   25: invokevirtual 44	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   28: getstatic 30	cn/jpush/android/util/a:z	[Ljava/lang/String;
    //   31: iconst_2
    //   32: aaload
    //   33: invokespecial 47	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   36: astore_3
    //   37: getstatic 30	cn/jpush/android/util/a:z	[Ljava/lang/String;
    //   40: iconst_0
    //   41: aaload
    //   42: invokestatic 53	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   45: astore 4
    //   47: aload 4
    //   49: iconst_2
    //   50: aload_3
    //   51: new 55	javax/crypto/spec/IvParameterSpec
    //   54: dup
    //   55: aload_1
    //   56: invokevirtual 58	java/lang/String:getBytes	()[B
    //   59: invokespecial 61	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   62: invokevirtual 65	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   65: aload_0
    //   66: iconst_2
    //   67: invokestatic 70	cn/jpush/android/util/e:a	(Ljava/lang/String;I)[B
    //   70: astore 5
    //   72: new 10	java/lang/String
    //   75: dup
    //   76: aload 4
    //   78: aload 5
    //   80: invokevirtual 74	javax/crypto/Cipher:doFinal	([B)[B
    //   83: invokespecial 75	java/lang/String:<init>	([B)V
    //   86: astore 6
    //   88: aload 6
    //   90: areturn
    //   91: astore_2
    //   92: aconst_null
    //   93: areturn
    //   94: astore 7
    //   96: aconst_null
    //   97: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   6	72	91	java/lang/Exception
    //   72	88	94	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */