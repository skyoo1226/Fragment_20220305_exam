package com.skyoo.fragment_20220305_exam.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.skyoo.fragment_20220305_exam.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnToastInFragment.setOnClickListener {
            Toast.makeText(requireContext(), "토스트 띄우기", Toast.LENGTH_LONG)

        }
    }
}