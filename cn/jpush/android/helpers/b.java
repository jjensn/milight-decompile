package cn.jpush.android.helpers;

import android.os.RemoteException;
import cn.jpush.android.util.ac;

public final class b
{
  public static int a()
  {
    try
    {
      int i = cn.jpush.android.e.o.a();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      localRemoteException.printStackTrace();
      return 0;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return e.a();
  }

  public static boolean a(int paramInt)
  {
    try
    {
      boolean bool = cn.jpush.android.e.o.a(paramInt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      localRemoteException.printStackTrace();
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return e.a(paramInt);
  }

  public static int b()
  {
    try
    {
      int i = cn.jpush.android.e.o.b();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      localRemoteException.printStackTrace();
      return 0;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return e.b();
  }

  public static boolean b(int paramInt)
  {
    try
    {
      boolean bool = cn.jpush.android.e.o.b(paramInt);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      localRemoteException.printStackTrace();
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return e.b(paramInt);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */