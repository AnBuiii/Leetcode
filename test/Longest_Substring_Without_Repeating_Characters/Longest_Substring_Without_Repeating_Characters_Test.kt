package Longest_Substring_Without_Repeating_Characters

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Longest_Substring_Without_Repeating_Characters_Test {

    private lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun lengthOfLongestSubstring() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"))
    }
}