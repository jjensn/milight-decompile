package com.irainxun.wifilight.view;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;

class MyLayout$ScrollTask extends AsyncTask<Integer, Integer, Integer>
{
  MyLayout$ScrollTask(MyLayout paramMyLayout)
  {
  }

  protected Integer doInBackground(Integer[] paramArrayOfInteger)
  {
    int i = MyLayout.access$0(this.this$0).leftMargin;
    while (true)
    {
      i += paramArrayOfInteger[0].intValue();
      if (i < -MyLayout.access$1(this.this$0).getWidth());
      for (int j = -MyLayout.access$1(this.this$0).getWidth(); ; j = 0)
      {
        MyLayout.access$2(this.this$0, false);
        return Integer.valueOf(j);
        if (i <= 0)
          break;
      }
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf(i);
      publishProgress(arrayOfInteger);
      SystemClock.sleep(20L);
    }
  }

  protected void onPostExecute(Integer paramInteger)
  {
    MyLayout.access$0(this.this$0).leftMargin = paramInteger.intValue();
    MyLayout.access$3(this.this$0).setLayoutParams(MyLayout.access$0(this.this$0));
  }

  protected void onProgressUpdate(Integer[] paramArrayOfInteger)
  {
    MyLayout.access$0(this.this$0).leftMargin = paramArrayOfInteger[0].intValue();
    MyLayout.access$3(this.this$0).setLayoutParams(MyLayout.access$0(this.this$0));
    MyLayout.access$4(this.this$0);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.MyLayout.ScrollTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */