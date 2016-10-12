package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class diydevice$1
  implements Parcelable.Creator<diydevice>
{
  diydevice$1()
  {
  }

  public diydevice createFromParcel(Parcel paramParcel)
  {
    return new diydevice(paramParcel);
  }

  public diydevice[] newArray(int paramInt)
  {
    return new diydevice[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.diydevice.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */