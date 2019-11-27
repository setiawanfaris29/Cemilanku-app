package com.example.cemilanku

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.*
import kotlinx.android.synthetic.main.list.view.*

class RecycleViewAdapter( val context: Context,private val list:ArrayList<DataCemilan>) : RecyclerView.Adapter<RecycleViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindItems(list[position])
    }

    inner class  Holder(val view: View):RecyclerView.ViewHolder(view){
        fun bindItems(list: DataCemilan){
            val textTitle = view.findViewById<TextView>(R.id.lbList)
            val textHarga = view.findViewById<TextView>(R.id.tvHarga)
            val cardView = view.findViewById<CardView>(R.id.cardList)

            textTitle.text = list.name
            cardView.setOnClickListener {
                context.startActivity(Intent(context, Deskripsi::class.java))
            }
        }
    }

}

