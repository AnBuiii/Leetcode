package Count_Complete_Tree_Nodes

import structure.TreeNode

/**
 * If left height (n) and right height of node is equal, the tree is perfect
 *  then return 2^n - 1 using bit manipulate
 * Otherwise, repeat count node from its child
 */
class Solution {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) return 0

        val leftHeight = leftHeight(root)
        if (leftHeight == rightHeight(root)) {
            return (1 shl (leftHeight)) - 1
        }

        return countNodes(root.left) + countNodes(root.right) + 1
    }

    private fun leftHeight(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + leftHeight(root.left)
    }

    private fun rightHeight(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + rightHeight(root.right)
    }
}