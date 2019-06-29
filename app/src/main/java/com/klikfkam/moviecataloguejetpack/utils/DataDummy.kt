package com.klikfkam.moviecataloguejetpack.utils

import com.klikfkam.moviecataloguejetpack.data.Bannerentity
import com.klikfkam.moviecataloguejetpack.data.MovieEntity
import com.klikfkam.moviecataloguejetpack.data.TvEntity

object DataDummy {
    fun generateDummyMovie():ArrayList<MovieEntity>{
        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity(
            "m1",
            "Toy Story 4",
            "2019-06-19",
            "Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy.",
            "http://image.tmdb.org/t/p/w342/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg",
            "http://image.tmdb.org/t/p/w342//m67smI1IIMmYzCl9axvKNULVKLr.jpg"
        ))
        movies.add(MovieEntity(
            "m2",
            "Spider-Man: Far from Home",
            "2019-06-28",
            "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.",
            "http://image.tmdb.org/t/p/w342/2cAc4qH9Uh2NtSujJ90fIAMrw7T.jpg",
            "http://image.tmdb.org/t/p/w342/dihW2yTsvQlust7mSuAqJDtqW7k.jpg"
        ))
        movies.add(MovieEntity(
            "m3",
            "Dark Phoenix",
            "2019-06-05",
            "The X-Men face their most formidable and powerful foe when one of their own, Jean Grey, starts to spiral out of control. During a rescue mission in outer space, Jean is nearly killed when she's hit by a mysterious cosmic force. Once she returns home, this force not only makes her infinitely more powerful, but far more unstable. The X-Men must now band together to save her soul and battle aliens that want to use Grey's new abilities to rule the galaxy.",
            "http://image.tmdb.org/t/p/w342/kZv92eTc0Gg3mKxqjjDAM73z9cy.jpg",
            "http://image.tmdb.org/t/p/w342/phxiKFDvPeQj4AbkvJLmuZEieDU.jpg"
        ))
        movies.add(MovieEntity(
            "m4",
            "Annabelle Comes Home",
            "2019-06-26",
            "Determined to keep Annabelle from wreaking more havoc, demonologists Ed and Lorraine Warren bring the possessed doll to the locked artifacts room in their home, placing her “safely” behind sacred glass and enlisting a priest’s holy blessing. But an unholy night of horror awaits as Annabelle awakens the evil spirits in the room, who all set their sights on a new target—the Warrens' ten-year-old daughter, Judy, and her friends.",
            "http://image.tmdb.org/t/p/w342/jsbt03UnPPt14AYRMcGaoqtwNxQ.jpg",
            "http://image.tmdb.org/t/p/w342/4DHHymlttV0YskaxoWtuIDNDhPl.jpg"
        ))
        movies.add(MovieEntity(
            "m5",
            "John Wick: Chapter 3 – Parabellum",
            "2019-05-15",
            "Super-assassin John Wick returns with a \$14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.",
            "http://image.tmdb.org/t/p/w342/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg",
            "http://image.tmdb.org/t/p/w342/vVpEOvdxVBP2aV166j5Xlvb5Cdc.jpg"
        ))
        movies.add(MovieEntity(
            "m6",
            "Men in Black: International",
            "2019-06-12",
            "The Men in Black have always protected the Earth from the scum of the universe. In this new adventure, they tackle their biggest, most global threat to date: a mole in the Men in Black organization.",
            "http://image.tmdb.org/t/p/w342/dPrUPFcgLfNbmDL8V69vcrTyEfb.jpg",
            "http://image.tmdb.org/t/p/w342/2FYzxgLNuNVwncilzUeCGbOQzP7.jpg"
        ))
        movies.add(MovieEntity(
            "m7",
            "Aladdin",
            "2019-05-22",
            "A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.",
            "http://image.tmdb.org/t/p/w342/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg",
            "http://image.tmdb.org/t/p/w342/v4yVTbbl8dE1UP2dWu5CLyaXOku.jpg"
        ))
        movies.add(MovieEntity(
            "m8",
            "Avengers: Endgame",
            "2019-04-24",
            "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",
            "http://image.tmdb.org/t/p/w342/or06FN3Dka5tukK1e9sl16pB3iy.jpg",
            "http://image.tmdb.org/t/p/w342/7RyHsO4yDXtBv1zUU3mTpHeQ0d5.jpg"
        ))
        movies.add(MovieEntity(
            "m9",
            "Child's Play",
            "2019-06-19",
            "Karen, a single mother, gifts her son Andy a Buddi doll for his birthday, unaware of its more sinister nature. A contemporary re-imagining of the 1988 horror classic.",
            "http://image.tmdb.org/t/p/w342/rpS7ROczWulqfaXG2klYapULXKm.jpg",
            "http://image.tmdb.org/t/p/w342/vHse4QK31Vc3X7BKKU5GOQhYxv6.jpg"
        ))
        return movies
    }

    fun generateDummyTv():ArrayList<TvEntity>{
        val tves = ArrayList<TvEntity>()

        tves.add(TvEntity("tv1","SCTV","https://2.bp.blogspot.com/-CPUCoTyFdZA/VJf9fpgIAFI/AAAAAAAADe0/EwrZR6FWg3k/s1600/bitebrands%2B-%2Blogo%2Bstasiun%2Btelevisi%2B1.jpg"))
        tves.add(TvEntity("tv2","RTV","https://4.bp.blogspot.com/-GhtrlPjuds4/VJf9tW5O70I/AAAAAAAADic/1kNSVR-ipog/s1600/bitebrands%2B-%2Blogo%2Bstasiun%2Btelevisi%2B6.jpg"))
        tves.add(TvEntity("tv3","ANTV","https://3.bp.blogspot.com/-HaL-lp-HJnE/VJf9tpzq9iI/AAAAAAAADiU/HeC7Im9sXfw/s1600/bitebrands%2B-%2Blogo%2Bstasiun%2Btelevisi%2B7.jpg"))
        tves.add(TvEntity("tv4","KOMPAS TV","https://3.bp.blogspot.com/-DKJi1iupjQU/VJf9izJAUvI/AAAAAAAADfc/145WKbFrHpg/s1600/bitebrands%2B-%2Blogo%2Bstasiun%2Btelevisi%2B16.jpg"))
        tves.add(TvEntity("tv5","MNC TV","https://2.bp.blogspot.com/-8uCYgmVpea8/VJf9moh6p2I/AAAAAAAADgg/V1dRNTmQdek/s1600/bitebrands%2B-%2Blogo%2Bstasiun%2Btelevisi%2B25.jpg"))

        return tves
    }

    fun generateDummyBanner(): ArrayList<Bannerentity>{
        val banners = ArrayList<Bannerentity>()
            banners.add(Bannerentity(
                "Pokémon Detective Pikachu",
                "http://image.tmdb.org/t/p/w342/nDP33LmQwNsnPv29GQazz59HjJI.jpg"
            ))
            banners.add(Bannerentity(
                "Murder Mystery",
                "http://image.tmdb.org/t/p/w342/qeFO3u2IqbAeIT1Xgo6POqYbCaQ.jpg"
            ))
            banners.add(Bannerentity(
                "The Secret Life of Pets 2",
                "http://image.tmdb.org/t/p/w342/q3mKnSkzp1doIsCye6ap4KIUAbu.jpg"))
            banners.add(Bannerentity(
                "The Wolf's Call",
                "http://image.tmdb.org/t/p/w342/fDyCvNWaFkkrgf0QjhHqpCGVc8p.jpg"))



        return banners

    }

}