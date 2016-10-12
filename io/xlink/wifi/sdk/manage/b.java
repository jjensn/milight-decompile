package io.xlink.wifi.sdk.manage;

import android.util.SparseArray;
import io.xlink.wifi.sdk.DataPoint;
import io.xlink.wifi.sdk.XDevice;
import io.xlink.wifi.sdk.encoder.f;
import java.util.HashMap;

public class b
{
  private static b a;
  private static HashMap<String, SparseArray<DataPoint>> b = new HashMap();

  public b()
  {
  }

  public static b a()
  {
    if (a == null)
      a = new b();
    return a;
  }

  public int a(String paramString)
  {
    SparseArray localSparseArray = (SparseArray)b.get(paramString);
    if ((localSparseArray == null) || (localSparseArray.size() == 0))
      return 0;
    int i = localSparseArray.size();
    if (i <= 8)
      return 1;
    if (i % 8 == 0)
      return i / 8;
    return 1 + i / 8;
  }

  public DataPoint a(XDevice paramXDevice, int paramInt, Object paramObject)
  {
    SparseArray localSparseArray = (SparseArray)b.get(paramXDevice.getProductId());
    if (localSparseArray != null)
    {
      DataPoint localDataPoint = (DataPoint)localSparseArray.get(paramInt);
      if (localDataPoint != null)
        return f.a(paramObject, localDataPoint);
    }
    return null;
  }

  public void a(String paramString, SparseArray<DataPoint> paramSparseArray)
  {
    b.put(paramString, paramSparseArray);
  }

  public SparseArray<DataPoint> b(String paramString)
  {
    SparseArray localSparseArray = (SparseArray)b.get(paramString);
    if (localSparseArray == null)
      return null;
    return localSparseArray.clone();
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.manage.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */