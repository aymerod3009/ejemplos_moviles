package com.example.clase3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var array= arrayOf("1","2","3","5","6","7","8","9","10","11","12","13","14","15")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val adapter=ArrayAdapter(this,R.layout.item,array)
        val listView=findViewById<ListView>(R.id.listview)
        listView.adapter=adapter
        listView.onItemClickListener= object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val t = listView.getItemAtPosition(position) as String
                Toast.makeText(applicationContext,t,Toast.LENGTH_SHORT).show()
            }

        }*/
            button.setOnClickListener {
                val intent= Intent(this,SecondActivity::class.java)
                intent.putExtra("dato",edittext.text.toString())
                startActivity(intent)
            }
        }
    }

