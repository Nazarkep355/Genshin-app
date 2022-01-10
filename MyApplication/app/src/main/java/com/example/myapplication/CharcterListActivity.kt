package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CharcterListActivity : AppCompatActivity() {
    var Maintv : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Maintv = findViewById(R.id.MainTVinChars)
        setContentView(R.layout.activity_charcter_list)
        var key = "Element"
        var element =intent.getStringExtra(key)
        when(element){
            "Dendro" -> {Maintv.text = getString(R.string.Nodendrochars)

            }
        }
    }
}