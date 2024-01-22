package Container_With_Most_Water

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Container_With_Most_Water_Test {

    @Test
    fun maxArea() {
        val solution = Solution()
        assertEquals(49, solution.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    }
}