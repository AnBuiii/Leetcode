package Daily_Temperatures

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Daily_Temperatures_Test {

    @Test
    fun dailyTemperatures() {
        val solution = Solution()
        assertArrayEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
            solution.dailyTemperatures(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))
        )
    }

    @Test
    fun dailyTemperatures_2() {
        val solution = Solution()
        assertArrayEquals(
            intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
            solution.dailyTemperatures_2(intArrayOf(73, 74, 75, 71, 69, 72, 76, 73))
        )
    }
}