package com.example.mvvmmoviesassignment.Views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.saveo.model_saveo.ResponseSaveo
import com.example.saveo.model_saveo.ResponseSaveoItem
import kotlinx.android.synthetic.main.item_layout.view.*

class MovieViewHolder (val view: View): RecyclerView.ViewHolder(view)
{
    fun setData(movieItem: ResponseSaveoItem) {
        view.apply {
            Glide.with(imageIv).load(movieItem.show?.image?.medium).into(imageIv)
        }
    }
}