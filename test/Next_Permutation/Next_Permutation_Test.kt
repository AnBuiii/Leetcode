package Next_Permutation

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Next_Permutation_Test {

    @Test
    fun nextPermutation() {
        val solution = Solution()
        val nums = intArrayOf(1,2,3)
        solution.nextPermutation(nums)
        assertArrayEquals(intArrayOf(1,3,2), nums)
    }
}