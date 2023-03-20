package com.example.lesson7viewmodel

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson7viewmodel.databinding.ActivityMainBinding


//Создай 2 фрагмента и из первого фрагмента передай значение к второму с помщью sharedViewModel
class MainActivity : AppCompatActivity() {
  val viewModel:MainViewModel by viewModels()
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




       val btn=binding.btn


        viewModel.data.observe(this){data->

            binding.txt.text=data.toString()



        }








        btn.setOnClickListener {
          viewModel.setData(binding.editTxt.text.toString())

        }





    }


    override fun onStop() {
        super.onStop()

    viewModel.data.removeObserver {  }
    }


}