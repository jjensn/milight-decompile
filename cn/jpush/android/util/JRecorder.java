package cn.jpush.android.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class JRecorder
{
  private static ExecutorService a;
  private static Context c;
  private static Handler d;
  private static ArrayList<aa> e;
  private static volatile boolean f;
  private static final String[] z;
  private ArrayList<ab> b;

  static
  {
    Object localObject1 = new String[12];
    int i = 0;
    String str1 = "\n\016c\024\026\fKv\025\005\032\007v\037DB";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 100;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "\n\016p\024\026\034\033v\t\r\027\017";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = "\n\n}\034\001";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "\n\016p\024\026\0344g\002\024\035";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "\034\036a\032\020\021\004}";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "\021\005p\t\001\031\006v\025\020";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\n\016p\024\026\034\036}\022\020\013";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "\027\035v\t\b\031\022";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = "\f\022c\036";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "\022\031v\030\013\n\017v\t";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "\021\037z\026\001";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        z = localObject2;
        a = Executors.newSingleThreadExecutor();
        d = null;
        e = new ArrayList();
        f = false;
        return;
        i3 = 120;
        continue;
        i3 = 107;
        continue;
        i3 = 19;
        continue;
        i3 = 123;
      }
    }
  }

  private JRecorder()
  {
    if (d == null)
      d = new Handler(Looper.getMainLooper());
  }

  private JRecorder(int paramInt, Context paramContext)
  {
    this();
    c = paramContext.getApplicationContext();
    this.b = new ArrayList();
    aa localaa = new aa(this, (byte)0);
    localaa.a = paramInt;
    localaa.b = this.b;
    e.add(localaa);
  }

  private static JSONObject a(ArrayList<ab> paramArrayList)
  {
    if (paramArrayList == null);
    int i;
    do
    {
      return null;
      i = paramArrayList.size();
    }
    while (i <= 0);
    JSONObject localJSONObject = new JSONObject();
    long l = ((ab)paramArrayList.get(i - 1)).a - ((ab)paramArrayList.get(0)).a;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      m = (int)(k + ((ab)paramArrayList.get(j)).b);
      j++;
    }
    localJSONObject.put(z[4], z[6]);
    localJSONObject.put(z[5], l);
    localJSONObject.put(z[3], k - ((ab)paramArrayList.get(0)).b);
    return localJSONObject;
  }

  private static void b()
  {
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext())
      ((aa)localIterator.next()).b.clear();
    e.clear();
  }

  public static JRecorder getIncreamentsRecorder(Context paramContext)
  {
    return new JRecorder(0, paramContext);
  }

  public static JRecorder getSuperpositionRecorder(Context paramContext)
  {
    return new JRecorder(1, paramContext);
  }

  public static void parseRecordCommand(String paramString)
  {
    if (f)
    {
      ac.b();
      return;
    }
    try
    {
      int i = new JSONObject(paramString).getInt(z[2]);
      f = true;
      new StringBuilder(z[0]).append(i).append("s");
      ac.b();
      if (d == null)
        d = new Handler(Looper.getMainLooper());
      d.postDelayed(new y(), i * 1000);
      return;
    }
    catch (JSONException localJSONException)
    {
      f = false;
      new StringBuilder(z[1]).append(localJSONException.getMessage());
      ac.b();
    }
  }

  public void record(int paramInt)
  {
    if (!f)
    {
      ac.b();
      return;
    }
    a.execute(new x(this, paramInt));
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.util.JRecorder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */