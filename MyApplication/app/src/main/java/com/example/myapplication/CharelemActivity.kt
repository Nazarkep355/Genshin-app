package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.parser.FindelEn
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.anko.doAsync

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
        var chars = emptyArray<Character>()
        var text1= ""
        intent = Intent(this, CharcterListActivity::class.java)
          GlobalScope.launch {
              text1 = parser.createListHttp()
              chars = parser.createlist(text1)
          }



        Dendrobut?.setOnClickListener{

            intent.putExtra(key,"Dendro")
            startActivity(intent)
        }
        Hydrobut?.setOnClickListener {
            intent.putExtra(key,"Hydro")


            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent)}


    }


}