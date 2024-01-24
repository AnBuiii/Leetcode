package Merge_k_Sorted_Lists

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import structure.ListNode
import structure.ListNode.Companion.toArray

class Merge_k_Sorted_Lists_Test {

    @Test
    fun mergeKLists() {
        val solution = Solution()
        assertArrayEquals(intArrayOf(1,1,2,3,4,4,5,6), solution.mergeKLists(
            arrayOf(
                ListNode.fromIntArrayOf(1,4,5),
                ListNode.fromIntArrayOf(1,3,4),
                ListNode.fromIntArrayOf(2,6),
            )
        ).toArray())
    }
}