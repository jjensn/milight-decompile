package cn.jpush.android.service;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class g extends Handler
{
  private static final String z;
  private Context b;

  static
  {
    Object localObject1 = "v\tOFYAmoFE\005#cS\013R\"~L".toCharArray();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    int m;
    Object localObject3;
    label27: int n;
    int i1;
    if (i <= 1)
    {
      localObject2 = localObject1;
      k = j;
      m = i;
      localObject3 = localObject1;
      n = localObject3[j];
      switch (k % 5)
      {
      default:
        i1 = 43;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject3[j] = (char)(i1 ^ n);
      j = k + 1;
      if (m == 0)
      {
        localObject3 = localObject2;
        k = j;
        j = m;
        break label27;
      }
      i = m;
      localObject1 = localObject2;
      if (i > j)
        break;
      z = new String((char[])localObject1).intern();
      return;
      i1 = 37;
      continue;
      i1 = 77;
      continue;
      i1 = 12;
      continue;
      i1 = 39;
    }
  }

  public g(DownloadService paramDownloadService, Context paramContext)
  {
    super(paramContext.getMainLooper());
    this.b = paramContext;
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    Toast.makeText(this.b, z, 1).show();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */