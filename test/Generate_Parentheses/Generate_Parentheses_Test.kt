package Generate_Parentheses

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Generate_Parentheses_Test {

    @Test
    fun generateParenthesis() {
        val solution = Solution()
        assertEquals(listOf("((()))", "(()())", "(())()", "()(())", "()()()"), solution.generateParenthesis(3))
    }
}