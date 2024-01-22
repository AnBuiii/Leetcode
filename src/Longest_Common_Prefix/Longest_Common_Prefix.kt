package Longest_Common_Prefix

/**
 * brute force check
 */
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var pre = ""
        var i = 0

        while (i < strs[0].length) {
            strs.forEach {
                if (it.length == i) return pre
            }
            val tempPre = strs[0][i]
            strs.forEach {
                if (it[i] != tempPre) return pre
            }
            pre += tempPre
            i++
        }
        return pre
    }
}