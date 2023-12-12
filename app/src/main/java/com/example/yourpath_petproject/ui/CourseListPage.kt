package com.example.yourpath_petproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yourpath_petproject.databinding.FragmentCoursesListPageBinding

class CoursesListPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCoursesListPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}