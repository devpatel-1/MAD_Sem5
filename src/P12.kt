//Type Conversion: Perform type conversions such as Integer to Double, String to Integer, and String to Double.

fun main () {
    val i = 30000
    val j = i.toDouble()
    println("Interger Value = $i")
    println("Double value (From Integer)  = $j")

    val s1 = "30500"
    val k = s1.toInt()
    println("String value = $s1")
    println("Interger Value (From String) = $k")

    val s2 = "40000000"
    val k1 = s2.toDouble()
    println("String value = $s2")
    println("Double Value (From String) = $k1")
}