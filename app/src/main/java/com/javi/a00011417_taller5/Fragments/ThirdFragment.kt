package com.javi.a00011417_taller5.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.javi.a00011417_taller5.R
import kotlinx.android.synthetic.main.third_fragment.*

class ThirdFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.third_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        go_home.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action2)
        }

        go_fourth.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.next_action)
        }
    }
}