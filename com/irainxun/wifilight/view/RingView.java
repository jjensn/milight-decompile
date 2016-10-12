package com.irainxun.wifilight.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

public class RingView extends View
{
  public static final float ANGLE = 360.0F;
  private static final int MSG_DRAWARC = 100;
  private boolean animStart;
  private float beginAng = 90.0F;
  private Handler handler = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default:
      case 100:
      }
      do
        return;
      while (RingView.this.tmpAng >= 360.0F);
      RingView localRingView = RingView.this;
      localRingView.tmpAng += RingView.this.speed;
      RingView.this.invalidate();
    }
  };
  private RectF oval;
  private final Paint paint = new Paint();
  private int ringColor = -14539217;
  private int ringWidth;
  private int speed = 2;
  private float tmpAng = 0.0F;
  private int width;

  public RingView(Context paramContext)
  {
    this(paramContext, null);
  }

  public RingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.paint.setAntiAlias(true);
    this.paint.setStyle(Paint.Style.STROKE);
    this.paint.setColor(this.ringColor);
    this.paint.setStrokeWidth(this.ringWidth);
    this.oval = new RectF();
    this.oval.left = (this.ringWidth / 2.0F);
    this.oval.top = (this.ringWidth / 2.0F);
    this.oval.right = (this.width - this.oval.left);
    this.oval.bottom = (this.width - this.oval.top);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.animStart)
    {
      this.paint.setColor(0);
      paramCanvas.drawArc(this.oval, this.beginAng, this.tmpAng, false, this.paint);
      this.paint.setColor(this.ringColor);
      paramCanvas.drawArc(this.oval, this.beginAng + this.tmpAng, 360.0F - this.tmpAng, false, this.paint);
      if (this.tmpAng < 360.0F)
        this.handler.sendEmptyMessageDelayed(100, 10L);
    }
    while (true)
    {
      super.onDraw(paramCanvas);
      return;
      this.animStart = false;
      continue;
      float f = this.width / 2.0F;
      paramCanvas.drawCircle(f, f, f - this.ringWidth / 2.0F, this.paint);
    }
  }

  public void startRingAnim()
  {
    this.animStart = true;
    this.beginAng = 90.0F;
    this.tmpAng = 0.0F;
    this.tmpAng += this.speed;
    invalidate();
  }

  public void stopRingAnim()
  {
    this.animStart = false;
    invalidate();
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.view.RingView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */