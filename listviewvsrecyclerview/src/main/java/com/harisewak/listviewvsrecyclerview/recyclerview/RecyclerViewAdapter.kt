package com.harisewak.listviewvsrecyclerview.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harisewak.listviewvsrecyclerview.R
import com.harisewak.listviewvsrecyclerview.other.ListItem
import com.harisewak.listviewvsrecyclerview.other.TestDataProvider

class RecyclerViewAdapter() : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerItemViewHolder>() {
    private val list = TestDataProvider.getListData()

    inner class RecyclerItemViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val uName: TextView = itemView.findViewById(R.id.name)
        val uDesignation: TextView = itemView.findViewById(R.id.designation)
        val uLocation: TextView = itemView.findViewById(R.id.location)

        fun bind(item: ListItem) {
            uName.text = "${item.id}. ${item.name}"
            uDesignation.text = item.designation
            uLocation.text = item.location
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerItemViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_list,
            parent,
            false
        )

        return RecyclerItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}