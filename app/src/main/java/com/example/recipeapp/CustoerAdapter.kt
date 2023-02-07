package com.example.recipeapp


import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.DecorContentParent
import androidx.core.content.ContextCompat.startActivity
import java.text.ParsePosition

class CustoerAdapter(private val context: Activity, private val courses: ArrayList<Model>, )
    : ArrayAdapter<String>(context, R.layout.adapter_cources) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View{

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.adapter_cources,  null,  true)


        val titleText = rowView.findViewById(R.id.tv_title) as TextView
        val weightText = rowView.findViewById(R.id.tv_weight) as TextView
        val imageView = rowView.findViewById(R.id.iv_image) as ImageView


        titleText.text = courses.get(position).tilte
        weightText.text = courses.get(position).weight
        imageView.setImageResource(courses.get(position).image)

        titleText.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
            context. finish()
        }




        return rowView

    }


    override fun getCount(): Int {
        return courses.size
    }

}

