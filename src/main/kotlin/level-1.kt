fun main() {
    /* zero or Positive or Negative */
    print("Enter number: ")
    val num = readln().toIntOrNull()
    when {
        num == null -> println("Then nothing")
        num == 0 -> println("Given number is Zero")
        num > 0 -> println("Given number is positive")
        else -> println("Given number is Negative")
    }
}