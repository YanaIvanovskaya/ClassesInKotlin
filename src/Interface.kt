import java.awt.Point

 interface OnTouchListener {

    val isActive: Boolean // public abstract

    private val isTouchable // private final
        get() = true

    fun onDrag(startPoint: Point, endPoint: Point)

    fun onMove(startPoint: Point, endPoint: Point) {
        innerFunc()
        print(
            "move ${startPoint.x} to ${endPoint.x} and " +
                    "move ${startPoint.y} to ${endPoint.y}"
        )
    }

    private fun innerFunc() {} // private final

    companion object {
        private const val ZERO = 0f
    }

    class UnusedClassHere {
        inner class InnerUnusedClass{}
    }
}

class ButtonClass : OnTouchListener {
    override val isActive = false

    override fun onDrag(startPoint: Point, endPoint: Point) {}

}