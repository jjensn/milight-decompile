package com.irainxun.wifilight.util;

public class Utils
{
  public static final int D_0 = 0;
  public static final int D_N = -1;
  public static final int D_S = 1;

  public Utils()
  {
  }

  public static float getAngle(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = Math.abs(paramFloat3 - paramFloat1);
    float f2 = Math.abs(paramFloat4 - paramFloat2);
    float f3;
    if (f1 == 0.0F)
    {
      boolean bool1 = f2 < 0.0F;
      f3 = 0.0F;
      if (bool1);
    }
    do
    {
      boolean bool2;
      do
      {
        return f3;
        bool2 = paramFloat4 < paramFloat2;
        f3 = 0.0F;
      }
      while (bool2);
      return 180.0F;
      if (f2 == 0.0F)
      {
        if (paramFloat3 > paramFloat1)
          return 90.0F;
        return 270.0F;
      }
      f3 = (float)(180.0D * (Math.atan(f1 / f2) / 3.141592653589793D));
      if (paramFloat4 >= paramFloat2)
        break;
    }
    while (paramFloat3 > paramFloat1);
    return 360.0F - f3;
    if (paramFloat3 > paramFloat1)
      return 180.0F - f3;
    return f3 + 180.0F;
  }

  public static Area getArea(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((paramFloat3 == paramFloat1) && (paramFloat4 == paramFloat2))
      return Area.O;
    if ((paramFloat3 == paramFloat1) && (paramFloat4 > paramFloat2))
      return Area.Y;
    if ((paramFloat3 == paramFloat1) && (paramFloat4 < paramFloat2))
      return Area.Y_;
    if ((paramFloat4 == paramFloat2) && (paramFloat3 > paramFloat1))
      return Area.X;
    if ((paramFloat4 == paramFloat2) && (paramFloat3 < paramFloat1))
      return Area.X_;
    if ((paramFloat3 - paramFloat1 > 0.0F) && (paramFloat4 - paramFloat2 < 0.0F))
      return Area.Area1;
    if ((paramFloat3 - paramFloat1 > 0.0F) && (paramFloat4 - paramFloat2 > 0.0F))
      return Area.Area2;
    if ((paramFloat3 - paramFloat1 < 0.0F) && (paramFloat4 - paramFloat2 > 0.0F))
      return Area.Area3;
    if ((paramFloat3 - paramFloat1 < 0.0F) && (paramFloat4 - paramFloat2 < 0.0F))
      return Area.Area4;
    return Area.UNKNOWN;
  }

  public static int getDirection(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    if ((paramFloat3 == paramFloat5) || (paramFloat4 == paramFloat6))
      return 0;
    Area localArea1 = getArea(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    Area localArea2 = getArea(paramFloat1, paramFloat2, paramFloat5, paramFloat6);
    int i;
    if (localArea1 == Area.O)
      i = 0;
    while (true)
    {
      return i;
      if (localArea1 == Area.X)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = 0;
        }
        else if (localArea2 == Area.X_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y)
        {
          i = 1;
        }
        else if (localArea2 == Area.Y_)
        {
          i = -1;
        }
        else if (localArea2 == Area.Area1)
        {
          i = -1;
        }
        else if (localArea2 == Area.Area2)
        {
          i = 1;
        }
        else if (localArea2 == Area.Area3)
        {
          i = 0;
        }
        else
        {
          Area localArea11 = Area.Area4;
          i = 0;
          if (localArea2 == localArea11)
            i = 0;
        }
      }
      else if (localArea1 == Area.X_)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = 0;
        }
        else if (localArea2 == Area.X_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y)
        {
          i = -1;
        }
        else if (localArea2 == Area.Y_)
        {
          i = 1;
        }
        else if (localArea2 == Area.Area1)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area2)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area3)
        {
          i = -1;
        }
        else
        {
          Area localArea10 = Area.Area4;
          i = 0;
          if (localArea2 == localArea10)
            i = 1;
        }
      }
      else if (localArea1 == Area.Y)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = -1;
        }
        else if (localArea2 == Area.X_)
        {
          i = 1;
        }
        else if (localArea2 == Area.Y)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area1)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area2)
        {
          i = -1;
        }
        else if (localArea2 == Area.Area3)
        {
          i = 1;
        }
        else
        {
          Area localArea9 = Area.Area4;
          i = 0;
          if (localArea2 == localArea9)
            i = 0;
        }
      }
      else if (localArea1 == Area.Y_)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = 1;
        }
        else if (localArea2 == Area.X_)
        {
          i = -1;
        }
        else if (localArea2 == Area.Y)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area1)
        {
          i = 1;
        }
        else if (localArea2 == Area.Area2)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area3)
        {
          i = 0;
        }
        else
        {
          Area localArea8 = Area.Area4;
          i = 0;
          if (localArea2 == localArea8)
            i = -1;
        }
      }
      else if (localArea1 == Area.Area1)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = 1;
        }
        else if (localArea2 == Area.X_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y_)
        {
          i = -1;
        }
        else if (localArea2 == Area.Area1)
        {
          if (paramFloat5 > paramFloat3)
            i = 1;
          else
            i = -1;
        }
        else if (localArea2 == Area.Area2)
        {
          i = 1;
        }
        else if (localArea2 == Area.Area3)
        {
          i = 0;
        }
        else
        {
          Area localArea7 = Area.Area4;
          i = 0;
          if (localArea2 == localArea7)
            i = -1;
        }
      }
      else if (localArea1 == Area.Area2)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = -1;
        }
        else if (localArea2 == Area.X_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Y)
        {
          i = 1;
        }
        else if (localArea2 == Area.Y_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area1)
        {
          i = -1;
        }
        else if (localArea2 == Area.Area2)
        {
          if (paramFloat5 > paramFloat3)
            i = -1;
          else
            i = 1;
        }
        else if (localArea2 == Area.Area3)
        {
          i = 1;
        }
        else
        {
          Area localArea6 = Area.Area4;
          i = 0;
          if (localArea2 == localArea6)
            i = 0;
        }
      }
      else if (localArea1 == Area.Area3)
      {
        if (localArea2 == Area.O)
        {
          i = 0;
        }
        else if (localArea2 == Area.X)
        {
          i = 0;
        }
        else if (localArea2 == Area.X_)
        {
          i = 1;
        }
        else if (localArea2 == Area.Y)
        {
          i = -1;
        }
        else if (localArea2 == Area.Y_)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area1)
        {
          i = 0;
        }
        else if (localArea2 == Area.Area2)
        {
          i = -1;
        }
        else if (localArea2 == Area.Area3)
        {
          if (paramFloat5 > paramFloat3)
            i = -1;
          else
            i = 1;
        }
        else
        {
          Area localArea5 = Area.Area4;
          i = 0;
          if (localArea2 == localArea5)
            i = 1;
        }
      }
      else
      {
        Area localArea3 = Area.Area4;
        i = 0;
        if (localArea1 == localArea3)
          if (localArea2 == Area.O)
          {
            i = 0;
          }
          else if (localArea2 == Area.X)
          {
            i = 0;
          }
          else if (localArea2 == Area.X_)
          {
            i = -1;
          }
          else if (localArea2 == Area.Y)
          {
            i = 0;
          }
          else if (localArea2 == Area.Y_)
          {
            i = 1;
          }
          else if (localArea2 == Area.Area1)
          {
            i = 1;
          }
          else if (localArea2 == Area.Area2)
          {
            i = 0;
          }
          else if (localArea2 == Area.Area3)
          {
            i = -1;
          }
          else
          {
            Area localArea4 = Area.Area4;
            i = 0;
            if (localArea2 == localArea4)
              if (paramFloat5 > paramFloat3)
                i = 1;
              else
                i = -1;
          }
      }
    }
  }

  public static enum Area
  {
    static
    {
      O = new Area("O", 8);
      UNKNOWN = new Area("UNKNOWN", 9);
      Area[] arrayOfArea = new Area[10];
      arrayOfArea[0] = Area1;
      arrayOfArea[1] = Area2;
      arrayOfArea[2] = Area3;
      arrayOfArea[3] = Area4;
      arrayOfArea[4] = X;
      arrayOfArea[5] = X_;
      arrayOfArea[6] = Y;
      arrayOfArea[7] = Y_;
      arrayOfArea[8] = O;
      arrayOfArea[9] = UNKNOWN;
    }
  }
}

/* Location:
 * Qualified Name:     com.irainxun.wifilight.util.Utils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */