package com.irainxun.wifilight.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;

public class ClearableEditText extends EditText
{
  public String defaultValue = "";
  Drawable leftDrawable;
  final Drawable rightDrawable = getResources().getDrawable(R.drawable.clear_nor);

  public ClearableEditText(Context paramContext)
  {
    super(paramContext);
    init();
  }

  public ClearableEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public ClearableEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  void addClearButton()
  {
    setCompoundDrawables(this.leftDrawable, null, this.rightDrawable, null);
  }

  void init()
  {
    this.rightDrawable.setBounds(5, 0, 10 + this.rightDrawable.getIntrinsicWidth(), 5 + this.rightDrawable.getIntrinsicHeight());
    manageClearButton();
    setOnTouchListener(new View.OnTouchListener()
    {
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        ClearableEditText localClearableEditText = ClearableEditText.this;
        if (localClearableEditText.getCompoundDrawables() == null);
        while ((paramAnonymousMotionEvent.getAction() != 1) || (paramAnonymousMotionEvent.getX() <= localClearableEditText.getWidth() - localClearableEditText.getPaddingRight() - ClearableEditText.this.rightDrawable.getIntrinsicWidth()))
          return false;
        localClearableEditText.setText("");
        ClearableEditText.this.removeClearButton();
        return false;
      }
    });
    addTextChangedListener(new TextWatcher()
    {
      public void afterTextChanged(Editable paramAnonymousEditable)
      {
      }

      public void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        ClearableEditText.this.manageClearButton();
      }
    });
    setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        ClearableEditText.this.manageClearButton();
      }
    });
  }

  void manageClearButton()
  {
    if ((getText().toString().equals("")) || (!isFocused()))
    {
      removeClearButton();
      return;
    }
    addClearButton();
  }

  void removeClearButton()
  {
    setCompoundDrawables(this.leftDrawable, null, null, null);
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.ClearableEditText
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */