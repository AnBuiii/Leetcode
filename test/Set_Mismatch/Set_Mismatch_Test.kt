package Set_Mismatch

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Set_Mismatch_Test {

    @Test
    fun findErrorNums() {
        val solution = Solution()
        assertArrayEquals(solution.findErrorNums(intArrayOf(1, 5, 3, 2, 2, 7, 6, 4, 8, 9)), intArrayOf(2, 10))

    }
}