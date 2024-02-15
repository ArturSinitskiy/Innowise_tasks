package com.hfad.task_3_factory_method

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.fragment.app.FragmentActivity
import com.hfad.task_3_factory_method.Factories.AirDeliveryFactory
import com.hfad.task_3_factory_method.Factories.AutoDeliveryFactory
import com.hfad.task_3_factory_method.Factories.DeliveryFactory
import com.hfad.task_3_factory_method.Factories.RailwayDeliveryFactory
import com.hfad.task_3_factory_method.Factories.WaterDeliveryFactory
import com.hfad.task_3_factory_method.databinding.FragmentCreateBinding


class CreateFragment private constructor() : Fragment() {

    private lateinit var binding: FragmentCreateBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCreateBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rgCountries.setOnCheckedChangeListener { radioGroup, id ->
            if (id == R.id.rbGermany) {
                binding.tvGermanyTypes.visibility = View.VISIBLE
                binding.rgGermanyCargoTypes.visibility = View.VISIBLE
            } else {
                binding.tvGermanyTypes.visibility = View.GONE
                binding.rgGermanyCargoTypes.visibility = View.GONE
            }

        }


        binding.btnCreate.setOnClickListener {
            val factory = createDeliveryFactoryByCountry()
            val delivery = factory.createDelivery()
            val transport = delivery.provideTransport()
            val cargoOrder = transport.deliverCargo()
            if (!binding.etCargoName.text.toString().isEmpty()) {
                cargoOrder.setName(binding.etCargoName.text.toString())
            }
            if (!binding.etCargoName.text.toString().isEmpty()) {
                cargoOrder.setDescription(binding.etDescription.text.toString())
            }

            cargoOrder.setDestination(view.findViewById<RadioButton>(binding.rgCountries.checkedRadioButtonId).text.toString())
            
            val fragment = ExistingOrdersFragment.getInstance()
            fragment.addNewOrder(cargoOrder)
        }
    }

    private fun createDeliveryFactoryByCountry(): DeliveryFactory {
        val radioGroup = binding.rgCountries
        when (radioGroup.checkedRadioButtonId) {
            R.id.rbBelarus -> return AutoDeliveryFactory()
            R.id.rbRussia -> return RailwayDeliveryFactory()
            R.id.rbUSA -> return WaterDeliveryFactory()
            else -> {
                return AirDeliveryFactory()
            }
        }
    }

    companion object {
        fun getInstance() = CreateFragment()
        fun getInstance(arguments: Bundle): CreateFragment {
            val createFragment = CreateFragment()
            createFragment.arguments = arguments
            return createFragment
        }
    }
}