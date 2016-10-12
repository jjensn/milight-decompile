package android.support.v4.widget;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class SlidingPaneLayout$SlidingPanelLayoutImplJB extends SlidingPaneLayout.SlidingPanelLayoutImplBase
{
  private Method mGetDisplayList;
  private Field mRecreateDisplayList;

  // ERROR //
  SlidingPaneLayout$SlidingPanelLayoutImplJB()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 16	android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase:<init>	()V
    //   4: aload_0
    //   5: ldc 18
    //   7: ldc 20
    //   9: aconst_null
    //   10: checkcast 22	[Ljava/lang/Class;
    //   13: invokevirtual 28	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   16: putfield 30	android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB:mGetDisplayList	Ljava/lang/reflect/Method;
    //   19: aload_0
    //   20: ldc 18
    //   22: ldc 31
    //   24: invokevirtual 35	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   27: putfield 37	android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB:mRecreateDisplayList	Ljava/lang/reflect/Field;
    //   30: aload_0
    //   31: getfield 37	android/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB:mRecreateDisplayList	Ljava/lang/reflect/Field;
    //   34: iconst_1
    //   35: invokevirtual 43	java/lang/reflect/Field:setAccessible	(Z)V
    //   38: return
    //   39: astore_1
    //   40: ldc 45
    //   42: ldc 47
    //   44: aload_1
    //   45: invokestatic 53	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   48: pop
    //   49: goto -30 -> 19
    //   52: astore_3
    //   53: ldc 45
    //   55: ldc 55
    //   57: aload_3
    //   58: invokestatic 53	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   61: pop
    //   62: return
    //
    // Exception table:
    //   from	to	target	type
    //   4	19	39	java/lang/NoSuchMethodException
    //   19	38	52	java/lang/NoSuchFieldException
  }

  public void invalidateChildRegion(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
  {
    if ((this.mGetDisplayList != null) && (this.mRecreateDisplayList != null))
      try
      {
        this.mRecreateDisplayList.setBoolean(paramView, true);
        this.mGetDisplayList.invoke(paramView, (Object[])null);
        super.invalidateChildRegion(paramSlidingPaneLayout, paramView);
        return;
      }
      catch (Exception localException)
      {
        while (true)
          Log.e("SlidingPaneLayout", "Error refreshing display list state", localException);
      }
    paramView.invalidate();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.SlidingPaneLayout.SlidingPanelLayoutImplJB
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */