package com.example.fragmentdemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.Communicator
import com.example.fragmentdemo.R
import com.example.fragmentdemo.data.Person
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

    lateinit var person: Person
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        person = arguments?.getSerializable("PERSON") as Person

        view.textResult.text = person.toString()

        communicator = activity as Communicator

        view.backBtn.setOnClickListener {
            communicator.backToFragmentOne()
        }

        return view
    }
}