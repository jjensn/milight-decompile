package com.irainxun.wifilight;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

class JG_ExampleUtil$1
  implements Runnable
{
  JG_ExampleUtil$1(Context paramContext, String paramString)
  {
  }

  public void run()
  {
    Looper.prepare();
    Toast.makeText(this.val$context, this.val$toast, 0).show();
    Looper.loop();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.JG_ExampleUtil.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */