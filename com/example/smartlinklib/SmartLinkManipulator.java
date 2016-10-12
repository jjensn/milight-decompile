package com.example.smartlinklib;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class SmartLinkManipulator
{
  public static final int DEVICE_COUNT_MULTIPLE = -1;
  public static final int DEVICE_COUNT_ONE = 1;
  private static SmartLinkManipulator me = null;
  private int CONTENT_CHECKSUM_BEFORE_DELAY_TIME = 100;
  private int CONTENT_COUNT = 5;
  private int CONTENT_GROUP_DELAY_TIME = 500;
  private int CONTENT_PACKAGE_DELAY_TIME = 50;
  private int HEADER_CAPACITY = 76;
  private int HEADER_COUNT = 200;
  private int HEADER_PACKAGE_DELAY_TIME = 10;
  private final String RET_KEY = "smart_config";
  private String TAG = "HFdebug";
  private String broadCastIP;
  private ConnectCallBack callback;
  private DatagramPacket dataPacket;
  Runnable findThread = new Runnable()
  {
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
      //   15: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   18: getfield 32	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
      //   21: ifne +69 -> 90
      //   24: aload_0
      //   25: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   28: getfield 32	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
      //   31: ifeq +30 -> 61
      //   34: aload_0
      //   35: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   38: invokestatic 36	com/example/smartlinklib/SmartLinkManipulator:access$0	(Lcom/example/smartlinklib/SmartLinkManipulator;)Ljava/util/Set;
      //   41: invokeinterface 42 1 0
      //   46: ifgt +73 -> 119
      //   49: aload_0
      //   50: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   53: invokestatic 46	com/example/smartlinklib/SmartLinkManipulator:access$1	(Lcom/example/smartlinklib/SmartLinkManipulator;)Lcom/example/smartlinklib/SmartLinkManipulator$ConnectCallBack;
      //   56: invokeinterface 51 1 0
      //   61: aload_0
      //   62: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   65: invokestatic 55	com/example/smartlinklib/SmartLinkManipulator:access$2	(Lcom/example/smartlinklib/SmartLinkManipulator;)Ljava/lang/String;
      //   68: ldc 57
      //   70: invokestatic 63	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
      //   73: pop
      //   74: aload_0
      //   75: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   78: iconst_0
      //   79: invokestatic 67	com/example/smartlinklib/SmartLinkManipulator:access$3	(Lcom/example/smartlinklib/SmartLinkManipulator;Z)V
      //   82: aload_0
      //   83: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   86: invokevirtual 70	com/example/smartlinklib/SmartLinkManipulator:StopConnection	()V
      //   89: return
      //   90: aload_0
      //   91: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   94: invokevirtual 73	com/example/smartlinklib/SmartLinkManipulator:sendFindCmd	()V
      //   97: aload_0
      //   98: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   101: getfield 32	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
      //   104: ifeq +9 -> 113
      //   107: ldc2_w 74
      //   110: invokestatic 28	java/lang/Thread:sleep	(J)V
      //   113: iinc 2 1
      //   116: goto -108 -> 8
      //   119: aload_0
      //   120: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   123: invokestatic 36	com/example/smartlinklib/SmartLinkManipulator:access$0	(Lcom/example/smartlinklib/SmartLinkManipulator;)Ljava/util/Set;
      //   126: invokeinterface 42 1 0
      //   131: ifle -70 -> 61
      //   134: aload_0
      //   135: getfield 14	com/example/smartlinklib/SmartLinkManipulator$1:this$0	Lcom/example/smartlinklib/SmartLinkManipulator;
      //   138: invokestatic 46	com/example/smartlinklib/SmartLinkManipulator:access$1	(Lcom/example/smartlinklib/SmartLinkManipulator;)Lcom/example/smartlinklib/SmartLinkManipulator$ConnectCallBack;
      //   141: invokeinterface 78 1 0
      //   146: goto -85 -> 61
      //   149: astore_1
      //   150: goto -144 -> 6
      //   153: astore 4
      //   155: goto -42 -> 113
      //
      // Exception table:
      //   from	to	target	type
      //   0	6	149	java/lang/InterruptedException
      //   107	113	153	java/lang/InterruptedException
    }
  };
  private String gateWay;
  private InetAddress inetAddressbroadcast;
  public boolean isConnecting = false;
  private boolean isfinding = false;
  private DatagramPacket packetToSendbroadcast;
  private DatagramPacket packetToSendgateway;
  private int port = 49999;
  private String pswd;
  private byte[] receiveByte = new byte[512];
  private DatagramSocket socket;
  private String ssid;
  private Set<String> successMacSet = new HashSet();

  private SmartLinkManipulator()
  {
  }

  // ERROR //
  private void connect()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	com/example/smartlinklib/SmartLinkManipulator:TAG	Ljava/lang/String;
    //   4: ldc 124
    //   6: invokestatic 130	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   9: pop
    //   10: iconst_1
    //   11: istore_2
    //   12: aload_0
    //   13: aload_0
    //   14: getfield 69	com/example/smartlinklib/SmartLinkManipulator:HEADER_CAPACITY	I
    //   17: invokespecial 134	com/example/smartlinklib/SmartLinkManipulator:getBytes	(I)[B
    //   20: astore_3
    //   21: iload_2
    //   22: aload_0
    //   23: getfield 65	com/example/smartlinklib/SmartLinkManipulator:HEADER_COUNT	I
    //   26: if_icmpgt +10 -> 36
    //   29: aload_0
    //   30: getfield 88	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
    //   33: ifne +82 -> 115
    //   36: aload_0
    //   37: getfield 136	com/example/smartlinklib/SmartLinkManipulator:pswd	Ljava/lang/String;
    //   40: astore 4
    //   42: iconst_2
    //   43: aload 4
    //   45: invokevirtual 142	java/lang/String:length	()I
    //   48: iadd
    //   49: newarray int
    //   51: astore 5
    //   53: aload 5
    //   55: iconst_0
    //   56: bipush 89
    //   58: iastore
    //   59: iconst_1
    //   60: istore 6
    //   62: iconst_0
    //   63: istore 7
    //   65: iload 7
    //   67: aload 4
    //   69: invokevirtual 142	java/lang/String:length	()I
    //   72: if_icmplt +72 -> 144
    //   75: aload 5
    //   77: iconst_m1
    //   78: aload 5
    //   80: arraylength
    //   81: iadd
    //   82: bipush 86
    //   84: iastore
    //   85: iconst_1
    //   86: istore 8
    //   88: iload 8
    //   90: aload_0
    //   91: getfield 71	com/example/smartlinklib/SmartLinkManipulator:CONTENT_COUNT	I
    //   94: if_icmpgt +10 -> 104
    //   97: aload_0
    //   98: getfield 88	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
    //   101: ifne +67 -> 168
    //   104: aload_0
    //   105: getfield 58	com/example/smartlinklib/SmartLinkManipulator:TAG	Ljava/lang/String;
    //   108: ldc 144
    //   110: invokestatic 130	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   113: pop
    //   114: return
    //   115: aload_0
    //   116: aload_3
    //   117: invokevirtual 148	com/example/smartlinklib/SmartLinkManipulator:send	([B)V
    //   120: aload_0
    //   121: getfield 67	com/example/smartlinklib/SmartLinkManipulator:HEADER_PACKAGE_DELAY_TIME	I
    //   124: i2l
    //   125: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   128: iinc 2 1
    //   131: goto -110 -> 21
    //   134: astore 20
    //   136: aload 20
    //   138: invokevirtual 157	java/lang/InterruptedException:printStackTrace	()V
    //   141: goto -13 -> 128
    //   144: aload 5
    //   146: iload 6
    //   148: bipush 76
    //   150: aload 4
    //   152: iload 7
    //   154: invokevirtual 161	java/lang/String:charAt	(I)C
    //   157: iadd
    //   158: iastore
    //   159: iinc 6 1
    //   162: iinc 7 1
    //   165: goto -100 -> 65
    //   168: iconst_0
    //   169: istore 10
    //   171: iload 10
    //   173: aload 5
    //   175: arraylength
    //   176: if_icmplt +55 -> 231
    //   179: aload_0
    //   180: getfield 75	com/example/smartlinklib/SmartLinkManipulator:CONTENT_CHECKSUM_BEFORE_DELAY_TIME	I
    //   183: i2l
    //   184: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   187: bipush 76
    //   189: sipush 256
    //   192: aload 4
    //   194: invokevirtual 142	java/lang/String:length	()I
    //   197: iadd
    //   198: iadd
    //   199: istore 16
    //   201: iconst_1
    //   202: istore 17
    //   204: iload 17
    //   206: iconst_3
    //   207: if_icmpgt +10 -> 217
    //   210: aload_0
    //   211: getfield 88	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
    //   214: ifne +142 -> 356
    //   217: aload_0
    //   218: getfield 77	com/example/smartlinklib/SmartLinkManipulator:CONTENT_GROUP_DELAY_TIME	I
    //   221: i2l
    //   222: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   225: iinc 8 1
    //   228: goto -140 -> 88
    //   231: iconst_1
    //   232: istore 11
    //   234: iload 10
    //   236: ifeq +13 -> 249
    //   239: iload 10
    //   241: iconst_m1
    //   242: aload 5
    //   244: arraylength
    //   245: iadd
    //   246: if_icmpne +6 -> 252
    //   249: iconst_3
    //   250: istore 11
    //   252: iconst_1
    //   253: istore 12
    //   255: iload 12
    //   257: iload 11
    //   259: if_icmpgt +10 -> 269
    //   262: aload_0
    //   263: getfield 88	com/example/smartlinklib/SmartLinkManipulator:isConnecting	Z
    //   266: ifne +25 -> 291
    //   269: iload 10
    //   271: aload 5
    //   273: arraylength
    //   274: if_icmpeq +11 -> 285
    //   277: aload_0
    //   278: getfield 73	com/example/smartlinklib/SmartLinkManipulator:CONTENT_PACKAGE_DELAY_TIME	I
    //   281: i2l
    //   282: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   285: iinc 10 1
    //   288: goto -117 -> 171
    //   291: aload_0
    //   292: aload_0
    //   293: aload 5
    //   295: iload 10
    //   297: iaload
    //   298: invokespecial 134	com/example/smartlinklib/SmartLinkManipulator:getBytes	(I)[B
    //   301: invokevirtual 148	com/example/smartlinklib/SmartLinkManipulator:send	([B)V
    //   304: iload 10
    //   306: aload 5
    //   308: arraylength
    //   309: if_icmpeq +11 -> 320
    //   312: aload_0
    //   313: getfield 73	com/example/smartlinklib/SmartLinkManipulator:CONTENT_PACKAGE_DELAY_TIME	I
    //   316: i2l
    //   317: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   320: iinc 12 1
    //   323: goto -68 -> 255
    //   326: astore 14
    //   328: aload 14
    //   330: invokevirtual 157	java/lang/InterruptedException:printStackTrace	()V
    //   333: goto -13 -> 320
    //   336: astore 13
    //   338: aload 13
    //   340: invokevirtual 157	java/lang/InterruptedException:printStackTrace	()V
    //   343: goto -58 -> 285
    //   346: astore 15
    //   348: aload 15
    //   350: invokevirtual 157	java/lang/InterruptedException:printStackTrace	()V
    //   353: goto -166 -> 187
    //   356: aload_0
    //   357: aload_0
    //   358: iload 16
    //   360: invokespecial 134	com/example/smartlinklib/SmartLinkManipulator:getBytes	(I)[B
    //   363: invokevirtual 148	com/example/smartlinklib/SmartLinkManipulator:send	([B)V
    //   366: iload 17
    //   368: iconst_3
    //   369: if_icmpge +11 -> 380
    //   372: aload_0
    //   373: getfield 73	com/example/smartlinklib/SmartLinkManipulator:CONTENT_PACKAGE_DELAY_TIME	I
    //   376: i2l
    //   377: invokestatic 154	java/lang/Thread:sleep	(J)V
    //   380: iinc 17 1
    //   383: goto -179 -> 204
    //   386: astore 19
    //   388: aload 19
    //   390: invokevirtual 157	java/lang/InterruptedException:printStackTrace	()V
    //   393: goto -13 -> 380
    //   396: astore 18
    //   398: aload 18
    //   400: invokevirtual 157	java/lang/InterruptedException:printStackTrace	()V
    //   403: goto -178 -> 225
    //
    // Exception table:
    //   from	to	target	type
    //   120	128	134	java/lang/InterruptedException
    //   312	320	326	java/lang/InterruptedException
    //   277	285	336	java/lang/InterruptedException
    //   179	187	346	java/lang/InterruptedException
    //   372	380	386	java/lang/InterruptedException
    //   217	225	396	java/lang/InterruptedException
  }

  private byte[] getBytes(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = 0; ; i++)
    {
      if (i >= paramInt)
        return arrayOfByte;
      arrayOfByte[i] = 5;
    }
  }

  public static SmartLinkManipulator getInstence()
  {
    if (me == null)
      me = new SmartLinkManipulator();
    return me;
  }

  public void Startconnection(ConnectCallBack paramConnectCallBack)
  {
    Log.e(this.TAG, "Startconnection");
    this.callback = paramConnectCallBack;
    this.isConnecting = true;
    receive();
    this.successMacSet.clear();
    new Thread(new Runnable()
    {
      public void run()
      {
        while (true)
        {
          if (!SmartLinkManipulator.this.isConnecting)
          {
            Log.e(SmartLinkManipulator.this.TAG, "StopConnet");
            SmartLinkManipulator.this.StopConnection();
            return;
          }
          SmartLinkManipulator.this.connect();
        }
      }
    }).start();
    if (!this.isfinding)
    {
      this.isfinding = true;
      new Thread(this.findThread).start();
    }
  }

  public void StopConnection()
  {
    this.isConnecting = false;
    if (this.socket != null)
      this.socket.close();
  }

  public char byteToChar(byte[] paramArrayOfByte)
  {
    return (char)((0xFF & paramArrayOfByte[0]) << 8 | 0xFF & paramArrayOfByte[1]);
  }

  public String getBroadcastAddress(Context paramContext)
  {
    DhcpInfo localDhcpInfo = ((WifiManager)paramContext.getSystemService("wifi")).getDhcpInfo();
    if (localDhcpInfo == null)
      return "255.255.255.255";
    int i = localDhcpInfo.ipAddress & localDhcpInfo.netmask | 0xFFFFFFFF ^ localDhcpInfo.netmask;
    byte[] arrayOfByte = new byte[4];
    int j = 0;
    while (true)
      if (j >= 4)
        try
        {
          String str = InetAddress.getByAddress(arrayOfByte).getHostAddress();
          return str;
          arrayOfByte[j] = (byte)(0xFF & i >> j * 8);
          j++;
        }
        catch (Exception localException)
        {
        }
    return "255.255.255.255";
  }

  public void receive()
  {
    Log.e(this.TAG, "start RECV");
    this.dataPacket = new DatagramPacket(this.receiveByte, this.receiveByte.length);
    new Thread()
    {
      public void run()
      {
        while (true)
        {
          if (!SmartLinkManipulator.this.isConnecting)
          {
            Log.e(SmartLinkManipulator.this.TAG, "end RECV");
            SmartLinkManipulator.this.StopConnection();
            label30: return;
          }
          try
          {
            SmartLinkManipulator.this.socket.receive(SmartLinkManipulator.this.dataPacket);
            int i = SmartLinkManipulator.this.dataPacket.getLength();
            if (i > 0)
            {
              String str1 = new String(SmartLinkManipulator.this.receiveByte, 0, i, "UTF-8");
              if (str1.contains("smart_config"))
              {
                Log.e("RECV", "smart_config");
                ModuleInfo localModuleInfo = new ModuleInfo();
                localModuleInfo.setMac(str1.replace("smart_config", "").trim());
                String str2 = SmartLinkManipulator.this.dataPacket.getAddress().getHostAddress();
                if ((str2.equalsIgnoreCase("0.0.0.0")) || (str2.contains(":")))
                  break label30;
                localModuleInfo.setModuleIP(str2);
                if (!SmartLinkManipulator.this.successMacSet.contains(localModuleInfo.getMac()))
                {
                  SmartLinkManipulator.this.successMacSet.add(localModuleInfo.getMac());
                  SmartLinkManipulator.this.callback.onConnect(localModuleInfo);
                }
              }
            }
          }
          catch (IOException localIOException)
          {
            localIOException.printStackTrace();
          }
        }
      }
    }
    .start();
  }

  public void send(byte[] paramArrayOfByte)
  {
    this.packetToSendbroadcast = new DatagramPacket(paramArrayOfByte, paramArrayOfByte.length, this.inetAddressbroadcast, this.port);
    try
    {
      this.socket.send(this.packetToSendbroadcast);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  public void sendFindCmd()
  {
    System.out.println("smartlinkfind");
    this.packetToSendbroadcast = new DatagramPacket("smartlinkfind".getBytes(), "smartlinkfind".getBytes().length, this.inetAddressbroadcast, 48899);
    try
    {
      this.socket.send(this.packetToSendbroadcast);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  public void sendHFA11Cmd()
  {
    System.out.println("smartlinkfind");
    this.packetToSendbroadcast = new DatagramPacket("HF-A11ASSISTHREAD".getBytes(), "HF-A11ASSISTHREAD".getBytes().length, this.inetAddressbroadcast, 48899);
    try
    {
      this.socket.send(this.packetToSendbroadcast);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  public void setConnection(String paramString1, String paramString2, Context paramContext)
    throws SocketException, UnknownHostException
  {
    Log.e(this.TAG, String.valueOf(paramString1) + ":" + paramString2);
    this.ssid = paramString1;
    this.pswd = paramString2;
    this.broadCastIP = getBroadcastAddress(paramContext);
    this.socket = new DatagramSocket(this.port);
    this.socket.setBroadcast(true);
    this.inetAddressbroadcast = InetAddress.getByName(this.broadCastIP);
  }

  public static abstract interface ConnectCallBack
  {
    public abstract void onConnect(ModuleInfo paramModuleInfo);

    public abstract void onConnectOk();

    public abstract void onConnectTimeOut();
  }
}

/* Location:
 * Qualified Name:     com.example.smartlinklib.SmartLinkManipulator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */