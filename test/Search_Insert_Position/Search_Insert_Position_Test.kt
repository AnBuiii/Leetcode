package Search_Insert_Position

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Search_Insert_Position_Test {

    @Test
    fun searchInsert() {
        val solution = Solution()
        assertEquals(1, solution.searchInsert(intArrayOf(1,3,5,6), 2))
    }
}