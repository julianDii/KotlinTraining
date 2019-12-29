package problem2.interfaces

/**
 * Comprised states.
 */
interface StatesFromDecider<T> {

    /**
     * Method to receive a generic states response.
     */
    fun states(stateDecider: StateDecider): T
}