package com.google.gson;

final class UnsafeAllocator$4 extends UnsafeAllocator
{
  UnsafeAllocator$4()
  {
  }

  public <T> T newInstance(Class<T> paramClass)
  {
    throw new UnsupportedOperationException("Cannot allocate " + paramClass);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.UnsafeAllocator.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */