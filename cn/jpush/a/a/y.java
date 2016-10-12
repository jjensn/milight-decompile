package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class y extends i<x, y>
{
  private int a;
  private List<Integer> b = Collections.emptyList();

  private y()
  {
  }

  private y c(d paramd, g paramg)
  {
    while (true)
    {
      int i = paramd.a();
      switch (i)
      {
      default:
        if (paramd.b(i))
          continue;
      case 0:
        return this;
      case 8:
        f();
        this.b.add(Integer.valueOf(paramd.c()));
        break;
      case 10:
      }
      int j = paramd.c(paramd.f());
      while (paramd.g() > 0)
      {
        int k = paramd.c();
        f();
        this.b.add(Integer.valueOf(k));
      }
      paramd.d(j);
    }
  }

  private y e()
  {
    return new y().a(a());
  }

  private void f()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }

  public final x a()
  {
    x localx = new x(this, (byte)0);
    if ((0x1 & this.a) == 1)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    x.a(localx, this.b);
    return localx;
  }

  public final y a(x paramx)
  {
    if (paramx == x.a());
    while (x.b(paramx).isEmpty())
      return this;
    if (this.b.isEmpty())
    {
      this.b = x.b(paramx);
      this.a = (0xFFFFFFFE & this.a);
      return this;
    }
    f();
    this.b.addAll(x.b(paramx));
    return this;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */