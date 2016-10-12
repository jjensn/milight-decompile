package com.google.gson;

import java.lang.reflect.Type;

abstract interface ObjectConstructor
{
  public abstract <T> T construct(Type paramType);

  public abstract Object constructArray(Type paramType, int paramInt);
}

/* Location:
 * Qualified Name:     com.google.gson.ObjectConstructor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */