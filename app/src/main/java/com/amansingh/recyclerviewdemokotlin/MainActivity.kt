package com.amansingh.recyclerviewdemokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var songList = ArrayList<SongDetails>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Add songs in list
        for (i in 0..10) {
            songList.add(SongDetails(i, "Song No. $i"))
        }

        //synthetic loading of xml layout id of activity
        main_rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        main_rv.adapter = RecyclerAdapter(songList)

    }

}
