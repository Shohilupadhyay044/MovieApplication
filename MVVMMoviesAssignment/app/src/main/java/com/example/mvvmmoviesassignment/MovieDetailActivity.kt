package com.example.mvvmmoviesassignment

import android.icu.number.NumberFormatter.with
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.item_layout.view.*

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        var string = intent.getStringExtra("image")

       Glide.with(imageView3).load(string).into(imageView3)


        imageView3.setImageResource(intent.getIntExtra("image",0))
        Title.setText(intent.getStringExtra("name"))
       date_.setText(intent.getStringExtra("premired"))
        tv_synopsis.setText(intent.getStringExtra("summary"))

    }
}