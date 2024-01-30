package Convert_Sorted_Array_to_Binary_Search_Tree

import org.junit.jupiter.api.Test
import structure.TreeNode

class Convert_Sorted_Array_to_Binary_Search_Tree_Test {

    @Test
    fun sortedArrayToBST() {
        val solution = Solution()
        val expect = TreeNode.fromArray(arrayOf(0, -3, 9, -10, null, 5))
//        assertEquals(expect, solution.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
    }
}