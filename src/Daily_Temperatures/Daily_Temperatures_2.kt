package Daily_Temperatures

import java.util.*

/**
 * 1. Create a [Stack] to save index (day), the temperature map to index save in stack will monotonically decrease
 * 2. Loop temperatures reversely
 * 3. Pop the stack until the top value has temperature higher than current, or stack empty
 * 4. Save the result(i) = stack.peek() - i, or 0
 */
class Solution_2 {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = Stack<Int>()
        val result = IntArray(temperatures.size)

        for (i in temperatures.lastIndex downTo 0) {
            while (stack.isNotEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                stack.pop()
            }
            if (stack.isEmpty()) {
                result[i] = 0
            } else {
                result[i] = stack.peek() - i
            }
            stack.push(i)

        }
        return result
    }
}
