package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
//    var menu = ArrayList<String>(arrayListOf("Hamburger, Pizza, Mexican, American, Chinese"))

    val list: MutableList<String> = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

//    var menu2= arrayOf("Hamburger, Pizza, Mexican, American, Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    text.text=list[0]
//        btnAdd.setOnClickListener(){
//            list.add("${textbox.text}")
//        }
    }

    fun addMenu(view : View){
        list.add(textbox.text.toString())
        textbox.text=null
    }

    fun changeMenu(view: View) {
        var r=Math.random()*(list.size)
        text.text= list[r.toInt()]

    }

//



}
