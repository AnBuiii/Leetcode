package Minimum_Difficulty_Of_A_Job_Schedule

class Solution {
    fun minDifficulty(jobDifficulty: IntArray, d: Int): Int {
        if (jobDifficulty.size < d) return -1

        val dp = Array(jobDifficulty.size) { IntArray(jobDifficulty.size) }
        for (i in jobDifficulty.indices) {
            dp[i][i] = jobDifficulty[i]
            for (j in i + 1..jobDifficulty.lastIndex) {
                dp[i][j] = maxOf(dp[i][j - 1], jobDifficulty[j])
            }
        }

        val temp = Array(d + 1) { IntArray(jobDifficulty.size) { -1 } }

        fun getMinDifficulty(pos: Int, daysLeft: Int): Int {
            if (daysLeft == 1) {
                return dp[0][pos]
            }

            if (temp[daysLeft][pos] != -1) return temp[daysLeft][pos]

            var result = Int.MAX_VALUE
            for (i in pos downTo daysLeft - 1) {
                result = minOf(result, getMinDifficulty(i - 1, daysLeft - 1) + dp[i][pos])
            }

            temp[daysLeft][pos] = result
            return result
        }

        return getMinDifficulty(jobDifficulty.lastIndex, d)
    }
}