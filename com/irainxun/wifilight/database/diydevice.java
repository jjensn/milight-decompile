package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class diydevice
  implements Parcelable
{
  public static final Parcelable.Creator<diydevice> CREATOR = new Parcelable.Creator()
  {
    public diydevice createFromParcel(Parcel paramAnonymousParcel)
    {
      return new diydevice(paramAnonymousParcel);
    }

    public diydevice[] newArray(int paramAnonymousInt)
    {
      return new diydevice[paramAnonymousInt];
    }
  };
  public String deviceid;
  public String deviceselect;
  public int id;
  public String mac;
  public String zonech;

  public diydevice()
  {
  }

  public diydevice(Parcel paramParcel)
  {
    this.id = paramParcel.readInt();
    this.mac = paramParcel.readString();
    this.deviceid = paramParcel.readString();
    this.deviceselect = paramParcel.readString();
    this.zonech = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "id = " + this.id + "\r\n" + "mac = " + this.mac + "\r\n" + "deviceid = " + this.deviceid + "\r\n" + "deviceselect = " + this.deviceselect + "\r\n" + "zonech = " + this.zonech + "\r\n";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.deviceid);
    paramParcel.writeString(this.deviceselect);
    paramParcel.writeString(this.zonech);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.diydevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */