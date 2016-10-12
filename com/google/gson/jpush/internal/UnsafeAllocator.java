package com.google.gson.jpush.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator
{
  public UnsafeAllocator()
  {
  }

  public static UnsafeAllocator create()
  {
    try
    {
      Class localClass = Class.forName("sun.misc.Unsafe");
      Field localField = localClass.getDeclaredField("theUnsafe");
      localField.setAccessible(true);
      Object localObject = localField.get(null);
      aj localaj = new aj(localClass.getMethod("allocateInstance", new Class[] { Class.class }), localObject);
      return localaj;
    }
    catch (Exception localException1)
    {
      try
      {
        Method localMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[] { Class.class });
        localMethod2.setAccessible(true);
        int i = ((Integer)localMethod2.invoke(null, new Object[] { Object.class })).intValue();
        Class[] arrayOfClass = new Class[2];
        arrayOfClass[0] = Class.class;
        arrayOfClass[1] = Integer.TYPE;
        Method localMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", arrayOfClass);
        localMethod3.setAccessible(true);
        ak localak = new ak(localMethod3, i);
        return localak;
      }
      catch (Exception localException2)
      {
        try
        {
          Method localMethod1 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Class.class });
          localMethod1.setAccessible(true);
          al localal = new al(localMethod1);
          return localal;
        }
        catch (Exception localException3)
        {
        }
      }
    }
    return new am();
  }

  public abstract <T> T newInstance(Class<T> paramClass);
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.UnsafeAllocator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */