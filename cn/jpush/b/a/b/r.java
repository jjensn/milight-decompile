package cn.jpush.b.a.b;

import cn.jpush.a.a.bl;
import cn.jpush.a.a.bm;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class r extends q
{

  @a
  String a;

  @a
  String b;

  @a
  int c;

  @a
  String d;

  final p a(long paramLong, String paramString)
  {
    bm localbm = bl.l().a(this.c);
    if (this.a != null)
      localbm.a(c.a(this.a));
    if (this.b != null)
      localbm.b(c.a(this.b));
    if (this.d != null)
      localbm.c(c.a(this.d));
    return new p(1, 1, paramLong, paramString, localbm.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */