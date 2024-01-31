package Average_of_Levels_in_Binary_Tree

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import structure.TreeNode

class Average_of_Levels_in_Binary_Tree_Test {

    @Test
    fun averageOfLevels() {
        val solution = Solution()
        val root = TreeNode.fromArray(arrayOf(3, 9, 20, null, null, 15, 7))
        val expect = doubleArrayOf(3.00000, 14.50000, 11.00000)
        assertArrayEquals(expect, solution.averageOfLevels(root))
    }
}