package Out_of_Boundary_Paths

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Out_of_Boundary_Paths_Test {

    @Test
    fun findPaths() {
        val solution = Solution()
        assertEquals(6, solution.findPaths(2, 2, 2, 0, 0))
    }

    @Test
    fun finPaths2() {
        val solution = Solution()
        assertEquals(1104, solution.findPaths(2,3,8,1,0))
    }
}