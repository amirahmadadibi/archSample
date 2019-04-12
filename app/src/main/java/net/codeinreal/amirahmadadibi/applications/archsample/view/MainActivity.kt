package net.codeinreal.amirahmadadibi.applications.archsample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import net.codeinreal.amirahmadadibi.applications.archsample.helper.EventHandler
import net.codeinreal.amirahmadadibi.applications.archsample.R
import net.codeinreal.amirahmadadibi.applications.archsample.databinding.ActivityMainBinding
import net.codeinreal.amirahmadadibi.applications.archsample.model.Contact
import net.codeinreal.amirahmadadibi.applications.archsample.viewmodel.MainActivityDataGenerator

class MainActivity : AppCompatActivity() {
    override fun onResume() {
        super.onResume()
        Log.i(TAG,"Owner onResume");
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initialize lifecycle
        lifecycle.addObserver(MainActivityObserver());
        Log.i(TAG,"Owner onCreate")
        //initialize binding object
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        );
        var data = MainActivityDataGenerator();
        //val randomeNumber = data.getNumber();
        //tv_randome_number.text =  randomeNumber;
        Log.i(TAG,"Randome Number Set")
        //****accessing layout elements android changing them manually
        //binding.btnAction.text = "Send Email";
        //binding.tvText.text = "Amirahmad Adibi";
        //binding.tvEmail.text = "Email: amirahmadadibi@gmail.com"
        binding.tvUsername.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
        });
        //bind data object with our views
        //initialize object with DataBinding
        binding.contact = Contact("Amirahmad Adibi","amirahmadadibi");
        binding.clickHandler = EventHandler(this);
        binding.imageUrl = "https://images.unsplash.com/photo-1544723795-3fb6469f5b39?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=935&q=80";
        //initialize view model for the view(MainActivity)
        val viewModel = ViewModelProviders.of(this).get(MainActivityDataGenerator::class.java);
        var myRandomeNumber = viewModel.getNumber();
        myRandomeNumber.observe(this, Observer<String> {number->
            tv_randome_number.text = number;
        })

        btn_generate_new_randome_number.setOnClickListener(View.OnClickListener {
            viewModel.createNumber()
        })
    }
    companion object {
        val TAG = MainActivity.javaClass.simpleName;
    }
}
