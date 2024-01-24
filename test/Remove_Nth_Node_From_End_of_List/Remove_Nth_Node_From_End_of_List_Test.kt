package Remove_Nth_Node_From_End_of_List

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import structure.ListNode
import structure.ListNode.Companion.toArray

class Remove_Nth_Node_From_End_of_List_Test {

    @Test
    fun removeNthFromEnd() {
        val solution = Solution()
        val head = ListNode.fromIntArrayOf(1, 2, 3, 4, 5)
        assertArrayEquals(intArrayOf(1, 2, 3, 5), solution.removeNthFromEnd(head, 2).toArray())
    }

}