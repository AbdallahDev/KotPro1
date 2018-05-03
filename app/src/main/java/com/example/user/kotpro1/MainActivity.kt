package com.example.user.kotpro1

import android.app.Fragment
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun change(v:View)
    {
        if(v.id==R.id.rdo_red)
            screen.setBackgroundColor(Color.RED)
        if(v.id==R.id.rdo_green)
            screen.setBackgroundColor(Color.GREEN)
        if(v.id==R.id.rdo_blue)
            screen.setBackgroundColor(Color.BLUE)
    }


}
