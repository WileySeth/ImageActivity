package com.example.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var  photoAdapter: CustomAdapter
    private var dataList = mutableListOf<ImageObject>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //initiate the grid  view
        //in this case I make row grid in a row
        //if you want to change that change the number

        RecyclerView.LayoutManager = GridLayoutManager(applicationContext,3)
        photoAdapter = CustomAdapter(applicationContext)
        RecyclerView.Adapter = photoAdapter

        //add data
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese1))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese2))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese3))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese4))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese5))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese6))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese7))
        dataList.add(ImageObject("Title","Desc",R.drawable.CHeese8))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese9))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese10))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese11))
        dataList.add(ImageObject("Title","Desc",R.drawable.Cheese12))

        photoAdapter.setDataList(dataList)


    }
}
