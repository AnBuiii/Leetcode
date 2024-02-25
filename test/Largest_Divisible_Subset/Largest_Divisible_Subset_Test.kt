package Largest_Divisible_Subset

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Largest_Divisible_Subset_Test {

    @Test
    fun largestDivisibleSubset() {
        val solution = Solution()
        assertEquals(listOf(9, 18, 90, 180, 360, 720), solution.largestDivisibleSubset(intArrayOf(5,9,18,54,108,540,90,180,360,720)))
    }
}