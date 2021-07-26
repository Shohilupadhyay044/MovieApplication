package com.example.mvvmmoviesassignment.Views

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmmoviesassignment.R
import com.example.saveo.model_saveo.ResponseSaveoItem

class MovieAdapter(private var movielist: List<ResponseSaveoItem>, private var context : Context) : RecyclerView.Adapter<MovieViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MovieViewHolder(view,context)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        var movieResponse= movielist[position]
        holder.setData(movieResponse)

    }

    override fun getItemCount(): Int {
        return movielist.size
    }

    fun update(movielist: List<ResponseSaveoItem>) {
        this.movielist=movielist
        notifyDataSetChanged()
    }
}