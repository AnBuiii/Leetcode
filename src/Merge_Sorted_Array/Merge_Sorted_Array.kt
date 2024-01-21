package Merge_Sorted_Array

fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    solution.merge(nums1, 3, intArrayOf(2, 5, 6), 3)
    print(nums1.toList())
}

/**
 * Merge in-place num1
 */

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var p1 = m - 1
        var p2 = n - 1

        for (i in nums1.size - 1 downTo 0) {
            if (p2 < 0 || (p1 >= 0 && nums1[p1] > nums2[p2])) {
                nums1[i] = nums1[p1--]
            } else {
                nums1[i] = nums2[p2--]
            }
        }
    }
}
