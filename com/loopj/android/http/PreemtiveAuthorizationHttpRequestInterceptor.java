package com.loopj.android.http;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.protocol.HttpContext;

public class PreemtiveAuthorizationHttpRequestInterceptor
  implements HttpRequestInterceptor
{
  public PreemtiveAuthorizationHttpRequestInterceptor()
  {
  }

  public void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
    throws HttpException, IOException
  {
    AuthState localAuthState = (AuthState)paramHttpContext.getAttribute("http.auth.target-scope");
    CredentialsProvider localCredentialsProvider = (CredentialsProvider)paramHttpContext.getAttribute("http.auth.credentials-provider");
    HttpHost localHttpHost = (HttpHost)paramHttpContext.getAttribute("http.target_host");
    if (localAuthState.getAuthScheme() == null)
    {
      Credentials localCredentials = localCredentialsProvider.getCredentials(new AuthScope(localHttpHost.getHostName(), localHttpHost.getPort()));
      if (localCredentials != null)
      {
        localAuthState.setAuthScheme(new BasicScheme());
        localAuthState.setCredentials(localCredentials);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.loopj.android.http.PreemtiveAuthorizationHttpRequestInterceptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */