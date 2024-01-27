package Longest_Valid_Parentheses

import java.util.*

/**
 * 1. mark all index of valid parentheses
 * 2. find the longest consecutive valid
 */

class Solution {

    fun longestValidParentheses(s: String): Int {
        val result = BooleanArray(s.length) { false }

        val stack = Stack<Int>()

        s.forEachIndexed { idx, c ->
            if (c == '(') {
                stack.add(idx)
            } else if (stack.isNotEmpty()) {
                result[stack.pop()] = true
                result[idx] = true
            }
        }

        var max = 0
        var current = 0
        result.forEach {

            if (it) {
                current++
                if (max < current) max = current
            } else {
                current = 0
            }

        }

        return max
    }
}