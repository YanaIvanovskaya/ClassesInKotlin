
abstract class Chair {
    abstract val countOfLegs: Int
    abstract val hasArmrests: Boolean
    abstract val hasBack: Boolean
    abstract val material: String
    abstract val isSoft: Boolean
}

interface Movable {
    fun move()
}

abstract class OfficeChair: Chair() {
    override val countOfLegs: Int = 1
    override val hasArmrests: Boolean = true
    override val hasBack: Boolean = true
    override val material: String = "plastic"
    override val isSoft: Boolean = false

    //override fun move() {}
}

open class PrettyOfficeChair(): OfficeChair() {
    final override val isSoft: Boolean = true

//    override fun move() {
//        //super.move()
//    }
}

