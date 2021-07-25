package com.example.mvvmmoviesassignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.mvvmmoviesassignment.Repositories.Repository
import com.example.saveo.model_saveo.ResponseSaveo
import kotlinx.coroutines.Dispatchers

class MyViewModel : ViewModel() {

    val repository = Repository()

    val data = MutableLiveData<String>()

    fun getData(): LiveData<ResponseSaveo> {


        return liveData(Dispatchers.IO) {

            val movieList = repository.getData()
            emit(movieList.data!!)
        }

    }

}