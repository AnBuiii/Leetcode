package Path_Sum

import structure.TreeNode

/**
 * DFS with target -= current node `val`
 * if the current node is leaf, return true if it's value equal
 */
class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null) return targetSum == root.`val`
        if (targetSum <= 0) return false

        return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}