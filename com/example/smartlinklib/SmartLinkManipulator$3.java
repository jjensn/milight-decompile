package com.example.smartlinklib;

import android.util.Log;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Set;

class SmartLinkManipulator$3 extends Thread
{
  SmartLinkManipulator$3(SmartLinkManipulator paramSmartLinkManipulator)
  {
  }

  public void run()
  {
    while (true)
    {
      if (!this.this$0.isConnecting)
      {
        Log.e(SmartLinkManipulator.access$2(this.this$0), "end RECV");
        this.this$0.StopConnection();
        label30: return;
      }
      try
      {
        SmartLinkManipulator.access$5(this.this$0).receive(SmartLinkManipulator.access$6(this.this$0));
        int i = SmartLinkManipulator.access$6(this.this$0).getLength();
        if (i > 0)
        {
          String str1 = new String(SmartLinkManipulator.access$7(this.this$0), 0, i, "UTF-8");
          if (str1.contains("smart_config"))
          {
            Log.e("RECV", "smart_config");
            ModuleInfo localModuleInfo = new ModuleInfo();
            localModuleInfo.setMac(str1.replace("smart_config", "").trim());
            String str2 = SmartLinkManipulator.access$6(this.this$0).getAddress().getHostAddress();
            if ((str2.equalsIgnoreCase("0.0.0.0")) || (str2.contains(":")))
              break label30;
            localModuleInfo.setModuleIP(str2);
            if (!SmartLinkManipulator.access$0(this.this$0).contains(localModuleInfo.getMac()))
            {
              SmartLinkManipulator.access$0(this.this$0).add(localModuleInfo.getMac());
              SmartLinkManipulator.access$1(this.this$0).onConnect(localModuleInfo);
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
 * Qualified Name:     com.example.smartlinklib.SmartLinkManipulator.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */