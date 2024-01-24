package Merge_Two_Sorted_Lists

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import structure.ListNode
import structure.ListNode.Companion.toArray

class Merge_Two_Sorted_Lists_Test {

    @Test
    fun mergeTwoLists() {
        val solution = Solution()
        val list1 = ListNode.fromIntArrayOf(1, 2, 4)
        val list2 = ListNode.fromIntArrayOf(1, 3, 4)
        assertArrayEquals(intArrayOf(1, 1, 2, 3, 4, 4), solution.mergeTwoLists(list1, list2).toArray())
    }
}