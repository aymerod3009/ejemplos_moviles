package com.example.ejemplo_acciones

import android.content.Context
import android.content.SyncContext
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter (val items:ArrayList<String> ,val context:Context):RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.text=items.get(position)
    }
    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val item = view.item

    }

}