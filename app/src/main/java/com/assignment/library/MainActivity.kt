package com.assignment.library

import android.animation.Animator
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.assignment.library.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isFABOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.fab.setOnClickListener { view ->

            if(!isFABOpen){
                showFABMenu();
            }else{
                closeFABMenu();
            }
            isFABOpen = !isFABOpen
        }
    }


    private fun showFABMenu() {
        binding.fabLayout1.visibility = View.VISIBLE
        binding.fabLayout2.visibility = View.VISIBLE
        binding.fabBGLayout.visibility = View.VISIBLE
        binding.fab.animate().rotationBy(180F)
        binding.fabLayout1.animate().translationY(-resources.getDimension(R.dimen.standard_75))
        binding.fabLayout2.animate().translationY(-resources.getDimension(R.dimen.standard_120))
    }

    private fun closeFABMenu() {
        binding.fabBGLayout.visibility = View.GONE
        binding.fab.animate().rotation(0F)
        binding.fabLayout1.animate().translationY(0f)
        binding.fabLayout2.animate().translationY(0f)
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animator: Animator) {}
                override fun onAnimationEnd(animator: Animator) {
                    if (View.GONE == binding.fabBGLayout.visibility) {
                        binding.fabLayout1.visibility = View.GONE
                        binding.fabLayout2.visibility = View.GONE
                    }
                }

                override fun onAnimationCancel(animator: Animator) {}
                override fun onAnimationRepeat(animator: Animator) {}
            })

    }
}