package com.mathematicsoperationdemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mathematicsoperationdemo.R
import com.mathematicsoperationdemo.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding : ActivityResultBinding

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)
        val intent = getIntent()
        val bundle = intent.extras
        if (bundle != null) {
            binding.resultTxt.text = "Result is : "+bundle.getString("result")
        }
    }
}