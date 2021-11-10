

@JvmInline
value class Password(val value: String){

    fun decrypt() {}

//    companion object {
//        private const val DEFAULT = "Z!~4$/23"
//    }
}

fun main() {
    val password = Password("Q@~G=65_3r")
    password.decrypt()
}
