package Reverse_Vowels_of_a_String

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Reverse_Vowels_of_a_String_Test {

    @Test
    fun reverseVowels() {
        val solution = Solution()
        assertEquals("leotcede", solution.reverseVowels("leetcode"))
    }
}