package Can_Place_Flowers

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Can_Place_Flowers_Test {

    @Test
    fun canPlaceFlowers() {
        val solution = Solution()
        assertEquals(false, solution.canPlaceFlowers(intArrayOf(0,0,0,0,0,1,0,0), 0))
    }
}