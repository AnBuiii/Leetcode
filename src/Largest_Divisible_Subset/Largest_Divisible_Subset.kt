package Largest_Divisible_Subset

class Solution {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val dp = Array<List<Int>>(nums.size) { emptyList() }

        nums.sort()
        dp[nums.size - 1] = listOf(nums.last())

        var maxIndex = nums.size - 1
        var maxSize = 1

        for (i in nums.size - 2 downTo 0) {
            val list = mutableListOf(nums[i])
            var maxJ = -1
            var maxJSize = 0
            for (j in i + 1 until nums.size) {
                if (nums[j] % nums[i] == 0) {
                    val size = dp[j].size
                    if (size > maxJSize) {
                        maxJ = j
                        maxJSize = size
                    }
                }
            }
            if (maxJ > 0) {
                list.addAll(dp[maxJ])
            }

            dp[i] = list
            if (list.size > maxSize) {
                maxIndex = i
                maxSize = list.size
            }
        }

        return dp[maxIndex]
    }
}