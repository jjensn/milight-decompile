package com.google.gson.jpush;

final class ak
  implements am
{
  private final com.google.gson.jpush.a.a<?> a;
  private final boolean b;
  private final Class<?> c;
  private final ae<?> d;
  private final v<?> e;

  private ak(Object paramObject, com.google.gson.jpush.a.a<?> parama, boolean paramBoolean, Class<?> paramClass)
  {
    ae localae;
    v localv;
    if ((paramObject instanceof ae))
    {
      localae = (ae)paramObject;
      this.d = localae;
      if (!(paramObject instanceof v))
        break label87;
      localv = (v)paramObject;
      label36: this.e = localv;
      if ((this.d == null) && (this.e == null))
        break label93;
    }
    label87: label93: for (boolean bool = true; ; bool = false)
    {
      com.google.gson.jpush.internal.a.a(bool);
      this.a = parama;
      this.b = paramBoolean;
      this.c = paramClass;
      return;
      localae = null;
      break;
      localv = null;
      break label36;
    }
  }

  public final <T> al<T> a(k paramk, com.google.gson.jpush.a.a<T> parama)
  {
    boolean bool;
    if (this.a != null)
      if ((this.a.equals(parama)) || ((this.b) && (this.a.b() == parama.a())))
        bool = true;
    while (bool)
    {
      return new aj(this.d, this.e, paramk, parama, this, (byte)0);
      bool = false;
      continue;
      bool = this.c.isAssignableFrom(parama.a());
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */