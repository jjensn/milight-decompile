package com.irainxun.wifilight.database;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class zoneName$1
  implements Parcelable.Creator<zoneName>
{
  zoneName$1()
  {
  }

  public zoneName createFromParcel(Parcel paramParcel)
  {
    return new zoneName(paramParcel);
  }

  public zoneName[] newArray(int paramInt)
  {
    return new zoneName[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.database.zoneName.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */