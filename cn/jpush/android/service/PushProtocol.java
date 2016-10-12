package cn.jpush.android.service;

import cn.jpush.android.util.ac;

public class PushProtocol
{
  private static final String z;

  static
  {
    String str1 = ";T:#/\005\003%8+\fa 58\t_0mp\002]<$\"Z\034~";
    int i = -1;
    Object localObject1 = str1.toCharArray();
    int j = localObject1.length;
    int k;
    label21: Object localObject2;
    int m;
    int n;
    Object localObject3;
    label34: int i1;
    int i2;
    if (j <= 1)
    {
      k = 0;
      localObject2 = localObject1;
      m = k;
      n = j;
      localObject3 = localObject1;
      i1 = localObject3[k];
      switch (m % 5)
      {
      default:
        i2 = 74;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[k] = (char)(i2 ^ i1);
      k = m + 1;
      if (n == 0)
      {
        localObject3 = localObject2;
        m = k;
        k = n;
        break label34;
      }
      j = n;
      localObject1 = localObject2;
      while (true)
      {
        if (j > k)
          break label21;
        String str2 = new String((char[])localObject1).intern();
        switch (i)
        {
        default:
          z = str2;
          str1 = "\002]<$\"Z\034~";
          i = 0;
          break;
        case 0:
          try
          {
            System.loadLibrary(str2);
            return;
          }
          catch (Throwable localThrowable)
          {
            new StringBuilder(z).append(localThrowable);
            ac.e();
            localThrowable.printStackTrace();
            return;
          }
          k = 0;
        }
      }
      i2 = 104;
      continue;
      i2 = 45;
      continue;
      i2 = 73;
      continue;
      i2 = 87;
    }
  }

  public static synchronized native int Close(long paramLong);

  public static native int CtrlResponse(long paramLong1, int paramInt1, long paramLong2, long paramLong3, long paramLong4, int paramInt2);

  public static native int GetSdkVersion();

  public static native int HbJPush(long paramLong1, long paramLong2, int paramInt, long paramLong3, short paramShort);

  public static native int IMProtocol(long paramLong, byte[] paramArrayOfByte, int paramInt);

  public static synchronized native long InitConn();

  public static native int InitPush(long paramLong, String paramString, int paramInt);

  public static native int LogPush(long paramLong1, long paramLong2, byte[] paramArrayOfByte, long paramLong3, String paramString1, String paramString2, long paramLong4, short paramShort);

  public static native int MsgResponse(long paramLong1, int paramInt1, long paramLong2, byte paramByte, long paramLong3, long paramLong4, int paramInt2);

  public static native int RecvPush(long paramLong, byte[] paramArrayOfByte, int paramInt);

  public static native int RegPush(long paramLong1, long paramLong2, String paramString1, String paramString2, String paramString3, String paramString4);

  public static native int Stop(long paramLong);

  public static native int TagAlias(long paramLong1, long paramLong2, int paramInt, long paramLong3, String paramString1, String paramString2);
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.PushProtocol
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */