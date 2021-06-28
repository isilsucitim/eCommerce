package com.jupiter.ecommerce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.jupiter.ecommerce.databinding.ActivityMainBinding
import com.jupiter.ecommerce.viewmodels.BottomNavigationViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.bottomNavigationViewModel = BottomNavigationViewModel(supportFragmentManager)
    }
}