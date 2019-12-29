package problem2

import problem2.interfaces.StateDecider
import problem2.interfaces.StatesFromDecider

class SimpleStates : StatesFromDecider<List<STATES>> {

    private val states = emptyList<STATES>().toMutableList()

    override fun states(stateDecider: StateDecider): List<STATES> {

        for (x in 0..99) {
            val state = stateDecider.decide(x)
            states.add(state)

        }

        return states.toList()
    }
}
