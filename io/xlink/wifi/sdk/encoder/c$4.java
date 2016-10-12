package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;

class c$4 extends io.xlink.wifi.sdk.event.a
{
  c$4(c paramc)
  {
  }

  public void onResponse(e parame)
  {
    int i = -1;
    switch (parame.b)
    {
    default:
    case 0:
    case -100:
    }
    while (true)
    {
      if (i < 0)
      {
        this.a.a("call handshakeWithDevice fail code:" + i);
        parame.a = c.e(this.a);
        parame.b = 200;
        this.a.a(parame);
      }
      return;
      this.a.a("scan by mac succeed :" + parame.a.getAddress());
      i = io.xlink.wifi.sdk.a.a().a(parame.a, c.b(this.a), c.d(this.a), 2);
      continue;
      i = io.xlink.wifi.sdk.a.a().a(c.e(this.a), c.b(this.a), c.d(this.a), 2);
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.c.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */