package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LedDevice
  implements Parcelable
{
  public static final Parcelable.Creator<LedDevice> CREATOR = new Parcelable.Creator()
  {
    public LedDevice createFromParcel(Parcel paramAnonymousParcel)
    {
      return new LedDevice(paramAnonymousParcel);
    }

    public LedDevice[] newArray(int paramAnonymousInt)
    {
      return new LedDevice[paramAnonymousInt];
    }
  };
  public String cpassword;
  public int dispflag;
  public int icon;
  public int id;
  public int login;
  public String mac;
  public String name;
  public String password;
  public String photo;
  public int status;

  public LedDevice()
  {
  }

  public LedDevice(Parcel paramParcel)
  {
    this.id = paramParcel.readInt();
    this.mac = paramParcel.readString();
    this.name = paramParcel.readString();
    this.status = paramParcel.readInt();
    this.photo = paramParcel.readString();
    this.cpassword = paramParcel.readString();
    this.icon = paramParcel.readInt();
    this.dispflag = paramParcel.readInt();
    this.login = paramParcel.readInt();
    this.password = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "name:" + this.name + " mac:" + this.mac + " status:" + this.status + " photo:" + this.photo + " cpassword:" + this.cpassword + " password:" + this.password + " icon:" + this.icon + " dispflag:" + this.dispflag;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.name);
    paramParcel.writeInt(this.status);
    paramParcel.writeString(this.photo);
    paramParcel.writeString(this.cpassword);
    paramParcel.writeInt(this.icon);
    paramParcel.writeInt(this.dispflag);
    paramParcel.writeInt(this.login);
    paramParcel.writeString(this.password);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.LedDevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */