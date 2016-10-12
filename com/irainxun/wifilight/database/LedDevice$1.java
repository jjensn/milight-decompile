package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class LedDevice$1
  implements Parcelable.Creator<LedDevice>
{
  LedDevice$1()
  {
  }

  public LedDevice createFromParcel(Parcel paramParcel)
  {
    return new LedDevice(paramParcel);
  }

  public LedDevice[] newArray(int paramInt)
  {
    return new LedDevice[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.LedDevice.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */