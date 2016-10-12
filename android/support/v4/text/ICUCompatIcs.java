package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ICUCompatIcs
{
  private static final String TAG = "ICUCompatIcs";
  private static Method sAddLikelySubtagsMethod;
  private static Method sGetScriptMethod;

  static
  {
    try
    {
      Class localClass = Class.forName("libcore.icu.ICU");
      if (localClass != null)
      {
        sGetScriptMethod = localClass.getMethod("getScript", new Class[] { String.class });
        sAddLikelySubtagsMethod = localClass.getMethod("addLikelySubtags", new Class[] { String.class });
      }
      return;
    }
    catch (Exception localException)
    {
      Log.w("ICUCompatIcs", localException);
    }
  }

  ICUCompatIcs()
  {
  }

  public static String addLikelySubtags(String paramString)
  {
    try
    {
      if (sAddLikelySubtagsMethod != null)
      {
        Object[] arrayOfObject = { paramString };
        String str = (String)sAddLikelySubtagsMethod.invoke(null, arrayOfObject);
        return str;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompatIcs", localIllegalAccessException);
      return paramString;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
        Log.w("ICUCompatIcs", localInvocationTargetException);
    }
  }

  public static String getScript(String paramString)
  {
    try
    {
      if (sGetScriptMethod != null)
      {
        Object[] arrayOfObject = { paramString };
        String str = (String)sGetScriptMethod.invoke(null, arrayOfObject);
        return str;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Log.w("ICUCompatIcs", localIllegalAccessException);
      return null;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
        Log.w("ICUCompatIcs", localInvocationTargetException);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.text.ICUCompatIcs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */