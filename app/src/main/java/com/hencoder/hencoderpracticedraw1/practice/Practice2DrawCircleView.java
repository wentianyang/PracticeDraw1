package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint;

    private int startX = 220, startY = 110;

    private int mRadius = 110;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs,
        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        //设置抗锯齿
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(startX, startY, mRadius, mPaint);

        //空心圆
        mPaint.setStyle(Style.STROKE);
        canvas.drawCircle(startX + 2 * mRadius + 50, startY, mRadius, mPaint);

        //蓝色实心圆
        mPaint.setStyle(Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(startX, startY + 2 * mRadius + 40, mRadius, mPaint);

        //线宽为20的空心圆
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Style.STROKE);
        mPaint.setStrokeWidth(dip2px(getContext(), 20));
        canvas.drawCircle(startX + 2 * mRadius + 50, startY + 2 * mRadius + 40, mRadius, mPaint);
    }

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
