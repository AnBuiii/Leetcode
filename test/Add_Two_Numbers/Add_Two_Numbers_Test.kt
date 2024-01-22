package Add_Two_Numbers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import structure.ListNode

class Add_Two_Numbers_Test {
    private lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun addTwoNumbers() {
        val node1 = ListNode(2)
        node1.next = ListNode(4)
        node1.next?.next = ListNode(3)

        val node2 = ListNode(5)
        node2.next = ListNode(6)
        node2.next?.next = ListNode(4)

        assertEquals("807", getString(solution.addTwoNumbers(node1, node2)))
    }
}