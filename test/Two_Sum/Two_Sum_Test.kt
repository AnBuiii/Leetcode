package Two_Sum

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Two_Sum_Test {

    @Test
    fun twoSum() {
        val solution = Solution()
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}