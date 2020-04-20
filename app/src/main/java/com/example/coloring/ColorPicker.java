package com.example.coloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ColorPicker extends View implements ColorPicker111 {

public Paint p_color	= new Paint(Paint.ANTI_ALIAS_FLAG);
    private float cx;
    private float cy;
    private int size;
    private float rad_1;

    public ColorPicker(Context context) {
        this(context, null);
    }

    public ColorPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {

    }

    public ColorPicker(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    private int measure(int measureSpec) {
        int result = 0;
        int specMoge = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        if (specMoge == MeasureSpec.UNSPECIFIED) result = 200;
        else result = specSize;
        return result;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mWidth = measure(widthMeasureSpec);
        int mHeight = measure(heightMeasureSpec);
        size = Math.min(mWidth, mHeight);
        setMeasuredDimension(size, size);


    }

    private void calculateSizes() {
        cx = size * 0.5f;
        cy = cx;


    }

    @Override
    protected void onDraw(Canvas c) {
        super.onDraw(c);
        c.drawCircle(cx, cy, rad_1, p_color);
    }

    private void calculateSizes(float rad_1) {
        cx = size * 0.5f;
        cy = cx;
        rad_1 = size * 0.44f;

        p_color.setStrokeWidth(size * 0.08f);

    }

}










