fun main() {
    print("Enter String: ")
    val str = readlnOrNull()?.ifEmpty { "Default String" } ?: "Default String"

    val len = str.length
    val half = len / 2

    // Basic operations:
    println("String: $str")
    println("1. Length of a string: $len")
    println("2. Given String in UpperCase: ${str.uppercase()}")
    println("3. Given String in LowerCase: ${str.lowercase()}")
    println("4. First letter of given String: ${str[0]}")
    println("5. Given String in reverse order: ${str.reversed()}")
    println("6. First half of given String: ${str.substring(0, half)}")
    println("7. Second half of given String: ${str.substring(half)}")

    // Checking/validation:
    println("8. String is empty: ${str.isEmpty()}")
    println("9. String is not empty: ${str.isNotEmpty()}")
    println("10. String is blank: ${str.isBlank()}")
    println("11. String is not blank: ${str.isNotBlank()}")
    println("12. String after trim: ${str.trim()}")
    println("13. Contains 'a': ${str.contains("a", ignoreCase = true)}")
    println("14. Starts with 'A': ${str.startsWith("A", ignoreCase = true)}")
    println("15. Ends with 'g': ${str.endsWith("g", ignoreCase = true)}")

    // Searching/manipulation:
    println("16. String after replacing 'a' with 'x': ${str.replace("a", "x", ignoreCase = true)}")
    println("17. Position of 'a': ${str.indexOf("a", ignoreCase = true)}")
    println("18. Last position of 'a': ${str.lastIndexOf("a", ignoreCase = true)}")
    println("19. String without prefix 'A': ${str.removePrefix("A")}")
    println("20. String without suffix 'g': ${str.removeSuffix("g")}")
    println("21. String repeated 2 times: ${str.repeat(2)}")

    // Character processing:
    println("22. Only letters: ${str.filter { it.isLetter() }}")
    println("23. Only digits: ${str.filter { it.isDigit() }}")
    println("24. Number of digits: ${str.count { it.isDigit() }}")
    println("25. Contains a digit: ${str.any { it.isDigit() }}")
    println("26. All characters are letters: ${str.all { it.isLetter() }}")

    //Breaking a string into pieces:
    println("27. String split by space: ${str.split(" ")}")
}