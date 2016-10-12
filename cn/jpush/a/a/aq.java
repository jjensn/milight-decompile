package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;
import com.google.protobuf.jpush.k;
import java.util.Collections;
import java.util.List;

public final class aq extends h
{
  private static final aq a;
  private List<ao> b;
  private byte c = -1;
  private int d = -1;

  static
  {
    aq localaq = new aq();
    a = localaq;
    localaq.b = Collections.emptyList();
  }

  private aq()
  {
  }

  private aq(ar paramar)
  {
    super((byte)0);
  }

  public static aq a()
  {
    return a;
  }

  public static ar a(aq paramaq)
  {
    return ar.e().a(paramaq);
  }

  public static ar e()
  {
    return ar.e();
  }

  public final void a(e parame)
  {
    c();
    for (int i = 0; i < this.b.size(); i++)
      parame.a(1, (k)this.b.get(i));
  }

  public final List<ao> b()
  {
    return this.b;
  }

  public final int c()
  {
    int i = this.d;
    if (i != -1)
      return i;
    int j = 0;
    int k = 0;
    while (j < this.b.size())
    {
      k += e.b(1, (k)this.b.get(j));
      j++;
    }
    this.d = k;
    return k;
  }

  public final boolean d()
  {
    int i = this.c;
    if (i != -1)
      return i == 1;
    this.c = 1;
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.aq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */