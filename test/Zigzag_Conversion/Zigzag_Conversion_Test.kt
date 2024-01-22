package Zigzag_Conversion

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Zigzag_Conversion_Test {

    @Test
    fun convert() {
        val solution = Solution()
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3))
    }
}