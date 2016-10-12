package com.loopj.android.http;

class AssertUtils
{
  private AssertUtils()
  {
  }

  public static void asserts(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
      throw new AssertionError(paramString);
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.AssertUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */