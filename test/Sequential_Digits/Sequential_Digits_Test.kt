package Sequential_Digits

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Sequential_Digits_Test {

    @Test
    fun sequentialDigits() {
        val solution = Solution()
        assertEquals(listOf(1234, 2345, 3456, 4567, 5678, 6789, 12345), solution.sequentialDigits(1000, 13000))
        assertEquals(listOf(67,78,89,123), solution.sequentialDigits(58, 155))
    }
}