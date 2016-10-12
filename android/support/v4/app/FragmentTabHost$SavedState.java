package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class FragmentTabHost$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public FragmentTabHost.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new FragmentTabHost.SavedState(paramAnonymousParcel, null);
    }

    public FragmentTabHost.SavedState[] newArray(int paramAnonymousInt)
    {
      return new FragmentTabHost.SavedState[paramAnonymousInt];
    }
  };
  String curTab;

  private FragmentTabHost$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.curTab = paramParcel.readString();
  }

  FragmentTabHost$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.curTab + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.curTab);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.FragmentTabHost.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */