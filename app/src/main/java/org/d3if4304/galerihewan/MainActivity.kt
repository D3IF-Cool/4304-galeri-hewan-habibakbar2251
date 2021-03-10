package org.d3if4304.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","Jumlah Data : " + getData().size)
    }

    private fun getData(): List<Hewan> {
        return listOf(
                Hewan("Angsa", "Cygnus olor","Unggas"),
                Hewan("Ayam", "Gallus gallus","Unggas"),
                Hewan("Bebek", "Cairina moschata","Unggas"),
                Hewan("Domba", "Ovis ammon","Mamalia"),
                Hewan("Kalkun", "Meleagris gallopavo","Unggas"),
                Hewan("Kambing", "Capricornis sumatrensis","Mamalia"),
                Hewan("Kelinci", "Oryctolagus cuniculus","Mamalia"),
                Hewan("Kerbau", "Bubalus bubalis","Mamalia"),
                Hewan("Kuda", "Equus caballus","Mamalia"),
                Hewan("Sapi", "Bos taurus","Mamalia"),

                )
    }
}