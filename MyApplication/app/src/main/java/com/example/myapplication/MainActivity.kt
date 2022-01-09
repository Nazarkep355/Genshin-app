package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


var listview : ListView = findViewById(R.id.LV)
        val Categories = arrayOf(getString(R.string.Cat_charac), getString(R.string.Categories_weap), getString(R.string.Cat_artifacts))
        val Arad = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Categories)
    listview.adapter = Arad

        listview.setOnItemClickListener { parent, view, position, id ->

            val itemtext = parent.getItemAtPosition(position)
            when(itemtext){
                Categories[0] -> Toast.makeText(this,Categories[0],Toast.LENGTH_LONG).show()

                Categories[1] -> Toast.makeText(this,Categories[1],Toast.LENGTH_LONG).show()

                Categories[2] -> Toast.makeText(this,Categories[2],Toast.LENGTH_LONG).show()

            }
        }

    }

}