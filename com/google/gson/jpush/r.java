package com.google.gson.jpush;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class r
{
  private com.google.gson.jpush.internal.s a = com.google.gson.jpush.internal.s.a;
  private ag b = ag.a;
  private j c = d.a;
  private final Map<Type, s<?>> d = new HashMap();
  private final List<am> e = new ArrayList();
  private final List<am> f = new ArrayList();
  private boolean g;
  private String h;
  private int i = 2;
  private int j = 2;
  private boolean k;
  private boolean l;
  private boolean m = true;
  private boolean n;
  private boolean o;

  public r()
  {
  }

  public final r a()
  {
    this.a = this.a.a();
    return this;
  }

  public final k b()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.e);
    Collections.reverse(localArrayList);
    localArrayList.addAll(this.f);
    String str = this.h;
    int i1 = this.i;
    int i2 = this.j;
    if ((str != null) && (!"".equals(str.trim())));
    for (a locala = new a(str); ; locala = new a(i1, i2))
    {
      localArrayList.add(aj.a(com.google.gson.jpush.a.a.a(java.util.Date.class), locala));
      localArrayList.add(aj.a(com.google.gson.jpush.a.a.a(Timestamp.class), locala));
      localArrayList.add(aj.a(com.google.gson.jpush.a.a.a(java.sql.Date.class), locala));
      do
        return new k(this.a, this.c, this.d, this.g, this.k, this.o, this.m, this.n, this.l, this.b, localArrayList);
      while ((i1 == 2) || (i2 == 2));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */