package android.support.v4.text;

class TextDirectionHeuristicsCompat$FirstStrong
  implements TextDirectionHeuristicsCompat.TextDirectionAlgorithm
{
  public static final FirstStrong INSTANCE = new FirstStrong();

  private TextDirectionHeuristicsCompat$FirstStrong()
  {
  }

  public int checkRtl(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 2;
    int j = paramInt1;
    int k = paramInt1 + paramInt2;
    while ((j < k) && (i == 2))
    {
      i = TextDirectionHeuristicsCompat.access$100(Character.getDirectionality(paramCharSequence.charAt(j)));
      j++;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.text.TextDirectionHeuristicsCompat.FirstStrong
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */