package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CharelemActivity : AppCompatActivity() {
    var Pyrobut : Button? = null
    var Hydrobut : Button? = null
    var Electrobut : Button? = null
    var Cryobut : Button? = null
    var Anemobut : Button? = null
    var Dendrobut : Button? = null
    var Geoobut : Button? = null

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



        Pyrobut?.setOnClickListener{

        }

        Dendrobut?.setOnClickListener{
           intent = Intent(this, CharcterListActivity::class.java)
            intent.putExtra(key, "Dendro")
        }


    }


}