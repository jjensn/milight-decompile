package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.al;
import com.google.gson.jpush.annotations.c;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bg<T extends Enum<T>> extends al<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();

  public bg(Class<T> paramClass)
  {
    try
    {
      for (Enum localEnum : (Enum[])paramClass.getEnumConstants())
      {
        String str1 = localEnum.name();
        c localc = (c)paramClass.getField(str1).getAnnotation(c.class);
        if (localc != null)
        {
          str1 = localc.a();
          for (String str2 : localc.b())
            this.a.put(str2, localEnum);
        }
        String str3 = str1;
        this.a.put(str3, localEnum);
        this.b.put(localEnum, str3);
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      throw new AssertionError();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.bg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */