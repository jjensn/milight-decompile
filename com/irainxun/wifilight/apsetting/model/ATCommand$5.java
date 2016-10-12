package com.irainxun.wifilight.apsetting.model;

import android.os.Handler;
import android.util.Log;
import com.irainxun.wifilight.apsetting.net.UdpUnicast;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class ATCommand$5
  implements Runnable
{
  ATCommand$5(ATCommand paramATCommand, File paramFile)
  {
  }

  public void run()
  {
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader(this.val$file));
      int i = 1;
      String str1 = localBufferedReader.readLine();
      if (str1 == null);
      while (true)
      {
        if (i == 0)
          return;
        ATCommand.access$10(this.this$0).sendEmptyMessage(10);
        return;
        String str2 = str1.trim();
        ATCommand.access$13(this.this$0, null);
        Log.d("ATCommand", "send cmd:" + str2);
        ATCommand.access$14(this.this$0, ">" + str2 + "\n");
        if (!ATCommand.access$1(this.this$0).send(Utils.gernerateCMD(str2)))
        {
          Log.w("ATCommand", "Send cmd fail!");
          ATCommand.access$10(this.this$0).sendEmptyMessage(11);
          i = 0;
        }
        else
        {
          ATCommand.access$16(this.this$0, 6000L, ATCommand.access$15(this.this$0));
          Log.d("ATCommand", "Response of cmd[" + str2 + "]:" + ATCommand.access$15(this.this$0));
          if (ATCommand.access$15(this.this$0) != null)
            ATCommand.access$14(this.this$0, ATCommand.access$12(this.this$0));
          if ((ATCommand.access$15(this.this$0) != null) && (ATCommand.access$15(this.this$0).startsWith("+ok")))
            break;
          ATCommand.access$10(this.this$0).sendEmptyMessage(11);
          i = 0;
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      ATCommand.access$10(this.this$0).sendEmptyMessage(11);
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommand.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */