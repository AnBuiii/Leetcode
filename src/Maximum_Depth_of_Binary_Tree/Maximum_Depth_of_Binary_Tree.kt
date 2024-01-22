package Maximum_Depth_of_Binary_Tree

import structure.TreeNode

/**
 * compare height of left to right of [TreeNode]
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        return maxOf(
            1 + maxDepth(root.left),
            1 + maxDepth(root.right)
        )
    }
}