package com.example.fragmentdemo.data

import java.io.Serializable

data class Person(
    var fName: String,
    var lName: String,
    var age: Int
) : Serializable