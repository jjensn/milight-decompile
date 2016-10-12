package cn.jpush.android.service;

final class j
  implements Runnable
{
  j(h paramh, long paramLong)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   3: ifnonnull +31 -> 34
    //   6: aload_0
    //   7: getfield 14	cn/jpush/android/service/j:b	Lcn/jpush/android/service/h;
    //   10: invokestatic 30	cn/jpush/android/service/h:a	(Lcn/jpush/android/service/h;)Landroid/content/Context;
    //   13: ifnull +21 -> 34
    //   16: new 32	cn/jpush/android/data/f
    //   19: dup
    //   20: aload_0
    //   21: getfield 14	cn/jpush/android/service/j:b	Lcn/jpush/android/service/h;
    //   24: invokestatic 30	cn/jpush/android/service/h:a	(Lcn/jpush/android/service/h;)Landroid/content/Context;
    //   27: invokespecial 35	cn/jpush/android/data/f:<init>	(Landroid/content/Context;)V
    //   30: invokestatic 38	cn/jpush/android/service/h:a	(Lcn/jpush/android/data/f;)Lcn/jpush/android/data/f;
    //   33: pop
    //   34: aconst_null
    //   35: astore_1
    //   36: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   39: iconst_1
    //   40: invokevirtual 41	cn/jpush/android/data/f:a	(Z)Z
    //   43: pop
    //   44: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   47: aload_0
    //   48: getfield 16	cn/jpush/android/service/j:a	J
    //   51: iconst_0
    //   52: invokevirtual 44	cn/jpush/android/data/f:a	(JI)Landroid/database/Cursor;
    //   55: astore 7
    //   57: aload 7
    //   59: astore_1
    //   60: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   63: aload_1
    //   64: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   67: invokevirtual 50	cn/jpush/android/data/f:a	(Landroid/database/Cursor;Lcn/jpush/android/data/h;)V
    //   70: iconst_1
    //   71: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   74: invokevirtual 56	cn/jpush/android/data/h:c	()I
    //   77: if_icmpne +57 -> 134
    //   80: invokestatic 60	cn/jpush/android/util/ac:b	()V
    //   83: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   86: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   89: invokevirtual 63	cn/jpush/android/data/h:a	()J
    //   92: iconst_0
    //   93: iconst_1
    //   94: iconst_0
    //   95: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   98: invokevirtual 67	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   101: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   104: invokevirtual 70	cn/jpush/android/data/h:f	()J
    //   107: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   110: invokevirtual 73	cn/jpush/android/data/h:e	()J
    //   113: invokevirtual 76	cn/jpush/android/data/f:b	(JIIILjava/lang/String;JJ)Z
    //   116: pop
    //   117: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   120: invokevirtual 78	cn/jpush/android/data/f:a	()V
    //   123: aload_1
    //   124: ifnull +9 -> 133
    //   127: aload_1
    //   128: invokeinterface 83 1 0
    //   133: return
    //   134: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   137: invokevirtual 85	cn/jpush/android/data/h:b	()I
    //   140: iconst_1
    //   141: if_icmple +63 -> 204
    //   144: invokestatic 60	cn/jpush/android/util/ac:b	()V
    //   147: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   150: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   153: invokevirtual 63	cn/jpush/android/data/h:a	()J
    //   156: iconst_m1
    //   157: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   160: invokevirtual 85	cn/jpush/android/data/h:b	()I
    //   163: iadd
    //   164: iconst_0
    //   165: iconst_0
    //   166: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   169: invokevirtual 67	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   172: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   175: invokevirtual 70	cn/jpush/android/data/h:f	()J
    //   178: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   181: invokevirtual 73	cn/jpush/android/data/h:e	()J
    //   184: invokevirtual 76	cn/jpush/android/data/f:b	(JIIILjava/lang/String;JJ)Z
    //   187: pop
    //   188: goto -71 -> 117
    //   191: astore 5
    //   193: aload_1
    //   194: ifnull -61 -> 133
    //   197: aload_1
    //   198: invokeinterface 83 1 0
    //   203: return
    //   204: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   207: invokevirtual 85	cn/jpush/android/data/h:b	()I
    //   210: iconst_1
    //   211: if_icmpne +117 -> 328
    //   214: invokestatic 60	cn/jpush/android/util/ac:b	()V
    //   217: invokestatic 90	java/lang/System:currentTimeMillis	()J
    //   220: lstore 9
    //   222: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   225: invokevirtual 70	cn/jpush/android/data/h:f	()J
    //   228: lload 9
    //   230: lcmp
    //   231: ifle +31 -> 262
    //   234: invokestatic 60	cn/jpush/android/util/ac:b	()V
    //   237: goto -120 -> 117
    //   240: astore 8
    //   242: aload_1
    //   243: astore 4
    //   245: aload 8
    //   247: astore_3
    //   248: aload 4
    //   250: ifnull +10 -> 260
    //   253: aload 4
    //   255: invokeinterface 83 1 0
    //   260: aload_3
    //   261: athrow
    //   262: aload_0
    //   263: getfield 14	cn/jpush/android/service/j:b	Lcn/jpush/android/service/h;
    //   266: aload_0
    //   267: getfield 14	cn/jpush/android/service/j:b	Lcn/jpush/android/service/h;
    //   270: invokestatic 30	cn/jpush/android/service/h:a	(Lcn/jpush/android/service/h;)Landroid/content/Context;
    //   273: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   276: invokevirtual 67	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   279: aload_0
    //   280: getfield 14	cn/jpush/android/service/j:b	Lcn/jpush/android/service/h;
    //   283: invokestatic 93	cn/jpush/android/service/h:b	(Lcn/jpush/android/service/h;)Ljava/lang/String;
    //   286: ldc 95
    //   288: invokestatic 98	cn/jpush/android/service/h:a	(Lcn/jpush/android/service/h;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   291: invokestatic 27	cn/jpush/android/service/h:a	()Lcn/jpush/android/data/f;
    //   294: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   297: invokevirtual 63	cn/jpush/android/data/h:a	()J
    //   300: iconst_0
    //   301: iconst_0
    //   302: iconst_0
    //   303: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   306: invokevirtual 67	cn/jpush/android/data/h:d	()Ljava/lang/String;
    //   309: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   312: invokevirtual 70	cn/jpush/android/data/h:f	()J
    //   315: invokestatic 47	cn/jpush/android/service/h:b	()Lcn/jpush/android/data/h;
    //   318: invokevirtual 73	cn/jpush/android/data/h:e	()J
    //   321: invokevirtual 76	cn/jpush/android/data/f:b	(JIIILjava/lang/String;JJ)Z
    //   324: pop
    //   325: goto -208 -> 117
    //   328: invokestatic 60	cn/jpush/android/util/ac:b	()V
    //   331: goto -214 -> 117
    //   334: astore_2
    //   335: aload_2
    //   336: astore_3
    //   337: aconst_null
    //   338: astore 4
    //   340: goto -92 -> 248
    //
    // Exception table:
    //   from	to	target	type
    //   36	57	191	java/lang/Exception
    //   60	117	191	java/lang/Exception
    //   117	123	191	java/lang/Exception
    //   134	188	191	java/lang/Exception
    //   204	237	191	java/lang/Exception
    //   262	325	191	java/lang/Exception
    //   328	331	191	java/lang/Exception
    //   60	117	240	finally
    //   117	123	240	finally
    //   134	188	240	finally
    //   204	237	240	finally
    //   262	325	240	finally
    //   328	331	240	finally
    //   36	57	334	finally
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */