package com.example.zad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val jeden =  findViewById<Button>(R.id.jeden)
        val dwa =  findViewById<Button>(R.id.dwa)
        val trzy =  findViewById<Button>(R.id.trzy)
        val cztery =  findViewById<Button>(R.id.cztery)
        val piec =  findViewById<Button>(R.id.piec)
        val szesc =  findViewById<Button>(R.id.szesc)
        val siedem =  findViewById<Button>(R.id.siedem)
        val osiem =  findViewById<Button>(R.id.osiem)
        val dziewiec =  findViewById<Button>(R.id.dziewiec)
        val plus =  findViewById<Button>(R.id.plus)
        val minus =  findViewById<Button>(R.id.minus)
        val razy =  findViewById<Button>(R.id.razy)
        val podzielic =  findViewById<Button>(R.id.podzielic)
        val rownasie =  findViewById<Button>(R.id.rownasie)
        val wynik =  findViewById<TextView>(R.id.wynik)
        val dzialania =  findViewById<TextView>(R.id.dzialania)
    }
}
