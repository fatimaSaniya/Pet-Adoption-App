package com.example.petadoptionapp.data

class FakeRepository {
    fun getItems(): List<Item> {
        return listOf(
            Item(
                title = "Animal League Adoption Centre",
                website = "https://www.animalleague.org/ny-services/adoption-center/",
                img = "https://www.animalleague.org/wp-content/uploads/2017/06/pet-adoption-center-ny-services-image-family-05042017.jpg",

                ),
            Item(
                title = "Philly Paws",
                website = "https://phillypaws.org/locations/paws-northeast-adoption-center-low-cost-clinic/",
                img = "https://phillypaws.org/wp-content/uploads/NElobby.jpg",

                ),
            Item(
                title = "My Impact Adoption Centre",
                website = "https://app.betterimpact.com/PublicOrganization/6b063d09-b5c8-4502-9ce2-7de3df9ec11e/1",
                img = "https://content.betterimpact.com/files/agency/29805/gettyimages-565299227-2048x2048.jpg"
            ),
            Item(
                title = "Pet Smart Charaties",
                website = "https://petsmartcharities.org/adopt-a-pet/adoption-centers",
                img = "https://petsmartcharities.org/sites/default/files/2021-12/pci-web_adoption-centers_hero_adoption-centers_rebrand-launch-2022.jpg"
            )
        )

    }
}
