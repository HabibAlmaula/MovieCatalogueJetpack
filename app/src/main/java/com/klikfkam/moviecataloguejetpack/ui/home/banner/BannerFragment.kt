package com.klikfkam.moviecataloguejetpack.ui.home.banner


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide

import com.klikfkam.moviecataloguejetpack.R
import com.klikfkam.moviecataloguejetpack.data.Bannerentity
import kotlinx.android.synthetic.main.fragment_banner.*

class BannerFragment : Fragment() {

    companion object{
        @JvmStatic
        fun newInstance(url: String): BannerFragment {
            val popularFragment = BannerFragment()
            val args = Bundle()
            args.putString("slider", url)
            popularFragment.arguments = args
            return popularFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_banner, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = arguments?.getString("slider")


        url.let {
            context?.let { it1 -> Glide.with(it1).load(url).into(img_banner) }
        }
    }


}
