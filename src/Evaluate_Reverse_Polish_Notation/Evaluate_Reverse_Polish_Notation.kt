package Evaluate_Reverse_Polish_Notation

import java.util.*

/**
 * loop `token` and use [Stack] to save number,
 * if you meet an operator notation,
 * pop the stack 2 time,
 * do calculation,
 * then push result to the stack
 */
class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        tokens.forEach {
            when (it) {
                "+" -> {
                    stack.push(stack.pop() + stack.pop())
                }

                "-" -> {
                    val first = stack.pop()
                    val second = stack.pop()
                    stack.push(second - first)
                }

                "*" -> {
                    stack.push(stack.pop() * stack.pop())

                }

                "/" -> {
                    val first = stack.pop()
                    val second = stack.pop()
                    stack.push(second / first)
                }

                else -> {
                    stack.push(it.toInt())
                }
            }
        }
        return stack.pop()
    }
}