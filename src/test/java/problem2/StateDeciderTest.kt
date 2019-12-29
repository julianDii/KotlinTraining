package problem2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StateDeciderTest {


    private val stateDecider = SimpleStateDecider()

    @Test
    fun `should decide state correctly when number is dividable by 3 and not by 5`() {

        val state =  stateDecider.decide(3)

        assertEquals(STATES.FIZZ, state)
    }

    @Test
    fun `should decide state correctly when number is dividable by 5 and not by 3`() {

        val state =  stateDecider.decide(5)

        assertEquals(STATES.BUZZ, state)
    }

    @Test
    fun `should decide state correctly when number is dividable by 3 and 5`() {

        val state =  stateDecider.decide(15)

        assertEquals(STATES.FIZZBUZZ, state)
    }

    @Test
    fun `should decide state correctly when number is not dividable by 3 and 5`() {

        val state =  stateDecider.decide(16)

        assertEquals(STATES.NUMBER, state)
    }
}