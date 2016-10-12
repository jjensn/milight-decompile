package com.irainxun.wifilight.xlink.bean;

import com.irainxun.wifilight.xlink.util.XlinkUtils;
import java.io.Serializable;

public class CmdBean
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private byte[] data;
  public String name;
  public String strCmd;

  public CmdBean()
  {
  }

  public boolean equals(Object paramObject)
  {
    return this.name.equals(((CmdBean)paramObject).name);
  }

  public byte[] getData()
  {
    if (this.data == null)
      this.data = XlinkUtils.stringToByteArray(this.strCmd);
    return this.data;
  }

  public int hashCode()
  {
    return this.name.hashCode();
  }

  public void setData(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.bean.CmdBean
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */