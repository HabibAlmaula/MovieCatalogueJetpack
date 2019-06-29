package com.klikfkam.moviecataloguejetpack.ui.items

import com.bumptech.glide.Glide
import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.data.MovieEntity
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_movies.view.*

class MoviesItem(val movies: MovieEntity,
                 val listener : MoviesListener
) : Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.title_movie.text = movies.movieTitle
        Glide.with(viewHolder.itemView.context).load(movies.moviePoster).into(viewHolder.itemView.img_poster)

        viewHolder.itemView.setOnClickListener {
            listener.onMoviesClick(movies)
        }
    }

    override fun getLayout(): Int = R.layout.item_movies


    interface MoviesListener {
        fun onMoviesClick(movies: MovieEntity)
    }

}