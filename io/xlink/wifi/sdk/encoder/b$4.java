package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;

class b$4 extends io.xlink.wifi.sdk.event.a
{
  b$4(b paramb)
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
        parame.a = b.e(this.a);
        parame.b = 200;
        this.a.a(parame);
      }
      return;
      this.a.a("scan by mac succeed :" + parame.a.getAddress());
      i = io.xlink.wifi.sdk.a.a().a(parame.a, b.b(this.a), b.d(this.a), 2);
      continue;
      i = io.xlink.wifi.sdk.a.a().a(b.e(this.a), b.b(this.a), b.d(this.a), 2);
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.b.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */