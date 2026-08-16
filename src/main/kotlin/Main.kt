fun main() {
    print("Enter number: ")
    val num = readln().toInt()
    val output = when {
        num % 2 == 0 -> "The Number is even!"
        else -> "The Number is odd!"
    }
    print(output)
}
