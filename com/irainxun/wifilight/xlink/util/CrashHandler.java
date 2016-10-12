package com.irainxun.wifilight.xlink.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import com.irainxun.wifilight.xlink.MyApp;
import io.xlink.wifi.sdk.XlinkAgent;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrashHandler
  implements Thread.UncaughtExceptionHandler
{
  private static final String DISK_CACHE_PATH = "/" + MyApp.getApp().getPackageName() + "/";
  private static CrashHandler crashHandler;
  private Thread.UncaughtExceptionHandler handler = Thread.getDefaultUncaughtExceptionHandler();

  private CrashHandler(Context paramContext)
  {
    Thread.setDefaultUncaughtExceptionHandler(this);
  }

  public static CrashHandler init(Context paramContext)
  {
    if (crashHandler == null)
      crashHandler = new CrashHandler(paramContext);
    return crashHandler;
  }

  // ERROR //
  private void write2ErrorLog(String paramString)
  {
    // Byte code:
    //   0: new 67	java/io/File
    //   3: dup
    //   4: new 16	java/lang/StringBuilder
    //   7: dup
    //   8: aload_0
    //   9: invokevirtual 70	com/irainxun/wifilight/xlink/util/CrashHandler:getFilePath	()Ljava/lang/String;
    //   12: invokestatic 76	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   15: invokespecial 22	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   18: ldc 78
    //   20: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   29: astore_2
    //   30: aconst_null
    //   31: astore_3
    //   32: aload_2
    //   33: invokevirtual 83	java/io/File:exists	()Z
    //   36: istore 8
    //   38: aconst_null
    //   39: astore_3
    //   40: iload 8
    //   42: ifeq +43 -> 85
    //   45: aload_2
    //   46: invokevirtual 86	java/io/File:delete	()Z
    //   49: pop
    //   50: aload_2
    //   51: invokevirtual 89	java/io/File:createNewFile	()Z
    //   54: pop
    //   55: new 91	java/io/FileOutputStream
    //   58: dup
    //   59: aload_2
    //   60: invokespecial 94	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   63: astore 11
    //   65: aload 11
    //   67: aload_1
    //   68: invokevirtual 98	java/lang/String:getBytes	()[B
    //   71: invokevirtual 102	java/io/FileOutputStream:write	([B)V
    //   74: aload 11
    //   76: ifnull +74 -> 150
    //   79: aload 11
    //   81: invokevirtual 105	java/io/FileOutputStream:close	()V
    //   84: return
    //   85: aload_2
    //   86: invokevirtual 109	java/io/File:getParentFile	()Ljava/io/File;
    //   89: invokevirtual 112	java/io/File:mkdirs	()Z
    //   92: pop
    //   93: goto -43 -> 50
    //   96: astore 6
    //   98: aload 6
    //   100: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   103: aload_3
    //   104: ifnull -20 -> 84
    //   107: aload_3
    //   108: invokevirtual 105	java/io/FileOutputStream:close	()V
    //   111: return
    //   112: astore 7
    //   114: aload 7
    //   116: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   119: return
    //   120: astore 4
    //   122: aload_3
    //   123: ifnull +7 -> 130
    //   126: aload_3
    //   127: invokevirtual 105	java/io/FileOutputStream:close	()V
    //   130: aload 4
    //   132: athrow
    //   133: astore 5
    //   135: aload 5
    //   137: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   140: goto -10 -> 130
    //   143: astore 12
    //   145: aload 12
    //   147: invokevirtual 115	java/lang/Exception:printStackTrace	()V
    //   150: return
    //   151: astore 4
    //   153: aload 11
    //   155: astore_3
    //   156: goto -34 -> 122
    //   159: astore 6
    //   161: aload 11
    //   163: astore_3
    //   164: goto -66 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   32	38	96	java/lang/Exception
    //   45	50	96	java/lang/Exception
    //   50	65	96	java/lang/Exception
    //   85	93	96	java/lang/Exception
    //   107	111	112	java/lang/Exception
    //   32	38	120	finally
    //   45	50	120	finally
    //   50	65	120	finally
    //   85	93	120	finally
    //   98	103	120	finally
    //   126	130	133	java/lang/Exception
    //   79	84	143	java/lang/Exception
    //   65	74	151	finally
    //   65	74	159	java/lang/Exception
  }

  public String getFilePath()
  {
    if (Environment.getExternalStorageState().equals("mounted"));
    for (String str = Environment.getExternalStorageDirectory() + DISK_CACHE_PATH; ; str = MyApp.getApp().getCacheDir() + DISK_CACHE_PATH)
    {
      File localFile = new File(str);
      if (!localFile.exists())
        localFile.mkdirs();
      return str;
    }
  }

  @SuppressLint({"SimpleDateFormat"})
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Date: ").append(localSimpleDateFormat.format(new Date())).append("\n");
    localStringBuilder.append("===========\n");
    localStringBuilder.append("Stacktrace:\n\n");
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    localStringBuilder.append(localStringWriter.toString());
    localStringBuilder.append("===========\n");
    localPrintWriter.close();
    write2ErrorLog(localStringBuilder.toString());
    if (this.handler != null)
      this.handler.uncaughtException(paramThread, paramThrowable);
    XlinkAgent.getInstance().stop();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.util.CrashHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */