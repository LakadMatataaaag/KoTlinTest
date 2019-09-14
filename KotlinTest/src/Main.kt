fun main(args: Array<String>) {
    val test = Man(15, "Sanya")
    test.sayHi()
    test.a = 21
    test.plus(test.a)
    println(test.toString())
}