package com.loopj.android.http;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

public class PersistentCookieStore
  implements CookieStore
{
  private static final String COOKIE_NAME_PREFIX = "cookie_";
  private static final String COOKIE_NAME_STORE = "names";
  private static final String COOKIE_PREFS = "CookiePrefsFile";
  private static final String LOG_TAG = "PersistentCookieStore";
  private final SharedPreferences cookiePrefs;
  private final ConcurrentHashMap<String, Cookie> cookies;
  private boolean omitNonPersistentCookies = false;

  public PersistentCookieStore(Context paramContext)
  {
    this.cookiePrefs = paramContext.getSharedPreferences("CookiePrefsFile", 0);
    this.cookies = new ConcurrentHashMap();
    String str1 = this.cookiePrefs.getString("names", null);
    if (str1 != null)
    {
      for (String str2 : TextUtils.split(str1, ","))
      {
        String str3 = this.cookiePrefs.getString("cookie_" + str2, null);
        if (str3 != null)
        {
          Cookie localCookie = decodeCookie(str3);
          if (localCookie != null)
            this.cookies.put(str2, localCookie);
        }
      }
      clearExpired(new Date());
    }
  }

  public void addCookie(Cookie paramCookie)
  {
    if ((this.omitNonPersistentCookies) && (!paramCookie.isPersistent()))
      return;
    String str = paramCookie.getName() + paramCookie.getDomain();
    if (!paramCookie.isExpired(new Date()))
      this.cookies.put(str, paramCookie);
    while (true)
    {
      SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
      localEditor.putString("names", TextUtils.join(",", this.cookies.keySet()));
      localEditor.putString("cookie_" + str, encodeCookie(new SerializableCookie(paramCookie)));
      localEditor.commit();
      return;
      this.cookies.remove(str);
    }
  }

  protected String byteArrayToHexString(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(2 * paramArrayOfByte.length);
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++)
    {
      int k = 0xFF & paramArrayOfByte[j];
      if (k < 16)
        localStringBuilder.append((char)'0');
      localStringBuilder.append(Integer.toHexString(k));
    }
    return localStringBuilder.toString().toUpperCase(Locale.US);
  }

  public void clear()
  {
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    Iterator localIterator = this.cookies.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localEditor.remove("cookie_" + str);
    }
    localEditor.remove("names");
    localEditor.commit();
    this.cookies.clear();
  }

  public boolean clearExpired(Date paramDate)
  {
    boolean bool = false;
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    Iterator localIterator = this.cookies.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      if (((Cookie)localEntry.getValue()).isExpired(paramDate))
      {
        this.cookies.remove(str);
        localEditor.remove("cookie_" + str);
        bool = true;
      }
    }
    if (bool)
      localEditor.putString("names", TextUtils.join(",", this.cookies.keySet()));
    localEditor.commit();
    return bool;
  }

  protected Cookie decodeCookie(String paramString)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(hexStringToByteArray(paramString));
    try
    {
      Cookie localCookie = ((SerializableCookie)new ObjectInputStream(localByteArrayInputStream).readObject()).getCookie();
      return localCookie;
    }
    catch (IOException localIOException)
    {
      Log.d("PersistentCookieStore", "IOException in decodeCookie", localIOException);
      return null;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Log.d("PersistentCookieStore", "ClassNotFoundException in decodeCookie", localClassNotFoundException);
    }
    return null;
  }

  public void deleteCookie(Cookie paramCookie)
  {
    String str = paramCookie.getName() + paramCookie.getDomain();
    this.cookies.remove(str);
    SharedPreferences.Editor localEditor = this.cookiePrefs.edit();
    localEditor.remove("cookie_" + str);
    localEditor.commit();
  }

  protected String encodeCookie(SerializableCookie paramSerializableCookie)
  {
    if (paramSerializableCookie == null)
      return null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramSerializableCookie);
      return byteArrayToHexString(localByteArrayOutputStream.toByteArray());
    }
    catch (IOException localIOException)
    {
      Log.d("PersistentCookieStore", "IOException in encodeCookie", localIOException);
    }
    return null;
  }

  public List<Cookie> getCookies()
  {
    return new ArrayList(this.cookies.values());
  }

  protected byte[] hexStringToByteArray(String paramString)
  {
    int i = paramString.length();
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; j < i; j += 2)
      arrayOfByte[(j / 2)] = (byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16));
    return arrayOfByte;
  }

  public void setOmitNonPersistentCookies(boolean paramBoolean)
  {
    this.omitNonPersistentCookies = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.PersistentCookieStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */