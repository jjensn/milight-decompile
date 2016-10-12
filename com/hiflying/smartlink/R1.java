package com.hiflying.smartlink;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import java.lang.reflect.Field;

public class R1
{
  private static Context context;

  public R1()
  {
  }

  public static int anim(String paramString)
  {
    return getIdentifier(context, paramString, "anim");
  }

  public static int animator(String paramString)
  {
    return getIdentifier(context, paramString, "animator");
  }

  public static int array(String paramString)
  {
    return getIdentifier(context, paramString, "array");
  }

  public static int attr(String paramString)
  {
    return getIdentifier(context, paramString, "attr");
  }

  public static int color(String paramString)
  {
    return getIdentifier(context, paramString, "color");
  }

  public static int dimen(String paramString)
  {
    return getIdentifier(context, paramString, "dimen");
  }

  public static int drawable(String paramString)
  {
    return getIdentifier(context, paramString, "drawable");
  }

  public static final <T> T getFieldFromStyleable(Context paramContext, String paramString)
  {
    try
    {
      Field localField = Class.forName(String.valueOf(paramContext.getPackageName()) + ".R$styleable").getField(paramString);
      Object localObject1 = null;
      if (localField != null)
      {
        Object localObject2 = localField.get(null);
        localObject1 = localObject2;
      }
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return null;
  }

  private static int getIdentifier(Context paramContext, String paramString1, String paramString2)
  {
    if (paramContext == null)
      new NullPointerException("Must call initContext(Context _context), recommend application context");
    int i = paramContext.getResources().getIdentifier(paramString1, paramString2, paramContext.getPackageName());
    if (i == 0)
      throw new Resources.NotFoundException(String.format("Resource for id R.%s.%s not found!", new Object[] { paramString2, paramString1 }));
    return i;
  }

  public static int id(String paramString)
  {
    return getIdentifier(context, paramString, "id");
  }

  public static void initContext(Context paramContext)
  {
    context = paramContext;
  }

  public static int integer(String paramString)
  {
    return getIdentifier(context, paramString, "integer");
  }

  public static int layout(String paramString)
  {
    return getIdentifier(context, paramString, "layout");
  }

  public static int raw(String paramString)
  {
    return getIdentifier(context, paramString, "raw");
  }

  public static int string(String paramString)
  {
    return getIdentifier(context, paramString, "string");
  }

  public static int style(String paramString)
  {
    return getIdentifier(context, paramString, "style");
  }

  public static <T> T styleable(String paramString, Class<T> paramClass)
  {
    return getFieldFromStyleable(context, paramString);
  }

  public static int[] styleable(String paramString)
  {
    return (int[])getFieldFromStyleable(context, paramString);
  }
}

/* Location:
 * Qualified Name:     com.hiflying.smartlink.R1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */