package cn.jpush.android;

import android.os.IBinder;
import android.os.Parcel;

final class d
  implements b
{
  private static final String z;
  private IBinder a;

  static
  {
    Object localObject1 = "\037>0\021I\t#vUX\0224l\024P\030~W?X\b1M\023X\0165".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 57;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      return;
      i1 = 124;
      continue;
      i1 = 80;
      continue;
      i1 = 30;
      continue;
      i1 = 123;
    }
  }

  d(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }

  public final int a()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      this.a.transact(10, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final int a(String paramString, int paramInt)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString);
      localParcel1.writeInt(paramInt);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final long a(String paramString, long paramLong)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final String a(String paramString1, String paramString2)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void a(int paramInt, long paramLong, boolean paramBoolean, float paramFloat, double paramDouble, String paramString)
  {
    i = 1;
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeInt(paramInt);
      localParcel1.writeLong(paramLong);
      if (paramBoolean);
      while (true)
      {
        localParcel1.writeInt(i);
        localParcel1.writeFloat(paramFloat);
        localParcel1.writeDouble(paramDouble);
        localParcel1.writeString(paramString);
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final boolean a(int paramInt)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeInt(paramInt);
      this.a.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final boolean a(String paramString, boolean paramBoolean)
  {
    i = 1;
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString);
      if (paramBoolean)
      {
        int j = i;
        localParcel1.writeInt(j);
        this.a.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int m = localParcel2.readInt();
        if (m == 0)
          break label92;
      }
      while (true)
      {
        return i;
        int k = 0;
        break;
        i = 0;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.a;
  }

  public final int b()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      this.a.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void b(String paramString, int paramInt)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString);
      localParcel1.writeInt(paramInt);
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void b(String paramString, long paramLong)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString);
      localParcel1.writeLong(paramLong);
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void b(String paramString1, String paramString2)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString1);
      localParcel1.writeString(paramString2);
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final void b(String paramString, boolean paramBoolean)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeString(paramString);
      int i = 0;
      if (paramBoolean)
        i = 1;
      localParcel1.writeInt(i);
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final boolean b(int paramInt)
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken(z);
      localParcel1.writeInt(paramInt);
      this.a.transact(12, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0)
        bool = true;
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */