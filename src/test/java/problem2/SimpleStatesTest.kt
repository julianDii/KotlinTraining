package problem2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import problem2.interfaces.StateDecider
import problem2.interfaces.StatesFromDecider

internal class SimpleStatesTest {

    private val stateDecider: StateDecider = SimpleStateDecider()
    private val states: StatesFromDecider<List<STATES>> = SimpleStates()

    @Test
    fun `should return list with correct states based on decider `() {

        val states = states.states(stateDecider)

        assertEquals(100, states.size)
        assertEquals(STATES.FIZZBUZZ.stateName, states[0].stateName)
        assertEquals(STATES.NUMBER.stateName, states[1].stateName)
        assertEquals(STATES.FIZZ.stateName, states[3].stateName)
        assertEquals(STATES.BUZZ.stateName, states[5].stateName)

    }
}