package com.example.task2.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.task2.model.Items
import com.example.task2.model.ItemsSecond

class MainViewModel: ViewModel()  {

     val listSecond : MutableLiveData<List<ItemsSecond>> = MutableLiveData()

     val list : MutableLiveData<List<Items>> = MutableLiveData()

}