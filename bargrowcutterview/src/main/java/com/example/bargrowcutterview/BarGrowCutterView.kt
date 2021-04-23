package com.example.bargrowcutterview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.graphics.RectF
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#004D40",
    "#0D47A1",
    "#BF360C",
    "#6200EA"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 2
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val sizeFactor : Float = 2.9f
