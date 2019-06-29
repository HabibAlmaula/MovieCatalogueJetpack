package com.klikfkam.moviecataloguejetpack.ui.home.banner

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.klikfkam.moviecataloguejetpack.data.Bannerentity

class BannerAdapter (val banners : List<Bannerentity>,
                     fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){

    override fun getItem(position: Int): Fragment {
        return BannerFragment.newInstance(banners[position].img.toString())


    }

    override fun getCount(): Int = banners.size

}