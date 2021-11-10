
data class Book(
    val author: String
) {
    var title: String = "Unknown"
}

//fun main() {
//    val book1 = Book("Булгаков")
//    book1.title = "Мастер и Маргарита"
//
//    val book2 = Book("Булгаков")
//    book2.title = "Морфий"
//
//    val isEquals = book1 == book2 // true
//    val bookStr = book1.toString() // Book(author=Булгаков)
//    val (author) = book1 // author = book1.author
//    val copiedBook = book1.copy(author="Ги де Мопассан")
//}

