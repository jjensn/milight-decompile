package com.irainxun.wifilight.apsetting.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.irainxun.wifilight.apsetting.utils.Utils;

public class SettingActivity extends PreferenceActivity
  implements Preference.OnPreferenceChangeListener
{
  private EditTextPreference mCMDScanModulesPreference;
  private EditTextPreference mPasswdPreference;
  private EditTextPreference mPortPreference;
  private EditTextPreference mSsidPreference;

  public SettingActivity()
  {
  }

  private Preference.OnPreferenceClickListener createPreferenceClickListener(final EditTextPreference paramEditTextPreference)
  {
    return new Preference.OnPreferenceClickListener()
    {
      public boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        final Dialog localDialog = paramEditTextPreference.getDialog();
        Button localButton = (Button)localDialog.findViewById(Utils.getAndroidInternalId("button1"));
        final EditText localEditText = (EditText)localDialog.findViewById(Utils.getAndroidInternalId("edit"));
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymous2View)
          {
            new AlertDialog.Builder(SettingActivity.this).setTitle("R.string.warning").setMessage("R.string.comfirm_modify").setPositiveButton("R.string.yes", new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
              {
                this.val$editTextPreference.setText(this.val$editText.getText().toString().trim());
                SettingActivity.this.displaySummary(this.val$editTextPreference);
                this.val$dialog.dismiss();
              }
            }).setNegativeButton("R.string.no", new DialogInterface.OnClickListener()
            {
              public void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
              {
                this.val$dialog.dismiss();
              }
            }).create().show();
          }
        });
        return false;
      }
    };
  }

  private void displaySummary(Preference paramPreference)
  {
    String str = paramPreference.getSharedPreferences().getString(paramPreference.getKey(), null);
    if ((str == null) || (str.trim().equals("")))
    {
      paramPreference.setSummary(getString(R.string.null_));
      return;
    }
    if (paramPreference == this.mPasswdPreference)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; ; i++)
      {
        if (i >= str.length())
        {
          paramPreference.setSummary(localStringBuffer.toString());
          return;
        }
        localStringBuffer.append("•");
      }
    }
    paramPreference.setSummary(str);
  }

  private void setupPreferences()
  {
    this.mCMDScanModulesPreference = ((EditTextPreference)findPreference("cmd_scan_modules"));
    this.mSsidPreference = ((EditTextPreference)findPreference("SSID"));
    this.mPasswdPreference = ((EditTextPreference)findPreference("PASSWORD"));
    this.mPortPreference = ((EditTextPreference)findPreference("udp_port"));
    this.mCMDScanModulesPreference.setOnPreferenceClickListener(createPreferenceClickListener(this.mCMDScanModulesPreference));
    this.mSsidPreference.setOnPreferenceClickListener(createPreferenceClickListener(this.mSsidPreference));
    this.mPasswdPreference.setOnPreferenceClickListener(createPreferenceClickListener(this.mPasswdPreference));
    this.mPortPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        final EditText localEditText = SettingActivity.this.mPortPreference.getEditText();
        localEditText.addTextChangedListener(new TextWatcher()
        {
          public void afterTextChanged(Editable paramAnonymous2Editable)
          {
          }

          public void beforeTextChanged(CharSequence paramAnonymous2CharSequence, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
          {
            try
            {
              int i = Integer.valueOf(localEditText.getText().toString()).intValue();
              if ((i >= 0) && (i <= 65535))
              {
                this.val$dialog.getButton(-1).setEnabled(true);
                return;
              }
              this.val$dialog.getButton(-1).setEnabled(false);
              return;
            }
            catch (Exception localException)
            {
              this.val$dialog.getButton(-1).setEnabled(false);
            }
          }

          public void onTextChanged(CharSequence paramAnonymous2CharSequence, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
          {
            try
            {
              int i = Integer.valueOf(localEditText.getText().toString()).intValue();
              if ((i >= 0) && (i <= 65535))
              {
                this.val$dialog.getButton(-1).setEnabled(true);
                return;
              }
              this.val$dialog.getButton(-1).setEnabled(false);
              return;
            }
            catch (Exception localException)
            {
              this.val$dialog.getButton(-1).setEnabled(false);
            }
          }
        });
        return false;
      }
    });
    this.mPortPreference.setOnPreferenceChangeListener(this);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    addPreferencesFromResource(R.xml.settings);
    setupPreferences();
  }

  public boolean onPreferenceChange(Preference paramPreference, Object paramObject)
  {
    if (paramPreference == this.mPortPreference)
      this.mPortPreference.setSummary(paramObject.toString());
    return true;
  }

  protected void onResume()
  {
    super.onResume();
    displaySummary(this.mCMDScanModulesPreference);
    displaySummary(this.mSsidPreference);
    displaySummary(this.mPasswdPreference);
    displaySummary(this.mPortPreference);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.apsetting.android.SettingActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */