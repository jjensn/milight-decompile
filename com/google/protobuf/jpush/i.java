package com.google.protobuf.jpush;

public abstract class i<MessageType extends h, BuilderType extends i> extends b<BuilderType>
{
  private static final String z;

  static
  {
    Object localObject1 = "WZx\nyjA1\n,sB~\n<g\022e\026yaW1\026/f@c\020=gWY;z\022b\f;`^p\n*fA?".toCharArray();
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
        i1 = 89;
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
      i1 = 3;
      continue;
      i1 = 50;
      continue;
      i1 = 17;
      continue;
      i1 = 121;
    }
  }

  protected i()
  {
  }

  public BuilderType c()
  {
    throw new UnsupportedOperationException(z);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.jpush.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */