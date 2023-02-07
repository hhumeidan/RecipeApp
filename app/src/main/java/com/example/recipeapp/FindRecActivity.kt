package com.example.recipeapp

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

import kotlin.properties.Delegates


class FindRecActivity : AppCompatActivity() {

    private var img1 by Delegates.notNull<Int>()

    private var reipe_name: String = ""
    private var reipe_type: String = ""
    private var reipe_ingrid: String = ""
    private var reipe_time: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_rec)






        var img = findViewById<ImageView>(R.id.imageView)
        img.setImageResource(R.drawable.food1)
        img1 = 1

        var rname = findViewById<TextView>(R.id.reipe_name)
        rname.text = "Slamon"
        // reipe_name.setText(rname.text.toString())
        reipe_name = rname.text.toString()

        var rtype = findViewById<TextView>(R.id.reipe_type)
        rtype.text = "Matcha"
        reipe_type = rtype.text.toString()


        var ringrid = findViewById<TextView>(R.id.reipe_ingrid)
        ringrid.text = "12"
        reipe_ingrid = rtype.text.toString()

        var rtime = findViewById<TextView>(R.id.reipe_time)
        rtime.text = "40"
        reipe_time = rtype.text.toString()

        val btn1 = findViewById<Button>(R.id.imageButton1)
        val btn2 = findViewById<Button>(R.id.imageButton2)
        val btn3 = findViewById<Button>(R.id.imageButton3)

        btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.holo_green_light))

        btn1.setOnClickListener {

            btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.holo_green_light))
            btn2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            btn3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))

            val img3: Drawable = btn1.context.resources.getDrawable(R.drawable.baseline_home_24)
            btn1.setCompoundDrawablesWithIntrinsicBounds(img3, null, null, null)
            btn2.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            btn3.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

            img.setImageResource(R.drawable.food1)
            img1 = 1
            var rname = findViewById<TextView>(R.id.reipe_name)
            rname.text = "Slamon"
            // reipe_name.setText(rname.text.toString())
            reipe_name = rname.text.toString()

            var rtype = findViewById<TextView>(R.id.reipe_type)
            rtype.text = "Matcha"
            reipe_type = rtype.text.toString()


            var ringrid = findViewById<TextView>(R.id.reipe_ingrid)
            ringrid.text = "12"
            reipe_ingrid = ringrid.text.toString()

            var rtime = findViewById<TextView>(R.id.reipe_time)
            rtime.text = "40"
            reipe_time = rtime.text.toString()
            println("========  ${img1} -- ${reipe_name} -- ${reipe_type}-- ${reipe_ingrid} --${reipe_time}   ")

        }

        btn2.setOnClickListener {

            btn2.setBackgroundColor(ContextCompat.getColor(this, R.color.holo_green_light))
            btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            btn3.setBackgroundColor(ContextCompat.getColor(this, R.color.white))

            val img3: Drawable = btn1.context.resources.getDrawable(R.drawable.baseline_home_24)
            btn2.setCompoundDrawablesWithIntrinsicBounds(img3, null, null, null)
            btn1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            btn3.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

            img.setImageResource(R.drawable.sushi)

            img1 = 2
            var rname = findViewById<TextView>(R.id.reipe_name)
            rname.text = "Sushi"
            // reipe_name.setText(rname.text.toString())
            reipe_name = rname.text.toString()

            var rtype = findViewById<TextView>(R.id.reipe_type)
            rtype.text = "Taco"
            reipe_type = rtype.text.toString()


            var ringrid = findViewById<TextView>(R.id.reipe_ingrid)
            ringrid.text = "18"
            reipe_ingrid = ringrid.text.toString()

            var rtime = findViewById<TextView>(R.id.reipe_time)
            rtime.text = "30"
            reipe_time = rtime.text.toString()
            println("========  ${img1} -- ${reipe_name} -- ${reipe_type}-- ${reipe_ingrid} --${reipe_time}   ")
        }

        btn3.setOnClickListener {

            // val colorValue = ContextCompat.getColor(this, R.color.holo_green_light)
            btn3.setBackgroundColor(ContextCompat.getColor(this, R.color.holo_green_light))
            btn1.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            btn2.setBackgroundColor(ContextCompat.getColor(this, R.color.white))

            val img3: Drawable = btn1.context.resources.getDrawable(R.drawable.baseline_home_24)
            btn3.setCompoundDrawablesWithIntrinsicBounds(img3, null, null, null)
            btn1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
            btn2.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)

            img1 = 3
            img.setImageResource(R.drawable.burger5)
            rname.text = "Burger"
            // reipe_name.setText(rname.text.toString())
            reipe_name = rname.text.toString()

            var rtype = findViewById<TextView>(R.id.reipe_type)
            rtype.text = "Beef"
            reipe_type = rtype.text.toString()


            var ringrid = findViewById<TextView>(R.id.reipe_ingrid)
            ringrid.text = "16"
            reipe_ingrid = ringrid.text.toString()

            var rtime = findViewById<TextView>(R.id.reipe_time)
            rtime.text = "20"
            reipe_time = rtime.text.toString()
            println("========  ${img1} -- ${reipe_name} -- ${reipe_type}-- ${reipe_ingrid} --${reipe_time}   ")
        }

        img.setOnClickListener {

            val intent: Intent = Intent(this, RecipeActivity::class.java)

            intent.putExtra("img1", img1.toString())
            intent.putExtra("rname", reipe_name.toString())
            intent.putExtra("rtype", reipe_type.toString())
            intent.putExtra("ringrid", reipe_ingrid.toString())
            intent.putExtra("rtime", reipe_time.toString())
            // finish()
            startActivity(intent)
        }








    }
}