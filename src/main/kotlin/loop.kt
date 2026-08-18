fun main() {
    println("Using \'For loop\' display numbers from 1 to 10.")
    for (i in 1..10) {
        print("$i ")
    }
    println("\nUsing \'For loop\' display numbers from 10 to 1.")
    for (i in 1..10) {
        print("${10-i+1} ")
    }
    println("\nUsing \'While loop\' display numbers from 1 to 10.")
    var i = 1
    while (i <= 10){
        print("$i ")
        ++i
    }
    println("\nUsing \'While loop\' display numbers from 10 to 1.")
    while(i >= 2) {
        print("${i-1} ")
        --i
    }
}