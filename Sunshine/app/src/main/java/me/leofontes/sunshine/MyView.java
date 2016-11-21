package me.leofontes.sunshine;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by leo on 17/11/16.
 */

public class MyView extends View{

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int wMeasureSpec, int hMeasureSpec) {

    }

    @Override
    protected void onDraw(Canvas canvas) {

    }
}
