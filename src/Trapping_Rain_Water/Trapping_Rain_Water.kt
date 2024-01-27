package Trapping_Rain_Water

import java.util.*

/**
 * 1. make sure there are place(s) for water to trap (not all descending, ascending or ascend-descend)
 * By doing 1, find the start and the end place where water is trapped
 *
 * 2. find all the milestone inside that water is trapped
 */

class Solution {
    fun trap(height: IntArray): Int {
        var start = 0
        var end = 0
        var i = 1
        while (i <= height.lastIndex) {
            if (height[i] < height[i - 1]) {
                start = i - 1
                break
            }
            i++
        }
        if (i == height.size) return 0
        i = height.lastIndex - 1
        while (i > start) {
            if (height[i] < height[i + 1]) {
                end = i + 1
                break
            }
            i--
        }
        if (i == start) return 0
        val stack1 = Stack<Int>()
        stack1.push(start)
        i = start + 1
        while (i in start + 1..end) {
            if (height[i] < height[i - 1]) {
                stack1.push(i)
            } else {
                while (stack1.size >= 2 && height[stack1[stack1.lastIndex - 1]] >= height[stack1.peek()] && height[i] > height[stack1.peek()]) {
                    stack1.pop()
                }
                stack1.push(i)
            }
            i++
        }

        var sum = 0
        stack1.zipWithNext().forEach {
            val h = minOf(height[it.first], height[it.second])
            i = it.first + 1
            while (i > it.first && i < it.second) {
                val subH = h - height[i]
                if (subH > 0) sum += subH
                i++
            }
        }
        return sum
    }
}