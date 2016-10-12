package cn.jpush.android.api;

import android.content.Context;
import android.widget.RemoteViews;
import cn.jpush.android.e;

public class CustomPushNotificationBuilder extends BasicPushNotificationBuilder
{
  private static final String[] z;
  public int layout;
  public int layoutContentId;
  public int layoutIconDrawable = e.b;
  public int layoutIconId;
  public int layoutTitleId;

  static
  {
    String[] arrayOfString1 = new String[2];
    String str1 = "{m\023J\026uG?a&G";
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
          i3 = 121;
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
        str1 = "GG?a&";
        j = 1;
        arrayOfString2 = arrayOfString1;
        i = 0;
        break;
      case 0:
        arrayOfString2[j] = str2;
        z = arrayOfString1;
        return;
        i3 = 24;
        break label96;
        i3 = 24;
        break label96;
        i3 = 96;
        break label96;
        i3 = 62;
        break label96;
        m = 0;
      }
    }
  }

  CustomPushNotificationBuilder(Context paramContext)
  {
    super(paramContext);
  }

  public CustomPushNotificationBuilder(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramContext);
    this.layout = paramInt1;
    this.layoutIconId = paramInt2;
    this.layoutTitleId = paramInt3;
    this.layoutContentId = paramInt4;
  }

  final void a(String[] paramArrayOfString)
  {
    super.a(paramArrayOfString);
    this.layout = Integer.parseInt(paramArrayOfString[5]);
    this.layoutIconId = Integer.parseInt(paramArrayOfString[6]);
    this.layoutTitleId = Integer.parseInt(paramArrayOfString[7]);
    this.layoutContentId = Integer.parseInt(paramArrayOfString[8]);
    this.layoutIconDrawable = Integer.parseInt(paramArrayOfString[9]);
  }

  final RemoteViews b(String paramString)
  {
    RemoteViews localRemoteViews = new RemoteViews(this.a.getPackageName(), this.layout);
    localRemoteViews.setTextViewText(this.layoutTitleId, this.b);
    localRemoteViews.setImageViewResource(this.layoutIconId, this.layoutIconDrawable);
    localRemoteViews.setTextViewText(this.layoutContentId, paramString);
    return localRemoteViews;
  }

  final String b()
  {
    return super.b() + z[1] + this.layout + z[1] + this.layoutIconId + z[1] + this.layoutTitleId + z[1] + this.layoutContentId + z[1] + this.layoutIconDrawable;
  }

  public String toString()
  {
    return z[0] + b();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.api.CustomPushNotificationBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */