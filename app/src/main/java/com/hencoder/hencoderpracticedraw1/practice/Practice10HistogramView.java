package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

  private Paint mPaint = new Paint();
  private Path mPath = new Path();

  private float mWidth = 200;

  public Practice10HistogramView(Context context) {
    super(context);
  }

  public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        综合练习
    //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    mPaint.setAntiAlias(true);
    mPaint.setColor(Color.WHITE);
    mPaint.setStyle(Paint.Style.STROKE);
    mPaint.setStrokeWidth(4);

    mPath.moveTo(120, 50);
    mPath.rLineTo(0, 700);

    //mPaint.setStyle(Paint.Style.FILL);
    //mPaint.setColor(Color.GREEN);
    //mPath.addRect(140, 690, 200, 700, Path.Direction.CW);
    //
    //mPaint.setColor(Color.WHITE);
    //mPaint.setStyle(Paint.Style.STROKE);
    //mPaint.setStrokeWidth(4);
    mPath.rLineTo(1300, 0);
    canvas.drawPath(mPath, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(150, 740, 300, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("Froyo", 180, 780, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(330, 720, 480, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("GB", 360, 780, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(510, 720, 660, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("ICS", 540, 780, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(690, 500, 840, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("JB", 720, 780, mPaint);

    //mPaint.setStyle(Paint.Style.FILL);
    //mPaint.setColor(Color.GREEN);
    //canvas.drawRect(690, 400, 840, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("KitKat", 890, 780, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(870, 200, 1020, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("L", 1070, 780, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(1050, 100, 1200, 750, mPaint);

    mPaint.setColor(Color.WHITE);
    mPaint.setTextSize(35);
    canvas.drawText("M", 1250, 780, mPaint);

    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(Color.GREEN);
    canvas.drawRect(1230, 500, 1380, 750, mPaint);
  }
}
