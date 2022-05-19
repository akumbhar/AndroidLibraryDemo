package com.assignment.demonativelibrary.responsive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.assignment.demonativelibrary.R

class ResponsiveViewActivity : AppCompatActivity() {

    private val listItems: RecyclerView by lazy {
        findViewById(R.id.listItems)
    }

    private lateinit var viewModel: ResponsiveViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsive_view)

        viewModel =
            ViewModelProvider(this, FactViewModelFactory()).get(ResponsiveViewModel::class.java)
        with(listItems) {
            adapter = FactsAdapter(viewModel.getTheFacts())
            layoutManager = GridLayoutManager(
                this@ResponsiveViewActivity,
                resources.getInteger(R.integer.column_count)
            )
        }
    }
}