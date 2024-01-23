package Three_Sum_Closest

/**
 * Sort first
 * Then use 3 pointer to find
 */
class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var closet = nums[0] + nums[1] + nums[2]
        nums.sort()
        (0..nums.size - 2).forEach {
            var second = it + 1
            var end = nums.size - 1
            while (second < end) {
                val sum = nums[it] + nums[second] + nums[end]
                if (sum > target) end-- else second++
                if (Math.abs(sum - target) < Math.abs(closet - target)) closet = sum
            }
        }

        return closet
    }
}