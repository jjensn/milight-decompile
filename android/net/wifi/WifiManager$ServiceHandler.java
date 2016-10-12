package android.net.wifi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.android.internal.util.AsyncChannel;
import java.util.concurrent.CountDownLatch;

class WifiManager$ServiceHandler extends Handler
{
  WifiManager$ServiceHandler(WifiManager paramWifiManager, Looper paramLooper)
  {
    super(paramLooper);
  }

  public void handleMessage(Message paramMessage)
  {
    Object localObject1 = WifiManager.access$000(this.this$0, paramMessage.arg2);
    switch (paramMessage.what)
    {
    case 69634:
    default:
    case 69632:
    case 69636:
    case 151554:
    case 151557:
    case 151560:
    case 151567:
    case 151570:
    case 151555:
    case 151558:
    case 151561:
    case 151568:
    case 151571:
    case 151563:
    case 151565:
    case 151564:
    case 151573:
    case 151574:
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                  if (paramMessage.arg1 == 0)
                    WifiManager.access$100(this.this$0).sendMessage(69633);
                  while (true)
                  {
                    WifiManager.access$200(this.this$0).countDown();
                    return;
                    Log.e("WifiManager", "Failed to set up channel connection");
                    WifiManager.access$102(this.this$0, null);
                  }
                  Log.e("WifiManager", "Channel connection lost");
                  WifiManager.access$102(this.this$0, null);
                  getLooper().quit();
                  return;
                }
                while (localObject1 == null);
                ((WifiManager.ActionListener)localObject1).onFailure(paramMessage.arg1);
                return;
              }
              while (localObject1 == null);
              ((WifiManager.ActionListener)localObject1).onSuccess();
              return;
            }
            while (localObject1 == null);
            WpsResult localWpsResult = (WpsResult)paramMessage.obj;
            ((WifiManager.WpsListener)localObject1).onStartSuccess(localWpsResult.pin);
            synchronized (WifiManager.access$300(this.this$0))
            {
              WifiManager.access$400(this.this$0).put(paramMessage.arg2, localObject1);
              return;
            }
          }
          while (localObject1 == null);
          ((WifiManager.WpsListener)localObject1).onCompletion();
          return;
        }
        while (localObject1 == null);
        ((WifiManager.WpsListener)localObject1).onFailure(paramMessage.arg1);
        return;
      }
      while (localObject1 == null);
      RssiPacketCountInfo localRssiPacketCountInfo = (RssiPacketCountInfo)paramMessage.obj;
      if (localRssiPacketCountInfo != null)
      {
        ((WifiManager.TxPacketCountListener)localObject1).onSuccess(localRssiPacketCountInfo.txgood + localRssiPacketCountInfo.txbad);
        return;
      }
      ((WifiManager.TxPacketCountListener)localObject1).onFailure(0);
      return;
    }
    while (localObject1 == null);
    ((WifiManager.TxPacketCountListener)localObject1).onFailure(paramMessage.arg1);
  }
}

/* Location:
 * Qualified Name:     android.net.wifi.WifiManager.ServiceHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */