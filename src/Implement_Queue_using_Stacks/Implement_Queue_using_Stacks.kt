package Implement_Queue_using_Stacks

import java.util.*

/**
 * 2 stack approach
 * use the second stack to reverse the first stack
 */
class MyQueue {
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()

    fun push(x: Int) {
        stack1.push(x)
    }

    fun pop(): Int {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.pop()
    }

    fun peek(): Int {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.peek()
    }

    fun empty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }
}
