package com.jupiter.ecommerce.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jupiter.ecommerce.R
import com.jupiter.ecommerce.databinding.FragmentProfileBinding
import com.jupiter.ecommerce.model.User

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private var user:User = User("Işılsu","https://i.pinimg.com/originals/7d/1a/3f/7d1a3f77eee9f34782c6f88e97a6c888.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile,container,false)
        binding.user = user
        return binding.root
    }
    companion object{
        @JvmStatic
        @BindingAdapter("profileImage")
       fun loadImage(view:ImageView,profileImage:String){
            Glide.with(view.context)
                .load(profileImage).apply(RequestOptions().circleCrop())
                .into(view)
       }
    }
}