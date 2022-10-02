package com.module.daggertrails

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.module.daggertrails.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoPrev.setOnClickListener {
            finishSelf()
        }
    }

    private fun finishSelf() {
        setResult(Activity.RESULT_OK, Intent().apply {
            putExtras(
                bundleOf("Value" to "Success on Activity Result")
            )
        })
        finish()
    }
}

