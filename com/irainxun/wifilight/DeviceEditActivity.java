package com.irainxun.wifilight;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.irainxun.wifilight.database.bdData;
import com.irainxun.wifilight.xlink.MyApp;
import com.irainxun.wifilight.xlink.bean.Device;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DeviceEditActivity extends Activity
{
  private static final int REQCODE_CUT_IMAGE = 3;
  private static final int REQCODE_SELECTPHOTO = 2;
  private static final int REQCODE_TAKEPHOTO = 1;
  private final String TAG = getClass().getSimpleName();
  private CheckBox VoiceSelect;
  private IconAdapter adapter;
  private View.OnClickListener clickListener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == DeviceEditActivity.this.ivBack)
        DeviceEditActivity.this.finish();
      String str1;
      do
      {
        do
        {
          return;
          if (paramAnonymousView == DeviceEditActivity.this.tvRight)
          {
            String str2 = DeviceEditActivity.this.etName.getText().toString().trim();
            if (TextUtils.isEmpty(str2))
            {
              Toast.makeText(DeviceEditActivity.this, R.string.tips_device_name_empty, 1).show();
              return;
            }
            DeviceEditActivity.this.light.name = str2;
            DeviceEditActivity.this.light.dispFlag = DeviceEditActivity.this.dispFlag;
            if (DeviceEditActivity.this.dispFlag == 0)
              if (!TextUtils.isEmpty(DeviceEditActivity.this.selectedImg))
              {
                DeviceEditActivity.this.light.iconPath = DeviceEditActivity.this.selectedImg;
                MyApp.deviceService.editcPhoto(DeviceEditActivity.this.light.getMacAddress(), DeviceEditActivity.this.selectedImg);
              }
            while (true)
            {
              MyApp.deviceService.editcDispFlag(DeviceEditActivity.this.light.getMacAddress(), DeviceEditActivity.this.dispFlag);
              MyApp.deviceService.editName(DeviceEditActivity.this.light.getMacAddress(), DeviceEditActivity.this.light.name);
              Log.d("debug", "aaa dispFlag = " + DeviceEditActivity.this.dispFlag);
              Log.d("debug", "aaa selectedImg = " + DeviceEditActivity.this.selectedImg);
              Log.d("debug", "aaa iconRes = " + DeviceEditActivity.this.iconRes);
              Intent localIntent2 = new Intent();
              localIntent2.putExtra("light", DeviceEditActivity.this.light);
              DeviceEditActivity.this.setResult(-1, localIntent2);
              DeviceEditActivity.this.finish();
              return;
              if (DeviceEditActivity.this.iconRes > 0)
              {
                DeviceEditActivity.this.light.iconRes = DeviceEditActivity.this.iconRes;
                MyApp.deviceService.editcIcon(DeviceEditActivity.this.light.getMacAddress(), DeviceEditActivity.this.iconRes);
              }
            }
          }
          if (paramAnonymousView == DeviceEditActivity.this.vPhoto)
          {
            new AlertDialog.Builder(DeviceEditActivity.this).setIcon(17301659).setItems(R.array.menu_photo, new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                if (paramAnonymous2Int == 0)
                {
                  Intent localIntent1 = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                  DeviceEditActivity.this.startActivityForResult(localIntent1, 2);
                  return;
                }
                if (paramAnonymous2Int == 1)
                {
                  String str = "wl_" + System.currentTimeMillis() + ".jpg";
                  File localFile = new File(Environment.getExternalStorageDirectory(), str);
                  DeviceEditActivity.this.selectedImg = localFile.getPath();
                  Intent localIntent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                  localIntent2.putExtra("output", Uri.fromFile(localFile));
                  DeviceEditActivity.this.startActivityForResult(localIntent2, 1);
                  return;
                }
                paramAnonymous2DialogInterface.dismiss();
              }
            }).create().show();
            return;
          }
          if (paramAnonymousView == DeviceEditActivity.this.vChangePwd)
          {
            Intent localIntent1 = new Intent(DeviceEditActivity.this, ChangePwdActivity.class);
            localIntent1.putExtra("light", DeviceEditActivity.this.light);
            DeviceEditActivity.this.startActivity(localIntent1);
            return;
          }
        }
        while (paramAnonymousView != DeviceEditActivity.this.VoiceSelect);
        str1 = MyApp.getMusic("music");
        if (str1 == null)
        {
          DeviceEditActivity.this.VoiceSelect.setChecked(false);
          MyApp.modifyMusic("0", "music");
          MyApp.MusicPlag = false;
          return;
        }
        if (Integer.parseInt(str1) == 0)
        {
          DeviceEditActivity.this.VoiceSelect.setChecked(true);
          MyApp.modifyMusic("1", "music");
          MyApp.MusicPlag = true;
          return;
        }
      }
      while (Integer.parseInt(str1) != 1);
      DeviceEditActivity.this.VoiceSelect.setChecked(false);
      MyApp.modifyMusic("0", "music");
      MyApp.MusicPlag = false;
    }
  };
  private int dispFlag = 0;
  private EditText etName;
  private Gallery gallery;
  private int iconRes = -1;
  private boolean isFirst = false;
  private AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener()
  {
    public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      Log.d("debug", "first dispFlag = " + DeviceEditActivity.this.dispFlag);
      if (!DeviceEditActivity.this.isFirst)
      {
        DeviceEditActivity.this.iconRes = DeviceEditActivity.this.adapter.getItem(paramAnonymousInt).intValue();
        DeviceEditActivity.this.dispFlag = 1;
        Log.d("debug", "icon seletc dispFlag = " + DeviceEditActivity.this.dispFlag);
        return;
      }
      DeviceEditActivity.this.isFirst = false;
    }

    public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
    {
    }
  };
  private ImageView ivBack;
  private Device light;
  private int lightIconSize;
  private String selectedImg;
  private TextView tvRight;
  private TextView tvTitle;
  private View vChangePwd;
  private View vPhoto;

  public DeviceEditActivity()
  {
  }

  private String copyImage(Bitmap paramBitmap, File paramFile)
    throws IOException
  {
    File localFile = new File(paramFile, this.selectedImg.substring(1 + this.selectedImg.lastIndexOf("/")));
    this.selectedImg = localFile.getPath();
    FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localFileOutputStream);
    localFileOutputStream.flush();
    localFileOutputStream.close();
    return localFile.getPath();
  }

  private void cropImage(Uri paramUri)
  {
    Intent localIntent = new Intent("com.android.camera.action.CROP");
    localIntent.setDataAndType(paramUri, "image/*");
    localIntent.putExtra("crop", "true");
    localIntent.putExtra("aspectX", 1);
    localIntent.putExtra("aspectY", 1);
    localIntent.putExtra("outputX", this.lightIconSize);
    localIntent.putExtra("outputY", this.lightIconSize);
    localIntent.putExtra("scale", true);
    localIntent.putExtra("return-data", true);
    localIntent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    localIntent.putExtra("circleCrop", false);
    startActivityForResult(localIntent, 3);
  }

  public String getRealFilePath(Context paramContext, Uri paramUri)
  {
    if (paramUri == null)
      return null;
    String str1 = paramUri.getScheme();
    String str2;
    if (str1 == null)
      str2 = paramUri.getPath();
    while (true)
    {
      return str2;
      if ("file".equals(str1))
      {
        str2 = paramUri.getPath();
      }
      else
      {
        boolean bool1 = "content".equals(str1);
        str2 = null;
        if (bool1)
        {
          Cursor localCursor = paramContext.getContentResolver().query(paramUri, new String[] { "_data" }, null, null, null);
          str2 = null;
          if (localCursor != null)
          {
            boolean bool2 = localCursor.moveToFirst();
            str2 = null;
            if (bool2)
              str2 = localCursor.getString(0);
            localCursor.close();
          }
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1)
    {
      if ((paramInt1 != 2) || (paramIntent == null))
        break label62;
      Uri localUri = paramIntent.getData();
      if (localUri == null)
        break label50;
      this.selectedImg = getRealFilePath(this, localUri);
      cropImage(localUri);
    }
    label50: label62: 
    do
    {
      return;
      Toast.makeText(this, R.string.img_load_fail, 1).show();
      return;
      if (paramInt1 == 1)
      {
        cropImage(Uri.fromFile(new File(this.selectedImg)));
        return;
      }
    }
    while ((paramInt1 != 3) || (paramIntent == null));
    this.dispFlag = 0;
    Log.d("debug", "photot dispFlag = " + this.dispFlag);
    try
    {
      copyImage((Bitmap)paramIntent.getParcelableExtra("data"), getCacheDir());
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(R.layout.activity_device_edit);
    if (paramBundle != null)
      this.selectedImg = paramBundle.getString("selectedImg");
    this.ivBack = ((ImageView)findViewById(R.id.iv_left));
    this.tvTitle = ((TextView)findViewById(R.id.tv_title));
    this.tvRight = ((TextView)findViewById(R.id.tv_right));
    this.etName = ((EditText)findViewById(R.id.et_name));
    this.vPhoto = findViewById(R.id.iv_photo);
    this.gallery = ((Gallery)findViewById(R.id.list));
    this.vChangePwd = findViewById(R.id.tv_change_pwd);
    this.VoiceSelect = ((CheckBox)findViewById(R.id.cb_voice_switcher));
    this.light = ((Device)getIntent().getSerializableExtra("light"));
    this.dispFlag = this.light.dispFlag;
    this.iconRes = this.light.iconRes;
    Log.d("debug", "create  dispFlag = " + this.dispFlag);
    Log.d("debug", "create  iconRes = " + this.iconRes);
    this.isFirst = true;
    this.lightIconSize = getResources().getDimensionPixelSize(R.dimen.light_ic_size);
    this.ivBack.setImageResource(R.drawable.back);
    this.tvTitle.setText(R.string.device_edit);
    this.tvRight.setText(R.string.complete);
    this.etName.setText(this.light.name);
    this.etName.setSelection(this.etName.length());
    this.adapter = new IconAdapter();
    this.gallery.setAdapter(this.adapter);
    this.gallery.setSelection(2);
    this.ivBack.setOnClickListener(this.clickListener);
    this.tvRight.setOnClickListener(this.clickListener);
    this.vPhoto.setOnClickListener(this.clickListener);
    this.vChangePwd.setOnClickListener(this.clickListener);
    this.VoiceSelect.setOnClickListener(this.clickListener);
    this.gallery.setOnItemSelectedListener(this.itemSelectedListener);
    String str = MyApp.getMusic("music");
    if (str == null)
      this.VoiceSelect.setChecked(true);
    do
    {
      return;
      if (Integer.parseInt(str) == 0)
      {
        this.VoiceSelect.setChecked(false);
        return;
      }
    }
    while (Integer.parseInt(str) != 1);
    this.VoiceSelect.setChecked(true);
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (!TextUtils.isEmpty(this.selectedImg))
      paramBundle.putString("selectedImg", this.selectedImg);
  }

  class IconAdapter extends BaseAdapter
  {
    private Integer[] iconRes;
    private LayoutInflater inflater;

    IconAdapter()
    {
      Integer[] arrayOfInteger = new Integer[6];
      arrayOfInteger[0] = Integer.valueOf(R.drawable.ic_light);
      arrayOfInteger[1] = Integer.valueOf(R.drawable.ic_canting);
      arrayOfInteger[2] = Integer.valueOf(R.drawable.ic_huiyishi);
      arrayOfInteger[3] = Integer.valueOf(R.drawable.ic_jia);
      arrayOfInteger[4] = Integer.valueOf(R.drawable.ic_kafei);
      arrayOfInteger[5] = Integer.valueOf(R.drawable.ic_shangdian);
      this.iconRes = arrayOfInteger;
      this.inflater = DeviceEditActivity.this.getLayoutInflater();
    }

    public int getCount()
    {
      return this.iconRes.length;
    }

    public Integer getItem(int paramInt)
    {
      return this.iconRes[paramInt];
    }

    public long getItemId(int paramInt)
    {
      return paramInt;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      ViewHolder localViewHolder;
      if (paramView == null)
      {
        paramView = this.inflater.inflate(R.layout.list_icon_item, null);
        localViewHolder = new ViewHolder(paramView);
        paramView.setTag(localViewHolder);
      }
      while (true)
      {
        int i = getItem(paramInt).intValue();
        localViewHolder.ivIcon.setImageResource(i);
        return paramView;
        localViewHolder = (ViewHolder)paramView.getTag();
      }
    }

    class ViewHolder
    {
      ImageView ivIcon;

      ViewHolder(View arg2)
      {
        Object localObject;
        this.ivIcon = ((ImageView)localObject.findViewById(R.id.iv_icon));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.DeviceEditActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */