package Evaluate_Reverse_Polish_Notation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Evaluate_Reverse_Polish_Notation_Test {

    @Test
    fun evalRPN() {
        val solution = Solution()
        val tokens = arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")
        assertEquals(22, solution.evalRPN(tokens))
    }
}