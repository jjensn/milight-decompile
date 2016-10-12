package cn.jpush.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import cn.jpush.android.api.m;
import cn.jpush.android.data.a;
import cn.jpush.android.data.c;
import cn.jpush.android.e;
import cn.jpush.android.helpers.f;
import cn.jpush.android.util.ac;
import cn.jpush.android.util.an;
import cn.jpush.android.util.p;
import java.io.File;

public class PushReceiver extends BroadcastReceiver
{
  public static c a;
  private static final String[] z;

  static
  {
    Object localObject1 = new String[52];
    int i = 0;
    String str1 = "Knt;\005)mJ:\0233BE-\023oKJ\036\0274WAf_";
    int j = -1;
    Object localObject2 = localObject1;
    Object localObject3 = str1.toCharArray();
    int k = localObject3.length;
    int m = 0;
    label36: Object localObject4;
    int n;
    int i1;
    Object localObject5;
    label52: int i2;
    int i3;
    if (k <= 1)
    {
      localObject4 = localObject3;
      n = m;
      i1 = k;
      localObject5 = localObject3;
      i2 = localObject5[m];
      switch (n % 5)
      {
      default:
        i3 = 118;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject5[m] = (char)(i3 ^ i2);
      m = n + 1;
      if (i1 == 0)
      {
        localObject5 = localObject4;
        n = m;
        m = i1;
        break label52;
      }
      k = i1;
      localObject3 = localObject4;
      if (k > m)
        break label36;
      String str2 = new String((char[])localObject3).intern();
      switch (j)
      {
      default:
        localObject1[i] = str2;
        i = 1;
        str1 = "#K@7";
        localObject1 = localObject2;
        j = 0;
        break;
      case 0:
        localObject1[i] = str2;
        i = 2;
        str1 = "oTA<\033(WW'\031/\nn\036#\022l{\0033\022we\t3";
        j = 1;
        localObject1 = localObject2;
        break;
      case 1:
        localObject1[i] = str2;
        i = 3;
        str1 = " TT\007\022";
        j = 2;
        localObject1 = localObject2;
        break;
      case 2:
        localObject1[i] = str2;
        i = 4;
        str1 = "K皠.!\030\023AW;\033$\f\rD\031/tE;\005$\f\rD";
        j = 3;
        localObject1 = localObject2;
        break;
      case 3:
        localObject1[i] = str2;
        i = 5;
        str1 = "";
        j = 4;
        localObject1 = localObject2;
        break;
      case 4:
        localObject1[i] = str2;
        i = 6;
        str1 = "";
        j = 5;
        localObject1 = localObject2;
        break;
      case 5:
        localObject1[i] = str2;
        i = 7;
        str1 = "\022AJ*V#VK/\022\"EW:V5K\004/\0061\036\004";
        j = 6;
        localObject1 = localObject2;
        break;
      case 6:
        localObject1[i] = str2;
        i = 8;
        str1 = "";
        j = 7;
        localObject1 = localObject2;
        break;
      case 7:
        localObject1[i] = str2;
        i = 9;
        str1 = " TT";
        j = 8;
        localObject1 = localObject2;
        break;
      case 8:
        localObject1[i] = str2;
        i = 10;
        str1 = "2AJ*\0233m@";
        j = 9;
        localObject1 = localObject2;
        break;
      case 9:
        localObject1[i] = str2;
        i = 11;
        str1 = "K.月掞祌厫圌弤原戥卄犒急久册珱\b叵幍戥卄丩伾冴珆o";
        j = 10;
        localObject1 = localObject2;
        break;
      case 10:
        localObject1[i] = str2;
        i = 12;
        str1 = "/AP9\0313Om \020.";
        j = 11;
        localObject1 = localObject2;
        break;
      case 11:
        localObject1[i] = str2;
        i = 13;
        str1 = "1EG%\027&A\036";
        j = 12;
        localObject1 = localObject2;
        break;
      case 12:
        localObject1[i] = str2;
        i = 14;
        str1 = "\013tQ=\036a廞變隈扦aw`\005V斷劄丮纑诗亢砥仁變但揩逥敬柒ぴa..梎洽剱圌.";
        j = 13;
        localObject1 = localObject2;
        break;
      case 13:
        localObject1[i] = str2;
        i = 15;
        str1 = "{\004c+\002aJKn\022 PEn\0203KIn\037/PA \002o";
        j = 14;
        localObject1 = localObject2;
        break;
      case 14:
        localObject1[i] = str2;
        i = 16;
        str1 = "K皠.!\030\023AW;\033$\f\rD";
        j = 15;
        localObject1 = localObject2;
        break;
      case 15:
        localObject1[i] = str2;
        i = 17;
        str1 = "";
        j = 16;
        localObject1 = localObject2;
        break;
      case 16:
        localObject1[i] = str2;
        i = 18;
        str1 = "Knt;\005)mJ:\0233BE-\023oKJ\034\0232QI+^h";
        j = 17;
        localObject1 = localObject2;
        break;
      case 17:
        localObject1[i] = str2;
        i = 19;
        str1 = ".PL+\004aJA:\001.VOn\0055EP+Vl\004";
        j = 18;
        localObject1 = localObject2;
        break;
      case 18:
        localObject1[i] = str2;
        i = 20;
        str1 = "/KP\021\0274PK<\003/";
        j = 19;
        localObject1 = localObject2;
        break;
      case 19:
        localObject1[i] = str2;
        i = 21;
        str1 = "\006KPn\027/\004A#\0065]\004 \0315MB'\025 PM!\030m\004@!\030fP\004=\036.S\004'\002`";
        j = 20;
        localObject1 = localObject2;
        break;
      case 20:
        localObject1[i] = str2;
        i = 22;
        str1 = " J@<\031(@\n'\0305AJ:X GP'\031/\nq\0353\023{t\0343\022aj\032";
        j = 21;
        localObject1 = localObject2;
        break;
      case 21:
        localObject1[i] = str2;
        i = 23;
        str1 = "%AF;\021\036JK:\037'MG/\002(KJ";
        j = 22;
        localObject1 = localObject2;
        break;
      case 22:
        localObject1[i] = str2;
        i = 24;
        str1 = "\002KJ \023\"PM!\030aWP/\002$\004G&\027/CA*V5K\004cV";
        j = 23;
        localObject1 = localObject2;
        break;
      case 23:
        localObject1[i] = str2;
        i = 25;
        str1 = "5KE=\002\025A\\:";
        j = 24;
        localObject1 = localObject2;
        break;
      case 24:
        localObject1[i] = str2;
        i = 26;
        str1 = "\"J\n$\0064WL`\027/@V!\037%\nM \002$JP`8\016pm\b?\002ep\0079\017{v\0135\004mr\0132\036tv\001.\030";
        j = 25;
        localObject1 = localObject2;
        break;
      case 25:
        localObject1[i] = str2;
        i = 27;
        str1 = "";
        j = 26;
        localObject1 = localObject2;
        break;
      case 26:
        localObject1[i] = str2;
        i = 28;
        str1 = "旸泱三泯板豂甌";
        j = 27;
        localObject1 = localObject2;
        break;
      case 27:
        localObject1[i] = str2;
        i = 29;
        str1 = " TT\"\037\"EP'\031/\013R \022oEJ*\004.M@`\006 GO/\021$\tE<\025)MR+";
        j = 28;
        localObject1 = localObject2;
        break;
      case 28:
        localObject1[i] = str2;
        i = 30;
        str1 = "\006APn\0013KJ)V%EP/V2PV'\030&\004B<\031,\004M \002$JPtV";
        j = 29;
        localObject1 = localObject2;
        break;
      case 29:
        localObject1[i] = str2;
        i = 31;
        str1 = " J@<\031(@\n'\0305AJ:X GP'\031/\nt\0175\nec\013)\023ai\001 \004`";
        j = 30;
        localObject1 = localObject2;
        break;
      case 30:
        localObject1[i] = str2;
        i = 32;
        str1 = "\"J\n$\0064WL`\027/@V!\037%\nM \002$JP`8\016pm\b?\002ep\0079\017{k\0363\017a`";
        j = 31;
        localObject1 = localObject2;
        break;
      case 31:
        localObject1[i] = str2;
        i = 33;
        str1 = "\"J\n$\0064WL`\027/@V!\037%\ni\0351\036m`";
        j = 32;
        localObject1 = localObject2;
        break;
      case 32:
        localObject1[i] = str2;
        i = 34;
        str1 = " J@<\031(@\n'\0305AJ:X GP'\031/\nf\0019\025{g\001;\021ha\0323\005";
        j = 33;
        localObject1 = localObject2;
        break;
      case 33:
        localObject1[i] = str2;
        i = 35;
        str1 = "Knt;\005)mJ:\0233BE-\023oKJ\034\0232QI+^h.n\036\0032Lm \002$VB/\025$\nK & QW+^h";
        j = 34;
        localObject1 = localObject2;
        break;
      case 34:
        localObject1[i] = str2;
        i = 36;
        str1 = "K皠.!\030\021EQ=\023i\r.";
        j = 35;
        localObject1 = localObject2;
        break;
      case 35:
        localObject1[i] = str2;
        i = 37;
        str1 = ",WC\021\037%";
        j = 36;
        localObject1 = localObject2;
        break;
      case 36:
        localObject1[i] = str2;
        i = 38;
        str1 = "";
        j = 37;
        localObject1 = localObject2;
        break;
      case 37:
        localObject1[i] = str2;
        i = 39;
        str1 = " J@<\031(@\n'\0305AJ:X GP'\031/\nr\0073\026";
        j = 38;
        localObject1 = localObject2;
        break;
      case 38:
        localObject1[i] = str2;
        i = 40;
        str1 = "o\004`!V/KP&\037/C\n";
        j = 39;
        localObject1 = localObject2;
        break;
      case 39:
        localObject1[i] = str2;
        i = 41;
        str1 = ".Jv+\025$MR+Vl\004";
        j = 40;
        localObject1 = localObject2;
        break;
      case 40:
        localObject1[i] = str2;
        i = 42;
        str1 = "";
        j = 41;
        localObject1 = localObject2;
        break;
      case 41:
        localObject1[i] = str2;
        i = 43;
        str1 = ",AW=\027&A";
        j = 42;
        localObject1 = localObject2;
        break;
      case 42:
        localObject1[i] = str2;
        i = 44;
        str1 = "/KP'\020(GE'\031/{P7\006$";
        j = 43;
        localObject1 = localObject2;
        break;
      case 43:
        localObject1[i] = str2;
        i = 45;
        str1 = "/Kg!\030/AG:\0377MP7";
        j = 44;
        localObject1 = localObject2;
        break;
      case 44:
        localObject1[i] = str2;
        i = 46;
        str1 = "";
        j = 45;
        localObject1 = localObject2;
        break;
      case 45:
        localObject1[i] = str2;
        i = 47;
        str1 = "";
        j = 46;
        localObject1 = localObject2;
        break;
      case 46:
        localObject1[i] = str2;
        i = 48;
        str1 = "";
        j = 47;
        localObject1 = localObject2;
        break;
      case 47:
        localObject1[i] = str2;
        i = 49;
        str1 = "5]T+";
        j = 48;
        localObject1 = localObject2;
        break;
      case 48:
        localObject1[i] = str2;
        i = 50;
        str1 = "\"J\n$\0064WL`\027/@V!\037%\nM \002$JP`8\016pm\b?\002ep\0079\017{k\0363\017a`\021&\023k|\027";
        j = 49;
        localObject1 = localObject2;
        break;
      case 49:
        localObject1[i] = str2;
        i = 51;
        str1 = "";
        j = 50;
        localObject1 = localObject2;
        break;
      case 50:
        localObject1[i] = str2;
        z = localObject2;
        a = null;
        return;
        i3 = 65;
        continue;
        i3 = 36;
        continue;
        i3 = 36;
        continue;
        i3 = 78;
      }
    }
  }

  public PushReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      ac.d(z[48], z[46]);
    String str1;
    while (true)
    {
      return;
      try
      {
        str1 = paramIntent.getAction();
        ac.b(z[48], z[41] + str1);
        if (e.a(paramContext.getApplicationContext()))
          if (str1.equals(z[34]))
          {
            p.c(paramContext);
            ServiceInterface.c(paramContext, 500);
            return;
          }
      }
      catch (NullPointerException localNullPointerException)
      {
        ac.d(z[48], z[27]);
        return;
      }
    }
    String str15;
    String str16;
    String str17;
    if (str1.equals(z[38]))
    {
      str15 = paramIntent.getDataString();
      if (str15 != null)
        if ((str15.trim().length() > 8) && (str15.startsWith(z[13])))
        {
          str16 = str15.substring(8);
          str17 = cn.jpush.android.data.b.a(paramContext, str16);
          cn.jpush.android.helpers.i.a(paramContext, r.a(str16));
          ServiceInterface.b(paramContext.getApplicationContext(), str16);
        }
    }
    while (true)
    {
      String str18;
      try
      {
        if (TextUtils.isEmpty(str17))
          break;
        String[] arrayOfString = str17.split(",");
        if (arrayOfString.length <= 0)
          break;
        str18 = arrayOfString[0];
        cn.jpush.android.helpers.i.a(str18, 1002, paramContext);
        if (arrayOfString.length < 2)
          break label1865;
        str19 = arrayOfString[1];
        str20 = "";
        if (arrayOfString.length >= 3)
          str20 = arrayOfString[2];
        ac.e();
        if ((!str19.equals(z[20])) && (!cn.jpush.android.util.b.a(paramContext, str16, str19)))
        {
          ac.b();
          cn.jpush.android.helpers.i.a(str18, 1100, paramContext);
        }
        if (!an.a(str20))
        {
          m.a(paramContext, str20);
          return;
        }
      }
      catch (Exception localException)
      {
        localException.getMessage();
        ac.e();
        return;
      }
      while (true)
      {
        ac.d(z[48], z[30] + str15);
        return;
        ac.d(z[48], str1 + z[15]);
        return;
        if (str1.equals(z[31]))
        {
          String str13 = paramIntent.getDataString();
          if (str13 != null)
          {
            if ((str13.trim().length() > 8) && (str13.startsWith(z[13])))
            {
              String str14 = str13.substring(8);
              cn.jpush.android.helpers.i.a(paramContext, r.b(str14));
              ServiceInterface.b(paramContext.getApplicationContext(), str14);
              return;
            }
            ac.d(z[48], z[30] + str13);
            return;
          }
          ac.d(z[48], str1 + z[15]);
          return;
        }
        if (str1.equals(z[22]))
        {
          ServiceInterface.b(paramContext);
          return;
        }
        if (str1.equals(z[6]))
        {
          c localc = (c)paramIntent.getSerializableExtra(z[1]);
          if ((localc == null) || (!localc.a()))
            break;
          cn.jpush.android.helpers.i.a(localc.c, 1015, paramContext);
          cn.jpush.android.data.i locali = (cn.jpush.android.data.i)localc;
          Intent localIntent2 = new Intent();
          localIntent2.addFlags(268435456);
          localIntent2.setAction(z[39]);
          localIntent2.setDataAndType(Uri.fromFile(new File(locali.P)), z[29]);
          paramContext.startActivity(localIntent2);
          return;
        }
        if (str1.startsWith(z[26]))
        {
          int i4 = paramIntent.getIntExtra(z[44], 0);
          new StringBuilder(z[47]).append(i4);
          ac.b();
          if (i4 == 0)
          {
            if (ServiceInterface.e(paramContext))
            {
              ac.c();
              return;
            }
            if (!cn.jpush.android.util.b.m(paramContext))
            {
              ac.c();
              return;
            }
          }
          String str11 = paramIntent.getStringExtra(z[43]);
          if (an.a(str11))
          {
            ac.d(z[48], z[21]);
            return;
          }
          String str12 = paramIntent.getStringExtra(z[10]);
          a locala = f.a(paramContext, str11, paramIntent.getStringExtra(z[3]), str12, paramIntent.getStringExtra(z[37]));
          if (locala == null)
          {
            ac.d();
            return;
          }
          locala.h = true;
          f.a(paramContext, locala);
          abortBroadcast();
          return;
        }
        if (str1.startsWith(z[50]))
        {
          if (paramIntent.getBooleanExtra(z[23], false))
          {
            String str5 = paramIntent.getStringExtra(z[42]);
            int j = paramIntent.getIntExtra(z[49], -1);
            if (j == -1)
            {
              String str10 = paramIntent.getStringExtra(z[25]);
              Toast localToast2 = Toast.makeText(paramContext, str5, 1);
              View localView3 = localToast2.getView();
              if ((localView3 instanceof LinearLayout))
              {
                View localView4 = ((LinearLayout)localView3).getChildAt(0);
                if ((localView4 instanceof TextView))
                {
                  TextView localTextView2 = (TextView)localView4;
                  if (!an.a(str10))
                    localTextView2.setText(str10);
                  localTextView2.setTextSize(13.0F);
                }
              }
              localToast2.show();
              return;
            }
            if (an.a(str5))
              break;
            String str6 = z[14];
            String str7 = z[16];
            String str8 = z[28];
            String str9 = z[18];
            switch (j)
            {
            case 0:
            default:
            case 1:
            case 2:
            }
            while (true)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append(str6).append(str5).append(str7).append(str8).append(str9).append(z[11]);
              SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(localStringBuilder);
              int k = str6.length();
              int m = k + str5.length();
              localSpannableStringBuilder.setSpan(new ForegroundColorSpan(-13527041), k, m, 33);
              int n = m + 2;
              int i1 = -2 + (n + str7.length());
              localSpannableStringBuilder.setSpan(new ForegroundColorSpan(-13527041), n, i1, 33);
              int i2 = i1 + str8.length();
              int i3 = i2 + str9.length();
              localSpannableStringBuilder.setSpan(new ForegroundColorSpan(-13527041), i2, i3, 33);
              Toast localToast1 = Toast.makeText(paramContext, str5, 1);
              View localView1 = localToast1.getView();
              if ((localView1 instanceof LinearLayout))
              {
                View localView2 = ((LinearLayout)localView1).getChildAt(0);
                if ((localView2 instanceof TextView))
                {
                  TextView localTextView1 = (TextView)localView2;
                  if (localSpannableStringBuilder != null)
                    localTextView1.setText(localSpannableStringBuilder);
                  localTextView1.setTextSize(13.0F);
                }
              }
              localToast1.show();
              return;
              str7 = z[36];
              str8 = z[28];
              str9 = z[0];
              continue;
              str7 = z[4];
              str8 = z[28];
              str9 = z[35];
            }
          }
          String str2 = paramIntent.getStringExtra(z[33]);
          if (!an.a(str2))
          {
            String str4 = paramIntent.getStringExtra(z[5]);
            new StringBuilder(z[51]).append(str4);
            ac.b();
            int i = 0;
            if (str4 != null)
            {
              boolean bool2 = "1".equals(str4);
              i = 0;
              if (bool2)
                i = 1;
            }
            if (1 != i)
              cn.jpush.android.helpers.i.a(str2, 1000, paramContext);
          }
          if (!cn.jpush.android.util.b.a(paramContext, z[32], true))
          {
            ac.b(z[48], z[8]);
            cn.jpush.android.util.b.e(paramContext);
            return;
          }
          Intent localIntent1 = new Intent(z[32]);
          localIntent1.putExtras(paramIntent.getExtras());
          String str3 = paramIntent.getStringExtra(z[9]);
          if (an.a(str3))
            str3 = paramContext.getPackageName();
          localIntent1.addCategory(str3);
          new StringBuilder(z[7]).append(str3);
          ac.c();
          paramContext.sendBroadcast(localIntent1, str3 + z[2]);
          return;
        }
        if (!str1.equalsIgnoreCase(z[17]))
          break;
        NetworkInfo localNetworkInfo = (NetworkInfo)paramIntent.getParcelableExtra(z[12]);
        if (localNetworkInfo == null)
        {
          ac.d();
          return;
        }
        new StringBuilder(z[24]).append(localNetworkInfo.toString());
        ac.b();
        if ((2 == localNetworkInfo.getType()) || (3 == localNetworkInfo.getType()))
        {
          ac.b();
          return;
        }
        boolean bool1;
        if (paramIntent.getBooleanExtra(z[45], false))
        {
          ac.b();
          b.b = false;
          ServiceInterface.g(paramContext);
          bool1 = false;
        }
        while (true)
        {
          cn.jpush.android.util.b.a(paramContext, bool1);
          return;
          if (NetworkInfo.State.CONNECTED == localNetworkInfo.getState())
          {
            ac.b();
            ServiceInterface.f(paramContext);
            b.b = true;
            if (DownloadService.a())
            {
              DownloadService.a(paramContext);
              bool1 = true;
            }
          }
          else if (NetworkInfo.State.DISCONNECTED == localNetworkInfo.getState())
          {
            ac.b();
            b.b = false;
            ServiceInterface.g(paramContext);
            bool1 = false;
          }
          else
          {
            new StringBuilder(z[19]).append(localNetworkInfo.getState()).append(z[40]);
            ac.b();
            bool1 = false;
            continue;
            bool1 = true;
          }
        }
        String str20 = str18;
      }
      label1865: String str19 = "";
    }
  }
}

/* Location:
 * Qualified Name:     cn.jpush.android.service.PushReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */