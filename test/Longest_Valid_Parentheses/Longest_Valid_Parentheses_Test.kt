package Longest_Valid_Parentheses

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Longest_Valid_Parentheses_Test {

    @Test
    fun longestValidParentheses() {
        val solution = Solution()
        assertEquals(4, solution.longestValidParentheses(")()())"))
    }
}