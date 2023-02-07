package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class RecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        var img = findViewById<ImageView>(R.id.imageView)

        var img1: String? = intent.getStringExtra("img1")
        var rname: String? = intent.getStringExtra("rname")
        var rtype: String? = intent.getStringExtra("rtype")
        var ringrid: String? = intent.getStringExtra("ringrid")
        var rtime: String? = intent.getStringExtra("rtime")


        var rname1 = findViewById<TextView>(R.id.reipe_name)
        rname1.text = rname.toString()

        var rtype1 = findViewById<TextView>(R.id.reipe_type)
        rtype1.text = rtype.toString()

        var ringrid1 = findViewById<TextView>(R.id.reipe_ingrid)
        ringrid1.text = ringrid.toString()

        var rtime1 = findViewById<TextView>(R.id.reipe_time)
        rtime1.text = rtime.toString()


        val back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener {

            finish()
        }

        val courses: ArrayList<Model> = ArrayList()

        courses.add(Model(R.drawable.sweet,
            "Matcha","1 teaspoon"))

        courses.add(Model(R.drawable.burger1,
            "Rice Bowl","200 gr"))

        courses.add(Model(R.drawable.soup,
            "Salamon","400 gr"))

        courses.add(Model(R.drawable.sushi,
            "Soup","500 gr"))

        courses.add(Model(R.drawable.cook,
            "burger","one"))

        courses.add(Model(R.drawable.food0,
            "Water Melon","260 gr"))




        val courses2: ArrayList<Model> = ArrayList()

        courses2.add(Model(R.drawable.sushi,
            "Soup","500 gr"))

        courses2.add(Model(R.drawable.cook,
            "burger","one"))

        courses2.add(Model(R.drawable.food0,
            "Water Melon","260 gr"))

        courses2.add(Model(R.drawable.sweet,
            "Matcha","1 teaspoon"))

        courses2.add(Model(R.drawable.burger1,
            "Rice Bowl","200 gr"))

        courses2.add(Model(R.drawable.soup,
            "Salamon","400 gr"))



        val courses3: ArrayList<Model> = ArrayList()


        courses3.add(Model(R.drawable.food0,
            "Water Melon","260 gr"))

        courses3.add(Model(R.drawable.sweet,
            "Matcha","1 teaspoon"))

        courses3.add(Model(R.drawable.burger1,
            "Rice Bowl","200 gr"))
        courses3.add(Model(R.drawable.sushi,
            "Soup","500 gr"))

        courses3.add(Model(R.drawable.cook,
            "burger","one"))

        courses3.add(Model(R.drawable.soup,
            "Salamon","400 gr"))




        val lv_courses = findViewById<GridView>(R.id.lv_course)

        var customerAdapter: CustoerAdapter = CustoerAdapter(this, courses)

        println("****** ---------------  ${img1.toString()}")

        if ( img1 == "1") {
            img.setImageResource(R.drawable.food1)
            customerAdapter= CustoerAdapter(this, courses)
            println("1 ---------------  ${img1.toString()} *** ${rname}*** ${rtype.toString()}*** ${ringrid.toString()}*** ${rtime.toString()}")
        } else if (img1=="2"){
            img.setImageResource(R.drawable.sushi)
            customerAdapter = CustoerAdapter(this, courses2)
            println("2 ---------------  ${img1.toString()} *** ${rname.toString()}*** ${rtype.toString()}*** ${ringrid.toString()}*** ${rtime.toString()}")
        }else {
            img.setImageResource(R.drawable.burger5)
            customerAdapter = CustoerAdapter(this, courses3)

            println("3 ---------------  ${img1.toString()} *** ${rname.toString()}*** ${rtype.toString()}*** ${ringrid.toString()}*** ${rtime.toString()}")
        }






//        val adapter: ArrayAdapter<String> =
//            ArrayAdapter(this, layout.simple_spinner_item, courses)

        lv_courses.adapter = customerAdapter

    }
}