fun main () {
    val arrayLst = arrayListOf(10, 71, 23, 12, 39, 19)

    println("Displaying Elements:")
    for (i in arrayLst.indices) {
        println("a[$i] = ${arrayLst[i]}")
    }
    println()

    val max = arrayLst.maxOrNull()
    println("Max is $max")
}