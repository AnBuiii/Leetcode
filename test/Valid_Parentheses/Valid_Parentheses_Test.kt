package Valid_Parentheses

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Valid_Parentheses_Test {

    @Test
    fun isValid() {
        val solution = Solution()
        assertEquals(true, solution.isValid("()[]{}"))
        assertEquals(false, solution.isValid("(]"))
    }
}