fun main() {
    val dni = readln().toInt()
    when (dni) {
        1, 3, 5, 7, 8, 10, 12 -> println(31)
        2 -> println(29)
        4, 6, 9, 11 -> println(30)
    }
}