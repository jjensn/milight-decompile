package cn.jpush.android.service;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import cn.jpush.android.helpers.ConnectingHelper;
import cn.jpush.android.helpers.i;
import cn.jpush.android.util.ac;
import cn.jpush.b.a.a.h;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

final class m extends Handler
{
  private static final String[] z;
  private final WeakReference<PushService> a;

  static
  {
    String[] arrayOfString1 = new String[3];
    String str1 = " g\027Vx |\020Ws";
    int i = -1;
    String[] arrayOfString2 = arrayOfString1;
    int j = 0;
    Object localObject1 = str1.toCharArray();
    int k = localObject1.length;
    int m;
    label35: int i3;
    if (k <= 1)
    {
      m = 0;
      Object localObject2 = localObject1;
      int n = m;
      int i1 = k;
      Object localObject3 = localObject1;
      while (true)
      {
        int i2 = localObject3[m];
        switch (n % 5)
        {
        default:
          i3 = 29;
          label96: localObject3[m] = (char)(i3 ^ i2);
          m = n + 1;
          if (i1 != 0)
            break label133;
          localObject3 = localObject2;
          n = m;
          m = i1;
        case 0:
        case 1:
        case 2:
        case 3:
        }
      }
      label133: k = i1;
      localObject1 = localObject2;
    }
    while (true)
    {
      if (k > m)
        break label35;
      String str2 = new String((char[])localObject1).intern();
      switch (i)
      {
      default:
        arrayOfString2[j] = str2;
        str1 = "+i\027\\q&E\034Kn\"o\034\002";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        j = 2;
        arrayOfString2 = arrayOfString1;
        str1 = "\026f\034@m&k\r]yy(\fVu\"f\035Tx'(\024Kzc%Y";
        i = 1;
        break;
      case 1:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 67;
        break label96;
        i3 = 8;
        break label96;
        i3 = 121;
        break label96;
        i3 = 56;
        break label96;
        m = 0;
      }
    }
  }

  public m(PushService paramPushService)
  {
    this.a = new WeakReference(paramPushService);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    new StringBuilder(z[1]).append(paramMessage.toString());
    ac.a();
    PushService localPushService = (PushService)this.a.get();
    if ((localPushService == null) || (PushService.a(localPushService) == null) || (!PushService.a(localPushService).isAlive()))
    {
      ac.d();
      return;
    }
    Context localContext = localPushService.getApplicationContext();
    switch (paramMessage.what)
    {
    default:
      new StringBuilder(z[2]).append(paramMessage.what);
      ac.a();
      return;
    case 1001:
      ac.b();
      localPushService.stopSelf();
      ConnectingHelper.sendConnectionChanged(localContext, a.b);
      return;
    case 1003:
      localPushService.stopSelf();
      return;
    case 1002:
      i.a(localContext, true, PushService.b, PushService.d, PushService.c);
      return;
    case 1011:
      PushService.b(localPushService);
      return;
    case 1010:
      PushService.a(localPushService, PushService.c(localPushService));
      return;
    case 1004:
      PushService.a(localPushService, true);
      return;
    case 1005:
      PushService.a(localPushService, false);
      return;
    case 1006:
      removeMessages(1011);
      removeMessages(1010);
      sendEmptyMessageDelayed(1011, 3000L);
      return;
    case 1007:
      sendEmptyMessageDelayed(1010, 200L);
      return;
    case 7302:
      PushService.a(localPushService).a(paramMessage.getData().getLong(z[0]), paramMessage.obj);
      return;
    case 7304:
      PushService.a(localPushService, paramMessage.getData().getLong(z[0]));
      return;
    case 7301:
      PushService.b(localPushService, paramMessage.getData().getLong(z[0]));
      return;
    case 7303:
      PushService.c(localPushService, paramMessage.getData().getLong(z[0]));
      return;
    case 7306:
      PushService.a(localPushService, paramMessage.getData().getLong(z[0]), paramMessage.arg2);
      return;
    case 7307:
      k.b.set(false);
      return;
    case 7501:
      PushService.a(localPushService).a((h)paramMessage.obj, 0);
      return;
    case 7502:
      PushService.a(localPushService).a((h)paramMessage.obj, 0);
      return;
    case 1022:
      PushService.d(localPushService);
      return;
    case 1009:
    }
    PushService.a(localPushService).a(k.a.get(), paramMessage.obj);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */