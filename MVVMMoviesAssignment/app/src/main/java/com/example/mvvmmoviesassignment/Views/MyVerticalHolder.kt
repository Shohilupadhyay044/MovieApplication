package com.example.mvvmmoviesassignment.Views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.saveo.modelhorizontal.ImageClasss
import kotlinx.android.synthetic.main.item_vertical.view.*

class MyVerticalHolder (private val view: View) : RecyclerView.ViewHolder(view) {

    fun setData(imageClasss: ImageClasss) {
        view.apply {
            Glide.with(imageIv2).load(imageClasss.original).into(imageIv2)
        }
    }
    }