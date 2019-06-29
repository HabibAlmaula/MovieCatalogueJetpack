package com.klikfkam.moviecataloguejetpack.ui.home

import androidx.lifecycle.ViewModel
import com.klikfkam.moviecataloguejetpack.data.Bannerentity
import com.klikfkam.moviecataloguejetpack.data.MovieEntity
import com.klikfkam.moviecataloguejetpack.data.TvEntity
import com.klikfkam.moviecataloguejetpack.utils.DataDummy


class HomeViewModel :ViewModel(){

    fun getMovies() : List<MovieEntity>{
        return DataDummy.generateDummyMovie()
    }

    fun getTv() : List<TvEntity>{
        return DataDummy.generateDummyTv()
    }

    fun getBanner(): List<Bannerentity>{
        return DataDummy.generateDummyBanner()
    }


}