package problem1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AmountByCharTest {

    private val amountByChar = AmountByChar()

    @Test
    fun `should contain correct number for char occurrence in text`() {
        val text = "aaaa"

        val result = amountByChar.count(text)

        assertEquals(4, result.getValue("a"))
    }

    @Test
    fun `should contain correct number for char occurrence in text when char is upper and lower case`() {
        val text = "aaaaAAAA"

        val result = amountByChar.count(text)

        assertEquals(4, result.getValue("a"))
        assertEquals(4, result.getValue("A"))
    }

    @Test
    fun `should contain correct number when text comprises empty chars`() {
        val text = "a v xX BSDS "

        val result = amountByChar.count(text)

        assertEquals(4, result.getValue(" "))
    }

    @Test
    fun `should contain correct number when text comprises special characters`() {
        val text = "!$ &%%%%%%"

        val result = amountByChar.count(text)

        assertEquals(6, result.getValue("%"))
        assertEquals(1, result.getValue("!"))
        assertEquals(1, result.getValue("$"))
        assertEquals(1, result.getValue(" "))
    }


}