package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.a.a;
import com.google.gson.jpush.al;
import com.google.gson.jpush.am;
import com.google.gson.jpush.annotations.c;
import com.google.gson.jpush.internal.af;
import com.google.gson.jpush.internal.b;
import com.google.gson.jpush.internal.f;
import com.google.gson.jpush.j;
import com.google.gson.jpush.k;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class q
  implements am
{
  private static final String z;
  private final f a;
  private final j b;
  private final com.google.gson.jpush.internal.s c;

  static
  {
    Object localObject1 = "\030\031\nPuY\017\n@9U\b\003GpH\021\n\023Sk2!\023Q\030\003Wj\030\023\016^|\\]".toCharArray();
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
        i1 = 25;
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
      i1 = 56;
      continue;
      i1 = 125;
      continue;
      i1 = 111;
      continue;
      i1 = 51;
    }
  }

  public q(f paramf, j paramj, com.google.gson.jpush.internal.s params)
  {
    this.a = paramf;
    this.b = paramj;
    this.c = params;
  }

  private List<String> a(Field paramField)
  {
    j localj = this.b;
    c localc = (c)paramField.getAnnotation(c.class);
    LinkedList localLinkedList = new LinkedList();
    if (localc == null)
      localLinkedList.add(localj.a(paramField));
    while (true)
    {
      return localLinkedList;
      localLinkedList.add(localc.a());
      String[] arrayOfString = localc.b();
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
        localLinkedList.add(arrayOfString[j]);
    }
  }

  private Map<String, t> a(k paramk, a<?> parama, Class<?> paramClass)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if (paramClass.isInterface())
      return localLinkedHashMap;
    Type localType1 = parama.b();
    int j;
    label45: Object localObject1;
    int k;
    label130: Object localObject2;
    if (paramClass != Object.class)
    {
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int i = arrayOfField.length;
      j = 0;
      if (j < i)
      {
        Field localField = arrayOfField[j];
        boolean bool1 = a(localField, true);
        boolean bool2 = a(localField, false);
        if ((bool1) || (bool2))
        {
          localField.setAccessible(true);
          Type localType4 = parama.b();
          Type localType5 = localField.getGenericType();
          Type localType6 = b.a(localType4, paramClass, localType5);
          List localList = a(localField);
          localObject1 = null;
          k = 0;
          if (k < localList.size())
          {
            String str = (String)localList.get(k);
            if (k != 0)
              bool1 = false;
            a locala = a.a(localType6);
            localObject2 = (t)localLinkedHashMap.put(str, new r(this, str, bool1, bool2, paramk, localField, locala, af.a(locala.a())));
            if (localObject1 != null)
              break label310;
          }
        }
      }
    }
    while (true)
    {
      k++;
      localObject1 = localObject2;
      break label130;
      if (localObject1 != null)
        throw new IllegalArgumentException(localType1 + z + localObject1.g);
      j++;
      break label45;
      Type localType2 = parama.b();
      Type localType3 = paramClass.getGenericSuperclass();
      parama = a.a(b.a(localType2, paramClass, localType3));
      paramClass = parama.a();
      break;
      return localLinkedHashMap;
      label310: localObject2 = localObject1;
    }
  }

  private boolean a(Field paramField, boolean paramBoolean)
  {
    com.google.gson.jpush.internal.s locals = this.c;
    return (!locals.a(paramField.getType(), paramBoolean)) && (!locals.a(paramField, paramBoolean));
  }

  public final <T> al<T> a(k paramk, a<T> parama)
  {
    Class localClass = parama.a();
    if (!Object.class.isAssignableFrom(localClass))
      return null;
    return new s(this.a.a(parama), a(paramk, parama, localClass), (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */