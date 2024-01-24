package Merge_Two_Sorted_Lists

import structure.ListNode

/**
 * recursive solution
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        if (list1.`val` > list2.`val`) {
            val result = ListNode(list2.`val`)
            merge(list1, list2.next, result)
            return result
        } else {
            val result = ListNode(list1.`val`)
            merge(list1.next, list2, result)
            return result
        }
    }

    private fun merge(list1: ListNode?, list2: ListNode?, mergeList: ListNode?) {
        if (list1 == null) {
            mergeList?.next = list2
            return
        }
        if (list2 == null) {
            mergeList?.next = list1
            return
        }

        if (list1.`val` > list2.`val`) {
            mergeList?.next = ListNode(list2.`val`)
            merge(list1, list2.next, mergeList?.next)
        } else {
            mergeList?.next = ListNode(list1.`val`)
            merge(list1.next, list2, mergeList?.next)
        }
    }
}

