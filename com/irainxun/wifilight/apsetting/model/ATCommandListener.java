package com.irainxun.wifilight.apsetting.model;

public abstract interface ATCommandListener
{
  public abstract void onEnterCMDMode(boolean paramBoolean);

  public abstract void onExitCMDMode(boolean paramBoolean, NetworkProtocol paramNetworkProtocol);

  public abstract void onReload(boolean paramBoolean);

  public abstract void onReset(boolean paramBoolean);

  public abstract void onResponse(String paramString);

  public abstract void onResponseOfSendFile(String paramString);

  public abstract void onSendFile(boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.model.ATCommandListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */