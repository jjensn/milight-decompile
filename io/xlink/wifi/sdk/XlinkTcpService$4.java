package io.xlink.wifi.sdk;

import android.content.res.AssetManager;
import android.content.res.Resources;
import io.xlink.wifi.sdk.event.c;
import io.xlink.wifi.sdk.global.a;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

class XlinkTcpService$4 extends Thread
{
  XlinkTcpService$4(XlinkTcpService paramXlinkTcpService)
  {
  }

  public void run()
  {
    super.run();
    if (XlinkTcpService.c())
    {
      XlinkTcpService.a(this.a, "isConnected is true  --return connectInSSL()");
      return;
    }
    try
    {
      if (XlinkTcpService.c(this.a) == null)
        XlinkTcpService.a(this.a, InetAddress.getByName(a.a));
      SSLContext localSSLContext = SSLContext.getInstance("SSL");
      KeyStore localKeyStore1 = KeyStore.getInstance("BKS");
      InputStream localInputStream1 = this.a.getResources().getAssets().open("xlink_kclient.bks");
      InputStream localInputStream2 = this.a.getResources().getAssets().open("xlink_tclient.bks");
      localKeyStore1.load(localInputStream1, "123456".toCharArray());
      KeyStore localKeyStore2 = KeyStore.getInstance("BKS");
      localKeyStore2.load(localInputStream2, "123456".toCharArray());
      KeyManagerFactory localKeyManagerFactory = KeyManagerFactory.getInstance("X509");
      localKeyManagerFactory.init(localKeyStore1, "123456".toCharArray());
      TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance("X509");
      localTrustManagerFactory.init(localKeyStore2);
      localSSLContext.init(localKeyManagerFactory.getKeyManagers(), localTrustManagerFactory.getTrustManagers(), null);
      XlinkTcpService.a(this.a, "SSLContext initialize succeed");
      SSLSocketFactory localSSLSocketFactory = localSSLContext.getSocketFactory();
      XlinkTcpService.a(this.a, (SSLSocket)localSSLSocketFactory.createSocket(XlinkTcpService.c(this.a), a.c));
      XlinkTcpService.b(this.a, XlinkTcpService.d(this.a));
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      XlinkTcpService.e(this.a);
      XlinkTcpService.d = false;
      XlinkTcpService.a(this.a, "UnknownHostException connect SSL tcp error...");
      c.a(5, -1);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      XlinkTcpService.e(this.a);
      XlinkTcpService.d = false;
      XlinkTcpService.a(this.a, "connect SSL tcp IOException...");
      c.a(5, -1);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      XlinkTcpService.e(this.a);
      XlinkTcpService.d = false;
      XlinkTcpService.a(this.a, "connect SSL tcp Exception...");
      c.a(5, -1);
      return;
    }
    finally
    {
      XlinkTcpService.d = false;
    }
  }
}

/* Location:
 * Qualified Name:     io.xlink.wifi.sdk.XlinkTcpService.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */