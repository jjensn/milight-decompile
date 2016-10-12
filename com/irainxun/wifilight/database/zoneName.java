package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class zoneName
  implements Parcelable
{
  public static final Parcelable.Creator<zoneName> CREATOR = new Parcelable.Creator()
  {
    public zoneName createFromParcel(Parcel paramAnonymousParcel)
    {
      return new zoneName(paramAnonymousParcel);
    }

    public zoneName[] newArray(int paramAnonymousInt)
    {
      return new zoneName[paramAnonymousInt];
    }
  };
  public int id;
  public String mac;
  public String zoneNamefour;
  public String zoneNameone;
  public String zoneNamethree;
  public String zoneNametwo;

  public zoneName()
  {
  }

  public zoneName(Parcel paramParcel)
  {
    this.id = paramParcel.readInt();
    this.mac = paramParcel.readString();
    this.zoneNameone = paramParcel.readString();
    this.zoneNametwo = paramParcel.readString();
    this.zoneNamethree = paramParcel.readString();
    this.zoneNamefour = paramParcel.readString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    return "id = " + this.id + "\r\n" + "mac = " + this.mac + "\r\n" + "wifilight_b1 = " + this.zoneNameone + "\r\n" + "wifilight_ang1 = " + this.zoneNametwo + "\r\n" + "wifilight_b2 = " + this.zoneNamethree + "\r\n" + "wifilight_ang2 = " + this.zoneNamefour + "\r\n";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.zoneNameone);
    paramParcel.writeString(this.zoneNametwo);
    paramParcel.writeString(this.zoneNamethree);
    paramParcel.writeString(this.zoneNamefour);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.zoneName
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */