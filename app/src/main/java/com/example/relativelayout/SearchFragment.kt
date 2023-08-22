package com.example.relativelayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SearchFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        val itemAdapter = ItemAdapter(generateDummyItemList()) // Replace with your list of items
        recyclerView.adapter = itemAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        return view

    }

    private fun generateDummyItemList(): List<Item> {
        // Create a list of dummy items here and return it
        // For example:
        return listOf(
            Item(R.drawable.lab1, "MediCross", "Description for Item 1"),
            Item(R.drawable.lab2, "Meditest", "Description for Item 2"),
            Item(R.drawable.lab3, "Lancent", "Description for Item 2"),
            Item(R.drawable.lab4, "SynLab", "Description for Item 2"),
            Item(R.drawable.lab5, "Spectra", "Description for Item 2"),
            Item(R.drawable.lab6, "Siemens", "Description for Item 2"),
            Item(R.drawable.lab7, "NeoGenomics", "Description for Item 2"),
            Item(R.drawable.lab8, "Myriad", "Description for Item 2"),
            Item(R.drawable.lab9, "Genomic", "Description for Item 2"),
            Item(R.drawable.lab10, "DaVita", "Description for Item 2"),

            // Add more items...
        )
    }

}