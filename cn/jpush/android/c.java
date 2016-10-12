package cn.jpush.android;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class c extends Binder
  implements b
{
  private static final String z;

  static
  {
    Object localObject1 = "y#[|oo>\0358~t)\007yv~c<R~n,&~~h(".toCharArray();
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
        i1 = 31;
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
      i1 = 26;
      continue;
      i1 = 77;
      continue;
      i1 = 117;
      continue;
      i1 = 22;
    }
  }

  public c()
  {
    attachInterface(this, z);
  }

  public static b a(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      return null;
    IInterface localIInterface = paramIBinder.queryLocalInterface(z);
    if ((localIInterface != null) && ((localIInterface instanceof b)))
      return (b)localIInterface;
    return new d(paramIBinder);
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
      paramParcel2.writeString(z);
      return true;
    case 1:
      paramParcel1.enforceInterface(z);
      int i3 = paramParcel1.readInt();
      long l2 = paramParcel1.readLong();
      int i4 = paramParcel1.readInt();
      boolean bool6 = false;
      if (i4 != 0)
        bool6 = true;
      a(i3, l2, bool6, paramParcel1.readFloat(), paramParcel1.readDouble(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 2:
      paramParcel1.enforceInterface(z);
      int i2 = a(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i2);
      return true;
    case 3:
      paramParcel1.enforceInterface(z);
      b(paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 4:
      paramParcel1.enforceInterface(z);
      long l1 = a(paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l1);
      return true;
    case 5:
      paramParcel1.enforceInterface(z);
      b(paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      return true;
    case 6:
      paramParcel1.enforceInterface(z);
      String str3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (boolean bool4 = true; ; bool4 = false)
      {
        boolean bool5 = a(str3, bool4);
        paramParcel2.writeNoException();
        int i1 = 0;
        if (bool5)
          i1 = 1;
        paramParcel2.writeInt(i1);
        return true;
      }
    case 7:
      paramParcel1.enforceInterface(z);
      String str2 = paramParcel1.readString();
      int n = paramParcel1.readInt();
      boolean bool3 = false;
      if (n != 0)
        bool3 = true;
      b(str2, bool3);
      paramParcel2.writeNoException();
      return true;
    case 8:
      paramParcel1.enforceInterface(z);
      String str1 = a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    case 9:
      paramParcel1.enforceInterface(z);
      b(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 10:
      paramParcel1.enforceInterface(z);
      int m = a();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(m);
      return true;
    case 11:
      paramParcel1.enforceInterface(z);
      boolean bool2 = a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      int k = 0;
      if (bool2)
        k = 1;
      paramParcel2.writeInt(k);
      return true;
    case 12:
      paramParcel1.enforceInterface(z);
      boolean bool1 = b(paramParcel1.readInt());
      paramParcel2.writeNoException();
      int j = 0;
      if (bool1)
        j = 1;
      paramParcel2.writeInt(j);
      return true;
    case 13:
    }
    paramParcel1.enforceInterface(z);
    int i = b();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(i);
    return true;
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */