package cn.jpush.android.util;

import android.content.Context;
import org.json.JSONArray;

final class ai
  implements Runnable
{
  Context a;
  JSONArray b;

  public ai(Context paramContext, JSONArray paramJSONArray)
  {
    this.a = paramContext;
    this.b = paramJSONArray;
  }

  public final void run()
  {
    ah.b(this.a, this.b);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */