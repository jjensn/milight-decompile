package android.net.wifi;

public abstract interface WifiManager$WpsListener
{
  public abstract void onCompletion();

  public abstract void onFailure(int paramInt);

  public abstract void onStartSuccess(String paramString);
}

/* Location:
 * Qualified Name:     android.net.wifi.WifiManager.WpsListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */