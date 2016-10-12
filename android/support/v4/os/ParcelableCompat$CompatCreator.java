package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class ParcelableCompat$CompatCreator<T>
  implements Parcelable.Creator<T>
{
  final ParcelableCompatCreatorCallbacks<T> mCallbacks;

  public ParcelableCompat$CompatCreator(ParcelableCompatCreatorCallbacks<T> paramParcelableCompatCreatorCallbacks)
  {
    this.mCallbacks = paramParcelableCompatCreatorCallbacks;
  }

  public T createFromParcel(Parcel paramParcel)
  {
    return this.mCallbacks.createFromParcel(paramParcel, null);
  }

  public T[] newArray(int paramInt)
  {
    return this.mCallbacks.newArray(paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.ParcelableCompat.CompatCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */