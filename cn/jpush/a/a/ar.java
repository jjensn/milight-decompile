package cn.jpush.a.a;

import com.google.protobuf.jpush.d;
import com.google.protobuf.jpush.g;
import com.google.protobuf.jpush.i;
import com.google.protobuf.jpush.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ar extends i<aq, ar>
{
  private int a;
  private List<ao> b = Collections.emptyList();

  private ar()
  {
  }

  private ar c(d paramd, g paramg)
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
      case 10:
      }
      ap localap = ao.r();
      paramd.a(localap, paramg);
      a(localap.b());
    }
  }

  private ar f()
  {
    return new ar().a(b());
  }

  private void g()
  {
    if ((0x1 & this.a) != 1)
    {
      this.b = new ArrayList(this.b);
      this.a = (0x1 | this.a);
    }
  }

  public final aq a()
  {
    aq localaq = b();
    if (!localaq.d())
      throw new m();
    return localaq;
  }

  public final ar a(ao paramao)
  {
    if (paramao == null)
      throw new NullPointerException();
    g();
    this.b.add(paramao);
    return this;
  }

  public final ar a(aq paramaq)
  {
    if (paramaq == aq.a());
    while (aq.b(paramaq).isEmpty())
      return this;
    if (this.b.isEmpty())
    {
      this.b = aq.b(paramaq);
      this.a = (0xFFFFFFFE & this.a);
      return this;
    }
    g();
    this.b.addAll(aq.b(paramaq));
    return this;
  }

  public final aq b()
  {
    aq localaq = new aq(this, (byte)0);
    if ((0x1 & this.a) == 1)
    {
      this.b = Collections.unmodifiableList(this.b);
      this.a = (0xFFFFFFFE & this.a);
    }
    aq.a(localaq, this.b);
    return localaq;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */