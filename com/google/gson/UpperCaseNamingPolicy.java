package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

final class UpperCaseNamingPolicy extends RecursiveFieldNamingPolicy
{
  UpperCaseNamingPolicy()
  {
  }

  protected String translateName(String paramString, Type paramType, Collection<Annotation> paramCollection)
  {
    return paramString.toUpperCase();
  }
}

/* Location:
 * Qualified Name:     com.google.gson.UpperCaseNamingPolicy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */