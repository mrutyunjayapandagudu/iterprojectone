package com.example.iteradmin.iterprojectone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val avenger= arrayOf("iron man","thor","black widow","black panther","captain america","ant man"
        ,"rocket","groot")
        val list=findViewById<ListView>(R.id.list)
        val adp=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,avenger)
        list.adapter=adp
    }
}
