package com.example.petadoptionapp.data

class FakeRepository2 {
    fun getItems(): List<Item2> {
        return listOf(
            Item2(
                type = "Dog",
                website = "https://www.rawpixel.com/search/dog?page=1&path=_topics&sort=curated",
                img = "https://images.rawpixel.com/image_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA3L2FpZ2VuZXJhdGVkLTI0MDcyMy1yYXdwaXhlbF9vZmZpY2VfMTBfY3V0ZV9taW5pbWFsX2dvbGRlbl9yZXRyaWV2ZXJfZG9nX2Rvb2RsZV9ydW5fYzAzNDEwYWQtYjA0OS00NzY4LThlNDctYWE5NWQ2YjVjZGY3LWhxLXNjYWxlLTVfMDB4LmpwZw.jpg",
                age = "4"
            ),
            Item2(
                type = "Cat",
                website = "https://stock.adobe.com/in/search?k=cat",
                img = "https://as2.ftcdn.net/v2/jpg/02/66/72/41/1000_F_266724172_Iy8gdKgMa7XmrhYYxLCxyhx6J7070Pr8.jpg",
                age = "3"
            ),
            Item2(
                type = "Dog",
                website = "https://unsplash.com/s/photos/cute-dog",
                img = "https://media.istockphoto.com/id/598175960/photo/cute-puppy.webp?s=2048x2048&w=is&k=20&c=V3GGAKkJNYwUo-c3zV8yXAipDrXnlUyViKX22N3ZK9I=",
                age = "3"
            ),
            Item2(
                type = "Cat",
                website = "https://www.pexels.com/search/cat/",
                img = "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                age = "2"
            ),
        )

    }
}
