package cn.jpush.a.a;

import com.google.protobuf.jpush.e;

public final class ab extends com.google.protobuf.jpush.h
{
  private static final ab a;
  private ai A;
  private as B;
  private byte C = -1;
  private int D = -1;
  private int b;
  private bl c;
  private bn d;
  private bi e;
  private be f;
  private d g;
  private h h;
  private j i;
  private o j;
  private s k;
  private m l;
  private q m;
  private u n;
  private ba o;
  private aq p;
  private bc q;
  private ay r;
  private b s;
  private f t;
  private af u;
  private bp v;
  private am w;
  private aw x;
  private ak y;
  private au z;

  static
  {
    ab localab = new ab();
    a = localab;
    localab.c = bl.a();
    localab.d = bn.a();
    localab.e = bi.a();
    localab.f = be.a();
    localab.g = d.a();
    localab.h = h.a();
    localab.i = j.a();
    localab.j = o.a();
    localab.k = s.a();
    localab.l = m.a();
    localab.m = q.a();
    localab.n = u.a();
    localab.o = ba.a();
    localab.p = aq.a();
    localab.q = bc.a();
    localab.r = ay.a();
    localab.s = b.a();
    localab.t = f.a();
    localab.u = af.a();
    localab.v = bp.a();
    localab.w = am.a();
    localab.x = aw.a();
    localab.y = ak.a();
    localab.z = au.a();
    localab.A = ai.a();
    localab.B = as.a();
  }

  private ab()
  {
  }

  private ab(ac paramac)
  {
    super((byte)0);
  }

  public static ab a()
  {
    return a;
  }

  public static ac a(ab paramab)
  {
    return ac.e().a(paramab);
  }

  public static ac ad()
  {
    return ac.e();
  }

  public final boolean A()
  {
    return (0x1000 & this.b) == 4096;
  }

  public final ba B()
  {
    return this.o;
  }

  public final boolean C()
  {
    return (0x2000 & this.b) == 8192;
  }

  public final aq D()
  {
    return this.p;
  }

  public final boolean E()
  {
    return (0x4000 & this.b) == 16384;
  }

  public final bc F()
  {
    return this.q;
  }

  public final boolean G()
  {
    return (0x8000 & this.b) == 32768;
  }

  public final ay H()
  {
    return this.r;
  }

  public final boolean I()
  {
    return (0x10000 & this.b) == 65536;
  }

  public final b J()
  {
    return this.s;
  }

  public final boolean K()
  {
    return (0x20000 & this.b) == 131072;
  }

  public final f L()
  {
    return this.t;
  }

  public final boolean M()
  {
    return (0x40000 & this.b) == 262144;
  }

  public final af N()
  {
    return this.u;
  }

  public final boolean O()
  {
    return (0x80000 & this.b) == 524288;
  }

  public final bp P()
  {
    return this.v;
  }

  public final boolean Q()
  {
    return (0x100000 & this.b) == 1048576;
  }

  public final am R()
  {
    return this.w;
  }

  public final boolean S()
  {
    return (0x200000 & this.b) == 2097152;
  }

  public final aw T()
  {
    return this.x;
  }

  public final boolean U()
  {
    return (0x400000 & this.b) == 4194304;
  }

  public final ak V()
  {
    return this.y;
  }

  public final boolean W()
  {
    return (0x800000 & this.b) == 8388608;
  }

  public final au X()
  {
    return this.z;
  }

  public final boolean Y()
  {
    return (0x1000000 & this.b) == 16777216;
  }

  public final ai Z()
  {
    return this.A;
  }

  public final void a(e parame)
  {
    c();
    if ((0x1 & this.b) == 1)
      parame.a(1, this.c);
    if ((0x2 & this.b) == 2)
      parame.a(2, this.d);
    if ((0x4 & this.b) == 4)
      parame.a(3, this.e);
    if ((0x8 & this.b) == 8)
      parame.a(4, this.f);
    if ((0x10 & this.b) == 16)
      parame.a(5, this.g);
    if ((0x20 & this.b) == 32)
      parame.a(6, this.h);
    if ((0x40 & this.b) == 64)
      parame.a(7, this.i);
    if ((0x80 & this.b) == 128)
      parame.a(8, this.j);
    if ((0x100 & this.b) == 256)
      parame.a(9, this.k);
    if ((0x200 & this.b) == 512)
      parame.a(10, this.l);
    if ((0x400 & this.b) == 1024)
      parame.a(11, this.m);
    if ((0x800 & this.b) == 2048)
      parame.a(12, this.n);
    if ((0x1000 & this.b) == 4096)
      parame.a(13, this.o);
    if ((0x2000 & this.b) == 8192)
      parame.a(14, this.p);
    if ((0x4000 & this.b) == 16384)
      parame.a(15, this.q);
    if ((0x8000 & this.b) == 32768)
      parame.a(16, this.r);
    if ((0x10000 & this.b) == 65536)
      parame.a(18, this.s);
    if ((0x20000 & this.b) == 131072)
      parame.a(19, this.t);
    if ((0x40000 & this.b) == 262144)
      parame.a(20, this.u);
    if ((0x80000 & this.b) == 524288)
      parame.a(23, this.v);
    if ((0x100000 & this.b) == 1048576)
      parame.a(31, this.w);
    if ((0x200000 & this.b) == 2097152)
      parame.a(32, this.x);
    if ((0x400000 & this.b) == 4194304)
      parame.a(33, this.y);
    if ((0x800000 & this.b) == 8388608)
      parame.a(34, this.z);
    if ((0x1000000 & this.b) == 16777216)
      parame.a(35, this.A);
    if ((0x2000000 & this.b) == 33554432)
      parame.a(36, this.B);
  }

