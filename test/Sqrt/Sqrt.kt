package Sqrt

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Sqrt {

    @Test
    fun mySqrt() {
        val solution = Solution()
        assertEquals(3, solution.mySqrt(14))
    }
}