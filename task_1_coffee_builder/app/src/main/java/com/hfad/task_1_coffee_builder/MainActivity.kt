package com.hfad.task_1_coffee_builder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hfad.task_1_coffee_builder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreate.setOnClickListener {
            val coffeeDrink = Coffee.Builder()
                .addName(binding.etCoffeeName.text.toString())
                .makeDouble(binding.cbIsDouble.isChecked)
                .addMilk(if (binding.etMilk.text.toString().isEmpty()) 0 else binding.etMilk.text.toString().toInt())
                .addSugar(if (binding.etSugar.text.toString().isEmpty()) 0 else binding.etSugar.text.toString().toInt())
                .addCream(if (binding.etCream.text.toString().isEmpty()) 0 else binding.etCream.text.toString().toInt())
                .addCinnamon(if (binding.etCinnamon.text.toString().isEmpty()) 0 else binding.etCinnamon.text.toString().toInt())
                .addSyrup(if (binding.etSyrup.text.toString().isEmpty()) 0 else binding.etSyrup.text.toString().toInt())
                .build()

            if (coffeeDrink.isEmpty()){
                Toast.makeText(this, "Add some components!", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, ResultCoffeeActivity::class.java)
                intent.putExtra("result", coffeeDrink.getInfoAboutComponents())
                startActivity(intent)
            }
        }
    }
}