package com.google.gson;

import com.google.gson.internal..Gson.Types;
import java.lang.reflect.Type;

final class ObjectNavigator
{
  private final ExclusionStrategy exclusionStrategy;
  private final ReflectingFieldNavigator reflectingFieldNavigator;

  ObjectNavigator(ExclusionStrategy paramExclusionStrategy)
  {
    if (paramExclusionStrategy == null)
      paramExclusionStrategy = new NullExclusionStrategy();
    this.exclusionStrategy = paramExclusionStrategy;
    this.reflectingFieldNavigator = new ReflectingFieldNavigator(this.exclusionStrategy);
  }

  private static boolean isPrimitiveOrString(Object paramObject)
  {
    Class localClass = paramObject.getClass();
    return (localClass == Object.class) || (localClass == String.class) || (Primitives.unwrap(localClass).isPrimitive());
  }

  public void accept(ObjectTypePair paramObjectTypePair, Visitor paramVisitor)
  {
    if (this.exclusionStrategy.shouldSkipClass(.Gson.Types.getRawType(paramObjectTypePair.type)));
    Object localObject1;
    Object localObject2;
    do
    {
      do
        return;
      while (paramVisitor.visitUsingCustomHandler(paramObjectTypePair));
      localObject1 = paramObjectTypePair.getObject();
      if (localObject1 != null)
        break;
      localObject2 = paramVisitor.getTarget();
    }
    while (localObject2 == null);
    paramObjectTypePair.setObject(localObject2);
    paramVisitor.start(paramObjectTypePair);
    while (true)
    {
      try
      {
        if (.Gson.Types.isArray(paramObjectTypePair.type))
        {
          paramVisitor.visitArray(localObject2, paramObjectTypePair.type);
          return;
          localObject2 = localObject1;
          break;
        }
        if ((paramObjectTypePair.type == Object.class) && (isPrimitiveOrString(localObject2)))
        {
          paramVisitor.visitPrimitive(localObject2);
          paramVisitor.getTarget();
          continue;
        }
      }
      finally
      {
        paramVisitor.end(paramObjectTypePair);
      }
      paramVisitor.startVisitingObject(localObject2);
      this.reflectingFieldNavigator.visitFieldsReflectively(paramObjectTypePair, paramVisitor);
    }
  }

  public static abstract interface Visitor
  {
    public abstract void end(ObjectTypePair paramObjectTypePair);

    public abstract Object getTarget();

    public abstract void start(ObjectTypePair paramObjectTypePair);

    public abstract void startVisitingObject(Object paramObject);

    public abstract void visitArray(Object paramObject, Type paramType);

    public abstract void visitArrayField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject);

    public abstract boolean visitFieldUsingCustomHandler(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject);

    public abstract void visitObjectField(FieldAttributes paramFieldAttributes, Type paramType, Object paramObject);

    public abstract void visitPrimitive(Object paramObject);

    public abstract boolean visitUsingCustomHandler(ObjectTypePair paramObjectTypePair);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.ObjectNavigator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */