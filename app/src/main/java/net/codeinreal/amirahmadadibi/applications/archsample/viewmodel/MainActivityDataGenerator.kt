package net.codeinreal.amirahmadadibi.applications.archsample.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainActivityDataGenerator: ViewModel() {
    private lateinit var myRandomeNumber: MutableLiveData<String>;

    fun getNumber():MutableLiveData<String>{
        if(!::myRandomeNumber.isInitialized){
            myRandomeNumber = MutableLiveData()
            this.createNumber();
        }
        return myRandomeNumber;
    }

    fun createNumber() {
        Log.i(TAG,"create randome number")
        val random = Random();
        myRandomeNumber.value = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    companion object {
        private val TAG  = MainActivityDataGenerator::class.java.simpleName;
    }

}