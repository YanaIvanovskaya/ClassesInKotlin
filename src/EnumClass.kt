
enum class Card(var value: Int) {

    QUEEN_OF_HEARTS(value = 12) {
        override fun getCardImage() =
            Bitmap.decodeFile("img/queen_of_hearts.png")
    },

    TEN_OF_CLUBS(value = 10) {
        override fun getCardImage() =
            Bitmap.decodeFile("img/ten_of_clubs.png")
    };
    //... other cards here;

    fun setTrump() {
        this.value += 10
    }

    abstract fun getCardImage(): Bitmap

    companion object {
        fun getShuffledDeck() =
            listOf(
                QUEEN_OF_HEARTS,
                TEN_OF_CLUBS
            ).shuffled()
    }

}


class Bitmap {
    companion object {
        fun decodeFile(path: String) = Bitmap()
    }
}