package net.codeinreal.amirahmadadibi.applications.archsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import net.codeinreal.amirahmadadibi.applications.archsample.databinding.ActivityMainBinding
import net.codeinreal.amirahmadadibi.applications.archsample.model.Contact

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initialize binding object
        val binding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        //accessing layout elements
        binding.btnAction.text = "Send Email";
        binding.tvText.text = "Amirahmad Adibi";
        binding.tvEmail.text = "Email:amirahmadadibi@gmail.com"
        binding.tvText.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"test",Toast.LENGTH_SHORT).show();
        });
        //** bind data object with our views
        //initialize object with DataBinding
        binding.contact = Contact("Amirahmad Adibi","amirahmadadibi");
        binding.clickHandler = EventHandler(this);
    }
}
