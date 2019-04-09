package net.codeinreal.amirahmadadibi.applications.archsample

import android.app.Activity
import android.content.Intent
import android.nfc.Tag
import android.util.Log
import java.lang.NumberFormatException
import java.util.*
import kotlin.reflect.KClass

class MainActivityDataGenerator {
    private lateinit var myRandomeNumber: String;

    fun getNumber():String{
        if(!::myRandomeNumber.isInitialized){
            this.createNumber();
        }

        return myRandomeNumber;
    }

    fun createNumber() {
        Log.i(TAG,"create randome number")
        val random = Random();
        myRandomeNumber = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    companion object {
        private val TAG = MainActivityDataGenerator::class.java.simpleName;
    }

}