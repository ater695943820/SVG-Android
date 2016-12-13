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
public class ic_notifications_active extends SVGRenderer {

    public ic_notifications_active(Context context) {
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
        
        mPath.moveTo(7.58f, 4.08f);
        mPath.lineTo(6.15f, 2.65f);
        mPath.cubicTo(3.75f, 4.48f, 2.17f, 7.3f, 2.03f, 10.5f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(0.15f, -2.65f, 1.51f, -4.97f, 3.55f, -6.42f);
        mPath.close();
        mPath.moveTo(7.58f, 4.08f);
        mPath.rMoveTo(12.39f, 6.42f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(-0.15f, -3.2f, -1.73f, -6.02f, -4.12f, -7.85f);
        mPath.rLineTo(-1.42f, 1.43f);
        mPath.rCubicTo(2.02f, 1.45f, 3.39f, 3.77f, 3.54f, 6.42f);
        mPath.close();
        mPath.moveTo(19.970001f, 10.5f);
        mPath.moveTo(18.0f, 11.0f);
        mPath.rCubicTo(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        mPath.lineTo(13.5f, 4.0f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.rCubicTo(-0.8299999f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        mPath.rLineTo(0f, 0.68f);
        mPath.cubicTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(-2.0f, 2.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rLineTo(-2.0f, -2.0f);
        mPath.rLineTo(0f, -5.0f);
        mPath.close();
        mPath.moveTo(18.0f, 11.0f);
        mPath.rMoveTo(-6.0f, 11.0f);
        mPath.rCubicTo(0.14f, 0.0f, 0.27f, -0.01f, 0.4f, -0.04f);
        mPath.rCubicTo(0.65f, -0.14f, 1.18f, -0.58f, 1.44f, -1.18f);
        mPath.rCubicTo(0.1f, -0.24f, 0.15f, -0.5f, 0.15f, -0.78f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rCubicTo(0.01f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 22.0f);
        
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