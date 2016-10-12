package android.security;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.org.bouncycastle.util.io.pem.PemObject;
import com.android.org.bouncycastle.util.io.pem.PemReader;
import com.android.org.bouncycastle.util.io.pem.PemWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charsets;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class Credentials
{
  public static final String CA_CERTIFICATE = "CACERT_";
  public static final String EXTENSION_CER = ".cer";
  public static final String EXTENSION_CRT = ".crt";
  public static final String EXTENSION_P12 = ".p12";
  public static final String EXTENSION_PFX = ".pfx";
  public static final String EXTRA_CA_CERTIFICATES_DATA = "ca_certificates_data";
  public static final String EXTRA_CA_CERTIFICATES_NAME = "ca_certificates_name";
  public static final String EXTRA_PRIVATE_KEY = "PKEY";
  public static final String EXTRA_PUBLIC_KEY = "KEY";
  public static final String EXTRA_USER_CERTIFICATE_DATA = "user_certificate_data";
  public static final String EXTRA_USER_CERTIFICATE_NAME = "user_certificate_name";
  public static final String EXTRA_USER_PRIVATE_KEY_DATA = "user_private_key_data";
  public static final String EXTRA_USER_PRIVATE_KEY_NAME = "user_private_key_name";
  public static final String INSTALL_ACTION = "android.credentials.INSTALL";
  public static final String LOCKDOWN_VPN = "LOCKDOWN_VPN";
  private static final String LOGTAG = "Credentials";
  public static final String UNLOCK_ACTION = "com.android.credentials.UNLOCK";
  public static final String USER_CERTIFICATE = "USRCERT_";
  public static final String USER_PRIVATE_KEY = "USRPKEY_";
  public static final String VPN = "VPN_";
  public static final String WIFI = "WIFI_";
  private static Credentials singleton;

  public Credentials()
  {
  }

  public static List<X509Certificate> convertFromPem(byte[] paramArrayOfByte)
    throws IOException, CertificateException
  {
    PemReader localPemReader = new PemReader(new InputStreamReader(new ByteArrayInputStream(paramArrayOfByte), Charsets.US_ASCII));
    CertificateFactory localCertificateFactory = CertificateFactory.getInstance("X509");
    ArrayList localArrayList = new ArrayList();
    PemObject localPemObject;
    while (true)
    {
      localPemObject = localPemReader.readPemObject();
      if (localPemObject == null)
        break label124;
      if (!localPemObject.getType().equals("CERTIFICATE"))
        break;
      localArrayList.add((X509Certificate)localCertificateFactory.generateCertificate(new ByteArrayInputStream(localPemObject.getContent())));
    }
    throw new IllegalArgumentException("Unknown type " + localPemObject.getType());
    label124: localPemReader.close();
    return localArrayList;
  }

  public static byte[] convertToPem(Certificate[] paramArrayOfCertificate)
    throws IOException, CertificateEncodingException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PemWriter localPemWriter = new PemWriter(new OutputStreamWriter(localByteArrayOutputStream, Charsets.US_ASCII));
    int i = paramArrayOfCertificate.length;
    for (int j = 0; j < i; j++)
      localPemWriter.writeObject(new PemObject("CERTIFICATE", paramArrayOfCertificate[j].getEncoded()));
    localPemWriter.close();
    return localByteArrayOutputStream.toByteArray();
  }

  static boolean deleteAllTypesForAlias(KeyStore paramKeyStore, String paramString)
  {
    return paramKeyStore.delKey("USRPKEY_" + paramString) | deleteCertificateTypesForAlias(paramKeyStore, paramString);
  }

  static boolean deleteCertificateTypesForAlias(KeyStore paramKeyStore, String paramString)
  {
    return paramKeyStore.delete("USRCERT_" + paramString) | paramKeyStore.delete("CACERT_" + paramString);
  }

  public static Credentials getInstance()
  {
    if (singleton == null)
      singleton = new Credentials();
    return singleton;
  }

  public void install(Context paramContext)
  {
    try
    {
      paramContext.startActivity(KeyChain.createInstallIntent());
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("Credentials", localActivityNotFoundException.toString());
    }
  }

  public void install(Context paramContext, String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      Intent localIntent = KeyChain.createInstallIntent();
      localIntent.putExtra(paramString, paramArrayOfByte);
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("Credentials", localActivityNotFoundException.toString());
    }
  }

  public void install(Context paramContext, KeyPair paramKeyPair)
  {
    try
    {
      Intent localIntent = KeyChain.createInstallIntent();
      localIntent.putExtra("PKEY", paramKeyPair.getPrivate().getEncoded());
      localIntent.putExtra("KEY", paramKeyPair.getPublic().getEncoded());
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("Credentials", localActivityNotFoundException.toString());
    }
  }

  public void unlock(Context paramContext)
  {
    try
    {
      paramContext.startActivity(new Intent("com.android.credentials.UNLOCK"));
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("Credentials", localActivityNotFoundException.toString());
    }
  }
}

/* Location:
 * Qualified Name:     android.security.Credentials
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */