package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import java.util.Iterator;
import java.util.Stack;

final class MemoryRefStack
{
  private final Stack<ObjectTypePair> stack = new Stack();

  MemoryRefStack()
  {
  }

  public boolean contains(ObjectTypePair paramObjectTypePair)
  {
    if (paramObjectTypePair == null);
    ObjectTypePair localObjectTypePair;
    do
    {
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        return false;
        localIterator = this.stack.iterator();
      }
      localObjectTypePair = (ObjectTypePair)localIterator.next();
    }
    while ((localObjectTypePair.getObject() != paramObjectTypePair.getObject()) || (!localObjectTypePair.type.equals(paramObjectTypePair.type)));
    return true;
  }

  public boolean isEmpty()
  {
    return this.stack.isEmpty();
  }

  public ObjectTypePair peek()
  {
    return (ObjectTypePair)this.stack.peek();
  }

  public ObjectTypePair pop()
  {
    return (ObjectTypePair)this.stack.pop();
  }

  public ObjectTypePair push(ObjectTypePair paramObjectTypePair)
  {
    .Gson.Preconditions.checkNotNull(paramObjectTypePair);
    return (ObjectTypePair)this.stack.push(paramObjectTypePair);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.MemoryRefStack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */