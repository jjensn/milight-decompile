package com.google.gson.jpush.internal;

import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.annotations.Until;
import com.google.gson.jpush.annotations.d;
import com.google.gson.jpush.b;
import com.google.gson.jpush.c;
import com.google.gson.jpush.k;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class s
  implements am, Cloneable
{
  public static final s a = new s();
  private double b = -1.0D;
  private int c = 136;
  private boolean d = true;
  private boolean e;
  private List<b> f = Collections.emptyList();
  private List<b> g = Collections.emptyList();

  public s()
  {
  }

  private boolean a(d paramd, Until paramUntil)
  {
    int i;
    if ((paramd != null) && (paramd.a() > this.b))
    {
      i = 0;
      if (i == 0)
        break label63;
      if ((paramUntil == null) || (paramUntil.value() > this.b))
        break label57;
    }
    label57: for (int j = 0; ; j = 1)
    {
      if (j == 0)
        break label63;
      return true;
      i = 1;
      break;
    }
    label63: return false;
  }

  private static boolean a(Class<?> paramClass)
  {
    return (!Enum.class.isAssignableFrom(paramClass)) && ((paramClass.isAnonymousClass()) || (paramClass.isLocalClass()));
  }

  private s b()
  {
    try
    {
      s locals = (s)super.clone();
      return locals;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
    }
    throw new AssertionError();
  }

  private boolean b(Class<?> paramClass)
  {
    if (paramClass.isMemberClass())
    {
      if ((0x8 & paramClass.getModifiers()) != 0);
      for (int i = 1; i == 0; i = 0)
        return true;
    }
    return false;
  }

  public final <T> al<T> a(k paramk, com.google.gson.jpush.a.a<T> parama)
  {
    Class localClass = parama.a();
    boolean bool1 = a(localClass, true);
    boolean bool2 = a(localClass, false);
    if ((!bool1) && (!bool2))
      return null;
    return new t(this, bool2, bool1, paramk, parama);
  }

  public final s a()
  {
    s locals = b();
    locals.e = true;
    return locals;
  }

  public final boolean a(Class<?> paramClass, boolean paramBoolean)
  {
    if ((this.b != -1.0D) && (!a((d)paramClass.getAnnotation(d.class), (Until)paramClass.getAnnotation(Until.class))))
      return true;
    if ((!this.d) && (b(paramClass)))
      return true;
    if (a(paramClass))
      return true;
    if (paramBoolean);
    for (List localList = this.f; ; localList = this.g)
    {
      Iterator localIterator = localList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((b)localIterator.next()).b());
      return true;
    }
    return false;
  }

  public final boolean a(Field paramField, boolean paramBoolean)
  {
    if ((this.c & paramField.getModifiers()) != 0)
      return true;
    if ((this.b != -1.0D) && (!a((d)paramField.getAnnotation(d.class), (Until)paramField.getAnnotation(Until.class))))
      return true;
    if (paramField.isSynthetic())
      return true;
    if (this.e)
    {
      com.google.gson.jpush.annotations.a locala = (com.google.gson.jpush.annotations.a)paramField.getAnnotation(com.google.gson.jpush.annotations.a.class);
      if (locala != null)
      {
        if (!paramBoolean)
          break label100;
        if (locala.a())
          break label110;
      }
      label100: 
      while (!locala.b())
        return true;
    }
    label110: if ((!this.d) && (b(paramField.getType())))
      return true;
    if (a(paramField.getType()))
      return true;
    if (paramBoolean);
    for (List localList = this.f; !localList.isEmpty(); localList = this.g)
    {
      new c(paramField);
      Iterator localIterator = localList.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!((b)localIterator.next()).a());
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */