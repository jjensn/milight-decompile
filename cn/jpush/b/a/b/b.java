package cn.jpush.b.a.b;

import cn.jpush.a.a.d;
import cn.jpush.a.a.e;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class b extends q
{

  @a
  long a;

  @a
  String b;

  @a
  String c;

  @a
  int d;

  @a
  String e;

  final p a(long paramLong, String paramString)
  {
    e locale = d.n().a(this.a).a(this.d);
    if (this.b != null)
      locale.a(c.a(this.b));
    if (this.c != null)
      locale.b(c.a(this.c));
    if (this.e != null)
      locale.c(c.a(this.e));
    return new p(5, 1, paramLong, paramString, locale.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */