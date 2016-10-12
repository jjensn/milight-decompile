package android.security;

import android.net.LocalSocketAddress;
import android.net.LocalSocketAddress.Namespace;
import java.io.UTFDataFormatException;
import java.nio.charset.Charsets;
import java.nio.charset.ModifiedUtf8;
import java.util.ArrayList;

public class KeyStore
{
  public static final int KEY_NOT_FOUND = 7;
  public static final int LOCKED = 2;
  public static final int NO_ERROR = 1;
  public static final int PERMISSION_DENIED = 6;
  public static final int PROTOCOL_ERROR = 5;
  public static final int SYSTEM_ERROR = 4;
  public static final int UNDEFINED_ACTION = 9;
  public static final int UNINITIALIZED = 3;
  public static final int VALUE_CORRUPTED = 8;
  public static final int WRONG_PASSWORD = 10;
  private static final LocalSocketAddress sAddress = new LocalSocketAddress("keystore", LocalSocketAddress.Namespace.RESERVED);
  private int mError = 1;

  private KeyStore()
  {
  }

  private boolean contains(byte[] paramArrayOfByte)
  {
    execute(101, new byte[][] { paramArrayOfByte });
    return this.mError == 1;
  }

  private boolean delKey(byte[] paramArrayOfByte)
  {
    execute(107, new byte[][] { paramArrayOfByte });
    return this.mError == 1;
  }

  private boolean delete(byte[] paramArrayOfByte)
  {
    execute(100, new byte[][] { paramArrayOfByte });
    return this.mError == 1;
  }

