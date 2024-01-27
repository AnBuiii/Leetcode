package Remove_Duplicates_from_Sorted_Array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Remove_Duplicates_from_Sorted_Array_Test {

    @Test
    fun removeDuplicates() {
        val solution = Solution()
        assertEquals(5, solution.removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
    }
}