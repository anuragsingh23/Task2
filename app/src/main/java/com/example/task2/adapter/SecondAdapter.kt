package com.example.task2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task2.databinding.ItemTaskBinding
import com.example.task2.model.ItemsSecond

class SecondAdapter(private val list: List<ItemsSecond>) : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){

    inner class SecondViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root){

            fun bind(items: ItemsSecond){
                binding.apply {
                    tvWord.text = items.item
                    checkBoxCompleted.isChecked = items.isChecked
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent,
        false))
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
       return list.size
    }
}