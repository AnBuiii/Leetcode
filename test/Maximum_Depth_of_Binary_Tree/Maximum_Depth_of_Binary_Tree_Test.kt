package Maximum_Depth_of_Binary_Tree

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import structure.TreeNode

class Maximum_Depth_of_Binary_Tree_Test {

    @Test
    fun maxDepth() {
        val solution = Solution()
        val node = TreeNode(3)
        node.left = TreeNode(9)
        node.right = TreeNode(20)
        node.right?.left = TreeNode(15)
        node.right?.right = TreeNode(7)
        assertEquals(solution.maxDepth(node), 3)
    }
}