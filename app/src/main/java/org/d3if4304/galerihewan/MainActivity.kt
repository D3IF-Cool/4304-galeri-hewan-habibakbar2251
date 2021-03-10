package org.d3if4304.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4304.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }

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