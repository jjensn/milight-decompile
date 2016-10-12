package com.google.gson.jpush.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class b
{
  static final Type[] a;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = "qU h^@H4-\\\024n<lNG\001p]\\FL=hIQ_9wXPy)}X\030\r?\035sH>hO]N\021OUT\004tMQ\001poH@\rl";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 61;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "ZX<a";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "\n\r9~\035[KpyDDHp";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        a = new Type[0];
        return;
        i3 = 52;
        break label96;
        i3 = 45;
        break label96;
        i3 = 80;
        break label96;
        i3 = 13;
        break label96;
        m = 0;
      }
    }
  }

  public static Type a(Type paramType)
  {
    if ((paramType instanceof Class))
    {
      Class localClass = (Class)paramType;
      if (localClass.isArray());
      for (Object localObject = new c(a(localClass.getComponentType())); ; localObject = localClass)
        return (Type)localObject;
    }
    if ((paramType instanceof ParameterizedType))
    {
      ParameterizedType localParameterizedType = (ParameterizedType)paramType;
      return new d(localParameterizedType.getOwnerType(), localParameterizedType.getRawType(), localParameterizedType.getActualTypeArguments());
    }
    if ((paramType instanceof GenericArrayType))
      return new c(((GenericArrayType)paramType).getGenericComponentType());
    if ((paramType instanceof WildcardType))
    {
      WildcardType localWildcardType = (WildcardType)paramType;
      return new e(localWildcardType.getUpperBounds(), localWildcardType.getLowerBounds());
    }
    return paramType;
  }

  public static Type a(Type paramType, Class<?> paramClass)
  {
    Type localType = b(paramType, paramClass, Collection.class);
    if ((localType instanceof WildcardType))
      localType = ((WildcardType)localType).getUpperBounds()[0];
    if ((localType instanceof ParameterizedType))
      return ((ParameterizedType)localType).getActualTypeArguments()[0];
    return Object.class;
  }

  private static Type a(Type paramType, Class<?> paramClass1, Class<?> paramClass2)
  {
    Object localObject1 = paramClass1;
    Object localObject2 = paramType;
    if (paramClass2 == localObject1)
      paramClass2 = (Class<?>)localObject2;
    label159: 
    while (true)
    {
      return paramClass2;
      if (paramClass2.isInterface())
      {
        Class[] arrayOfClass = ((Class)localObject1).getInterfaces();
        int i = 0;
        int j = arrayOfClass.length;
        while (true)
        {
          if (i >= j)
            break label100;
          if (arrayOfClass[i] == paramClass2)
            return localObject1.getGenericInterfaces()[i];
          if (paramClass2.isAssignableFrom(arrayOfClass[i]))
          {
            Type localType2 = localObject1.getGenericInterfaces()[i];
            localObject1 = arrayOfClass[i];
            localObject2 = localType2;
            break;
          }
          i++;
        }
      }
      label100: if (!((Class)localObject1).isInterface())
        while (true)
        {
          if (localObject1 == Object.class)
            break label159;
          Class localClass = ((Class)localObject1).getSuperclass();
          if (localClass == paramClass2)
            return ((Class)localObject1).getGenericSuperclass();
          if (paramClass2.isAssignableFrom(localClass))
          {
            Type localType1 = ((Class)localObject1).getGenericSuperclass();
            localObject1 = localClass;
            localObject2 = localType1;
            break;
          }
          localObject1 = localClass;
        }
    }
  }

  public static Type a(Type paramType1, Class<?> paramClass, Type paramType2)
  {
    int i = 0;
    Object localObject = paramType2;
    TypeVariable localTypeVariable;
    Class localClass2;
    label44: int m;
    if ((localObject instanceof TypeVariable))
    {
      localTypeVariable = (TypeVariable)localObject;
      GenericDeclaration localGenericDeclaration = localTypeVariable.getGenericDeclaration();
      if ((localGenericDeclaration instanceof Class))
      {
        localClass2 = (Class)localGenericDeclaration;
        if (localClass2 == null)
          break label142;
        Type localType9 = a(paramType1, paramClass, localClass2);
        if (!(localType9 instanceof ParameterizedType))
          break label142;
        TypeVariable[] arrayOfTypeVariable = localClass2.getTypeParameters();
        m = 0;
        label76: if (m >= arrayOfTypeVariable.length)
          break label134;
        if (!localTypeVariable.equals(arrayOfTypeVariable[m]))
          break label128;
        localObject = ((ParameterizedType)localType9).getActualTypeArguments()[m];
        label112: if (localObject != localTypeVariable)
          break label147;
      }
    }
    label128: label134: label142: label147: label204: label250: Type[] arrayOfType2;
    label393: label479: Type localType1;
    do
    {
      do
      {
        Type[] arrayOfType1;
        Type localType2;
        do
        {
          do
          {
            Type localType4;
            int j;
            Type[] arrayOfType3;
            do
            {
              Type localType6;
              Type localType7;
              do
              {
                Class localClass1;
                Type localType8;
                do
                {
                  return localObject;
                  localClass2 = null;
                  break label44;
                  m++;
                  break label76;
                  throw new NoSuchElementException();
                  localObject = localTypeVariable;
                  break label112;
                  break;
                  if ((!(localObject instanceof Class)) || (!((Class)localObject).isArray()))
                    break label204;
                  localObject = (Class)localObject;
                  localClass1 = ((Class)localObject).getComponentType();
                  localType8 = a(paramType1, paramClass, localClass1);
                }
                while (localClass1 == localType8);
                return f(localType8);
                if (!(localObject instanceof GenericArrayType))
                  break label250;
                localObject = (GenericArrayType)localObject;
                localType6 = ((GenericArrayType)localObject).getGenericComponentType();
                localType7 = a(paramType1, paramClass, localType6);
              }
              while (localType6 == localType7);
              return f(localType7);
              if (!(localObject instanceof ParameterizedType))
                break label393;
              localObject = (ParameterizedType)localObject;
              Type localType3 = ((ParameterizedType)localObject).getOwnerType();
              localType4 = a(paramType1, paramClass, localType3);
              if (localType4 != localType3);
              for (j = 1; ; j = 0)
              {
                arrayOfType3 = ((ParameterizedType)localObject).getActualTypeArguments();
                int k = arrayOfType3.length;
                while (i < k)
                {
                  Type localType5 = a(paramType1, paramClass, arrayOfType3[i]);
                  if (localType5 != arrayOfType3[i])
                  {
                    if (j == 0)
                    {
                      arrayOfType3 = (Type[])arrayOfType3.clone();
                      j = 1;
                    }
                    arrayOfType3[i] = localType5;
                  }
                  i++;
                }
              }
            }
            while (j == 0);
            return new d(localType4, ((ParameterizedType)localObject).getRawType(), arrayOfType3);
          }
          while (!(localObject instanceof WildcardType));
          localObject = (WildcardType)localObject;
          arrayOfType1 = ((WildcardType)localObject).getLowerBounds();
          arrayOfType2 = ((WildcardType)localObject).getUpperBounds();
          if (arrayOfType1.length != 1)
            break label479;
          localType2 = a(paramType1, paramClass, arrayOfType1[0]);
        }
        while (localType2 == arrayOfType1[0]);
        return new e(new Type[] { Object.class }, new Type[] { localType2 });
      }
      while (arrayOfType2.length != 1);
      localType1 = a(paramType1, paramClass, arrayOfType2[0]);
    }
    while (localType1 == arrayOfType2[0]);
    return new e(new Type[] { localType1 }, a);
  }

  public static boolean a(Type paramType1, Type paramType2)
  {
    Type localType1 = paramType2;
    Type localType2 = paramType1;
    while (true)
    {
      if (localType2 == localType1)
        return true;
      if ((localType2 instanceof Class))
        return localType2.equals(localType1);
      if ((localType2 instanceof ParameterizedType))
      {
        if (!(localType1 instanceof ParameterizedType))
          return false;
        ParameterizedType localParameterizedType1 = (ParameterizedType)localType2;
        ParameterizedType localParameterizedType2 = (ParameterizedType)localType1;
        Type localType3 = localParameterizedType1.getOwnerType();
        Type localType4 = localParameterizedType2.getOwnerType();
        if ((localType3 == localType4) || ((localType3 != null) && (localType3.equals(localType4))));
        for (int i = 1; (i != 0) && (localParameterizedType1.getRawType().equals(localParameterizedType2.getRawType())) && (Arrays.equals(localParameterizedType1.getActualTypeArguments(), localParameterizedType2.getActualTypeArguments())); i = 0)
          return true;
        return false;
      }
      if (!(localType2 instanceof GenericArrayType))
        break;
      if (!(localType1 instanceof GenericArrayType))
        return false;
      GenericArrayType localGenericArrayType1 = (GenericArrayType)localType2;
      GenericArrayType localGenericArrayType2 = (GenericArrayType)localType1;
      localType2 = localGenericArrayType1.getGenericComponentType();
      localType1 = localGenericArrayType2.getGenericComponentType();
    }
    if ((localType2 instanceof WildcardType))
    {
      if (!(localType1 instanceof WildcardType))
        return false;
      WildcardType localWildcardType1 = (WildcardType)localType2;
      WildcardType localWildcardType2 = (WildcardType)localType1;
      return (Arrays.equals(localWildcardType1.getUpperBounds(), localWildcardType2.getUpperBounds())) && (Arrays.equals(localWildcardType1.getLowerBounds(), localWildcardType2.getLowerBounds()));
    }
    if ((localType2 instanceof TypeVariable))
    {
      if (!(localType1 instanceof TypeVariable))
        return false;
      TypeVariable localTypeVariable1 = (TypeVariable)localType2;
      TypeVariable localTypeVariable2 = (TypeVariable)localType1;
      return (localTypeVariable1.getGenericDeclaration() == localTypeVariable2.getGenericDeclaration()) && (localTypeVariable1.getName().equals(localTypeVariable2.getName()));
    }
    return false;
  }

  public static Class<?> b(Type paramType)
  {
    for (Type localType1 = paramType; ; localType1 = ((WildcardType)localType1).getUpperBounds()[0])
    {
      if ((localType1 instanceof Class))
        return (Class)localType1;
      if ((localType1 instanceof ParameterizedType))
      {
        Type localType2 = ((ParameterizedType)localType1).getRawType();
        a.a(localType2 instanceof Class);
        return (Class)localType2;
      }
      if ((localType1 instanceof GenericArrayType))
        return Array.newInstance(b(((GenericArrayType)localType1).getGenericComponentType()), 0).getClass();
      if ((localType1 instanceof TypeVariable))
        return Object.class;
      if (!(localType1 instanceof WildcardType))
        break;
    }
    if (localType1 == null);
    for (String str = z[1]; ; str = localType1.getClass().getName())
      throw new IllegalArgumentException(z[0] + localType1 + z[2] + str);
  }

  private static Type b(Type paramType, Class<?> paramClass1, Class<?> paramClass2)
  {
    a.a(paramClass2.isAssignableFrom(paramClass1));
    return a(paramType, paramClass1, a(paramType, paramClass1, paramClass2));
  }

  public static Type[] b(Type paramType, Class<?> paramClass)
  {
    if (paramType == Properties.class)
      return new Type[] { String.class, String.class };
    Type localType = b(paramType, paramClass, Map.class);
    if ((localType instanceof ParameterizedType))
      return ((ParameterizedType)localType).getActualTypeArguments();
    return new Type[] { Object.class, Object.class };
  }

  public static String c(Type paramType)
  {
    if ((paramType instanceof Class))
      return ((Class)paramType).getName();
    return paramType.toString();
  }

  public static Type d(Type paramType)
  {
    if ((paramType instanceof GenericArrayType))
      return ((GenericArrayType)paramType).getGenericComponentType();
    return ((Class)paramType).getComponentType();
  }

  private static GenericArrayType f(Type paramType)
  {
    return new c(paramType);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */