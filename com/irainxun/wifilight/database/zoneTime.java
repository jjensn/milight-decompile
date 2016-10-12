package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class zoneTime
  implements Parcelable
{
  public static final Parcelable.Creator<zoneTime> CREATOR = new Parcelable.Creator()
  {
    public zoneTime createFromParcel(Parcel paramAnonymousParcel)
    {
      return new zoneTime(paramAnonymousParcel);
    }

    public zoneTime[] newArray(int paramAnonymousInt)
    {
      return new zoneTime[paramAnonymousInt];
    }
  };
  public String fouroff_hour;
  public String fouroff_minute;
  public String fouron_hour;
  public String fouron_minute;
  public int id;
  public String mac;
  public String oneoff_hour;
  public String oneoff_minute;
  public String oneon_hour;
  public String oneon_minute;
  public String selectValue;
  public String threeoff_hour;
  public String threeoff_minute;
  public String threeon_hour;
  public String threeon_minute;
  public String twooff_hour;
  public String twooff_minute;
  public String twoon_hour;
  public String twoon_minute;

  public zoneTime()
  {
  }

  public zoneTime(Parcel paramParcel)
  {
    this.id = paramParcel.readInt();
    this.mac = paramParcel.readString();
    this.selectValue = paramParcel.readString();
    this.oneon_hour = paramParcel.readString();
    this.oneon_minute = paramParcel.readString();
    this.oneoff_hour = paramParcel.readString();
    this.oneoff_minute = paramParcel.readString();
    this.twoon_hour = paramParcel.readString();
    this.twoon_minute = paramParcel.readString();
    this.twooff_hour = paramParcel.readString();
    this.twooff_minute = paramParcel.readString();
    this.threeon_hour = paramParcel.readString();
    this.threeon_minute = paramParcel.readString();
    this.threeoff_hour = paramParcel.readString();
    this.threeoff_minute = paramParcel.readString();
    this.fouron_hour = paramParcel.readString();
    this.fouron_minute = paramParcel.readString();
    this.fouroff_hour = paramParcel.readString();
    this.fouroff_minute = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "id = " + this.id + "\r\n" + "mac = " + this.mac + "\r\n" + "selectValue = " + this.selectValue + "\r\n" + "oneon_hour = " + this.oneon_hour + "\r\n" + "oneon_minute = " + this.oneon_minute + "\r\n" + "oneoff_hour = " + this.oneoff_hour + "\r\n" + "oneoff_minute = " + this.oneoff_minute + "\r\n" + "oneon_hour = " + this.twoon_hour + "\r\n" + "oneon_minute = " + this.twoon_minute + "\r\n" + "oneoff_hour = " + this.twooff_hour + "\r\n" + "oneoff_minute =" + this.twooff_minute + "\r\n" + "oneon_hour = " + this.threeon_hour + "\r\n" + "oneon_minute = " + this.threeon_minute + "\r\n" + "oneoff_hour = " + this.threeoff_hour + "\r\n" + "oneoff_minute = " + this.threeoff_minute + "\r\n" + "oneon_hour = " + this.fouron_hour + "\r\n" + "oneon_minute = " + this.fouron_minute + "\r\n" + "oneoff_hour = " + this.fouroff_hour + "\r\n" + "oneoff_minute = " + this.fouroff_minute + "\r\n";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.selectValue);
    paramParcel.writeString(this.oneon_hour);
    paramParcel.writeString(this.oneon_minute);
    paramParcel.writeString(this.oneoff_hour);
    paramParcel.writeString(this.oneoff_minute);
    paramParcel.writeString(this.twoon_hour);
    paramParcel.writeString(this.twoon_minute);
    paramParcel.writeString(this.twooff_hour);
    paramParcel.writeString(this.twooff_minute);
    paramParcel.writeString(this.threeon_hour);
    paramParcel.writeString(this.threeon_minute);
    paramParcel.writeString(this.threeoff_hour);
    paramParcel.writeString(this.threeoff_minute);
    paramParcel.writeString(this.fouron_hour);
    paramParcel.writeString(this.fouron_minute);
    paramParcel.writeString(this.fouroff_hour);
    paramParcel.writeString(this.fouroff_minute);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.zoneTime
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */