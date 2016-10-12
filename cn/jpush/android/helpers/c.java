package cn.jpush.android.helpers;

import android.content.Context;
import android.os.RemoteException;
import cn.jpush.android.b;
import cn.jpush.android.e;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.ak;

public final class c
{
  public static void a(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      e.o.b(paramString, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
      ak.a(paramContext, paramString, paramInt);
    }
  }

  public static void a(Context paramContext, String paramString, long paramLong)
  {
    try
    {
      e.o.b(paramString, paramLong);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
      ak.a(paramContext, paramString, paramLong);
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      e.o.b(paramString1, paramString2);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
      ak.a(paramContext, paramString1, paramString2);
    }
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      e.o.b(paramString, paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
      ak.a(paramContext, paramString, paramBoolean);
    }
  }

  public static int b(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      int i = e.o.a(paramString, paramInt);
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return paramInt;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return ak.b(paramContext, paramString, paramInt);
  }

  public static long b(Context paramContext, String paramString, long paramLong)
  {
    try
    {
      long l = e.o.a(paramString, paramLong);
      return l;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return paramLong;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return ak.b(paramContext, paramString, paramLong);
  }

  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      String str = e.o.a(paramString1, paramString2);
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return paramString2;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return ak.b(paramContext, paramString1, paramString2);
  }

  public static boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      boolean bool = e.o.a(paramString, paramBoolean);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      ac.d();
      return paramBoolean;
    }
    catch (NullPointerException localNullPointerException)
    {
      ac.a();
    }
    return ak.b(paramContext, paramString, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */