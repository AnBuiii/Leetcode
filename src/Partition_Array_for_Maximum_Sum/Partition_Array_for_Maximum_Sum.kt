package Partition_Array_for_Maximum_Sum

class Solution {
    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val dp = IntArray(arr.size + 1)
        for (i in 1..arr.size) {
            var max = 0
            var j = 1
            while (j <= k && j <= i) {
                max = maxOf(max, arr[i - j])
                dp[i] = maxOf(dp[i], max * j + dp[i - j])
                j++
            }
        }
        return dp.last()
    }
}