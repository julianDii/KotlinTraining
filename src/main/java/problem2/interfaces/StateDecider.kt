package problem2.interfaces

import problem2.STATES

/**
 * Decides about the state.
 */
interface StateDecider {

    /**
     * Function which calculates the state of a number.
     * @param number which the state is decided
     * @return the state of the param
     */
    fun decide(number: Int) : STATES
}