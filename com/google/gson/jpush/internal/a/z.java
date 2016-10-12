package com.google.gson.jpush.internal.a;

import com.google.gson.jpush.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

public final class z
{
  public static final com.google.gson.jpush.al<StringBuffer> A = new ai();
  public static final com.google.gson.jpush.am B = a(StringBuffer.class, A);
  public static final com.google.gson.jpush.al<URL> C = new aj();
  public static final com.google.gson.jpush.am D = a(URL.class, C);
  public static final com.google.gson.jpush.al<URI> E = new ak();
  public static final com.google.gson.jpush.am F = a(URI.class, E);
  public static final com.google.gson.jpush.al<InetAddress> G = new am();
  public static final com.google.gson.jpush.am H = b(InetAddress.class, G);
  public static final com.google.gson.jpush.al<UUID> I = new an();
  public static final com.google.gson.jpush.am J = a(UUID.class, I);
  public static final com.google.gson.jpush.am K = new ao();
  public static final com.google.gson.jpush.al<Calendar> L = new aq();
  public static final com.google.gson.jpush.am M = new ax(Calendar.class, GregorianCalendar.class, L);
  public static final com.google.gson.jpush.al<Locale> N = new ar();
  public static final com.google.gson.jpush.am O = a(Locale.class, N);
  public static final com.google.gson.jpush.al<w> P = new as();
  public static final com.google.gson.jpush.am Q = b(w.class, P);
  public static final com.google.gson.jpush.am R = new at();
  public static final com.google.gson.jpush.al<Class> a = new aa();
  public static final com.google.gson.jpush.am b = a(Class.class, a);
  public static final com.google.gson.jpush.al<BitSet> c = new al();
  public static final com.google.gson.jpush.am d = a(BitSet.class, c);
  public static final com.google.gson.jpush.al<Boolean> e = new aw();
  public static final com.google.gson.jpush.al<Boolean> f = new ba();
  public static final com.google.gson.jpush.am g = a(Boolean.TYPE, Boolean.class, e);
  public static final com.google.gson.jpush.al<Number> h = new bb();
  public static final com.google.gson.jpush.am i = a(Byte.TYPE, Byte.class, h);
  public static final com.google.gson.jpush.al<Number> j = new bc();
  public static final com.google.gson.jpush.am k = a(Short.TYPE, Short.class, j);
  public static final com.google.gson.jpush.al<Number> l = new bd();
  public static final com.google.gson.jpush.am m = a(Integer.TYPE, Integer.class, l);
  public static final com.google.gson.jpush.al<Number> n = new be();
  public static final com.google.gson.jpush.al<Number> o = new bf();
  public static final com.google.gson.jpush.al<Number> p = new ab();
  public static final com.google.gson.jpush.al<Number> q = new ac();
  public static final com.google.gson.jpush.am r = a(Number.class, q);
  public static final com.google.gson.jpush.al<Character> s = new ad();
  public static final com.google.gson.jpush.am t = a(Character.TYPE, Character.class, s);
  public static final com.google.gson.jpush.al<String> u = new ae();
  public static final com.google.gson.jpush.al<BigDecimal> v = new af();
  public static final com.google.gson.jpush.al<BigInteger> w = new ag();
  public static final com.google.gson.jpush.am x = a(String.class, u);
  public static final com.google.gson.jpush.al<StringBuilder> y = new ah();
  public static final com.google.gson.jpush.am z = a(StringBuilder.class, y);

  public static <TT> com.google.gson.jpush.am a(Class<TT> paramClass, com.google.gson.jpush.al<TT> paramal)
  {
    return new au(paramClass, paramal);
  }

  public static <TT> com.google.gson.jpush.am a(Class<TT> paramClass1, Class<TT> paramClass2, com.google.gson.jpush.al<? super TT> paramal)
  {
    return new av(paramClass1, paramClass2, paramal);
  }

  private static <TT> com.google.gson.jpush.am b(Class<TT> paramClass, com.google.gson.jpush.al<TT> paramal)
  {
    return new ay(paramClass, paramal);
  }
}

/* Location:
 * Qualified Name:     com.google.gson.jpush.internal.a.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */