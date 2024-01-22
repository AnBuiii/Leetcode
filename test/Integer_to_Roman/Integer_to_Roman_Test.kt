package Integer_to_Roman

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Integer_to_Roman_Test {
    @Test
    fun intToRoman() {
        val solution = Solution()
        assertEquals("MCMXCIV", solution.intToRoman(1994))
    }

}