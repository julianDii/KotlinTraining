class AmountByCharSolution {

    fun count(string: String): Map<String, Int> =
            string.toCharArray()
                    .groupBy { it }
                    .map { it.key.toString() to it.value.size }
                    .toMap()

}

fun main() {
    val amountByChar = AmountByCharSolution()
    amountByChar.count("aaaa bf")

}