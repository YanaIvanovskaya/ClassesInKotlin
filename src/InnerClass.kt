class Car {
    val brand: String = "Ford"

    fun onStart() {
        this.Engine().start()
    }

    fun onStop() {
        this.Engine().stop()
    }

    abstract inner class Component {
        abstract fun start()
        abstract fun stop()
    }

    private inner class Engine : Component() {

        override fun start() {
//            this@Car.onStart()
//            this@Engine.stop()
            print("Engine ${brand} is started")
        }

        override fun stop() {
            print("Engine ${brand} is stopped")
        }
    }
}
