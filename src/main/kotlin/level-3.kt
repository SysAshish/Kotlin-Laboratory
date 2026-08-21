// The FizzBuzz
fun main() {
    print("Enter the last range of a number: ")

    val num = readln().toIntOrNull() ?: 100
    println("\n-- enter any two numbers --")

    print("choose first number between(1-10): ")
    val n1 = readln().toIntOrNull() ?: 3

    print("choose second number between(1-10): ")
    val n2 = readln().toIntOrNull() ?: 5

    println("\n-- Starting custom FizzBuzz --")
    for (i in 1..num) {
        when {
            i % n1 == 0 && i % n2 == 0 -> println("FizzBuzz")
            i % n1 == 0 -> println("Fizz")
            i % n2 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}
