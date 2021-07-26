package com.example.mvvmmoviesassignment.Views

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmmoviesassignment.MovieDetailActivity
import com.example.saveo.model_saveo.ResponseSaveoItem
import kotlinx.android.synthetic.main.item_layout.view.*

class MovieViewHolder(val view: View, private var context: Context): RecyclerView.ViewHolder(view)
{
    fun setData(movieItem: ResponseSaveoItem) {
        view.apply {
            Glide.with(imageIv).load(movieItem.show?.image?.medium).into(imageIv)

            imageIv.setOnClickListener{
                val intent = Intent(context, MovieDetailActivity::class.java)
                intent.putExtra("name", movieItem.show?.name)
                intent.putExtra("type", movieItem.show?.type)
                intent.putExtra("summary", movieItem.show?.summary)
                intent.putExtra("url",movieItem.show?.url)
                intent.putExtra("premired",movieItem.show?.premiered)
                intent.putExtra("image", movieItem.show!!.image!!.original!!)
                context.startActivity(intent)

            }
        }

    }
}