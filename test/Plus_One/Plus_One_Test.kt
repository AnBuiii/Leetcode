package Plus_One

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Plus_One_Test {

    @Test
    fun plusOne() {
        val solution = Solution()
        assertArrayEquals(intArrayOf(4,3,2,2), solution.plusOne(intArrayOf(4,3,2,1)))
    }
}