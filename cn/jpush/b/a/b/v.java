package cn.jpush.b.a.b;

import cn.jpush.a.a.bg;
import cn.jpush.a.a.bh;
import cn.jpush.a.a.bi;
import cn.jpush.a.a.bj;
import com.google.gson.jpush.annotations.a;
import com.google.protobuf.jpush.c;

public class v extends q
{
  public static final String a = v.class.getName();

  @a
  long b;

  @a
  String c;

  final p a(long paramLong, String paramString)
  {
    bj localbj = bi.j().a(this.b);
    if (this.c != null)
      localbj.a(bg.j().a(c.a(this.c)).a());
    return new p(3, 1, paramLong, paramString, localbj.a());
  }
}

/* Location:
 * Qualified Name:     cn.jpush.b.a.b.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */