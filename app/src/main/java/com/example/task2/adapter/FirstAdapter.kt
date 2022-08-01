package com.example.task2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.task2.databinding.ItemTaskBinding
import com.example.task2.model.Items

class FirstAdapter(private val list: List<Items>) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>(){

    inner class FirstViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root){

            fun bind(items: Items){
                binding.apply {
                    tvWord.text = items.item
                    checkBoxCompleted.isChecked = items.isChecked
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent,
        false))
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
       return list.size
    }
     class DiffCallbacks : DiffUtil.ItemCallback<Items>(){
         override fun areItemsTheSame(oldItem: Items, newItem: Items): Boolean {
             TODO("Not yet implemented")
         }

         override fun areContentsTheSame(oldItem: Items, newItem: Items): Boolean {
             TODO("Not yet implemented")
         }

     }
}