package com.aumentedreality.recyclerviewdemo

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {
    val fruitList = listOf<Fruit>(
        Fruit("Apple", "Joe"),
        Fruit("Banana", "Park"),
        Fruit("Pear", "Nick"),
        Fruit("Watermelon", "Kate"),
        Fruit("Tomato", "Mike")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.setBackgroundColor(Color.YELLOW)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerAdapter(fruitList, ::listItemClicked)

    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(this@MainActivity, "Selected Supplier is ${fruit.supplier}", Toast.LENGTH_SHORT).show()
    }
}
