package com.google.gson;

import java.lang.reflect.Type;

public abstract interface ObjectNavigator$Visitor
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

/* Location:
 * Qualified Name:     com.google.gson.ObjectNavigator.Visitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */