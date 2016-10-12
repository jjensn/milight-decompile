package cn.jpush.a.a;

import com.google.protobuf.jpush.e;
import com.google.protobuf.jpush.h;
import java.util.Collections;
import java.util.List;

public final class x extends h
{
  private static final x a;
  private List<Integer> b;
  private byte c = -1;
  private int d = -1;

  static
  {
    x localx = new x();
    a = localx;
    localx.b = Collections.emptyList();
  }

  private x()
  {
  }

  private x(y paramy)
  {
    super((byte)0);
  }

  public static x a()
  {
    return a;
  }

  public static y a(x paramx)
  {
    return y.b().a(paramx);
  }

  public static y b()
  {
    return y.b();
  }

  public final void a(e parame)
  {
    c();
    for (int i = 0; i < this.b.size(); i++)
      parame.a(1, ((Integer)this.b.get(i)).intValue());
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
      k += e.a(((Integer)this.b.get(j)).intValue());
      j++;
    }
    int m = k + 0 + 1 * this.b.size();
    this.d = m;
    return m;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.a.a.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */