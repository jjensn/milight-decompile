package cn.jpush.b.a.b;

import cn.jpush.a.a.o;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class g extends q
{

  @a
  String a;

  @a
  String b;

  @a
  int c;

  @a
  int d;

  protected final p a(long paramLong, String paramString)
  {
    cn.jpush.a.a.p localp = o.n().b(this.c).a(this.d);
    if (this.a != null)
      localp.a(c.a(this.a));
    if (this.b != null)
      localp.b(c.a(this.b));
    return new p(8, 1, paramLong, paramString, localp.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */