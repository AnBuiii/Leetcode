package K_Inverse_Pairs_Array

/**
 * You start with n and k
 * Imagine in 1..n array, if you take i and then put in first position, the new array is i, 1, 2,..., i-1, i+1,..., n. So the number of pair increase by i - 1.
 * Whatever i you swap, the remain array still an ascending array.
 * It means you just need to consider the remain array as 1..n-1
 * Then, redo with n-1 and k - (i - 1)
 * Add all possible i, and you have the answer.
 */
class Solution {
    val module = 1_000_000_007
    fun kInversePairs(n: Int, k: Int): Int {
        val dp = Array(n + 1) { IntArray(k + 1) { -1 } }

        fun countPair(n: Int, k: Int): Int {
            if (k == 0) return 1
            if (n == 2) {
                if (k == 1) return 1
                if (k > 1) return 0
            }
            if (n <= 1 && k >= 1) return 0
            if (dp[n][k] != -1) return dp[n][k]
            var result = 0
            for (i in 1..minOf(k + 1, n)) {
                result += countPair(n - 1, k - i + 1)
                result %= module
            }
            dp[n][k] = result
            return dp[n][k]
        }
        return countPair(n, k)
    }
}