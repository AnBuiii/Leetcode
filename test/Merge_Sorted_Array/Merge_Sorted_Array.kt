package Merge_Sorted_Array

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Merge_Sorted_Array {

    @Test
    fun merge() {
        val solution = Solution()
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        solution.merge(nums1, 3, intArrayOf(2, 5, 6), 3)
        assertArrayEquals(nums1, intArrayOf(1, 2, 2, 3, 5, 6))
    }
}