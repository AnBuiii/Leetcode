package Divide_Two_Integers

/**
 * This is fine solution by check boundary value
 * Consider using bit manipulation
 */
class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        if(dividend == Int.MIN_VALUE && divisor == -1) return Int.MAX_VALUE

        return dividend / divisor
    }
}