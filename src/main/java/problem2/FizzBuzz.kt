package problem2

import problem2.interfaces.StateDecider
import problem2.interfaces.StatesFromDecider

/**
 *  Implementation of the Fizz Buzz problem.
 *  In a range of 0 to 100 the program should:
 *  print Fizz if a number is divisible by 3
 *  print Buzz if a number is divisible by 5
 *  print problem2.FizzBuzz if a number is divisable by 3 and 5
 *  else print the number
  */
class FizzBuzz  {

    private val stateDecider : StateDecider = SimpleStateDecider()
    private val states: StatesFromDecider<List<STATES>> = SimpleStates()

    fun run() {
       val states = states.states(stateDecider)

        states.mapIndexed {index, state ->
            state.stateName?.let { println(state.stateName) } ?: println(index)
        }
    }

}
