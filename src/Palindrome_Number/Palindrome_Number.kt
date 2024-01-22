package Palindrome_Number

/**
 * convert to string then check with 2 pointer
 */
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        if (x < 10) return true

        var xStr = x.toString()

        while (xStr.length > 1) {
            if (xStr.first() != xStr.last()) return false
            else {
                xStr = xStr.substring(1, xStr.length - 1)
            }
        }
        return true
    }
}