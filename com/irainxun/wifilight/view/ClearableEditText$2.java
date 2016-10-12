package com.irainxun.wifilight.view;

import android.text.Editable;
import android.text.TextWatcher;

class ClearableEditText$2
  implements TextWatcher
{
  ClearableEditText$2(ClearableEditText paramClearableEditText)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.this$0.manageClearButton();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.ClearableEditText.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */