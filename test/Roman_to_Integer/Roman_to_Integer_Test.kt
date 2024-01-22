package Roman_to_Integer

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Roman_to_Integer_Test {
    @Test
    fun romanToInt() {
        val solution = Solution()
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
    }
}