  public final boolean aa()
  {
    return (0x2000000 & this.b) == 33554432;
  }

  public final as ab()
  {
    return this.B;
  }

  public final boolean ac()
  {
    int i1 = this.C;
    if (i1 != -1)
      return i1 == 1;
    this.C = 1;
    return true;
  }

  public final boolean b()
  {
    return (0x1 & this.b) == 1;
  }

  public final int c()
  {
    int i1 = this.D;
    if (i1 != -1)
      return i1;
    int i2 = 0x1 & this.b;
    int i3 = 0;
    if (i2 == 1)
      i3 = 0 + e.b(1, this.c);
    if ((0x2 & this.b) == 2)
      i3 += e.b(2, this.d);
    if ((0x4 & this.b) == 4)
      i3 += e.b(3, this.e);
    if ((0x8 & this.b) == 8)
      i3 += e.b(4, this.f);
    if ((0x10 & this.b) == 16)
      i3 += e.b(5, this.g);
    if ((0x20 & this.b) == 32)
      i3 += e.b(6, this.h);
    if ((0x40 & this.b) == 64)
      i3 += e.b(7, this.i);
    if ((0x80 & this.b) == 128)
      i3 += e.b(8, this.j);
    if ((0x100 & this.b) == 256)
      i3 += e.b(9, this.k);
    if ((0x200 & this.b) == 512)
      i3 += e.b(10, this.l);
    if ((0x400 & this.b) == 1024)
      i3 += e.b(11, this.m);
    if ((0x800 & this.b) == 2048)
      i3 += e.b(12, this.n);
    if ((0x1000 & this.b) == 4096)
      i3 += e.b(13, this.o);
    if ((0x2000 & this.b) == 8192)
      i3 += e.b(14, this.p);
    if ((0x4000 & this.b) == 16384)
      i3 += e.b(15, this.q);
    if ((0x8000 & this.b) == 32768)
      i3 += e.b(16, this.r);
    if ((0x10000 & this.b) == 65536)
      i3 += e.b(18, this.s);
    if ((0x20000 & this.b) == 131072)
      i3 += e.b(19, this.t);
    if ((0x40000 & this.b) == 262144)
      i3 += e.b(20, this.u);
    if ((0x80000 & this.b) == 524288)
      i3 += e.b(23, this.v);
    if ((0x100000 & this.b) == 1048576)
      i3 += e.b(31, this.w);
    if ((0x200000 & this.b) == 2097152)
      i3 += e.b(32, this.x);
    if ((0x400000 & this.b) == 4194304)
      i3 += e.b(33, this.y);
    if ((0x800000 & this.b) == 8388608)
      i3 += e.b(34, this.z);
    if ((0x1000000 & this.b) == 16777216)
      i3 += e.b(35, this.A);
    if ((0x2000000 & this.b) == 33554432)
      i3 += e.b(36, this.B);
    this.D = i3;
    return i3;
  }

  public final bl d()
  {
    return this.c;
  }

  public final boolean e()
  {
    return (0x2 & this.b) == 2;
  }

  public final bn f()
  {
    return this.d;
  }

  public final boolean g()
  {
    return (0x4 & this.b) == 4;
  }

  public final bi h()
  {
    return this.e;
  }

  public final boolean i()
  {
    return (0x8 & this.b) == 8;
  }

  public final be j()
  {
    return this.f;
  }

  public final boolean k()
  {
    return (0x10 & this.b) == 16;
  }

  public final d l()
  {
    return this.g;
  }

  public final boolean m()
  {
    return (0x20 & this.b) == 32;
  }

  public final h n()
  {
    return this.h;
  }

  public final boolean o()
  {
    return (0x40 & this.b) == 64;
  }

  public final j p()
  {
    return this.i;
  }

  public final boolean q()
  {
    return (0x80 & this.b) == 128;
  }

  public final o r()
  {
    return this.j;
  }

  public final boolean s()
  {
    return (0x100 & this.b) == 256;
  }

  public final s t()
  {
    return this.k;
  }

  public final boolean u()
  {
    return (0x200 & this.b) == 512;
  }

  public final m v()
  {
    return this.l;
  }

  public final boolean w()
  {
    return (0x400 & this.b) == 1024;
  }

  public final q x()
  {
    return this.m;
  }

  public final boolean y()
  {
    return (0x800 & this.b) == 2048;
  }

  public final u z()
  {
    return this.n;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */