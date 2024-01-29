package Implement_Queue_using_Stacks

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Implement_Queue_using_Stacks_Test {
    @Test
    fun operatorTest(){
        val queue = MyQueue()

        assertEquals(Unit, queue.push(1))
        assertEquals(Unit, queue.push(2))
        assertEquals(1, queue.peek())
        assertEquals(1, queue.pop())
        assertEquals(false, queue.empty())
    }
}