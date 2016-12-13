package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_crop_rotate extends SVGRenderer {

    public ic_crop_rotate(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(7.47f, 21.49f);
        mPath.cubicTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13.0f);
        mPath.lineTo(0.0f, 13.0f);
        mPath.rCubicTo(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f);
        mPath.rCubicTo(0.23f, 0.0f, 0.44f, -0.02f, 0.66f, -0.03f);
        mPath.lineTo(8.8f, 20.15f);
        mPath.rLineTo(-1.33f, 1.34f);
        mPath.close();
        mPath.moveTo(7.47f, 21.49f);
        mPath.moveTo(12.05f, 0.0f);
        mPath.rCubicTo(-0.23f, 0.0f, -0.44f, 0.02f, -0.66f, 0.04f);
        mPath.rLineTo(3.81f, 3.81f);
        mPath.rLineTo(1.33f, -1.33f);
        mPath.cubicTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11.0f);
        mPath.lineTo(24.0f, 11.0f);
        mPath.rCubicTo(-0.51f, -6.16f, -5.66f, -11.0f, -11.95f, -11.0f);
        mPath.close();
        mPath.moveTo(12.05f, 0.0f);
        mPath.moveTo(16.0f, 14.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(18.0f, 8.0f);
        mPath.rCubicTo(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.rLineTo(-6.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.close();
        mPath.moveTo(16.0f, 14.0f);
        mPath.rMoveTo(-8.0f, 2.0f);
        mPath.lineTo(8.0f, 4.0f);
        mPath.lineTo(6.0f, 4.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(4.0f, 6.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 8.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(8.0f, 16.0f);
        mPath.close();
        mPath.moveTo(8.0f, 16.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}