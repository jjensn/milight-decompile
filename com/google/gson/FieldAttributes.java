package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal..Gson.Types;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class FieldAttributes
{
  private static final Cache<Pair<Class<?>, String>, Collection<Annotation>> ANNOTATION_CACHE = new LruCache(getMaxCacheSize());
  private static final String MAX_CACHE_PROPERTY_NAME = "com.google.gson.annotation_cache_size_hint";
  private Collection<Annotation> annotations;
  private final Class<?> declaredType;
  private final Class<?> declaringClazz;
  private final Field field;
  private Type genericType;
  private final boolean isSynthetic;
  private final int modifiers;
  private final String name;
  private final Type resolvedType;

  FieldAttributes(Class<?> paramClass, Field paramField, Type paramType)
  {
    this.declaringClazz = ((Class).Gson.Preconditions.checkNotNull(paramClass));
    this.name = paramField.getName();
    this.declaredType = paramField.getType();
    this.isSynthetic = paramField.isSynthetic();
    this.modifiers = paramField.getModifiers();
    this.field = paramField;
    this.resolvedType = getTypeInfoForField(paramField, paramType);
  }

  private static <T extends Annotation> T getAnnotationFromArray(Collection<Annotation> paramCollection, Class<T> paramClass)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Annotation localAnnotation = (Annotation)localIterator.next();
      if (localAnnotation.annotationType() == paramClass)
        return localAnnotation;
    }
    return null;
  }

  private static int getMaxCacheSize()
  {
    try
    {
      int i = Integer.parseInt(System.getProperty("com.google.gson.annotation_cache_size_hint", String.valueOf(2000)));
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 2000;
  }

  static Type getTypeInfoForField(Field paramField, Type paramType)
  {
    Class localClass = .Gson.Types.getRawType(paramType);
    if (!paramField.getDeclaringClass().isAssignableFrom(localClass))
      return paramField.getGenericType();
    return .Gson.Types.resolve(paramType, localClass, paramField.getGenericType());
  }

  Object get(Object paramObject)
    throws IllegalAccessException
  {
    return this.field.get(paramObject);
  }

  public <T extends Annotation> T getAnnotation(Class<T> paramClass)
  {
    return getAnnotationFromArray(getAnnotations(), paramClass);
  }

  public Collection<Annotation> getAnnotations()
  {
    if (this.annotations == null)
    {
      Pair localPair = new Pair(this.declaringClazz, this.name);
      this.annotations = ((Collection)ANNOTATION_CACHE.getElement(localPair));
      if (this.annotations == null)
      {
        this.annotations = Collections.unmodifiableCollection(Arrays.asList(this.field.getAnnotations()));
        ANNOTATION_CACHE.addElement(localPair, this.annotations);
      }
    }
    return this.annotations;
  }

  public Class<?> getDeclaredClass()
  {
    return this.declaredType;
  }

  public Type getDeclaredType()
  {
    if (this.genericType == null)
      this.genericType = this.field.getGenericType();
    return this.genericType;
  }

  public Class<?> getDeclaringClass()
  {
    return this.declaringClazz;
  }

  @Deprecated
  Field getFieldObject()
  {
    return this.field;
  }

  public String getName()
  {
    return this.name;
  }

  Type getResolvedType()
  {
    return this.resolvedType;
  }

  public boolean hasModifier(int paramInt)
  {
    return (paramInt & this.modifiers) != 0;
  }

  boolean isSynthetic()
  {
    return this.isSynthetic;
  }

  void set(Object paramObject1, Object paramObject2)
    throws IllegalAccessException
  {
    this.field.set(paramObject1, paramObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.FieldAttributes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */