package Longest_Palindromic_Substring

/**
 * Brute force with 1 big and 1 small reverse pointer
 */
class Solution {
    fun longestPalindrome(s: String): String {
        var longest = s[0].toString()
        for (i in s.indices) {
            if (s.length - i < longest.length) return longest
            var last = s.length - 1
            while (last > i && last - i + 1 > longest.length) {
                if (check(s, i, last)) {
                    longest = s.substring(i, last + 1)
                    break
                } else {
                    last--
                }

            }
        }

        return longest

    }

    private fun check(s: String, from: Int, to: Int): Boolean {
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
}

