package Count_Complete_Tree_Nodes

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import structure.TreeNode

class Count_Complete_Tree_Nodes_Test {

    @Test
    fun countNodes() {
        val solution = Solution()
        val root = TreeNode.fromArray(arrayOf(1, 2, 3, 4, 5, 6))
        assertEquals(6, solution.countNodes(root))
    }
}