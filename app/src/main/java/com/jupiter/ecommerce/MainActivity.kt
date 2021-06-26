package com.jupiter.ecommerce

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jupiter.ecommerce.views.*

class MainActivity : AppCompatActivity() {
    private val profileFragment = ProfileFragment()
    private val cartFragment = CartFragment()
    private val homeFragment = HomeFragment()
    private val likeFragment = LikeFragment()
    private val searchFragment = SearchFragment()
    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(homeFragment)
        bottomNav = findViewById(R.id.bottom_nav)
        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_nav -> setFragment(homeFragment)
                R.id.search_nav -> setFragment(searchFragment)
                R.id.cart_nav -> setFragment(cartFragment)
                R.id.like_nav -> setFragment(likeFragment)
                R.id.profile_nav -> setFragment(profileFragment)
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.base_fragment, fragment)
        }.commit()

    }
}