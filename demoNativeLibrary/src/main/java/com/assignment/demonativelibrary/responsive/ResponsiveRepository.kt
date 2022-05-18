package com.assignment.demonativelibrary.responsive

class ResponsiveRepository {

    fun getTestData(): List<Row> {

        return listOf(
            Row(
                "Beavers are second only to humans in their ability to manipulate and change their environment. They can measure up to 1.3 metres long. A group of beavers is called a colony",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/220px-American_Beaver.jpg",
                "Beavers"
            ),
            Row(
                "It is a well known fact that polar bears are the main mode of transportation in Canada. They consume far less gas and have the added benefit of being difficult to steal.",
                "http://1.bp.blogspot.com/_VZVOmYVm68Q/SMkzZzkGXKI/AAAAAAAAADQ/U89miaCkcyo/s400/the_golden_compass_still.jpg",
                "Transportation"
            ),
            Row(
                null,
                "http://images.findicons.com/files/icons/662/world_flag/128/flag_of_canada.pn",
                "Flag"
            )

        )
    }

}

data class Row(
    val description: String?,
    val imageHref: String?,
    val title: String?
)