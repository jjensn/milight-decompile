package cn.jpush.android.helpers;

import java.util.LinkedList;
import java.util.Queue;

public final class e
{
  private static Queue<Integer> a = new LinkedList();

  public static int a()
  {
    if (a.size() > 0)
      return ((Integer)a.poll()).intValue();
    return 0;
  }

  public static boolean a(int paramInt)
  {
    return a.offer(Integer.valueOf(paramInt));
  }

  public static int b()
  {
    return a.size();
  }

  public static boolean b(int paramInt)
  {
    return a.contains(Integer.valueOf(paramInt));
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.helpers.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */