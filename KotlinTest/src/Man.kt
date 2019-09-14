class Man(var a: Int, private val test: String) {
    override fun toString(): String {
        return "Man(a=$a, test='$test')"
    }

    fun plus(a : Int) {
        this.a += 1
    }

    fun sayHi() {
        println("Hello world")
    }
}