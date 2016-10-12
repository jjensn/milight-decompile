package com.hiflying.smartlink.v3;

import android.content.Context;
import android.widget.Toast;
import com.hiflying.smartlink.R1;
import com.hiflying.smartlink.SmartLinkedModule;

class SnifferSmartLinkerActivity$5
  implements Runnable
{
  SnifferSmartLinkerActivity$5(SnifferSmartLinkerActivity paramSnifferSmartLinkerActivity, SmartLinkedModule paramSmartLinkedModule)
  {
  }

  public void run()
  {
    Context localContext = this.this$0.getApplicationContext();
    SnifferSmartLinkerActivity localSnifferSmartLinkerActivity = this.this$0;
    int i = R1.string("hiflying_smartlinker_new_module_found");
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.val$module.getMac();
    arrayOfObject[1] = this.val$module.getModuleIP();
    Toast.makeText(localContext, localSnifferSmartLinkerActivity.getString(i, arrayOfObject), 0).show();
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.v3.SnifferSmartLinkerActivity.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */