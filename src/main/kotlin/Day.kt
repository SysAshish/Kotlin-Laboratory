fun main() {
    print("Enter the number: ")
    val input = readln().toInt()
    val output = when (input){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "give a number between 1 to 7"
    }
    print(output)
}