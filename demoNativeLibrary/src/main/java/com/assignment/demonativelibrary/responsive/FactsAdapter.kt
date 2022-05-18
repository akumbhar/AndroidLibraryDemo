package com.assignment.demonativelibrary.responsive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assignment.demonativelibrary.R
import com.assignment.demonativelibrary.responsive.FactsAdapter.*

class FactsAdapter(val factList: List<Row>) : RecyclerView.Adapter<FactsViewHolder>() {



    inner class FactsViewHolder(val view:View): RecyclerView.ViewHolder(view){

        val txtTitle: TextView = view.findViewById<TextView>(R.id.txtFactTitle)
        val txtDescription: TextView = view.findViewById<TextView>(R.id.txtFactDescription)
        val imgFact: ImageView = view.findViewById<ImageView>(R.id.imgFact)

        fun setValues(fact:Row){

            with(fact){
                    txtTitle.text = title
                    txtDescription.text = description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= FactsViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
    )

    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) = holder.setValues(factList[position])

    override fun getItemCount()= factList.size
}