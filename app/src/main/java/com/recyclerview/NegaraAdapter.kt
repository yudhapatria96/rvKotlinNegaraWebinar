package com.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NegaraAdapter (private val context: Context, private val items: List<NegaraModel>)
: RecyclerView.Adapter<NegaraAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NegaraAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_team_bola, parent, false))

    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: NegaraAdapter.ViewHolder, position: Int) {
        val namaNegara = items[position]
       holder.name.text = namaNegara.name
        namaNegara.image?.let { holder.image.setImageResource(it) }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        val image = view.findViewById<ImageView>(R.id.image)
    }
}