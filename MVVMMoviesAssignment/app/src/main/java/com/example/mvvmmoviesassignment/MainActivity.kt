package com.example.mvvmmoviesassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmmoviesassignment.Views.MovieAdapter
import com.example.saveo.model_saveo.ResponseSaveo
import com.example.saveo.model_saveo.ResponseSaveoItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  private var movieList: List<ResponseSaveoItem> = listOf()
   private lateinit var movieAdapter: MovieAdapter
    private var viewModel = MyViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecyclerviewAdapter()
        setData()
    }
    private fun setData() {
    viewModel = ViewModelProviders.of(this).get(MyViewModel:: class.java)
        viewModel.getData().observe(this, Observer {
            var value = it
            movieAdapter.update(value)
            })
        }
    private fun setRecyclerviewAdapter() {
        movieAdapter = MovieAdapter(movieList)
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recycler.layoutManager = linearLayoutManager
        recycler.adapter = movieAdapter
    }

}