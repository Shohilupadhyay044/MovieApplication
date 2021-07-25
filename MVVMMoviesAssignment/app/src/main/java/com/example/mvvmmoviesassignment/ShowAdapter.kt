package com.example.mvvmmoviesassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmmoviesassignment.Views.MyVerticalHolder
import com.example.saveo.modelhorizontal.HorizonalClass

class ShowAdapter( private var showList:List<HorizonalClass>): RecyclerView.Adapter<MyVerticalHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVerticalHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical, parent, false)
        return MyVerticalHolder(view)
    }

    override fun onBindViewHolder(holder: MyVerticalHolder, position: Int) {

        val showLists = showList[position].image
        holder.setData(showLists!!)

    }

    override fun getItemCount(): Int {
        return showList.size
    }

    fun updateData(showList: List<HorizonalClass>) {
        this.showList = showList
        notifyDataSetChanged()
    }
}