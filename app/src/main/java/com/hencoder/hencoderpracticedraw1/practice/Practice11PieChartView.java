package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

  public Practice11PieChartView(Context context) {
    super(context);
  }

  public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP) @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        综合练习
    //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

    //红色 扇形
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();
    paint.setColor(Color.RED);
    canvas.drawArc(200, 50, 950, 750, -180, 120, true, paint);
    path.moveTo(350, 120);
    path.lineTo(320, 90);
    path.rLineTo(-180, 0);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawPath(path, paint);
    paint.setTextSize(35);
    canvas.drawText("Lollipop", 10, 90, paint);

    //蓝色
    paint.setColor(Color.BLUE);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawArc(220, 60, 950, 800, 70, 110, true, paint);
    path.moveTo(350, 720);
    path.lineTo(320, 750);
    path.rLineTo(-180, 0);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawPath(path, paint);
    paint.setTextSize(35);
    canvas.drawText("KitKat", 20, 780, paint);

    //绿色
    paint.setColor(Color.GREEN);
    paint.setStyle(Paint.Style.FILL);
    //canvas.drawArc(220, 65, 955, 800, 13, 55, true, paint);
    canvas.drawArc(220, 65, 955, 800, 15, 53, true, paint);
    path.moveTo(890, 650);
    path.lineTo(920, 680);
    path.rLineTo(160, 0);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawPath(path, paint);
    paint.setTextSize(35);
    canvas.drawText("Jelly Bean", 1100, 680, paint);

    //灰色
    paint.setColor(Color.GRAY);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawArc(250, 65, 955, 800, 9, 5, true, paint);
    path.moveTo(950, 500);
    path.lineTo(994, 500);
    path.lineTo(1020,520);
    path.rLineTo(60, 0);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawPath(path, paint);
    paint.setTextSize(35);
    canvas.drawText("Ice Cream Sandwich", 1100, 530, paint);


    //紫红色
    paint.setColor(Color.MAGENTA);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawArc(250, 65, 955, 800, 1, 7, true, paint);
    path.moveTo(955, 455);
    path.lineTo(994, 455);
    path.lineTo(1020,480);
    path.rLineTo(60, 0);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawPath(path, paint);
    paint.setTextSize(35);
    canvas.drawText("Gingerbread", 1100, 490, paint);


    //橘色
    paint.setColor(Color.YELLOW);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawArc(250, 65, 955, 800, -55, 53, true, paint);
    path.moveTo(930, 300);
    path.lineTo(980, 270);
    path.rLineTo(110, 0);
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(2);
    canvas.drawPath(path, paint);
    paint.setTextSize(35);
    canvas.drawText("Marshmallow", 1100, 270, paint);
  }
}