  // ERROR //
  private ArrayList<byte[]> execute(int paramInt, byte[][] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_5
    //   2: putfield 50	android/security/KeyStore:mError	I
    //   5: aload_2
    //   6: arraylength
    //   7: istore_3
    //   8: iconst_0
    //   9: istore 4
    //   11: iload 4
    //   13: iload_3
    //   14: if_icmpge +30 -> 44
    //   17: aload_2
    //   18: iload 4
    //   20: aaload
    //   21: astore 28
    //   23: aload 28
    //   25: ifnull +11 -> 36
    //   28: aload 28
    //   30: arraylength
    //   31: ldc 63
    //   33: if_icmple +5 -> 38
    //   36: aconst_null
    //   37: areturn
    //   38: iinc 4 1
    //   41: goto -30 -> 11
    //   44: new 65	android/net/LocalSocket
    //   47: dup
    //   48: invokespecial 66	android/net/LocalSocket:<init>	()V
    //   51: astore 5
    //   53: aload 5
    //   55: getstatic 46	android/security/KeyStore:sAddress	Landroid/net/LocalSocketAddress;
    //   58: invokevirtual 70	android/net/LocalSocket:connect	(Landroid/net/LocalSocketAddress;)V
    //   61: aload 5
    //   63: invokevirtual 74	android/net/LocalSocket:getOutputStream	()Ljava/io/OutputStream;
    //   66: astore 10
    //   68: aload 10
    //   70: iload_1
    //   71: invokevirtual 80	java/io/OutputStream:write	(I)V
    //   74: aload_2
    //   75: arraylength
    //   76: istore 11
    //   78: iconst_0
    //   79: istore 12
    //   81: iload 12
    //   83: iload 11
    //   85: if_icmpge +41 -> 126
    //   88: aload_2
    //   89: iload 12
    //   91: aaload
    //   92: astore 13
    //   94: aload 10
    //   96: aload 13
    //   98: arraylength
    //   99: bipush 8
    //   101: ishr
    //   102: invokevirtual 80	java/io/OutputStream:write	(I)V
    //   105: aload 10
    //   107: aload 13
    //   109: arraylength
    //   110: invokevirtual 80	java/io/OutputStream:write	(I)V
    //   113: aload 10
    //   115: aload 13
    //   117: invokevirtual 83	java/io/OutputStream:write	([B)V
    //   120: iinc 12 1
    //   123: goto -42 -> 81
    //   126: aload 10
    //   128: invokevirtual 86	java/io/OutputStream:flush	()V
    //   131: aload 5
    //   133: invokevirtual 89	android/net/LocalSocket:shutdownOutput	()V
    //   136: aload 5
    //   138: invokevirtual 93	android/net/LocalSocket:getInputStream	()Ljava/io/InputStream;
    //   141: astore 14
    //   143: aload 14
    //   145: invokevirtual 99	java/io/InputStream:read	()I
    //   148: istore 15
    //   150: iload 15
    //   152: iconst_1
    //   153: if_icmpeq +26 -> 179
    //   156: iload 15
    //   158: iconst_m1
    //   159: if_icmpeq +9 -> 168
    //   162: aload_0
    //   163: iload 15
    //   165: putfield 50	android/security/KeyStore:mError	I
    //   168: aload 5
    //   170: invokevirtual 102	android/net/LocalSocket:close	()V
    //   173: aconst_null
    //   174: areturn
    //   175: astore 27
    //   177: aconst_null
    //   178: areturn
    //   179: new 104	java/util/ArrayList
    //   182: dup
    //   183: invokespecial 105	java/util/ArrayList:<init>	()V
    //   186: astore 16
    //   188: aload 14
    //   190: invokevirtual 99	java/io/InputStream:read	()I
    //   193: istore 17
    //   195: iload 17
    //   197: iconst_m1
    //   198: if_icmpne +21 -> 219
    //   201: aload_0
    //   202: iconst_1
    //   203: putfield 50	android/security/KeyStore:mError	I
    //   206: aload 5
    //   208: invokevirtual 102	android/net/LocalSocket:close	()V
    //   211: aload 16
    //   213: areturn
    //   214: astore 18
    //   216: aload 16
    //   218: areturn
    //   219: aload 14
    //   221: invokevirtual 99	java/io/InputStream:read	()I
    //   224: istore 19
    //   226: iload 19
    //   228: iconst_m1
    //   229: if_icmpne +14 -> 243
    //   232: aload 5
    //   234: invokevirtual 102	android/net/LocalSocket:close	()V
    //   237: aconst_null
    //   238: areturn
    //   239: astore 26
    //   241: aconst_null
    //   242: areturn
    //   243: iload 19
    //   245: iload 17
    //   247: bipush 8
    //   249: ishl
    //   250: ior
    //   251: istore 20
    //   253: iload 20
    //   255: newarray byte
    //   257: astore 21
    //   259: iconst_0
    //   260: istore 22
    //   262: iload 22
    //   264: aload 21
    //   266: arraylength
    //   267: if_icmpge +47 -> 314
    //   270: aload 14
    //   272: aload 21
    //   274: iload 22
    //   276: aload 21
    //   278: arraylength
    //   279: iload 22
    //   281: isub
    //   282: invokevirtual 108	java/io/InputStream:read	([BII)I
    //   285: istore 24
    //   287: iload 24
    //   289: iconst_m1
    //   290: if_icmpne +14 -> 304
    //   293: aload 5
    //   295: invokevirtual 102	android/net/LocalSocket:close	()V
    //   298: aconst_null
    //   299: areturn
    //   300: astore 25
    //   302: aconst_null
    //   303: areturn
    //   304: iload 22
    //   306: iload 24
    //   308: iadd
    //   309: istore 22
    //   311: goto -49 -> 262
    //   314: aload 16
    //   316: aload 21
    //   318: invokevirtual 112	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   321: pop
    //   322: goto -134 -> 188
    //   325: astore 8
    //   327: aload 5
    //   329: invokevirtual 102	android/net/LocalSocket:close	()V
    //   332: aconst_null
    //   333: areturn
    //   334: astore 6
    //   336: aload 5
    //   338: invokevirtual 102	android/net/LocalSocket:close	()V
    //   341: aload 6
    //   343: athrow
    //   344: astore 9
    //   346: goto -14 -> 332
    //   349: astore 7
    //   351: goto -10 -> 341
    //
    // Exception table:
    //   from	to	target	type
    //   168	173	175	java/io/IOException
    //   206	211	214	java/io/IOException
    //   232	237	239	java/io/IOException
    //   293	298	300	java/io/IOException
    //   53	78	325	java/io/IOException
    //   88	120	325	java/io/IOException
    //   126	150	325	java/io/IOException
    //   162	168	325	java/io/IOException
    //   179	188	325	java/io/IOException
    //   188	195	325	java/io/IOException
    //   201	206	325	java/io/IOException
    //   219	226	325	java/io/IOException
    //   253	259	325	java/io/IOException
    //   262	287	325	java/io/IOException
    //   314	322	325	java/io/IOException
    //   53	78	334	finally
    //   88	120	334	finally
    //   126	150	334	finally
    //   162	168	334	finally
    //   179	188	334	finally
    //   188	195	334	finally
    //   201	206	334	finally
    //   219	226	334	finally
    //   253	259	334	finally
    //   262	287	334	finally
    //   314	322	334	finally
    //   327	332	344	java/io/IOException
    //   336	341	349	java/io/IOException
  }

