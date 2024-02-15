package com.hfad.task_3_factory_method

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.task_3_factory_method.Orders.Order
import com.hfad.task_3_factory_method.databinding.ExistingOrderItemBinding

class OrdersRecyclerViewAdapter(val orders: List<Order>)
    : RecyclerView.Adapter<OrdersRecyclerViewAdapter.OrderViewHolder>() {

    inner class OrderViewHolder(val binding: ExistingOrderItemBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val binding = ExistingOrderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OrderViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return orders.size
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.binding.apply {
            tvInfo.text = orders[position].getFullInfo()
        }
    }
}