package com.hiflying.smartlink;

import android.content.Context;

public abstract interface ISmartLinker
{
  public static final int V3 = 3;
  public static final int V5 = 5;

  public abstract boolean isSmartLinking();

  public abstract void setOnSmartLinkListener(OnSmartLinkListener paramOnSmartLinkListener);

  public abstract void start(Context paramContext, String paramString, String[] paramArrayOfString)
    throws Exception;

  public abstract void stop();
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.ISmartLinker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */