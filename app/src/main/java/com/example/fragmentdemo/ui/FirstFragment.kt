package com.example.fragmentdemo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentdemo.Communicator
import com.example.fragmentdemo.R
import com.example.fragmentdemo.data.Person
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        communicator = activity as Communicator

        view.applyBtn.setOnClickListener {
            val fName = view.fNameInput.text.toString()
            val lName = view.lNameInput.text.toString()
            val age = view.AgeInput.text.toString().toInt()

            communicator.passDataCom2(Person(fName, lName, age))
        }

        return view
    }
}