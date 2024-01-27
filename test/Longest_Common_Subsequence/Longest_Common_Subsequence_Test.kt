package Longest_Common_Subsequence

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Longest_Common_Subsequence_Test {

    @Test
    fun longestCommonSubsequence() {
        val solution = Solution()
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"))
    }
}