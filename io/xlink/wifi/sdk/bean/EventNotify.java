package io.xlink.wifi.sdk.bean;

import java.io.Serializable;
import java.util.Arrays;

public class EventNotify
  implements Serializable
{
  public int formId;
  public int messageId;
  public int messageType;
  public byte[] notifyData;
  public byte notyfyFlags;

  public EventNotify()
  {
  }

  public String toString()
  {
    return "EventNotify{notyfyFlags=" + this.notyfyFlags + ", formId=" + this.formId + ", messageId=" + this.messageId + ", messageType=" + this.messageType + ", notifyData=" + Arrays.toString(this.notifyData) + '}';
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.bean.EventNotify
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */