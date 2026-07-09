//class Car (m: String) {
//    var model: String = ""
//    var price: Double = 0.0
//    init {
//        model = m
//    }
//    constructor(p: Double, m: String) : this(m) {
//        price = p
//    }
//}
//
//fun main () {
//    val c1 = Car(12000.0, "BMW")
//    println(c1.model)
//    println(c1.price)
//}

open class Car (var model: String) {

    var price: Double = 0.0

    constructor(p: Double, m: String) : this(m) {
        price = p
    }
}

class Suzuki (m: String) : Car(m) {

}

fun main () {
    val c1 = Car(12000.0, "BMW")
    println(c1.model)
    println(c1.price)

    val c2 = Suzuki("Alto 800")
    println(c2.model)
}
