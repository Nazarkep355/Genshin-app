package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CharelemActivity : AppCompatActivity() {
    var Pyrobut : ImageButton? = null
    var Hydrobut : ImageButton? = null
    var Electrobut : ImageButton? = null
    var Cryobut : ImageButton? = null
    var Anemobut : ImageButton? = null
    var Dendrobut : ImageButton?= null
    var Geoobut : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charelem)
        Pyrobut = findViewById(R.id.PyroButton)
        Hydrobut = findViewById(R.id.HydroButton)
        Electrobut = findViewById(R.id.ElectroButton)
        Cryobut = findViewById(R.id.CryoButton)
        Anemobut = findViewById(R.id.AnemoButton)
        Dendrobut = findViewById(R.id.DendroButton)
        Geoobut = findViewById(R.id.GeoButton)
        var key = "Element"



        Dendrobut?.setOnClickListener{
           intent = Intent(this, CharcterListActivity::class.java)
            intent.putExtra(key,"Dendro")
            startActivity(intent)
        }


    }


}