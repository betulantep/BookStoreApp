package com.betulantep.bookstoreapp.presentation.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.betulantep.bookstoreapp.R
import com.betulantep.bookstoreapp.databinding.FragmentBooksBinding
import com.betulantep.bookstoreapp.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BooksFragment : Fragment(R.layout.fragment_books) {
    private val binding by viewBinding(FragmentBooksBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}