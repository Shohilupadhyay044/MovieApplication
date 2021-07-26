package com.example.mvvmmoviesassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmmoviesassignment.Views.MovieAdapter
import com.example.saveo.model_saveo.ResponseSaveo
import com.example.saveo.model_saveo.ResponseSaveoItem
import com.example.saveo.modelhorizontal.HorizonalClass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
  private var movieList: List<ResponseSaveoItem> = listOf()
   private lateinit var movieAdapter: MovieAdapter
   private lateinit var showAdapter: ShowAdapter
   private var showlist : List<HorizonalClass> = listOf()
    private var viewModel = MyViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecyclerviewAdapter()
        setShowRecyclerview()
        setData()
    }
    private fun setData() {
    viewModel = ViewModelProviders.of(this).get(MyViewModel:: class.java)
        viewModel.getData().observe(this, Observer {
            var value = it
            movieAdapter.update(value)
            })
        viewModel.getShow().observe(this, Observer {
           showAdapter.updateData(it)
        })
        }
    private fun setRecyclerviewAdapter() {
        movieAdapter = MovieAdapter(movieList,this)
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = movieAdapter
    }

    private fun setShowRecyclerview() {
        showAdapter = ShowAdapter(showlist,this)
        val gridLayoutManager = GridLayoutManager(this,3)
        gridLayoutManager.orientation = GridLayoutManager.VERTICAL
        recycler_horizontal.layoutManager = gridLayoutManager
        recycler_horizontal.adapter = showAdapter
    }

}