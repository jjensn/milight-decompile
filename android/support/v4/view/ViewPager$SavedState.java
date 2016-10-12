package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.view.View.BaseSavedState;

public class ViewPager$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks()
  {
    public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new ViewPager.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }

    public ViewPager.SavedState[] newArray(int paramAnonymousInt)
    {
      return new ViewPager.SavedState[paramAnonymousInt];
    }
  });
  Parcelable adapterState;
  ClassLoader loader;
  int position;

  ViewPager$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel);
    if (paramClassLoader == null)
      paramClassLoader = getClass().getClassLoader();
    this.position = paramParcel.readInt();
    this.adapterState = paramParcel.readParcelable(paramClassLoader);
    this.loader = paramClassLoader;
  }

  public ViewPager$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.position);
    paramParcel.writeParcelable(this.adapterState, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ViewPager.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */