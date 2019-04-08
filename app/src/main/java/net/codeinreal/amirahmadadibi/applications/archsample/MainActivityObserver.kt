package net.codeinreal.amirahmadadibi.applications.archsample

import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import javax.security.auth.login.LoginException
import kotlin.math.log

class MainActivityObserver:LifecycleObserver {
    //observe the lifecycle event using annotation
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    //user defined function
    fun onCreateEvent(){
        Log.i(TAG,"Observer On Create")
    }
    //for example i can add other lifecycle event to
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent(){
        Log.i(TAG,"Observer On Resume")
    }
    companion object{
        private val TAG:String = MainActivityObserver::class.java.simpleName;
    }

}