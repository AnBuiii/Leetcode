package Search_Insert_Position

/**
 * Binary search
 */
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        return searchInsert(nums, target, 0, nums.lastIndex)
    }

    private tailrec fun searchInsert(nums: IntArray, target: Int, l: Int, r: Int): Int {
        if (l > r) return l
        val m = (l + r) / 2

        if (nums[m] == target) return m
        if (nums[m] > target) return searchInsert(nums, target, l, m - 1)
        return searchInsert(nums, target, m + 1, r)
    }
}