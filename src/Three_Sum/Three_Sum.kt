package Three_Sum

/**
 * Sort first
 * Then use 3 pointer: 2 forward 1 backward to find
 */

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val results = mutableSetOf<List<Int>>()
        if (nums.size <= 2) {
            return results.toList()
        }
        nums.sort()
        var i = 0

        while (i < nums.size - 2) {
            var j = i + 1
            var k = nums.size - 1
            while (j < k) {
                val sum = nums[i] + nums[j] + nums[k]
                if (sum == 0) {
                    results.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                    k--
                } else if (sum > 0) {
                    k--
                } else {
                    j++

                }
            }
            i++

        }
        return results.toList()
    }
}