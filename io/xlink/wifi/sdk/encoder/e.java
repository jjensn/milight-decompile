package io.xlink.wifi.sdk.encoder;

import io.xlink.wifi.sdk.XDevice;
import java.util.HashMap;

public class e
{
  private static final HashMap<String, g> d = new HashMap();
  public XDevice a;
  public int b;
  public int c;

  public e(int paramInt)
  {
    this.b = paramInt;
  }

  public static g a(int paramInt)
  {
    return (g)d.get(paramInt + "");
  }

  public static void a(String paramString)
  {
    d.remove(paramString);
  }

  public static void a(String paramString, g paramg)
  {
    d.put(paramString, paramg);
  }

  public static e b(int paramInt)
  {
    return new e(paramInt);
  }

  public static g b(String paramString)
  {
    return (g)d.get(paramString);
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.encoder.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */