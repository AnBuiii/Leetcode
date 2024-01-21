package Add_Two_Numbers

import structure.ListNode

fun main() {
    val node1 = ListNode(2)
    node1.next = ListNode(4)
    node1.next?.next = ListNode(3)

    val node2 = ListNode(5)
    node2.next = ListNode(6)
    node2.next?.next = ListNode(4)

    val solution = Solution()
    println((getString(solution.addTwoNumbers(node1, node2))))

}

/**
 * Merge each list node to String, then covert to Big Integer, then add, then covert to ListNode
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val num1 = getString(l1)
        println(num1)
        val num2 = getString(l2)
        println(num2)

        val sum = (num1.toBigInteger() + num2.toBigInteger()).toString()
        var node: ListNode? = null
//        sum
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