package Longest_Palindromic_Substring

/**
 * Brute force with 1 big and 1 small reverse pointer
 */
class Solution {
    fun longestPalindrome(s: String): String {
        var longest = s[0].toString()
        s.forEachIndexed { from, c ->
            if (s.length - from < longest.length) return longest
            var last = s.length - 1
            while (last > from && last - from + 1> longest.length) {
                if (check(s, from, last)) {
                    longest = s.substring(from, last + 1)
                    break
                } else {
                    last--
                }

            }
        }
        return longest

    }
}

fun check(s: String, from: Int, to: Int): Boolean {
    var first = from
    var last = to
    while (first <= last) {
        if (s[first] != s[last]) {
            return false
        }
        first++
        last--
    }
    return true
}