package Merge_k_Sorted_Lists

import structure.ListNode

/**
 * Divide and Conquer solution
 * Think of merge sort
 */
class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        return mergeSortList(lists)
    }

    private fun mergeSortList(list: Array<ListNode?>): ListNode?{
        if (list.isEmpty()) return null
        if(list.size == 1) return list[0]

        val m = list.size / 2

        return merge2List(mergeSortList(list.copyOfRange(0,m)), mergeSortList(list.copyOfRange(m, list.size)))
    }

    private fun merge2List(l1: ListNode?, l2: ListNode?): ListNode? {
        val result = ListNode(0)
        var resultTemp: ListNode? = result
        var list1 = l1
        var list2 = l2
        while (list1 != null && list2 != null) {
            if (list1.`val` < list2.`val`) {
                resultTemp?.next = ListNode(list1.`val`)
                resultTemp = resultTemp?.next
                list1 = list1.next

            } else {
                resultTemp?.next = ListNode(list2.`val`)
                resultTemp = resultTemp?.next
                list2 = list2.next
            }
        }
        while (list1 != null) {
            resultTemp?.next = ListNode(list1.`val`)
            resultTemp = resultTemp?.next
            list1 = list1.next
        }

        while (list2 != null) {
            resultTemp?.next = ListNode(list2.`val`)
            resultTemp = resultTemp?.next
            list2 = list2.next
        }

        return result.next
    }
}
