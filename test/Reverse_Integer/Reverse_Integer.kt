package Reverse_Integer

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Reverse_Integer {

    @Test
    fun reverse() {
        val solution = Solution()
        assertEquals(321, solution.reverse(123))
    }
}