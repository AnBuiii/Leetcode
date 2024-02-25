package Partition_Array_for_Maximum_Sum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Partition_Array_for_Maximum_Sum_Test {

    @Test
    fun maxSumAfterPartitioning() {
        val solution = Solution()
        assertEquals(84, solution.maxSumAfterPartitioning(intArrayOf(1, 15, 7, 9, 2, 5, 10), 3))
    }
}