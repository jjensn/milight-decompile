package cn.jpush.b.a.b;

import cn.jpush.a.a.bn;
import cn.jpush.a.a.bo;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class s extends q
{

  @a
  String a;

  final p a(long paramLong, String paramString)
  {
    bo localbo = bn.f();
    if (this.a != null)
      localbo.a(c.a(this.a));
    return new p(2, 1, paramLong, paramString, localbo.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */