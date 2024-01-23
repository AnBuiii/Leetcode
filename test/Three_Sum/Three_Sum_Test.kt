package Three_Sum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Three_Sum_Test {

    @Test
    fun threeSum() {
        val solution = Solution()
        assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    }
}