import java.awt.Point


val listener = object : OnTouchListener {
    override val isActive: Boolean = true

    override fun onDrag(startPoint: Point, endPoint: Point) {}

    fun someFun() {}

    inner class Unused {

    }

}

object FileHelper {
    fun saveFile() {}
}

fun main() {
    //listener.someFun()
    // нельзя,так как listener имеет тип OnTouchListener
}

