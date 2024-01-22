package Add_Two_Numbers

import structure.ListNode

/**
 * Merge each list node to String, then covert to Big Integer, then add, then covert to ListNode
 */

class Solution {
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
}

fun getString(l1: ListNode?): String {
    return if (l1 != null) {
        "${getString(l1.next)}${l1.`val`}"
    } else {
        ""
    }
}

fun push(l1: ListNode, a: Int) {
    if (l1.next == null) {
        l1.next = ListNode(a)
    } else {
        push(l1.next!!, a)
    }
}