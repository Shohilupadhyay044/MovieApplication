package com.example.mvvmmoviesassignment.Views

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmmoviesassignment.MovieDetailActivity
import com.example.saveo.modelhorizontal.HorizonalClass
import com.example.saveo.modelhorizontal.ImageClasss
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.item_vertical.view.*

class MyVerticalHolder (private val view: View,private var context: Context) : RecyclerView.ViewHolder(view) {

    fun setData(horizonalClass: HorizonalClass) {
        view.apply {
            Glide.with(imageIv2).load(horizonalClass.image?.original).into(imageIv2)

            imageIv2.setOnClickListener{
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("image",horizonalClass.image?.original!!)
                intent.putExtra("name", horizonalClass.name)
                intent.putExtra("type", horizonalClass.type)
                intent.putExtra("summary", horizonalClass.summary)
                intent.putExtra("url",horizonalClass.url)
                intent.putExtra("premired",horizonalClass.premiered)
                context.startActivity(intent)
            }
            }
        }
    }
