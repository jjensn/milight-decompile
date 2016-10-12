package com.irainxun.wifilight.view.wheelview;

public class NumericWheelAdapter
  implements WheelAdapter
{
  public static final int DEFAULT_MAX_VALUE = 9;
  private static final int DEFAULT_MIN_VALUE;
  private String format;
  private int maxValue;
  private int minValue;

  public NumericWheelAdapter()
  {
    this(0, 9);
  }

  public NumericWheelAdapter(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null);
  }

  public NumericWheelAdapter(int paramInt1, int paramInt2, String paramString)
  {
    this.minValue = paramInt1;
    this.maxValue = paramInt2;
    this.format = paramString;
  }

  public String getItem(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getItemsCount()))
    {
      int i = paramInt + this.minValue;
      if (this.format != null)
      {
        String str = this.format;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        return String.format(str, arrayOfObject);
      }
      return Integer.toString(i);
    }
    return null;
  }

  public int getItemsCount()
  {
    return 1 + (this.maxValue - this.minValue);
  }

  public int getMaximumLength()
  {
    int i = Integer.toString(Math.max(Math.abs(this.maxValue), Math.abs(this.minValue))).length();
    if (this.minValue < 0)
      i++;
    return i;
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.wheelview.NumericWheelAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */