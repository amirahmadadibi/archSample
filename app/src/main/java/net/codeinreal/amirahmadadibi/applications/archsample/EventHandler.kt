package net.codeinreal.amirahmadadibi.applications.archsample

import android.content.Context
import android.widget.Toast
import kotlin.coroutines.coroutineContext

class EventHandler(context:Context) {
    val mContext  = context;
    //bind this function direcly to layout with databindg
    fun onButtonClick(){
        Toast.makeText(mContext,"clicked",Toast.LENGTH_SHORT).show();
    }
}