package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CharcterListActivity : AppCompatActivity() {
    var Maintv : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_charcter_list)

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