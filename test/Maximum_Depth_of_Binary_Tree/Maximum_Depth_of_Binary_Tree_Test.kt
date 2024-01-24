package Maximum_Depth_of_Binary_Tree

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import structure.TreeNode

class Maximum_Depth_of_Binary_Tree_Test {

    @Test
    fun maxDepth() {
        val solution = Solution()
        val root = TreeNode.fromArray(arrayOf(3,9,20,null,null,15,7))
        assertEquals(3, solution.maxDepth(root))
    }
}