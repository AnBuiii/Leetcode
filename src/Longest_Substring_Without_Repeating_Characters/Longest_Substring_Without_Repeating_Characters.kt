package Longest_Substring_Without_Repeating_Characters

/**
 * Create a temp, if a [Char] is repeated, clear temp
 */
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var temp = ""
        var maxSize = 0
        s.forEach {
            if (it !in temp) {
                temp += it
            } else {
                temp = temp.substring(temp.indexOf(it) + 1, temp.length)
                temp += it
            }
            if (temp.length > maxSize) {
                maxSize = temp.length
            }
        }
        return maxSize
    }
}