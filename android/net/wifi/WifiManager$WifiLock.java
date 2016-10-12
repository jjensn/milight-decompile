package android.net.wifi;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.WorkSource;

public class WifiManager$WifiLock
{
  private final IBinder mBinder;
  private boolean mHeld;
  int mLockType;
  private int mRefCount;
  private boolean mRefCounted;
  private String mTag;
  private WorkSource mWorkSource;

  private WifiManager$WifiLock(WifiManager paramWifiManager, int paramInt, String paramString)
  {
    this.mTag = paramString;
    this.mLockType = paramInt;
    this.mBinder = new Binder();
    this.mRefCount = 0;
    this.mRefCounted = true;
    this.mHeld = false;
  }

  public void acquire()
  {
    synchronized (this.mBinder)
    {
      if (this.mRefCounted)
      {
        int i = 1 + this.mRefCount;
        this.mRefCount = i;
        if (i != 1);
      }
      while (true)
      {
        try
        {
          this.this$0.mService.acquireWifiLock(this.mBinder, this.mLockType, this.mTag, this.mWorkSource);
          synchronized (this.this$0)
          {
            if (WifiManager.access$500(this.this$0) < 50)
              break;
            this.this$0.mService.releaseWifiLock(this.mBinder);
            throw new UnsupportedOperationException("Exceeded maximum number of wifi locks");
          }
        }
        catch (RemoteException localRemoteException)
        {
        }
        this.mHeld = true;
        boolean bool;
        do
        {
          return;
          bool = this.mHeld;
        }
        while (bool);
      }
      WifiManager.access$508(this.this$0);
    }
  }

  protected void finalize()
    throws Throwable
  {
    super.finalize();
    label57: synchronized (this.mBinder)
    {
      boolean bool = this.mHeld;
      if (bool)
        try
        {
          this.this$0.mService.releaseWifiLock(this.mBinder);
          synchronized (this.this$0)
          {
            WifiManager.access$510(this.this$0);
            return;
          }
        }
        catch (RemoteException localRemoteException)
        {
          break label57;
        }
    }
  }

  public boolean isHeld()
  {
    synchronized (this.mBinder)
    {
      boolean bool = this.mHeld;
      return bool;
    }
  }

  public void release()
  {
    synchronized (this.mBinder)
    {
      if (this.mRefCounted)
      {
        int i = -1 + this.mRefCount;
        this.mRefCount = i;
        if (i == 0)
          try
          {
            while (true)
            {
              this.this$0.mService.releaseWifiLock(this.mBinder);
              synchronized (this.this$0)
              {
                WifiManager.access$510(this.this$0);
                this.mHeld = false;
                boolean bool;
                do
                {
                  if (this.mRefCount >= 0)
                    break;
                  throw new RuntimeException("WifiLock under-locked " + this.mTag);
                  localObject1 = finally;
                  throw localObject1;
                  bool = this.mHeld;
                }
                while (!bool);
              }
            }
          }
          catch (RemoteException localRemoteException)
          {
            break label70;
          }
      }
    }
    label70:
  }

  public void setReferenceCounted(boolean paramBoolean)
  {
    this.mRefCounted = paramBoolean;
  }

  // ERROR //
  public void setWorkSource(WorkSource paramWorkSource)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	android/net/wifi/WifiManager$WifiLock:mBinder	Landroid/os/IBinder;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_1
    //   8: ifnull +12 -> 20
    //   11: aload_1
    //   12: invokevirtual 115	android/os/WorkSource:size	()I
    //   15: ifne +5 -> 20
    //   18: aconst_null
    //   19: astore_1
    //   20: iconst_1
    //   21: istore_3
    //   22: aload_1
    //   23: ifnonnull +46 -> 69
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   31: iload_3
    //   32: ifeq +34 -> 66
    //   35: aload_0
    //   36: getfield 40	android/net/wifi/WifiManager$WifiLock:mHeld	Z
    //   39: istore 5
    //   41: iload 5
    //   43: ifeq +23 -> 66
    //   46: aload_0
    //   47: getfield 22	android/net/wifi/WifiManager$WifiLock:this$0	Landroid/net/wifi/WifiManager;
    //   50: getfield 52	android/net/wifi/WifiManager:mService	Landroid/net/wifi/IWifiManager;
    //   53: aload_0
    //   54: getfield 34	android/net/wifi/WifiManager$WifiLock:mBinder	Landroid/os/IBinder;
    //   57: aload_0
    //   58: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   61: invokeinterface 119 3 0
    //   66: aload_2
    //   67: monitorexit
    //   68: return
    //   69: aload_0
    //   70: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   73: ifnonnull +39 -> 112
    //   76: aload_0
    //   77: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   80: ifnull +27 -> 107
    //   83: iconst_1
    //   84: istore_3
    //   85: aload_0
    //   86: new 111	android/os/WorkSource
    //   89: dup
    //   90: aload_1
    //   91: invokespecial 121	android/os/WorkSource:<init>	(Landroid/os/WorkSource;)V
    //   94: putfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   97: goto -66 -> 31
    //   100: astore 4
    //   102: aload_2
    //   103: monitorexit
    //   104: aload 4
    //   106: athrow
    //   107: iconst_0
    //   108: istore_3
    //   109: goto -24 -> 85
    //   112: aload_0
    //   113: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   116: aload_1
    //   117: invokevirtual 125	android/os/WorkSource:diff	(Landroid/os/WorkSource;)Z
    //   120: istore_3
    //   121: iload_3
    //   122: ifeq -91 -> 31
    //   125: aload_0
    //   126: getfield 54	android/net/wifi/WifiManager$WifiLock:mWorkSource	Landroid/os/WorkSource;
    //   129: aload_1
    //   130: invokevirtual 128	android/os/WorkSource:set	(Landroid/os/WorkSource;)V
    //   133: goto -102 -> 31
    //   136: astore 6
    //   138: goto -72 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   11	18	100	finally
    //   26	31	100	finally
    //   35	41	100	finally
    //   46	66	100	finally
    //   66	68	100	finally
    //   69	83	100	finally
    //   85	97	100	finally
    //   102	104	100	finally
    //   112	121	100	finally
    //   125	133	100	finally
    //   46	66	136	android/os/RemoteException
  }

  public String toString()
  {
    while (true)
    {
      synchronized (this.mBinder)
      {
        String str1 = Integer.toHexString(System.identityHashCode(this));
        if (this.mHeld)
        {
          str2 = "held; ";
          if (!this.mRefCounted)
            break label115;
          str3 = "refcounted: refcount = " + this.mRefCount;
          String str4 = "WifiLock{ " + str1 + "; " + str2 + str3 + " }";
          return str4;
        }
      }
      String str2 = "";
      continue;
      label115: String str3 = "not refcounted";
    }
  }
}

/* Location:
 * Qualified Name:     android.net.wifi.WifiManager.WifiLock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */