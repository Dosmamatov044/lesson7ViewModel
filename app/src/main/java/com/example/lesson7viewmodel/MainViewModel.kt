package com.example.lesson7viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {


private val mutableLiveData=MutableLiveData<String>()
    val data: LiveData<String> = mutableLiveData



    fun newList():List<String>{

       val list= listOf<String>("maks","peter")

        return list
    }



fun setData(text:String){

    mutableLiveData.value=text








}



}