  private boolean generate(byte[] paramArrayOfByte)
  {
    execute(97, new byte[][] { paramArrayOfByte });
    return this.mError == 1;
  }

  private byte[] get(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = execute(103, new byte[][] { paramArrayOfByte });
    if ((localArrayList == null) || (localArrayList.isEmpty()))
      return null;
    return (byte[])localArrayList.get(0);
  }

  public static KeyStore getInstance()
  {
    return new KeyStore();
  }

  private static byte[] getKeyBytes(String paramString)
  {
    try
    {
      byte[] arrayOfByte = new byte[(int)ModifiedUtf8.countBytes(paramString, false)];
      ModifiedUtf8.encode(arrayOfByte, 0, paramString);
      return arrayOfByte;
    }
    catch (UTFDataFormatException localUTFDataFormatException)
    {
      throw new RuntimeException(localUTFDataFormatException);
    }
  }

  private static byte[] getPasswordBytes(String paramString)
  {
    return paramString.getBytes(Charsets.UTF_8);
  }

  private byte[] getPubkey(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = execute(98, new byte[][] { paramArrayOfByte });
    if ((localArrayList == null) || (localArrayList.isEmpty()))
      return null;
    return (byte[])localArrayList.get(0);
  }

  private static byte[] getUidBytes(int paramInt)
  {
    return Integer.toString(paramInt).getBytes(Charsets.UTF_8);
  }

  private long getmtime(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = execute(99, new byte[][] { paramArrayOfByte });
    if ((localArrayList == null) || (localArrayList.isEmpty()))
      return -1L;
    return 1000L * Long.parseLong(new String((byte[])localArrayList.get(0)));
  }

  private boolean grant(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    execute(120, new byte[][] { paramArrayOfByte1, paramArrayOfByte2 });
    return this.mError == 1;
  }

  private boolean importKey(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    execute(109, new byte[][] { paramArrayOfByte1, paramArrayOfByte2 });
    return this.mError == 1;
  }

  private boolean password(byte[] paramArrayOfByte)
  {
    execute(112, new byte[][] { paramArrayOfByte });
    return this.mError == 1;
  }

  private boolean put(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    execute(105, new byte[][] { paramArrayOfByte1, paramArrayOfByte2 });
    return this.mError == 1;
  }

  private byte[] sign(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ArrayList localArrayList = execute(110, new byte[][] { paramArrayOfByte1, paramArrayOfByte2 });
    if ((localArrayList == null) || (localArrayList.isEmpty()))
      return null;
    return (byte[])localArrayList.get(0);
  }

  private static String toKeyString(byte[] paramArrayOfByte)
  {
    try
    {
      String str = ModifiedUtf8.decode(paramArrayOfByte, new char[paramArrayOfByte.length], 0, paramArrayOfByte.length);
      return str;
    }
    catch (UTFDataFormatException localUTFDataFormatException)
    {
      throw new RuntimeException(localUTFDataFormatException);
    }
  }

  private boolean ungrant(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    execute(121, new byte[][] { paramArrayOfByte1, paramArrayOfByte2 });
    return this.mError == 1;
  }

