package com.recyclerview

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
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
        val negara = items[position]
       holder.name.text = negara.name
        negara.image?.let { holder.image.setImageResource(it) }
        holder.container.setOnClickListener(View.OnClickListener {
            val url = negara.wiki
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            context.startActivity(i)
        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.name)
        val image = view.findViewById<ImageView>(R.id.image)
        val container = view.findViewById<CardView>(R.id.cvContainer)
    }
}