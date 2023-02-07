package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.my_drawer_layout)
        val navigationView=findViewById<NavigationView>(R.id.navView)
        val iv_menu = findViewById<ImageView>(R.id.iv_menu)

        val getstarted = findViewById<Button>(R.id.getstarted)

        getstarted.setOnClickListener {

            val intent: Intent = Intent(this, FindRecActivity::class.java)
            // finish()
            startActivity(intent)
        }


        iv_menu.setOnClickListener{
            drawerLayout.openDrawer(GravityCompat.START)

        }
        navigationView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> {
                    Log.e("MainActivity", "Profile")


                }
                R.id.save -> {
                    Log.e("MainActivity", "Msg")



                }

                R.id.cart -> {
                    Log.e("MainActivity", "Friends")



                }
                R.id.profile -> {
                    Log.e("MainActivity", "up_profile")


                }
            }
            true

        }


    }
}