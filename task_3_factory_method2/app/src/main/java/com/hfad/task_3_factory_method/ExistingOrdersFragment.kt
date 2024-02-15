package com.hfad.task_3_factory_method

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.databinding.FragmentExistingOrdersBinding


class ExistingOrdersFragment private constructor() : Fragment() {

    private lateinit var binding: FragmentExistingOrdersBinding
    private var orders = mutableListOf<Order>()
    private lateinit var adapter: OrdersRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExistingOrdersBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = OrdersRecyclerViewAdapter(orders)
        binding.rvOrders.adapter = adapter
        binding.rvOrders.layoutManager = LinearLayoutManager(FragmentActivity().baseContext)
    }

    fun addNewOrder(order: Order){
        orders.add(order)
        adapter.notifyDataSetChanged()
    }

    companion object{
        private var instance : ExistingOrdersFragment? = null

        fun getInstance(): ExistingOrdersFragment{
            if (instance == null){
                instance = ExistingOrdersFragment()
            }
            return instance!!
        }
    }



}