  private boolean unlock(byte[] paramArrayOfByte)
  {
    execute(117, new byte[][] { paramArrayOfByte });
    return this.mError == 1;
  }

  private boolean verify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    execute(118, new byte[][] { paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3 });
    return this.mError == 1;
  }

  public boolean contains(String paramString)
  {
    return contains(getKeyBytes(paramString));
  }

  public boolean delKey(String paramString)
  {
    return delKey(getKeyBytes(paramString));
  }

  public boolean delete(String paramString)
  {
    return delete(getKeyBytes(paramString));
  }

  public boolean generate(String paramString)
  {
    return generate(getKeyBytes(paramString));
  }

  public byte[] get(String paramString)
  {
    return get(getKeyBytes(paramString));
  }

  public int getLastError()
  {
    return this.mError;
  }

  public byte[] getPubkey(String paramString)
  {
    return getPubkey(getKeyBytes(paramString));
  }

  public long getmtime(String paramString)
  {
    return getmtime(getKeyBytes(paramString));
  }

  public boolean grant(String paramString, int paramInt)
  {
    return grant(getKeyBytes(paramString), getUidBytes(paramInt));
  }

  public boolean importKey(String paramString, byte[] paramArrayOfByte)
  {
    return importKey(getKeyBytes(paramString), paramArrayOfByte);
  }

  public boolean isEmpty()
  {
    execute(122, new byte[0][]);
    int i = this.mError;
    boolean bool = false;
    if (i == 7)
      bool = true;
    return bool;
  }

  public boolean lock()
  {
    execute(108, new byte[0][]);
    return this.mError == 1;
  }

  public boolean password(String paramString)
  {
    return password(getPasswordBytes(paramString));
  }

  public boolean put(String paramString, byte[] paramArrayOfByte)
  {
    return put(getKeyBytes(paramString), paramArrayOfByte);
  }

  public boolean reset()
  {
    execute(114, new byte[0][]);
    return this.mError == 1;
  }

  public String[] saw(String paramString)
  {
    byte[][] arrayOfByte = saw(getKeyBytes(paramString));
    String[] arrayOfString;
    if (arrayOfByte == null)
      arrayOfString = null;
    while (true)
    {
      return arrayOfString;
      arrayOfString = new String[arrayOfByte.length];
      for (int i = 0; i < arrayOfByte.length; i++)
        arrayOfString[i] = toKeyString(arrayOfByte[i]);
    }
  }

  public byte[][] saw(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = execute(115, new byte[][] { paramArrayOfByte });
    if (localArrayList == null)
      return (byte[][])null;
    return (byte[][])localArrayList.toArray(new byte[localArrayList.size()][]);
  }

  public byte[] sign(String paramString, byte[] paramArrayOfByte)
  {
    return sign(getKeyBytes(paramString), paramArrayOfByte);
  }

  public State state()
  {
    execute(116, new byte[0][]);
    switch (this.mError)
    {
    default:
      throw new AssertionError(this.mError);
    case 1:
      return State.UNLOCKED;
    case 2:
      return State.LOCKED;
    case 3:
    }
    return State.UNINITIALIZED;
  }

  public boolean ungrant(String paramString, int paramInt)
  {
    return ungrant(getKeyBytes(paramString), getUidBytes(paramInt));
  }

  public boolean unlock(String paramString)
  {
    return unlock(getPasswordBytes(paramString));
  }

  public boolean verify(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    return verify(getKeyBytes(paramString), paramArrayOfByte1, paramArrayOfByte2);
  }

  public static enum State
  {
    static
    {
      LOCKED = new State("LOCKED", 1);
      UNINITIALIZED = new State("UNINITIALIZED", 2);
      State[] arrayOfState = new State[3];
      arrayOfState[0] = UNLOCKED;
      arrayOfState[1] = LOCKED;
      arrayOfState[2] = UNINITIALIZED;
    }
  }
}

/* Location:
 * Qualified Name:     android.security.KeyStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */