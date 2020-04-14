package com.example.coloring;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ColorPicker extends View {

    private final Context context;

    public ColorPicker(Context context) {
        super(context);
        this.context = context;
    }

    private float				cx;
    private float				cy;
    private int					size;

    public ColorPicker(Context context) {
        this(context, null, context1);
        this.context = context;
    }

    public ColorPicker(Context context, AttributeSet attrs, Context context1) {
        this(context, attrs, 0);
    }

    public ColorPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mWidth = measure(widthMeasureSpec);
        int mHeight = measure(heightMeasureSpec);
        size = Math.min(mWidth, mHeight);
        setMeasuredDimension(size, size);

    }

    private int measure(int measureSpec) {
        int result = 0;
        int specMoge = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);
        if (specMoge == MeasureSpec.UNSPECIFIED) result = 200;
        else result = specSize;
        return result;
    }

    private void calculateSizes() {
        cx = size * 0.5f;
        cy = cx;

    }

    @Override
    protected void onDraw(Canvas c) {
        super.onDraw(c);
        c.drawColor(Color.BLUE);

    }
}
}
