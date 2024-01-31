package Sqrt

/**
 * Simple binary search
 * With this kind of problem, you should beware all trap, boundary value,...
 * Ext: if you calculate m like this
 * - Bad: `m = (l + r) / 2 ` . You will fail tests that l + r > Int.MAXVALUE
 *
 *  - Good: m = l + (r - l) / 2
 *
 * Ext2:
 * - Bad: x == m * m
 * - Good: x / m == m
 */
class Solution {
    fun mySqrt(x: Int): Int {
        if (x == 0) return 0
        if (x == 1) return 1

        return mySqrt(x, 1, x)
    }

    private fun mySqrt(x: Int, l: Int, r: Int): Int {
        if (l >= r - 1) {
            return if (x / r < r) l
            else r
        }
        val m = l + (r - l) / 2
        if (x / m == m) return m
        return if (x / m < m) mySqrt(x, l, m - 1)
        else mySqrt(x, m, r)
    }
}