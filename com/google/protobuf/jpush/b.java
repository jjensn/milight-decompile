package com.google.protobuf.jpush;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public abstract class b<BuilderType extends b>
  implements l
{
  private static final String z;

  static
  {
    Object localObject1 = "#b\024$u\037`U&n\036jU!<\023~\001%<\020u\007!eQs\0352y\006'\024.<8H08\024w\001)s\037']3t\036r\031$<\037b\003%nQo\0240l\024i\\n".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 28;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      return;
      i1 = 113;
      continue;
      i1 = 7;
      continue;
      i1 = 117;
      continue;
      i1 = 64;
    }
  }

  public b()
  {
  }

  protected static <T> void a(Iterable<T> paramIterable, Collection<? super T> paramCollection)
  {
    Iterator localIterator1 = paramIterable.iterator();
    while (localIterator1.hasNext())
      if (localIterator1.next() == null)
        throw new NullPointerException();
    if ((paramIterable instanceof Collection))
      paramCollection.addAll((Collection)paramIterable);
    while (true)
    {
      return;
      Iterator localIterator2 = paramIterable.iterator();
      while (localIterator2.hasNext())
        paramCollection.add(localIterator2.next());
    }
  }

  public abstract BuilderType a(d paramd, g paramg);

  public final BuilderType a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      d locald = d.a(paramArrayOfByte, 0, paramInt2);
      a(locald, g.a());
      locald.a(0);
      return this;
    }
    catch (j localj)
    {
      throw localj;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(z, localIOException);
    }
  }

  public abstract BuilderType d();
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */