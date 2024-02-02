package Divide_Array_Into_Arrays_With_Max_Difference

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Divide_Array_Into_Arrays_With_Max_Difference_Test {
    @Test
    fun divideArray() {
        val solution = Solution()
        val nums = intArrayOf(1,3,4,8,7,9,3,5,1)
        val expect = arrayOf(intArrayOf(1, 1, 3), intArrayOf(3, 4, 5), intArrayOf(7, 8, 9))
        assertArrayEquals(expect, solution.divideArray(nums, 2))
    }
}