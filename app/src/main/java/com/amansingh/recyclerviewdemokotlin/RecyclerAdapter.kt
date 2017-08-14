package com.amansingh.recyclerviewdemokotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_view_rv.view.*

/**
 * Created by Aman Singh on 14-08-2017.
 */

class RecyclerAdapter(val songList: ArrayList<SongDetails>) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(songList[position])

    }

    override fun getItemCount(): Int {
        return songList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_rv, parent, false))
    }

    // My view holder Class in whit constructor parameter
    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(songDetail: SongDetails) {
            itemView.tv_song_id.text = songDetail.id.toString()
            itemView.tv_song_title.text = songDetail.title.toString()
        }

    }

}
