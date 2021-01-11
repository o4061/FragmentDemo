package com.example.fragmentdemo

import com.example.fragmentdemo.data.Person

interface Communicator {
    fun passDataCom(editTextInput: String)
    fun passDataCom2(person: Person)
    fun backToFragmentOne()
}