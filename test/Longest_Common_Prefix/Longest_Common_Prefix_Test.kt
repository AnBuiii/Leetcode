package Longest_Common_Prefix

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Longest_Common_Prefix_Test {

    @Test
    fun longestCommonPrefix() {
        val solution = Solution()
        assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower","flow","flight")))
    }
}