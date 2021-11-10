

open class Worker {
    open fun work() {}
    fun study() {} // нельзя переопределить в подклассах
}

class FactoryWorker : Worker() {

    override fun work() {
        repeat(3) { super.work() }
    }

    fun drinkBeer() {}

}


