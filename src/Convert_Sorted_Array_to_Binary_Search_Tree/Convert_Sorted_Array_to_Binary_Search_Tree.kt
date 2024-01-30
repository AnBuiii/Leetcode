package Convert_Sorted_Array_to_Binary_Search_Tree

import structure.TreeNode

/**
 * Divide nums to half, so that left and right has the same node, so their height equals
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return sortedArrayToBST(nums, 0, nums.lastIndex)
    }

    private fun sortedArrayToBST(nums: IntArray, l: Int, r: Int): TreeNode? {
        if (l > r) return null
        val m = (l + r) / 2
        val node = TreeNode(nums[m])
        node.left = sortedArrayToBST(nums, l, m - 1)
        node.right = sortedArrayToBST(nums, m + 1, r)
        return node
    }
}
