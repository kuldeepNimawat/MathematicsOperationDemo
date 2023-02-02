package com.mathematicsoperationdemo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mathematicsoperationdemo.R
import com.mathematicsoperationdemo.databinding.ActivityMainBinding
import com.mathematicsoperationdemo.model.ResultViewModel
import com.mathematicsoperationdemo.util.Constant
import com.mathematicsoperationdemo.util.showToast


class MathOperationActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val model = ViewModelProvider(this).get(ResultViewModel::class.java)
        binding.additionBtn.setOnClickListener {
             if(!Constant.checkValidation(binding.number1,binding.number2)){
                 this.showToast("Please Enter Valid Number")
             }else{
                 model.addition(binding.number1.text.toString().toInt(),binding.number2.text.toString().toInt())
                 moveResultActvity((model.result.value).toString())
             }
        }
        binding.substractionBtn.setOnClickListener {
            if(!Constant.checkValidation(binding.number1,binding.number2)){
                this.showToast(Constant.alertMsg)
            }else{
                model.substraction(binding.number1.text.toString().toInt(),binding.number2.text.toString().toInt())
                moveResultActvity((model.result.value).toString())
            }
        }
    }

    fun moveResultActvity(res : String){
        val intent = Intent(this@MathOperationActivity, ResultActivity::class.java)
        intent.putExtra("result", res)
        startActivity(intent)
    }
}