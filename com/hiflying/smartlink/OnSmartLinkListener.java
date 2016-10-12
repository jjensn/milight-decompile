package com.hiflying.smartlink;

public abstract interface OnSmartLinkListener
{
  public abstract void onCompleted();

  public abstract void onLinked(SmartLinkedModule paramSmartLinkedModule);

  public abstract void onTimeOut();
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.OnSmartLinkListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */