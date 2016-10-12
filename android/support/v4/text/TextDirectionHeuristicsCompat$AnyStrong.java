package android.support.v4.text;

class TextDirectionHeuristicsCompat$AnyStrong
  implements TextDirectionHeuristicsCompat.TextDirectionAlgorithm
{
  public static final AnyStrong INSTANCE_LTR = new AnyStrong(false);
  public static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
  private final boolean mLookForRtl;

  private TextDirectionHeuristicsCompat$AnyStrong(boolean paramBoolean)
  {
    this.mLookForRtl = paramBoolean;
  }

  public int checkRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    int k = paramInt1;
    int m = paramInt1 + paramInt2;
    while (true)
      if (k < m)
        switch (TextDirectionHeuristicsCompat.access$200(Character.getDirectionality(paramCharSequence.charAt(k))))
        {
        default:
          k++;
          break;
        case 0:
          if (this.mLookForRtl)
            i = 0;
        case 1:
        }
    do
    {
      do
      {
        return i;
        j = 1;
        break;
      }
      while (!this.mLookForRtl);
      j = 1;
      break;
      if (j == 0)
        break label108;
    }
    while (this.mLookForRtl);
    return 0;
    label108: return 2;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.text.TextDirectionHeuristicsCompat.AnyStrong
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */