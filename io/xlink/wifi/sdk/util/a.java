package io.xlink.wifi.sdk.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class a extends Thread
{
  private InetAddress a;
  private String b;

  public a(String paramString)
  {
    this.b = paramString;
  }

  private void a(InetAddress paramInetAddress)
  {
    try
    {
      this.a = paramInetAddress;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public InetAddress a()
  {
    try
    {
      if (this.a != null)
      {
        localInetAddress = this.a;
        return localInetAddress;
      }
      InetAddress localInetAddress = null;
    }
    finally
    {
    }
  }

  public void run()
  {
    try
    {
      a(InetAddress.getByName(this.b));
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.util.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */