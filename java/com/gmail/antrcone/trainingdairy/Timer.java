package com.gmail.antrcone.trainingdairy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class Timer extends View {

    private Paint paint;
    private MyHandler myHandler;
    private Thread thread;

    private boolean isStart = false;
    private int time = 15;
    private int degree = 0;

    public Timer(Context context) {
        super(context);
        init();
    }
    public Timer(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public Timer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
        paint = new Paint();
        myHandler = new MyHandler();
    }

    public void setTime(int time) {
        this.time = time;
        degree = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        float cx = canvas.getWidth() / 2;
        float cy = canvas.getHeight() / 2;
        float radius = Math.min(canvas.getWidth(), canvas.getHeight()) / 2;

        paint.setStrokeWidth(5);
        paint.setColor(Color.rgb(52, 54, 62));
        canvas.drawCircle(cx, cy, radius, paint);
        Path path = new Path();
        path.addCircle(cx, cy, radius, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setColor(Color.rgb(204, 255, 133));
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL); // заливаем
        paint.setAntiAlias(true);
        final RectF oval = new RectF();
        oval.set(cx - radius, cy - radius, cx + radius, cy + radius);
        canvas.save();
        canvas.rotate(270, cx, cy);
        canvas.drawArc(oval, 0, degree, true, paint); // рисуем пакмана
        canvas.restore();
//рисуем внутренний круг
        paint.setColor(Color.rgb(37, 37, 45));
        canvas.drawCircle(cx, cy, radius * 9 / 10, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(isStart == false) {
            isStart = true;
            thread = new Thread(flickRunnable);
            thread.start();
        }
        else{
            isStart = false;
            myHandler.removeMessages(0);
        }
        return super.onTouchEvent(event);
    }


    private Runnable flickRunnable = new Runnable() {
        @Override
        public void run() {
            while (isStart) {
                if (degree < 360) {
                    Message message = new Message();
//                message.what = 0;
//                message.obj = degree;
                    myHandler.sendMessage(message);
                    degree = degree + 18 / time;
                    try {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e) {
                    }
                } else {
                    isStart = false;
                    //отправляем броадкаст что таймер отработал
                    degree = 0;
                }
            }
        }
    };


    class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            invalidate();
        }
    }
}

