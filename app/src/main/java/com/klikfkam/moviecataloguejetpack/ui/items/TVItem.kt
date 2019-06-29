package com.klikfkam.moviecataloguejetpack.ui.items

import com.bumptech.glide.Glide
import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.data.MovieEntity
import com.klikfkam.moviecataloguejetpack.data.TvEntity
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_movies.view.*
import kotlinx.android.synthetic.main.tv_item.view.*

class TVItem(val tves: TvEntity,
                 val listener : TVListener
) : Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        Glide.with(viewHolder.itemView.context).load(tves.tvPoster).into(viewHolder.itemView.img_tv)

        viewHolder.itemView.setOnClickListener {
            listener.onTVClick(tves)
        }
    }

    override fun getLayout(): Int = R.layout.tv_item


    interface TVListener {
        fun onTVClick(tves:TvEntity)
    }

}