package com.betulantep.bookstoreapp.presentation.book_detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.betulantep.bookstoreapp.R
import com.betulantep.bookstoreapp.databinding.FragmentBookDetailBinding
import com.betulantep.bookstoreapp.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BookDetailFragment : Fragment(R.layout.fragment_book_detail) {
    private val binding by viewBinding(FragmentBookDetailBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}