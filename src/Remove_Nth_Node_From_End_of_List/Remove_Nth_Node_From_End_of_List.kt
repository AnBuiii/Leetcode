package Remove_Nth_Node_From_End_of_List

import structure.ListNode

/**
 * get index from start
 * then sub list from 0 -> index
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val count = count(head, 0)
        val fromStart = count - n
        return removeNthFromStart(head, fromStart)
    }
    private fun removeNFromStart(head: ListNode?, n: Int) {
        if (n != 1) {
            removeNFromStart(head?.next, n - 1)
        } else {
            head?.next = head?.next?.next
        }
    }

    private fun removeNthFromStart(head: ListNode?, n: Int): ListNode? {
        if (n == 0) return head?.next
        removeNFromStart(head, n)
        return head
    }

    private fun count(node: ListNode?, count: Int): Int {
        return if (node == null) count
        else count(node.next, count + 1)
    }
}
