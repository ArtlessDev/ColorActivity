package edu.temple.coloractivity

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ColorAdapter(_context: Context, _colors:Array<String>, _layout:ConstraintLayout) : BaseAdapter() {
    val context = _context
    val colors = _colors
    val view = _layout

    override fun getCount(): Int {
        return colors.size
    }

    override fun getItem(p0: Int): Any {
        return colors[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val textView : TextView

        if(p1 == null) {
            textView = TextView(context)
            textView.textSize = 24f
            textView.setPadding(10, 10, 0, 10)
        } else
            textView = p1 as TextView
        textView.text = colors[position]
        textView.setBackgroundColor(Color.parseColor("white"))
        view.setBackgroundColor(Color.parseColor(colors[position]))
        return textView

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = getView(position, convertView, parent)
        view.setBackgroundColor(Color.parseColor("white"))

        return view
    }


}