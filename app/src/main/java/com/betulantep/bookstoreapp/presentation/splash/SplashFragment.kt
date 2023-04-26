package com.betulantep.bookstoreapp.presentation.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.betulantep.bookstoreapp.R
import com.betulantep.bookstoreapp.databinding.FragmentBooksBinding
import com.betulantep.bookstoreapp.databinding.FragmentSplashBinding
import com.betulantep.bookstoreapp.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : Fragment(R.layout.fragment_splash) {
    private val binding by viewBinding(FragmentSplashBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}