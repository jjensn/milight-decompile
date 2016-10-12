package cn.jpush.android.a;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;

final class c extends PhoneStateListener
{
  c(b paramb)
  {
  }

  public final void onCellLocationChanged(CellLocation paramCellLocation)
  {
  }

  public final void onSignalStrengthChanged(int paramInt)
  {
    b.a(this.a, paramInt);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */