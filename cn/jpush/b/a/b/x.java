package cn.jpush.b.a.b;

import cn.jpush.a.a.j;
import cn.jpush.a.a.k;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class x extends q
{

  @a
  long a;

  @a
  String b;

  @a
  String c;

  final p a(long paramLong, String paramString)
  {
    k localk = j.j().a(this.a);
    if (this.b != null)
      localk.a(c.a(this.b));
    if (this.c != null)
      localk.b(c.a(this.c));
    return new p(7, 1, paramLong, paramString, localk.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */