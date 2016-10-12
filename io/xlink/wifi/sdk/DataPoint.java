package io.xlink.wifi.sdk;

import java.io.Serializable;

public class DataPoint
  implements Serializable
{
  private int a;
  private Object b;
  private int c;

  public DataPoint(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.c = paramInt2;
    switch (paramInt2)
    {
    default:
      return;
    case 1:
      this.b = Boolean.valueOf(false);
      return;
    case 2:
      this.b = Integer.valueOf(0);
      return;
    case 3:
      this.b = Integer.valueOf(0);
      return;
    case 4:
      this.b = Byte.valueOf((byte)0);
      return;
    case 5:
    }
    this.b = "";
  }

  public boolean getBooleanValue()
  {
    try
    {
      boolean bool = ((Boolean)this.b).booleanValue();
      return bool;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException("当前端点类型不是boolean,请根据数据模版来获取具体类型的端点值");
  }

  public int getInt32Value()
  {
    try
    {
      int i = ((Integer)this.b).intValue();
      return i;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException("当前端点类型不是Int32,请根据数据模版来获取具体类型的端点值");
  }

  public int getKey()
  {
    return this.a;
  }

  public Object getObjectValue()
  {
    return this.b;
  }

  public short getShortValue()
  {
    try
    {
      short s = ((Short)this.b).shortValue();
      return s;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException("当前端点类型不是Short,请根据数据模版来获取具体类型的端点值");
  }

  public int getType()
  {
    return this.c;
  }

  public int getUnsignedByteValue()
  {
    try
    {
      int i = ((Byte)this.b).byteValue();
      return i & 0xFF;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    throw new ClassCastException("当前端点类型不是byte,请根据数据模版来获取具体类型的端点值");
  }

  public void setValue(Object paramObject)
  {
    this.b = paramObject;
  }

  public String toString()
  {
    return "key :" + this.a + "  value：" + this.b;
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.DataPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */