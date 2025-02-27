package Length_of_Longest_Fibonacci_Subsequence

class Solution {
    fun lenLongestFibSubseq(arr: IntArray): Int {
        val dp = IntArray(arr.size) { 0 } // countedLength

        var max = 0
        for (i in 2..arr.lastIndex) {
            val cur = arr[i] // current value
            var curMax = 0

            var l = 0 // low index
            var h = i-1 //  high index

            while (l < h) {
                val s = arr[l] + arr[h]
                when (s.compareTo(cur)) {
                    -1 -> {
                        l++
                    }

                    0 -> {
                        if (dp[l] == 0 && dp[h] == 0) {
                            curMax = maxOf(curMax, 3)
                        } else {
                            curMax = maxOf(dp[l], dp[h], curMax) + 1
                        }

                        l++
                        h--
                    }

                    1 -> {
                        h--
                    }
                }
            }
            dp[i] = curMax
            max = maxOf(max, curMax)

        }

        return max
    }
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val s = Solution()

    println(s.lenLongestFibSubseq(arr))


}