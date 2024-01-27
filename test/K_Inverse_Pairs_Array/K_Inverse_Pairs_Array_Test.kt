package K_Inverse_Pairs_Array

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class K_Inverse_Pairs_Array_Test {
    @Test
    fun kInversePairs() {
        val solution = Solution()
        assertEquals(663677020, solution.kInversePairs(1000, 1000))
    }
}