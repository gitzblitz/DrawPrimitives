package com.gitzblitz.drawprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Drawing(context: Context?) : View(context) {

    private lateinit var brush: Paint

    override fun draw(canvas: Canvas?) {
        brush = Paint(Paint.ANTI_ALIAS_FLAG)
        brush.color = Color.parseColor("red")
        canvas?.drawCircle((measuredWidth/2).toFloat(), (measuredHeight/2).toFloat(), 69f, brush)

        canvas?.save()
        super.draw(canvas)
    }

}