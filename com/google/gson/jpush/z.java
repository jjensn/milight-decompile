package com.google.gson.jpush;

import java.util.Map.Entry;
import java.util.Set;

public final class z extends w
{
  private final com.google.gson.jpush.internal.w<String, w> a = new com.google.gson.jpush.internal.w();

  public z()
  {
  }

  public final Set<Map.Entry<String, w>> a()
  {
    return this.a.entrySet();
  }

  public final void a(String paramString, w paramw)
  {
    if (paramw == null)
      paramw = y.a;
    this.a.put(paramString, paramw);
  }

  public final boolean a(String paramString)
  {
    return this.a.containsKey(paramString);
  }

  public final w b(String paramString)
  {
    return (w)this.a.get(paramString);
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof z)) && (((z)paramObject).a.equals(this.a)));
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */