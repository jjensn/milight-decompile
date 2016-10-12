package com.hiflying.smartlink.v3;

import android.util.Log;
import com.hiflying.smartlink.OnSmartLinkListener;
import com.hiflying.smartlink.SmartLinkedModule;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Set;

class SnifferSmartLinker$2 extends Thread
{
  SnifferSmartLinker$2(SnifferSmartLinker paramSnifferSmartLinker)
  {
  }

  public void run()
  {
    while (true)
    {
      if (!SnifferSmartLinker.access$0(this.this$0))
      {
        Log.e(SnifferSmartLinker.access$4(this.this$0), "end RECV");
        this.this$0.stop();
        label30: return;
      }
      try
      {
        SnifferSmartLinker.access$7(this.this$0).receive(SnifferSmartLinker.access$8(this.this$0));
        int i = SnifferSmartLinker.access$8(this.this$0).getLength();
        if (i > 0)
        {
          String str1 = new String(SnifferSmartLinker.access$9(this.this$0), 0, i, "UTF-8");
          if (str1.contains("smart_config"))
          {
            Log.e("RECV", "smart_config");
            SmartLinkedModule localSmartLinkedModule = new SmartLinkedModule();
            localSmartLinkedModule.setMac(str1.replace("smart_config", "").trim());
            String str2 = SnifferSmartLinker.access$8(this.this$0).getAddress().getHostAddress();
            if ((str2.equalsIgnoreCase("0.0.0.0")) || (str2.contains(":")))
              break label30;
            localSmartLinkedModule.setModuleIP(str2);
            if (!SnifferSmartLinker.access$3(this.this$0).contains(localSmartLinkedModule.getMac()))
            {
              SnifferSmartLinker.access$3(this.this$0).add(localSmartLinkedModule.getMac());
              if (SnifferSmartLinker.access$2(this.this$0) != null)
                SnifferSmartLinker.access$2(this.this$0).onLinked(localSmartLinkedModule);
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

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinker.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */