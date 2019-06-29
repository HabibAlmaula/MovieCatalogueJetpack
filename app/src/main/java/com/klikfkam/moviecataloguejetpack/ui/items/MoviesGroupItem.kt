package com.klikfkam.moviecataloguejetpack.ui.items

import androidx.recyclerview.widget.GridLayoutManager
import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.utils.GridItemDecoration
import com.xwray.groupie.GroupAdapter
import kotlinx.android.synthetic.main.movies_group_item.view.*

class MoviesGroupItem(val groupAdapter: GroupAdapter<com.xwray.groupie.kotlinandroidextensions.ViewHolder>): com.xwray.groupie.kotlinandroidextensions.Item(){
    override fun bind(viewHolder: com.xwray.groupie.kotlinandroidextensions.ViewHolder, position: Int) {
        val dimenDp = viewHolder.itemView.context.resources.getDimensionPixelSize(R.dimen._2sdp)
        val column = 3

        viewHolder.itemView.rv_movies.apply {
            adapter = groupAdapter
            layoutManager = GridLayoutManager(viewHolder.itemView.context,column)
            addItemDecoration(GridItemDecoration(dimenDp,column))
        }
    }

    override fun getLayout(): Int = R.layout.movies_group_item
}