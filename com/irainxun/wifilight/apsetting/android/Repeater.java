package com.irainxun.wifilight.apsetting.android;

import android.os.Handler;
import android.os.Message;

public abstract class Repeater extends Handler
{
  private long delay;

  public Repeater(long paramLong)
  {
    this.delay = paramLong;
  }

  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    repeateAction();
    sendEmptyMessageDelayed(0, this.delay);
  }

  public void pause()
  {
    removeMessages(0);
  }

  public abstract void repeateAction();

  public void resume()
  {
    if (!hasMessages(0))
      sendEmptyMessage(0);
  }

  public void resumeWithDelay()
  {
    if (!hasMessages(0))
      sendEmptyMessageDelayed(0, this.delay);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.Repeater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */