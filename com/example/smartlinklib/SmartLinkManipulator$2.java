package com.example.smartlinklib;

import android.util.Log;

class SmartLinkManipulator$2
  implements Runnable
{
  SmartLinkManipulator$2(SmartLinkManipulator paramSmartLinkManipulator)
  {
  }

  public void run()
  {
    while (true)
    {
      if (!this.this$0.isConnecting)
      {
        Log.e(SmartLinkManipulator.access$2(this.this$0), "StopConnet");
        this.this$0.StopConnection();
        return;
      }
      SmartLinkManipulator.access$4(this.this$0);
    }
  }
}

/* Location:
 * Qualified Name:     com.example.smartlinklib.SmartLinkManipulator.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */