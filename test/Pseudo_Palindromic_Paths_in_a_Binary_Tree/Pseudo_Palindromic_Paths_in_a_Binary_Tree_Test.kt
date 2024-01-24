package Pseudo_Palindromic_Paths_in_a_Binary_Tree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import structure.TreeNode

class Pseudo_Palindromic_Paths_in_a_Binary_Tree_Test {

    @Test
    fun pseudoPalindromicPaths() {
        val solution = Solution()
        val root = TreeNode.fromArray(arrayOf(2, 3, 1, 3, 1, null, 1))
        assertEquals(2, solution.pseudoPalindromicPaths(root))
    }
}