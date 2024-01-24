package Pseudo_Palindromic_Paths_in_a_Binary_Tree

import structure.TreeNode

/**
 * 1 <= val <= 9
 * so use fixed array to save visited node in a path
 * if there are no more than 1 odd num => the path is pseudo-palindromic
 */
class Solution {
    val dp = IntArray(11) { 0 }
    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        if (root == null) return 0
        dp[root.`val`]++
        if (root.left == null && root.right == null && dp.count { it % 2 == 1 } < 2) {
            dp[root.`val`]--
            return 1
        }
        var result = 0

        result += pseudoPalindromicPaths(root.left)
        result += pseudoPalindromicPaths(root.right)
        dp[root.`val`]--
        return result
    }
}