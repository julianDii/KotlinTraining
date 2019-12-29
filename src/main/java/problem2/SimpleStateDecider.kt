package problem2

import isDivisible
import problem2.interfaces.StateDecider

class SimpleStateDecider : StateDecider {

    override fun decide(number: Int): STATES {
        when (true) {
            number.isDivisible(3) && !number.isDivisible(5) -> return STATES.FIZZ
            number.isDivisible(5) && !number.isDivisible(3) -> return STATES.BUZZ
            number.isDivisible(3) || number.isDivisible(5) -> return STATES.FIZZBUZZ

        }
        return STATES.NUMBER
    }
}
