package cn.jpush.b.a.b;

import cn.jpush.a.a.bp;
import cn.jpush.a.a.bq;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class u extends q
{

  @a
  String a;

  final p a(long paramLong, String paramString)
  {
    bq localbq = bp.f();
    if (this.a != null)
      localbq.a(c.a(this.a));
    return new p(23, 1, paramLong, paramString, localbq.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */