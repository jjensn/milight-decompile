package com.example.smartlinklib;

public abstract interface SmartLinkManipulator$ConnectCallBack
{
  public abstract void onConnect(ModuleInfo paramModuleInfo);

  public abstract void onConnectOk();

  public abstract void onConnectTimeOut();
}

/* Location:
 * Qualified Name:     com.example.smartlinklib.SmartLinkManipulator.ConnectCallBack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */