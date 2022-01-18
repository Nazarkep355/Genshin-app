package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.parser.FindelEn
import com.example.myapplication.parser.FindelEnhttp
import java.util.*
import kotlinx.coroutines.*
import org.jetbrains.anko.doAsync


 class CharcterListActivity : AppCompatActivity() {
    var chars = emptyArray<Character>()

lateinit var lv :ListView

    var Maintv : TextView? = null
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charcter_list)

         val stnames =intent.getStringArrayExtra("Charnames")
         val stelements = intent.getStringArrayExtra("Charelemets")

//      var chars = emptyArray<Character>()
//      chars +=Character(stnames?.get(0) ?: "Nothing")

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)



        Maintv = findViewById(R.id.MainTVinChars)
        var key = "Element"
        var element =intent.getStringExtra(key)
        when(element){
            "Dendro" -> {Maintv?.text = getString(R.string.Nodendrochars)

            }
            "Hydro"->{

                Maintv?.text = stnames?.get(0)

            }

        }

}


}