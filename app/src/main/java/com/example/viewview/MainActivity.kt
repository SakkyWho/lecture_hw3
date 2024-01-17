package com.example.viewview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val itemslist: RecyclerView = findViewById(R.id.recyclerview)
        val items = ArrayList<CountryItem>()

        items.add(CountryItem("https://flagpedia.net/data/flags/h80/at.webp","Austria"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/pl.webp","Poland"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/it.webp","Italy"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/co.webp","Colombia"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/mg.webp","Madagascar"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/th.webp","Thailand"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/dk.webp","Denmark"))
        items.add(CountryItem("https://flagpedia.net/data/flags/h80/ch.webp","Switzerland"))


        itemslist.layoutManager = LinearLayoutManager(this)
        itemslist.adapter = ItemAdapter(items, this)
    }
}