package com.module.daggertrails

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.module.daggertrails.courses.Course
import com.module.daggertrails.courses.Student
import com.module.daggertrails.dagger.DaggerCourseComponent
import com.module.daggertrails.dagger.SyllabusModule
import com.module.daggertrails.dagger.UniversityModule
import com.module.daggertrails.databinding.ActivityFirstBinding
import javax.inject.Inject

class FirstActivity : AppCompatActivity() {

    lateinit var binding: ActivityFirstBinding

    private val secondActivityLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if(it.resultCode== Activity.RESULT_OK){
                val dataStr = it.data?.getStringExtra("Value") ?:"NO Value"
                println(dataStr)
            }
    }

    private val launchCamera = registerForActivityResult(ActivityResultContracts.GetContent()) {
//        binding.ivLogo.setImageBitmap(it)
        binding.ivLogo.setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoNext.setOnClickListener {
            //moveToSecondActivity()
            takePicture()
        }
    }

    private fun takePicture() {
        launchCamera.launch(null)
        //launchCamera.launch("image/*")
    }

    private fun moveToSecondActivity() {
            secondActivityLauncher.launch(Intent(this,SecondActivity::class.java))
    }
}
