package com.mathematicsoperationdemo.util

import android.R
import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.widget.EditText
import android.widget.Toast
import java.security.AccessController.getContext

class Constant {
    companion object {
        var alertMsg : String = ""
        fun checkValidation(num1 : EditText, num2: EditText) : Boolean{
            if(num1.text.toString().length ==0 || num2.text.toString().length ==0){
                if(num1.text.toString().length ==0){
                    alertMsg = "Please Enter Valid Number1"
                }else if(num2.text.toString().length ==0){
                    alertMsg = "Please Enter Valid Number2"
                }else{
                    alertMsg = "Please Enter Inputs"
                }
                return false
            }
            return true
        }
    }
}