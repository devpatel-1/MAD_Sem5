//Type Conversion: Perform type conversions such as Integer to Double, String to Integer, and String to Double.
fun main(){
    val i = 10000
    val j: Double = i.toDouble()
    println("Integer Value: $i")
    println("Double Value (From Integer):$j")
    val s: String = "123"
    val s1: Int = s.toInt()
    val s2: Double = s.toDouble()
    println("String Value: $s")
    println("Integer Value (From String):$s1")
    val t: String = "11.15"
    val s3: Double = t.toDouble()
    println("String Value:$t")
    println("Double Value (From String):$s3")
}