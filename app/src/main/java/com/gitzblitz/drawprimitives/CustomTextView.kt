package com.gitzblitz.drawprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class CustomTextView(context: Context?, attrs: AttributeSet?) : TextView(context, attrs) {


    lateinit var pen: Paint


    override fun draw(canvas: Canvas?) {

        pen = Paint(Paint.ANTI_ALIAS_FLAG)
        pen.color = Color.parseColor("blue")
        pen.textSize = 66f
        pen.textAlign = Paint.Align.CENTER
        pen.typeface = Typeface.SANS_SERIF
        canvas?.apply {
            drawText("Hello World", (measuredWidth / 2).toFloat(), (measuredHeight / 2).toFloat(), pen)
            save()
        }

        super.draw(canvas)
    }


}