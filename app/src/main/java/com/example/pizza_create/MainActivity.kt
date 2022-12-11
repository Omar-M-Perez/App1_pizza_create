package com.example.pizza_create

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        pep_group.visibility = View.INVISIBLE
        mush_group.visibility = View.INVISIBLE
        tom_group.visibility = View.INVISIBLE
        moz_group.visibility = View.INVISIBLE
        olive_group.visibility = View.INVISIBLE
        oni_group.visibility = View.INVISIBLE

        olives.setOnClickListener {
            if (olive_group.visibility == View.INVISIBLE) olive_group.visibility = View.VISIBLE
            else olive_group.visibility = View.INVISIBLE
        }

        mushroom.setOnClickListener {
            if (mush_group.visibility == View.INVISIBLE) mush_group.visibility = View.VISIBLE
            else mush_group.visibility = View.INVISIBLE
        }

        tomatoes.setOnClickListener {
            if (tom_group.visibility == View.INVISIBLE) tom_group.visibility = View.VISIBLE
            else tom_group.visibility = View.INVISIBLE
        }

        mozzarella.setOnClickListener {
            if (moz_group.visibility == View.INVISIBLE) moz_group.visibility = View.VISIBLE
            else moz_group.visibility = View.INVISIBLE
        }

        onion.setOnClickListener {
            if (oni_group.visibility == View.INVISIBLE) oni_group.visibility = View.VISIBLE
            else oni_group.visibility = View.INVISIBLE
        }

        pepperoni.setOnClickListener {
            if (pep_group.visibility == View.INVISIBLE) pep_group.visibility = View.VISIBLE
            else pep_group.visibility = View.INVISIBLE
        }

        back.setOnClickListener {
            buttons_layout.visibility = View.VISIBLE
            finish.visibility = View.VISIBLE

            fin_text.visibility = View.INVISIBLE
            back.visibility = View.INVISIBLE
        }

        finish.setOnClickListener {
            buttons_layout.visibility = View.INVISIBLE
            finish.visibility = View.INVISIBLE

            fin_text.visibility = View.VISIBLE
            back.visibility = View.VISIBLE
        }
    }
}