package Longest_Palindromic_Substring

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Longest_Palindromic_Substring_Test {

    @Test
    fun longestPalindrome() {
        val solution = Solution()
        assertEquals("bab", solution.longestPalindrome("babad"))
    }
}