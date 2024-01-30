package Minimum_Absolute_Difference_in_BST

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import structure.TreeNode

class Minimum_Absolute_Difference_in_BST_Test {

    @Test
    fun getMinimumDifference() {
        val solution = Solution()
        val root = TreeNode.fromArray(
            arrayOf(4,2,6,1,3)
        )
        assertEquals(1, solution.getMinimumDifference(root))
    }
}