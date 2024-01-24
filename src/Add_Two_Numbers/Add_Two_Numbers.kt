package Add_Two_Numbers

import structure.ListNode
import java.math.BigInteger
import java.util.*

/**
 * Merge each list node to [String], then covert to [BigInteger], then add, then covert to [ListNode]
 *
 * This is BAD solution, consider using [Stack]
 */

class Solution {
    companion object {
        fun getString(l1: ListNode?): String {
            return if (l1 != null) {
                "${getString(l1.next)}${l1.`val`}"
            } else {
                ""
            }
        }
    }
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val num1 = getString(l1)
        val num2 = getString(l2)

        val sum = (num1.toBigInteger() + num2.toBigInteger()).toString()
        var node: ListNode? = null
        sum.reversed().forEach {
            if (node == null) {
                node = ListNode(it.toString().toInt())
            } else {
                push(node!!, it.toString().toInt())
            }
        }
        return node
    }

    private fun push(l1: ListNode, a: Int) {
        if (l1.next == null) {
            l1.next = ListNode(a)
        } else {
            push(l1.next!!, a)
        }
    }
}