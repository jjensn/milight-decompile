package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class wifidiyTime
  implements Parcelable
{
  public static final Parcelable.Creator<wifidiyTime> CREATOR = new Parcelable.Creator()
  {
    public wifidiyTime createFromParcel(Parcel paramAnonymousParcel)
    {
      return new wifidiyTime(paramAnonymousParcel);
    }

    public wifidiyTime[] newArray(int paramAnonymousInt)
    {
      return new wifidiyTime[paramAnonymousInt];
    }
  };
  public String deviceid;
  public int id;
  public String mac;
  public String off_hour;
  public String off_minute;
  public String on_hour;
  public String on_minute;
  public String selectValue;
  public String zonech;

  public wifidiyTime()
  {
  }

  public wifidiyTime(Parcel paramParcel)
  {
    this.id = paramParcel.readInt();
    this.mac = paramParcel.readString();
    this.selectValue = paramParcel.readString();
    this.on_hour = paramParcel.readString();
    this.on_minute = paramParcel.readString();
    this.off_hour = paramParcel.readString();
    this.off_minute = paramParcel.readString();
    this.deviceid = paramParcel.readString();
    this.zonech = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "id = " + this.id + "\r\n" + "mac = " + this.mac + "\r\n" + "select = " + this.selectValue + "\r\n" + "on_hour = " + this.on_hour + "\r\n" + "on_minute = " + this.on_minute + "\r\n" + "off_hour = " + this.off_hour + "\r\n" + "off_minute = " + this.off_minute + "\r\n" + "deviceid = " + this.deviceid + "\r\n" + "zonech = " + this.zonech + "\r\n";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.selectValue);
    paramParcel.writeString(this.on_hour);
    paramParcel.writeString(this.on_minute);
    paramParcel.writeString(this.off_hour);
    paramParcel.writeString(this.off_minute);
    paramParcel.writeString(this.deviceid);
    paramParcel.writeString(this.zonech);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.wifidiyTime
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */