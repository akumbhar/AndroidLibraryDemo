package com.assignment.demonativelibrary.responsive

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.assignment.demonativelibrary.R
import com.assignment.demonativelibrary.responsive.FactsAdapter.FactsViewHolder
import com.bumptech.glide.Glide

class FactsAdapter(private val factList: List<Row>) : RecyclerView.Adapter<FactsViewHolder>() {


    inner class FactsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        private val txtTitle: TextView = view.findViewById(R.id.newsTitle)
        private val txtDescription: TextView = view.findViewById(R.id.txtFactDescription)
        private val imgFact: ImageView = view.findViewById(R.id.imgFact)

        fun setValues(fact: Row) {
            with(fact) {
                txtDescription.text = description
                txtTitle.text = title
                Glide.with(imgFact)
                    .load(imageHref)
                    .into(imgFact)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= FactsViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
    )

    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) = holder.setValues(factList[position])

    override fun getItemCount()= factList.size
}