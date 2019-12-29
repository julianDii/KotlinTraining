package problem2

enum class STATES(val stateName: String? = null, val factor: Int? = null) {
    FIZZ(stateName = "Fizz", factor = 3),
    BUZZ(stateName = "Buzz", factor = 5),
    FIZZBUZZ(stateName = "FizzBuzz"),
    NUMBER;
}
