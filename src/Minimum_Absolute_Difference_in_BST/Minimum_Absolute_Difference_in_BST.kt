package Minimum_Absolute_Difference_in_BST

import structure.TreeNode
import kotlin.math.abs

class Solution {
    fun getMinimumDifference(root: TreeNode?): Int {
        var min = Int.MAX_VALUE

        fun minDiff(root: TreeNode?) {
            if (root == null) return
            root.left?.let {
                min = minOf(min, abs(root.`val` - it.`val`))
            }
            root.right?.let {
                min = minOf(min, abs(root.`val` - it.`val`))
            }
            minDiff(root.left)
            minDiff(root.right)
        }
        minDiff(root)
        return min
    }
}