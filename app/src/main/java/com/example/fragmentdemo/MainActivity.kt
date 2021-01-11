package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentdemo.data.Person
import com.example.fragmentdemo.ui.FirstFragment
import com.example.fragmentdemo.ui.SecondFragment

class MainActivity : AppCompatActivity(), Communicator {

    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.myFragment, firstFragment).commit()
    }

    override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        secondFragment.arguments = bundle

        this.supportFragmentManager.beginTransaction().apply {
            replace(R.id.myFragment, secondFragment)
            addToBackStack(null)
            commit()
        }
    }

    override fun passDataCom2(person: Person) {
        val bundle = Bundle()
        bundle.putSerializable("PERSON", person)

        secondFragment.arguments = bundle

        this.supportFragmentManager.beginTransaction().apply {
            replace(R.id.myFragment, secondFragment)
            addToBackStack(null)
            commit()
        }
    }

    override fun backToFragmentOne() {

        this.supportFragmentManager.beginTransaction()
            .replace(R.id.myFragment, firstFragment)
            .addToBackStack(null)
            .commit()
    }
}