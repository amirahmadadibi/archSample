package net.codeinreal.amirahmadadibi.applications.archsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.view.*
import net.codeinreal.amirahmadadibi.applications.archsample.databinding.ActivityMainBinding
import net.codeinreal.amirahmadadibi.applications.archsample.model.Contact

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initialize binding object
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //accessing layout elements android changing them manually
        //binding.btnAction.text = "Send Email";
        //binding.tvText.text = "Amirahmad Adibi";
        //binding.tvEmail.text = "Email:amirahmadadibi@gmail.com"
        binding.tvUsername.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
        });
        //** bind data object with our views
        //initialize object with DataBinding
        binding.contact = Contact("Amirahmad Adibi","amirahmadadibi");
        binding.clickHandler = EventHandler(this);
        binding.imageUrl = "https://images.unsplash.com/photo-1544723795-3fb6469f5b39?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=935&q=80";
    }
}
