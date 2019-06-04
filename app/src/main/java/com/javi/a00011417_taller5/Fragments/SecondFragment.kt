package com.javi.a00011417_taller5.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.javi.a00011417_taller5.R
import kotlinx.android.synthetic.main.second_fragment.*
import java.util.*

class SecondFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        go_third.setOnClickListener {
            val random = Random()
            val nextAction =SecondFragmentDirections.nextAction()
            Navigation.findNavController(it).navigate(nextAction)
        }

    }

}