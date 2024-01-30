package Path_Sum

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import structure.TreeNode

class Path_Sum_Test {

    @Test
    fun hasPathSum() {
        val solution = Solution()
        val root = TreeNode.fromArray(arrayOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1))
        assertEquals(true, solution.hasPathSum(root, 22))
    }
}