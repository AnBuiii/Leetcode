package Longest_Common_Subsequence

/**
 * Think way: map 2 string to 2d array
 * each ( i, j ) | text1(i) == text2(j) -> mark array(i)(j)
 * each marked cell -> (x,y) | (i<x) && (j<y) | +1
 * find max of array
 *
 * Implement this thought in dp
 */
class Solution {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val dp = Array(text1.length + 1) { IntArray(text2.length + 1) { 0 } }

        for (i in text1.indices) {
            for (j in text2.indices) {
                if (text1[i] == text2[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1
                } else {
                    dp[i + 1][j + 1] = maxOf(dp[i + 1][j], dp[i][j + 1])
                }
            }
        }
        return dp[text1.length][text2.length]
    }
}

/**
 *
 * Optimal DP solution
 *
 * class Solution {
 *     fun longestCommonSubsequence(text1: String, text2: String): Int {
 *         val dp = IntArray(text2.length) { 0 }
 *         for (i in 0..text1.lastIndex) {
 *             var temp = 0
 *             for (j in 0..text2.lastIndex) {
 *                 val hm = dp[j]
 *                 if (text1[i] == text2[j]) {
 *                     dp[j] = temp + 1
 *                 } else {
 *                     dp[j] = maxOf(if (j == 0) 0 else dp[j - 1], dp[j])
 *                 }
 *                 temp = hm
 *             }
 *         }
 *         return dp[dp.lastIndex]
 *     }
 * }
 */
