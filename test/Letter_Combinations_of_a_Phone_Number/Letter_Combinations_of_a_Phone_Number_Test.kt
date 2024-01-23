package Letter_Combinations_of_a_Phone_Number

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Letter_Combinations_of_a_Phone_Number_Test {

    @Test
    fun letterCombinations() {
        val solution = Solution()
        assertEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf").sorted(),
            solution.letterCombinations("23").sorted()
        )
    }
}