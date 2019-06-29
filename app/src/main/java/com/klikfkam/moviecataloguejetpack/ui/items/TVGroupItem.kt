package com.klikfkam.moviecataloguejetpack.ui.items

import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.utils.GridItemDecoration
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.movies_group_item.view.*
import kotlinx.android.synthetic.main.tv_group_item.view.*

class TVGroupItem(val groupAdapter: GroupAdapter<ViewHolder>): com.xwray.groupie.kotlinandroidextensions.Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
       // val dimenDp = viewHolder.itemView.context.resources.getDimensionPixelSize(R.dimen._2sdp)
       // val column = 3

        viewHolder.itemView.rv_tv.apply {
            adapter = groupAdapter
            layoutManager = LinearLayoutManager(viewHolder.itemView.context,LinearLayoutManager.HORIZONTAL,false)
        }
    }

    override fun getLayout(): Int = R.layout.tv_group_item
}