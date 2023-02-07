package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.example.recipeapp.CatActivity as CatActivity1

// import com.example.quizlearneasyapp.databinding.ActivutyMainBinding


class CatActivity : AppCompatActivity() {

    private lateinit var binding : CatActivity1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)


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

        val lv_courses = findViewById<GridView>(R.id.lv_course)

        val customerAdapter: CustoerAdapter = CustoerAdapter(this, courses)

//        val adapter: ArrayAdapter<String> =
//            ArrayAdapter(this, layout.simple_spinner_item, courses)

        lv_courses.adapter = customerAdapter



    }
}