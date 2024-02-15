package com.hfad.task_3_factory_method

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.fragment.app.Fragment
import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val existingOrdersFragment = ExistingOrdersFragment.getInstance()

        openFragment(existingOrdersFragment)
        openFragment(CreateFragment.getInstance())
        binding.bnvMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.miCreate -> openFragment(CreateFragment.getInstance())
                R.id.miViewingExisting -> openFragment(existingOrdersFragment)
            }
            true
        }

    }

    private fun openFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.flFragmentsHolder, fragment).commit()
    }


}