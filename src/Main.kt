import kotlin.math.sqrt

fun main() {
    println("Check all prime number up to a number!")
    print("Enter a Integer: ")
    val number = readLine()?.toIntOrNull() ?: return println("Enter a valid number!")
    val primes = mutableListOf<Int>()

    for (i in 2..number) {
        if (primeChecker(i)){
            primes.add(i)
        }
    }

    println("From 0 to $number the numbers ${primes.joinToString(", ")} are primes!")
}

fun primeChecker(number: Int): Boolean {
    val squareRoot = sqrt(number.toDouble()).toInt()

    if (number < 2) return false

    for (i in 3..squareRoot step 2) {
        if (number % i == 0) {
            return false
        }
    }

    return true

}