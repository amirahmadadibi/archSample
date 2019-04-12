package net.codeinreal.amirahmadadibi.applications.archsample.helper

import android.content.Context
import android.widget.Toast
import kotlin.coroutines.coroutineContext

class EventHandler(context:Context) {
    val mContext  = context;
    //bind this function direcly to layout with databindg
    fun onButtonClick(username:String){
        Toast.makeText(mContext,"username is: $username",Toast.LENGTH_SHORT).show();
    }
}