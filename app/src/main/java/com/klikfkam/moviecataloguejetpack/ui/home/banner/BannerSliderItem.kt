package com.klikfkam.moviecataloguejetpack.ui.home.banner

import androidx.fragment.app.FragmentManager
import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.data.Bannerentity
import com.klikfkam.moviecataloguejetpack.data.MovieEntity
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_slider_banner.view.*

class BannerSliderItem(val supportFragmentManager: FragmentManager,
                       val listener : BannerListener,
                       val banners : List<Bannerentity>): com.xwray.groupie.kotlinandroidextensions.Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        val viewPagerAdapter =
            BannerAdapter(banners, supportFragmentManager)
        viewHolder.itemView.viewPagerSlider.adapter = viewPagerAdapter
        viewHolder.itemView.indicator.setViewPager(viewHolder.itemView.viewPagerSlider)
    }

    override fun getLayout(): Int = R.layout.item_slider_banner
}

interface BannerListener {
    fun onSeeAllMoviesClick()
    fun onBannerClick(movies: MovieEntity)
}
