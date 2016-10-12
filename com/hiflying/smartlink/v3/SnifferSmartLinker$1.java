package com.hiflying.smartlink.v3;

class SnifferSmartLinker$1
  implements Runnable
{
  SnifferSmartLinker$1(SnifferSmartLinker paramSnifferSmartLinker)
  {
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc2_w 21
    //   3: invokestatic 28	java/lang/Thread:sleep	(J)V
    //   6: iconst_0
    //   7: istore_2
    //   8: iload_2
    //   9: bipush 20
    //   11: if_icmpge +13 -> 24
    //   14: aload_0
    //   15: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   18: invokestatic 32	com/hiflying/smartlink/v3/SnifferSmartLinker:access$0	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Z
    //   21: ifne +79 -> 100
    //   24: aload_0
    //   25: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   28: invokestatic 32	com/hiflying/smartlink/v3/SnifferSmartLinker:access$0	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Z
    //   31: ifeq +40 -> 71
    //   34: aload_0
    //   35: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   38: invokestatic 36	com/hiflying/smartlink/v3/SnifferSmartLinker:access$2	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Lcom/hiflying/smartlink/OnSmartLinkListener;
    //   41: ifnull +30 -> 71
    //   44: aload_0
    //   45: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   48: invokestatic 40	com/hiflying/smartlink/v3/SnifferSmartLinker:access$3	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Ljava/util/Set;
    //   51: invokeinterface 46 1 0
    //   56: ifgt +73 -> 129
    //   59: aload_0
    //   60: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   63: invokestatic 36	com/hiflying/smartlink/v3/SnifferSmartLinker:access$2	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Lcom/hiflying/smartlink/OnSmartLinkListener;
    //   66: invokeinterface 51 1 0
    //   71: aload_0
    //   72: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   75: invokestatic 55	com/hiflying/smartlink/v3/SnifferSmartLinker:access$4	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Ljava/lang/String;
    //   78: ldc 57
    //   80: invokestatic 63	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   83: pop
    //   84: aload_0
    //   85: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   88: iconst_0
    //   89: invokestatic 67	com/hiflying/smartlink/v3/SnifferSmartLinker:access$5	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;Z)V
    //   92: aload_0
    //   93: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   96: invokevirtual 70	com/hiflying/smartlink/v3/SnifferSmartLinker:stop	()V
    //   99: return
    //   100: aload_0
    //   101: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   104: invokestatic 73	com/hiflying/smartlink/v3/SnifferSmartLinker:access$1	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)V
    //   107: aload_0
    //   108: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   111: invokestatic 32	com/hiflying/smartlink/v3/SnifferSmartLinker:access$0	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Z
    //   114: ifeq +9 -> 123
    //   117: ldc2_w 74
    //   120: invokestatic 28	java/lang/Thread:sleep	(J)V
    //   123: iinc 2 1
    //   126: goto -118 -> 8
    //   129: aload_0
    //   130: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   133: invokestatic 40	com/hiflying/smartlink/v3/SnifferSmartLinker:access$3	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Ljava/util/Set;
    //   136: invokeinterface 46 1 0
    //   141: ifle -70 -> 71
    //   144: aload_0
    //   145: getfield 14	com/hiflying/smartlink/v3/SnifferSmartLinker$1:this$0	Lcom/hiflying/smartlink/v3/SnifferSmartLinker;
    //   148: invokestatic 36	com/hiflying/smartlink/v3/SnifferSmartLinker:access$2	(Lcom/hiflying/smartlink/v3/SnifferSmartLinker;)Lcom/hiflying/smartlink/OnSmartLinkListener;
    //   151: invokeinterface 78 1 0
    //   156: goto -85 -> 71
    //   159: astore_1
    //   160: goto -154 -> 6
    //   163: astore 4
    //   165: goto -42 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   0	6	159	java/lang/InterruptedException
    //   117	123	163	java/lang/InterruptedException
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinker.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */