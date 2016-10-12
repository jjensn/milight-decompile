package com.google.gson;

abstract interface Cache<K, V>
{
  public abstract void addElement(K paramK, V paramV);

  public abstract V getElement(K paramK);

  public abstract V removeElement(K paramK);
}

/* Location:
 * Qualified Name:     com.google.gson.Cache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */