package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


var listview : ListView = findViewById(R.id.LV)
        val Categories = arrayOf(getString(R.string.Cat_charac), getString(R.string.Categories_weap), getString(R.string.Cat_artifacts))
        val Arad = ArrayAdapter<String>(this, R.layout.textview1file,R.id.fontmonospace, Categories)
    listview.adapter = Arad



        listview.setOnItemClickListener { parent, view, position, id ->

            val itemtext = parent.getItemAtPosition(position)
            when(itemtext){
                Categories[0] -> {
                    val intent :Intent = Intent(this,CharelemActivity::class.java)
                    startActivity(intent)
                }
                Categories[1] -> Toast.makeText(this,Categories[1],Toast.LENGTH_LONG).show()

                Categories[2] -> Toast.makeText(this,Categories[2],Toast.LENGTH_LONG).show()

            }
        }

    }

}