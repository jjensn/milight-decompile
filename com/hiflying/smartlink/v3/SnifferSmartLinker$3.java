package com.hiflying.smartlink.v3;

import android.util.Log;

class SnifferSmartLinker$3
  implements Runnable
{
  SnifferSmartLinker$3(SnifferSmartLinker paramSnifferSmartLinker)
  {
  }

  public void run()
  {
    while (true)
    {
      if (!SnifferSmartLinker.access$0(this.this$0))
      {
        Log.e(SnifferSmartLinker.access$4(this.this$0), "StopConnet");
        this.this$0.stop();
        return;
      }
      SnifferSmartLinker.access$10(this.this$0);
    }
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinker.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */