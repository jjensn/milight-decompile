package cn.jpush.android.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import cn.jpush.android.data.c;
import cn.jpush.android.util.b;
import java.util.List;

final class d
  implements AdapterView.OnItemClickListener
{
  d(ListViewActivity paramListViewActivity, List paramList)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c localc = (c)this.a.get(paramInt);
    localc.p = false;
    Intent localIntent = b.a(this.b, localc, false);
    this.b.startActivity(localIntent);
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */