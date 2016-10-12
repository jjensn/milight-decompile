package android.net.wifi;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

public class WifiManager$MulticastLock
{
  private final IBinder mBinder;
  private boolean mHeld;
  private int mRefCount;
  private boolean mRefCounted;
  private String mTag;

  private WifiManager$MulticastLock(WifiManager paramWifiManager, String paramString)
  {
    this.mTag = paramString;
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
          this.this$0.mService.acquireMulticastLock(this.mBinder, this.mTag);
          synchronized (this.this$0)
          {
            if (WifiManager.access$500(this.this$0) < 50)
              break;
            this.this$0.mService.releaseMulticastLock();
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
    setReferenceCounted(false);
    release();
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
              this.this$0.mService.releaseMulticastLock();
              synchronized (this.this$0)
              {
                WifiManager.access$510(this.this$0);
                this.mHeld = false;
                boolean bool;
                do
                {
                  if (this.mRefCount >= 0)
                    break;
                  throw new RuntimeException("MulticastLock under-locked " + this.mTag);
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
            break label65;
          }
      }
    }
    label65:
  }

  public void setReferenceCounted(boolean paramBoolean)
  {
    this.mRefCounted = paramBoolean;
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
          String str4 = "MulticastLock{ " + str1 + "; " + str2 + str3 + " }";
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
 * Qualified Name:     android.net.wifi.WifiManager.MulticastLock
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */