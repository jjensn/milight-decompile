package cn.jpush.b.a.b;

import cn.jpush.a.a.be;
import cn.jpush.a.a.bf;
import cn.jpush.a.a.bg;
import cn.jpush.a.a.bh;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class o extends q
{

  @a
  long a;

  @a
  String b;

  final p a(long paramLong, String paramString)
  {
    bf localbf = be.j().a(this.a);
    if (this.b != null)
      localbf.a(bg.j().a(c.a(this.b)).a());
    return new p(4, 1, paramLong, paramString, localbf.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */