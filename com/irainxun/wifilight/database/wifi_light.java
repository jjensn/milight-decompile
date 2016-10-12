package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class wifi_light
  implements Parcelable
{
  public static final Parcelable.Creator<wifi_light> CREATOR = new Parcelable.Creator()
  {
    public wifi_light createFromParcel(Parcel paramAnonymousParcel)
    {
      return new wifi_light(paramAnonymousParcel);
    }

    public wifi_light[] newArray(int paramAnonymousInt)
    {
      return new wifi_light[paramAnonymousInt];
    }
  };
  public String device1;
  public String device2;
  public String device3;
  public String device4;
  public String device5;
  public int id;
  public String mac;
  public String wifilight_ang1;
  public String wifilight_ang2;
  public String wifilight_ang3;
  public String wifilight_ang4;
  public String wifilight_ang5;
  public String wifilight_b1;
  public String wifilight_b2;
  public String wifilight_b3;
  public String wifilight_b4;
  public String wifilight_b5;
  public String wifilight_s1;
  public String wifilight_s2;
  public String wifilight_s3;
  public String wifilight_s4;
  public String wifilight_s5;

  public wifi_light()
  {
  }

  public wifi_light(Parcel paramParcel)
  {
    this.id = paramParcel.readInt();
    this.mac = paramParcel.readString();
    this.device1 = paramParcel.readString();
    this.wifilight_ang1 = paramParcel.readString();
    this.wifilight_b1 = paramParcel.readString();
    this.wifilight_s1 = paramParcel.readString();
    this.device2 = paramParcel.readString();
    this.wifilight_ang2 = paramParcel.readString();
    this.wifilight_b2 = paramParcel.readString();
    this.wifilight_s2 = paramParcel.readString();
    this.device3 = paramParcel.readString();
    this.wifilight_ang3 = paramParcel.readString();
    this.wifilight_b3 = paramParcel.readString();
    this.wifilight_s3 = paramParcel.readString();
    this.device4 = paramParcel.readString();
    this.wifilight_ang4 = paramParcel.readString();
    this.wifilight_b4 = paramParcel.readString();
    this.wifilight_s4 = paramParcel.readString();
    this.device5 = paramParcel.readString();
    this.wifilight_ang5 = paramParcel.readString();
    this.wifilight_b5 = paramParcel.readString();
    this.wifilight_s5 = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "id = " + this.id + "\r\n" + "mac = " + this.mac + "\r\n" + "device1 = " + this.device1 + "\r\n" + "wifilight_s1 = " + this.wifilight_b1 + "\r\n" + "wifilight_b1 = " + this.wifilight_b1 + "\r\n" + "wifilight_ang1 = " + this.wifilight_ang1 + "\r\n" + "device2 = " + this.device2 + "\r\n" + "wifilight_s2 = " + this.wifilight_b2 + "\r\n" + "wifilight_b2 = " + this.wifilight_b2 + "\r\n" + "wifilight_ang2 = " + this.wifilight_ang2 + "\r\n" + "device3 = " + this.device3 + "\r\n" + "wifilight_s3 = " + this.wifilight_b3 + "\r\n" + "wifilight_b3 = " + this.wifilight_b3 + "\r\n" + "wifilight_ang3 = " + this.wifilight_ang3 + "\r\n" + "device4 = " + this.device4 + "\r\n" + "wifilight_s4 = " + this.wifilight_b4 + "\r\n" + "wifilight_b4 = " + this.wifilight_b4 + "\r\n" + "wifilight_ang4 = " + this.wifilight_ang4 + "\r\n" + "device5 = " + this.device5 + "\r\n" + "wifilight_s5 = " + this.wifilight_b5 + "\r\n" + "wifilight_b5 = " + this.wifilight_b5 + "\r\n" + "wifilight_ang5 = " + this.wifilight_ang5 + "\r\n";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.device1);
    paramParcel.writeString(this.wifilight_ang1);
    paramParcel.writeString(this.wifilight_b1);
    paramParcel.writeString(this.wifilight_s1);
    paramParcel.writeString(this.device2);
    paramParcel.writeString(this.wifilight_ang2);
    paramParcel.writeString(this.wifilight_b2);
    paramParcel.writeString(this.wifilight_s2);
    paramParcel.writeString(this.device3);
    paramParcel.writeString(this.wifilight_ang3);
    paramParcel.writeString(this.wifilight_b3);
    paramParcel.writeString(this.wifilight_s3);
    paramParcel.writeString(this.device4);
    paramParcel.writeString(this.wifilight_ang4);
    paramParcel.writeString(this.wifilight_b4);
    paramParcel.writeString(this.wifilight_s4);
    paramParcel.writeString(this.device5);
    paramParcel.writeString(this.wifilight_ang5);
    paramParcel.writeString(this.wifilight_b5);
    paramParcel.writeString(this.wifilight_s5);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.wifi_light
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */