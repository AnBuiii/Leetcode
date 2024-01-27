package Substring_with_Concatenation_of_All_Words

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Substring_with_Concatenation_of_All_Words_Test {

    @Test
    fun findSubstring() {
        val solution = Solution()
        assertEquals(listOf(0,9), solution.findSubstring("barfoothefoobarman", arrayOf("foo","bar")))
    }
}