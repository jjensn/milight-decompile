package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class zoneTime$1
  implements Parcelable.Creator<zoneTime>
{
  zoneTime$1()
  {
  }

  public zoneTime createFromParcel(Parcel paramParcel)
  {
    return new zoneTime(paramParcel);
  }

  public zoneTime[] newArray(int paramInt)
  {
    return new zoneTime[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.zoneTime.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */