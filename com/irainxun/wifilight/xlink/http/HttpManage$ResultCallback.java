package com.irainxun.wifilight.xlink.http;

import com.google.gson.Gson;
import com.google.gson.internal..Gson.Types;
import com.loopj.android.http.TextHttpResponseHandler;
import java.io.PrintStream;
import java.lang.reflect.Type;
import org.apache.http.Header;

public abstract class HttpManage$ResultCallback<T> extends TextHttpResponseHandler
{
  private Gson mGson = new Gson();
  Type mType = getSuperclassTypeParameter(getClass());

  public HttpManage$ResultCallback()
  {
  }

  static Type getSuperclassTypeParameter(Class<?> paramClass)
  {
    Type localType = paramClass.getGenericSuperclass();
    System.out.println(localType);
    if ((localType instanceof Class))
      System.out.println(localType);
    return .Gson.Types.canonicalize(((java.lang.reflect.ParameterizedType)localType).getActualTypeArguments()[0]);
  }

  public abstract void onError(Header[] paramArrayOfHeader, HttpManage.Error paramError);

  public void onFailure(int paramInt, Header[] paramArrayOfHeader, String paramString, Throwable paramThrowable)
  {
    if (paramInt > 0)
      try
      {
        onError(paramArrayOfHeader, ((HttpManage.ErrorEntity)this.mGson.fromJson(paramString, HttpManage.ErrorEntity.class)).error);
        return;
      }
      catch (Exception localException)
      {
        HttpManage.ErrorEntity localErrorEntity2 = new HttpManage.ErrorEntity();
        localErrorEntity2.error.setMsg(paramThrowable.getMessage());
        localErrorEntity2.error.setCode(1001001);
        onError(paramArrayOfHeader, localErrorEntity2.error);
        return;
      }
    HttpManage.ErrorEntity localErrorEntity1 = new HttpManage.ErrorEntity();
    localErrorEntity1.error.setMsg(paramThrowable.getMessage());
    localErrorEntity1.error.setCode(1001001);
    onError(paramArrayOfHeader, localErrorEntity1.error);
  }

  public abstract void onSuccess(int paramInt, T paramT);

  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, String paramString)
  {
    if (this.mType == String.class)
    {
      onSuccess(paramInt, paramString);
      return;
    }
    onSuccess(paramInt, this.mGson.fromJson(paramString, this.mType));
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.http.HttpManage.ResultCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */