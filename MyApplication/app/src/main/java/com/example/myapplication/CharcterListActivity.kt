package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CharcterListActivity : AppCompatActivity() {
    var chars = emptyArray<Character>()


    var Maintv : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charcter_list)

        for(i in 0..45)
            chars+=Character(getString(R.string.Albedo_name+i), "Geo",
                parser.Findinfo(getString(R.string.sitesearcher+ R.string.Albedo_name+i),
                getString(R.string.elemskill),getString(R.string.elembrst)))


        val recyclerView: RecyclerView = findViewById(R.id.reclcview1)
        recyclerView.layoutManager = LinearLayoutManager(this)

        Maintv = findViewById(R.id.MainTVinChars)
        var key = "Element"
        var element =intent.getStringExtra(key)
        when(element){
            "Dendro" -> {Maintv?.text = getString(R.string.Nodendrochars)

            }
            "Hydro"->{

            }

        }
    }
}