package Minimum_Absolute_Difference_in_BST

import structure.TreeNode
import kotlin.math.abs

/**
 * LNR search
 */
class Solution {
    fun getMinimumDifference(root: TreeNode?): Int {
        var min = Int.MAX_VALUE
        var last = -1
        fun dps(root: TreeNode?) {
            if (root == null) return
            dps(root.left)
            if (last != -1) {
                min = minOf(min, abs(root.`val` - last))
            }
            last = root.`val`

            dps(root.right)
        }
        dps(root)
        return min
    }
}