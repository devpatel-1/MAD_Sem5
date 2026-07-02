fun main () {
    println("Please enter number: ")
    val number = readln().toInt()

    println(
        if(number % 2 == 0)
            "Number is even"
        else
            "Number is odd"
    )
}