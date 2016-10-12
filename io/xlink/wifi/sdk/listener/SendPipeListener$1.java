package io.xlink.wifi.sdk.listener;

import io.xlink.wifi.sdk.encoder.e;

class SendPipeListener$1
  implements Runnable
{
  SendPipeListener$1(SendPipeListener paramSendPipeListener, e parame)
  {
  }

  public void run()
  {
    this.b.onSendLocalPipeData(this.a.a, this.a.b, Math.abs(this.a.c));
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.listener.SendPipeListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */