package problem1

class AmountByChar {

    fun count(string: String): Map<String, Int> {
        // TODO("implement function which returns chars comprised in the string and their occurrence.")
        return mapOf("a" to 1, "b" to 2)
    }


}

fun main() {
    val amountByChar = AmountByChar()
    amountByChar.count("aaaa bf")

}