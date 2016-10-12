package com.irainxun.wifilight.apsetting.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.irainxun.wifilight.apsetting.net.UdpUnicast;
import com.irainxun.wifilight.apsetting.net.UdpUnicast.UdpUnicastListener;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ATCommand
{
  private static final int CODE_CMD = 9;
  private static final int CODE_ENTER_CMD_MODE_FAILURE = 2;
  private static final int CODE_ENTER_CMD_MODE_SUCCESS = 1;
  private static final int CODE_EXIT_CMD_MODE_FAILURE = 4;
  private static final int CODE_EXIT_CMD_MODE_SUCCESS = 3;
  private static final int CODE_RELOAD_FAILURE = 6;
  private static final int CODE_RELOAD_SUCCESS = 5;
  private static final int CODE_RESET_FAILURE = 8;
  private static final int CODE_RESET_SUCCESS = 7;
  private static final int CODE_SEND_CMD_FILE_FAILURE = 11;
  private static final int CODE_SEND_CMD_FILE_RESPONSE = 12;
  private static final int CODE_SEND_CMD_FILE_SUCCESS = 10;
  private static final String RESPONSE = "RESPONSE";
  private static final String TAG = "ATCommand";
  private StringBuffer enterCMDModeResponse = new StringBuffer();
  private String exitCMDModeResponse;
  private Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default:
        return;
      case 1:
        ATCommand.this.onEnterCMDMode(true);
        return;
      case 2:
        ATCommand.this.onEnterCMDMode(false);
        return;
      case 3:
        ATCommand.this.onExitCMDMode(true, ATCommand.this.protocol);
        return;
      case 4:
        ATCommand.this.onExitCMDMode(false, null);
        return;
      case 5:
        ATCommand.this.onReload(true);
        return;
      case 6:
        ATCommand.this.onReload(false);
        return;
      case 7:
        ATCommand.this.onReset(true);
        return;
      case 8:
        ATCommand.this.onReset(false);
        return;
      case 9:
        ATCommand.this.onResponse(paramAnonymousMessage.getData().getString("RESPONSE"));
        return;
      case 10:
        ATCommand.this.onSendFile(true);
        return;
      case 11:
        ATCommand.this.onSendFile(false);
        return;
      case 12:
      }
      ATCommand.this.onResponseOfSendFile(paramAnonymousMessage.getData().getString("RESPONSE"));
    }
  };
  private boolean isCommonCMD;
  private ATCommandListener listener;
  private NetworkProtocol protocol;
  private String reloadResponse;
  private String resetResponse;
  private String response;
  private String sendCMDFileResponse;
  private int times;
  private int timesToTry = 2;
  private StringBuffer tryEnterCMDModeResponse = new StringBuffer();
  private UdpUnicast udpUnicast;

  public ATCommand()
  {
  }

  public ATCommand(UdpUnicast paramUdpUnicast)
  {
    this();
    this.udpUnicast = paramUdpUnicast;
  }

  private void onEnterCMDMode(boolean paramBoolean)
  {
    if (this.listener != null)
      this.listener.onEnterCMDMode(paramBoolean);
  }

  private void onExitCMDMode(boolean paramBoolean, NetworkProtocol paramNetworkProtocol)
  {
    if (this.listener != null)
      this.listener.onExitCMDMode(paramBoolean, paramNetworkProtocol);
  }

  private void onReload(boolean paramBoolean)
  {
    if (this.listener != null)
      this.listener.onReload(paramBoolean);
  }

  private void onReset(boolean paramBoolean)
  {
    if (this.listener != null)
      this.listener.onReset(paramBoolean);
  }

  private void onResponse(String paramString)
  {
    if (this.listener != null)
      this.listener.onResponse(paramString);
  }

  private void onResponseOfSendFile(String paramString)
  {
    if (this.listener != null)
      this.listener.onResponseOfSendFile(paramString);
  }

  private void onSendFile(boolean paramBoolean)
  {
    if (this.listener != null)
      this.listener.onSendFile(paramBoolean);
  }

  private void routeResponse(String paramString)
  {
    Message localMessage = this.handler.obtainMessage(12);
    Bundle localBundle = new Bundle();
    localBundle.putString("RESPONSE", paramString);
    localMessage.setData(localBundle);
    this.handler.sendMessage(localMessage);
  }

  private void waitReceiveResponse(long paramLong, String paramString)
  {
    long l = System.currentTimeMillis();
    while (true)
    {
      if ((System.currentTimeMillis() - l >= paramLong) || (paramString != null))
        return;
      try
      {
        Thread.sleep(50L);
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }

  public void enterCMDMode()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 205	com/irainxun/wifilight/apsetting/model/ATCommand:isCommonCMD	Z
    //   5: aload_0
    //   6: getfield 64	com/irainxun/wifilight/apsetting/model/ATCommand:enterCMDModeResponse	Ljava/lang/StringBuffer;
    //   9: iconst_0
    //   10: invokevirtual 209	java/lang/StringBuffer:setLength	(I)V
    //   13: aload_0
    //   14: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   17: new 211	com/irainxun/wifilight/apsetting/model/ATCommand$6
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 212	com/irainxun/wifilight/apsetting/model/ATCommand$6:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   25: invokevirtual 218	com/irainxun/wifilight/apsetting/net/UdpUnicast:setListener	(Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$UdpUnicastListener;)V
    //   28: aload_0
    //   29: getfield 64	com/irainxun/wifilight/apsetting/model/ATCommand:enterCMDModeResponse	Ljava/lang/StringBuffer;
    //   32: astore_1
    //   33: aload_1
    //   34: monitorenter
    //   35: aload_0
    //   36: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   39: ldc 220
    //   41: invokevirtual 224	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
    //   44: ifne +15 -> 59
    //   47: aload_0
    //   48: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   51: iconst_2
    //   52: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   55: pop
    //   56: aload_1
    //   57: monitorexit
    //   58: return
    //   59: aload_0
    //   60: getfield 64	com/irainxun/wifilight/apsetting/model/ATCommand:enterCMDModeResponse	Ljava/lang/StringBuffer;
    //   63: ldc2_w 229
    //   66: invokevirtual 233	java/lang/Object:wait	(J)V
    //   69: aload_1
    //   70: monitorexit
    //   71: ldc 35
    //   73: new 235	java/lang/StringBuilder
    //   76: dup
    //   77: ldc 237
    //   79: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   82: aload_0
    //   83: getfield 64	com/irainxun/wifilight/apsetting/model/ATCommand:enterCMDModeResponse	Ljava/lang/StringBuffer;
    //   86: invokevirtual 243	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   89: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   92: invokestatic 253	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   95: pop
    //   96: aload_0
    //   97: getfield 64	com/irainxun/wifilight/apsetting/model/ATCommand:enterCMDModeResponse	Ljava/lang/StringBuffer;
    //   100: invokevirtual 257	java/lang/StringBuffer:length	()I
    //   103: ifne +29 -> 132
    //   106: new 259	com/irainxun/wifilight/apsetting/model/ATCommand$7
    //   109: dup
    //   110: aload_0
    //   111: invokespecial 260	com/irainxun/wifilight/apsetting/model/ATCommand$7:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   114: iconst_1
    //   115: invokevirtual 263	com/irainxun/wifilight/apsetting/model/ATCommand$7:toTry	(Z)V
    //   118: return
    //   119: astore_3
    //   120: aload_3
    //   121: invokevirtual 266	java/lang/InterruptedException:printStackTrace	()V
    //   124: goto -55 -> 69
    //   127: astore_2
    //   128: aload_1
    //   129: monitorexit
    //   130: aload_2
    //   131: athrow
    //   132: aload_0
    //   133: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   136: iconst_1
    //   137: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   140: pop
    //   141: return
    //
    // Exception table:
    //   from	to	target	type
    //   59	69	119	java/lang/InterruptedException
    //   35	58	127	finally
    //   59	69	127	finally
    //   69	71	127	finally
    //   120	124	127	finally
    //   128	130	127	finally
  }

  public void exitCMDMode()
  {
    this.times = (1 + this.times);
    this.isCommonCMD = false;
    this.exitCMDModeResponse = null;
    this.udpUnicast.setListener(new UdpUnicast.UdpUnicastListener()
    {
      public void onReceived(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        ATCommand.this.exitCMDModeResponse = new String(paramAnonymousArrayOfByte, 0, paramAnonymousInt).trim();
      }
    });
    if (!this.udpUnicast.send("AT+NETP\r"))
      this.handler.sendEmptyMessage(4);
    do
    {
      return;
      waitReceiveResponse(4000L, this.exitCMDModeResponse);
      Log.d("ATCommand", "Response of get protocol info:" + this.exitCMDModeResponse);
      if (this.exitCMDModeResponse == null)
      {
        if (this.times < this.timesToTry)
        {
          exitCMDMode();
          return;
        }
        this.handler.sendEmptyMessage(4);
        return;
      }
      if (!this.exitCMDModeResponse.startsWith("+ok="))
        break label322;
      this.exitCMDModeResponse = this.exitCMDModeResponse.substring(4);
      this.protocol = Utils.decodeProtocol(this.exitCMDModeResponse);
      if (this.protocol == null)
      {
        this.handler.sendEmptyMessage(4);
        return;
      }
      this.exitCMDModeResponse = null;
      if (!this.udpUnicast.send("AT+ENTM\r"))
        break;
      waitReceiveResponse(5000L, this.exitCMDModeResponse);
      Log.d("ATCommand", "Response of set transparent transmission mode:" + this.exitCMDModeResponse);
      if ((this.exitCMDModeResponse == null) || (!this.exitCMDModeResponse.equals("+ok")))
      {
        this.handler.sendEmptyMessage(4);
        return;
      }
    }
    while (!this.exitCMDModeResponse.equals("+ok"));
    if (this.udpUnicast.send("AT+Q\r"))
    {
      this.handler.sendEmptyMessage(3);
      return;
    }
    this.handler.sendEmptyMessage(4);
    return;
    this.handler.sendEmptyMessage(4);
    return;
    label322: this.handler.sendEmptyMessage(4);
  }

  public void reload()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: aload_0
    //   3: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   6: iadd
    //   7: putfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield 205	com/irainxun/wifilight/apsetting/model/ATCommand:isCommonCMD	Z
    //   15: aload_0
    //   16: aconst_null
    //   17: putfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   20: aload_0
    //   21: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   24: new 317	com/irainxun/wifilight/apsetting/model/ATCommand$9
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 318	com/irainxun/wifilight/apsetting/model/ATCommand$9:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   32: invokevirtual 218	com/irainxun/wifilight/apsetting/net/UdpUnicast:setListener	(Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$UdpUnicastListener;)V
    //   35: aload_0
    //   36: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   39: ldc 220
    //   41: invokevirtual 224	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
    //   44: ifne +14 -> 58
    //   47: aload_0
    //   48: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   51: bipush 6
    //   53: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   56: pop
    //   57: return
    //   58: aload_0
    //   59: ldc2_w 319
    //   62: aload_0
    //   63: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   66: invokespecial 106	com/irainxun/wifilight/apsetting/model/ATCommand:waitReceiveResponse	(JLjava/lang/String;)V
    //   69: ldc 35
    //   71: new 235	java/lang/StringBuilder
    //   74: dup
    //   75: ldc_w 322
    //   78: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload_0
    //   82: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   85: invokevirtual 325	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   88: ldc_w 327
    //   91: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_0
    //   95: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   98: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 253	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   107: pop
    //   108: aload_0
    //   109: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   112: ifnonnull +38 -> 150
    //   115: aload_0
    //   116: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   119: aload_0
    //   120: getfield 68	com/irainxun/wifilight/apsetting/model/ATCommand:timesToTry	I
    //   123: if_icmpge +16 -> 139
    //   126: new 329	com/irainxun/wifilight/apsetting/model/ATCommand$10
    //   129: dup
    //   130: aload_0
    //   131: invokespecial 330	com/irainxun/wifilight/apsetting/model/ATCommand$10:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   134: iconst_1
    //   135: invokevirtual 331	com/irainxun/wifilight/apsetting/model/ATCommand$10:toTry	(Z)V
    //   138: return
    //   139: aload_0
    //   140: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   143: bipush 6
    //   145: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   148: pop
    //   149: return
    //   150: aload_0
    //   151: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   154: ldc_w 308
    //   157: invokevirtual 312	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   160: ifeq +123 -> 283
    //   163: aload_0
    //   164: aconst_null
    //   165: putfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   168: aload_0
    //   169: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   172: ldc_w 333
    //   175: invokevirtual 224	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
    //   178: ifeq +94 -> 272
    //   181: aload_0
    //   182: ldc2_w 334
    //   185: aload_0
    //   186: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   189: invokespecial 106	com/irainxun/wifilight/apsetting/model/ATCommand:waitReceiveResponse	(JLjava/lang/String;)V
    //   192: ldc 35
    //   194: new 235	java/lang/StringBuilder
    //   197: dup
    //   198: ldc_w 337
    //   201: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   204: aload_0
    //   205: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   208: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: invokestatic 253	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   217: pop
    //   218: aload_0
    //   219: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   222: ifnull +16 -> 238
    //   225: aload_0
    //   226: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   229: ldc_w 339
    //   232: invokevirtual 290	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   235: ifne +14 -> 249
    //   238: aload_0
    //   239: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   242: bipush 6
    //   244: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   247: pop
    //   248: return
    //   249: aload_0
    //   250: getfield 113	com/irainxun/wifilight/apsetting/model/ATCommand:reloadResponse	Ljava/lang/String;
    //   253: ldc_w 339
    //   256: invokevirtual 290	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   259: ifeq -202 -> 57
    //   262: aload_0
    //   263: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   266: iconst_5
    //   267: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   270: pop
    //   271: return
    //   272: aload_0
    //   273: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   276: bipush 6
    //   278: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   281: pop
    //   282: return
    //   283: aload_0
    //   284: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   287: bipush 6
    //   289: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   292: pop
    //   293: return
  }

  public void reset()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: aload_0
    //   5: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   8: iadd
    //   9: putfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield 205	com/irainxun/wifilight/apsetting/model/ATCommand:isCommonCMD	Z
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 122	com/irainxun/wifilight/apsetting/model/ATCommand:resetResponse	Ljava/lang/String;
    //   22: aload_0
    //   23: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   26: new 342	com/irainxun/wifilight/apsetting/model/ATCommand$11
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 343	com/irainxun/wifilight/apsetting/model/ATCommand$11:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   34: invokevirtual 218	com/irainxun/wifilight/apsetting/net/UdpUnicast:setListener	(Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$UdpUnicastListener;)V
    //   37: aload_0
    //   38: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   41: ldc 220
    //   43: invokevirtual 224	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
    //   46: ifne +16 -> 62
    //   49: aload_0
    //   50: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   53: bipush 8
    //   55: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   58: pop
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: aload_0
    //   63: ldc2_w 319
    //   66: aload_0
    //   67: getfield 122	com/irainxun/wifilight/apsetting/model/ATCommand:resetResponse	Ljava/lang/String;
    //   70: invokespecial 106	com/irainxun/wifilight/apsetting/model/ATCommand:waitReceiveResponse	(JLjava/lang/String;)V
    //   73: ldc 35
    //   75: new 235	java/lang/StringBuilder
    //   78: dup
    //   79: ldc_w 322
    //   82: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   89: invokevirtual 325	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   92: ldc_w 327
    //   95: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: aload_0
    //   99: getfield 122	com/irainxun/wifilight/apsetting/model/ATCommand:resetResponse	Ljava/lang/String;
    //   102: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokestatic 253	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   111: pop
    //   112: aload_0
    //   113: getfield 122	com/irainxun/wifilight/apsetting/model/ATCommand:resetResponse	Ljava/lang/String;
    //   116: ifnonnull +47 -> 163
    //   119: aload_0
    //   120: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   123: aload_0
    //   124: getfield 68	com/irainxun/wifilight/apsetting/model/ATCommand:timesToTry	I
    //   127: if_icmpge +23 -> 150
    //   130: new 345	com/irainxun/wifilight/apsetting/model/ATCommand$12
    //   133: dup
    //   134: aload_0
    //   135: invokespecial 346	com/irainxun/wifilight/apsetting/model/ATCommand$12:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   138: iconst_1
    //   139: invokevirtual 347	com/irainxun/wifilight/apsetting/model/ATCommand$12:toTry	(Z)V
    //   142: goto -83 -> 59
    //   145: astore_1
    //   146: aload_0
    //   147: monitorexit
    //   148: aload_1
    //   149: athrow
    //   150: aload_0
    //   151: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   154: bipush 8
    //   156: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   159: pop
    //   160: goto -101 -> 59
    //   163: aload_0
    //   164: getfield 122	com/irainxun/wifilight/apsetting/model/ATCommand:resetResponse	Ljava/lang/String;
    //   167: ldc_w 308
    //   170: invokevirtual 312	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   173: ifeq +42 -> 215
    //   176: aload_0
    //   177: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   180: ldc_w 349
    //   183: invokevirtual 224	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
    //   186: ifeq +16 -> 202
    //   189: aload_0
    //   190: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   193: bipush 7
    //   195: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   198: pop
    //   199: goto -140 -> 59
    //   202: aload_0
    //   203: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   206: bipush 8
    //   208: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   211: pop
    //   212: goto -153 -> 59
    //   215: aload_0
    //   216: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   219: bipush 8
    //   221: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   224: pop
    //   225: goto -166 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   2	59	145	finally
    //   62	142	145	finally
    //   150	160	145	finally
    //   163	199	145	finally
    //   202	212	145	finally
    //   215	225	145	finally
  }

  public void resetTimes()
  {
    this.times = 0;
  }

  public void send(String paramString)
  {
    if (!this.isCommonCMD)
    {
      this.udpUnicast.setListener(new UdpUnicast.UdpUnicastListener()
      {
        public void onReceived(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
        {
          Log.d("ATCommand", "onReceived[send]:" + new String(paramAnonymousArrayOfByte, 0, paramAnonymousInt));
          Message localMessage = ATCommand.this.handler.obtainMessage(9);
          Bundle localBundle = new Bundle();
          localBundle.putString("RESPONSE", new String(paramAnonymousArrayOfByte, 0, paramAnonymousInt));
          localMessage.setData(localBundle);
          ATCommand.this.handler.sendMessage(localMessage);
        }
      });
      this.isCommonCMD = true;
    }
    this.udpUnicast.send(paramString);
  }

  public void sendFile(final File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: aload_0
    //   3: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   6: iadd
    //   7: putfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield 205	com/irainxun/wifilight/apsetting/model/ATCommand:isCommonCMD	Z
    //   15: aload_0
    //   16: aconst_null
    //   17: putfield 94	com/irainxun/wifilight/apsetting/model/ATCommand:sendCMDFileResponse	Ljava/lang/String;
    //   20: aload_0
    //   21: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   24: new 357	com/irainxun/wifilight/apsetting/model/ATCommand$3
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 358	com/irainxun/wifilight/apsetting/model/ATCommand$3:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)V
    //   32: invokevirtual 218	com/irainxun/wifilight/apsetting/net/UdpUnicast:setListener	(Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$UdpUnicastListener;)V
    //   35: aload_0
    //   36: getfield 79	com/irainxun/wifilight/apsetting/model/ATCommand:udpUnicast	Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
    //   39: ldc 220
    //   41: invokevirtual 224	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
    //   44: ifne +14 -> 58
    //   47: aload_0
    //   48: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   51: bipush 11
    //   53: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   56: pop
    //   57: return
    //   58: aload_0
    //   59: ldc2_w 319
    //   62: aload_0
    //   63: getfield 94	com/irainxun/wifilight/apsetting/model/ATCommand:sendCMDFileResponse	Ljava/lang/String;
    //   66: invokespecial 106	com/irainxun/wifilight/apsetting/model/ATCommand:waitReceiveResponse	(JLjava/lang/String;)V
    //   69: ldc 35
    //   71: new 235	java/lang/StringBuilder
    //   74: dup
    //   75: ldc_w 322
    //   78: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   81: aload_0
    //   82: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   85: invokevirtual 325	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   88: ldc_w 327
    //   91: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: aload_0
    //   95: getfield 94	com/irainxun/wifilight/apsetting/model/ATCommand:sendCMDFileResponse	Ljava/lang/String;
    //   98: invokevirtual 281	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 247	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 253	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   107: pop
    //   108: aload_0
    //   109: getfield 94	com/irainxun/wifilight/apsetting/model/ATCommand:sendCMDFileResponse	Ljava/lang/String;
    //   112: ifnonnull +39 -> 151
    //   115: aload_0
    //   116: getfield 269	com/irainxun/wifilight/apsetting/model/ATCommand:times	I
    //   119: aload_0
    //   120: getfield 68	com/irainxun/wifilight/apsetting/model/ATCommand:timesToTry	I
    //   123: if_icmpge +17 -> 140
    //   126: new 360	com/irainxun/wifilight/apsetting/model/ATCommand$4
    //   129: dup
    //   130: aload_0
    //   131: aload_1
    //   132: invokespecial 363	com/irainxun/wifilight/apsetting/model/ATCommand$4:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;Ljava/io/File;)V
    //   135: iconst_1
    //   136: invokevirtual 364	com/irainxun/wifilight/apsetting/model/ATCommand$4:toTry	(Z)V
    //   139: return
    //   140: aload_0
    //   141: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   144: bipush 11
    //   146: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   149: pop
    //   150: return
    //   151: aload_0
    //   152: getfield 94	com/irainxun/wifilight/apsetting/model/ATCommand:sendCMDFileResponse	Ljava/lang/String;
    //   155: ldc_w 308
    //   158: invokevirtual 312	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   161: ifeq +23 -> 184
    //   164: new 198	java/lang/Thread
    //   167: dup
    //   168: new 366	com/irainxun/wifilight/apsetting/model/ATCommand$5
    //   171: dup
    //   172: aload_0
    //   173: aload_1
    //   174: invokespecial 367	com/irainxun/wifilight/apsetting/model/ATCommand$5:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;Ljava/io/File;)V
    //   177: invokespecial 370	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   180: invokevirtual 373	java/lang/Thread:start	()V
    //   183: return
    //   184: aload_0
    //   185: getfield 75	com/irainxun/wifilight/apsetting/model/ATCommand:handler	Landroid/os/Handler;
    //   188: bipush 11
    //   190: invokevirtual 228	android/os/Handler:sendEmptyMessage	(I)Z
    //   193: pop
    //   194: return
  }

  public void setListener(ATCommandListener paramATCommandListener)
  {
    this.listener = paramATCommandListener;
  }

  public void setUdpUnicast(UdpUnicast paramUdpUnicast)
  {
    this.udpUnicast = paramUdpUnicast;
  }

  private abstract class CMDModeTryer
  {
    private CMDModeTryer()
    {
    }

    abstract void onResult(boolean paramBoolean);

    // ERROR //
    void toTry(boolean paramBoolean)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   4: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   7: iconst_0
      //   8: invokevirtual 35	java/lang/StringBuffer:setLength	(I)V
      //   11: iload_1
      //   12: ifeq +53 -> 65
      //   15: aload_0
      //   16: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   19: invokestatic 38	com/irainxun/wifilight/apsetting/model/ATCommand:access$1	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
      //   22: new 40	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer$1
      //   25: dup
      //   26: aload_0
      //   27: invokespecial 43	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer$1:<init>	(Lcom/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer;)V
      //   30: invokevirtual 49	com/irainxun/wifilight/apsetting/net/UdpUnicast:setListener	(Lcom/irainxun/wifilight/apsetting/net/UdpUnicast$UdpUnicastListener;)V
      //   33: aload_0
      //   34: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   37: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   40: astore_2
      //   41: aload_2
      //   42: monitorenter
      //   43: aload_0
      //   44: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   47: invokestatic 38	com/irainxun/wifilight/apsetting/model/ATCommand:access$1	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
      //   50: ldc 51
      //   52: invokevirtual 55	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
      //   55: ifne +11 -> 66
      //   58: aload_0
      //   59: iconst_0
      //   60: invokevirtual 57	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:onResult	(Z)V
      //   63: aload_2
      //   64: monitorexit
      //   65: return
      //   66: aload_0
      //   67: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   70: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   73: ldc2_w 58
      //   76: invokevirtual 63	java/lang/Object:wait	(J)V
      //   79: aload_2
      //   80: monitorexit
      //   81: ldc 65
      //   83: new 67	java/lang/StringBuilder
      //   86: dup
      //   87: ldc 69
      //   89: invokespecial 72	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   92: aload_0
      //   93: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   96: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   99: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   102: invokevirtual 80	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   105: invokestatic 86	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
      //   108: pop
      //   109: aload_0
      //   110: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   113: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   116: invokevirtual 90	java/lang/StringBuffer:length	()I
      //   119: ifne +24 -> 143
      //   122: aload_0
      //   123: iconst_0
      //   124: invokevirtual 57	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:onResult	(Z)V
      //   127: return
      //   128: astore 4
      //   130: aload 4
      //   132: invokevirtual 93	java/lang/InterruptedException:printStackTrace	()V
      //   135: goto -56 -> 79
      //   138: astore_3
      //   139: aload_2
      //   140: monitorexit
      //   141: aload_3
      //   142: athrow
      //   143: aload_0
      //   144: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   147: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   150: invokevirtual 94	java/lang/StringBuffer:toString	()Ljava/lang/String;
      //   153: ldc 96
      //   155: invokevirtual 102	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
      //   158: astore 6
      //   160: aload 6
      //   162: ifnull +173 -> 335
      //   165: aload 6
      //   167: arraylength
      //   168: ifle +167 -> 335
      //   171: aload 6
      //   173: iconst_0
      //   174: aaload
      //   175: invokestatic 107	com/irainxun/wifilight/apsetting/utils/Utils:isIP	(Ljava/lang/String;)Z
      //   178: ifeq +157 -> 335
      //   181: aload_0
      //   182: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   185: invokestatic 38	com/irainxun/wifilight/apsetting/model/ATCommand:access$1	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
      //   188: ldc 109
      //   190: invokevirtual 55	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
      //   193: pop
      //   194: aload_0
      //   195: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   198: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   201: astore 8
      //   203: aload 8
      //   205: monitorenter
      //   206: aload_0
      //   207: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   210: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   213: ldc2_w 58
      //   216: invokevirtual 63	java/lang/Object:wait	(J)V
      //   219: aload 8
      //   221: monitorexit
      //   222: aload_0
      //   223: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   226: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   229: iconst_0
      //   230: invokevirtual 35	java/lang/StringBuffer:setLength	(I)V
      //   233: aload_0
      //   234: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   237: invokestatic 38	com/irainxun/wifilight/apsetting/model/ATCommand:access$1	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Lcom/irainxun/wifilight/apsetting/net/UdpUnicast;
      //   240: ldc 111
      //   242: invokevirtual 55	com/irainxun/wifilight/apsetting/net/UdpUnicast:send	(Ljava/lang/String;)Z
      //   245: pop
      //   246: aload_0
      //   247: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   250: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   253: astore 12
      //   255: aload 12
      //   257: monitorenter
      //   258: aload_0
      //   259: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   262: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   265: ldc2_w 112
      //   268: invokevirtual 63	java/lang/Object:wait	(J)V
      //   271: aload 12
      //   273: monitorexit
      //   274: aload_0
      //   275: getfield 10	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:this$0	Lcom/irainxun/wifilight/apsetting/model/ATCommand;
      //   278: invokestatic 29	com/irainxun/wifilight/apsetting/model/ATCommand:access$0	(Lcom/irainxun/wifilight/apsetting/model/ATCommand;)Ljava/lang/StringBuffer;
      //   281: invokevirtual 90	java/lang/StringBuffer:length	()I
      //   284: ifeq +45 -> 329
      //   287: aload_0
      //   288: iconst_1
      //   289: invokevirtual 57	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:onResult	(Z)V
      //   292: return
      //   293: astore 10
      //   295: aload 10
      //   297: invokevirtual 93	java/lang/InterruptedException:printStackTrace	()V
      //   300: goto -81 -> 219
      //   303: astore 9
      //   305: aload 8
      //   307: monitorexit
      //   308: aload 9
      //   310: athrow
      //   311: astore 14
      //   313: aload 14
      //   315: invokevirtual 93	java/lang/InterruptedException:printStackTrace	()V
      //   318: goto -47 -> 271
      //   321: astore 13
      //   323: aload 12
      //   325: monitorexit
      //   326: aload 13
      //   328: athrow
      //   329: aload_0
      //   330: iconst_0
      //   331: invokevirtual 57	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:onResult	(Z)V
      //   334: return
      //   335: aload_0
      //   336: iconst_0
      //   337: invokevirtual 57	com/irainxun/wifilight/apsetting/model/ATCommand$CMDModeTryer:onResult	(Z)V
      //   340: return
      //
      // Exception table:
      //   from	to	target	type
      //   66	79	128	java/lang/InterruptedException
      //   43	65	138	finally
      //   66	79	138	finally
      //   79	81	138	finally
      //   130	135	138	finally
      //   139	141	138	finally
      //   206	219	293	java/lang/InterruptedException
      //   206	219	303	finally
      //   219	222	303	finally
      //   295	300	303	finally
      //   305	308	303	finally
      //   258	271	311	java/lang/InterruptedException
      //   258	271	321	finally
      //   271	274	321	finally
      //   313	318	321	finally
      //   323	326	321	finally
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */