package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
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
    lateinit var tv : TextView

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
        tv = findViewById(R.id.elListtextView)
        var key = "Element"
        var chars = emptyArray<Character>()
        var text1= ""
        intent = Intent(this, CharcterListActivity::class.java)
        var asyncdone = false
          GlobalScope.launch {
              text1 = parser.createListHttp()
              chars = parser.createlist(text1)
              asyncdone = true
          }

        Geoobut?.setOnClickListener {   intent.putExtra(key,"Geo")

            while(true){
                if(asyncdone){
                    break
                }
                tv.text = "Loading from internet"
            }

            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent) }

        Anemobut?.setOnClickListener {   intent.putExtra(key,"Anemo")

            while(true){
                if(asyncdone){
                    break
                }
                tv.text = "Loading from internet"
            }

            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent) }

        Electrobut?.setOnClickListener {   intent.putExtra(key,"Electro")

            while(true){
                if(asyncdone){
                    break
                }
                tv.text = "Loading from internet"
            }

            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent) }

        Cryobut?.setOnClickListener {   intent.putExtra(key,"Cryo")

            while(true){
                if(asyncdone){
                    break
                }
                tv.text = "Loading from internet"
            }

            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent) }

        Dendrobut?.setOnClickListener{

            intent.putExtra(key,"Dendro")

            while(true){
                if(asyncdone){
                    break
                }
                tv.text = "Loading from internet"
            }

            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent)
        }

        Pyrobut?.setOnClickListener{
            intent.putExtra(key,"Pyro")

            while(true){
                if(asyncdone){
                    break
                }
                tv.text = "Loading from internet"
            }

            var Earr = emptyArray<String>()
            var Carr = emptyArray<String>()
            for(e in chars){
                Earr += e.element
                Carr += e.name
            }
            intent.putExtra("Charelemets",Earr)
            intent.putExtra("Charnames", Carr)

            startActivity(intent)
        }

        Hydrobut?.setOnClickListener {
            intent.putExtra(key,"Hydro")

while(true){
    if(asyncdone){
        break
    }
    tv.text = "Loading from internet"
}

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