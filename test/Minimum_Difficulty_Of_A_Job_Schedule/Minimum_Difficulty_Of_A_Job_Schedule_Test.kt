package Minimum_Difficulty_Of_A_Job_Schedule

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Minimum_Difficulty_Of_A_Job_Schedule_Test {

    @Test
    fun minDifficulty() {
        val solution = Solution()
        assertEquals(7, solution.minDifficulty(intArrayOf(6,5,4,3,2,1),2))
    }
}