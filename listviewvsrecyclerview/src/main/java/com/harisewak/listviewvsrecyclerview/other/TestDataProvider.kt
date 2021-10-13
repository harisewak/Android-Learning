package com.harisewak.listviewvsrecyclerview.other

object TestDataProvider {

    private var curIndex = 0

    private const val ITEM_COUNT = 500

    fun getListData(): ArrayList<ListItem> {
        var itemIndex = 0
        val list = arrayListOf<ListItem>()
        while (curIndex < ITEM_COUNT) {
            list.add(array[itemIndex])
            if (itemIndex == 2) {
                itemIndex = 0
            } else {
                itemIndex++
            }
            curIndex++
        }

        return list
    }


    private val array = arrayOf(
        ListItem(
            curIndex,
            "Suresh Dasari",
            "Team Leader",
            "Hyderabad"
        ),
        ListItem(
            curIndex,
            "Rohini Alavala",
            "Agricultural Officer",
            "Guntur",
        ),
        ListItem(
            curIndex,
            "Trishika Dasari",
            "Charted Accountant",
            "Guntur",
        )
    )

}