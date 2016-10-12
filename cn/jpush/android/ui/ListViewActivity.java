package cn.jpush.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import cn.jpush.android.data.c;
import cn.jpush.android.util.ac;
import java.util.List;

public class ListViewActivity extends Activity
{
  private static final String z;
  private c a;

  static
  {
    Object localObject1 = "WZI=".toCharArray();
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
        i1 = 47;
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
      i1 = 53;
      continue;
      i1 = 53;
      continue;
      i1 = 45;
      continue;
      i1 = 68;
    }
  }

  public ListViewActivity()
  {
  }

  protected void onCreate(Bundle paramBundle)
  {
    ac.c();
    super.onCreate(paramBundle);
    if (getIntent() != null)
    {
      this.a = ((c)getIntent().getSerializableExtra(z));
      c localc = this.a;
      ac.c();
      GridView localGridView = new GridView(getApplicationContext());
      localGridView.setNumColumns(2);
      List localList = localc.u;
      localGridView.setAdapter(new e(this, -2147483648, localList));
      localGridView.setOnItemClickListener(new d(this, localList));
      setContentView(localGridView);
      return;
    }
    ac.d();
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.ui.ListViewActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */