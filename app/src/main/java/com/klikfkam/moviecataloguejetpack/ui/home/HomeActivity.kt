package com.klikfkam.moviecataloguejetpack.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.data.MovieEntity
import com.klikfkam.moviecataloguejetpack.data.TvEntity
import com.klikfkam.moviecataloguejetpack.ui.home.banner.BannerListener
import com.klikfkam.moviecataloguejetpack.ui.home.banner.BannerSliderItem
import com.klikfkam.moviecataloguejetpack.ui.items.MoviesGroupItem
import com.klikfkam.moviecataloguejetpack.ui.items.MoviesItem
import com.klikfkam.moviecataloguejetpack.ui.items.TVGroupItem
import com.klikfkam.moviecataloguejetpack.ui.items.TVItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), BannerListener, MoviesItem.MoviesListener, TVItem.TVListener {
    override fun onTVClick(tves: TvEntity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSeeAllMoviesClick() {

    }

    override fun onBannerClick(movies: MovieEntity) {
    }

    override fun onMoviesClick(movies: MovieEntity) {
    }

    // declare adapter from groupadapter
    private var groupAdapter = GroupAdapter<ViewHolder>()
    private lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)


        rv_home.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = groupAdapter
        }

        val bannerSliderItem = BannerSliderItem(
            supportFragmentManager,
            this,
            homeViewModel.getBanner()
        )
        groupAdapter.add(bannerSliderItem)

        Section().apply {
            add(makeTVList(homeViewModel.getTv()))
            groupAdapter.add(this)
        }

        Section().apply {
            add(makeMovieList(homeViewModel.getMovies()))
            groupAdapter.add(this)
        }
    }

    private fun makeTVList(tves: List<TvEntity>): TVGroupItem  {
        val tvesGroupAdapter = GroupAdapter<ViewHolder>()
        tves.map {
            tvesGroupAdapter.add(TVItem(it,this))
        }
        return TVGroupItem(tvesGroupAdapter)
    }

    private fun makeMovieList(movies: List<MovieEntity>): MoviesGroupItem {
        val moviesGroupAdapter = GroupAdapter<ViewHolder>()
        movies.map {
            moviesGroupAdapter.add(MoviesItem(it, this))
        }
        return MoviesGroupItem(moviesGroupAdapter)
    }
}
