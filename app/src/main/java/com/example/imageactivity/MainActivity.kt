package com.example.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager


class MainActivity : AppCompatActivity() {

    private lateinit var  imageAdapter: ImageAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        recyclerView.layoutManager = GridLayoutManager(applicationContext,3)
        imageAdapter = ImageAdapter(applicationContext)
        recyclerView.adapter = imageAdapter

        dataList.add(DataModel("1st Cheese","Some Cheese",R.drawable.cheese1))
        dataList.add(DataModel("2nd Cheese","Different Cheese",R.drawable.cheese2))
        dataList.add(DataModel("3rd Cheese","Other Cheese",R.drawable.cheese3))
        dataList.add(DataModel("4th Cheese","New Cheese",R.drawable.cheese4))
        dataList.add(DataModel("5th Cheese","Fun Cheese",R.drawable.cheese5))
        dataList.add(DataModel("6th Cheese","Weird Cheese",R.drawable.cheese6))
        dataList.add(DataModel("7th Cheese","Another Cheese",R.drawable.cheese7))
        dataList.add(DataModel("8th Cheese","WOW, cheese!",R.drawable.cheese8))
        dataList.add(DataModel("9th Cheese","old cheese",R.drawable.cheese9))
        dataList.add(DataModel("10th Cheese","woah, cheese",R.drawable.cheese10))
        dataList.add(DataModel("11th Cheese","this is cheese",R.drawable.cheese11))
        dataList.add(DataModel("12th Cheese","more cheese",R.drawable.cheese12))


        imageAdapter.setDataList(dataList)




    }
}
