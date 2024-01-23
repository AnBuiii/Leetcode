package Three_Sum_Closest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Three_Sum_Closest_Test {

    @Test
    fun threeSumClosest() {
        val solution = Solution()
        assertEquals(2, solution.threeSumClosest(intArrayOf(-1,2,1,-4),1))
    }
}