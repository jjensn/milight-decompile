package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal..Gson.Types;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ReflectingFieldNavigator
{
  private static final Cache<Type, List<FieldAttributes>> fieldsCache = new LruCache(500);
  private final ExclusionStrategy exclusionStrategy;

  ReflectingFieldNavigator(ExclusionStrategy paramExclusionStrategy)
  {
    this.exclusionStrategy = ((ExclusionStrategy).Gson.Preconditions.checkNotNull(paramExclusionStrategy));
  }

  private List<FieldAttributes> getAllFields(Type paramType1, Type paramType2)
  {
    Object localObject = (List)fieldsCache.getElement(paramType1);
    if (localObject == null)
    {
      localObject = new ArrayList();
      Iterator localIterator = getInheritanceHierarchy(paramType1).iterator();
      while (localIterator.hasNext())
      {
        Class localClass = (Class)localIterator.next();
        Field[] arrayOfField = localClass.getDeclaredFields();
        AccessibleObject.setAccessible(arrayOfField, true);
        int i = arrayOfField.length;
        for (int j = 0; j < i; j++)
          ((List)localObject).add(new FieldAttributes(localClass, arrayOfField[j], paramType2));
      }
      fieldsCache.addElement(paramType1, localObject);
    }
    return localObject;
  }

  private List<Class<?>> getInheritanceHierarchy(Type paramType)
  {
    ArrayList localArrayList = new ArrayList();
    for (Class localClass = .Gson.Types.getRawType(paramType); (localClass != null) && (!localClass.equals(Object.class)); localClass = localClass.getSuperclass())
      if (!localClass.isSynthetic())
        localArrayList.add(localClass);
    return localArrayList;
  }

  void visitFieldsReflectively(ObjectTypePair paramObjectTypePair, ObjectNavigator.Visitor paramVisitor)
  {
    Type localType1 = paramObjectTypePair.getMoreSpecificType();
    Object localObject = paramObjectTypePair.getObject();
    Iterator localIterator = getAllFields(localType1, paramObjectTypePair.getType()).iterator();
    while (localIterator.hasNext())
    {
      FieldAttributes localFieldAttributes = (FieldAttributes)localIterator.next();
      if ((!this.exclusionStrategy.shouldSkipField(localFieldAttributes)) && (!this.exclusionStrategy.shouldSkipClass(localFieldAttributes.getDeclaredClass())))
      {
        Type localType2 = localFieldAttributes.getResolvedType();
        if (!paramVisitor.visitFieldUsingCustomHandler(localFieldAttributes, localType2, localObject))
          if (.Gson.Types.isArray(localType2))
            paramVisitor.visitArrayField(localFieldAttributes, localType2, localObject);
          else
            paramVisitor.visitObjectField(localFieldAttributes, localType2, localObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.gson.ReflectingFieldNavigator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */