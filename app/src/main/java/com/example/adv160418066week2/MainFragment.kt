package com.example.adv160418066week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnStart.setOnClickListener {
            val player_name=txtNamePLayer.text.toString()
            val act=MainFragmentDirections.actionGameFragment(player_name)
            Navigation.findNavController(it).navigate(act)
        }
        btnOption.setOnClickListener {
            val act=MainFragmentDirections.actionOptionFragment()
            Navigation.findNavController(it).navigate(act)
        }
    }

}