package com.google.gson;

final class CircularReferenceException extends RuntimeException
{
  private static final long serialVersionUID = 7444343294106513081L;
  private final Object offendingNode;

  CircularReferenceException(Object paramObject)
  {
    super("circular reference error");
    this.offendingNode = paramObject;
  }

  public IllegalStateException createDetailedException(FieldAttributes paramFieldAttributes)
  {
    StringBuilder localStringBuilder = new StringBuilder(getMessage());
    if (paramFieldAttributes != null)
      localStringBuilder.append("\n  ").append("Offending field: ").append(paramFieldAttributes.getName() + "\n");
    if (this.offendingNode != null)
      localStringBuilder.append("\n  ").append("Offending object: ").append(this.offendingNode);
    return new IllegalStateException(localStringBuilder.toString(), this);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.CircularReferenceException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */