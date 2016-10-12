package com.irainxun.wifilight;

import android.util.Log;
import com.irainxun.wifilight.apsetting.model.Module;
import com.irainxun.wifilight.apsetting.net.UdpBroadcast;
import com.irainxun.wifilight.apsetting.utils.Utils;
import java.net.DatagramPacket;
import java.util.List;

class ConfigurationActivity$4 extends UdpBroadcast
{
  ConfigurationActivity$4(ConfigurationActivity paramConfigurationActivity)
  {
  }

  public void onReceived(List<DatagramPacket> paramList)
  {
    ConfigurationActivity.access$5(this.this$0).close();
    ConfigurationActivity.access$6(this.this$0, Utils.decodePackets(this.this$0, paramList));
    if ((ConfigurationActivity.access$7(this.this$0) != null) && (ConfigurationActivity.access$7(this.this$0).size() > 0) && (ConfigurationActivity.access$7(this.this$0).get(0) != null))
    {
      Log.d("debug", "ScanBroadcast: save the module info in local file:" + ConfigurationActivity.access$7(this.this$0).get(0));
      Utils.saveDevice(this.this$0, ConfigurationActivity.access$8(this.this$0), (Module)ConfigurationActivity.access$7(this.this$0).get(0));
      return;
    }
    Log.d("debug", "ScanBroadcast: not find any module info");
    ConfigurationActivity.access$5(this.this$0).open();
    ConfigurationActivity.access$5(this.this$0).send(Utils.getCMDScanModules(this.this$0));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.ConfigurationActivity.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */