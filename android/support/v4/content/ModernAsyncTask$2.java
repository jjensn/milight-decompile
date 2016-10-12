package android.support.v4.content;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class ModernAsyncTask$2 extends ModernAsyncTask.WorkerRunnable<Params, Result>
{
  ModernAsyncTask$2(ModernAsyncTask paramModernAsyncTask)
  {
    super(null);
  }

  public Result call()
    throws Exception
  {
    ModernAsyncTask.access$200(this.this$0).set(true);
    Process.setThreadPriority(10);
    return ModernAsyncTask.access$300(this.this$0, this.this$0.doInBackground(this.mParams));
  }
}

/* Location:
 * Qualified Name:     android.support.v4.content.ModernAsyncTask.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */