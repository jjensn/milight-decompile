package com.irainxun.wifilight.xlink;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

public class CustomDialog extends Dialog
{
  private CustomDialog(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramContext, R.style.Theme_dialog);
    setContentView(paramInt3);
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    paramContext.getResources().getDisplayMetrics();
    localLayoutParams.width = paramInt1;
    localLayoutParams.height = paramInt2;
    localLayoutParams.gravity = 17;
    localWindow.setAttributes(localLayoutParams);
  }

  public static CustomDialog createBigDialog(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return new CustomDialog(paramContext, (int)(0.85D * localDisplayMetrics.widthPixels), (int)(0.55D * localDisplayMetrics.heightPixels), paramInt);
  }

  public static CustomDialog createErrorDialog(Context paramContext, String paramString1, String paramString2, View.OnClickListener paramOnClickListener)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    CustomDialog localCustomDialog = new CustomDialog(paramContext, (int)(0.85D * localDisplayMetrics.widthPixels), (int)(0.25D * localDisplayMetrics.heightPixels), R.layout.xlink_dialog_view);
    TextView localTextView1 = (TextView)localCustomDialog.findViewById(R.id.dialog_title);
    TextView localTextView2 = (TextView)localCustomDialog.findViewById(R.id.dialog_msg);
    if (paramOnClickListener == null)
      localCustomDialog.findViewById(R.id.dialog_cancel).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          CustomDialog.this.dismiss();
        }
      });
    while (true)
    {
      localTextView1.setText(paramString1);
      localTextView2.setText(paramString2);
      return localCustomDialog;
      localCustomDialog.findViewById(R.id.dialog_cancel).setOnClickListener(paramOnClickListener);
    }
  }

  public static CustomDialog createMicroDialog(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return new CustomDialog(paramContext, (int)(0.85D * localDisplayMetrics.widthPixels), (int)(0.4D * localDisplayMetrics.heightPixels), paramInt);
  }

  public static ProgressDialog createProgressDialog(Context paramContext, String paramString1, String paramString2)
  {
    ProgressDialog localProgressDialog = ProgressDialog.show(paramContext, paramString1, paramString2, true, true);
    localProgressDialog.setCanceledOnTouchOutside(false);
    return localProgressDialog;
  }

  public static CustomDialog createStandardDialog(Context paramContext, int paramInt)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    return new CustomDialog(paramContext, (int)(0.85D * localDisplayMetrics.widthPixels), (int)(0.55D * localDisplayMetrics.heightPixels), paramInt);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.xlink.CustomDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */