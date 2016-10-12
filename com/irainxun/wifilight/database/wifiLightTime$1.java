package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class wifiLightTime$1
  implements Parcelable.Creator<wifiLightTime>
{
  wifiLightTime$1()
  {
  }

  public wifiLightTime createFromParcel(Parcel paramParcel)
  {
    return new wifiLightTime(paramParcel);
  }

  public wifiLightTime[] newArray(int paramInt)
  {
    return new wifiLightTime[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.wifiLightTime.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */