package Palindrome_Number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Palindrome_Number_Test {

    @Test
    fun isPalindrome() {
        val solution = Solution()
        assertEquals(true, solution.isPalindrome(121))
    }
}