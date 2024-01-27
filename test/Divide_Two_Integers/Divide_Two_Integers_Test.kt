package Divide_Two_Integers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Divide_Two_Integers_Test {

    @Test
    fun divide() {
        val solution = Solution()
        assertEquals(-2, solution.divide(7, -3))

    }
}