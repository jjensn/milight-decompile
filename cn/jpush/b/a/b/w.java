package cn.jpush.b.a.b;

import cn.jpush.a.a.u;
import cn.jpush.a.a.v;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class w extends q
{

  @a
  long a;

  @a
  String b;

  @a
  String c;

  final p a(long paramLong, String paramString)
  {
    v localv = u.j().a(this.a);
    if (this.b != null)
      localv.a(c.a(this.b));
    if (this.c != null)
      localv.b(c.a(this.c));
    return new p(12, 1, paramLong, paramString, localv.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */