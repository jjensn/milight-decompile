package cn.jpush.a.a;

import com.google.protobuf.jpush.c;
import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bb extends i<ba, bb>
{
  private int a;
  private long b;
  private int c;
  private long d;
  private long e;
  private List<Long> f = Collections.emptyList();
  private c g = c.a;
  private int h;
  private int i;
  private int j;

  private bb()
  {
  }

  private bb c(d paramd, g paramg)
  {
    while (true)
    {
      int k = paramd.a();
      switch (k)
      {
      default:
        if (paramd.b(k))
          continue;
      case 0:
        return this;
      case 8:
        this.a = (0x1 | this.a);
        this.b = paramd.b();
        break;
      case 16:
        this.a = (0x2 | this.a);
        this.c = paramd.c();
        break;
      case 24:
        this.a = (0x4 | this.a);
        this.d = paramd.b();
        break;
      case 32:
        this.a = (0x8 | this.a);
        this.e = paramd.b();
        break;
      case 40:
        g();
        this.f.add(Long.valueOf(paramd.b()));
        break;
      case 42:
        int m = paramd.c(paramd.f());
        while (paramd.g() > 0)
        {
          long l = paramd.b();
          g();
          this.f.add(Long.valueOf(l));
        }
        paramd.d(m);
        break;
      case 50:
        this.a = (0x20 | this.a);
        this.g = paramd.d();
        break;
      case 56:
        this.a = (0x40 | this.a);
        this.h = paramd.e();
        break;
      case 64:
        this.a = (0x80 | this.a);
        this.i = paramd.c();
        break;
      case 72:
      }
      this.a = (0x100 | this.a);
      this.j = paramd.c();
    }
  }

  private bb f()
  {
    return new bb().a(b());
  }

  private void g()
  {
    if ((0x10 & this.a) != 16)
    {
      this.f = new ArrayList(this.f);
      this.a = (0x10 | this.a);
    }
  }

  public final ba a()
  {
    ba localba = b();
    if (!localba.s())
      throw new m();
    return localba;
  }

  public final bb a(int paramInt)
  {
    this.a = (0x2 | this.a);
    this.c = paramInt;
    return this;
  }

  public final bb a(long paramLong)
  {
    this.a = (0x1 | this.a);
    this.b = paramLong;
    return this;
  }

  public final bb a(ba paramba)
  {
    if (paramba == ba.a());
    label142: 
    do
    {
      return this;
      if (paramba.b())
        a(paramba.d());
      if (paramba.e())
        a(paramba.f());
      if (paramba.g())
        b(paramba.h());
      if (paramba.i())
        c(paramba.j());
      if (!ba.b(paramba).isEmpty())
      {
        if (!this.f.isEmpty())
          break label142;
        this.f = ba.b(paramba);
        this.a = (0xFFFFFFEF & this.a);
      }
      while (paramba.k())
      {
        c localc = paramba.l();
        if (localc == null)
        {
          throw new NullPointerException();
          g();
          this.f.addAll(ba.b(paramba));
        }
        else
        {
          this.a = (0x20 | this.a);
          this.g = localc;
        }
      }
      if (paramba.m())
      {
        int n = paramba.n();
        this.a = (0x40 | this.a);
        this.h = n;
      }
      if (paramba.o())
      {
        int m = paramba.p();
        this.a = (0x80 | this.a);
        this.i = m;
      }
    }
    while (!paramba.q());
    int k = paramba.r();
    this.a = (0x100 | this.a);
    this.j = k;
    return this;
  }

  public final ba b()
  {
    int k = 1;
    ba localba = new ba(this, (byte)0);
    int m = this.a;
    if ((m & 0x1) == k);
    while (true)
    {
      ba.a(localba, this.b);
      if ((m & 0x2) == 2)
        k |= 2;
      ba.a(localba, this.c);
      if ((m & 0x4) == 4)
        k |= 4;
      ba.b(localba, this.d);
      if ((m & 0x8) == 8)
        k |= 8;
      ba.c(localba, this.e);
      if ((0x10 & this.a) == 16)
      {
        this.f = Collections.unmodifiableList(this.f);
        this.a = (0xFFFFFFEF & this.a);
      }
      ba.a(localba, this.f);
      if ((m & 0x20) == 32)
        k |= 16;
      ba.a(localba, this.g);
      if ((m & 0x40) == 64)
        k |= 32;
      ba.b(localba, this.h);
      if ((m & 0x80) == 128)
        k |= 64;
      ba.c(localba, this.i);
      if ((m & 0x100) == 256)
        k |= 128;
      ba.d(localba, this.j);
      ba.e(localba, k);
      return localba;
      k = 0;
    }
  }

  public final bb b(long paramLong)
  {
    this.a = (0x4 | this.a);
    this.d = paramLong;
    return this;
  }

  public final bb c(long paramLong)
  {
    this.a = (0x8 | this.a);
    this.e = paramLong;
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.bb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */