package Find_the_Index_of_the_First_Occurence_in_a_String

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Find_the_Index_of_the_First_Occurence_in_a_String_Test {

    @Test
    fun strStr() {
        val solution = Solution()
        assertEquals(0, solution.strStr("sadbutsad", "sad"))
    }
}