package ShortestCommonSupersequece


class Solution {
    fun shortestCommonSupersequence(str1: String, str2: String): String {
        val dp = Array(str1.length + 1) { IntArray(str2.length + 1) }
        for (i in 1..str1.length) {
            for (j in 1..str2.length) {
                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1
                } else {
                    dp[i][j] = maxOf(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }
        val sb = StringBuilder()

        var i = str1.length
        var j = str2.length
        while (i > 0 && j > 0) {
            if (str2[j - 1] == str1[i - 1]) {
                sb.append(str2[j - 1])
                i--
                j--
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                sb.append(str2[j - 1])
                j--
            } else {
                sb.append(str1[i - 1])
                i--
            }
        }

        // 4-3 3-3 2-3 1 - 2

        while (i > 0) {
            sb.append(str1[(i--) - 1])
        }

        while (j > 0) {
            sb.append(str2[(j--) - 1])
        }
        return sb.reverse().toString()
    }
}